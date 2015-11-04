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
package com.xse.eclipseui.table;

import java.util.List;

import org.eclipse.jface.viewers.ILazyContentProvider;

public interface IExtendedLazyTableContentProvider extends ILazyContentProvider {

    List<?> getRootItems();

    void initContent();

}
