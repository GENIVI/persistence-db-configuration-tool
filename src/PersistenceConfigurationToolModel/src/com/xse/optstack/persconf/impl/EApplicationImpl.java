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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;
import com.xse.optstack.persconf.EInstallRule;
import com.xse.optstack.persconf.EResource;
import com.xse.optstack.persconf.PersconfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EApplication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getName <em>Name</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getVersion <em>Version</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getResources <em>Resources</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getGroup <em>Group</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getInstallRule <em>Install Rule</em>}</li>
 * <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EApplicationImpl extends MinimalEObjectImpl.Container implements EApplication {
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
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = "0.1.0";

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference
     * list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getResources()
     * @generated
     * @ordered
     */
    protected EList<EResource> resources;

    /**
     * The default value of the '{@link #getInstallRule() <em>Install Rule</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getInstallRule()
     * @generated
     * @ordered
     */
    protected static final EInstallRule INSTALL_RULE_EDEFAULT = EInstallRule.NEW_INSTALL;

    /**
     * The cached value of the '{@link #getInstallRule() <em>Install Rule</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getInstallRule()
     * @generated
     * @ordered
     */
    protected EInstallRule installRule = INSTALL_RULE_EDEFAULT;

    /**
     * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected static final Integer SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected Integer size = SIZE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EApplicationImpl() {
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
        return PersconfPackage.Literals.EAPPLICATION;
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
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__NAME, oldName, this.name));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setVersion(final String newVersion) {
        final String oldVersion = this.version;
        this.version = newVersion;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__VERSION, oldVersion, this.version));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<EResource> getResources() {
        if (this.resources == null) {
            this.resources = new EObjectContainmentEList<EResource>(EResource.class, this, PersconfPackage.EAPPLICATION__RESOURCES);
        }
        return this.resources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EApplicationGroup getGroup() {
        if (this.eContainerFeatureID() != PersconfPackage.EAPPLICATION__GROUP) {
            return null;
        }
        return (EApplicationGroup) this.eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetGroup(final EApplicationGroup newGroup, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newGroup, PersconfPackage.EAPPLICATION__GROUP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setGroup(final EApplicationGroup newGroup) {
        if ((newGroup != this.eInternalContainer())
                || ((this.eContainerFeatureID() != PersconfPackage.EAPPLICATION__GROUP) && (newGroup != null))) {
            if (EcoreUtil.isAncestor(this, newGroup)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newGroup != null) {
                msgs = ((InternalEObject) newGroup).eInverseAdd(this, PersconfPackage.EAPPLICATION_GROUP__APPLICATIONS,
                        EApplicationGroup.class, msgs);
            }
            msgs = this.basicSetGroup(newGroup, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__GROUP, newGroup, newGroup));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EInstallRule getInstallRule() {
        return this.installRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInstallRule(final EInstallRule newInstallRule) {
        final EInstallRule oldInstallRule = this.installRule;
        this.installRule = newInstallRule == null ? INSTALL_RULE_EDEFAULT : newInstallRule;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__INSTALL_RULE, oldInstallRule,
                    this.installRule));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Integer getSize() {
        return this.size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSize(final Integer newSize) {
        final Integer oldSize = this.size;
        this.size = newSize;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__SIZE, oldSize, this.size));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case PersconfPackage.EAPPLICATION__GROUP:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetGroup((EApplicationGroup) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
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
        case PersconfPackage.EAPPLICATION__RESOURCES:
            return ((InternalEList<?>) this.getResources()).basicRemove(otherEnd, msgs);
        case PersconfPackage.EAPPLICATION__GROUP:
            return this.basicSetGroup(null, msgs);
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
    public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
        switch (this.eContainerFeatureID()) {
        case PersconfPackage.EAPPLICATION__GROUP:
            return this.eInternalContainer().eInverseRemove(this, PersconfPackage.EAPPLICATION_GROUP__APPLICATIONS,
                    EApplicationGroup.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
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
        case PersconfPackage.EAPPLICATION__NAME:
            return this.getName();
        case PersconfPackage.EAPPLICATION__VERSION:
            return this.getVersion();
        case PersconfPackage.EAPPLICATION__RESOURCES:
            return this.getResources();
        case PersconfPackage.EAPPLICATION__GROUP:
            return this.getGroup();
        case PersconfPackage.EAPPLICATION__INSTALL_RULE:
            return this.getInstallRule();
        case PersconfPackage.EAPPLICATION__SIZE:
            return this.getSize();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case PersconfPackage.EAPPLICATION__NAME:
            this.setName((String) newValue);
            return;
        case PersconfPackage.EAPPLICATION__VERSION:
            this.setVersion((String) newValue);
            return;
        case PersconfPackage.EAPPLICATION__RESOURCES:
            this.getResources().clear();
            this.getResources().addAll((Collection<? extends EResource>) newValue);
            return;
        case PersconfPackage.EAPPLICATION__GROUP:
            this.setGroup((EApplicationGroup) newValue);
            return;
        case PersconfPackage.EAPPLICATION__INSTALL_RULE:
            this.setInstallRule((EInstallRule) newValue);
            return;
        case PersconfPackage.EAPPLICATION__SIZE:
            this.setSize((Integer) newValue);
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
        case PersconfPackage.EAPPLICATION__NAME:
            this.setName(NAME_EDEFAULT);
            return;
        case PersconfPackage.EAPPLICATION__VERSION:
            this.setVersion(VERSION_EDEFAULT);
            return;
        case PersconfPackage.EAPPLICATION__RESOURCES:
            this.getResources().clear();
            return;
        case PersconfPackage.EAPPLICATION__GROUP:
            this.setGroup((EApplicationGroup) null);
            return;
        case PersconfPackage.EAPPLICATION__INSTALL_RULE:
            this.setInstallRule(INSTALL_RULE_EDEFAULT);
            return;
        case PersconfPackage.EAPPLICATION__SIZE:
            this.setSize(SIZE_EDEFAULT);
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
        case PersconfPackage.EAPPLICATION__NAME:
            return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
        case PersconfPackage.EAPPLICATION__VERSION:
            return VERSION_EDEFAULT == null ? this.version != null : !VERSION_EDEFAULT.equals(this.version);
        case PersconfPackage.EAPPLICATION__RESOURCES:
            return (this.resources != null) && !this.resources.isEmpty();
        case PersconfPackage.EAPPLICATION__GROUP:
            return this.getGroup() != null;
        case PersconfPackage.EAPPLICATION__INSTALL_RULE:
            return this.installRule != INSTALL_RULE_EDEFAULT;
        case PersconfPackage.EAPPLICATION__SIZE:
            return SIZE_EDEFAULT == null ? this.size != null : !SIZE_EDEFAULT.equals(this.size);
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
        result.append(", version: ");
        result.append(this.version);
        result.append(", installRule: ");
        result.append(this.installRule);
        result.append(", size: ");
        result.append(this.size);
        result.append(')');
        return result.toString();
    }

} //EApplicationImpl
