/** 
 * Copyright (c) 2015 committers of YAKINDU and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * Contributors:
 * committers of YAKINDU - initial API and implementation
 *
*/
package org.yakindu.sct.model.sexec.transformation

import com.google.inject.Inject
import org.eclipse.xtext.EcoreUtil2
import org.yakindu.base.expressions.expressions.BoolLiteral
import org.yakindu.base.expressions.expressions.PrimitiveValueExpression
import org.yakindu.sct.model.sexec.Check
import org.yakindu.sct.model.sexec.ExecutionFlow
import org.yakindu.sct.model.sexec.ExecutionNode
import org.yakindu.sct.model.sexec.ExecutionState
import org.yakindu.sct.model.sexec.Reaction
import org.yakindu.sct.model.sexec.Sequence
import org.yakindu.sct.model.sexec.StateVector
import org.yakindu.sct.model.sexec.Step
import org.yakindu.sct.model.sgraph.Choice
import org.yakindu.sct.model.sgraph.Entry
import org.yakindu.sct.model.sgraph.EntryKind
import org.yakindu.sct.model.sgraph.Exit
import org.yakindu.sct.model.sgraph.FinalState
import org.yakindu.sct.model.sgraph.Region
import org.yakindu.sct.model.sgraph.RegularState
import org.yakindu.sct.model.sgraph.State
import org.yakindu.sct.model.sgraph.Statechart
import org.yakindu.sct.model.sgraph.Synchronization
import org.yakindu.sct.model.sgraph.Vertex
import org.yakindu.sct.model.stext.stext.DefaultTrigger
import org.yakindu.sct.model.sgraph.Transition
import org.yakindu.sct.model.sexec.Method
import org.yakindu.base.types.typesystem.ITypeSystem
import org.yakindu.base.types.TypesFactory
import org.yakindu.sct.model.sexec.If
import org.yakindu.base.expressions.expressions.Expression
import org.yakindu.base.types.Operation
import org.yakindu.sct.model.sexec.Return
import org.yakindu.base.expressions.expressions.Literal
import org.yakindu.base.expressions.expressions.ExpressionsFactory
import org.yakindu.base.expressions.expressions.ElementReferenceExpression

class ReactionBuilder {
	@Inject extension SexecElementMapping mapping
	@Inject extension SexecExtensions sexec
	@Inject extension SgraphExtensions sgraph
	@Inject extension StatechartExtensions sct
	@Inject extension TraceExtensions trace
	@Inject extension BehaviorMapping behaviorMapping
	@Inject extension ITypeSystem typeSystem
	
	def defineStatechartReaction(ExecutionFlow flow, Statechart sc) {
		val sequence = sexec.factory.createSequence
		sequence.name = "react"
		sequence.comment = 'The reactions of statechart '+sc.name
		
		val leafStates = sc.allRegularStates.filter(s|s.leaf)
		val sSwitch = sexec.factory.createStateSwitch
		sequence.steps += sSwitch
		for (leaf : leafStates.map(s|s.create)) {
			val sCase = sexec.factory.createStateCase
			sCase.state = leaf
			sCase.step = leaf.reactSequence.newCall
			sSwitch.cases += sCase
		}
		
		flow.reactSequence = sequence
		return flow
	}


	def defineRegularStateReactions(ExecutionFlow flow, Statechart sc) {
		
		val states = sc.allRegularStates

		// create the react sequences for all leaf states and final states		
		states.filter(typeof(State)).filter(s | s.simple).forEach(s | defineCycle(s))
		states.filter(typeof(FinalState)).forEach(s | defineCycle(s))
		
		// additionally create react methods for all regular states
		// these methods are alternative to the react sequences. These methods avoid the redundancy that is 
		// inherent to react sequences. React sequences are still created for all code generators that are 
		// still not migrated to react methods.
		states.forEach[s | s.declareReactMethod ]
		states.forEach[s | s.defineReactMethod ]

		return flow
	}

	



	def definePseudoStateReactions(ExecutionFlow flow, Statechart sc) {
		
		sc.allChoices().forEach( choice | choice.defineReaction() )
		sc.allSynchronizations().forEach( sync | sync.defineReaction() )
		sc.allExits().forEach( exit | exit.defineReaction() )
	}
	

	def Sequence defineReaction(Choice choice) {
	
		val execChoice = choice.create
		
		// move the default transition to the end of the reaction list
		val defaultTransition = choice.outgoingTransitions.filter( t | t.trigger === null || t.trigger instanceof DefaultTrigger ).head
		if ( defaultTransition !== null ) {
			val defaultReaction = defaultTransition.create		
			execChoice.reactions.move(execChoice.reactions.size -1, defaultReaction)
		}
		// TODO: raise an error if no default exists 
		
		val stateReaction = execChoice.createReactionSequence(null)
		execChoice.reactSequence.steps.addAll(stateReaction.steps)

		execChoice.reactSequence.name = 'react'
		execChoice.reactSequence.comment = 'The reactions of state ' + choice.name + '.'
		
		if ( trace.addTraceSteps ) execChoice.reactSequence.steps.add(0,choice.create.newTraceNodeExecuted)
		
		return execChoice.reactSequence
	}	
	

