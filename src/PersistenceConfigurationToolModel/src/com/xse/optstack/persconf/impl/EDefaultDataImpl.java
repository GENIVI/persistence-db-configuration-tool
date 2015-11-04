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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.xse.optstack.persconf.EDefaultData;
import com.xse.optstack.persconf.PersconfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDefault Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.xse.optstack.persconf.impl.EDefaultDataImpl#getSize <em>Size</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EDefaultDataImpl#getData <em>Data</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EDefaultDataImpl#getLocalResourcePath <em>Local Resource Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDefaultDataImpl extends MinimalEObjectImpl.Container implements EDefaultData {
    /**
     * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected static final String SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected String size = SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getData() <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getData()
     * @generated
     * @ordered
     */
    protected static final String DATA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getData()
     * @generated
     * @ordered
     */
    protected String data = DATA_EDEFAULT;

    /**
     * The default value of the '{@link #getLocalResourcePath() <em>Local Resource Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getLocalResourcePath()
     * @generated
     * @ordered
     */
    protected static final String LOCAL_RESOURCE_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalResourcePath() <em>Local Resource Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getLocalResourcePath()
     * @generated
     * @ordered
     */
    protected String localResourcePath = LOCAL_RESOURCE_PATH_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected EDefaultDataImpl() {
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
        return PersconfPackage.Literals.EDEFAULT_DATA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getSize() {
        return this.size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSize(final String newSize) {
        final String oldSize = this.size;
        this.size = newSize;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EDEFAULT_DATA__SIZE, oldSize, this.size));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getData() {
        return this.data;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setData(final String newData) {
        final String oldData = this.data;
        this.data = newData;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EDEFAULT_DATA__DATA, oldData, this.data));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getLocalResourcePath() {
        return this.localResourcePath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLocalResourcePath(final String newLocalResourcePath) {
        final String oldLocalResourcePath = this.localResourcePath;
        this.localResourcePath = newLocalResourcePath;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EDEFAULT_DATA__LOCAL_RESOURCE_PATH,
                    oldLocalResourcePath, this.localResourcePath));
        }
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
        case PersconfPackage.EDEFAULT_DATA__SIZE:
            return this.getSize();
        case PersconfPackage.EDEFAULT_DATA__DATA:
            return this.getData();
        case PersconfPackage.EDEFAULT_DATA__LOCAL_RESOURCE_PATH:
            return this.getLocalResourcePath();
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
        case PersconfPackage.EDEFAULT_DATA__SIZE:
            this.setSize((String) newValue);
            return;
        case PersconfPackage.EDEFAULT_DATA__DATA:
            this.setData((String) newValue);
            return;
        case PersconfPackage.EDEFAULT_DATA__LOCAL_RESOURCE_PATH:
            this.setLocalResourcePath((String) newValue);
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
        case PersconfPackage.EDEFAULT_DATA__SIZE:
            this.setSize(SIZE_EDEFAULT);
            return;
        case PersconfPackage.EDEFAULT_DATA__DATA:
            this.setData(DATA_EDEFAULT);
            return;
        case PersconfPackage.EDEFAULT_DATA__LOCAL_RESOURCE_PATH:
            this.setLocalResourcePath(LOCAL_RESOURCE_PATH_EDEFAULT);
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
        case PersconfPackage.EDEFAULT_DATA__SIZE:
            return SIZE_EDEFAULT == null ? this.size != null : !SIZE_EDEFAULT.equals(this.size);
        case PersconfPackage.EDEFAULT_DATA__DATA:
            return DATA_EDEFAULT == null ? this.data != null : !DATA_EDEFAULT.equals(this.data);
        case PersconfPackage.EDEFAULT_DATA__LOCAL_RESOURCE_PATH:
            return LOCAL_RESOURCE_PATH_EDEFAULT == null ? this.localResourcePath != null : !LOCAL_RESOURCE_PATH_EDEFAULT
                    .equals(this.localResourcePath);
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
        result.append(" (size: ");
        result.append(this.size);
        result.append(", data: ");
        result.append(this.data);
        result.append(", localResourcePath: ");
        result.append(this.localResourcePath);
        result.append(')');
        return result.toString();
    }

} //EDefaultDataImpl
