package org.gemoc.activitydiagram.sequential.xactivitydiagram.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.gemoc.executionframework.engine.core.CommandExecution;

import fr.inria.diverse.trace.commons.model.trace.State;
import fr.inria.diverse.trace.commons.model.trace.TracedObject;
import fr.inria.diverse.trace.gemoc.api.IStateManager;

public class ActivitydiagramTraceStateManager implements IStateManager<State<?, ?>> {

	private final Resource modelResource;

	private final Map<TracedObject<?>, EObject> tracedToExe;
	
	private final Consumer<Long> logger;
	
	public ActivitydiagramTraceStateManager(Resource modelResource, Map<TracedObject<?>, EObject> tracedToExe, Consumer<Long> logger) {
		this.modelResource = modelResource;
		this.tracedToExe = tracedToExe;
		this.logger = logger;
	}

	@Override
	public void restoreState(State<?, ?> state) {
		if (modelResource != null && state instanceof activitydiagramTrace.States.SpecificState) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				if (ed != null) {
					final RecordingCommand command = new RecordingCommand(ed, "") {
						protected void doExecute() {
							if (logger != null) {
								long t = System.nanoTime();
								restoreStateExecute((activitydiagramTrace.States.SpecificState) state);
								logger.accept((System.nanoTime() - t));
							} else {
								restoreStateExecute((activitydiagramTrace.States.SpecificState) state);
							}
						}
					};
					CommandExecution.execute(ed, command);
				}
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private Collection<? extends EObject> getTracedToExe(Collection<? extends EObject> tracedObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject tracedObject : tracedObjects) {
			result.add(tracedToExe.get(tracedObject));
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private void restoreStateExecute(activitydiagramTrace.States.SpecificState state) {
		for (activitydiagramTrace.States.SpecificValue value : state.getValues()) {
			if (value instanceof activitydiagramTrace.States.BooleanVariable_currentValue_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedBooleanVariable tracedObject = (activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) value
						.eContainer().eContainer();
				final org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) tracedToExe
						.get(tracedObject);
				final boolean toSet = ((activitydiagramTrace.States.BooleanVariable_currentValue_Value) value)
						.isCurrentValue();
				final boolean current = originalObject.isCurrentValue();
				if (current != toSet) {
					originalObject.setCurrentValue((boolean) toSet);
				}
			} else if (value instanceof activitydiagramTrace.States.IntegerVariable_currentValue_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedIntegerVariable tracedObject = (activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) value
						.eContainer().eContainer();
				final org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) tracedToExe
						.get(tracedObject);
				final int toSet = ((activitydiagramTrace.States.IntegerVariable_currentValue_Value) value)
						.getCurrentValue();
				final int current = originalObject.getCurrentValue();
				if (current != toSet) {
					originalObject.setCurrentValue((int) toSet);
				}
			} else if (value instanceof activitydiagramTrace.States.ActivityNode_heldTokens_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedActivityNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedActivityNode) value
						.eContainer().eContainer();
				final org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) tracedToExe
						.get(tracedObject);
				originalObject.getHeldTokens().clear();
				originalObject.getHeldTokens()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken>) getTracedToExe(
								((activitydiagramTrace.States.ActivityNode_heldTokens_Value) value).getHeldTokens()));
			} else if (value instanceof activitydiagramTrace.States.ActivityEdge_offeredTokens_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedActivityEdge tracedObject = (activitydiagramTrace.States.activitydiagram.TracedActivityEdge) value
						.eContainer().eContainer();
				final org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) tracedToExe
						.get(tracedObject);
				originalObject.getOfferedTokens().clear();
				originalObject.getOfferedTokens()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken>) getTracedToExe(
								((activitydiagramTrace.States.ActivityEdge_offeredTokens_Value) value)
										.getOfferedTokens()));
			}
		}
	}
}
