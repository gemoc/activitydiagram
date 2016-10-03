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

import org.eclipse.core.resources.IProject;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.gemoc.activitydiagram.sampledeployer.Activator;

import fr.inria.diverse.commons.eclipse.jface.wizards.AbstractExampleWizard;

public class ActivityDiagramConcurrentLanguageExampleWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		
		// commons projects
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.modelexecution.operationalsemantics.ad.design.zip", "org.modelexecution.operationalsemantics.ad.design"));
		
		// concurrent projects
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.concurrent.zip", 				"org.gemoc.activitydiagram.concurrent"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.concurrent.dynamic.model.zip", 	"org.gemoc.activitydiagram.concurrent.dynamic.model"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.concurrent.k3dsa.zip", 			"org.gemoc.activitydiagram.concurrent.k3dsa"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.concurrent.moc.dse.zip", 		"org.gemoc.activitydiagram.concurrent.moc.dse"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.concurrent.model.zip", 			"org.gemoc.activitydiagram.concurrent.model"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.concurrent.xactivitydiagram.edit.zip", 	"org.gemoc.activitydiagram.concurrent.xactivitydiagram.edit"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.concurrent.xactivitydiagram.zip", 	"org.gemoc.activitydiagram.concurrent.xactivitydiagram"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.concurrent.xactivitydiagram.grammar.zip", "org.gemoc.activitydiagram.concurrent.xactivitydiagram.grammar"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.concurrent.xactivitydiagram.grammar.ui.zip", "org.gemoc.activitydiagram.concurrent.xactivitydiagram.grammar.ui"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.concurrent.xactivitydiagram.input.grammar.zip", "org.gemoc.activitydiagram.concurrent.xactivitydiagram.input.grammar"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.activitydiagram.concurrent.xactivitydiagram.input.grammar.ui.zip", "org.gemoc.activitydiagram.concurrent.xactivitydiagram.input.grammar.ui"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}

	@Override
	public void error(String message, Throwable e) {
		Activator.getDefault().error(message, e);
	}

	@Override
	public ActionIfProjectExist getActionIfProjectExist(IProject project) {		
		return ActionIfProjectExist.ASKUSER;
	}
}