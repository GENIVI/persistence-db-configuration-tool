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
package com.xse.optstack.persconftool.ui.applications;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.xse.optstack.persconf.EApplication;
import com.xse.optstack.persconf.EApplicationGroup;
import com.xse.optstack.persconftool.ui.AbstractPersistablePart;

public class ApplicationsPart extends AbstractPersistablePart {

    @Inject
    @Active
    private ESelectionService selectionService;

    private ApplicationsTree applicationsTree;

    @PostConstruct
    public void createComposite(final Composite parent, final EMenuService menuService) {
        parent.setLayout(new GridLayout(1, false));

        this.applicationsTree = new ApplicationsTree(parent);
        this.applicationsTree.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));

        this.applicationsTree.setContentProvider(new ApplicationsContentProvider());
        this.applicationsTree.setLabelProvider(new ApplicationsLabelProvider());
        this.applicationsTree.getViewer().setAutoExpandLevel(2);

        this.applicationsTree.getViewer().addSelectionChangedListener(
                event -> {
                    final IStructuredSelection selection = (IStructuredSelection) ApplicationsPart.this.applicationsTree.getViewer()
                            .getSelection();
                    ApplicationsPart.this.selectionService.setSelection(selection.getFirstElement());
                });

        menuService.registerContextMenu(this.applicationsTree.getTree(), "com.xse.optstack.persconftool.part.applications.popupmenu");
    }

    @Inject
    public void setInput(@Optional final Resource resource, final MPart part, final MWindow window) {
        if (resource != null) {
            if (resource.getURI() != null) {
                window.setLabel(resource.getURI().toFileString() + " - " + APPLICATION_TITLE);
            }

            this.applicationsTree.getViewer().setInput(resource);

            final Adapter appNotificationAdapter = new AdapterImpl() {
                @Override
                public void notifyChanged(final Notification msg) {
                    if (ApplicationsPart.this.applicationsTree != null) {
                        ApplicationsPart.this.applicationsTree.getViewer().refresh(msg.getNotifier(), true);
                        part.setDirty(true);
                    }
                }
            };

            final Adapter appGroupNotificationAdapter = new AdapterImpl() {
                @Override
                public void notifyChanged(final Notification msg) {
                    if (ApplicationsPart.this.applicationsTree != null) {
                        ApplicationsPart.this.applicationsTree.getViewer().refresh(msg.getNotifier(), false);
                        part.setDirty(true);

                        if (msg.getEventType() == Notification.ADD) {
                            if (msg.getNewValue() instanceof EApplication) {
                                ((EApplication) msg.getNewValue()).eAdapters().add(appNotificationAdapter);
                            }
                        }
                    }
                }
            };

            for (final EObject eObject : resource.getContents()) {
                if (eObject instanceof EApplicationGroup) {
                    eObject.eAdapters().add(appGroupNotificationAdapter);

                    ((EApplicationGroup) eObject).getApplications().forEach(a -> a.eAdapters().add(appNotificationAdapter));
                }
            }
        }
    }

    public TreeViewer getViewer() {
        return this.applicationsTree.getViewer();
    }

    @Focus
    public void setFocus() {
        this.applicationsTree.getTree().setFocus();
    }

}
