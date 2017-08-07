/*
 * generated by Xtext 2.12.0
 */
package com.wamas.ide.launching.formatting2

import com.wamas.ide.launching.lcDsl.AddFeature
import com.wamas.ide.launching.lcDsl.AddPlugin
import com.wamas.ide.launching.lcDsl.EnvironmentVariable
import com.wamas.ide.launching.lcDsl.GroupMember
import com.wamas.ide.launching.lcDsl.IgnorePlugin
import com.wamas.ide.launching.lcDsl.LCModel
import com.wamas.ide.launching.lcDsl.LaunchConfig
import com.wamas.ide.launching.lcDsl.ProgramArgument
import com.wamas.ide.launching.lcDsl.TraceEnablement
import com.wamas.ide.launching.lcDsl.VmArgument
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class LcDslFormatter extends AbstractFormatter2 {
	
	def dispatch void format(LCModel lCModel, extension IFormattableDocument document) {
		for (LaunchConfig launchConfig : lCModel.getConfigurations()) {
			launchConfig.format;
		}
	}

	def dispatch void format(LaunchConfig launchConfig, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc.
		launchConfig.regionFor.keyword("{").append[newLine]
		launchConfig.regionFor.keyword("}").prepend[newLine]
		 
		launchConfig.getClears.format;
		launchConfig.getWorkspace.format;
		launchConfig.getWorkingDir.format;
		launchConfig.getMemory.format;
		launchConfig.getMainProject.format;
		launchConfig.getMainType.format;
		launchConfig.getApplication.format;
		launchConfig.getProduct.format;
		launchConfig.getFavorites.format;
		launchConfig.getRedirect.format;
		launchConfig.getExecEnv.format;
		launchConfig.getConfigIniTemplate.format;
		launchConfig.getJavaMainSearch.format;
		launchConfig.getServletConfig.format;
		launchConfig.getContentProviderProduct.format;
		for (AddPlugin addPlugin : launchConfig.getPlugins()) {
			addPlugin.format;
		}
		for (AddFeature addFeature : launchConfig.getFeatures()) {
			addFeature.format;
		}
		for (IgnorePlugin ignorePlugin : launchConfig.getIgnore()) {
			ignorePlugin.format;
		}
		for (GroupMember groupMember : launchConfig.getGroupMembers()) {
			groupMember.format;
		}
		for (VmArgument vmArgument : launchConfig.getVmArgs()) {
			vmArgument.format;
		}
		for (ProgramArgument programArgument : launchConfig.getProgArgs()) {
			programArgument.format;
		}
		for (EnvironmentVariable environmentVariable : launchConfig.getEnvVars()) {
			environmentVariable.format;
		}
		for (TraceEnablement traceEnablement : launchConfig.getTraces()) {
			traceEnablement.format;
		}
	}
	
	// TODO: implement for Workspace, WorkingDir, MainProject, MainType, AddPlugin, AddFeature, ContentProviderProduct, IgnorePlugin, VmArgument, ProgramArgument, EnvironmentVariable, Redirect, ConfigIniTemplate, ExistingPath, AnyPath, PluginWithVersionAndStartLevel, GroupMember
}