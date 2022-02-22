/* $Id: KermetaExampleWizard.java,v 1.2 2008-10-30 16:45:57 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : KermetaExampleWizard.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Authors : 
 *        	dvojtise <dvojtise@irisa.fr>
 */
package org.gemoc.activitydiagram.sampledeployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.gemoc.activitydiagram.sampledeployer.Activator;


public class ActivityDiagramSequentialLanguageExampleWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		
		// sequential projects
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.zip", "org.gemoc.activitydiagram.sequential"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.k3dsa.zip", "org.gemoc.activitydiagram.sequential.k3dsa"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.model.zip", "org.gemoc.activitydiagram.sequential.model"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.model.dynamic.zip", "org.gemoc.activitydiagram.sequential.model.dynamic"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.xactivitydiagram.zip", "org.gemoc.activitydiagram.sequential.xactivitydiagram"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.xactivitydiagram.design.zip", "org.gemoc.activitydiagram.sequential.xactivitydiagram.design"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.xactivitydiagram.edit.zip", "org.gemoc.activitydiagram.sequential.xactivitydiagram.edit"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.xactivitydiagram.editor.zip", "org.gemoc.activitydiagram.sequential.xactivitydiagram.editor"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.xactivitydiagram.grammar.zip", "org.gemoc.activitydiagram.sequential.xactivitydiagram.grammar"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.xactivitydiagram.grammar.ide.zip", "org.gemoc.activitydiagram.sequential.xactivitydiagram.grammar.ide"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.xactivitydiagram.grammar.ui.zip", "org.gemoc.activitydiagram.sequential.xactivitydiagram.grammar.ui"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.xactivitydiagram.input.grammar.zip", "org.gemoc.activitydiagram.sequential.xactivitydiagram.input.grammar"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.xactivitydiagram.input.grammar.ide.zip", "org.gemoc.activitydiagram.sequential.xactivitydiagram.input.grammar.ide"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.xactivitydiagram.input.grammar.ui.zip", "org.gemoc.activitydiagram.sequential.xactivitydiagram.input.grammar.ui"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.sequential.xactivitydiagram.trace.zip", "org.gemoc.activitydiagram.sequential.xactivitydiagram.trace"));

		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}

}