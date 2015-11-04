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
 * A representation of the model object '<em><b>EConfiguration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.xse.optstack.persconf.EConfiguration#getPolicy <em>Policy</em>}</li>
 * <li>{@link com.xse.optstack.persconf.EConfiguration#getPermission <em>Permission</em>}</li>
 * <li>{@link com.xse.optstack.persconf.EConfiguration#getStorage <em>Storage</em>}</li>
 * <li>{@link com.xse.optstack.persconf.EConfiguration#getResponsible <em>Responsible</em>}</li>
 * <li>{@link com.xse.optstack.persconf.EConfiguration#getCustom_name <em>Custom name</em>}</li>
 * <li>{@link com.xse.optstack.persconf.EConfiguration#getCustomID <em>Custom ID</em>}</li>
 * <li>{@link com.xse.optstack.persconf.EConfiguration#getMax_size <em>Max size</em>}</li>
 * <li>{@link com.xse.optstack.persconf.EConfiguration#getType <em>Type</em>}</li>
 * <li>{@link com.xse.optstack.persconf.EConfiguration#getFactoryDefault <em>Factory Default</em>}</li>
 * <li>{@link com.xse.optstack.persconf.EConfiguration#getConfigDefault <em>Config Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.xse.optstack.persconf.PersconfPackage#getEConfiguration()
 * @model
 * @generated
 */
public interface EConfiguration extends EObject {
    /**
     * Returns the value of the '<em><b>Policy</b></em>' attribute.
     * The literals are from the enumeration {@link com.xse.optstack.persconf.EPolicy}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Policy</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Policy</em>' attribute.
     * @see com.xse.optstack.persconf.EPolicy
     * @see #setPolicy(EPolicy)
     * @see com.xse.optstack.persconf.PersconfPackage#getEConfiguration_Policy()
     * @model required="true"
     * @generated
     */
    EPolicy getPolicy();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EConfiguration#getPolicy <em>Policy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Policy</em>' attribute.
     * @see com.xse.optstack.persconf.EPolicy
     * @see #getPolicy()
     * @generated
     */
    void setPolicy(EPolicy value);

    /**
     * Returns the value of the '<em><b>Permission</b></em>' attribute.
     * The literals are from the enumeration {@link com.xse.optstack.persconf.EPermission}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Permission</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Permission</em>' attribute.
     * @see com.xse.optstack.persconf.EPermission
     * @see #setPermission(EPermission)
     * @see com.xse.optstack.persconf.PersconfPackage#getEConfiguration_Permission()
     * @model required="true"
     * @generated
     */
    EPermission getPermission();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EConfiguration#getPermission <em>Permission</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Permission</em>' attribute.
     * @see com.xse.optstack.persconf.EPermission
     * @see #getPermission()
     * @generated
     */
    void setPermission(EPermission value);

    /**
     * Returns the value of the '<em><b>Storage</b></em>' attribute.
     * The literals are from the enumeration {@link com.xse.optstack.persconf.EStorage}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Storage</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Storage</em>' attribute.
     * @see com.xse.optstack.persconf.EStorage
     * @see #setStorage(EStorage)
     * @see com.xse.optstack.persconf.PersconfPackage#getEConfiguration_Storage()
     * @model required="true"
     * @generated
     */
    EStorage getStorage();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EConfiguration#getStorage <em>Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Storage</em>' attribute.
     * @see com.xse.optstack.persconf.EStorage
     * @see #getStorage()
     * @generated
     */
    void setStorage(EStorage value);

    /**
     * Returns the value of the '<em><b>Responsible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Responsible</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Responsible</em>' attribute.
     * @see #setResponsible(String)
     * @see com.xse.optstack.persconf.PersconfPackage#getEConfiguration_Responsible()
     * @model
     * @generated
     */
    String getResponsible();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EConfiguration#getResponsible <em>Responsible</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Responsible</em>' attribute.
     * @see #getResponsible()
     * @generated
     */
    void setResponsible(String value);

    /**
     * Returns the value of the '<em><b>Custom name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Custom name</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Custom name</em>' attribute.
     * @see #setCustom_name(String)
     * @see com.xse.optstack.persconf.PersconfPackage#getEConfiguration_Custom_name()
     * @model
     * @generated
     */
    String getCustom_name();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EConfiguration#getCustom_name <em>Custom name</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Custom name</em>' attribute.
     * @see #getCustom_name()
     * @generated
     */
    void setCustom_name(String value);

    /**
     * Returns the value of the '<em><b>Custom ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Custom ID</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Custom ID</em>' attribute.
     * @see #setCustomID(String)
     * @see com.xse.optstack.persconf.PersconfPackage#getEConfiguration_CustomID()
     * @model
     * @generated
     */
    String getCustomID();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EConfiguration#getCustomID <em>Custom ID</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Custom ID</em>' attribute.
     * @see #getCustomID()
     * @generated
     */
    void setCustomID(String value);

    /**
     * Returns the value of the '<em><b>Max size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max size</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Max size</em>' attribute.
     * @see #setMax_size(String)
     * @see com.xse.optstack.persconf.PersconfPackage#getEConfiguration_Max_size()
     * @model
     * @generated
     */
    String getMax_size();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EConfiguration#getMax_size <em>Max size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Max size</em>' attribute.
     * @see #getMax_size()
     * @generated
     */
    void setMax_size(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link com.xse.optstack.persconf.EDefaultDataType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Type</em>' attribute.
     * @see com.xse.optstack.persconf.EDefaultDataType
     * @see #setType(EDefaultDataType)
     * @see com.xse.optstack.persconf.PersconfPackage#getEConfiguration_Type()
     * @model required="true"
     * @generated
     */
    EDefaultDataType getType();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EConfiguration#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Type</em>' attribute.
     * @see com.xse.optstack.persconf.EDefaultDataType
     * @see #getType()
     * @generated
     */
    void setType(EDefaultDataType value);

    /**
     * Returns the value of the '<em><b>Factory Default</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Factory Default</em>' containment reference isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Factory Default</em>' containment reference.
     * @see #setFactoryDefault(EDefaultData)
     * @see com.xse.optstack.persconf.PersconfPackage#getEConfiguration_FactoryDefault()
     * @model containment="true"
     * @generated
     */
    EDefaultData getFactoryDefault();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EConfiguration#getFactoryDefault
     * <em>Factory Default</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Factory Default</em>' containment reference.
     * @see #getFactoryDefault()
     * @generated
     */
    void setFactoryDefault(EDefaultData value);

    /**
     * Returns the value of the '<em><b>Config Default</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config Default</em>' containment reference isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Config Default</em>' containment reference.
     * @see #setConfigDefault(EDefaultData)
     * @see com.xse.optstack.persconf.PersconfPackage#getEConfiguration_ConfigDefault()
     * @model containment="true"
     * @generated
     */
    EDefaultData getConfigDefault();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EConfiguration#getConfigDefault <em>Config Default</em>}'
     * containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Config Default</em>' containment reference.
     * @see #getConfigDefault()
     * @generated
     */
    void setConfigDefault(EDefaultData value);

} // EConfiguration
