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
package org.yakindu.sct.model.sgen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.yakindu.sct.model.sgen.SGenPackage
 * @generated
 */
public interface SGenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SGenFactory eINSTANCE = org.yakindu.sct.model.sgen.impl.SGenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Generator Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Model</em>'.
	 * @generated
	 */
	GeneratorModel createGeneratorModel();

	/**
	 * Returns a new object of class '<em>Generator Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Configuration</em>'.
	 * @generated
	 */
	GeneratorConfiguration createGeneratorConfiguration();

	/**
	 * Returns a new object of class '<em>Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Type</em>'.
	 * @generated
	 */
	FeatureType createFeatureType();

	/**
	 * Returns a new object of class '<em>Feature Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Parameter</em>'.
	 * @generated
	 */
	FeatureParameter createFeatureParameter();

	/**
	 * Returns a new object of class '<em>Feature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Configuration</em>'.
	 * @generated
	 */
	FeatureConfiguration createFeatureConfiguration();

	/**
	 * Returns a new object of class '<em>Generator Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Entry</em>'.
	 * @generated
	 */
	GeneratorEntry createGeneratorEntry();

	/**
	 * Returns a new object of class '<em>Feature Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Parameter Value</em>'.
	 * @generated
	 */
	FeatureParameterValue createFeatureParameterValue();

	/**
	 * Returns a new object of class '<em>Feature Type Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Type Library</em>'.
	 * @generated
	 */
	FeatureTypeLibrary createFeatureTypeLibrary();

	/**
	 * Returns a new object of class '<em>Deprecatable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deprecatable Element</em>'.
	 * @generated
	 */
	DeprecatableElement createDeprecatableElement();

	/**
	 * Returns a new object of class '<em>Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Definition</em>'.
	 * @generated
	 */
	PropertyDefinition createPropertyDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SGenPackage getSGenPackage();

} //SGenFactory
