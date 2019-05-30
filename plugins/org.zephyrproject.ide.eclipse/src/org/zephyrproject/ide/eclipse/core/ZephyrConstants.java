/*
 * Copyright (c) 2019 Intel Corporation
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.zephyrproject.ide.eclipse.core;

import static org.zephyrproject.ide.eclipse.core.ZephyrStrings.PATH;
import static org.zephyrproject.ide.eclipse.core.ZephyrStrings.TOOLCHAIN;

/**
 * Constants used throughout the plugin.
 */
public final class ZephyrConstants {

	public static final String ZEPHYR_BOARD = "BOARD"; //$NON-NLS-1$

	public static final String ZEPHYR_BASE = "ZEPHYR_BASE"; //$NON-NLS-1$
	public static final String ZEPHYR_BASE_DESC = "Zephyr Base";
	public static final String ZEPHYR_BASE_DESC_DIR =
			String.join(" ", ZEPHYR_BASE_DESC, PATH);
	public static final String ZEPHYR_BASE_LOCATION = "ZEPHYR_BASE_LOCATION"; //$NON-NLS-1$

	public static final String ZEPHYR_TOOLCHAIN_VARIANT =
			"ZEPHYR_TOOLCHAIN_VARIANT"; //$NON-NLS-1$

	public static final String ZEPHYR_TOOLCHAIN_VARIANT_ZEPHYR = "zephyr"; //$NON-NLS-1$
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_ZEPHYR_DESC =
			"Zephyr SDK";
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_ZEPHYR_DESC_DIR = String
			.join(" ", ZEPHYR_TOOLCHAIN_VARIANT_ZEPHYR_DESC, "Install", PATH);
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_ZEPHYR_ENV =
			"ZEPHYR_SDK_INSTALL_DIR"; //$NON-NLS-1$

	public static final String ZEPHYR_TOOLCHAIN_VARIANT_XTOOLS = "xtools"; //$NON-NLS-1$
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_XTOOLS_DESC =
			"Crosstool-NG";
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_XTOOLS_DESC_DIR = String
			.join(" ", ZEPHYR_TOOLCHAIN_VARIANT_XTOOLS_DESC, TOOLCHAIN, PATH);
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_XTOOLS_ENV =
			"XTOOLS_TOOLCHAIN_PATH"; //$NON-NLS-1$

	public static final String ZEPHYR_TOOLCHAIN_VARIANT_GNUARMEMB = "gnuarmemb"; //$NON-NLS-1$
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_GNUARMEMB_DESC =
			"GNU ARM Embedded Toolchain";
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_GNUARMEMB_DESC_DIR =
			String.join(" ", ZEPHYR_TOOLCHAIN_VARIANT_GNUARMEMB_DESC, PATH);
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_GNUARMEMB_ENV =
			"GNUARMEMB_TOOLCHAIN_PATH"; //$NON-NLS-1$

	public static final String ZEPHYR_TOOLCHAIN_VARIANT_ISSM = "issm"; //$NON-NLS-1$
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_ISSM_DESC =
			"Intel System Studio for Microcontrollers";
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_ISSM_DESC_DIR =
			String.join(" ", "ISSM", "Installation", PATH);
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_ISSM_ENV =
			"ISSM_INSTALLATION_PATH"; //$NON-NLS-1$

	public static final String ZEPHYR_TOOLCHAIN_VARIANT_CROSS_COMPILE =
			"cross-compiler"; //$NON-NLS-1$
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_CROSS_COMPILE_DESC =
			"Cross Compile";
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_CROSS_COMPILE_DESC_PREFIX =
			String.join(" ", ZEPHYR_TOOLCHAIN_VARIANT_CROSS_COMPILE_DESC,
					"Prefix");
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_CROSS_COMPILE_ENV =
			"CROSS_COMPILE"; //$NON-NLS-1$

	public static final String ZEPHYR_TOOLCHAIN_VARIANT_CUSTOM =
			"Custom CMake Toolchain"; //$NON-NLS-1$
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_CUSTOM_DESC =
			"Custom CMake Toolchain";
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_CUSTOM_DESC_DIR =
			String.join(" ", ZEPHYR_TOOLCHAIN_VARIANT_CUSTOM_DESC, PATH);
	public static final String ZEPHYR_TOOLCHAIN_VARIANT_CUSTOM_ENV =
			"TOOLCHAIN_ROOT"; //$NON-NLS-1$

	public static final String[] ZEPHYR_TOOLCHAIN_DESC_LIST = {
		ZEPHYR_TOOLCHAIN_VARIANT_ZEPHYR_DESC,
		ZEPHYR_TOOLCHAIN_VARIANT_XTOOLS_DESC,
		ZEPHYR_TOOLCHAIN_VARIANT_GNUARMEMB_DESC,
		ZEPHYR_TOOLCHAIN_VARIANT_ISSM_DESC,
		ZEPHYR_TOOLCHAIN_VARIANT_CROSS_COMPILE_DESC,
		ZEPHYR_TOOLCHAIN_VARIANT_CUSTOM_DESC
	};

	public static final String DEFAULT_BUILD_DIR = "build"; //$NON-NLS-1$

	public static final String DEFAULT_SRC_DIR = "src"; //$NON-NLS-1$

	public static final String CMAKE_GENERATOR = "CMAKE_GENERATOR"; //$NON-NLS-1$
	public static final String CMAKE_GENERATOR_DESC = "CMake Generator"; //$NON-NLS-1$
	public static final String CMAKE_GENERATOR_MAKEFILE = "Unix Makefiles"; //$NON-NLS-1$
	public static final String CMAKE_GENERATOR_NINJA = "Ninja"; //$NON-NLS-1$

	public static final String[] CMAKE_GENERATOR_LIST = {
		CMAKE_GENERATOR_NINJA,
		CMAKE_GENERATOR_MAKEFILE
	};

	public static class Launch {
		public static final String LAUNCH_ID =
				ZephyrPlugin.PLUGIN_ID + ".ui.launch"; //$NON-NLS-1$

		public static final String ATTR_COMMAND_SELECTION =
				LAUNCH_ID + ".COMMAND_SELECTION"; //$NON-NLS-1$

		public static final String COMMAND_SELECTION_EMULATOR =
				"CMD_SEL_EMULATOR"; //$NON-NLS-1$

		public static final String COMMAND_SELECTION_FLASHTGT =
				"CMD_SEL_FLASHTGT"; //$NON-NLS-1$

		public static final String COMMAND_SELECTION_CUSTOM = "CMD_SEL_CUSTOM"; //$NON-NLS-1$

		public static final String ATTR_CUSTOM_COMMAND =
				LAUNCH_ID + ".CUSTOM_COMMAND"; //$NON-NLS-1$
	};

}
