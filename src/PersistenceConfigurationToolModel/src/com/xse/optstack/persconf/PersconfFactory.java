/*******************************************************************************
 * Persistence Configuration Tool Model
 *
 * Copyright (c) 2015 Mentor Graphics and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Mentor Graphics - initial API and implementation
 ******************************************************************************/
package com.xse.optstack.persconf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see com.xse.optstack.persconf.PersconfPackage
 * @generated
 */
public interface PersconfFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    PersconfFactory eINSTANCE = com.xse.optstack.persconf.impl.PersconfFactoryImpl.init();

    /**
     * Returns a new object of class '<em>EApplication Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>EApplication Group</em>'.
     * @generated
     */
    EApplicationGroup createEApplicationGroup();

    /**
     * Returns a new object of class '<em>EApplication</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>EApplication</em>'.
     * @generated
     */
    EApplication createEApplication();

    /**
     * Returns a new object of class '<em>EConfiguration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>EConfiguration</em>'.
     * @generated
     */
    EConfiguration createEConfiguration();

    /**
     * Returns a new object of class '<em>EDefault Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>EDefault Data</em>'.
     * @generated
     */
    EDefaultData createEDefaultData();

    /**
     * Returns a new object of class '<em>EResource</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>EResource</em>'.
     * @generated
     */
    EResource createEResource();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the package supported by this factory.
     * @generated
     */
    PersconfPackage getPersconfPackage();

} //PersconfFactory
