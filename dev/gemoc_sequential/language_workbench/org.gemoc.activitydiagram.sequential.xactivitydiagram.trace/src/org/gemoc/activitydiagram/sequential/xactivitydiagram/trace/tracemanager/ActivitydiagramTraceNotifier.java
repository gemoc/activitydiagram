package org.gemoc.activitydiagram.sequential.xactivitydiagram.trace.tracemanager;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NewObjectModelChange;

import fr.inria.diverse.trace.gemoc.api.ITraceListener;
import fr.inria.diverse.trace.gemoc.api.ITraceNotifier;

public class ActivitydiagramTraceNotifier implements ITraceNotifier {

	private BatchModelChangeListener traceListener;

	private final List<ITraceListener> listeners = new ArrayList<>();

	public ActivitydiagramTraceNotifier(BatchModelChangeListener traceListener) {
		this.traceListener = traceListener;
	}

	@Override
	public void notifyListeners() {
		for (ITraceListener listener : listeners) {
			notifyListener(listener);
		}
	}

	@Override
	public void notifyListener(ITraceListener listener) {
		final List<ModelChange> changes = traceListener.getChanges(listener);
		if (!changes.isEmpty()) {
			final List<EObject> startedSteps = new ArrayList<>();
			final List<EObject> endedSteps = new ArrayList<>();
			final List<EObject> newStates = new ArrayList<>();
			final List<EObject> newValues = new ArrayList<>();
			final List<List<? extends EObject>> newDimensions = new ArrayList<>();
			changes.forEach(c -> {
				if (c instanceof NewObjectModelChange) {
					final EObject o = c.getChangedObject();
					if (o instanceof activitydiagramTrace.States.Value) {
						newValues.add((activitydiagramTrace.States.Value) o);
					} else if (o instanceof activitydiagramTrace.Steps.SpecificStep) {
						startedSteps.add((activitydiagramTrace.Steps.SpecificStep) o);
					} else if (o instanceof activitydiagramTrace.States.State) {
						final activitydiagramTrace.States.State newState = (activitydiagramTrace.States.State) o;
						newStates.add(newState);
						endedSteps.addAll(newState.getEndedSteps());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedOffer) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedOffer) o)
								.getOfferedTokensSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedActivity) {
						newDimensions.add(
								((activitydiagramTrace.States.activitydiagram.TracedActivity) o).getTraceSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode) o)
								.getHeldTokensSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedActivityNode) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedActivityNode) o)
								.getHeldTokensSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) o)
								.getCurrentValueSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedControlFlow) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedControlFlow) o)
								.getOffersSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedDecisionNode) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedDecisionNode) o)
								.getHeldTokensSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedForkNode) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedForkNode) o)
								.getHeldTokensSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedForkedToken) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedForkedToken) o)
								.getBaseTokenSequence());
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedForkedToken) o)
								.getRemainingOffersCountSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedInitialNode) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedInitialNode) o)
								.getHeldTokensSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedInput) {
						newDimensions.add(
								((activitydiagramTrace.States.activitydiagram.TracedInput) o).getInputValuesSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedInputValue) {
						newDimensions.add(
								((activitydiagramTrace.States.activitydiagram.TracedInputValue) o).getValueSequence());
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedInputValue) o)
								.getVariableSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) o)
								.getCurrentValueSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedJoinNode) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedJoinNode) o)
								.getHeldTokensSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedMergeNode) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedMergeNode) o)
								.getHeldTokensSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedOffer) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedOffer) o)
								.getOfferedTokensSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) o)
								.getHeldTokensSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedTrace) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedTrace) o)
								.getExecutedNodesSequence());
					} else if (o instanceof activitydiagramTrace.States.activitydiagram.TracedVariable) {
						newDimensions.add(((activitydiagramTrace.States.activitydiagram.TracedVariable) o)
								.getCurrentValueSequence());
					}
				}
			});
			listener.valuesAdded(newValues);
			listener.dimensionsAdded(newDimensions);
			listener.statesAdded(newStates);
			listener.stepsStarted(startedSteps);
			listener.stepsEnded(endedSteps);
		}
	}

	@Override
	public void addListener(ITraceListener listener) {
		listeners.add(listener);
		traceListener.registerObserver(listener);
	}

	@Override
	public void removeListener(ITraceListener listener) {
		listeners.remove(listener);
		traceListener.removeObserver(listener);
	}
}
