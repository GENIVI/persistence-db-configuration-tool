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
package com.xse.eclipseui.logging;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

import com.xse.eclipseui.util.Logger;

public final class MessageHelper {

    public static enum Severity {
        INFORMATION, WARNING, ERROR;
    }

    private MessageHelper() {
        // do nothing
    }

    public static void post(final String pluginId, final Severity severity, final String title, final Throwable t) {
        post(pluginId, severity, title, t.getMessage(), t);
    }

    public static void post(final String pluginId, final Severity severity, final String title, final String message) {
        post(pluginId, severity, title, message, null);
    }

    public static void post(final String pluginId, final int severity, final String title, final String message) {
        Severity msgSeverity;

        switch (severity) {
        case IStatus.WARNING:
            msgSeverity = Severity.WARNING;
            break;
        case IStatus.ERROR:
        case IStatus.CANCEL:
            msgSeverity = Severity.ERROR;
            break;
        default:
            msgSeverity = Severity.INFORMATION;
        }
        post(pluginId, msgSeverity, title, message, null);
    }

    public static void post(final String pluginId, final Severity severity, final String title, final String message, final Throwable t) {
        final Status status;
        int kind = MessageDialog.INFORMATION;

        switch (severity) {
        case INFORMATION:
            status = new Status(IStatus.INFO, pluginId, message, t);
            break;
        case WARNING:
            status = new Status(IStatus.WARNING, pluginId, message, t);
            kind = MessageDialog.WARNING;
            break;
        case ERROR:
            status = new Status(IStatus.ERROR, pluginId, message, t);
            kind = MessageDialog.ERROR;
            break;
        default:
            status = null;
            break;
        }

        if (status != null) {
            Logger.log(status);
            final int kind2 = kind;
            Display.getDefault().syncExec(new Runnable() {
                @Override
                public void run() {
                    MessageDialog.open(kind2, Display.getDefault().getActiveShell(), title, message, SWT.NONE);
                }
            });
        }
    }
}
