package org.modelexecution.operationalsemantics.gemoc.sequential.trace.tracemanager;

import fr.inria.diverse.trace.api.ITraceManager;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

import org.eclipse.emf.ecore.resource.Resource;

public class ActivitydiagramTraceEngineAddon extends AbstractTraceAddon {

	@Override
	public ITraceManager constructTraceManager(Resource exeModel, Resource traceResource) {
		return new ActivitydiagramTraceManager(exeModel, traceResource);
	}

}