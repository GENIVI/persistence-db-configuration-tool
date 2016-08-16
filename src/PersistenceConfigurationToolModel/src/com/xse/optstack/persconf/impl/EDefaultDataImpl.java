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
 * </p>
 * <ul>
 *   <li>{@link com.xse.optstack.persconf.impl.EDefaultDataImpl#getSize <em>Size</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EDefaultDataImpl#getData <em>Data</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EDefaultDataImpl#getLocalResourcePath <em>Local Resource Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDefaultDataImpl extends MinimalEObjectImpl.Container implements EDefaultData {
    /**
     * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected static final String SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected String size = SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getData() <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected static final String DATA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected String data = DATA_EDEFAULT;

    /**
     * The default value of the '{@link #getLocalResourcePath() <em>Local Resource Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalResourcePath()
     * @generated
     * @ordered
     */
    protected static final String LOCAL_RESOURCE_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalResourcePath() <em>Local Resource Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalResourcePath()
     * @generated
     * @ordered
     */
    protected String localResourcePath = LOCAL_RESOURCE_PATH_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EDefaultDataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PersconfPackage.Literals.EDEFAULT_DATA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSize() {
        return size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSize(String newSize) {
        String oldSize = size;
        size = newSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EDEFAULT_DATA__SIZE, oldSize, size));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getData() {
        return data;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setData(String newData) {
        String oldData = data;
        data = newData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EDEFAULT_DATA__DATA, oldData, data));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLocalResourcePath() {
        return localResourcePath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLocalResourcePath(String newLocalResourcePath) {
        String oldLocalResourcePath = localResourcePath;
        localResourcePath = newLocalResourcePath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EDEFAULT_DATA__LOCAL_RESOURCE_PATH,
                    oldLocalResourcePath, localResourcePath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case PersconfPackage.EDEFAULT_DATA__SIZE:
            return getSize();
        case PersconfPackage.EDEFAULT_DATA__DATA:
            return getData();
        case PersconfPackage.EDEFAULT_DATA__LOCAL_RESOURCE_PATH:
            return getLocalResourcePath();
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
        case PersconfPackage.EDEFAULT_DATA__SIZE:
            setSize((String) newValue);
            return;
        case PersconfPackage.EDEFAULT_DATA__DATA:
            setData((String) newValue);
            return;
        case PersconfPackage.EDEFAULT_DATA__LOCAL_RESOURCE_PATH:
            setLocalResourcePath((String) newValue);
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
        case PersconfPackage.EDEFAULT_DATA__SIZE:
            setSize(SIZE_EDEFAULT);
            return;
        case PersconfPackage.EDEFAULT_DATA__DATA:
            setData(DATA_EDEFAULT);
            return;
        case PersconfPackage.EDEFAULT_DATA__LOCAL_RESOURCE_PATH:
            setLocalResourcePath(LOCAL_RESOURCE_PATH_EDEFAULT);
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
        case PersconfPackage.EDEFAULT_DATA__SIZE:
            return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
        case PersconfPackage.EDEFAULT_DATA__DATA:
            return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
        case PersconfPackage.EDEFAULT_DATA__LOCAL_RESOURCE_PATH:
            return LOCAL_RESOURCE_PATH_EDEFAULT == null ? localResourcePath != null
                    : !LOCAL_RESOURCE_PATH_EDEFAULT.equals(localResourcePath);
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
        result.append(" (size: ");
        result.append(size);
        result.append(", data: ");
        result.append(data);
        result.append(", localResourcePath: ");
        result.append(localResourcePath);
        result.append(')');
        return result.toString();
    }

} //EDefaultDataImpl
