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
 * @generated
 */
public class PersconfFactoryImpl extends EFactoryImpl implements PersconfFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PersconfFactory init() {
        try {
            PersconfFactory thePersconfFactory = (PersconfFactory) EPackage.Registry.INSTANCE
                    .getEFactory(PersconfPackage.eNS_URI);
            if (thePersconfFactory != null) {
                return thePersconfFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PersconfFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PersconfFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case PersconfPackage.EAPPLICATION_GROUP:
            return createEApplicationGroup();
        case PersconfPackage.EAPPLICATION:
            return createEApplication();
        case PersconfPackage.ECONFIGURATION:
            return createEConfiguration();
        case PersconfPackage.EDEFAULT_DATA:
            return createEDefaultData();
        case PersconfPackage.ERESOURCE:
            return createEResource();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case PersconfPackage.EGROUP_TYPE:
            return createEGroupTypeFromString(eDataType, initialValue);
        case PersconfPackage.EPOLICY:
            return createEPolicyFromString(eDataType, initialValue);
        case PersconfPackage.EPERMISSION:
            return createEPermissionFromString(eDataType, initialValue);
        case PersconfPackage.ESTORAGE:
            return createEStorageFromString(eDataType, initialValue);
        case PersconfPackage.EINSTALL_RULE:
            return createEInstallRuleFromString(eDataType, initialValue);
        case PersconfPackage.EINSTALL_EXCEPTION:
            return createEInstallExceptionFromString(eDataType, initialValue);
        case PersconfPackage.EDEFAULT_DATA_TYPE:
            return createEDefaultDataTypeFromString(eDataType, initialValue);
        case PersconfPackage.EINSTALL_EXCEPTION_OBJECT:
            return createEInstallExceptionObjectFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case PersconfPackage.EGROUP_TYPE:
            return convertEGroupTypeToString(eDataType, instanceValue);
        case PersconfPackage.EPOLICY:
            return convertEPolicyToString(eDataType, instanceValue);
        case PersconfPackage.EPERMISSION:
            return convertEPermissionToString(eDataType, instanceValue);
        case PersconfPackage.ESTORAGE:
            return convertEStorageToString(eDataType, instanceValue);
        case PersconfPackage.EINSTALL_RULE:
            return convertEInstallRuleToString(eDataType, instanceValue);
        case PersconfPackage.EINSTALL_EXCEPTION:
            return convertEInstallExceptionToString(eDataType, instanceValue);
        case PersconfPackage.EDEFAULT_DATA_TYPE:
            return convertEDefaultDataTypeToString(eDataType, instanceValue);
        case PersconfPackage.EINSTALL_EXCEPTION_OBJECT:
            return convertEInstallExceptionObjectToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EApplicationGroup createEApplicationGroup() {
        EApplicationGroupImpl eApplicationGroup = new EApplicationGroupImpl();
        return eApplicationGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EApplication createEApplication() {
        EApplicationImpl eApplication = new EApplicationImpl();
        return eApplication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EConfiguration createEConfiguration() {
        EConfigurationImpl eConfiguration = new EConfigurationImpl();
        return eConfiguration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDefaultData createEDefaultData() {
        EDefaultDataImpl eDefaultData = new EDefaultDataImpl();
        return eDefaultData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EResource createEResource() {
        EResourceImpl eResource = new EResourceImpl();
        return eResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EGroupType createEGroupTypeFromString(EDataType eDataType, String initialValue) {
        EGroupType result = EGroupType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEGroupTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPolicy createEPolicyFromString(EDataType eDataType, String initialValue) {
        EPolicy result = EPolicy.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEPolicyToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EPermission createEPermissionFromString(EDataType eDataType, String initialValue) {
        EPermission result = EPermission.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEPermissionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EStorage createEStorageFromString(EDataType eDataType, String initialValue) {
        EStorage result = EStorage.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEStorageToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EInstallRule createEInstallRuleFromString(EDataType eDataType, String initialValue) {
        EInstallRule result = EInstallRule.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEInstallRuleToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EInstallException createEInstallExceptionFromString(EDataType eDataType, String initialValue) {
        EInstallException result = EInstallException.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEInstallExceptionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDefaultDataType createEDefaultDataTypeFromString(EDataType eDataType, String initialValue) {
        EDefaultDataType result = EDefaultDataType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEDefaultDataTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EInstallException createEInstallExceptionObjectFromString(EDataType eDataType, String initialValue) {
        return createEInstallExceptionFromString(PersconfPackage.Literals.EINSTALL_EXCEPTION, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEInstallExceptionObjectToString(EDataType eDataType, Object instanceValue) {
        return convertEInstallExceptionToString(PersconfPackage.Literals.EINSTALL_EXCEPTION, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PersconfPackage getPersconfPackage() {
        return (PersconfPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static PersconfPackage getPackage() {
        return PersconfPackage.eINSTANCE;
    }

} //PersconfFactoryImpl
