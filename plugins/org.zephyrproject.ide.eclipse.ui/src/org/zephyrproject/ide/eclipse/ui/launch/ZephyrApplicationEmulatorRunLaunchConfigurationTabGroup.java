/*
 * Copyright (c) 2019 Intel Corporation
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.zephyrproject.ide.eclipse.ui.launch;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.zephyrproject.ide.eclipse.ui.launch.tabs.EmulatorRunLaunchMainTab;

public class ZephyrApplicationEmulatorRunLaunchConfigurationTabGroup
		extends AbstractLaunchConfigurationTabGroup {

	public ZephyrApplicationEmulatorRunLaunchConfigurationTabGroup() {
		super();
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		List<ILaunchConfigurationTab> tabs = new ArrayList<>();

		if (mode.equals(ILaunchManager.RUN_MODE)) {
			tabs.add(new EmulatorRunLaunchMainTab());
		}

		setTabs(tabs.toArray(new ILaunchConfigurationTab[0]));
	}

}
