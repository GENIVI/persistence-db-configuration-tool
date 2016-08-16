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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.xse.optstack.persconf.EConfiguration;
import com.xse.optstack.persconf.EInstallException;
import com.xse.optstack.persconf.EResource;
import com.xse.optstack.persconf.PersconfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EResource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xse.optstack.persconf.impl.EResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EResourceImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EResourceImpl#getInstallException <em>Install Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EResourceImpl extends MinimalEObjectImpl.Container implements EResource {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;
    /**
     * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfiguration()
     * @generated
     * @ordered
     */
    protected EConfiguration configuration;

    /**
     * The default value of the '{@link #getInstallException() <em>Install Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstallException()
     * @generated
     * @ordered
     */
    protected static final EInstallException INSTALL_EXCEPTION_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getInstallException() <em>Install Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstallException()
     * @generated
     * @ordered
     */
    protected EInstallException installException = INSTALL_EXCEPTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PersconfPackage.Literals.ERESOURCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ERESOURCE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EConfiguration getConfiguration() {
        if (configuration != null && configuration.eIsProxy()) {
            InternalEObject oldConfiguration = (InternalEObject) configuration;
            configuration = (EConfiguration) eResolveProxy(oldConfiguration);
            if (configuration != oldConfiguration) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersconfPackage.ERESOURCE__CONFIGURATION,
                            oldConfiguration, configuration));
            }
        }
        return configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EConfiguration basicGetConfiguration() {
        return configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConfiguration(EConfiguration newConfiguration) {
        EConfiguration oldConfiguration = configuration;
        configuration = newConfiguration;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ERESOURCE__CONFIGURATION,
                    oldConfiguration, configuration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EInstallException getInstallException() {
        return installException;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInstallException(EInstallException newInstallException) {
        EInstallException oldInstallException = installException;
        installException = newInstallException;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ERESOURCE__INSTALL_EXCEPTION,
                    oldInstallException, installException));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case PersconfPackage.ERESOURCE__NAME:
            return getName();
        case PersconfPackage.ERESOURCE__CONFIGURATION:
            if (resolve)
                return getConfiguration();
            return basicGetConfiguration();
        case PersconfPackage.ERESOURCE__INSTALL_EXCEPTION:
            return getInstallException();
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
        case PersconfPackage.ERESOURCE__NAME:
            setName((String) newValue);
            return;
        case PersconfPackage.ERESOURCE__CONFIGURATION:
            setConfiguration((EConfiguration) newValue);
            return;
        case PersconfPackage.ERESOURCE__INSTALL_EXCEPTION:
            setInstallException((EInstallException) newValue);
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
        case PersconfPackage.ERESOURCE__NAME:
            setName(NAME_EDEFAULT);
            return;
        case PersconfPackage.ERESOURCE__CONFIGURATION:
            setConfiguration((EConfiguration) null);
            return;
        case PersconfPackage.ERESOURCE__INSTALL_EXCEPTION:
            setInstallException(INSTALL_EXCEPTION_EDEFAULT);
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
        case PersconfPackage.ERESOURCE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case PersconfPackage.ERESOURCE__CONFIGURATION:
            return configuration != null;
        case PersconfPackage.ERESOURCE__INSTALL_EXCEPTION:
            return INSTALL_EXCEPTION_EDEFAULT == null ? installException != null
                    : !INSTALL_EXCEPTION_EDEFAULT.equals(installException);
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
        result.append(" (name: ");
        result.append(name);
        result.append(", installException: ");
        result.append(installException);
        result.append(')');
        return result.toString();
    }

} //EResourceImpl
