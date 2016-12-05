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

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import com.xse.eclipseui.table.AbstractBaseLabelProvider;
import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;

public class ApplicationsLabelProvider extends AbstractBaseLabelProvider implements ITableLabelProvider {

    @Override
    public Image getImage(final Object element) {
        return null;
    }

    @Override
    public String getText(final Object element) {
        if (element instanceof EApplicationGroup) {
            return ((EApplicationGroup) element).getType().getLiteral();
        } else if (element instanceof EApplication) {
            return ((EApplication) element).getName();
        }
        return element.toString();
    }

    @Override
    public Image getColumnImage(final Object element, final int columnIndex) {
        return null;
    }

    @Override
    public String getColumnText(final Object element, final int columnIndex) {
        if (element instanceof EApplicationGroup) {
            if (0 == columnIndex) {
                return ((EApplicationGroup) element).getType().getLiteral();
            }
        } else if (element instanceof EApplication) {
            final EApplication application = (EApplication) element;
            switch (columnIndex) {
            case 0:
                return application.getName();
            case 1:
                if (application.getInstallRule() != null) {
                    return application.getInstallRule().getName();
                }
            case 2:
                return application.getSize() != null ? application.getSize().toString() : "";
            case 3:
                return application.getUserName() != null ? application.getUserName().toString() : "";
            case 4:
                return application.getGroupName() != null ? application.getGroupName().toString() : "";
            case 5:
                return application.getUserId() != null ? application.getUserId().toString() : "";
            case 6:
                return application.getGroupId() != null ? application.getGroupId().toString() : "";
            default:
                return "";
            }
        }
        return "";
    }

}