	def Sequence defineReaction(Synchronization sync) {
	
		val execSync = sync.create
		
		// move the default transition to the end of the reaction list
		val _default_ = execSync.reactions.head
		
		execSync.reactSequence.steps.addAll(_default_.effect)

		execSync.reactSequence.name = 'react'
		execSync.reactSequence.comment = 'The reactions of state ' + sync.name + '.'
		
		if ( trace.addTraceSteps ) execSync.reactSequence.steps.add(0,sync.create.newTraceNodeExecuted)
		
		return execSync.reactSequence
	}	
	

	def Sequence defineReaction(Exit it) {
	
		val execExit = it.create
		val realName = if (name.empty) 'default' else name 
				
		execExit.reactSequence.name = 'react'
		execExit.reactSequence.comment = 'The reactions of exit ' + realName + '.'
		
		// find the transition that relates to the matching exit point
		val outTransitions = (it.parentRegion.composite as Vertex).outgoingTransitions
		var exitTrans = outTransitions.filter( t | t.hasNoTrigger && t.exitPointName.equals(realName)).head
		if (exitTrans === null) exitTrans = outTransitions.filter( t | t.hasNoTrigger && t.exitPointName.equals('default')).head
		
		if (exitTrans !== null) {
			val exitReaction = exitTrans.create
			execExit.reactSequence.steps.add(exitReaction.effect.newCall)
		}
		
		if ( trace.addTraceSteps ) execExit.reactSequence.steps.add(0,it.create.newTraceNodeExecuted)
		
		return execExit.reactSequence
	}
	
	def protected hasNoTrigger(Transition t) {
		return t.trigger === null && !(t.target instanceof Synchronization)
	}

	def alwaysTrue(Check check) {
		if (check !== null && check.condition instanceof PrimitiveValueExpression) {
			val pve = (check.condition as PrimitiveValueExpression)
			return ( pve.value instanceof BoolLiteral && ( pve.value as BoolLiteral ).value )
		} 
		
		return false
	}
	
	
	def unchecked(Reaction it) {
		return (check === null || check.condition === null )
	}


	def declareReactMethod(RegularState state) {
		
		state.create => [
			features.add( sexecFactory.createMethod => [
				name = "react"
				typeSpecifier = TypesFactory.eINSTANCE.createTypeSpecifier => [
					type = typeSystem.getType(ITypeSystem::BOOLEAN);
				]	
			])
		]

	}	
	

	def defineReactMethod(RegularState state) {
		
		val execState = state.create
		val reactMethod = execState.reactMethod
				
		if (state.statechart.interleaveLocalReactions) {
			
			val stateReactions = 
				_sequence(
					execState.createReactionSequence(
						execState.createLocalReactionSequence(
							_return(_false)
						)
					),
					_return(_true)	
				)
							

			if (state.parentState !== null) {
				reactMethod.body =
					_sequence( 
						_if(_call(state.parentState.create.reactMethod))
							._then( _return(_true) )
							._else( stateReactions )			
					)
			} else {
				reactMethod.body = stateReactions
			}
			
			
		} else {
			
			throw new RuntimeException("Non interleaved local reactions not supported");
		}
				
		reactMethod.body.comment = 'The reactions of state ' + state.name + '.'
		
		return reactMethod
	} 
	
	
	def Method reactMethod(ExecutionState it) {
		features.filter( typeof(Method) ).filter( m | m.name == "react").head
	}
	

	def Sequence _sequence (Step... sequenceSteps) {
		sexec.factory.createSequence => [
			steps.addAll(sequenceSteps)
		]
	}		
	
	
	def If _if (Expression cond) {
		sexec.factory.createIf() => [
			check = sexec.factory.createCheck => [
				condition = cond
			]	
		]
	}
	
	def If _then (If it, Step step) {
		thenStep = step	
		it
	}
	
	def If _else (If it, Step step) {
		elseStep = step
		it
	}
	
	
	def ElementReferenceExpression _call(Operation op) {
		ExpressionsFactory.eINSTANCE.createElementReferenceExpression => [ reference = op ]
	}
	
	def Return _return(Expression exp) {
		sexec.factory.createReturn => [ value = exp ]
	}
	
	def PrimitiveValueExpression _true() { 
		ExpressionsFactory.eINSTANCE.createPrimitiveValueExpression => [
			value = ExpressionsFactory.eINSTANCE.createBoolLiteral => [ value = true]	
		]
	}
	 
