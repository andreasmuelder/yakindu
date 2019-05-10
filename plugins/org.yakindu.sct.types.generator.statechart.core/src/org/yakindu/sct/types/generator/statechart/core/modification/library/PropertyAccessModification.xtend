/**
* Copyright (c) 2019 itemis AG - All rights Reserved
* Unauthorized copying of this file, via any medium is strictly prohibited
* 
* Contributors:
* 	itemis AG
*
*/
package org.yakindu.sct.types.generator.statechart.core.modification.library

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.Collection
import org.yakindu.base.expressions.expressions.AssignmentExpression
import org.yakindu.base.expressions.expressions.BlockExpression
import org.yakindu.base.expressions.util.ExpressionBuilder
import org.yakindu.base.expressions.util.ExpressionExtensions
import org.yakindu.base.expressions.util.PackageNavigationExtensions
import org.yakindu.base.types.Expression
import org.yakindu.base.types.Package
import org.yakindu.base.types.Property
import org.yakindu.base.types.TypeBuilder
import org.yakindu.base.types.Visibility
import org.yakindu.base.types.typesystem.ITypeSystem
import org.yakindu.sct.types.generator.modification.library.ComplexTypeNavigationExtensions
import org.yakindu.sct.types.generator.statechart.core.naming.IPropertyAccessNaming
import org.yakindu.sct.types.modification.IModification

/**
 * Creates getter and setter operations for all properties in interface types
 */
@Singleton
class PropertyAccessModification implements IModification {

	@Inject
	protected extension PackageNavigationExtensions

	@Inject
	protected extension ComplexTypeNavigationExtensions

	@Inject
	protected extension ExpressionBuilder

	@Inject
	protected extension TypeBuilder

	@Inject
	protected extension IPropertyAccessNaming

	@Inject
	protected extension ExpressionExtensions

	@Inject
	protected ITypeSystem ts
	
	override modify(Collection<Package> packages) {
		packages.forEach[modify]
		packages
	}

	def modify(Package p) {
		val interfaceTypes = p.allComplexTypes.filter[getAnnotationOfType("InterfaceGroup") !== null]
		interfaceTypes.forEach[ iface |
			iface.eAllContents.filter(Property).forEach [ prop |
				if(!prop.const) {
					iface.features += prop.writeAccess
				}
				if (prop.needsAssignMethod(p)) {
					iface.features += prop.assign
				}
				iface.features += prop.readAccess
				prop.visibility = Visibility.PROTECTED
			]
			
		]
		return p
	}

	protected def create _op readAccess(Property prop) {
		name = prop.nameReadAccess
		_type(prop.typeSpecifier)
		body = _block(_return(prop._ref))
		visibility = prop.visibility
	}

	protected def create _op writeAccess(Property prop) {
		name = prop.nameWriteAccess
		_type(ts.getType(ITypeSystem.VOID))
		_param("value", prop.typeSpecifier)
		body = _block(prop._ref._assign(parameters.head._ref))
		visibility = prop.visibility
	}
	
	protected def create _op assign(Property prop) {
		name = prop.nameAssign
		_type(prop.typeSpecifier)
		_param("value", prop.typeSpecifier)
		body = _block(_return(prop._ref._assign(parameters.head._ref)))
		visibility = prop.visibility
	}
	
	protected def needsAssignMethod(Property prop, Package p) {
		// we need an assign method in case the assignment to prop is part of another expression
		p.eAllContents.filter(AssignmentExpression)
			.filter[prop.equals(varRef.featureOrReference)]
			.exists[needsAssignMethod]
	}
	
	protected def needsAssignMethod(AssignmentExpression it) {
		eContainer instanceof Expression && !(eContainer instanceof BlockExpression)
	}

}