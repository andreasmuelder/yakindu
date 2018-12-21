/**
 * Copyright (c) 2011 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.model.sgraph.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.yakindu.base.base.BaseFactory;
import org.yakindu.base.types.TypesFactory;
import org.yakindu.sct.model.sgraph.SGraphFactory;
import org.yakindu.sct.model.sgraph.SGraphPackage;
import org.yakindu.sct.model.sgraph.Scope;

/**
 * This is the item provider adapter for a {@link org.yakindu.sct.model.sgraph.Scope} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScopeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 committers of YAKINDU and others.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\nContributors:\r\ncommitters of YAKINDU - initial API and implementation\r\n";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeItemProvider(AdapterFactory adapterFactory) {
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

			addEventsPropertyDescriptor(object);
			addVariablesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scope_events_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scope_events_feature", "_UI_Scope_type"),
				 SGraphPackage.Literals.SCOPE__EVENTS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scope_variables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scope_variables_feature", "_UI_Scope_type"),
				 SGraphPackage.Literals.SCOPE__VARIABLES,
				 false,
				 false,
				 false,
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
			childrenFeatures.add(SGraphPackage.Literals.SCOPE__DECLARATIONS);
			childrenFeatures.add(SGraphPackage.Literals.SCOPE__REACTIONS);
			childrenFeatures.add(SGraphPackage.Literals.SCOPE__MEMBERS);
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
	 * This returns Scope.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Scope"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Scope_type");
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

		switch (notification.getFeatureID(Scope.class)) {
			case SGraphPackage.SCOPE__DECLARATIONS:
			case SGraphPackage.SCOPE__REACTIONS:
			case SGraphPackage.SCOPE__MEMBERS:
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
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 SGraphFactory.eINSTANCE.createImportDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 TypesFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 TypesFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 TypesFactory.eINSTANCE.createTypedDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 TypesFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 TypesFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 TypesFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 TypesFactory.eINSTANCE.createComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 TypesFactory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 TypesFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 TypesFactory.eINSTANCE.createEnumerator()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 TypesFactory.eINSTANCE.createTypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 TypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__DECLARATIONS,
				 TypesFactory.eINSTANCE.createAnnotationType()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 SGraphFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 SGraphFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 SGraphFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 SGraphFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 SGraphFactory.eINSTANCE.createStatechart()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 SGraphFactory.eINSTANCE.createEntry()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 SGraphFactory.eINSTANCE.createExit()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 SGraphFactory.eINSTANCE.createReactionProperty()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 SGraphFactory.eINSTANCE.createScope()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 SGraphFactory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 SGraphFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 SGraphFactory.eINSTANCE.createImportDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 SGraphFactory.eINSTANCE.createScopeMember()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 BaseFactory.eINSTANCE.createNamedElement()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 BaseFactory.eINSTANCE.createDocumentedElement()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 BaseFactory.eINSTANCE.createDomainElement()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createTypedDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createTypeSpecifier()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createEnumerator()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createTypeParameter()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createGenericElement()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createDomain()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createAnnotatableElement()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
				 TypesFactory.eINSTANCE.createArrayTypeSpecifier()));

		newChildDescriptors.add
			(createChildParameter
				(SGraphPackage.Literals.SCOPE__MEMBERS,
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
			childFeature == SGraphPackage.Literals.SCOPE__DECLARATIONS ||
			childFeature == SGraphPackage.Literals.SCOPE__MEMBERS;

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
		return SGraphEditPlugin.INSTANCE;
	}

}
