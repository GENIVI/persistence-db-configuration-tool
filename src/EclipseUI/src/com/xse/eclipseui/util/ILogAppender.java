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

import org.apache.logging.log4j.core.LogEvent;

/**
 * Interface that needs to be implemented by all classes that want to serve as a LogAppender handled
 * by {@link DynamicLogAppender}.
 * 
 * @author pberg
 * 
 */
public interface ILogAppender {

    void log(String appenderId, LogEvent event);

}
