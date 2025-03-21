/*
 * generated by Xtext 2.28.0
 */
package com.wamas.ide.launching.ui;

import com.google.inject.Injector;
import com.wamas.ide.launching.ui.internal.LaunchingActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LcDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(LaunchingActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		LaunchingActivator activator = LaunchingActivator.getInstance();
		return activator != null ? activator.getInjector(LaunchingActivator.COM_WAMAS_IDE_LAUNCHING_LCDSL) : null;
	}

}
