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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EInstall Exception</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.xse.optstack.persconf.PersconfPackage#getEInstallException()
 * @model
 * @generated
 */
public enum EInstallException implements Enumerator {
    /**
     * The '<em><b>UPDATE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UPDATE_VALUE
     * @generated
     * @ordered
     */
    UPDATE(0, "UPDATE", "Update"),

    /**
     * The '<em><b>DONT TOUCH</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DONT_TOUCH_VALUE
     * @generated
     * @ordered
     */
    DONT_TOUCH(1, "DONT_TOUCH", "DontTouch"),

    /**
     * The '<em><b>DELETE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DELETE_VALUE
     * @generated
     * @ordered
     */
    DELETE(2, "DELETE", "Delete");

    /**
     * The '<em><b>UPDATE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UPDATE</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UPDATE
     * @model literal="Update"
     * @generated
     * @ordered
     */
    public static final int UPDATE_VALUE = 0;

    /**
     * The '<em><b>DONT TOUCH</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DONT TOUCH</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DONT_TOUCH
     * @model literal="DontTouch"
     * @generated
     * @ordered
     */
    public static final int DONT_TOUCH_VALUE = 1;

    /**
     * The '<em><b>DELETE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DELETE</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DELETE
     * @model literal="Delete"
     * @generated
     * @ordered
     */
    public static final int DELETE_VALUE = 2;

    /**
     * An array of all the '<em><b>EInstall Exception</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EInstallException[] VALUES_ARRAY = new EInstallException[] { UPDATE, DONT_TOUCH, DELETE, };

    /**
     * A public read-only list of all the '<em><b>EInstall Exception</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<EInstallException> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>EInstall Exception</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EInstallException get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EInstallException result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EInstall Exception</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EInstallException getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EInstallException result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EInstall Exception</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EInstallException get(int value) {
        switch (value) {
        case UPDATE_VALUE:
            return UPDATE;
        case DONT_TOUCH_VALUE:
            return DONT_TOUCH;
        case DELETE_VALUE:
            return DELETE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EInstallException(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //EInstallException
