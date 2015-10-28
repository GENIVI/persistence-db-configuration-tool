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

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.message.Message;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * Shortcut class to log messages using Log4J2.
 *
 * @author pberg
 *
 */
// abstract - just to make sure this class does not get instantiated (a private constructor would lead to the same)
public abstract class Logger {

    protected Logger() {
        // do nothing
    }

    public static void clearMulti(final String pluginId, final ILoggingKeyProvider keyProvider) {
        final BaseMessage spMessage = new BaseMessage("Cancelled", null, keyProvider, false, true, true);

        final org.apache.logging.log4j.Logger logger = LogManager.getLogger(pluginId);
        //  level will be ignored for multi-status
        logger.log(Level.WARN, spMessage);
    }

    public static void error(final String pluginId, final String message) {
        log(pluginId, Level.ERROR, message, null);
    }

    public static void error(final String pluginId, final Throwable t) {
        log(pluginId, Level.ERROR, t.getMessage(), t);
    }

    public static void error(final String pluginId, final String message, final Throwable t) {
        log(pluginId, Level.ERROR, message, t);
    }

    public static void error(final String pluginId, final ILoggingKeyProvider provider, final String msg, final Throwable e) {
        final BaseMessage message = new BaseMessage(msg, e, provider);

        log(pluginId, Level.ERROR, message);
    }

    public static void error(final String pluginId, final ILoggingKeyProvider provider, final String msg) {
        error(pluginId, provider, msg, null);
    }

    public static void warn(final String pluginId, final String message) {
        log(pluginId, Level.WARN, message, null);
    }

    public static void warn(final String pluginId, final Throwable t) {
        log(pluginId, Level.WARN, t.getMessage(), t);
    }

    public static void warn(final String pluginId, final String message, final Throwable t) {
        log(pluginId, Level.WARN, message, t);
    }

    public static void warn(final String pluginId, final ILoggingKeyProvider provider, final String msg, final Throwable e) {
        final BaseMessage message = new BaseMessage(msg, e, provider);

        log(pluginId, Level.WARN, message);
    }

    public static void warn(final String pluginId, final ILoggingKeyProvider provider, final String msg) {
        warn(pluginId, provider, msg, null);
    }

    public static void info(final String pluginId, final String message) {
        log(pluginId, Level.INFO, message, null);
    }

    public static void info(final String pluginId, final Throwable t) {
        log(pluginId, Level.INFO, t.getMessage(), t);
    }

    public static void info(final String pluginId, final String message, final Throwable t) {
        log(pluginId, Level.INFO, message, t);
    }

    public static void debug(final String pluginId, final String message) {
        log(pluginId, Level.DEBUG, message, null);
    }

    public static void debug(final String pluginId, final Throwable t) {
        log(pluginId, Level.DEBUG, t.getMessage(), t);
    }

    public static void debug(final String pluginId, final String message, final Throwable t) {
        log(pluginId, Level.DEBUG, message, t);
    }

    public static void trace(final String pluginId, final String message) {
        log(pluginId, Level.TRACE, message, null);
    }

    public static void trace(final String pluginId, final Throwable t) {
        log(pluginId, Level.TRACE, t.getMessage(), t);
    }

    public static void trace(final String pluginId, final String message, final Throwable t) {
        log(pluginId, Level.TRACE, message, t);
    }

    public static void submitMulti(final String pluginId, final ILoggingKeyProvider provider, final String msg) {
        final BaseMessage spMessage = new BaseMessage(msg, null, provider, true);

        final org.apache.logging.log4j.Logger logger = LogManager.getLogger(pluginId);
        //  level will be ignored for multi-status
        logger.log(Level.WARN, spMessage);
    }

    public static void log(final ThrowableMultiStatus multiStatus) {
        final Status status = new Status(multiStatus.getMultiStatus().getSeverity(), multiStatus.getMultiStatus().getPlugin(), multiStatus
                .getMultiStatus().getMessage(), multiStatus);
        log(status);
    }

    public static void log(final IStatus status) {
        log(status.getMessage(), status);
    }

    public static void log(final String pluginId, final int severity, final String msg, final Throwable t) {
        log(pluginId, getPriority(severity), new BaseMessage(msg, t));
    }

    public static void log(final String pluginId, final Level level, final String msg, final Throwable t) {
        log(pluginId, level, new BaseMessage(msg, t));
    }

    public static void log(final String message, final IStatus status) {
        // org.apache.log4j.Logger.getLogger(status.getPlugin()).log(getPriority(status.getSeverity()), message, status.getException());
        // Activator.getDefault().getLog().log(status); // replaced by configurable log4j appender
        log(status.getPlugin(), getPriority(status.getSeverity()), new BaseMessage(message, status.getException()));
    }

    public static void log(final String loggerId, final Level level, final Message message) {
        final org.apache.logging.log4j.Logger logger = LogManager.getLogger(loggerId);
        logger.log(level, message, message.getThrowable());
    }

    public static void logNonEclipse(final String pluginId, final Level level, final String msg, final Throwable t) {
        final BaseMessage spMessage = new BaseMessage(msg, t, true);

        log(pluginId, level, spMessage);
    }

    public static Level getPriority(final int severity) {
        switch (severity) {
        case IStatus.WARNING:
            return Level.WARN;
        case IStatus.INFO:
            return Level.INFO;
        case IStatus.ERROR:
            return Level.ERROR;
        case IStatus.CANCEL:
            return Level.FATAL;
        case IStatus.OK:
            return Level.DEBUG;
        default:
            return Level.TRACE;
        }
    }

    public static int getSeverity(final Level level) {
        if (level == Level.WARN) {
            return IStatus.WARNING;
        } else if (level == Level.ERROR) {
            return IStatus.ERROR;
        } else if (level == Level.INFO) {
            return IStatus.INFO;
        } else if (level == Level.ALL) {
            return IStatus.OK;
        } else if (level == Level.DEBUG) {
            return IStatus.OK;
        } else if (level == Level.FATAL) {
            return IStatus.ERROR;
        } else if (level == Level.TRACE) {
            return IStatus.OK;
        } else if (level == Level.OFF) {
            return IStatus.OK;
        } else {
            return IStatus.OK;
        }
    }

}