	def PrimitiveValueExpression _false() { 
		ExpressionsFactory.eINSTANCE.createPrimitiveValueExpression => [
			value = ExpressionsFactory.eINSTANCE.createBoolLiteral => [ value = false]	
		]
	}
	 
	 
	def Sequence defineCycle(RegularState state) {
	
		val execState = state.create
		
		val shouldExecuteParent = if (! state.statechart.childFirstExecution) 
								[StateVector sv | sv.offset == execState.stateVector.offset]
							else
								[StateVector sv | sv.offset + sv.size == execState.stateVector.offset + execState.stateVector.size]
								
		val parents = state.parentStates.map(p|p.create as ExecutionState).filter(p| shouldExecuteParent.apply(p.stateVector) )
		
		var parentNodes = parents.map(p|p as ExecutionNode).toList
		
		if ( shouldExecuteParent.apply( execState.flow.stateVector) )
			parentNodes += EcoreUtil2::getRootContainer(execState) as ExecutionNode


		if (state.statechart.childFirstExecution) parentNodes = parentNodes.reverse
		
		if (state.statechart.interleaveLocalReactions) {

			execState.reactSequence = parentNodes.fold(null, [r, s | {
				s.createReactionSequence(s.createLocalReactionSequence(r))
			}])
			
		} else {
			
			val localReactSequence = parentNodes.fold(null, [ r, s | s.createLocalReactionSequence(r)])			
			execState.reactSequence = parentNodes.fold(localReactSequence, [r, s | { s.createReactionSequence(r) }])		
		}
		
		execState.reactSequence.name = 'react'
		execState.reactSequence.comment = 'The reactions of state ' + state.name + '.'
		
		return execState.reactSequence
	}	


	def Sequence createLocalReactionSequence(ExecutionNode state, Step localStep) {	
		val localReactions = state.reactions.filter(r | ! r.transition ).toList
		var localSteps = sexec.factory.createSequence
		localSteps.steps.addAll(localReactions.map(lr | {
				var ifStep = sexec.factory.createIf
				ifStep.check = lr.check.newRef		
				ifStep.thenStep = lr.effect.newCall
				ifStep
		}))

		if (localStep !== null) localSteps.steps += localStep
		
//		if (localSteps.steps.empty) return null		
//		else 
		return localSteps
	}


	def Sequence createReactionSequence(ExecutionNode state, Step localStep) {	
		val cycle = sexec.factory.createSequence
		cycle.name = "react"
		
		var localSteps = sexec.factory.createSequence		
		if (localStep !== null) localSteps.steps += localStep
		if (localSteps.steps.empty) localSteps = null
				
		val transitionReactions = state.reactions.filter(r | r.transition && ! r.unchecked ).toList
		val transitionStep = transitionReactions.reverseView.fold(localSteps as Step, [s, reaction | {
				var ifStep = sexec.factory.createIf
				ifStep.check = reaction.check.newRef		
				ifStep.thenStep = reaction.effect.newCall
				ifStep.elseStep = s
				ifStep as Step
			}])

		if (transitionStep !== null) cycle.steps.add(transitionStep)		
		else if (localSteps!== null) cycle.steps.add(localSteps)
		
		return cycle
	}
	
	
	
	
	def ExecutionFlow defineEntryReactions(Statechart statechart, ExecutionFlow r) {
		statechart.allEntries.forEach(e|e.defineReaction)
		return r
	}
	
	def defineReaction(Entry e) {

		// first get the mapped control flow element the entry
		val execEntry = e.create
		
		// if the entry defines a transition then we will derive the entry transition sequence
		var Sequence entryTransSeq = null
		val entryTransitionEffect = e?.transition?.effect		
		val target = e.target.create
		val targetEnterSequence = if (target !== null && e.outgoingTransitions.size > 0) { e.outgoingTransitions.mapToStateConfigurationEnterSequence } else null
			
		if ( entryTransitionEffect !== null || targetEnterSequence !== null) {
			entryTransSeq = sexecFactory.createSequence
			if (entryTransitionEffect !== null) {
				entryTransSeq.steps += entryTransitionEffect.mapEffect	
			}
			if (targetEnterSequence !== null) {
				entryTransSeq.steps += targetEnterSequence
			}
		}	
		
		// we add behavior to the already created react sequence from defineStateEnterSequence(Entry) 
		val seq = execEntry.reactSequence
		
		if ( trace.addTraceSteps ) seq.steps.add(0,execEntry.newTraceNodeExecuted)
		
		if (e.kind == EntryKind::INITIAL) {			
			if (entryTransSeq !== null) seq.steps += entryTransSeq
			
		} else if (e.kind == EntryKind::SHALLOW_HISTORY) {
			val entryStep = sexec.factory.createHistoryEntry
			entryStep.name = "HistoryEntry"
			entryStep.comment = "Enter the region with shallow history"
			entryStep.deep = false
			entryStep.region = (e.eContainer as Region).create
			
			if (entryTransSeq !== null) entryStep.initialStep = entryTransSeq
			
			entryStep.historyStep = (e.eContainer as Region).create.shallowEnterSequence.newCall
			
			seq.steps += entryStep
		} else if (e.kind == EntryKind::DEEP_HISTORY) {
			val entryStep = sexec.factory.createHistoryEntry
			entryStep.name = "HistoryEntry"
			entryStep.comment = "Enter the region with deep history"
			entryStep.region = (e.eContainer as Region).create
			entryStep.deep = true
			
			if (entryTransSeq !== null) entryStep.initialStep = entryTransSeq
			
			
			entryStep.historyStep =  (e.eContainer as Region).create.deepEnterSequence.newCall

			seq.steps += entryStep
		}
	}
}