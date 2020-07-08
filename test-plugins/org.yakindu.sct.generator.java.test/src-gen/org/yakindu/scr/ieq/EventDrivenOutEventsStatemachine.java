/** Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.scr.ieq;

import java.util.LinkedList;
import java.util.Queue;
import org.yakindu.sct.rx.Observable;

public class EventDrivenOutEventsStatemachine implements IEventDrivenOutEventsStatemachine {
	protected class InterfaceImpl implements Interface {
	
		private boolean e1;
		
		
		public void raiseE1() {
			inEventQueue.add(new Runnable() {
				@Override
				public void run() {
					e1 = true;
				}
			});
			runCycle();
		}
		
		private boolean e2;
		
		
		protected void raiseE2() {
			e2 = true;
			e2Observable.next(null);
		}
		
		private Observable<Void> e2Observable = new Observable<Void>();
		
		public Observable<Void> getE2() {
			return e2Observable;
		}
		
	}
	
	protected InterfaceImpl defaultInterface;
	
	private boolean initialized = false;
	
	public enum State {
		MAIN_REGION_STATEA,
		MAIN_REGION_STATEB,
		SECOND_REGION_STATEC,
		SECOND_REGION_STATED,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[2];
	
	private int nextStateIndex;
	
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public EventDrivenOutEventsStatemachine() {
		defaultInterface = new InterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		for (int i = 0; i < 2; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		
		isExecuting = false;
	}
	
	public void enter() {
		if (!initialized)
			throw new IllegalStateException(
			        "The state machine needs to be initialized first by calling the init() function.");
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		enterSequence_main_region_default();
		enterSequence_second_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		exitSequence_main_region();
		exitSequence_second_region();
		isExecuting = false;
	}
	
	public void runCycle() {
		if (!initialized)
			throw new IllegalStateException(
			        "The state machine needs to be initialized first by calling the init() function.");
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		nextEvent();
		do { 
			for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
				switch (stateVector[nextStateIndex]) {
				case MAIN_REGION_STATEA:
					main_region_StateA_react(true);
					break;
				case MAIN_REGION_STATEB:
					main_region_StateB_react(true);
					break;
				case SECOND_REGION_STATEC:
					second_region_StateC_react(true);
					break;
				case SECOND_REGION_STATED:
					second_region_StateD_react(true);
					break;
				default:
					// $NULLSTATE$
				}
			}
			
			clearInEvents();
			nextEvent();
		} while (defaultInterface.e1);
		
		isExecuting = false;
	}
	
	/**
	 * @see IStatemachine#isActive()
	 */
	public boolean isActive() {
		return stateVector[0] != State.$NULLSTATE$||stateVector[1] != State.$NULLSTATE$;
	}
	
	/** 
	* Always returns 'false' since this state machine can never become final.
	*
	* @see IStatemachine#isFinal()
	*/
	public boolean isFinal() {
		return false;
	}
	private void clearInEvents() {
		defaultInterface.e1 = false;
	}
	
	protected void nextEvent() {
		if(!inEventQueue.isEmpty()) {
			inEventQueue.poll().run();
			return;
		}
	}
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case MAIN_REGION_STATEA:
			return stateVector[0] == State.MAIN_REGION_STATEA;
		case MAIN_REGION_STATEB:
			return stateVector[0] == State.MAIN_REGION_STATEB;
		case SECOND_REGION_STATEC:
			return stateVector[1] == State.SECOND_REGION_STATEC;
		case SECOND_REGION_STATED:
			return stateVector[1] == State.SECOND_REGION_STATED;
		default:
			return false;
		}
	}
	
	public Interface getInterface() {
		return defaultInterface;
	}
	
	public void raiseE1() {
		defaultInterface.raiseE1();
	}
	
	public Observable<Void> getE2() {
		return defaultInterface.getE2();
	}
	
	/* Entry action for state 'StateB'. */
	private void entryAction_main_region_StateB() {
		defaultInterface.raiseE2();
	}
	
	/* 'default' enter sequence for state StateA */
	private void enterSequence_main_region_StateA_default() {
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_STATEA;
	}
	
	/* 'default' enter sequence for state StateB */
	private void enterSequence_main_region_StateB_default() {
		entryAction_main_region_StateB();
		nextStateIndex = 0;
		stateVector[0] = State.MAIN_REGION_STATEB;
	}
	
	/* 'default' enter sequence for state StateC */
	private void enterSequence_second_region_StateC_default() {
		nextStateIndex = 1;
		stateVector[1] = State.SECOND_REGION_STATEC;
	}
	
	/* 'default' enter sequence for state StateD */
	private void enterSequence_second_region_StateD_default() {
		nextStateIndex = 1;
		stateVector[1] = State.SECOND_REGION_STATED;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		react_main_region__entry_Default();
	}
	
	/* 'default' enter sequence for region second region */
	private void enterSequence_second_region_default() {
		react_second_region__entry_Default();
	}
	
	/* Default exit sequence for state StateA */
	private void exitSequence_main_region_StateA() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state StateB */
	private void exitSequence_main_region_StateB() {
		nextStateIndex = 0;
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state StateC */
	private void exitSequence_second_region_StateC() {
		nextStateIndex = 1;
		stateVector[1] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state StateD */
	private void exitSequence_second_region_StateD() {
		nextStateIndex = 1;
		stateVector[1] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		switch (stateVector[0]) {
		case MAIN_REGION_STATEA:
			exitSequence_main_region_StateA();
			break;
		case MAIN_REGION_STATEB:
			exitSequence_main_region_StateB();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region second region */
	private void exitSequence_second_region() {
		switch (stateVector[1]) {
		case SECOND_REGION_STATEC:
			exitSequence_second_region_StateC();
			break;
		case SECOND_REGION_STATED:
			exitSequence_second_region_StateD();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		enterSequence_main_region_StateA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_second_region__entry_Default() {
		enterSequence_second_region_StateC_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean main_region_StateA_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (defaultInterface.e1) {
					exitSequence_main_region_StateA();
					enterSequence_main_region_StateB_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean main_region_StateB_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean second_region_StateC_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (defaultInterface.e2) {
				exitSequence_second_region_StateC();
				enterSequence_second_region_StateD_default();
			} else {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
	private boolean second_region_StateD_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			did_transition = false;
		}
		return did_transition;
	}
	
}
