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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EApplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xse.optstack.persconf.EApplication#getName <em>Name</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.EApplication#getVersion <em>Version</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.EApplication#getResources <em>Resources</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.EApplication#getGroup <em>Group</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.EApplication#getInstallRule <em>Install Rule</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.EApplication#getSize <em>Size</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.EApplication#getUserName <em>User Name</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.EApplication#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.EApplication#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.xse.optstack.persconf.EApplication#getGroupId <em>Group Id</em>}</li>
 * </ul>
 *
 * @see com.xse.optstack.persconf.PersconfPackage#getEApplication()
 * @model
 * @generated
 */
public interface EApplication extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see com.xse.optstack.persconf.PersconfPackage#getEApplication_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EApplication#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * The default value is <code>"0.1.0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see com.xse.optstack.persconf.PersconfPackage#getEApplication_Version()
     * @model default="0.1.0" required="true"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EApplication#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

    /**
     * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
     * The list contents are of type {@link com.xse.optstack.persconf.EResource}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resources</em>' containment reference list.
     * @see com.xse.optstack.persconf.PersconfPackage#getEApplication_Resources()
     * @model containment="true"
     * @generated
     */
    EList<EResource> getResources();

    /**
     * Returns the value of the '<em><b>Group</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link com.xse.optstack.persconf.EApplicationGroup#getApplications <em>Applications</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' container reference.
     * @see #setGroup(EApplicationGroup)
     * @see com.xse.optstack.persconf.PersconfPackage#getEApplication_Group()
     * @see com.xse.optstack.persconf.EApplicationGroup#getApplications
     * @model opposite="applications" required="true"
     * @generated
     */
    EApplicationGroup getGroup();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EApplication#getGroup <em>Group</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group</em>' container reference.
     * @see #getGroup()
     * @generated
     */
    void setGroup(EApplicationGroup value);

    /**
     * Returns the value of the '<em><b>Install Rule</b></em>' attribute.
     * The literals are from the enumeration {@link com.xse.optstack.persconf.EInstallRule}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Install Rule</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Install Rule</em>' attribute.
     * @see com.xse.optstack.persconf.EInstallRule
     * @see #setInstallRule(EInstallRule)
     * @see com.xse.optstack.persconf.PersconfPackage#getEApplication_InstallRule()
     * @model
     * @generated
     */
    EInstallRule getInstallRule();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EApplication#getInstallRule <em>Install Rule</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Install Rule</em>' attribute.
     * @see com.xse.optstack.persconf.EInstallRule
     * @see #getInstallRule()
     * @generated
     */
    void setInstallRule(EInstallRule value);

    /**
     * Returns the value of the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size</em>' attribute.
     * @see #setSize(Integer)
     * @see com.xse.optstack.persconf.PersconfPackage#getEApplication_Size()
     * @model
     * @generated
     */
    Integer getSize();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EApplication#getSize <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size</em>' attribute.
     * @see #getSize()
     * @generated
     */
    void setSize(Integer value);

    /**
     * Returns the value of the '<em><b>User Name</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User Name</em>' attribute.
     * @see #setUserName(String)
     * @see com.xse.optstack.persconf.PersconfPackage#getEApplication_UserName()
     * @model default=""
     * @generated
     */
    String getUserName();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EApplication#getUserName <em>User Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User Name</em>' attribute.
     * @see #getUserName()
     * @generated
     */
    void setUserName(String value);

    /**
     * Returns the value of the '<em><b>Group Name</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group Name</em>' attribute.
     * @see #setGroupName(String)
     * @see com.xse.optstack.persconf.PersconfPackage#getEApplication_GroupName()
     * @model default=""
     * @generated
     */
    String getGroupName();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EApplication#getGroupName <em>Group Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group Name</em>' attribute.
     * @see #getGroupName()
     * @generated
     */
    void setGroupName(String value);

    /**
     * Returns the value of the '<em><b>User Id</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User Id</em>' attribute.
     * @see #setUserId(Integer)
     * @see com.xse.optstack.persconf.PersconfPackage#getEApplication_UserId()
     * @model default="0"
     * @generated
     */
    Integer getUserId();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EApplication#getUserId <em>User Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User Id</em>' attribute.
     * @see #getUserId()
     * @generated
     */
    void setUserId(Integer value);

    /**
     * Returns the value of the '<em><b>Group Id</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group Id</em>' attribute.
     * @see #setGroupId(Integer)
     * @see com.xse.optstack.persconf.PersconfPackage#getEApplication_GroupId()
     * @model default="0"
     * @generated
     */
    Integer getGroupId();

    /**
     * Sets the value of the '{@link com.xse.optstack.persconf.EApplication#getGroupId <em>Group Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group Id</em>' attribute.
     * @see #getGroupId()
     * @generated
     */
    void setGroupId(Integer value);

} // EApplication
