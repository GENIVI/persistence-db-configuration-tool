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
 * 
 * @generated
 */
public class PersconfPackageImpl extends EPackageImpl implements PersconfPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass eApplicationGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass eApplicationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass eConfigurationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass eDefaultDataEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass eResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum eGroupTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum ePolicyEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum ePermissionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum eStorageEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum eInstallRuleEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum eInstallExceptionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private EEnum eDefaultDataTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
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
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>
     * This method is used to initialize {@link PersconfPackage#eINSTANCE} when that field is accessed. Clients should
     * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static PersconfPackage init() {
        if (isInited) {
            return (PersconfPackage) EPackage.Registry.INSTANCE.getEPackage(PersconfPackage.eNS_URI);
        }

        // Obtain or create and register package
        final PersconfPackageImpl thePersconfPackage = (PersconfPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PersconfPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new PersconfPackageImpl());

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
     * 
     * @generated
     */
    @Override
    public EClass getEApplication() {
        return this.eApplicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEApplication_Name() {
        return (EAttribute) this.eApplicationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEApplication_Version() {
        return (EAttribute) this.eApplicationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getEApplication_Resources() {
        return (EReference) this.eApplicationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getEApplication_Group() {
        return (EReference) this.eApplicationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEApplication_InstallRule() {
        return (EAttribute) this.eApplicationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEApplication_Size() {
        return (EAttribute) this.eApplicationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getEConfiguration() {
        return this.eConfigurationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Policy() {
        return (EAttribute) this.eConfigurationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Permission() {
        return (EAttribute) this.eConfigurationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Storage() {
        return (EAttribute) this.eConfigurationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Responsible() {
        return (EAttribute) this.eConfigurationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Custom_name() {
        return (EAttribute) this.eConfigurationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_CustomID() {
        return (EAttribute) this.eConfigurationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Max_size() {
        return (EAttribute) this.eConfigurationEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEConfiguration_Type() {
        return (EAttribute) this.eConfigurationEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getEConfiguration_FactoryDefault() {
        return (EReference) this.eConfigurationEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getEConfiguration_ConfigDefault() {
        return (EReference) this.eConfigurationEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getEDefaultData() {
        return this.eDefaultDataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEDefaultData_Size() {
        return (EAttribute) this.eDefaultDataEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEDefaultData_Data() {
        return (EAttribute) this.eDefaultDataEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEDefaultData_LocalResourcePath() {
        return (EAttribute) this.eDefaultDataEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getEResource() {
        return this.eResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEResource_Name() {
        return (EAttribute) this.eResourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getEResource_Configuration() {
        return (EReference) this.eResourceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEResource_InstallException() {
        return (EAttribute) this.eResourceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getEGroupType() {
        return this.eGroupTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EClass getEApplicationGroup() {
        return this.eApplicationGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EReference getEApplicationGroup_Applications() {
        return (EReference) this.eApplicationGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EAttribute getEApplicationGroup_Type() {
        return (EAttribute) this.eApplicationGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getEPolicy() {
        return this.ePolicyEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getEPermission() {
        return this.ePermissionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getEStorage() {
        return this.eStorageEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getEInstallRule() {
        return this.eInstallRuleEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getEInstallException() {
        return this.eInstallExceptionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EEnum getEDefaultDataType() {
        return this.eDefaultDataTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDataType getEInstallExceptionObject() {
        return this.eInstallExceptionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PersconfFactory getPersconfFactory() {
        return (PersconfFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.eApplicationGroupEClass = this.createEClass(EAPPLICATION_GROUP);
        this.createEReference(this.eApplicationGroupEClass, EAPPLICATION_GROUP__APPLICATIONS);
        this.createEAttribute(this.eApplicationGroupEClass, EAPPLICATION_GROUP__TYPE);

        this.eApplicationEClass = this.createEClass(EAPPLICATION);
        this.createEAttribute(this.eApplicationEClass, EAPPLICATION__NAME);
        this.createEAttribute(this.eApplicationEClass, EAPPLICATION__VERSION);
        this.createEReference(this.eApplicationEClass, EAPPLICATION__RESOURCES);
        this.createEReference(this.eApplicationEClass, EAPPLICATION__GROUP);
        this.createEAttribute(this.eApplicationEClass, EAPPLICATION__INSTALL_RULE);
        this.createEAttribute(this.eApplicationEClass, EAPPLICATION__SIZE);

        this.eConfigurationEClass = this.createEClass(ECONFIGURATION);
        this.createEAttribute(this.eConfigurationEClass, ECONFIGURATION__POLICY);
        this.createEAttribute(this.eConfigurationEClass, ECONFIGURATION__PERMISSION);
        this.createEAttribute(this.eConfigurationEClass, ECONFIGURATION__STORAGE);
        this.createEAttribute(this.eConfigurationEClass, ECONFIGURATION__RESPONSIBLE);
        this.createEAttribute(this.eConfigurationEClass, ECONFIGURATION__CUSTOM_NAME);
        this.createEAttribute(this.eConfigurationEClass, ECONFIGURATION__CUSTOM_ID);
        this.createEAttribute(this.eConfigurationEClass, ECONFIGURATION__MAX_SIZE);
        this.createEAttribute(this.eConfigurationEClass, ECONFIGURATION__TYPE);
        this.createEReference(this.eConfigurationEClass, ECONFIGURATION__FACTORY_DEFAULT);
        this.createEReference(this.eConfigurationEClass, ECONFIGURATION__CONFIG_DEFAULT);

        this.eDefaultDataEClass = this.createEClass(EDEFAULT_DATA);
        this.createEAttribute(this.eDefaultDataEClass, EDEFAULT_DATA__SIZE);
        this.createEAttribute(this.eDefaultDataEClass, EDEFAULT_DATA__DATA);
        this.createEAttribute(this.eDefaultDataEClass, EDEFAULT_DATA__LOCAL_RESOURCE_PATH);

        this.eResourceEClass = this.createEClass(ERESOURCE);
        this.createEAttribute(this.eResourceEClass, ERESOURCE__NAME);
        this.createEReference(this.eResourceEClass, ERESOURCE__CONFIGURATION);
        this.createEAttribute(this.eResourceEClass, ERESOURCE__INSTALL_EXCEPTION);

        // Create enums
        this.eGroupTypeEEnum = this.createEEnum(EGROUP_TYPE);
        this.ePolicyEEnum = this.createEEnum(EPOLICY);
        this.ePermissionEEnum = this.createEEnum(EPERMISSION);
        this.eStorageEEnum = this.createEEnum(ESTORAGE);
        this.eInstallRuleEEnum = this.createEEnum(EINSTALL_RULE);
        this.eInstallExceptionEEnum = this.createEEnum(EINSTALL_EXCEPTION);
        this.eDefaultDataTypeEEnum = this.createEEnum(EDEFAULT_DATA_TYPE);

        // Create data types
        this.eInstallExceptionObjectEDataType = this.createEDataType(EINSTALL_EXCEPTION_OBJECT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.eApplicationGroupEClass, EApplicationGroup.class, "EApplicationGroup", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getEApplicationGroup_Applications(), this.getEApplication(), this.getEApplication_Group(), "applications",
                null, 0, -1, EApplicationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEApplicationGroup_Type(), this.getEGroupType(), "type", null, 1, 1, EApplicationGroup.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.eApplicationEClass, EApplication.class, "EApplication", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getEApplication_Name(), this.ecorePackage.getEString(), "name", null, 1, 1, EApplication.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEApplication_Version(), this.ecorePackage.getEString(), "version", "0.1.0", 1, 1, EApplication.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getEApplication_Resources(), this.getEResource(), null, "resources", null, 0, -1, EApplication.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        this.initEReference(this.getEApplication_Group(), this.getEApplicationGroup(), this.getEApplicationGroup_Applications(), "group",
                null, 1, 1, EApplication.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEApplication_InstallRule(), this.getEInstallRule(), "installRule", null, 0, 1, EApplication.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEApplication_Size(), this.ecorePackage.getEIntegerObject(), "size", null, 0, 1, EApplication.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.eConfigurationEClass, EConfiguration.class, "EConfiguration", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getEConfiguration_Policy(), this.getEPolicy(), "policy", null, 1, 1, EConfiguration.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEConfiguration_Permission(), this.getEPermission(), "permission", null, 1, 1, EConfiguration.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEConfiguration_Storage(), this.getEStorage(), "storage", null, 1, 1, EConfiguration.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEConfiguration_Responsible(), this.ecorePackage.getEString(), "responsible", null, 0, 1,
                EConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        this.initEAttribute(this.getEConfiguration_Custom_name(), this.ecorePackage.getEString(), "custom_name", null, 0, 1,
                EConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        this.initEAttribute(this.getEConfiguration_CustomID(), this.ecorePackage.getEString(), "customID", null, 0, 1,
                EConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        this.initEAttribute(this.getEConfiguration_Max_size(), this.ecorePackage.getEString(), "max_size", null, 0, 1,
                EConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        this.initEAttribute(this.getEConfiguration_Type(), this.getEDefaultDataType(), "type", null, 1, 1, EConfiguration.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getEConfiguration_FactoryDefault(), this.getEDefaultData(), null, "factoryDefault", null, 0, 1,
                EConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getEConfiguration_ConfigDefault(), this.getEDefaultData(), null, "configDefault", null, 0, 1,
                EConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.eDefaultDataEClass, EDefaultData.class, "EDefaultData", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getEDefaultData_Size(), this.ecorePackage.getEString(), "size", null, 1, 1, EDefaultData.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEDefaultData_Data(), this.ecorePackage.getEString(), "data", null, 1, 1, EDefaultData.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEDefaultData_LocalResourcePath(), this.ecorePackage.getEString(), "localResourcePath", null, 0, 1,
                EDefaultData.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.eResourceEClass, EResource.class, "EResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getEResource_Name(), this.ecorePackage.getEString(), "name", null, 1, 1, EResource.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getEResource_Configuration(), this.getEConfiguration(), null, "configuration", null, 0, 1,
                EResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getEResource_InstallException(), this.getEInstallExceptionObject(), "installException", null, 0, 1,
                EResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        this.initEEnum(this.eGroupTypeEEnum, EGroupType.class, "EGroupType");
        this.addEEnumLiteral(this.eGroupTypeEEnum, EGroupType.APPLICATION);
        this.addEEnumLiteral(this.eGroupTypeEEnum, EGroupType.SHARED);
        this.addEEnumLiteral(this.eGroupTypeEEnum, EGroupType.PUBLIC);

        this.initEEnum(this.ePolicyEEnum, EPolicy.class, "EPolicy");
        this.addEEnumLiteral(this.ePolicyEEnum, EPolicy.NA);
        this.addEEnumLiteral(this.ePolicyEEnum, EPolicy.CACHED);
        this.addEEnumLiteral(this.ePolicyEEnum, EPolicy.WRITETHROUGH);

        this.initEEnum(this.ePermissionEEnum, EPermission.class, "EPermission");
        this.addEEnumLiteral(this.ePermissionEEnum, EPermission.WO);
        this.addEEnumLiteral(this.ePermissionEEnum, EPermission.RO);
        this.addEEnumLiteral(this.ePermissionEEnum, EPermission.RW);

        this.initEEnum(this.eStorageEEnum, EStorage.class, "EStorage");
        this.addEEnumLiteral(this.eStorageEEnum, EStorage.LOCAL);
        this.addEEnumLiteral(this.eStorageEEnum, EStorage.SHARED);
        this.addEEnumLiteral(this.eStorageEEnum, EStorage.HWINFO);
        this.addEEnumLiteral(this.eStorageEEnum, EStorage.EARLY);
        this.addEEnumLiteral(this.eStorageEEnum, EStorage.EMERGENCY);
        this.addEEnumLiteral(this.eStorageEEnum, EStorage.SECURE);
        this.addEEnumLiteral(this.eStorageEEnum, EStorage.CUSTOM1);
        this.addEEnumLiteral(this.eStorageEEnum, EStorage.CUSTOM2);
        this.addEEnumLiteral(this.eStorageEEnum, EStorage.CUSTOM3);

        this.initEEnum(this.eInstallRuleEEnum, EInstallRule.class, "EInstallRule");
        this.addEEnumLiteral(this.eInstallRuleEEnum, EInstallRule.NEW_INSTALL);
        this.addEEnumLiteral(this.eInstallRuleEEnum, EInstallRule.UNINSTALL);
        this.addEEnumLiteral(this.eInstallRuleEEnum, EInstallRule.DONT_TOUCH);
        this.addEEnumLiteral(this.eInstallRuleEEnum, EInstallRule.UPDATE_ALL);
        this.addEEnumLiteral(this.eInstallRuleEEnum, EInstallRule.UPDATE_ALL_SKIP_DEFAULT_FACTORY);
        this.addEEnumLiteral(this.eInstallRuleEEnum, EInstallRule.UPDATE_ALL_SKIP_DEFAULT_CONFIG);
        this.addEEnumLiteral(this.eInstallRuleEEnum, EInstallRule.UPDATE_ALL_SKIP_DEFAULT_ALL);
        this.addEEnumLiteral(this.eInstallRuleEEnum, EInstallRule.UPDATE_DEFAULT_FACTORY);
        this.addEEnumLiteral(this.eInstallRuleEEnum, EInstallRule.UPDATE_DEFAULT_CONFIG);
        this.addEEnumLiteral(this.eInstallRuleEEnum, EInstallRule.UPDATE_DEFAULT_ALL);
        this.addEEnumLiteral(this.eInstallRuleEEnum, EInstallRule.UNINSTALL_NON_DEFAULT);
        this.addEEnumLiteral(this.eInstallRuleEEnum, EInstallRule.UPDATES_SET_OF_RESOURCES);

        this.initEEnum(this.eInstallExceptionEEnum, EInstallException.class, "EInstallException");
        this.addEEnumLiteral(this.eInstallExceptionEEnum, EInstallException.UPDATE);
        this.addEEnumLiteral(this.eInstallExceptionEEnum, EInstallException.DONT_TOUCH);
        this.addEEnumLiteral(this.eInstallExceptionEEnum, EInstallException.DELETE);

        this.initEEnum(this.eDefaultDataTypeEEnum, EDefaultDataType.class, "EDefaultDataType");
        this.addEEnumLiteral(this.eDefaultDataTypeEEnum, EDefaultDataType.FILE);
        this.addEEnumLiteral(this.eDefaultDataTypeEEnum, EDefaultDataType.KEY_VALUE);

        // Initialize data types
        this.initEDataType(this.eInstallExceptionObjectEDataType, EInstallException.class, "EInstallExceptionObject", IS_SERIALIZABLE,
                IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        this.createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        this.createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        final String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
        this.addAnnotation(this.eInstallExceptionObjectEDataType, source, new String[] { "baseType", "EInstallException" });
    }

} //PersconfPackageImpl
