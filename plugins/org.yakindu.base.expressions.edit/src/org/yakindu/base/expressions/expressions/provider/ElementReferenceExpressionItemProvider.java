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
package org.yakindu.base.expressions.expressions.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.yakindu.base.expressions.expressions.ElementReferenceExpression;
import org.yakindu.base.expressions.expressions.ExpressionsFactory;
import org.yakindu.base.expressions.expressions.ExpressionsPackage;
import org.yakindu.base.types.TypesFactory;

/**
 * This is the item provider adapter for a {@link org.yakindu.base.expressions.expressions.ElementReferenceExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementReferenceExpressionItemProvider
	extends ArgumentExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementReferenceExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addReferencePropertyDescriptor(object);
			addOperationCallPropertyDescriptor(object);
			addArrayAccessPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementReferenceExpression_reference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementReferenceExpression_reference_feature", "_UI_ElementReferenceExpression_type"),
				 ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__REFERENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation Call feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationCallPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementReferenceExpression_operationCall_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementReferenceExpression_operationCall_feature", "_UI_ElementReferenceExpression_type"),
				 ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__OPERATION_CALL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Array Access feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArrayAccessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementReferenceExpression_arrayAccess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementReferenceExpression_arrayAccess_feature", "_UI_ElementReferenceExpression_type"),
				 ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_ACCESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ElementReferenceExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ElementReferenceExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ElementReferenceExpression elementReferenceExpression = (ElementReferenceExpression)object;
		return getString("_UI_ElementReferenceExpression_type") + " " + elementReferenceExpression.isOperationCall();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ElementReferenceExpression.class)) {
			case ExpressionsPackage.ELEMENT_REFERENCE_EXPRESSION__OPERATION_CALL:
			case ExpressionsPackage.ELEMENT_REFERENCE_EXPRESSION__ARRAY_ACCESS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExpressionsPackage.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createConditionalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createLogicalOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createLogicalAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createLogicalNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createBitwiseXorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createBitwiseOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createBitwiseAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createLogicalRelationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createNumericalAddSubtractExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createNumericalMultiplyDivideExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createNumericalUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createPostFixUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createPrimitiveValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createMetaCall()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createElementReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createParenthesizedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createTypeCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createReturnExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createEventRaisingExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createEventValueReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createForExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createForVarDecl()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 ExpressionsFactory.eINSTANCE.createThrowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionsPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__ARRAY_SELECTOR,
				 TypesFactory.eINSTANCE.createProperty()));
	}

}
