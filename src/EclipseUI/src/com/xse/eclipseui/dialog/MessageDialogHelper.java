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
package com.xse.eclipseui.dialog;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

import com.xse.eclipseui.util.ValueContainer;

public final class MessageDialogHelper {

    private MessageDialogHelper() {
        // do nothing
    }

    /**
     * Convenience method to open a simple confirm (OK/Cancel) dialog.
     *
     * @param title
     *            the dialog's title, or <code>null</code> if none
     * @param message
     *            the message
     * @return <code>true</code> if the user presses the OK button, <code>false</code> otherwise
     */
    public static boolean openConfirm(final String title, final String message) {
        final ValueContainer<Boolean> result = new ValueContainer<>(Boolean.FALSE);
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                result.setValue(Boolean.valueOf(MessageDialog.open(MessageDialog.CONFIRM, Display.getDefault().getActiveShell(), title,
                        message, SWT.NONE)));
            }
        });

        return result.getValue().booleanValue();
    }

    /**
     * Convenience method to open a standard error dialog.
     *
     * @param title
     *            the dialog's title, or <code>null</code> if none
     * @param message
     *            the message
     */
    public static void openError(final String title, final String message) {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                MessageDialog.open(MessageDialog.ERROR, Display.getDefault().getActiveShell(), title, message, SWT.NONE);
            }
        });
    }

    /**
     * Convenience method to open a standard information dialog.
     *
     * @param title
     *            the dialog's title, or <code>null</code> if none
     * @param message
     *            the message
     */
    public static void openInformation(final String title, final String message) {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                MessageDialog.open(MessageDialog.INFORMATION, Display.getDefault().getActiveShell(), title, message, SWT.NONE);
            }
        });
    }

    /**
     * Convenience method to open a simple Yes/No question dialog.
     *
     * @param title
     *            the dialog's title, or <code>null</code> if none
     * @param message
     *            the message
     * @return <code>true</code> if the user presses the Yes button, <code>false</code> otherwise
     */
    public static boolean openQuestion(final String title, final String message) {
        final ValueContainer<Boolean> result = new ValueContainer<>(Boolean.FALSE);
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                result.setValue(Boolean.valueOf(MessageDialog.open(MessageDialog.QUESTION, Display.getDefault().getActiveShell(), title,
                        message, SWT.NONE)));
            }
        });

        return result.getValue().booleanValue();
    }

    /**
     * Convenience method to open a standard warning dialog.
     *
     * @param title
     *            the dialog's title, or <code>null</code> if none
     * @param message
     *            the message
     */
    public static void openWarning(final String title, final String message) {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                MessageDialog.open(MessageDialog.WARNING, Display.getDefault().getActiveShell(), title, message, SWT.NONE);
            }
        });
    }

}
