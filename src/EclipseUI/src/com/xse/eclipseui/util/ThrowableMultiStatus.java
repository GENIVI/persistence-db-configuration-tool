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
package com.xse.eclipseui.util;

import java.io.PrintStream;
import java.io.PrintWriter;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;

/**
 * Wrapps a MultiStatus object into a Throwable class
 * to display a tree of messages in Eclipse's error log.
 *
 * @author fscherzinger
 *
 */
public class ThrowableMultiStatus extends Throwable {

    private static final long serialVersionUID = 2918877647049452263L;

    private final MultiStatus multiStatus;

    public ThrowableMultiStatus(final MultiStatus multiStatus) {
        this.multiStatus = multiStatus;
    }

    public MultiStatus getMultiStatus() {
        return this.multiStatus;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder(this.multiStatus.getMessage());
        result.append(":\r\n");

        for (final IStatus status : this.multiStatus.getChildren()) {
            result.append('\t').append(status.getMessage()).append("\r\n");
        }

        return result.toString();
    }

    @Override
    public void printStackTrace(final PrintStream s) {
        if (this.multiStatus.getException() != null) {
            this.multiStatus.getException().printStackTrace(s);
        } else {
            s.print(this.toString());
        }
        for (final IStatus status : this.multiStatus.getChildren()) {
            if (status.getException() != null) {
                status.getException().printStackTrace(s);
            }
        }
    }

    @Override
    public void printStackTrace(final PrintWriter s) {
        if (this.multiStatus.getException() != null) {
            this.multiStatus.getException().printStackTrace(s);
        } else {
            s.print(this.toString());
        }
        for (final IStatus status : this.multiStatus.getChildren()) {
            if (status.getException() != null) {
                status.getException().printStackTrace(s);
            }
        }
    }

}
