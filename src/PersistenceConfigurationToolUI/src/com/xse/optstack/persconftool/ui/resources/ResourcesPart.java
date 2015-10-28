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
package com.xse.optstack.persconftool.ui.resources;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;
import com.xse.optstack.persconf.EResource;
import com.xse.optstack.persconftool.ui.AbstractPersistablePart;

public class ResourcesPart extends AbstractPersistablePart {

    private ResourcesTable tableViewer;

    @Inject
    @Active
    private ESelectionService selectionService;

    private EApplication activeApplication;

    private final Adapter notificationAdapter;

    public ResourcesPart() {
        this.notificationAdapter = new AdapterImpl() {
            @Override
            public void notifyChanged(final Notification msg) {
                if ((ResourcesPart.this.tableViewer != null) && !ResourcesPart.this.tableViewer.getTable().isDisposed()) {
                    ResourcesPart.this.tableViewer.getViewer().refresh();
                }
            }
        };
    }

    @PostConstruct
    public void postConstruct(final Composite parent, final EMenuService menuService) {
        parent.setLayout(new GridLayout(1, false));

        this.tableViewer = new ResourcesTable(parent);
        this.tableViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));

        this.tableViewer.setContentProvider(new ResourcesContentProvider());
        this.tableViewer.setLabelProvider(new ResourcesLabelProvider());

        this.tableViewer.getViewer().addSelectionChangedListener(event -> {
            final IStructuredSelection selection = (IStructuredSelection) ResourcesPart.this.tableViewer.getViewer().getSelection();
            ResourcesPart.this.selectionService.setSelection(selection.getFirstElement());
        });

        menuService.registerContextMenu(this.tableViewer.getTable(), "com.xse.optstack.persconftool.part.resources.popupmenu");
    }

    @Inject
    public void setInput(@Optional final Resource resource) {
        if (resource != null) {
            this.tableViewer.setInput(null);
        }
    }

    @Inject
    public void setInput(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EApplication application, final MPart part) {
        if ((application != null) && (this.activeApplication != application)) {
            if (this.activeApplication != null) {
                this.activeApplication.eAdapters().remove(this.notificationAdapter);
            }
            this.activeApplication = application;

            this.tableViewer.setInput(application);

            final Adapter resNotificationAdapter = new AdapterImpl() {
                @Override
                public void notifyChanged(final Notification msg) {
                    if (ResourcesPart.this.tableViewer != null) {
                        ResourcesPart.this.tableViewer.getViewer().refresh(msg.getNotifier(), true);
                        part.setDirty(true);
                    }
                }
            };

            final Adapter appNotificationAdapter = new AdapterImpl() {
                @Override
                public void notifyChanged(final Notification msg) {
                    if (ResourcesPart.this.tableViewer != null) {
                        ResourcesPart.this.tableViewer.getViewer().refresh(true);
                        part.setDirty(true);

                        if (msg.getEventType() == Notification.ADD) {
                            if (msg.getNewValue() instanceof EResource) {
                                ((EResource) msg.getNewValue()).eAdapters().add(resNotificationAdapter);
                            }
                        }
                    }
                }
            };

            application.getResources().forEach(r -> r.eAdapters().add(resNotificationAdapter));
            application.eAdapters().add(appNotificationAdapter);

            application.eAdapters().add(this.notificationAdapter);
        }
    }

    @Inject
    public void setInput(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final EApplicationGroup activeGroup) {
        if (activeGroup != null) {
            this.tableViewer.setInput(null);
            this.activeApplication = null;
        }
    }

    @Focus
    public void setFocus() {
        this.tableViewer.getTable().setFocus();
    }

}
