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
package com.xse.optstack.persconftool.ui.defaultdata;

import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;

import com.xse.optstack.persconf.EConfiguration;
import com.xse.optstack.persconf.EResource;
import com.xse.optstack.persconf.PersconfPackage;

public class FactoryDefaultPart extends BaseDefaultPart {

    @Override
    protected void bindValues(final EResource resource) {
        final EConfiguration configuration = resource.getConfiguration();

        configuration.getFactoryDefault().eAdapters().add(this.notificationAdapter);

        super.bindValues(resource);

        this.bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observe(this.sizeText.getTextControl()),
                EMFProperties.value(PersconfPackage.Literals.EDEFAULT_DATA__SIZE).observe(configuration.getFactoryDefault()));
        this.bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observe(this.dataText.getTextControl()),
                EMFProperties.value(PersconfPackage.Literals.EDEFAULT_DATA__DATA).observe(configuration.getFactoryDefault()));

        this.bindingContext
        .bindValue(
                WidgetProperties.text(SWT.Modify).observe(this.pathSelectionControl.getTextControl().getTextControl()),
                EMFProperties.value(PersconfPackage.Literals.EDEFAULT_DATA__LOCAL_RESOURCE_PATH).observe(
                        configuration.getFactoryDefault()));
    }

}
