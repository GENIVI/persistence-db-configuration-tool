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
 * <ul>
 * <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getPolicy <em>Policy</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getPermission <em>Permission</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getStorage <em>Storage</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getResponsible <em>Responsible</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getCustom_name <em>Custom name</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getCustomID <em>Custom ID</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getMax_size <em>Max size</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getType <em>Type</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getFactoryDefault <em>Factory Default</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EConfigurationImpl#getConfigDefault <em>Config Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EConfigurationImpl extends MinimalEObjectImpl.Container implements EConfiguration {
    /**
     * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getPolicy()
     * @generated
     * @ordered
     */
    protected static final EPolicy POLICY_EDEFAULT = EPolicy.NA;

    /**
     * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getPolicy()
     * @generated
     * @ordered
     */
    protected EPolicy policy = POLICY_EDEFAULT;

    /**
     * The default value of the '{@link #getPermission() <em>Permission</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getPermission()
     * @generated
     * @ordered
     */
    protected static final EPermission PERMISSION_EDEFAULT = EPermission.WO;

    /**
     * The cached value of the '{@link #getPermission() <em>Permission</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getPermission()
     * @generated
     * @ordered
     */
    protected EPermission permission = PERMISSION_EDEFAULT;

    /**
     * The default value of the '{@link #getStorage() <em>Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getStorage()
     * @generated
     * @ordered
     */
    protected static final EStorage STORAGE_EDEFAULT = EStorage.LOCAL;

    /**
     * The cached value of the '{@link #getStorage() <em>Storage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getStorage()
     * @generated
     * @ordered
     */
    protected EStorage storage = STORAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getResponsible() <em>Responsible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getResponsible()
     * @generated
     * @ordered
     */
    protected static final String RESPONSIBLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getResponsible()
     * @generated
     * @ordered
     */
    protected String responsible = RESPONSIBLE_EDEFAULT;

    /**
     * The default value of the '{@link #getCustom_name() <em>Custom name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getCustom_name()
     * @generated
     * @ordered
     */
    protected static final String CUSTOM_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCustom_name() <em>Custom name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getCustom_name()
     * @generated
     * @ordered
     */
    protected String custom_name = CUSTOM_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getCustomID() <em>Custom ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getCustomID()
     * @generated
     * @ordered
     */
    protected static final String CUSTOM_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCustomID() <em>Custom ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getCustomID()
     * @generated
     * @ordered
     */
    protected String customID = CUSTOM_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getMax_size() <em>Max size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getMax_size()
     * @generated
     * @ordered
     */
    protected static final String MAX_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMax_size() <em>Max size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getMax_size()
     * @generated
     * @ordered
     */
    protected String max_size = MAX_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final EDefaultDataType TYPE_EDEFAULT = EDefaultDataType.FILE;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getType()
     * @generated
     * @ordered
     */
    protected EDefaultDataType type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getFactoryDefault() <em>Factory Default</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getFactoryDefault()
     * @generated
     * @ordered
     */
    protected EDefaultData factoryDefault;

    /**
     * The cached value of the '{@link #getConfigDefault() <em>Config Default</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getConfigDefault()
     * @generated
     * @ordered
     */
    protected EDefaultData configDefault;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected EConfigurationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PersconfPackage.Literals.ECONFIGURATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EPolicy getPolicy() {
        return this.policy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setPolicy(final EPolicy newPolicy) {
        final EPolicy oldPolicy = this.policy;
        this.policy = newPolicy == null ? POLICY_EDEFAULT : newPolicy;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__POLICY, oldPolicy, this.policy));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EPermission getPermission() {
        return this.permission;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setPermission(final EPermission newPermission) {
        final EPermission oldPermission = this.permission;
        this.permission = newPermission == null ? PERMISSION_EDEFAULT : newPermission;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__PERMISSION, oldPermission,
                    this.permission));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EStorage getStorage() {
        return this.storage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setStorage(final EStorage newStorage) {
        final EStorage oldStorage = this.storage;
        this.storage = newStorage == null ? STORAGE_EDEFAULT : newStorage;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__STORAGE, oldStorage, this.storage));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getResponsible() {
        return this.responsible;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setResponsible(final String newResponsible) {
        final String oldResponsible = this.responsible;
        this.responsible = newResponsible;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__RESPONSIBLE, oldResponsible,
                    this.responsible));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getCustom_name() {
        return this.custom_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCustom_name(final String newCustom_name) {
        final String oldCustom_name = this.custom_name;
        this.custom_name = newCustom_name;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__CUSTOM_NAME, oldCustom_name,
                    this.custom_name));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getCustomID() {
        return this.customID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCustomID(final String newCustomID) {
        final String oldCustomID = this.customID;
        this.customID = newCustomID;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__CUSTOM_ID, oldCustomID,
                    this.customID));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getMax_size() {
        return this.max_size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMax_size(final String newMax_size) {
        final String oldMax_size = this.max_size;
        this.max_size = newMax_size;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__MAX_SIZE, oldMax_size, this.max_size));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDefaultDataType getType() {
        return this.type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setType(final EDefaultDataType newType) {
        final EDefaultDataType oldType = this.type;
        this.type = newType == null ? TYPE_EDEFAULT : newType;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__TYPE, oldType, this.type));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDefaultData getFactoryDefault() {
        return this.factoryDefault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetFactoryDefault(final EDefaultData newFactoryDefault, NotificationChain msgs) {
        final EDefaultData oldFactoryDefault = this.factoryDefault;
        this.factoryDefault = newFactoryDefault;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT, oldFactoryDefault, newFactoryDefault);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setFactoryDefault(final EDefaultData newFactoryDefault) {
        if (newFactoryDefault != this.factoryDefault) {
            NotificationChain msgs = null;
            if (this.factoryDefault != null) {
                msgs = ((InternalEObject) this.factoryDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT, null, msgs);
            }
            if (newFactoryDefault != null) {
                msgs = ((InternalEObject) newFactoryDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT, null, msgs);
            }
            msgs = this.basicSetFactoryDefault(newFactoryDefault, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT, newFactoryDefault,
                    newFactoryDefault));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EDefaultData getConfigDefault() {
        return this.configDefault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetConfigDefault(final EDefaultData newConfigDefault, NotificationChain msgs) {
        final EDefaultData oldConfigDefault = this.configDefault;
        this.configDefault = newConfigDefault;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT, oldConfigDefault, newConfigDefault);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setConfigDefault(final EDefaultData newConfigDefault) {
        if (newConfigDefault != this.configDefault) {
            NotificationChain msgs = null;
            if (this.configDefault != null) {
                msgs = ((InternalEObject) this.configDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT, null, msgs);
            }
            if (newConfigDefault != null) {
                msgs = ((InternalEObject) newConfigDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT, null, msgs);
            }
            msgs = this.basicSetConfigDefault(newConfigDefault, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT, newConfigDefault,
                    newConfigDefault));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
        case PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT:
            return this.basicSetFactoryDefault(null, msgs);
        case PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT:
            return this.basicSetConfigDefault(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case PersconfPackage.ECONFIGURATION__POLICY:
            return this.getPolicy();
        case PersconfPackage.ECONFIGURATION__PERMISSION:
            return this.getPermission();
        case PersconfPackage.ECONFIGURATION__STORAGE:
            return this.getStorage();
        case PersconfPackage.ECONFIGURATION__RESPONSIBLE:
            return this.getResponsible();
        case PersconfPackage.ECONFIGURATION__CUSTOM_NAME:
            return this.getCustom_name();
        case PersconfPackage.ECONFIGURATION__CUSTOM_ID:
            return this.getCustomID();
        case PersconfPackage.ECONFIGURATION__MAX_SIZE:
            return this.getMax_size();
        case PersconfPackage.ECONFIGURATION__TYPE:
            return this.getType();
        case PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT:
            return this.getFactoryDefault();
        case PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT:
            return this.getConfigDefault();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case PersconfPackage.ECONFIGURATION__POLICY:
            this.setPolicy((EPolicy) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__PERMISSION:
            this.setPermission((EPermission) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__STORAGE:
            this.setStorage((EStorage) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__RESPONSIBLE:
            this.setResponsible((String) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__CUSTOM_NAME:
            this.setCustom_name((String) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__CUSTOM_ID:
            this.setCustomID((String) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__MAX_SIZE:
            this.setMax_size((String) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__TYPE:
            this.setType((EDefaultDataType) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT:
            this.setFactoryDefault((EDefaultData) newValue);
            return;
        case PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT:
            this.setConfigDefault((EDefaultData) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case PersconfPackage.ECONFIGURATION__POLICY:
            this.setPolicy(POLICY_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__PERMISSION:
            this.setPermission(PERMISSION_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__STORAGE:
            this.setStorage(STORAGE_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__RESPONSIBLE:
            this.setResponsible(RESPONSIBLE_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__CUSTOM_NAME:
            this.setCustom_name(CUSTOM_NAME_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__CUSTOM_ID:
            this.setCustomID(CUSTOM_ID_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__MAX_SIZE:
            this.setMax_size(MAX_SIZE_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__TYPE:
            this.setType(TYPE_EDEFAULT);
            return;
        case PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT:
            this.setFactoryDefault((EDefaultData) null);
            return;
        case PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT:
            this.setConfigDefault((EDefaultData) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case PersconfPackage.ECONFIGURATION__POLICY:
            return this.policy != POLICY_EDEFAULT;
        case PersconfPackage.ECONFIGURATION__PERMISSION:
            return this.permission != PERMISSION_EDEFAULT;
        case PersconfPackage.ECONFIGURATION__STORAGE:
            return this.storage != STORAGE_EDEFAULT;
        case PersconfPackage.ECONFIGURATION__RESPONSIBLE:
            return RESPONSIBLE_EDEFAULT == null ? this.responsible != null : !RESPONSIBLE_EDEFAULT.equals(this.responsible);
        case PersconfPackage.ECONFIGURATION__CUSTOM_NAME:
            return CUSTOM_NAME_EDEFAULT == null ? this.custom_name != null : !CUSTOM_NAME_EDEFAULT.equals(this.custom_name);
        case PersconfPackage.ECONFIGURATION__CUSTOM_ID:
            return CUSTOM_ID_EDEFAULT == null ? this.customID != null : !CUSTOM_ID_EDEFAULT.equals(this.customID);
        case PersconfPackage.ECONFIGURATION__MAX_SIZE:
            return MAX_SIZE_EDEFAULT == null ? this.max_size != null : !MAX_SIZE_EDEFAULT.equals(this.max_size);
        case PersconfPackage.ECONFIGURATION__TYPE:
            return this.type != TYPE_EDEFAULT;
        case PersconfPackage.ECONFIGURATION__FACTORY_DEFAULT:
            return this.factoryDefault != null;
        case PersconfPackage.ECONFIGURATION__CONFIG_DEFAULT:
            return this.configDefault != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (policy: ");
        result.append(this.policy);
        result.append(", permission: ");
        result.append(this.permission);
        result.append(", storage: ");
        result.append(this.storage);
        result.append(", responsible: ");
        result.append(this.responsible);
        result.append(", custom_name: ");
        result.append(this.custom_name);
        result.append(", customID: ");
        result.append(this.customID);
        result.append(", max_size: ");
        result.append(this.max_size);
        result.append(", type: ");
        result.append(this.type);
        result.append(')');
        return result.toString();
    }

} //EConfigurationImpl
