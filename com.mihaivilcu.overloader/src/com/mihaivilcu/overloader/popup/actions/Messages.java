package com.mihaivilcu.overloader.popup.actions;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.mihaivilcu.overloader.popup.actions.messages"; //$NON-NLS-1$
	public static String OverloadFile_error_title;
	public static String OverloadFile_select_destinaion;
	public static String OverloadFile_selectbox_message;
	public static String OverloadFile_success_message;
	public static String OverloadFile_success_title;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
