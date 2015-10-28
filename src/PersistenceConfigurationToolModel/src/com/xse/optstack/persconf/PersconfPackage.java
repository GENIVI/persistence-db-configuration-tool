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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see com.xse.optstack.persconf.PersconfFactory
 * @model kind="package"
 * @generated
 */
public interface PersconfPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNAME = "persconf";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_URI = "http://com/xse/optstack/persconf";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_PREFIX = "com.xse.optstack.persconf";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    PersconfPackage eINSTANCE = com.xse.optstack.persconf.impl.PersconfPackageImpl.init();

    /**
     * The meta object id for the '{@link com.xse.optstack.persconf.impl.EApplicationImpl <em>EApplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see com.xse.optstack.persconf.impl.EApplicationImpl
     * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEApplication()
     * @generated
     */
    int EAPPLICATION = 1;

    /**
     * The meta object id for the '{@link com.xse.optstack.persconf.impl.EConfigurationImpl <em>EConfiguration</em>}'
     * class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see com.xse.optstack.persconf.impl.EConfigurationImpl
     * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEConfiguration()
     * @generated
     */
    int ECONFIGURATION = 2;

    /**
     * The meta object id for the '{@link com.xse.optstack.persconf.impl.EDefaultDataImpl <em>EDefault Data</em>}'
     * class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see com.xse.optstack.persconf.impl.EDefaultDataImpl
     * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEDefaultData()
     * @generated
     */
    int EDEFAULT_DATA = 3;

    /**
     * The meta object id for the '{@link com.xse.optstack.persconf.EGroupType <em>EGroup Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see com.xse.optstack.persconf.EGroupType
     * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEGroupType()
     * @generated
     */
    int EGROUP_TYPE = 5;

    /**
     * The meta object id for the '{@link com.xse.optstack.persconf.impl.EApplicationGroupImpl
     * <em>EApplication Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see com.xse.optstack.persconf.impl.EApplicationGroupImpl
     * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEApplicationGroup()
     * @generated
     */
    int EAPPLICATION_GROUP = 0;

    /**
     * The feature id for the '<em><b>Applications</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EAPPLICATION_GROUP__APPLICATIONS = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EAPPLICATION_GROUP__TYPE = 1;

    /**
     * The number of structural features of the '<em>EApplication Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EAPPLICATION_GROUP_FEATURE_COUNT = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EAPPLICATION__NAME = 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EAPPLICATION__VERSION = 1;

    /**
     * The feature id for the '<em><b>Resources</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EAPPLICATION__RESOURCES = 2;

    /**
     * The feature id for the '<em><b>Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EAPPLICATION__GROUP = 3;

    /**
     * The feature id for the '<em><b>Install Rule</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EAPPLICATION__INSTALL_RULE = 4;

    /**
     * The feature id for the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EAPPLICATION__SIZE = 5;

    /**
     * The number of structural features of the '<em>EApplication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EAPPLICATION_FEATURE_COUNT = 6;

    /**
     * The feature id for the '<em><b>Policy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ECONFIGURATION__POLICY = 0;

    /**
     * The feature id for the '<em><b>Permission</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ECONFIGURATION__PERMISSION = 1;

    /**
     * The feature id for the '<em><b>Storage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ECONFIGURATION__STORAGE = 2;

    /**
     * The feature id for the '<em><b>Responsible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ECONFIGURATION__RESPONSIBLE = 3;

    /**
     * The feature id for the '<em><b>Custom name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ECONFIGURATION__CUSTOM_NAME = 4;

    /**
     * The feature id for the '<em><b>Custom ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ECONFIGURATION__CUSTOM_ID = 5;

    /**
     * The feature id for the '<em><b>Max size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ECONFIGURATION__MAX_SIZE = 6;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ECONFIGURATION__TYPE = 7;

    /**
     * The feature id for the '<em><b>Factory Default</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ECONFIGURATION__FACTORY_DEFAULT = 8;

    /**
     * The feature id for the '<em><b>Config Default</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ECONFIGURATION__CONFIG_DEFAULT = 9;

    /**
     * The number of structural features of the '<em>EConfiguration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ECONFIGURATION_FEATURE_COUNT = 10;

    /**
     * The feature id for the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EDEFAULT_DATA__SIZE = 0;

    /**
     * The feature id for the '<em><b>Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EDEFAULT_DATA__DATA = 1;

    /**
     * The feature id for the '<em><b>Local Resource Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EDEFAULT_DATA__LOCAL_RESOURCE_PATH = 2;

    /**
     * The number of structural features of the '<em>EDefault Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int EDEFAULT_DATA_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link com.xse.optstack.persconf.impl.EResourceImpl <em>EResource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see com.xse.optstack.persconf.impl.EResourceImpl
     * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEResource()
     * @generated
     */
    int ERESOURCE = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ERESOURCE__NAME = 0;

    /**
     * The feature id for the '<em><b>Configuration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ERESOURCE__CONFIGURATION = 1;

    /**
     * The feature id for the '<em><b>Install Exception</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ERESOURCE__INSTALL_EXCEPTION = 2;

    /**
     * The number of structural features of the '<em>EResource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ERESOURCE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link com.xse.optstack.persconf.EPolicy <em>EPolicy</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see com.xse.optstack.persconf.EPolicy
     * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEPolicy()
     * @generated
     */
    int EPOLICY = 6;

    /**
     * The meta object id for the '{@link com.xse.optstack.persconf.EPermission <em>EPermission</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see com.xse.optstack.persconf.EPermission
     * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEPermission()
     * @generated
     */
    int EPERMISSION = 7;

    /**
     * The meta object id for the '{@link com.xse.optstack.persconf.EStorage <em>EStorage</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see com.xse.optstack.persconf.EStorage
     * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEStorage()
     * @generated
     */
    int ESTORAGE = 8;

    /**
     * The meta object id for the '{@link com.xse.optstack.persconf.EInstallRule <em>EInstall Rule</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see com.xse.optstack.persconf.EInstallRule
     * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEInstallRule()
     * @generated
     */
    int EINSTALL_RULE = 9;

    /**
     * The meta object id for the '{@link com.xse.optstack.persconf.EInstallException <em>EInstall Exception</em>}'
     * enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see com.xse.optstack.persconf.EInstallException
     * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEInstallException()
     * @generated
     */
    int EINSTALL_EXCEPTION = 10;

    /**
     * The meta object id for the '{@link com.xse.optstack.persconf.EDefaultDataType <em>EDefault Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see com.xse.optstack.persconf.EDefaultDataType
     * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEDefaultDataType()
     * @generated
     */
    int EDEFAULT_DATA_TYPE = 11;

    /**
     * The meta object id for the '<em>EInstall Exception Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see com.xse.optstack.persconf.EInstallException
     * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEInstallExceptionObject()
     * @generated
     */
    int EINSTALL_EXCEPTION_OBJECT = 12;

    /**
     * Returns the meta object for class '{@link com.xse.optstack.persconf.EApplication <em>EApplication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>EApplication</em>'.
     * @see com.xse.optstack.persconf.EApplication
     * @generated
     */
    EClass getEApplication();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EApplication#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see com.xse.optstack.persconf.EApplication#getName()
     * @see #getEApplication()
     * @generated
     */
    EAttribute getEApplication_Name();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EApplication#getVersion
     * <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see com.xse.optstack.persconf.EApplication#getVersion()
     * @see #getEApplication()
     * @generated
     */
    EAttribute getEApplication_Version();

    /**
     * Returns the meta object for the containment reference list '
     * {@link com.xse.optstack.persconf.EApplication#getResources <em>Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Resources</em>'.
     * @see com.xse.optstack.persconf.EApplication#getResources()
     * @see #getEApplication()
     * @generated
     */
    EReference getEApplication_Resources();

    /**
     * Returns the meta object for the container reference '{@link com.xse.optstack.persconf.EApplication#getGroup
     * <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the container reference '<em>Group</em>'.
     * @see com.xse.optstack.persconf.EApplication#getGroup()
     * @see #getEApplication()
     * @generated
     */
    EReference getEApplication_Group();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EApplication#getInstallRule
     * <em>Install Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Install Rule</em>'.
     * @see com.xse.optstack.persconf.EApplication#getInstallRule()
     * @see #getEApplication()
     * @generated
     */
    EAttribute getEApplication_InstallRule();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EApplication#getSize <em>Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Size</em>'.
     * @see com.xse.optstack.persconf.EApplication#getSize()
     * @see #getEApplication()
     * @generated
     */
    EAttribute getEApplication_Size();

    /**
     * Returns the meta object for class '{@link com.xse.optstack.persconf.EConfiguration <em>EConfiguration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>EConfiguration</em>'.
     * @see com.xse.optstack.persconf.EConfiguration
     * @generated
     */
    EClass getEConfiguration();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EConfiguration#getPolicy
     * <em>Policy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Policy</em>'.
     * @see com.xse.optstack.persconf.EConfiguration#getPolicy()
     * @see #getEConfiguration()
     * @generated
     */
    EAttribute getEConfiguration_Policy();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EConfiguration#getPermission
     * <em>Permission</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Permission</em>'.
     * @see com.xse.optstack.persconf.EConfiguration#getPermission()
     * @see #getEConfiguration()
     * @generated
     */
    EAttribute getEConfiguration_Permission();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EConfiguration#getStorage
     * <em>Storage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Storage</em>'.
     * @see com.xse.optstack.persconf.EConfiguration#getStorage()
     * @see #getEConfiguration()
     * @generated
     */
    EAttribute getEConfiguration_Storage();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EConfiguration#getResponsible
     * <em>Responsible</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Responsible</em>'.
     * @see com.xse.optstack.persconf.EConfiguration#getResponsible()
     * @see #getEConfiguration()
     * @generated
     */
    EAttribute getEConfiguration_Responsible();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EConfiguration#getCustom_name
     * <em>Custom name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Custom name</em>'.
     * @see com.xse.optstack.persconf.EConfiguration#getCustom_name()
     * @see #getEConfiguration()
     * @generated
     */
    EAttribute getEConfiguration_Custom_name();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EConfiguration#getCustomID
     * <em>Custom ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Custom ID</em>'.
     * @see com.xse.optstack.persconf.EConfiguration#getCustomID()
     * @see #getEConfiguration()
     * @generated
     */
    EAttribute getEConfiguration_CustomID();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EConfiguration#getMax_size
     * <em>Max size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Max size</em>'.
     * @see com.xse.optstack.persconf.EConfiguration#getMax_size()
     * @see #getEConfiguration()
     * @generated
     */
    EAttribute getEConfiguration_Max_size();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EConfiguration#getType <em>Type</em>}
     * '.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see com.xse.optstack.persconf.EConfiguration#getType()
     * @see #getEConfiguration()
     * @generated
     */
    EAttribute getEConfiguration_Type();

    /**
     * Returns the meta object for the containment reference '
     * {@link com.xse.optstack.persconf.EConfiguration#getFactoryDefault <em>Factory Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Factory Default</em>'.
     * @see com.xse.optstack.persconf.EConfiguration#getFactoryDefault()
     * @see #getEConfiguration()
     * @generated
     */
    EReference getEConfiguration_FactoryDefault();

    /**
     * Returns the meta object for the containment reference '
     * {@link com.xse.optstack.persconf.EConfiguration#getConfigDefault <em>Config Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Config Default</em>'.
     * @see com.xse.optstack.persconf.EConfiguration#getConfigDefault()
     * @see #getEConfiguration()
     * @generated
     */
    EReference getEConfiguration_ConfigDefault();

    /**
     * Returns the meta object for class '{@link com.xse.optstack.persconf.EDefaultData <em>EDefault Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>EDefault Data</em>'.
     * @see com.xse.optstack.persconf.EDefaultData
     * @generated
     */
    EClass getEDefaultData();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EDefaultData#getSize <em>Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Size</em>'.
     * @see com.xse.optstack.persconf.EDefaultData#getSize()
     * @see #getEDefaultData()
     * @generated
     */
    EAttribute getEDefaultData_Size();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EDefaultData#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Data</em>'.
     * @see com.xse.optstack.persconf.EDefaultData#getData()
     * @see #getEDefaultData()
     * @generated
     */
    EAttribute getEDefaultData_Data();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EDefaultData#getLocalResourcePath
     * <em>Local Resource Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Local Resource Path</em>'.
     * @see com.xse.optstack.persconf.EDefaultData#getLocalResourcePath()
     * @see #getEDefaultData()
     * @generated
     */
    EAttribute getEDefaultData_LocalResourcePath();

    /**
     * Returns the meta object for class '{@link com.xse.optstack.persconf.EResource <em>EResource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>EResource</em>'.
     * @see com.xse.optstack.persconf.EResource
     * @generated
     */
    EClass getEResource();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EResource#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see com.xse.optstack.persconf.EResource#getName()
     * @see #getEResource()
     * @generated
     */
    EAttribute getEResource_Name();

    /**
     * Returns the meta object for the reference '{@link com.xse.optstack.persconf.EResource#getConfiguration
     * <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Configuration</em>'.
     * @see com.xse.optstack.persconf.EResource#getConfiguration()
     * @see #getEResource()
     * @generated
     */
    EReference getEResource_Configuration();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EResource#getInstallException
     * <em>Install Exception</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Install Exception</em>'.
     * @see com.xse.optstack.persconf.EResource#getInstallException()
     * @see #getEResource()
     * @generated
     */
    EAttribute getEResource_InstallException();

    /**
     * Returns the meta object for enum '{@link com.xse.optstack.persconf.EGroupType <em>EGroup Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for enum '<em>EGroup Type</em>'.
     * @see com.xse.optstack.persconf.EGroupType
     * @generated
     */
    EEnum getEGroupType();

    /**
     * Returns the meta object for class '{@link com.xse.optstack.persconf.EApplicationGroup
     * <em>EApplication Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>EApplication Group</em>'.
     * @see com.xse.optstack.persconf.EApplicationGroup
     * @generated
     */
    EClass getEApplicationGroup();

    /**
     * Returns the meta object for the containment reference list '
     * {@link com.xse.optstack.persconf.EApplicationGroup#getApplications <em>Applications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Applications</em>'.
     * @see com.xse.optstack.persconf.EApplicationGroup#getApplications()
     * @see #getEApplicationGroup()
     * @generated
     */
    EReference getEApplicationGroup_Applications();

    /**
     * Returns the meta object for the attribute '{@link com.xse.optstack.persconf.EApplicationGroup#getType
     * <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see com.xse.optstack.persconf.EApplicationGroup#getType()
     * @see #getEApplicationGroup()
     * @generated
     */
    EAttribute getEApplicationGroup_Type();

    /**
     * Returns the meta object for enum '{@link com.xse.optstack.persconf.EPolicy <em>EPolicy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for enum '<em>EPolicy</em>'.
     * @see com.xse.optstack.persconf.EPolicy
     * @generated
     */
    EEnum getEPolicy();

    /**
     * Returns the meta object for enum '{@link com.xse.optstack.persconf.EPermission <em>EPermission</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for enum '<em>EPermission</em>'.
     * @see com.xse.optstack.persconf.EPermission
     * @generated
     */
    EEnum getEPermission();

    /**
     * Returns the meta object for enum '{@link com.xse.optstack.persconf.EStorage <em>EStorage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for enum '<em>EStorage</em>'.
     * @see com.xse.optstack.persconf.EStorage
     * @generated
     */
    EEnum getEStorage();

    /**
     * Returns the meta object for enum '{@link com.xse.optstack.persconf.EInstallRule <em>EInstall Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for enum '<em>EInstall Rule</em>'.
     * @see com.xse.optstack.persconf.EInstallRule
     * @generated
     */
    EEnum getEInstallRule();

    /**
     * Returns the meta object for enum '{@link com.xse.optstack.persconf.EInstallException <em>EInstall Exception</em>}
     * '.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for enum '<em>EInstall Exception</em>'.
     * @see com.xse.optstack.persconf.EInstallException
     * @generated
     */
    EEnum getEInstallException();

    /**
     * Returns the meta object for enum '{@link com.xse.optstack.persconf.EDefaultDataType <em>EDefault Data Type</em>}
     * '.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for enum '<em>EDefault Data Type</em>'.
     * @see com.xse.optstack.persconf.EDefaultDataType
     * @generated
     */
    EEnum getEDefaultDataType();

    /**
     * Returns the meta object for data type '{@link com.xse.optstack.persconf.EInstallException
     * <em>EInstall Exception Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the meta object for data type '<em>EInstall Exception Object</em>'.
     * @see com.xse.optstack.persconf.EInstallException
     * @model instanceClass="com.xse.optstack.persconf.EInstallException"
     *        extendedMetaData="baseType='EInstallException'"
     * @generated
     */
    EDataType getEInstallExceptionObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    PersconfFactory getPersconfFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link com.xse.optstack.persconf.impl.EApplicationImpl
         * <em>EApplication</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see com.xse.optstack.persconf.impl.EApplicationImpl
         * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEApplication()
         * @generated
         */
        EClass EAPPLICATION = eINSTANCE.getEApplication();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute EAPPLICATION__NAME = eINSTANCE.getEApplication_Name();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute EAPPLICATION__VERSION = eINSTANCE.getEApplication_Version();

        /**
         * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference EAPPLICATION__RESOURCES = eINSTANCE.getEApplication_Resources();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference EAPPLICATION__GROUP = eINSTANCE.getEApplication_Group();

        /**
         * The meta object literal for the '<em><b>Install Rule</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute EAPPLICATION__INSTALL_RULE = eINSTANCE.getEApplication_InstallRule();

        /**
         * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute EAPPLICATION__SIZE = eINSTANCE.getEApplication_Size();

        /**
         * The meta object literal for the '{@link com.xse.optstack.persconf.impl.EConfigurationImpl
         * <em>EConfiguration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see com.xse.optstack.persconf.impl.EConfigurationImpl
         * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEConfiguration()
         * @generated
         */
        EClass ECONFIGURATION = eINSTANCE.getEConfiguration();

        /**
         * The meta object literal for the '<em><b>Policy</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute ECONFIGURATION__POLICY = eINSTANCE.getEConfiguration_Policy();

        /**
         * The meta object literal for the '<em><b>Permission</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute ECONFIGURATION__PERMISSION = eINSTANCE.getEConfiguration_Permission();

        /**
         * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute ECONFIGURATION__STORAGE = eINSTANCE.getEConfiguration_Storage();

        /**
         * The meta object literal for the '<em><b>Responsible</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute ECONFIGURATION__RESPONSIBLE = eINSTANCE.getEConfiguration_Responsible();

        /**
         * The meta object literal for the '<em><b>Custom name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute ECONFIGURATION__CUSTOM_NAME = eINSTANCE.getEConfiguration_Custom_name();

        /**
         * The meta object literal for the '<em><b>Custom ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute ECONFIGURATION__CUSTOM_ID = eINSTANCE.getEConfiguration_CustomID();

        /**
         * The meta object literal for the '<em><b>Max size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute ECONFIGURATION__MAX_SIZE = eINSTANCE.getEConfiguration_Max_size();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute ECONFIGURATION__TYPE = eINSTANCE.getEConfiguration_Type();

        /**
         * The meta object literal for the '<em><b>Factory Default</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference ECONFIGURATION__FACTORY_DEFAULT = eINSTANCE.getEConfiguration_FactoryDefault();

        /**
         * The meta object literal for the '<em><b>Config Default</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference ECONFIGURATION__CONFIG_DEFAULT = eINSTANCE.getEConfiguration_ConfigDefault();

        /**
         * The meta object literal for the '{@link com.xse.optstack.persconf.impl.EDefaultDataImpl
         * <em>EDefault Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see com.xse.optstack.persconf.impl.EDefaultDataImpl
         * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEDefaultData()
         * @generated
         */
        EClass EDEFAULT_DATA = eINSTANCE.getEDefaultData();

        /**
         * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute EDEFAULT_DATA__SIZE = eINSTANCE.getEDefaultData_Size();

        /**
         * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute EDEFAULT_DATA__DATA = eINSTANCE.getEDefaultData_Data();

        /**
         * The meta object literal for the '<em><b>Local Resource Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute EDEFAULT_DATA__LOCAL_RESOURCE_PATH = eINSTANCE.getEDefaultData_LocalResourcePath();

        /**
         * The meta object literal for the '{@link com.xse.optstack.persconf.impl.EResourceImpl <em>EResource</em>}'
         * class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see com.xse.optstack.persconf.impl.EResourceImpl
         * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEResource()
         * @generated
         */
        EClass ERESOURCE = eINSTANCE.getEResource();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute ERESOURCE__NAME = eINSTANCE.getEResource_Name();

        /**
         * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference ERESOURCE__CONFIGURATION = eINSTANCE.getEResource_Configuration();

        /**
         * The meta object literal for the '<em><b>Install Exception</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute ERESOURCE__INSTALL_EXCEPTION = eINSTANCE.getEResource_InstallException();

        /**
         * The meta object literal for the '{@link com.xse.optstack.persconf.EGroupType <em>EGroup Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see com.xse.optstack.persconf.EGroupType
         * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEGroupType()
         * @generated
         */
        EEnum EGROUP_TYPE = eINSTANCE.getEGroupType();

        /**
         * The meta object literal for the '{@link com.xse.optstack.persconf.impl.EApplicationGroupImpl
         * <em>EApplication Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see com.xse.optstack.persconf.impl.EApplicationGroupImpl
         * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEApplicationGroup()
         * @generated
         */
        EClass EAPPLICATION_GROUP = eINSTANCE.getEApplicationGroup();

        /**
         * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference EAPPLICATION_GROUP__APPLICATIONS = eINSTANCE.getEApplicationGroup_Applications();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute EAPPLICATION_GROUP__TYPE = eINSTANCE.getEApplicationGroup_Type();

        /**
         * The meta object literal for the '{@link com.xse.optstack.persconf.EPolicy <em>EPolicy</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see com.xse.optstack.persconf.EPolicy
         * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEPolicy()
         * @generated
         */
        EEnum EPOLICY = eINSTANCE.getEPolicy();

        /**
         * The meta object literal for the '{@link com.xse.optstack.persconf.EPermission <em>EPermission</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see com.xse.optstack.persconf.EPermission
         * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEPermission()
         * @generated
         */
        EEnum EPERMISSION = eINSTANCE.getEPermission();

        /**
         * The meta object literal for the '{@link com.xse.optstack.persconf.EStorage <em>EStorage</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see com.xse.optstack.persconf.EStorage
         * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEStorage()
         * @generated
         */
        EEnum ESTORAGE = eINSTANCE.getEStorage();

        /**
         * The meta object literal for the '{@link com.xse.optstack.persconf.EInstallRule <em>EInstall Rule</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see com.xse.optstack.persconf.EInstallRule
         * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEInstallRule()
         * @generated
         */
        EEnum EINSTALL_RULE = eINSTANCE.getEInstallRule();

        /**
         * The meta object literal for the '{@link com.xse.optstack.persconf.EInstallException
         * <em>EInstall Exception</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see com.xse.optstack.persconf.EInstallException
         * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEInstallException()
         * @generated
         */
        EEnum EINSTALL_EXCEPTION = eINSTANCE.getEInstallException();

        /**
         * The meta object literal for the '{@link com.xse.optstack.persconf.EDefaultDataType
         * <em>EDefault Data Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see com.xse.optstack.persconf.EDefaultDataType
         * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEDefaultDataType()
         * @generated
         */
        EEnum EDEFAULT_DATA_TYPE = eINSTANCE.getEDefaultDataType();

        /**
         * The meta object literal for the '<em>EInstall Exception Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see com.xse.optstack.persconf.EInstallException
         * @see com.xse.optstack.persconf.impl.PersconfPackageImpl#getEInstallExceptionObject()
         * @generated
         */
        EDataType EINSTALL_EXCEPTION_OBJECT = eINSTANCE.getEInstallExceptionObject();

    }

} //PersconfPackage
