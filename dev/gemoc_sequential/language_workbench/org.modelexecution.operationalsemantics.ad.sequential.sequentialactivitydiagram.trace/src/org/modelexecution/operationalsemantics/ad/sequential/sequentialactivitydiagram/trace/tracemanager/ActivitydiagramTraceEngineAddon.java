package org.modelexecution.operationalsemantics.ad.sequential.sequentialactivitydiagram.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class ActivitydiagramTraceEngineAddon extends AbstractTraceAddon {

	private ActivitydiagramTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		return new ActivitydiagramTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public ITraceExplorer loadTrace(Resource traceResource) {
		ActivitydiagramTraceExplorer explorer = new ActivitydiagramTraceExplorer();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof activitydiagramTrace.SpecificTrace) {
			explorer.loadTrace((activitydiagramTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExplorer loadTrace(Resource modelResource, Resource traceResource, Map<EObject, EObject> tracedToExe) {
		ActivitydiagramTraceExplorer explorer = new ActivitydiagramTraceExplorer(tracedToExe);
		EObject root = traceResource.getContents().get(0);
		if (root instanceof activitydiagramTrace.SpecificTrace) {
			explorer.loadTrace(modelResource, (activitydiagramTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new ActivitydiagramTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof activitydiagramTrace.SpecificTrace;
	}

}