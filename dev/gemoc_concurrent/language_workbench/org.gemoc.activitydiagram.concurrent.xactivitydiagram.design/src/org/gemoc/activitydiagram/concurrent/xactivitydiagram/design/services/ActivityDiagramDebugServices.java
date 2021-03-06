package org.gemoc.activitydiagram.concurrent.xactivitydiagram.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices.StringCouple;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class ActivityDiagramDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("Activity Diagram", "Debug"));

		return res;
	}

	@Override
	public String getModelIdentifier() {
		return org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui.Activator.PLUGIN_ID + ".debugModel";
	}
}
