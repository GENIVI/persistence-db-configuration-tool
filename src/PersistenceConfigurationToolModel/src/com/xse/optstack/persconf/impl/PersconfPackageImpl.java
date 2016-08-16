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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersconfPackageImpl extends EPackageImpl implements PersconfPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eApplicationGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eApplicationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eDefaultDataEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eGroupTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum ePolicyEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum ePermissionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eStorageEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eInstallRuleEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eInstallExceptionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eDefaultDataTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType eInstallExceptionObjectEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
     * EPackage.Registry} by the package
     * package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
     * performs initialization of the package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see com.xse.optstack.persconf.PersconfPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private PersconfPackageImpl() {
        super(eNS_URI, PersconfFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link PersconfPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static PersconfPackage init() {
        if (isInited)
            return (PersconfPackage) EPackage.Registry.INSTANCE.getEPackage(PersconfPackage.eNS_URI);

        // Obtain or create and register package
        PersconfPackageImpl thePersconfPackage = (PersconfPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof PersconfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new PersconfPackageImpl());

        isInited = true;

        // Create package meta-data objects
        thePersconfPackage.createPackageContents();

        // Initialize created meta-data
        thePersconfPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thePersconfPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(PersconfPackage.eNS_URI, thePersconfPackage);
        return thePersconfPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEApplication() {
        return eApplicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEApplication_Name() {
        return (EAttribute) eApplicationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEApplication_Version() {
        return (EAttribute) eApplicationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEApplication_Resources() {
        return (EReference) eApplicationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEApplication_Group() {
        return (EReference) eApplicationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEApplication_InstallRule() {
        return (EAttribute) eApplicationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEApplication_Size() {
        return (EAttribute) eApplicationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEConfiguration() {
        return eConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Policy() {
        return (EAttribute) eConfigurationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Permission() {
        return (EAttribute) eConfigurationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Storage() {
        return (EAttribute) eConfigurationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Responsible() {
        return (EAttribute) eConfigurationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Custom_name() {
        return (EAttribute) eConfigurationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_CustomID() {
        return (EAttribute) eConfigurationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Max_size() {
        return (EAttribute) eConfigurationEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Type() {
        return (EAttribute) eConfigurationEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEConfiguration_FactoryDefault() {
        return (EReference) eConfigurationEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEConfiguration_ConfigDefault() {
        return (EReference) eConfigurationEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEDefaultData() {
        return eDefaultDataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEDefaultData_Size() {
        return (EAttribute) eDefaultDataEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEDefaultData_Data() {
        return (EAttribute) eDefaultDataEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEDefaultData_LocalResourcePath() {
        return (EAttribute) eDefaultDataEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEResource() {
        return eResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEResource_Name() {
        return (EAttribute) eResourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEResource_Configuration() {
        return (EReference) eResourceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEResource_InstallException() {
        return (EAttribute) eResourceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getEGroupType() {
        return eGroupTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEApplicationGroup() {
        return eApplicationGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEApplicationGroup_Applications() {
        return (EReference) eApplicationGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEApplicationGroup_Type() {
        return (EAttribute) eApplicationGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getEPolicy() {
        return ePolicyEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getEPermission() {
        return ePermissionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getEStorage() {
        return eStorageEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getEInstallRule() {
        return eInstallRuleEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getEInstallException() {
        return eInstallExceptionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getEDefaultDataType() {
        return eDefaultDataTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getEInstallExceptionObject() {
        return eInstallExceptionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PersconfFactory getPersconfFactory() {
        return (PersconfFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        eApplicationGroupEClass = createEClass(EAPPLICATION_GROUP);
        createEReference(eApplicationGroupEClass, EAPPLICATION_GROUP__APPLICATIONS);
        createEAttribute(eApplicationGroupEClass, EAPPLICATION_GROUP__TYPE);

        eApplicationEClass = createEClass(EAPPLICATION);
        createEAttribute(eApplicationEClass, EAPPLICATION__NAME);
        createEAttribute(eApplicationEClass, EAPPLICATION__VERSION);
        createEReference(eApplicationEClass, EAPPLICATION__RESOURCES);
        createEReference(eApplicationEClass, EAPPLICATION__GROUP);
        createEAttribute(eApplicationEClass, EAPPLICATION__INSTALL_RULE);
        createEAttribute(eApplicationEClass, EAPPLICATION__SIZE);

        eConfigurationEClass = createEClass(ECONFIGURATION);
        createEAttribute(eConfigurationEClass, ECONFIGURATION__POLICY);
        createEAttribute(eConfigurationEClass, ECONFIGURATION__PERMISSION);
        createEAttribute(eConfigurationEClass, ECONFIGURATION__STORAGE);
        createEAttribute(eConfigurationEClass, ECONFIGURATION__RESPONSIBLE);
        createEAttribute(eConfigurationEClass, ECONFIGURATION__CUSTOM_NAME);
        createEAttribute(eConfigurationEClass, ECONFIGURATION__CUSTOM_ID);
        createEAttribute(eConfigurationEClass, ECONFIGURATION__MAX_SIZE);
        createEAttribute(eConfigurationEClass, ECONFIGURATION__TYPE);
        createEReference(eConfigurationEClass, ECONFIGURATION__FACTORY_DEFAULT);
        createEReference(eConfigurationEClass, ECONFIGURATION__CONFIG_DEFAULT);

        eDefaultDataEClass = createEClass(EDEFAULT_DATA);
        createEAttribute(eDefaultDataEClass, EDEFAULT_DATA__SIZE);
        createEAttribute(eDefaultDataEClass, EDEFAULT_DATA__DATA);
        createEAttribute(eDefaultDataEClass, EDEFAULT_DATA__LOCAL_RESOURCE_PATH);

        eResourceEClass = createEClass(ERESOURCE);
        createEAttribute(eResourceEClass, ERESOURCE__NAME);
        createEReference(eResourceEClass, ERESOURCE__CONFIGURATION);
        createEAttribute(eResourceEClass, ERESOURCE__INSTALL_EXCEPTION);

        // Create enums
        eGroupTypeEEnum = createEEnum(EGROUP_TYPE);
        ePolicyEEnum = createEEnum(EPOLICY);
        ePermissionEEnum = createEEnum(EPERMISSION);
        eStorageEEnum = createEEnum(ESTORAGE);
        eInstallRuleEEnum = createEEnum(EINSTALL_RULE);
        eInstallExceptionEEnum = createEEnum(EINSTALL_EXCEPTION);
        eDefaultDataTypeEEnum = createEEnum(EDEFAULT_DATA_TYPE);

        // Create data types
        eInstallExceptionObjectEDataType = createEDataType(EINSTALL_EXCEPTION_OBJECT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        initEClass(eApplicationGroupEClass, EApplicationGroup.class, "EApplicationGroup", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEApplicationGroup_Applications(), this.getEApplication(), this.getEApplication_Group(),
                "applications", null, 0, -1, EApplicationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEApplicationGroup_Type(), this.getEGroupType(), "type", null, 1, 1, EApplicationGroup.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eApplicationEClass, EApplication.class, "EApplication", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEApplication_Name(), ecorePackage.getEString(), "name", null, 1, 1, EApplication.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEApplication_Version(), ecorePackage.getEString(), "version", "0.1.0", 1, 1,
                EApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEReference(getEApplication_Resources(), this.getEResource(), null, "resources", null, 0, -1,
                EApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEApplication_Group(), this.getEApplicationGroup(), this.getEApplicationGroup_Applications(),
                "group", null, 1, 1, EApplication.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEApplication_InstallRule(), this.getEInstallRule(), "installRule", null, 0, 1,
                EApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEApplication_Size(), ecorePackage.getEIntegerObject(), "size", null, 0, 1, EApplication.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eConfigurationEClass, EConfiguration.class, "EConfiguration", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEConfiguration_Policy(), this.getEPolicy(), "policy", null, 1, 1, EConfiguration.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEConfiguration_Permission(), this.getEPermission(), "permission", null, 1, 1,
                EConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEConfiguration_Storage(), this.getEStorage(), "storage", null, 1, 1, EConfiguration.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEConfiguration_Responsible(), ecorePackage.getEString(), "responsible", null, 0, 1,
                EConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEConfiguration_Custom_name(), ecorePackage.getEString(), "custom_name", null, 0, 1,
                EConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEConfiguration_CustomID(), ecorePackage.getEString(), "customID", null, 0, 1,
                EConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEConfiguration_Max_size(), ecorePackage.getEString(), "max_size", null, 0, 1,
                EConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEConfiguration_Type(), this.getEDefaultDataType(), "type", null, 1, 1, EConfiguration.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEConfiguration_FactoryDefault(), this.getEDefaultData(), null, "factoryDefault", null, 0, 1,
                EConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEConfiguration_ConfigDefault(), this.getEDefaultData(), null, "configDefault", null, 0, 1,
                EConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eDefaultDataEClass, EDefaultData.class, "EDefaultData", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEDefaultData_Size(), ecorePackage.getEString(), "size", null, 1, 1, EDefaultData.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEDefaultData_Data(), ecorePackage.getEString(), "data", null, 1, 1, EDefaultData.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEDefaultData_LocalResourcePath(), ecorePackage.getEString(), "localResourcePath", null, 0, 1,
                EDefaultData.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(eResourceEClass, EResource.class, "EResource", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, EResource.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEResource_Configuration(), this.getEConfiguration(), null, "configuration", null, 0, 1,
                EResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEResource_InstallException(), this.getEInstallExceptionObject(), "installException", null, 0,
                1, EResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(eGroupTypeEEnum, EGroupType.class, "EGroupType");
        addEEnumLiteral(eGroupTypeEEnum, EGroupType.APPLICATION);
        addEEnumLiteral(eGroupTypeEEnum, EGroupType.SHARED);
        addEEnumLiteral(eGroupTypeEEnum, EGroupType.PUBLIC);

        initEEnum(ePolicyEEnum, EPolicy.class, "EPolicy");
        addEEnumLiteral(ePolicyEEnum, EPolicy.NA);
        addEEnumLiteral(ePolicyEEnum, EPolicy.CACHED);
        addEEnumLiteral(ePolicyEEnum, EPolicy.WRITETHROUGH);

        initEEnum(ePermissionEEnum, EPermission.class, "EPermission");
        addEEnumLiteral(ePermissionEEnum, EPermission.WO);
        addEEnumLiteral(ePermissionEEnum, EPermission.RO);
        addEEnumLiteral(ePermissionEEnum, EPermission.RW);

        initEEnum(eStorageEEnum, EStorage.class, "EStorage");
        addEEnumLiteral(eStorageEEnum, EStorage.LOCAL);
        addEEnumLiteral(eStorageEEnum, EStorage.SHARED);
        addEEnumLiteral(eStorageEEnum, EStorage.HWINFO);
        addEEnumLiteral(eStorageEEnum, EStorage.EARLY);
        addEEnumLiteral(eStorageEEnum, EStorage.EMERGENCY);
        addEEnumLiteral(eStorageEEnum, EStorage.SECURE);
        addEEnumLiteral(eStorageEEnum, EStorage.CUSTOM1);
        addEEnumLiteral(eStorageEEnum, EStorage.CUSTOM2);
        addEEnumLiteral(eStorageEEnum, EStorage.CUSTOM3);

        initEEnum(eInstallRuleEEnum, EInstallRule.class, "EInstallRule");
        addEEnumLiteral(eInstallRuleEEnum, EInstallRule.NEW_INSTALL);
        addEEnumLiteral(eInstallRuleEEnum, EInstallRule.UNINSTALL);
        addEEnumLiteral(eInstallRuleEEnum, EInstallRule.DONT_TOUCH);
        addEEnumLiteral(eInstallRuleEEnum, EInstallRule.UPDATE_ALL);
        addEEnumLiteral(eInstallRuleEEnum, EInstallRule.UPDATE_ALL_SKIP_DEFAULT_FACTORY);
        addEEnumLiteral(eInstallRuleEEnum, EInstallRule.UPDATE_ALL_SKIP_DEFAULT_CONFIG);
        addEEnumLiteral(eInstallRuleEEnum, EInstallRule.UPDATE_ALL_SKIP_DEFAULT_ALL);
        addEEnumLiteral(eInstallRuleEEnum, EInstallRule.UPDATE_DEFAULT_FACTORY);
        addEEnumLiteral(eInstallRuleEEnum, EInstallRule.UPDATE_DEFAULT_CONFIG);
        addEEnumLiteral(eInstallRuleEEnum, EInstallRule.UPDATE_DEFAULT_ALL);
        addEEnumLiteral(eInstallRuleEEnum, EInstallRule.UNINSTALL_NON_DEFAULT);
        addEEnumLiteral(eInstallRuleEEnum, EInstallRule.UPDATES_SET_OF_RESOURCES);

        initEEnum(eInstallExceptionEEnum, EInstallException.class, "EInstallException");
        addEEnumLiteral(eInstallExceptionEEnum, EInstallException.UPDATE);
        addEEnumLiteral(eInstallExceptionEEnum, EInstallException.DONT_TOUCH);
        addEEnumLiteral(eInstallExceptionEEnum, EInstallException.DELETE);

        initEEnum(eDefaultDataTypeEEnum, EDefaultDataType.class, "EDefaultDataType");
        addEEnumLiteral(eDefaultDataTypeEEnum, EDefaultDataType.FILE);
        addEEnumLiteral(eDefaultDataTypeEEnum, EDefaultDataType.KEY_VALUE);
        addEEnumLiteral(eDefaultDataTypeEEnum, EDefaultDataType.NA);

        // Initialize data types
        initEDataType(eInstallExceptionObjectEDataType, EInstallException.class, "EInstallExceptionObject",
                IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
        addAnnotation(eInstallExceptionObjectEDataType, source, new String[] { "baseType", "EInstallException" });
    }

} //PersconfPackageImpl
