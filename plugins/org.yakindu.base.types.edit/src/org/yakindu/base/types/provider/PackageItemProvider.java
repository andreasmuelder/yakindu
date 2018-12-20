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
package org.yakindu.base.types.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.yakindu.base.base.BasePackage;
import org.yakindu.base.base.provider.DomainElementItemProvider;
import org.yakindu.base.types.TypesFactory;
import org.yakindu.base.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.yakindu.base.types.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider
	extends DomainElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addStaticPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addImportPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 BasePackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Static feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Declaration_static_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Declaration_static_feature", "_UI_Declaration_type"),
				 TypesPackage.Literals.DECLARATION__STATIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Declaration_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Declaration_id_feature", "_UI_Declaration_type"),
				 TypesPackage.Literals.DECLARATION__ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Import feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_import_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_import_feature", "_UI_Package_type"),
				 TypesPackage.Literals.PACKAGE__IMPORT,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATIONS);
			childrenFeatures.add(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO);
			childrenFeatures.add(TypesPackage.Literals.PACKAGE__MEMBER);
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
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Package"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((org.yakindu.base.types.Package)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Package_type") :
			getString("_UI_Package_type") + " " + label;
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

		switch (notification.getFeatureID(org.yakindu.base.types.Package.class)) {
			case TypesPackage.PACKAGE__NAME:
			case TypesPackage.PACKAGE__STATIC:
			case TypesPackage.PACKAGE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.PACKAGE__ANNOTATIONS:
			case TypesPackage.PACKAGE__ANNOTATION_INFO:
			case TypesPackage.PACKAGE__MEMBER:
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
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATIONS,
				 TypesFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createEnumerator()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createTypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createAnnotatableElement()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO,
				 TypesFactory.eINSTANCE.createAnnotationType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PACKAGE__MEMBER,
				 TypesFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PACKAGE__MEMBER,
				 TypesFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PACKAGE__MEMBER,
				 TypesFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PACKAGE__MEMBER,
				 TypesFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PACKAGE__MEMBER,
				 TypesFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PACKAGE__MEMBER,
				 TypesFactory.eINSTANCE.createComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PACKAGE__MEMBER,
				 TypesFactory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PACKAGE__MEMBER,
				 TypesFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PACKAGE__MEMBER,
				 TypesFactory.eINSTANCE.createEnumerator()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PACKAGE__MEMBER,
				 TypesFactory.eINSTANCE.createTypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PACKAGE__MEMBER,
				 TypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.PACKAGE__MEMBER,
				 TypesFactory.eINSTANCE.createAnnotationType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == TypesPackage.Literals.ANNOTATABLE_ELEMENT__ANNOTATION_INFO ||
			childFeature == TypesPackage.Literals.PACKAGE__MEMBER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TypesEditPlugin.INSTANCE;
	}

}
