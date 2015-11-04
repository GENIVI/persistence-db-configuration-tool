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
 * A representation of the literals of the enumeration '<em><b>EInstall Rule</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see com.xse.optstack.persconf.PersconfPackage#getEInstallRule()
 * @model
 * @generated
 */
public enum EInstallRule implements Enumerator {
    /**
     * The '<em><b>NEW INSTALL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #NEW_INSTALL_VALUE
     * @generated
     * @ordered
     */
    NEW_INSTALL(0, "NEW_INSTALL", "NewInstall"),

    /**
     * The '<em><b>UNINSTALL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #UNINSTALL_VALUE
     * @generated
     * @ordered
     */
    UNINSTALL(1, "UNINSTALL", "Uninstall"),

    /**
     * The '<em><b>DONT TOUCH</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #DONT_TOUCH_VALUE
     * @generated
     * @ordered
     */
    DONT_TOUCH(2, "DONT_TOUCH", "DontTouch"),

    /**
     * The '<em><b>UPDATE ALL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_ALL_VALUE
     * @generated
     * @ordered
     */
    UPDATE_ALL(3, "UPDATE_ALL", "UpdateAll"),

    /**
     * The '<em><b>UPDATE ALL SKIP DEFAULT FACTORY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_ALL_SKIP_DEFAULT_FACTORY_VALUE
     * @generated
     * @ordered
     */
    UPDATE_ALL_SKIP_DEFAULT_FACTORY(4, "UPDATE_ALL_SKIP_DEFAULT_FACTORY", "UpdateAllSkipDefaultFactory"),

    /**
     * The '<em><b>UPDATE ALL SKIP DEFAULT CONFIG</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_ALL_SKIP_DEFAULT_CONFIG_VALUE
     * @generated
     * @ordered
     */
    UPDATE_ALL_SKIP_DEFAULT_CONFIG(5, "UPDATE_ALL_SKIP_DEFAULT_CONFIG", "UpdateAllSkipDefaultConfig"),

    /**
     * The '<em><b>UPDATE ALL SKIP DEFAULT ALL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_ALL_SKIP_DEFAULT_ALL_VALUE
     * @generated
     * @ordered
     */
    UPDATE_ALL_SKIP_DEFAULT_ALL(6, "UPDATE_ALL_SKIP_DEFAULT_ALL", "UpdateAllSkipDefaultAll"),

    /**
     * The '<em><b>UPDATE DEFAULT FACTORY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_DEFAULT_FACTORY_VALUE
     * @generated
     * @ordered
     */
    UPDATE_DEFAULT_FACTORY(7, "UPDATE_DEFAULT_FACTORY", "UpdateDefaultFactory"),

    /**
     * The '<em><b>UPDATE DEFAULT CONFIG</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_DEFAULT_CONFIG_VALUE
     * @generated
     * @ordered
     */
    UPDATE_DEFAULT_CONFIG(8, "UPDATE_DEFAULT_CONFIG", "UpdateDefaultConfig"),

    /**
     * The '<em><b>UPDATE DEFAULT ALL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_DEFAULT_ALL_VALUE
     * @generated
     * @ordered
     */
    UPDATE_DEFAULT_ALL(9, "UPDATE_DEFAULT_ALL", "UpdateDefaultAll"),

    /**
     * The '<em><b>UNINSTALL NON DEFAULT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #UNINSTALL_NON_DEFAULT_VALUE
     * @generated
     * @ordered
     */
    UNINSTALL_NON_DEFAULT(10, "UNINSTALL_NON_DEFAULT", "UninstallNonDefault"),

    /**
     * The '<em><b>UPDATES SET OF RESOURCES</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #UPDATES_SET_OF_RESOURCES_VALUE
     * @generated
     * @ordered
     */
    UPDATES_SET_OF_RESOURCES(11, "UPDATES_SET_OF_RESOURCES", "UpdateSetOfResources");

    /**
     * The '<em><b>NEW INSTALL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NEW INSTALL</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #NEW_INSTALL
     * @model literal="NewInstall"
     * @generated
     * @ordered
     */
    public static final int NEW_INSTALL_VALUE = 0;

    /**
     * The '<em><b>UNINSTALL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UNINSTALL</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #UNINSTALL
     * @model literal="Uninstall"
     * @generated
     * @ordered
     */
    public static final int UNINSTALL_VALUE = 1;

    /**
     * The '<em><b>DONT TOUCH</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DONT TOUCH</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #DONT_TOUCH
     * @model literal="DontTouch"
     * @generated
     * @ordered
     */
    public static final int DONT_TOUCH_VALUE = 2;

    /**
     * The '<em><b>UPDATE ALL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UPDATE ALL</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_ALL
     * @model literal="UpdateAll"
     * @generated
     * @ordered
     */
    public static final int UPDATE_ALL_VALUE = 3;

    /**
     * The '<em><b>UPDATE ALL SKIP DEFAULT FACTORY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UPDATE ALL SKIP DEFAULT FACTORY</b></em>' literal object isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_ALL_SKIP_DEFAULT_FACTORY
     * @model literal="UpdateAllSkipDefaultFactory"
     * @generated
     * @ordered
     */
    public static final int UPDATE_ALL_SKIP_DEFAULT_FACTORY_VALUE = 4;

