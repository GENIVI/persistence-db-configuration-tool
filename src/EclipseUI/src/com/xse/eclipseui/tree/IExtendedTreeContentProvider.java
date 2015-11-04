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

import java.util.List;

import org.eclipse.jface.viewers.Viewer;

public interface IExtendedTreeContentProvider<T> {

    List<T> getRootElements();

    /**
     * Will be used by the actual content provider to display the elements in a tree.
     * 
     * @param parentElement
     * @return
     */
    List<T> getChildren(T parentElement);

    /**
     * Will be used to represent the actual parent/child element structure.
     * A difference to getChildren(...) is only needed if we do not want to display the parent/child
     * structure but still need it for internal purposes.
     * 
     * @param parentElement
     * @return
     */
    List<T> getActualChildren(T parentElement);

    T getParent(T element);

    boolean hasChildren(T element);

    void inputChanged(Viewer viewer, Object oldInput, Object newInput);

    T findItemByData(Object lookupItem);

}
