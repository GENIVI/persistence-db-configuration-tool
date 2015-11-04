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
package com.xse.optstack.persconf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;
import com.xse.optstack.persconf.EConfiguration;
import com.xse.optstack.persconf.EDefaultData;
import com.xse.optstack.persconf.EDefaultDataType;
import com.xse.optstack.persconf.EGroupType;
import com.xse.optstack.persconf.EInstallException;
import com.xse.optstack.persconf.EInstallRule;
import com.xse.optstack.persconf.EPermission;
import com.xse.optstack.persconf.EPolicy;
import com.xse.optstack.persconf.EResource;
import com.xse.optstack.persconf.EStorage;
import com.xse.optstack.persconf.PersconfFactory;
import com.xse.optstack.persconf.PersconfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class PersconfFactoryImpl extends EFactoryImpl implements PersconfFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static PersconfFactory init() {
        try {
            final PersconfFactory thePersconfFactory = (PersconfFactory) EPackage.Registry.INSTANCE.getEFactory(PersconfPackage.eNS_URI);
            if (thePersconfFactory != null) {
                return thePersconfFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PersconfFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public PersconfFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case PersconfPackage.EAPPLICATION_GROUP:
            return this.createEApplicationGroup();
        case PersconfPackage.EAPPLICATION:
            return this.createEApplication();
        case PersconfPackage.ECONFIGURATION:
            return this.createEConfiguration();
        case PersconfPackage.EDEFAULT_DATA:
            return this.createEDefaultData();
        case PersconfPackage.ERESOURCE:
            return this.createEResource();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID()) {
        case PersconfPackage.EGROUP_TYPE:
            return this.createEGroupTypeFromString(eDataType, initialValue);
        case PersconfPackage.EPOLICY:
            return this.createEPolicyFromString(eDataType, initialValue);
        case PersconfPackage.EPERMISSION:
            return this.createEPermissionFromString(eDataType, initialValue);
        case PersconfPackage.ESTORAGE:
            return this.createEStorageFromString(eDataType, initialValue);
        case PersconfPackage.EINSTALL_RULE:
            return this.createEInstallRuleFromString(eDataType, initialValue);
        case PersconfPackage.EINSTALL_EXCEPTION:
            return this.createEInstallExceptionFromString(eDataType, initialValue);
        case PersconfPackage.EDEFAULT_DATA_TYPE:
            return this.createEDefaultDataTypeFromString(eDataType, initialValue);
        case PersconfPackage.EINSTALL_EXCEPTION_OBJECT:
            return this.createEInstallExceptionObjectFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case PersconfPackage.EGROUP_TYPE:
            return this.convertEGroupTypeToString(eDataType, instanceValue);
        case PersconfPackage.EPOLICY:
            return this.convertEPolicyToString(eDataType, instanceValue);
        case PersconfPackage.EPERMISSION:
            return this.convertEPermissionToString(eDataType, instanceValue);
        case PersconfPackage.ESTORAGE:
            return this.convertEStorageToString(eDataType, instanceValue);
        case PersconfPackage.EINSTALL_RULE:
            return this.convertEInstallRuleToString(eDataType, instanceValue);
        case PersconfPackage.EINSTALL_EXCEPTION:
            return this.convertEInstallExceptionToString(eDataType, instanceValue);
        case PersconfPackage.EDEFAULT_DATA_TYPE:
            return this.convertEDefaultDataTypeToString(eDataType, instanceValue);
        case PersconfPackage.EINSTALL_EXCEPTION_OBJECT:
            return this.convertEInstallExceptionObjectToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EApplicationGroup createEApplicationGroup() {
        final EApplicationGroupImpl eApplicationGroup = new EApplicationGroupImpl();
        return eApplicationGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EApplication createEApplication() {
        final EApplicationImpl eApplication = new EApplicationImpl();
        return eApplication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EConfiguration createEConfiguration() {
        final EConfigurationImpl eConfiguration = new EConfigurationImpl();
        return eConfiguration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDefaultData createEDefaultData() {
        final EDefaultDataImpl eDefaultData = new EDefaultDataImpl();
        return eDefaultData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EResource createEResource() {
        final EResourceImpl eResource = new EResourceImpl();
        return eResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public EGroupType createEGroupTypeFromString(final EDataType eDataType, final String initialValue) {
        final EGroupType result = EGroupType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertEGroupTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public EPolicy createEPolicyFromString(final EDataType eDataType, final String initialValue) {
        final EPolicy result = EPolicy.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertEPolicyToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public EPermission createEPermissionFromString(final EDataType eDataType, final String initialValue) {
        final EPermission result = EPermission.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertEPermissionToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public EStorage createEStorageFromString(final EDataType eDataType, final String initialValue) {
        final EStorage result = EStorage.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertEStorageToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public EInstallRule createEInstallRuleFromString(final EDataType eDataType, final String initialValue) {
        final EInstallRule result = EInstallRule.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertEInstallRuleToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public EInstallException createEInstallExceptionFromString(final EDataType eDataType, final String initialValue) {
        final EInstallException result = EInstallException.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertEInstallExceptionToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public EDefaultDataType createEDefaultDataTypeFromString(final EDataType eDataType, final String initialValue) {
        final EDefaultDataType result = EDefaultDataType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertEDefaultDataTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public EInstallException createEInstallExceptionObjectFromString(final EDataType eDataType, final String initialValue) {
        return this.createEInstallExceptionFromString(PersconfPackage.Literals.EINSTALL_EXCEPTION, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertEInstallExceptionObjectToString(final EDataType eDataType, final Object instanceValue) {
        return this.convertEInstallExceptionToString(PersconfPackage.Literals.EINSTALL_EXCEPTION, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PersconfPackage getPersconfPackage() {
        return (PersconfPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static PersconfPackage getPackage() {
        return PersconfPackage.eINSTANCE;
    }

} //PersconfFactoryImpl
