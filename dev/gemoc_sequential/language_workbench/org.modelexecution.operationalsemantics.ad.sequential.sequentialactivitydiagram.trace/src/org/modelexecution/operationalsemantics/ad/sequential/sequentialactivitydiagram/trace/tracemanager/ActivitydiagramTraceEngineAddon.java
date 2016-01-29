package org.modelexecution.operationalsemantics.ad.sequential.sequentialactivitydiagram.trace.tracemanager;

import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

import org.eclipse.emf.ecore.resource.Resource;

public class ActivitydiagramTraceEngineAddon extends AbstractTraceAddon {

	@Override
	public fr.inria.diverse.trace.gemoc.api.IGemocTraceManager constructTraceManager(Resource exeModel,
			Resource traceResource) {
		return new ActivitydiagramTraceManager(exeModel, traceResource);
	}

	private ActivitydiagramTraceStepFactory factory = null;

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new ActivitydiagramTraceStepFactory();
		return factory;
	}

}