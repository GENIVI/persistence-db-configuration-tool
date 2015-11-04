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

import org.apache.logging.log4j.message.Message;

public class BaseMessage implements Message {

    private static final long serialVersionUID = -1L;

    private final String msg;
    private final Throwable throwable;

    private final boolean multiStatusTrigger;
    private final boolean clearMultiStatusTrigger;

    private final transient ILoggingKeyProvider keyProvider;

    // flag to avoid recursive logging via appenders that log to the eclipse log
    private final boolean eclipseLogging;

    public BaseMessage(final String msg, final Throwable throwable) {
        this(msg, throwable, null, false);
    }

    public BaseMessage(final String msg, final Throwable throwable, final boolean eclipseLogging) {
        this(msg, throwable, null, false, false, eclipseLogging);
    }

    public BaseMessage(final String msg, final Throwable throwable, final ILoggingKeyProvider keyProvider) {
        this(msg, throwable, keyProvider, false);
    }

    public BaseMessage(final String msg, final Throwable throwable, final ILoggingKeyProvider keyProvider, final boolean multiStatusTrigger) {
        this(msg, throwable, keyProvider, multiStatusTrigger, false, false);
    }

    public BaseMessage(final String msg, final Throwable throwable, final ILoggingKeyProvider keyProvider,
            final boolean multiStatusTrigger, final boolean clearMultiStatusTrigger, final boolean eclipseLogging) {
        this.msg = msg;
        this.throwable = throwable;
        this.keyProvider = keyProvider;
        this.multiStatusTrigger = multiStatusTrigger;
        this.clearMultiStatusTrigger = clearMultiStatusTrigger;
        this.eclipseLogging = eclipseLogging;
    }

    @Override
    public String getFormattedMessage() {
        return this.msg;
    }

    @Override
    public String getFormat() {
        // not yet implemented (not supported throughout our whole stack)
        return null;
    }

    @Override
    public Object[] getParameters() {
        // not yet implemented (not supported throughout our whole stack)
        return new Object[0];
    }

    @Override
    public Throwable getThrowable() {
        return this.throwable;
    }

    public boolean isMultiStatusTrigger() {
        return this.multiStatusTrigger;
    }

    public boolean isClearMultiStatusTrigger() {
        return this.clearMultiStatusTrigger;
    }

    public boolean isEclipseLogging() {
        return this.eclipseLogging;
    }

    public ILoggingKeyProvider getKeyProvider() {
        return this.keyProvider;
    }

    @Override
    public String toString() {
        return "BaseMessage [" + (this.msg != null ? "msg=" + this.msg + ", " : "") + "multiStatusTrigger=" + this.multiStatusTrigger
                + ", clearMultiStatusTrigger=" + this.clearMultiStatusTrigger + ", eclipseLogging=" + this.eclipseLogging + "]";
    }

}
