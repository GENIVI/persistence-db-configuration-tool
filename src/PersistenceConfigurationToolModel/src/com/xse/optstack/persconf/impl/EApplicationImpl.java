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
 * </p>
 * <ul>
 *   <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getInstallRule <em>Install Rule</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getSize <em>Size</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.impl.EApplicationImpl#getGroupId <em>Group Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EApplicationImpl extends MinimalEObjectImpl.Container implements EApplication {
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
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = "0.1.0";

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResources()
     * @generated
     * @ordered
     */
    protected EList<EResource> resources;

    /**
     * The default value of the '{@link #getInstallRule() <em>Install Rule</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstallRule()
     * @generated
     * @ordered
     */
    protected static final EInstallRule INSTALL_RULE_EDEFAULT = EInstallRule.NEW_INSTALL;

    /**
     * The cached value of the '{@link #getInstallRule() <em>Install Rule</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstallRule()
     * @generated
     * @ordered
     */
    protected EInstallRule installRule = INSTALL_RULE_EDEFAULT;

    /**
     * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected static final Integer SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected Integer size = SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserName()
     * @generated
     * @ordered
     */
    protected static final String USER_NAME_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserName()
     * @generated
     * @ordered
     */
    protected String userName = USER_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupName()
     * @generated
     * @ordered
     */
    protected static final String GROUP_NAME_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupName()
     * @generated
     * @ordered
     */
    protected String groupName = GROUP_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getUserId() <em>User Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserId()
     * @generated
     * @ordered
     */
    protected static final Integer USER_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUserId() <em>User Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUserId()
     * @generated
     * @ordered
     */
    protected Integer userId = USER_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupId()
     * @generated
     * @ordered
     */
    protected static final Integer GROUP_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupId()
     * @generated
     * @ordered
     */
    protected Integer groupId = GROUP_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */

    protected EApplicationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PersconfPackage.Literals.EAPPLICATION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVersion(String newVersion) {
        String oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__VERSION, oldVersion,
                    version));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EResource> getResources() {
        if (resources == null) {
            resources = new EObjectContainmentEList<EResource>(EResource.class, this,
                    PersconfPackage.EAPPLICATION__RESOURCES);
        }
        return resources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EApplicationGroup getGroup() {
        if (eContainerFeatureID() != PersconfPackage.EAPPLICATION__GROUP)
            return null;
        return (EApplicationGroup) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGroup(EApplicationGroup newGroup, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newGroup, PersconfPackage.EAPPLICATION__GROUP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGroup(EApplicationGroup newGroup) {
        if (newGroup != eInternalContainer()
                || (eContainerFeatureID() != PersconfPackage.EAPPLICATION__GROUP && newGroup != null)) {
            if (EcoreUtil.isAncestor(this, newGroup))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newGroup != null)
                msgs = ((InternalEObject) newGroup).eInverseAdd(this, PersconfPackage.EAPPLICATION_GROUP__APPLICATIONS,
                        EApplicationGroup.class, msgs);
            msgs = basicSetGroup(newGroup, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__GROUP, newGroup,
                    newGroup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EInstallRule getInstallRule() {
        return installRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInstallRule(EInstallRule newInstallRule) {
        EInstallRule oldInstallRule = installRule;
        installRule = newInstallRule == null ? INSTALL_RULE_EDEFAULT : newInstallRule;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__INSTALL_RULE,
                    oldInstallRule, installRule));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getSize() {
        return size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSize(Integer newSize) {
        Integer oldSize = size;
        size = newSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__SIZE, oldSize, size));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUserName(String newUserName) {
        String oldUserName = userName;
        userName = newUserName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__USER_NAME, oldUserName,
                    userName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroupName(String newGroupName) {
        String oldGroupName = groupName;
        groupName = newGroupName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__GROUP_NAME,
                    oldGroupName, groupName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUserId(Integer newUserId) {
        Integer oldUserId = userId;
        userId = newUserId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__USER_ID, oldUserId,
                    userId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroupId(Integer newGroupId) {
        Integer oldGroupId = groupId;
        groupId = newGroupId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PersconfPackage.EAPPLICATION__GROUP_ID, oldGroupId,
                    groupId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case PersconfPackage.EAPPLICATION__GROUP:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetGroup((EApplicationGroup) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case PersconfPackage.EAPPLICATION__RESOURCES:
            return ((InternalEList<?>) getResources()).basicRemove(otherEnd, msgs);
        case PersconfPackage.EAPPLICATION__GROUP:
            return basicSetGroup(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case PersconfPackage.EAPPLICATION__GROUP:
            return eInternalContainer().eInverseRemove(this, PersconfPackage.EAPPLICATION_GROUP__APPLICATIONS,
                    EApplicationGroup.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case PersconfPackage.EAPPLICATION__NAME:
            return getName();
        case PersconfPackage.EAPPLICATION__VERSION:
            return getVersion();
        case PersconfPackage.EAPPLICATION__RESOURCES:
            return getResources();
        case PersconfPackage.EAPPLICATION__GROUP:
            return getGroup();
        case PersconfPackage.EAPPLICATION__INSTALL_RULE:
            return getInstallRule();
        case PersconfPackage.EAPPLICATION__SIZE:
            return getSize();
        case PersconfPackage.EAPPLICATION__USER_NAME:
            return getUserName();
        case PersconfPackage.EAPPLICATION__GROUP_NAME:
            return getGroupName();
        case PersconfPackage.EAPPLICATION__USER_ID:
            return getUserId();
        case PersconfPackage.EAPPLICATION__GROUP_ID:
            return getGroupId();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case PersconfPackage.EAPPLICATION__NAME:
            setName((String) newValue);
            return;
        case PersconfPackage.EAPPLICATION__VERSION:
            setVersion((String) newValue);
            return;
        case PersconfPackage.EAPPLICATION__RESOURCES:
            getResources().clear();
            getResources().addAll((Collection<? extends EResource>) newValue);
            return;
        case PersconfPackage.EAPPLICATION__GROUP:
            setGroup((EApplicationGroup) newValue);
            return;
        case PersconfPackage.EAPPLICATION__INSTALL_RULE:
            setInstallRule((EInstallRule) newValue);
            return;
        case PersconfPackage.EAPPLICATION__SIZE:
            setSize((Integer) newValue);
            return;
        case PersconfPackage.EAPPLICATION__USER_NAME:
            setUserName((String) newValue);
            return;
        case PersconfPackage.EAPPLICATION__GROUP_NAME:
            setGroupName((String) newValue);
            return;
        case PersconfPackage.EAPPLICATION__USER_ID:
            setUserId((Integer) newValue);
            return;
        case PersconfPackage.EAPPLICATION__GROUP_ID:
            setGroupId((Integer) newValue);
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
        case PersconfPackage.EAPPLICATION__NAME:
            setName(NAME_EDEFAULT);
            return;
        case PersconfPackage.EAPPLICATION__VERSION:
            setVersion(VERSION_EDEFAULT);
            return;
        case PersconfPackage.EAPPLICATION__RESOURCES:
            getResources().clear();
            return;
        case PersconfPackage.EAPPLICATION__GROUP:
            setGroup((EApplicationGroup) null);
            return;
        case PersconfPackage.EAPPLICATION__INSTALL_RULE:
            setInstallRule(INSTALL_RULE_EDEFAULT);
            return;
        case PersconfPackage.EAPPLICATION__SIZE:
            setSize(SIZE_EDEFAULT);
            return;
        case PersconfPackage.EAPPLICATION__USER_NAME:
            setUserName(USER_NAME_EDEFAULT);
            return;
        case PersconfPackage.EAPPLICATION__GROUP_NAME:
            setGroupName(GROUP_NAME_EDEFAULT);
            return;
        case PersconfPackage.EAPPLICATION__USER_ID:
            setUserId(USER_ID_EDEFAULT);
            return;
        case PersconfPackage.EAPPLICATION__GROUP_ID:
            setGroupId(GROUP_ID_EDEFAULT);
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
        case PersconfPackage.EAPPLICATION__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case PersconfPackage.EAPPLICATION__VERSION:
            return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
        case PersconfPackage.EAPPLICATION__RESOURCES:
            return resources != null && !resources.isEmpty();
        case PersconfPackage.EAPPLICATION__GROUP:
            return getGroup() != null;
        case PersconfPackage.EAPPLICATION__INSTALL_RULE:
            return installRule != INSTALL_RULE_EDEFAULT;
        case PersconfPackage.EAPPLICATION__SIZE:
            return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
        case PersconfPackage.EAPPLICATION__USER_NAME:
            return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
        case PersconfPackage.EAPPLICATION__GROUP_NAME:
            return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
        case PersconfPackage.EAPPLICATION__USER_ID:
            return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
        case PersconfPackage.EAPPLICATION__GROUP_ID:
            return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
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
        result.append(", version: ");
        result.append(version);
        result.append(", installRule: ");
        result.append(installRule);
        result.append(", size: ");
        result.append(size);
        result.append(", userName: ");
        result.append(userName);
        result.append(", groupName: ");
        result.append(groupName);
        result.append(", userId: ");
        result.append(userId);
        result.append(", groupId: ");
        result.append(groupId);
        result.append(')');
        return result.toString();
    }

} //EApplicationImpl
