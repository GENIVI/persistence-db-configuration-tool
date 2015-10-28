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

import java.io.Serializable;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.xse.eclipseui.Activator;
import com.xse.eclipseui.util.Logger;

/**
 * Log4J2 LogAppender that redirects logging requests to the Eclipse logging system (e.g. ErrorLog
 * view).
 * <b>Caution: This class does currently does not work, as log4j2 seems not be able to locate
 * appenders in bundles other than the one the log4j jars are located in. -> Bundle-Classloader
 * issue (Buddy-Mechanism does not help in this case).</b>
 *
 * @see "https://issues.apache.org/jira/browse/LOG4J2-95?jql=project%20%3D%20LOG4J2%20AND%20issuetype%20in%20%28Bug%2C%20Question%29%20AND%20text%20~%20osgi"
 *
 * @author pberg
 * @see "https://logging.apache.org/log4j/2.x/manual/extending.html#Appenders"
 */
@Plugin(name = "EclipseLogAppender", category = "Core", elementType = "appender", printObject = true)
public class Log4j2EclipseLogAppender extends AbstractAppender {

    private static final long serialVersionUID = 1635042385985553296L;

    @PluginFactory
    public static Log4j2EclipseLogAppender createAppender(@PluginAttribute("name") final String name,
            @PluginElement("Layout") Layout<?> layout, @PluginElement("Filters") final Filter filter) {

        if (name == null) {
            Logger.error(Activator.PLUGIN_ID, "No name provided for EclipseLogAppender");
            return null;
        }

        //        final StubManager manager = StubManager.getStubManager(name);
        //        if (manager == null) {
        //            return null;
        //        }
        if (layout == null) {
            layout = PatternLayout.createDefaultLayout();
        }
        return new Log4j2EclipseLogAppender(name, filter, layout);
    }

    public Log4j2EclipseLogAppender(final String name, final Filter filter, final Layout<? extends Serializable> layout) {
        super(name, filter, layout);
    }

    @Override
    public void append(final LogEvent event) {
        final IStatus status = new Status(Log4j2EclipseLogAppender.getSeverity(event.getLevel()), event.getLoggerName(), event.getMessage()
                .getFormattedMessage());
        Activator.getDefault().getLog().log(status);
    }

    /**
     * Map LoggingEvent's level to {@link IStatus} severity.
     *
     * @param ev
     * @return
     */
    private static int getSeverity(final Level level) {
        if ((level == Level.FATAL) || (level == Level.ERROR)) {
            return IStatus.ERROR;
        } else if (level == Level.WARN) {
            return IStatus.WARNING;
        } else if (level == Level.INFO) {
            return IStatus.INFO;
        } else {
            return IStatus.OK;
        }
    }

}
