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
package com.xse.optstack.persconftool.ui.configuration;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerValueProperty;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import com.xse.eclipseui.widgets.CaptionText;
import com.xse.eclipseui.widgets.ComboBoxWidget;
import com.xse.eclipseui.widgets.validators.StringValidator;
import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;
import com.xse.optstack.persconf.EConfiguration;
import com.xse.optstack.persconf.EDefaultDataType;
import com.xse.optstack.persconf.EPermission;
import com.xse.optstack.persconf.EPolicy;
import com.xse.optstack.persconf.EResource;
import com.xse.optstack.persconf.EStorage;
import com.xse.optstack.persconf.PersconfPackage;
import com.xse.optstack.persconftool.ui.AbstractPersistablePart;

public class ConfigurationPart extends AbstractPersistablePart {

    private static final int MIN_COMBO_WIDTH = 130;
    private static final int CAPTION_MARGIN = 80;

    private final DataBindingContext bindingContext;

    private ComboBoxWidget<EPolicy> policyWidget;
    private ComboBoxWidget<EPermission> permissionWidget;
    private ComboBoxWidget<EStorage> storageWidget;
    private ComboBoxWidget<EDefaultDataType> typeWidget;

    private CaptionText maxSizeText;
    private CaptionText responsibleText;
    private CaptionText customNameText;
    private CaptionText customIdText;

    private EResource activeResource;

    public ConfigurationPart() {
        this.bindingContext = new DataBindingContext();
    }