    /**
     * The '<em><b>UPDATE ALL SKIP DEFAULT CONFIG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UPDATE ALL SKIP DEFAULT CONFIG</b></em>' literal object isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_ALL_SKIP_DEFAULT_CONFIG
     * @model literal="UpdateAllSkipDefaultConfig"
     * @generated
     * @ordered
     */
    public static final int UPDATE_ALL_SKIP_DEFAULT_CONFIG_VALUE = 5;

    /**
     * The '<em><b>UPDATE ALL SKIP DEFAULT ALL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UPDATE ALL SKIP DEFAULT ALL</b></em>' literal object isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_ALL_SKIP_DEFAULT_ALL
     * @model literal="UpdateAllSkipDefaultAll"
     * @generated
     * @ordered
     */
    public static final int UPDATE_ALL_SKIP_DEFAULT_ALL_VALUE = 6;

    /**
     * The '<em><b>UPDATE DEFAULT FACTORY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UPDATE DEFAULT FACTORY</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_DEFAULT_FACTORY
     * @model literal="UpdateDefaultFactory"
     * @generated
     * @ordered
     */
    public static final int UPDATE_DEFAULT_FACTORY_VALUE = 7;

    /**
     * The '<em><b>UPDATE DEFAULT CONFIG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UPDATE DEFAULT CONFIG</b></em>' literal object isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_DEFAULT_CONFIG
     * @model literal="UpdateDefaultConfig"
     * @generated
     * @ordered
     */
    public static final int UPDATE_DEFAULT_CONFIG_VALUE = 8;

    /**
     * The '<em><b>UPDATE DEFAULT ALL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UPDATE DEFAULT ALL</b></em>' literal object isn't clear, there really should be more of
     * a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #UPDATE_DEFAULT_ALL
     * @model literal="UpdateDefaultAll"
     * @generated
     * @ordered
     */
    public static final int UPDATE_DEFAULT_ALL_VALUE = 9;

    /**
     * The '<em><b>UNINSTALL NON DEFAULT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UNINSTALL NON DEFAULT</b></em>' literal object isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #UNINSTALL_NON_DEFAULT
     * @model literal="UninstallNonDefault"
     * @generated
     * @ordered
     */
    public static final int UNINSTALL_NON_DEFAULT_VALUE = 10;

    /**
     * The '<em><b>UPDATES SET OF RESOURCES</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UPDATES SET OF RESOURCES</b></em>' literal object isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #UPDATES_SET_OF_RESOURCES
     * @model literal="UpdateSetOfResources"
     * @generated
     * @ordered
     */
    public static final int UPDATES_SET_OF_RESOURCES_VALUE = 11;

    /**
     * An array of all the '<em><b>EInstall Rule</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final EInstallRule[] VALUES_ARRAY = new EInstallRule[] { NEW_INSTALL, UNINSTALL, DONT_TOUCH, UPDATE_ALL,
            UPDATE_ALL_SKIP_DEFAULT_FACTORY, UPDATE_ALL_SKIP_DEFAULT_CONFIG, UPDATE_ALL_SKIP_DEFAULT_ALL, UPDATE_DEFAULT_FACTORY,
            UPDATE_DEFAULT_CONFIG, UPDATE_DEFAULT_ALL, UNINSTALL_NON_DEFAULT, UPDATES_SET_OF_RESOURCES, };

    /**
     * A public read-only list of all the '<em><b>EInstall Rule</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final List<EInstallRule> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>EInstall Rule</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static EInstallRule get(final String literal) {
        for (final EInstallRule result : VALUES_ARRAY) {
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EInstall Rule</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static EInstallRule getByName(final String name) {
        for (final EInstallRule result : VALUES_ARRAY) {
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EInstall Rule</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static EInstallRule get(final int value) {
        switch (value) {
        case NEW_INSTALL_VALUE:
            return NEW_INSTALL;
        case UNINSTALL_VALUE:
            return UNINSTALL;
        case DONT_TOUCH_VALUE:
            return DONT_TOUCH;
        case UPDATE_ALL_VALUE:
            return UPDATE_ALL;
        case UPDATE_ALL_SKIP_DEFAULT_FACTORY_VALUE:
            return UPDATE_ALL_SKIP_DEFAULT_FACTORY;
        case UPDATE_ALL_SKIP_DEFAULT_CONFIG_VALUE:
            return UPDATE_ALL_SKIP_DEFAULT_CONFIG;
        case UPDATE_ALL_SKIP_DEFAULT_ALL_VALUE:
            return UPDATE_ALL_SKIP_DEFAULT_ALL;
        case UPDATE_DEFAULT_FACTORY_VALUE:
            return UPDATE_DEFAULT_FACTORY;
        case UPDATE_DEFAULT_CONFIG_VALUE:
            return UPDATE_DEFAULT_CONFIG;
        case UPDATE_DEFAULT_ALL_VALUE:
            return UPDATE_DEFAULT_ALL;
        case UNINSTALL_NON_DEFAULT_VALUE:
            return UNINSTALL_NON_DEFAULT;
        case UPDATES_SET_OF_RESOURCES_VALUE:
            return UPDATES_SET_OF_RESOURCES;
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
    private EInstallRule(final int value, final String name, final String literal) {
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

} //EInstallRule
