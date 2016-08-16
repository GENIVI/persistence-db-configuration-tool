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
 * A representation of the model object '<em><b>EDefault Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xse.optstack.persconf.EDefaultData#getSize <em>Size</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.EDefaultData#getData <em>Data</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.EDefaultData#getLocalResourcePath <em>Local Resource Path</em>}</li>
 * </ul>
 *
 * @see com.xse.optstack.persconf.PersconfPackage#getEDefaultData()
 * @model
 * @generated
 */
public interface EDefaultData extends EObject {
    /**
     * Returns the value of the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size</em>' attribute.
     * @see #setSize(String)
     * @see com.xse.optstack.persconf.PersconfPackage#getEDefaultData_Size()
     * @model required="true"
     * @generated
     */
    String getSize();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EDefaultData#getSize <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size</em>' attribute.
     * @see #getSize()
     * @generated
     */
    void setSize(String value);

    /**
     * Returns the value of the '<em><b>Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data</em>' attribute.
     * @see #setData(String)
     * @see com.xse.optstack.persconf.PersconfPackage#getEDefaultData_Data()
     * @model required="true"
     * @generated
     */
    String getData();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EDefaultData#getData <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data</em>' attribute.
     * @see #getData()
     * @generated
     */
    void setData(String value);

    /**
     * Returns the value of the '<em><b>Local Resource Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Resource Path</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Resource Path</em>' attribute.
     * @see #setLocalResourcePath(String)
     * @see com.xse.optstack.persconf.PersconfPackage#getEDefaultData_LocalResourcePath()
     * @model unique="false" transient="true"
     * @generated
     */
    String getLocalResourcePath();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EDefaultData#getLocalResourcePath <em>Local Resource Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Resource Path</em>' attribute.
     * @see #getLocalResourcePath()
     * @generated
     */
    void setLocalResourcePath(String value);

} // EDefaultData
