/*******************************************************************************
 * Eclipse UI
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
package com.xse.eclipseui.tree;

/**
 * Listener interface that will be notified if the checked state in a
 * {@link AbstractBaseExtendedTree} gets changed. To get the active checked selection
 * getCheckedElements() needs to be called on the tree.
 * 
 * @author pberg
 * 
 */
public interface ICheckedStateChangedListener {

    void checkedStateChanged();

}
