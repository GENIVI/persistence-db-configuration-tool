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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EResource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xse.optstack.persconf.EResource#getName <em>Name</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.EResource#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.EResource#getInstallException <em>Install Exception</em>}</li>
 * </ul>
 *
 * @see com.xse.optstack.persconf.PersconfPackage#getEResource()
 * @model
 * @generated
 */
public interface EResource extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see com.xse.optstack.persconf.PersconfPackage#getEResource_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EResource#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Configuration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configuration</em>' reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configuration</em>' reference.
     * @see #setConfiguration(EConfiguration)
     * @see com.xse.optstack.persconf.PersconfPackage#getEResource_Configuration()
     * @model
     * @generated
     */
    EConfiguration getConfiguration();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EResource#getConfiguration <em>Configuration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Configuration</em>' reference.
     * @see #getConfiguration()
     * @generated
     */
    void setConfiguration(EConfiguration value);

    /**
     * Returns the value of the '<em><b>Install Exception</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Install Exception</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Install Exception</em>' attribute.
     * @see #setInstallException(EInstallException)
     * @see com.xse.optstack.persconf.PersconfPackage#getEResource_InstallException()
     * @model dataType="com.xse.optstack.persconf.EInstallExceptionObject"
     * @generated
     */
    EInstallException getInstallException();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EResource#getInstallException <em>Install Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Install Exception</em>' attribute.
     * @see #getInstallException()
     * @generated
     */
    void setInstallException(EInstallException value);

} // EResource
