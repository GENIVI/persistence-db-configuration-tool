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

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

public class ExpandAllHandler {

    @Execute
    public void execute(final MPart activePart) {
        final ApplicationsPart applicationsPart = (ApplicationsPart) activePart.getObject();
        if (applicationsPart.getViewer() != null) {
            applicationsPart.getViewer().expandAll();
        }
    }

}
