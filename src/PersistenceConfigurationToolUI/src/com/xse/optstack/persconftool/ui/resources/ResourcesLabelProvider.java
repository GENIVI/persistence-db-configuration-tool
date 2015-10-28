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

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import com.xse.eclipseui.table.AbstractBaseLabelProvider;
import com.xse.optstack.persconf.EResource;

public class ResourcesLabelProvider extends AbstractBaseLabelProvider implements ITableLabelProvider {

    @Override
    public Image getImage(final Object element) {
        return null;
    }

    @Override
    public String getText(final Object element) {
        if (element instanceof EResource) {
            return ((EResource) element).getName();
        }
        return element.toString();
    }

    @Override
    public Image getColumnImage(final Object element, final int columnIndex) {
        return null;
    }

    @Override
    public String getColumnText(final Object element, final int columnIndex) {
        if (element instanceof EResource) {
            final EResource resource = (EResource) element;
            switch (columnIndex) {
            case 0:
                return resource.getName();
            case 1:
                if (resource.getInstallException() != null) {
                    return resource.getInstallException().getName();
                }
                break;
            default:
                return "";
            }
        }
        return "";
    }

}
