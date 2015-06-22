package org.modelexecution.operationalsemantics.ad.design.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.gemoc_language_workbench.extensions.sirius.services.AbstractGemocDebuggerServices;

public class ActivityDiagramDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("Activity Diagram", "Debug"));

		return res;
	}

}
