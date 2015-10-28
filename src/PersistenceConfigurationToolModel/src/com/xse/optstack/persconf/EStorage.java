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
 * A representation of the literals of the enumeration '<em><b>EStorage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see com.xse.optstack.persconf.PersconfPackage#getEStorage()
 * @model
 * @generated
 */
public enum EStorage implements Enumerator {
    /**
     * The '<em><b>LOCAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #LOCAL_VALUE
     * @generated
     * @ordered
     */
    LOCAL(0, "LOCAL", "local"),

    /**
     * The '<em><b>SHARED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #SHARED_VALUE
     * @generated
     * @ordered
     */
    SHARED(1, "SHARED", "shared"),

    /**
     * The '<em><b>HWINFO</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #HWINFO_VALUE
     * @generated
     * @ordered
     */
    HWINFO(2, "HWINFO", "hwinfo"),

    /**
     * The '<em><b>EARLY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #EARLY_VALUE
     * @generated
     * @ordered
     */
    EARLY(3, "EARLY", "early"),

    /**
     * The '<em><b>EMERGENCY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #EMERGENCY_VALUE
     * @generated
     * @ordered
     */
    EMERGENCY(4, "EMERGENCY", "emergency"), /**
     * The '<em><b>SECURE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #SECURE_VALUE
     * @generated
     * @ordered
     */
    SECURE(5, "SECURE", "secure"), /**
     * The '<em><b>CUSTOM1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #CUSTOM1_VALUE
     * @generated
     * @ordered
     */
    CUSTOM1(6, "CUSTOM1", "custom1"), /**
     * The '<em><b>CUSTOM2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #CUSTOM2_VALUE
     * @generated
     * @ordered
     */
    CUSTOM2(7, "CUSTOM2", "custom2"), /**
     * The '<em><b>CUSTOM3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #CUSTOM3_VALUE
     * @generated
     * @ordered
     */
    CUSTOM3(8, "CUSTOM3", "custom3");

    /**
     * The '<em><b>LOCAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LOCAL</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #LOCAL
     * @model literal="local"
     * @generated
     * @ordered
     */
    public static final int LOCAL_VALUE = 0;

    /**
     * The '<em><b>SHARED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SHARED</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #SHARED
     * @model literal="shared"
     * @generated
     * @ordered
     */
    public static final int SHARED_VALUE = 1;

    /**
     * The '<em><b>HWINFO</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>HWINFO</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #HWINFO
     * @model literal="hwinfo"
     * @generated
     * @ordered
     */
    public static final int HWINFO_VALUE = 2;

    /**
     * The '<em><b>EARLY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>EARLY</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #EARLY
     * @model literal="early"
     * @generated
     * @ordered
     */
    public static final int EARLY_VALUE = 3;

    /**
     * The '<em><b>EMERGENCY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>EMERGENCY</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #EMERGENCY
     * @model literal="emergency"
     * @generated
     * @ordered
     */
    public static final int EMERGENCY_VALUE = 4;

    /**
     * The '<em><b>SECURE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SECURE</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #SECURE
     * @model literal="secure"
     * @generated
     * @ordered
     */
    public static final int SECURE_VALUE = 5;

    /**
     * The '<em><b>CUSTOM1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CUSTOM1</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #CUSTOM1
     * @model literal="custom1"
     * @generated
     * @ordered
     */
    public static final int CUSTOM1_VALUE = 6;

    /**
     * The '<em><b>CUSTOM2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CUSTOM2</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #CUSTOM2
     * @model literal="custom2"
     * @generated
     * @ordered
     */
    public static final int CUSTOM2_VALUE = 7;

    /**
     * The '<em><b>CUSTOM3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CUSTOM3</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #CUSTOM3
     * @model literal="custom3"
     * @generated
     * @ordered
     */
    public static final int CUSTOM3_VALUE = 8;

    /**
     * An array of all the '<em><b>EStorage</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final EStorage[] VALUES_ARRAY = new EStorage[] { LOCAL, SHARED, HWINFO, EARLY, EMERGENCY, SECURE, CUSTOM1, CUSTOM2,
            CUSTOM3, };

    /**
     * A public read-only list of all the '<em><b>EStorage</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<EStorage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>EStorage</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static EStorage get(final String literal) {
        for (final EStorage result : VALUES_ARRAY) {
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EStorage</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static EStorage getByName(final String name) {
        for (final EStorage result : VALUES_ARRAY) {
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EStorage</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static EStorage get(final int value) {
        switch (value) {
        case LOCAL_VALUE:
            return LOCAL;
        case SHARED_VALUE:
            return SHARED;
        case HWINFO_VALUE:
            return HWINFO;
        case EARLY_VALUE:
            return EARLY;
        case EMERGENCY_VALUE:
            return EMERGENCY;
        case SECURE_VALUE:
            return SECURE;
        case CUSTOM1_VALUE:
            return CUSTOM1;
        case CUSTOM2_VALUE:
            return CUSTOM2;
        case CUSTOM3_VALUE:
            return CUSTOM3;
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
    private EStorage(final int value, final String name, final String literal) {
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

} //EStorage
