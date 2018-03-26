package org.gemoc.activitydiagram.concurrent.xactivitydiagram.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices.StringCouple;

public class ActivityDiagramAnimationServices extends AbstractGemocAnimatorServices{

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("Activity Diagram", "Animation"));

		return res;
	}

}
