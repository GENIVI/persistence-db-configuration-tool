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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.xse.optstack.persconf.EConfiguration;
import com.xse.optstack.persconf.EDefaultData;
import com.xse.optstack.persconf.EDefaultDataType;
import com.xse.optstack.persconf.EPermission;
import com.xse.optstack.persconf.EPolicy;
import com.xse.optstack.persconf.EStorage;
import com.xse.optstack.persconf.PersconfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EConfiguration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getCustom_name <em>Custom name</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getCustomID <em>Custom ID</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getMax_size <em>Max size</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getFactoryDefault <em>Factory Default</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getConfigDefault <em>Config Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EConfigurationImpl extends MinimalEObjectImpl.Container implements EConfiguration {
    /**
     * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPolicy()
     * @generated
     * @ordered
     */
    protected static final EPolicy POLICY_EDEFAULT = EPolicy.NA;

    /**
     * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPolicy()
     * @generated
     * @ordered
     */
    protected EPolicy policy = POLICY_EDEFAULT;

    /**
     * The default value of the '{@link #getPermission() <em>Permission</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPermission()
     * @generated
     * @ordered
     */
    protected static final EPermission PERMISSION_EDEFAULT = EPermission.WO;

    /**
     * The cached value of the '{@link #getPermission() <em>Permission</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPermission()
     * @generated
     * @ordered
     */
    protected EPermission permission = PERMISSION_EDEFAULT;

    /**
     * The default value of the '{@link #getStorage() <em>Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStorage()
     * @generated
     * @ordered
     */
    protected static final EStorage STORAGE_EDEFAULT = EStorage.LOCAL;

    /**
     * The cached value of the '{@link #getStorage() <em>Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStorage()
     * @generated
     * @ordered
     */
    protected EStorage storage = STORAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getResponsible() <em>Responsible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResponsible()
     * @generated
     * @ordered
     */
    protected static final String RESPONSIBLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResponsible()
     * @generated
     * @ordered
     */
    protected String responsible = RESPONSIBLE_EDEFAULT;

    /**
     * The default value of the '{@link #getCustom_name() <em>Custom name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustom_name()
     * @generated
     * @ordered
     */
    protected static final String CUSTOM_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCustom_name() <em>Custom name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustom_name()
     * @generated
     * @ordered
     */
    protected String custom_name = CUSTOM_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getCustomID() <em>Custom ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomID()
     * @generated
     * @ordered
     */
    protected static final String CUSTOM_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCustomID() <em>Custom ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomID()
     * @generated
     * @ordered
     */
    protected String customID = CUSTOM_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getMax_size() <em>Max size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax_size()
     * @generated
     * @ordered
     */
    protected static final String MAX_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMax_size() <em>Max size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax_size()
     * @generated
     * @ordered
     */
    protected String max_size = MAX_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final EDefaultDataType TYPE_EDEFAULT = EDefaultDataType.NA;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected EDefaultDataType type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getFactoryDefault() <em>Factory Default</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFactoryDefault()
     * @generated
     * @ordered
     */
    protected EDefaultData factoryDefault;

    /**
     * The cached value of the '{@link #getConfigDefault() <em>Config Default</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigDefault()
     * @generated
     * @ordered
     */
    protected EDefaultData configDefault;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EConfigurationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PersconfPackage.Literals.ECONFIGURATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EPolicy getPolicy() {
        return policy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPolicy(EPolicy newPolicy) {
        EPolicy oldPolicy = policy;
        policy = newPolicy == null ? POLICY_EDEFAULT : newPolicy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__POLICY, oldPolicy,
                    policy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EPermission getPermission() {
        return permission;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPermission(EPermission newPermission) {
        EPermission oldPermission = permission;
        permission = newPermission == null ? PERMISSION_EDEFAULT : newPermission;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__PERMISSION,
                    oldPermission, permission));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EStorage getStorage() {
        return storage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStorage(EStorage newStorage) {
        EStorage oldStorage = storage;
        storage = newStorage == null ? STORAGE_EDEFAULT : newStorage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__STORAGE, oldStorage,
                    storage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getResponsible() {
        return responsible;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResponsible(String newResponsible) {
        String oldResponsible = responsible;
        responsible = newResponsible;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__RESPONSIBLE,
                    oldResponsible, responsible));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCustom_name() {
        return custom_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCustom_name(String newCustom_name) {
        String oldCustom_name = custom_name;
        custom_name = newCustom_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__CUSTOM_NAME,
                    oldCustom_name, custom_name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCustomID() {
        return customID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCustomID(String newCustomID) {
        String oldCustomID = customID;
        customID = newCustomID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__CUSTOM_ID,
                    oldCustomID, customID));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMax_size() {
        return max_size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMax_size(String newMax_size) {
        String oldMax_size = max_size;
        max_size = newMax_size;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__MAX_SIZE, oldMax_size,
                    max_size));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDefaultDataType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType(EDefaultDataType newType) {
        EDefaultDataType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDefaultData getFactoryDefault() {
        return factoryDefault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFactoryDefault(EDefaultData newFactoryDefault, NotificationChain msgs) {
        EDefaultData oldFactoryDefault = factoryDefault;
        factoryDefault = newFactoryDefault;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT, oldFactoryDefault, newFactoryDefault);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFactoryDefault(EDefaultData newFactoryDefault) {
        if (newFactoryDefault != factoryDefault) {
            NotificationChain msgs = null;
            if (factoryDefault != null)
                msgs = ((InternalEObject) factoryDefault).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT, null, msgs);
            if (newFactoryDefault != null)
                msgs = ((InternalEObject) newFactoryDefault).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT, null, msgs);
            msgs = basicSetFactoryDefault(newFactoryDefault, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT,
                    newFactoryDefault, newFactoryDefault));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDefaultData getConfigDefault() {
        return configDefault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConfigDefault(EDefaultData newConfigDefault, NotificationChain msgs) {
        EDefaultData oldConfigDefault = configDefault;
        configDefault = newConfigDefault;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT, oldConfigDefault, newConfigDefault);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConfigDefault(EDefaultData newConfigDefault) {
        if (newConfigDefault != configDefault) {
            NotificationChain msgs = null;
            if (configDefault != null)
                msgs = ((InternalEObject) configDefault).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT, null, msgs);
            if (newConfigDefault != null)
                msgs = ((InternalEObject) newConfigDefault).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT, null, msgs);
            msgs = basicSetConfigDefault(newConfigDefault, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT,
                    newConfigDefault, newConfigDefault));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT:
            return basicSetFactoryDefault(null, msgs);
        case PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT:
            return basicSetConfigDefault(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case PersconfPackage.ECONFIGURATION__POLICY:
            return getPolicy();
        case PersconfPackage.ECONFIGURATION__PERMISSION:
            return getPermission();
        case PersconfPackage.ECONFIGURATION__STORAGE:
            return getStorage();
        case PersconfPackage.ECONFIGURATION__RESPONSIBLE:
            return getResponsible();
        case PersconfPackage.ECONFIGURATION__CUSTOM_NAME:
            return getCustom_name();
        case PersconfPackage.ECONFIGURATION__CUSTOM_ID:
            return getCustomID();
        case PersconfPackage.ECONFIGURATION__MAX_SIZE:
            return getMax_size();
        case PersconfPackage.ECONFIGURATION__TYPE:
            return getType();
        case PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT:
            return getFactoryDefault();
        case PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT:
            return getConfigDefault();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case PersconfPackage.ECONFIGURATION__POLICY:
            setPolicy((EPolicy) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__PERMISSION:
            setPermission((EPermission) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__STORAGE:
            setStorage((EStorage) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__RESPONSIBLE:
            setResponsible((String) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__CUSTOM_NAME:
            setCustom_name((String) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__CUSTOM_ID:
            setCustomID((String) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__MAX_SIZE:
            setMax_size((String) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__TYPE:
            setType((EDefaultDataType) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT:
            setFactoryDefault((EDefaultData) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT:
            setConfigDefault((EDefaultData) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case PersconfPackage.ECONFIGURATION__POLICY:
            setPolicy(POLICY_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__PERMISSION:
            setPermission(PERMISSION_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__STORAGE:
            setStorage(STORAGE_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__RESPONSIBLE:
            setResponsible(RESPONSIBLE_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__CUSTOM_NAME:
            setCustom_name(CUSTOM_NAME_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__CUSTOM_ID:
            setCustomID(CUSTOM_ID_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__MAX_SIZE:
            setMax_size(MAX_SIZE_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT:
            setFactoryDefault((EDefaultData) null);
            return;
        case PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT:
            setConfigDefault((EDefaultData) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case PersconfPackage.ECONFIGURATION__POLICY:
            return policy != POLICY_EDEFAULT;
        case PersconfPackage.ECONFIGURATION__PERMISSION:
            return permission != PERMISSION_EDEFAULT;
        case PersconfPackage.ECONFIGURATION__STORAGE:
            return storage != STORAGE_EDEFAULT;
        case PersconfPackage.ECONFIGURATION__RESPONSIBLE:
            return RESPONSIBLE_EDEFAULT == null ? responsible != null : !RESPONSIBLE_EDEFAULT.equals(responsible);
        case PersconfPackage.ECONFIGURATION__CUSTOM_NAME:
            return CUSTOM_NAME_EDEFAULT == null ? custom_name != null : !CUSTOM_NAME_EDEFAULT.equals(custom_name);
        case PersconfPackage.ECONFIGURATION__CUSTOM_ID:
            return CUSTOM_ID_EDEFAULT == null ? customID != null : !CUSTOM_ID_EDEFAULT.equals(customID);
        case PersconfPackage.ECONFIGURATION__MAX_SIZE:
            return MAX_SIZE_EDEFAULT == null ? max_size != null : !MAX_SIZE_EDEFAULT.equals(max_size);
        case PersconfPackage.ECONFIGURATION__TYPE:
            return type != TYPE_EDEFAULT;
        case PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT:
            return factoryDefault != null;
        case PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT:
            return configDefault != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (policy: ");
        result.append(policy);
        result.append(", permission: ");
        result.append(permission);
        result.append(", storage: ");
        result.append(storage);
        result.append(", responsible: ");
        result.append(responsible);
        result.append(", custom_name: ");
        result.append(custom_name);
        result.append(", customID: ");
        result.append(customID);
        result.append(", max_size: ");
        result.append(max_size);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //EConfigurationImpl
