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
package com.xse.optstack.persconftool.ui.resources;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.xse.optstack.persconf.EApplication;

public class ResourcesContentProvider implements IStructuredContentProvider {

    private EApplication application;

    @Override
    public void dispose() {
        // do nothing
    }

    @Override
    public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
        if (newInput instanceof EApplication) {
            this.application = (EApplication) newInput;
        } else {
            this.application = null;
        }
    }

    @Override
    public Object[] getElements(final Object inputElement) {
        if (this.application != null) {
            return this.application.getResources().toArray();
        }
        return new Object[0];
    }

}
