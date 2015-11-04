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
 * A representation of the literals of the enumeration '<em><b>EDefault Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see com.xse.optstack.persconf.PersconfPackage#getEDefaultDataType()
 * @model
 * @generated
 */
public enum EDefaultDataType implements Enumerator {
    /**
     * The '<em><b>FILE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #FILE_VALUE
     * @generated
     * @ordered
     */
    FILE(0, "FILE", "file"),

    /**
     * The '<em><b>KEY VALUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #KEY_VALUE_VALUE
     * @generated
     * @ordered
     */
    KEY_VALUE(1, "KEY_VALUE", "key");

    /**
     * The '<em><b>FILE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>FILE</b></em>' literal object isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #FILE
     * @model literal="file"
     * @generated
     * @ordered
     */
    public static final int FILE_VALUE = 0;

    /**
     * The '<em><b>KEY VALUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>KEY VALUE</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #KEY_VALUE
     * @model literal="key"
     * @generated
     * @ordered
     */
    public static final int KEY_VALUE_VALUE = 1;

    /**
     * An array of all the '<em><b>EDefault Data Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final EDefaultDataType[] VALUES_ARRAY = new EDefaultDataType[] { FILE, KEY_VALUE, };

    /**
     * A public read-only list of all the '<em><b>EDefault Data Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<EDefaultDataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>EDefault Data Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static EDefaultDataType get(final String literal) {
        for (final EDefaultDataType result : VALUES_ARRAY) {
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EDefault Data Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static EDefaultDataType getByName(final String name) {
        for (final EDefaultDataType result : VALUES_ARRAY) {
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EDefault Data Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static EDefaultDataType get(final int value) {
        switch (value) {
        case FILE_VALUE:
            return FILE;
        case KEY_VALUE_VALUE:
            return KEY_VALUE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private EDefaultDataType(final int value, final String name, final String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getValue() {
        return this.value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getLiteral() {
        return this.literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        return this.literal;
    }

} //EDefaultDataType