    @PostConstruct
    public void postConstruct(final Composite parent) {
        // TODO: switch to FormLayout
        parent.setLayout(new GridLayout(1, false));
        parent.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_LIST_BACKGROUND));

        this.policyWidget = new ComboBoxWidget<>(parent, SWT.NONE, "Policy", CAPTION_MARGIN, MIN_COMBO_WIDTH, Arrays.asList(EPolicy
                .values()));
        this.policyWidget.setLayoutData(ConfigurationPart.createControlGridData());

        this.permissionWidget = new ComboBoxWidget<>(parent, SWT.NONE, "Permission", CAPTION_MARGIN, MIN_COMBO_WIDTH,
                Arrays.asList(EPermission.values()));
        this.permissionWidget.setLayoutData(ConfigurationPart.createControlGridData());

        this.storageWidget = new ComboBoxWidget<>(parent, SWT.NONE, "Storage", CAPTION_MARGIN, MIN_COMBO_WIDTH, Arrays.asList(EStorage
                .values()));
        this.storageWidget.setLayoutData(ConfigurationPart.createControlGridData());

        this.maxSizeText = new CaptionText(parent, SWT.NONE, "Max Size", 37, 0);
        this.maxSizeText.setLayoutData(ConfigurationPart.createControlGridData());
        this.maxSizeText.setValidator(new StringValidator(true, "A value for the max. size needs to be entered!"));

        this.responsibleText = new CaptionText(parent, SWT.NONE, "Responsible", 19, 0);
        this.responsibleText.setLayoutData(ConfigurationPart.createControlGridData());
        this.responsibleText.setValidator(new StringValidator(true, "A value for Responsible needs to be entered!"));

        this.customNameText = new CaptionText(parent, SWT.NONE, "Custom Name", 5, 0);
        this.customNameText.setLayoutData(ConfigurationPart.createControlGridData());
        this.customNameText.setValidator(new StringValidator(true, "A value for Custom Name needs to be entered!"));

        this.typeWidget = new ComboBoxWidget<>(parent, SWT.NONE, "Type", CAPTION_MARGIN, MIN_COMBO_WIDTH, Arrays.asList(EDefaultDataType
                .values()));
        this.typeWidget.setLayoutData(ConfigurationPart.createControlGridData());

        this.customIdText = new CaptionText(parent, SWT.NONE, "Custom ID", 26, 0);
        this.customIdText.setLayoutData(ConfigurationPart.createControlGridData());
        this.customIdText.setValidator(new StringValidator(true, "A value for Custom ID needs to be entered!"));

        this.setEnabledState(false);
    }

    private static GridData createControlGridData() {
        return new GridData(SWT.FILL, SWT.CENTER, true, false);
    }

    @Inject
    public void setInput(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EResource resource, final MPart part) {
        if ((resource != null) && (this.activeResource != resource)) {
            this.activeResource = resource;

            final EConfiguration configuration = resource.getConfiguration();
            this.clearBindings();

            configuration.eAdapters().add(new AdapterImpl() {
                @Override
                public void notifyChanged(final Notification msg) {
                    part.setDirty(true);
                }
            });

            final IViewerValueProperty singleSelection = ViewerProperties.singleSelection();
            this.bindingContext.bindValue(singleSelection.observe(this.policyWidget.getViewer()),
                    EMFProperties.value(PersconfPackage.Literals.ECONFIGURATION__POLICY).observe(configuration));
            this.bindingContext.bindValue(singleSelection.observe(this.permissionWidget.getViewer()),
                    EMFProperties.value(PersconfPackage.Literals.ECONFIGURATION__PERMISSION).observe(configuration));
            this.bindingContext.bindValue(singleSelection.observe(this.storageWidget.getViewer()),
                    EMFProperties.value(PersconfPackage.Literals.ECONFIGURATION__STORAGE).observe(configuration));

            this.bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observe(this.maxSizeText.getTextControl()), EMFProperties
                    .value(PersconfPackage.Literals.ECONFIGURATION__MAX_SIZE).observe(configuration));
            this.bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observe(this.responsibleText.getTextControl()), EMFProperties
                    .value(PersconfPackage.Literals.ECONFIGURATION__RESPONSIBLE).observe(configuration));
            this.bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observe(this.customNameText.getTextControl()), EMFProperties
                    .value(PersconfPackage.Literals.ECONFIGURATION__CUSTOM_NAME).observe(configuration));
            this.bindingContext.bindValue(singleSelection.observe(this.typeWidget.getViewer()),
                    EMFProperties.value(PersconfPackage.Literals.ECONFIGURATION__TYPE).observe(configuration));
            this.bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observe(this.customIdText.getTextControl()), EMFProperties
                    .value(PersconfPackage.Literals.ECONFIGURATION__CUSTOM_ID).observe(configuration));

            this.setEnabledState(true);

            this.customIdText.isValid();
            this.customNameText.isValid();
            this.maxSizeText.isValid();
            this.responsibleText.isValid();
        } else {
            this.clearBindings();
            this.setEnabledState(false);
            this.clearValues();
        }
    }

    @Inject
    public void setInput(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EObject activeGroup) {
        if ((activeGroup instanceof EApplicationGroup) || (activeGroup instanceof EApplication)) {
            this.clearBindings();
            this.policyWidget.setValue(null);
            this.storageWidget.setValue(null);
            this.permissionWidget.setValue(null);
            this.maxSizeText.setText("");
            this.responsibleText.setText("");
            this.customNameText.setText("");
            this.typeWidget.setValue(null);
            this.customIdText.setText("");

            this.setEnabledState(false);

            this.activeResource = null;
        }
    }

    private void clearValues() {
        if ((this.policyWidget != null) && !this.policyWidget.isDisposed()) {
            this.policyWidget.setValue(null);
            this.permissionWidget.setValue(null);
            this.storageWidget.setValue(null);
            this.maxSizeText.setText("");
            this.responsibleText.setText("");
            this.customNameText.setText("");
            this.typeWidget.setValue(null);
            this.customIdText.setText("");
        }
    }

    private void setEnabledState(final boolean enabled) {
        if ((this.policyWidget != null) && !this.policyWidget.isDisposed()) {
            this.policyWidget.setEnabled(enabled);
            this.storageWidget.setEnabled(enabled);
            this.permissionWidget.setEnabled(enabled);
            this.maxSizeText.setEnabled(enabled);
            this.responsibleText.setEnabled(enabled);
            this.customNameText.setEnabled(enabled);
            this.typeWidget.setEnabled(enabled);
            this.customIdText.setEnabled(enabled);
        }
    }

    private void clearBindings() {
        this.bindingContext.dispose();
    }

}
