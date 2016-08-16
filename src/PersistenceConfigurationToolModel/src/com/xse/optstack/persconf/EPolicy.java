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
 * A representation of the literals of the enumeration '<em><b>EPolicy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.xse.optstack.persconf.PersconfPackage#getEPolicy()
 * @model
 * @generated
 */
public enum EPolicy implements Enumerator {
    /**
     * The '<em><b>NA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NA_VALUE
     * @generated
     * @ordered
     */
    NA(0, "NA", "NA"),

    /**
     * The '<em><b>CACHED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CACHED_VALUE
     * @generated
     * @ordered
     */
    CACHED(1, "CACHED", "cached"),

    /**
     * The '<em><b>WRITETHROUGH</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WRITETHROUGH_VALUE
     * @generated
     * @ordered
     */
    WRITETHROUGH(2, "WRITETHROUGH", "writethrough");

    /**
     * The '<em><b>NA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NA</b></em>' literal object isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NA
     * @model
     * @generated
     * @ordered
     */
    public static final int NA_VALUE = 0;

    /**
     * The '<em><b>CACHED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CACHED</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CACHED
     * @model literal="cached"
     * @generated
     * @ordered
     */
    public static final int CACHED_VALUE = 1;

    /**
     * The '<em><b>WRITETHROUGH</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WRITETHROUGH</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WRITETHROUGH
     * @model literal="writethrough"
     * @generated
     * @ordered
     */
    public static final int WRITETHROUGH_VALUE = 2;

    /**
     * An array of all the '<em><b>EPolicy</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EPolicy[] VALUES_ARRAY = new EPolicy[] { NA, CACHED, WRITETHROUGH, };

    /**
     * A public read-only list of all the '<em><b>EPolicy</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<EPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>EPolicy</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EPolicy get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EPolicy result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EPolicy</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EPolicy getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EPolicy result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EPolicy</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EPolicy get(int value) {
        switch (value) {
        case NA_VALUE:
            return NA;
        case CACHED_VALUE:
            return CACHED;
        case WRITETHROUGH_VALUE:
            return WRITETHROUGH;
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
    private EPolicy(int value, String name, String literal) {
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

} //EPolicy
