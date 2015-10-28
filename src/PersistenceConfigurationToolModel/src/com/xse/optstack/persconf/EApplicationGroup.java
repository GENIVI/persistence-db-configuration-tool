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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EApplication Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.xse.optstack.persconf.EApplicationGroup#getApplications <em>Applications</em>}</li>
 * <li>{@link com.xse.optstack.persconf.EApplicationGroup#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.xse.optstack.persconf.PersconfPackage#getEApplicationGroup()
 * @model
 * @generated
 */
public interface EApplicationGroup extends EObject {
    /**
     * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
     * The list contents are of type {@link com.xse.optstack.persconf.EApplication}.
     * It is bidirectional and its opposite is '{@link com.xse.optstack.persconf.EApplication#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applications</em>' containment reference list isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Applications</em>' containment reference list.
     * @see com.xse.optstack.persconf.PersconfPackage#getEApplicationGroup_Applications()
     * @see com.xse.optstack.persconf.EApplication#getGroup
     * @model opposite="group" containment="true"
     * @generated
     */
    EList<EApplication> getApplications();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link com.xse.optstack.persconf.EGroupType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Type</em>' attribute.
     * @see com.xse.optstack.persconf.EGroupType
     * @see #setType(EGroupType)
     * @see com.xse.optstack.persconf.PersconfPackage#getEApplicationGroup_Type()
     * @model required="true"
     * @generated
     */
    EGroupType getType();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EApplicationGroup#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Type</em>' attribute.
     * @see com.xse.optstack.persconf.EGroupType
     * @see #getType()
     * @generated
     */
    void setType(EGroupType value);

} // EApplicationGroup
