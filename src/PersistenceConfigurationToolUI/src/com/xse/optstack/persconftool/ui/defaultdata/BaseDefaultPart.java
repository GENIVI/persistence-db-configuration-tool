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

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import com.xse.eclipseui.LayoutHelper;
import com.xse.eclipseui.util.Logger;
import com.xse.eclipseui.util.StringUtils;
import com.xse.eclipseui.widgets.CaptionText;
import com.xse.eclipseui.widgets.IPathChangedListener;
import com.xse.eclipseui.widgets.PathSelectionControl;
import com.xse.eclipseui.widgets.validators.IntegerValidator;
import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;
import com.xse.optstack.persconf.EDefaultDataType;
import com.xse.optstack.persconf.EResource;
import com.xse.optstack.persconf.PersconfPackage;
import com.xse.optstack.persconftool.ui.AbstractPersistablePart;
import com.xse.optstack.persconftool.ui.Activator;

public abstract class BaseDefaultPart extends AbstractPersistablePart {

    protected final Adapter notificationAdapter = new AdapterImpl() {
        @Override
        public void notifyChanged(final Notification msg) {
            BaseDefaultPart.this.part.setDirty(true);
        }
    };

    protected final DataBindingContext bindingContext;

    private EResource activeResource;

    protected CaptionText sizeText;
    protected CaptionText dataText;
    protected CaptionText fileNameText;

    @Inject
    private MPart part;

    protected PathSelectionControl pathSelectionControl;

    private StackLayout layout;

    private Composite stackComposite;
    private Composite pathComposite;
    private Composite keyValueComposite;

    private final AdapterImpl typeChangedAdapter;

    public BaseDefaultPart() {
        this.bindingContext = new DataBindingContext();

        this.typeChangedAdapter = new AdapterImpl() {
            @Override
            public void notifyChanged(final Notification msg) {
                if (msg.getNewValue() instanceof EDefaultDataType) {
                    BaseDefaultPart.this.changeDataType((EDefaultDataType) msg.getNewValue());
                }
            }
        };
    }

    @PostConstruct
    public void postConstruct(final Composite parent) {
        parent.setLayout(new GridLayout(1, false));
        parent.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_LIST_BACKGROUND));

        this.stackComposite = new Composite(parent, SWT.NONE);
        final GridData keyValueGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        this.stackComposite.setLayoutData(keyValueGridData);
        this.layout = new StackLayout();
        this.stackComposite.setLayout(this.layout);

        this.keyValueComposite = LayoutHelper.createDefaultGridComposite(this.stackComposite, SWT.NONE, 1, false, SWT.FILL, SWT.FILL, true,
                true);

        this.sizeText = new CaptionText(this.keyValueComposite, SWT.NONE, "Size", 35, 0);
        this.sizeText.setLayoutData(BaseDefaultPart.createControlGridData());
        this.sizeText.setValidator(new IntegerValidator(true, "Value needs to be a valid integer number!"));

        this.dataText = new CaptionText(this.keyValueComposite, SWT.NONE, "Data", 30, 0);
        this.dataText.setLayoutData(BaseDefaultPart.createControlGridData());

        this.pathComposite = LayoutHelper.createDefaultGridComposite(this.stackComposite, SWT.NONE, 1, false, SWT.FILL, SWT.FILL, true,
                true);

        this.pathSelectionControl = new PathSelectionControl(this.pathComposite, SWT.NONE, "Local", "", 24, SWT.NONE);
        this.pathSelectionControl.setLayoutData(BaseDefaultPart.createControlGridData());

        this.fileNameText = new CaptionText(this.pathComposite, SWT.NONE, "File", 36, 0);
        this.fileNameText.setLayoutData(BaseDefaultPart.createControlGridData());

        this.pathSelectionControl.addPathChangedListener(new IPathChangedListener() {
            @Override
            public void pathChanged(final String oldPath, final String newPath) {
                if ((BaseDefaultPart.this.activeResource.getConfiguration().getType() == EDefaultDataType.FILE)
                        && !StringUtils.isEmpty(newPath)) {
                    BaseDefaultPart.this.fileNameText.setText(FilenameUtils.getName(newPath));
                }
            }
        });

        this.setEnabledState(false);
    }

    private static GridData createControlGridData() {
        return new GridData(SWT.FILL, SWT.CENTER, true, false);
    }

    @Inject
    public void setInput(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EResource resource) {
        if ((resource != null) && (this.activeResource != resource)) {
            if (this.activeResource != null) {
                this.activeResource.getConfiguration().eAdapters().remove(this.typeChangedAdapter);
            }
            this.activeResource = resource;
            this.activeResource.getConfiguration().eAdapters().add(this.typeChangedAdapter);
            this.changeDataType(this.activeResource.getConfiguration().getType());

            this.clearBindings();

            this.bindValues(resource);

            this.setEnabledState(true);
        } else {
            this.clearBindings();
            this.setEnabledState(false);
            this.clearValues();
        }
    }

    private void changeDataType(final EDefaultDataType type) {
        switch (type) {
        case FILE:
            BaseDefaultPart.this.layout.topControl = BaseDefaultPart.this.pathComposite;
            break;
        case KEY_VALUE:
            BaseDefaultPart.this.layout.topControl = BaseDefaultPart.this.keyValueComposite;
            break;
        default:
            Logger.error(Activator.PLUGIN_ID, "Unsupported default data configuration type!");
            break;
        }
        BaseDefaultPart.this.stackComposite.layout();
    }

    protected void bindValues(final EResource resource) {
        this.bindingContext.bindValue(WidgetProperties.text(SWT.Modify).observe(this.fileNameText.getTextControl()),
                EMFProperties.value(PersconfPackage.Literals.ERESOURCE__NAME).observe(resource));
    }

    @Inject
    public void setInput(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EObject activeObject) {
        if ((activeObject instanceof EApplicationGroup) || (activeObject instanceof EApplication)) {
            this.clearBindings();
            this.clearValues();

            this.setEnabledState(false);

            this.activeResource = null;
        }
    }

    private void clearValues() {
        if ((this.sizeText != null) && !this.sizeText.isDisposed()) {
            this.sizeText.setText("");
            this.dataText.setText("");
        }
    }

    private void setEnabledState(final boolean enabled) {
        if ((this.sizeText != null) && !this.sizeText.isDisposed()) {
            this.sizeText.setEnabled(enabled);
            this.dataText.setEnabled(enabled);
            this.pathSelectionControl.setEnabled(enabled);
            this.fileNameText.setEnabled(enabled);
        }
    }

    private void clearBindings() {
        this.bindingContext.dispose();
    }

}
