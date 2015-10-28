/*******************************************************************************
 * Persistence Configuration Tool UI
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
package com.xse.optstack.persconftool.ui.applications;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;

public class ApplicationsContentProvider implements ITreeContentProvider {

    private Resource input;

    @Override
    public void dispose() {
    }

    @Override
    public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
        if (newInput instanceof Resource) {
            this.input = (Resource) newInput;
        } else {
            this.input = null;
        }
    }

    @Override
    public Object[] getElements(final Object inputElement) {
        final List<Object> rootElements = new ArrayList<>();
        if (this.input != null) {
            this.input.getContents().stream().filter(obj -> obj instanceof EApplicationGroup).forEach(obj -> rootElements.add(obj));
        }
        return rootElements.toArray();
    }

    @Override
    public Object[] getChildren(final Object parentElement) {
        final List<EApplication> childs = new ArrayList<>();
        if (parentElement instanceof EApplicationGroup) {
            final EApplicationGroup group = (EApplicationGroup) parentElement;
            childs.addAll(group.getApplications());
        }
        return childs.toArray();
    }

    @Override
    public Object getParent(final Object element) {
        if (element instanceof EApplication) {
            return ((EApplication) element).getGroup();
        }
        return null;
    }

    @Override
    public boolean hasChildren(final Object element) {
        if (element instanceof EApplication) {
            return false;
        } else if (this.getChildren(element).length > 0) {
            return true;
        }
        return false;
    }

}
