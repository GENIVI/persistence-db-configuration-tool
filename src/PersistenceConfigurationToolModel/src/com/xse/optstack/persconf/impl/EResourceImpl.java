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
 * <ul>
 * <li>{@link com.xse.optstack.persconf.impl.EResourceImpl#getName <em>Name</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EResourceImpl#getConfiguration <em>Configuration</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EResourceImpl#getInstallException <em>Install Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EResourceImpl extends MinimalEObjectImpl.Container implements EResource {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;
    /**
     * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getConfiguration()
     * @generated
     * @ordered
     */
    protected EConfiguration configuration;

    /**
     * The default value of the '{@link #getInstallException() <em>Install Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getInstallException()
     * @generated
     * @ordered
     */
    protected static final EInstallException INSTALL_EXCEPTION_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getInstallException() <em>Install Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getInstallException()
     * @generated
     * @ordered
     */
    protected EInstallException installException = INSTALL_EXCEPTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected EResourceImpl() {
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
        return PersconfPackage.Literals.ERESOURCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ERESOURCE__NAME, oldName, this.name));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EConfiguration getConfiguration() {
        if ((this.configuration != null) && this.configuration.eIsProxy()) {
            final InternalEObject oldConfiguration = (InternalEObject) this.configuration;
            this.configuration = (EConfiguration) this.eResolveProxy(oldConfiguration);
            if (this.configuration != oldConfiguration) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersconfPackage.ERESOURCE__CONFIGURATION,
                            oldConfiguration, this.configuration));
                }
            }
        }
        return this.configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public EConfiguration basicGetConfiguration() {
        return this.configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setConfiguration(final EConfiguration newConfiguration) {
        final EConfiguration oldConfiguration = this.configuration;
        this.configuration = newConfiguration;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ERESOURCE__CONFIGURATION, oldConfiguration,
                    this.configuration));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EInstallException getInstallException() {
        return this.installException;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setInstallException(final EInstallException newInstallException) {
        final EInstallException oldInstallException = this.installException;
        this.installException = newInstallException;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.ERESOURCE__INSTALL_EXCEPTION, oldInstallException,
                    this.installException));
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
        case PersconfPackage.ERESOURCE__NAME:
            return this.getName();
        case PersconfPackage.ERESOURCE__CONFIGURATION:
            if (resolve) {
                return this.getConfiguration();
            }
            return this.basicGetConfiguration();
        case PersconfPackage.ERESOURCE__INSTALL_EXCEPTION:
            return this.getInstallException();
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
        case PersconfPackage.ERESOURCE__NAME:
            this.setName((String) newValue);
            return;
        case PersconfPackage.ERESOURCE__CONFIGURATION:
            this.setConfiguration((EConfiguration) newValue);
            return;
        case PersconfPackage.ERESOURCE__INSTALL_EXCEPTION:
            this.setInstallException((EInstallException) newValue);
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
        case PersconfPackage.ERESOURCE__NAME:
            this.setName(NAME_EDEFAULT);
            return;
        case PersconfPackage.ERESOURCE__CONFIGURATION:
            this.setConfiguration((EConfiguration) null);
            return;
        case PersconfPackage.ERESOURCE__INSTALL_EXCEPTION:
            this.setInstallException(INSTALL_EXCEPTION_EDEFAULT);
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
        case PersconfPackage.ERESOURCE__NAME:
            return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
        case PersconfPackage.ERESOURCE__CONFIGURATION:
            return this.configuration != null;
        case PersconfPackage.ERESOURCE__INSTALL_EXCEPTION:
            return INSTALL_EXCEPTION_EDEFAULT == null ? this.installException != null : !INSTALL_EXCEPTION_EDEFAULT
                    .equals(this.installException);
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
        result.append(" (name: ");
        result.append(this.name);
        result.append(", installException: ");
        result.append(this.installException);
        result.append(')');
        return result.toString();
    }

} //EResourceImpl
