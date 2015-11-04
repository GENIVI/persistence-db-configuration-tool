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

public interface ILoggingKeyProvider {

    String MULTI_STATUS_GROUP_ID = "defaultMultiStatusGroupId";

    String getLoggingKey();

    default String getMultiStatusGroupId() {
        return MULTI_STATUS_GROUP_ID;
    }

}
