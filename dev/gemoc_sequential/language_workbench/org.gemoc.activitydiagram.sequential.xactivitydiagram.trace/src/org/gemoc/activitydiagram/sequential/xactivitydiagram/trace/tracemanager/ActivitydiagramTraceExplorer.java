package org.gemoc.activitydiagram.sequential.xactivitydiagram.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.gemoc.executionframework.engine.core.CommandExecution;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceListener;

public class ActivitydiagramTraceExplorer implements ITraceExplorer {
	private activitydiagramTrace.SpecificTrace traceRoot;
	private Resource modelResource;
	private final Map<EObject, EObject> tracedToExe;

	private int lastJumpIndex = -1;
	private activitydiagramTrace.States.State currentState = null;
	final private List<Step> callStack = new ArrayList<>();

	final private List<List<? extends activitydiagramTrace.States.Value>> valueTraces = new ArrayList<>();

	private List<activitydiagramTrace.States.State> statesTrace;

	private activitydiagramTrace.Steps.SpecificStep stepIntoResult;
	private activitydiagramTrace.Steps.SpecificStep stepOverResult;
	private activitydiagramTrace.Steps.SpecificStep stepReturnResult;

	private activitydiagramTrace.Steps.SpecificStep stepBackIntoResult;
	private activitydiagramTrace.Steps.SpecificStep stepBackOverResult;
	private activitydiagramTrace.Steps.SpecificStep stepBackOutResult;

	final private Map<activitydiagramTrace.Steps.SpecificStep, Integer> stepToStartingIndex = new HashMap<>();
	final private Map<activitydiagramTrace.Steps.SpecificStep, Integer> stepToEndingIndex = new HashMap<>();

	private final HashMap<Integer, Boolean> canBackValueCache = new HashMap<>();

	final private List<ITraceListener> listeners = new ArrayList<>();

	public ActivitydiagramTraceExplorer(Map<EObject, EObject> tracedToExe) {
		this.tracedToExe = tracedToExe;
	}

	public ActivitydiagramTraceExplorer() {
		this.tracedToExe = null;
	}

	private List<List<? extends activitydiagramTrace.States.Value>> getAllValueTraces() {
		final List<List<? extends activitydiagramTrace.States.Value>> result = new ArrayList<>();
		for (activitydiagramTrace.States.activitydiagram.TracedActivity tracedObject : traceRoot
				.getActivitydiagram_tracedActivitys()) {
			result.add(tracedObject.getTraceSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode tracedObject : traceRoot
				.getActivitydiagram_tracedActivityFinalNodes()) {
			result.add(tracedObject.getHeldTokensSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedActivityNode tracedObject : traceRoot
				.getActivitydiagram_tracedActivityNodes()) {
			result.add(tracedObject.getHeldTokensSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedBooleanVariable tracedObject : traceRoot
				.getActivitydiagram_tracedBooleanVariables()) {
			result.add(tracedObject.getCurrentValueSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedControlFlow tracedObject : traceRoot
				.getActivitydiagram_tracedControlFlows()) {
			result.add(tracedObject.getOffersSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedDecisionNode tracedObject : traceRoot
				.getActivitydiagram_tracedDecisionNodes()) {
			result.add(tracedObject.getHeldTokensSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedForkNode tracedObject : traceRoot
				.getActivitydiagram_tracedForkNodes()) {
			result.add(tracedObject.getHeldTokensSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedForkedToken tracedObject : traceRoot
				.getActivitydiagram_tracedForkedTokens()) {
			result.add(tracedObject.getBaseTokenSequence());
			result.add(tracedObject.getRemainingOffersCountSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedInitialNode tracedObject : traceRoot
				.getActivitydiagram_tracedInitialNodes()) {
			result.add(tracedObject.getHeldTokensSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedInput tracedObject : traceRoot
				.getActivitydiagram_tracedInputs()) {
			result.add(tracedObject.getInputValuesSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedInputValue tracedObject : traceRoot
				.getActivitydiagram_tracedInputValues()) {
			result.add(tracedObject.getValueSequence());
			result.add(tracedObject.getVariableSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedIntegerVariable tracedObject : traceRoot
				.getActivitydiagram_tracedIntegerVariables()) {
			result.add(tracedObject.getCurrentValueSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedJoinNode tracedObject : traceRoot
				.getActivitydiagram_tracedJoinNodes()) {
			result.add(tracedObject.getHeldTokensSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedMergeNode tracedObject : traceRoot
				.getActivitydiagram_tracedMergeNodes()) {
			result.add(tracedObject.getHeldTokensSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedOffer tracedObject : traceRoot
				.getActivitydiagram_tracedOffers()) {
			result.add(tracedObject.getOfferedTokensSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedOpaqueAction tracedObject : traceRoot
				.getActivitydiagram_tracedOpaqueActions()) {
			result.add(tracedObject.getHeldTokensSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedTrace tracedObject : traceRoot
				.getActivitydiagram_tracedTraces()) {
			result.add(tracedObject.getExecutedNodesSequence());
		}
		for (activitydiagramTrace.States.activitydiagram.TracedVariable tracedObject : traceRoot
				.getActivitydiagram_tracedVariables()) {
			result.add(tracedObject.getCurrentValueSequence());
		}
		return result;
	}

	private activitydiagramTrace.States.Value getActiveValue(
			List<? extends activitydiagramTrace.States.Value> valueTrace, activitydiagramTrace.States.State state) {
		activitydiagramTrace.States.Value result = null;
		for (activitydiagramTrace.States.Value value : valueTrace) {
			if (value.getStatesNoOpposite().contains(state)) {
				result = value;
				break;
			}
		}
		return result;
	}

	private int getPreviousValueIndex(final List<? extends activitydiagramTrace.States.Value> valueTrace) {
		activitydiagramTrace.States.Value value = getActiveValue(valueTrace, currentState);
		if (value != null) {
			return valueTrace.indexOf(value) - 1;
		} else {
			int i = getCurrentStateIndex() - 1;
			while (i > -1 && value == null) {
				value = getActiveValue(valueTrace, statesTrace.get(i));
				i--;
			}
			if (value == null) {
				return -1;
			} else {
				return valueTrace.indexOf(value) - 1;
			}
		}
	}

	private int getNextValueIndex(List<? extends activitydiagramTrace.States.Value> valueTrace) {
		activitydiagramTrace.States.Value value = getActiveValue(valueTrace, currentState);
		if (value != null) {
			final int idx = valueTrace.indexOf(value) + 1;
			if (idx < valueTrace.size()) {
				return idx;
			}
			return -1;
		} else {
			int i = getCurrentStateIndex() + 1;
			final int traceLength = valueTrace.size();
			while (i < traceLength && value == null) {
				value = getActiveValue(valueTrace, statesTrace.get(i));
				i++;
			}
			if (value == null) {
				return -1;
			} else {
				final int idx = valueTrace.indexOf(value) + 1;
				if (idx < valueTrace.size()) {
					return idx;
				}
				return -1;
			}
		}
	}

	private int getStartingIndex(activitydiagramTrace.Steps.SpecificStep step) {
		return stepToStartingIndex.computeIfAbsent(step, s -> {
			return statesTrace.indexOf(s.getStartingState());
		});
	}

	private int getEndingIndex(activitydiagramTrace.Steps.SpecificStep step) {
		if (step.getEndingState() != null) {
			return stepToEndingIndex.computeIfAbsent(step, s -> {
				return statesTrace.indexOf(s.getEndingState());
			});
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	private activitydiagramTrace.Steps.SpecificStep findNextStep(
			final List<activitydiagramTrace.Steps.SpecificStep> stepPath,
			final activitydiagramTrace.Steps.SpecificStep previousStep, final int start) {
		final List<activitydiagramTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		activitydiagramTrace.Steps.SpecificStep result = null;
		int i = start;
		int depth = stepPath.size();
		activitydiagramTrace.Steps.SpecificStep previous = previousStep;
		while (result == null && i < depth) {
			final activitydiagramTrace.Steps.SpecificStep currentStep = stepPath.get(depth - i - 1);
			final List<activitydiagramTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
			if (currentStep instanceof SequentialStep<?>) {
				currentSubSteps
						.addAll(((SequentialStep<activitydiagramTrace.Steps.SpecificStep>) currentStep).getSubSteps());
			}
			if (currentSubSteps.isEmpty()) {
				// No substep to step into, we thus have to explore the substeps
				// of the parent step
				previous = currentStep;
			} else {
				if (previous == null) {
					// First time we step into
					result = currentSubSteps.get(0);
				} else {
					final int idx = currentSubSteps.indexOf(previous) + 1;
					if (idx < currentSubSteps.size()) {
						// We step into the next step
						result = currentSubSteps.get(idx);
					} else {
						previous = currentStep;
					}
				}
			}
			i++;
		}
		if (result == null) {
			final int idx = rootSteps.indexOf(previous) + 1;
			if (idx < rootSteps.size()) {
				result = rootSteps.get(idx);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private activitydiagramTrace.Steps.SpecificStep computeBackInto(
			List<activitydiagramTrace.Steps.SpecificStep> stepPath) {
		final List<activitydiagramTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		activitydiagramTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final activitydiagramTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final activitydiagramTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<activitydiagramTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<activitydiagramTrace.Steps.SpecificStep>) parentStep;
			final List<? extends activitydiagramTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast
					.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else if (idx > 0) {
				// Otherwise, return the deepest substep in the previous sibling
				// step
				final activitydiagramTrace.Steps.SpecificStep previousSiblingStep = parentSubSteps.get(idx - 1);
				activitydiagramTrace.Steps.SpecificStep tmpStep = previousSiblingStep;
				final List<activitydiagramTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<activitydiagramTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<activitydiagramTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<activitydiagramTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<activitydiagramTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		} else if (depth == 1) {
			final activitydiagramTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				activitydiagramTrace.Steps.SpecificStep tmpStep = rootSteps.get(idx - 1);
				final List<activitydiagramTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<activitydiagramTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<activitydiagramTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<activitydiagramTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<activitydiagramTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private activitydiagramTrace.Steps.SpecificStep computeBackOver(
			List<activitydiagramTrace.Steps.SpecificStep> stepPath) {
		final List<activitydiagramTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		activitydiagramTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final activitydiagramTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final activitydiagramTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<activitydiagramTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<activitydiagramTrace.Steps.SpecificStep>) parentStep;
			final List<activitydiagramTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else {
				// Otherwise, return the previous sibling step
				result = parentSubSteps.get(idx - 1);
			}
		} else if (depth == 1) {
			final activitydiagramTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				result = rootSteps.get(idx - 1);
			}
		}
		return result;
	}

	private activitydiagramTrace.Steps.SpecificStep computeBackOut(
			List<activitydiagramTrace.Steps.SpecificStep> stepPath) {
		if (stepPath.size() > 1) {
			return stepPath.get(stepPath.size() - 2);
		}
		return null;
	}

	private activitydiagramTrace.Steps.SpecificStep computeStepInto(
			List<activitydiagramTrace.Steps.SpecificStep> stepPath,
			List<activitydiagramTrace.Steps.SpecificStep> rootSteps) {
		return findNextStep(stepPath, null, 0);
	}

	private activitydiagramTrace.Steps.SpecificStep computeStepOver(
			List<activitydiagramTrace.Steps.SpecificStep> stepPath,
			List<activitydiagramTrace.Steps.SpecificStep> rootSteps) {
		if (!stepPath.isEmpty()) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 1), 1);
		}
		return null;
	}

	private activitydiagramTrace.Steps.SpecificStep computeStepReturn(
			List<activitydiagramTrace.Steps.SpecificStep> stepPath,
			List<activitydiagramTrace.Steps.SpecificStep> rootSteps) {
		if (stepPath.size() > 1) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 2), 2);
		}
		return null;
	}

	private void computeExplorerState(List<activitydiagramTrace.Steps.SpecificStep> stepPath) {
		final List<activitydiagramTrace.Steps.SpecificStep> rootSteps = getStepsForStates(0, statesTrace.size());

		final List<activitydiagramTrace.Steps.SpecificStep> stepPathUnmodifiable = Collections
				.unmodifiableList(stepPath);

		stepIntoResult = computeStepInto(stepPathUnmodifiable, rootSteps);
		stepOverResult = computeStepOver(stepPathUnmodifiable, rootSteps);
		stepReturnResult = computeStepReturn(stepPathUnmodifiable, rootSteps);

		stepBackIntoResult = computeBackInto(stepPathUnmodifiable);
		stepBackOverResult = computeBackOver(stepPathUnmodifiable);
		stepBackOutResult = computeBackOut(stepPathUnmodifiable);

		callStack.clear();
		callStack.addAll(stepPathUnmodifiable.stream().map(s -> (Step) s).collect(Collectors.toList()));
	}

	private void goTo(EObject eObject) {
		if (eObject instanceof activitydiagramTrace.States.State) {
			activitydiagramTrace.States.State stateToGo = (activitydiagramTrace.States.State) eObject;
			for (activitydiagramTrace.States.Variable_currentValue_Value value : stateToGo
					.getVariable_currentValue_Values()) {
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) {
					activitydiagramTrace.States.activitydiagram.TracedBooleanVariable parent_cast = (activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) value
							.getParent();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value toset = value
							.getCurrentValue();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value current = ((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) parent_cast
							.getOriginalObject_Variable()).getCurrentValue();
					if (current != toset) {
						((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) parent_cast
								.getOriginalObject_Variable()).setCurrentValue(
										(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) toset);
					}
				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) {
					activitydiagramTrace.States.activitydiagram.TracedIntegerVariable parent_cast = (activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) value
							.getParent();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value toset = value
							.getCurrentValue();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value current = ((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) parent_cast
							.getOriginalObject_Variable()).getCurrentValue();
					if (current != toset) {
						((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) parent_cast
								.getOriginalObject_Variable()).setCurrentValue(
										(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) toset);
					}
				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedVariable) {
					activitydiagramTrace.States.activitydiagram.TracedVariable parent_cast = (activitydiagramTrace.States.activitydiagram.TracedVariable) value
							.getParent();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value toset = value
							.getCurrentValue();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value current = ((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) parent_cast
							.getOriginalObject_Variable()).getCurrentValue();
					if (current != toset) {
						((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) parent_cast
								.getOriginalObject_Variable()).setCurrentValue(
										(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) toset);
					}
				}
			}
			for (activitydiagramTrace.States.ActivityNode_heldTokens_Value value : stateToGo
					.getActivityNode_heldTokens_Values()) {
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode) {
					activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode) value
							.getParent();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									value.getHeldTokens()));
				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedActivityNode) {
					activitydiagramTrace.States.activitydiagram.TracedActivityNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedActivityNode) value
							.getParent();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									value.getHeldTokens()));
				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedDecisionNode) {
					activitydiagramTrace.States.activitydiagram.TracedDecisionNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedDecisionNode) value
							.getParent();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									value.getHeldTokens()));
				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedForkNode) {
					activitydiagramTrace.States.activitydiagram.TracedForkNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedForkNode) value
							.getParent();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									value.getHeldTokens()));
				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedInitialNode) {
					activitydiagramTrace.States.activitydiagram.TracedInitialNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedInitialNode) value
							.getParent();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									value.getHeldTokens()));
				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedJoinNode) {
					activitydiagramTrace.States.activitydiagram.TracedJoinNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedJoinNode) value
							.getParent();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									value.getHeldTokens()));
				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedMergeNode) {
					activitydiagramTrace.States.activitydiagram.TracedMergeNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedMergeNode) value
							.getParent();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									value.getHeldTokens()));
				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) {
					activitydiagramTrace.States.activitydiagram.TracedOpaqueAction parent_cast = (activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) value
							.getParent();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									value.getHeldTokens()));
				}
			}
			for (activitydiagramTrace.States.ActivityEdge_offers_Value value : stateToGo
					.getActivityEdge_offers_Values()) {
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedControlFlow) {
					activitydiagramTrace.States.activitydiagram.TracedControlFlow parent_cast = (activitydiagramTrace.States.activitydiagram.TracedControlFlow) value
							.getParent();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) parent_cast
							.getOriginalObject();
					originalObject.getOffers().clear();
					originalObject.getOffers()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer>) getTracedToExe(
									value.getOffers()));
				}
			}
			for (activitydiagramTrace.States.Activity_trace_Value value : stateToGo.getActivity_trace_Values()) {
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedActivity) {
					activitydiagramTrace.States.activitydiagram.TracedActivity parent_cast = (activitydiagramTrace.States.activitydiagram.TracedActivity) value
							.getParent();
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace toset = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) getTracedToExe(
							value.getTrace());
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace current = ((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) parent_cast
							.getOriginalObject()).getTrace();
					if (current != toset) {
						((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) parent_cast
								.getOriginalObject()).setTrace(
										(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) toset);
					}
				}
			}
			for (activitydiagramTrace.States.ForkedToken_baseToken_Value value : stateToGo
					.getForkedToken_baseToken_Values()) {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) getTracedToExe(
						value.getParent());
				exeObject.setBaseToken(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) getTracedToExe(
								value.getBaseToken()));
			}
			for (activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value value : stateToGo
					.getForkedToken_remainingOffersCount_Values()) {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) getTracedToExe(
						value.getParent());
				exeObject.setRemainingOffersCount((int) value.getRemainingOffersCount());
			}
			for (activitydiagramTrace.States.Input_inputValues_Value value : stateToGo.getInput_inputValues_Values()) {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input) getTracedToExe(
						value.getParent());
				exeObject.getInputValues().clear();
				exeObject.getInputValues()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue>) getTracedToExe(
								value.getInputValues()));
			}
			for (activitydiagramTrace.States.InputValue_value_Value value : stateToGo.getInputValue_value_Values()) {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) getTracedToExe(
						value.getParent());
				exeObject.setValue(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) value.getValue());
			}
			for (activitydiagramTrace.States.InputValue_variable_Value value : stateToGo
					.getInputValue_variable_Values()) {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) getTracedToExe(
						value.getParent());
				exeObject.setVariable(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) getTracedToExe(
								value.getVariable()));
			}
			for (activitydiagramTrace.States.Offer_offeredTokens_Value value : stateToGo
					.getOffer_offeredTokens_Values()) {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) getTracedToExe(
						value.getParent());
				exeObject.getOfferedTokens().clear();
				exeObject.getOfferedTokens()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
								value.getOfferedTokens()));
			}
			for (activitydiagramTrace.States.Trace_executedNodes_Value value : stateToGo
					.getTrace_executedNodes_Values()) {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) getTracedToExe(
						value.getParent());
				exeObject.getExecutedNodes().clear();
				exeObject.getExecutedNodes()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode>) getTracedToExe(
								value.getExecutedNodes()));
			}
		} else if (eObject instanceof activitydiagramTrace.States.Value) {
			goTo(((activitydiagramTrace.States.Value) eObject).getStatesNoOpposite().get(0));
		}
	}

	private void goTo(int stateNumber) {
		if (modelResource != null) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				if (ed != null) {
					final RecordingCommand command = new RecordingCommand(ed, "") {
						protected void doExecute() {
							goTo(statesTrace.get(stateNumber));
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
			result.add(getTracedToExe(tracedObject));
		}
		return result;
	}

	private EObject getTracedToExe(EObject tracedObject) {
		return tracedToExe.get(tracedObject);
	}

	private void jumpBeforeStep(activitydiagramTrace.Steps.SpecificStep step) {
		if (step != null) {
			final int i = getStartingIndex(step);
			if (i == statesTrace.size() - 1) {
				lastJumpIndex = -1;
				currentState = statesTrace.get(statesTrace.size() - 1);
			} else {
				lastJumpIndex = i;
				currentState = statesTrace.get(i);
			}
			if (tracedToExe != null) {
				goTo(i);
			}
			updateCallStack(step);
		}
	}

	public void loadTrace(activitydiagramTrace.SpecificTrace root) {
		traceRoot = root;
		statesTrace = traceRoot.getStatesTrace();
		if (!statesTrace.isEmpty()) {
			currentState = statesTrace.get(0);
		}
		valueTraces.addAll(getAllValueTraces());
	}

	public void loadTrace(Resource modelResource, activitydiagramTrace.SpecificTrace root) {
		loadTrace(root);
		this.modelResource = modelResource;
	}

	@Override
	public boolean canBackValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			return canBackValueCache.computeIfAbsent(traceIndex, i -> {
				final List<? extends activitydiagramTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
				final int previousValueIndex = getPreviousValueIndex(valueTrace);
				return previousValueIndex > -1;
			});
		}
		return false;
	}

	@Override
	public boolean canStepValue(int traceIndex) {
		return true;
	}

	@Override
	public void backValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends activitydiagramTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int previousValueIndex = getPreviousValueIndex(valueTrace);
			if (previousValueIndex > -1) {
				jump(valueTrace.get(previousValueIndex));
			}
		}
	}

	@Override
	public void stepValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends activitydiagramTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int nextValueIndex = getNextValueIndex(valueTrace);
			if (nextValueIndex > -1) {
				jump(valueTrace.get(nextValueIndex));
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void jump(int i) {
		final List<activitydiagramTrace.States.State> states = statesTrace;
		if (i < states.size()) {
			final List<activitydiagramTrace.Steps.SpecificStep> rootSteps = getStepsForStates(i, i);
			final List<activitydiagramTrace.Steps.SpecificStep> searchPath = new ArrayList<>();
			activitydiagramTrace.Steps.SpecificStep firstStepOfState = null;
			if (!rootSteps.isEmpty()) {
				final Predicate<activitydiagramTrace.Steps.SpecificStep> p = s -> {
					final int stepStartingState = getStartingIndex(s);
					final int stepEndingState = getEndingIndex(s);
					return (stepEndingState == -1 || stepEndingState >= i) && stepStartingState <= i;
				};
				activitydiagramTrace.Steps.SpecificStep currentStep = rootSteps.get(0);
				final List<activitydiagramTrace.Steps.SpecificStep> siblingSteps = new ArrayList<>(rootSteps);
				final List<activitydiagramTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
				if (currentStep instanceof SequentialStep<?>) {
					final SequentialStep<activitydiagramTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<activitydiagramTrace.Steps.SpecificStep>) currentStep;
					currentSubSteps
							.addAll(currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
				}
				while (firstStepOfState == null) {
					final int startingIndex = getStartingIndex(currentStep);
					final int endingIndex = getEndingIndex(currentStep);
					if (startingIndex < i && (endingIndex > i || endingIndex == -1)) {
						if (currentSubSteps.isEmpty()) {
							throw new IllegalStateException("Unreachable state");
						} else {
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<activitydiagramTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<activitydiagramTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (endingIndex == i && startingIndex != i) {
						if (currentSubSteps.isEmpty()) {
							// We need to explore the next sibling step
							activitydiagramTrace.Steps.SpecificStep tmp = currentStep;
							currentStep = null;
							while (currentStep == null) {
								final int idx = siblingSteps.indexOf(tmp) + 1;
								if (idx < siblingSteps.size()) {
									currentStep = siblingSteps.get(idx);
									if (currentStep instanceof SequentialStep<?>) {
										final SequentialStep<activitydiagramTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<activitydiagramTrace.Steps.SpecificStep>) currentStep;
										currentSubSteps.addAll(currentStep_cast.getSubSteps().stream().filter(p)
												.collect(Collectors.toList()));
									}
								} else {
									if (searchPath.isEmpty()) {
										throw new IllegalStateException("Unreachable state");
									} else {
										tmp = searchPath.remove(0);
										siblingSteps.clear();
										if (searchPath.isEmpty()) {
											siblingSteps.addAll(rootSteps);
										} else {
											final activitydiagramTrace.Steps.SpecificStep s = searchPath.get(0);
											if (s instanceof SequentialStep<?>) {
												final SequentialStep<activitydiagramTrace.Steps.SpecificStep> s_cast = (SequentialStep<activitydiagramTrace.Steps.SpecificStep>) s;
												siblingSteps.addAll((s_cast).getSubSteps().stream().filter(p)
														.collect(Collectors.toList()));
											}
										}
									}
								}
							}
						} else {
							// We need to explore the substeps in case one of them starts on i
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<activitydiagramTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<activitydiagramTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (startingIndex == i) {
						firstStepOfState = currentStep;
					}
				}
			}
			jumpBeforeStep(firstStepOfState);
		}
	}

	@Override
	public boolean canStepBackInto() {
		return stepBackIntoResult != null;
	}

	@Override
	public boolean canStepBackOver() {
		return stepBackOverResult != null;
	}

	@Override
	public boolean canStepBackOut() {
		return stepBackOutResult != null;
	}

	@Override
	public int getCurrentStateIndex() {
		if (lastJumpIndex != -1) {
			return lastJumpIndex;
		}
		return statesTrace.size() - 1;
	}

	@Override
	public List<Step> getCallStack() {
		return callStack;
	}

	private List<activitydiagramTrace.Steps.SpecificStep> getStepsForStates(int startingState, int endingState) {
		Predicate<activitydiagramTrace.Steps.SpecificStep> predicate = s -> {
			final int stepStartingState = getStartingIndex(s);
			final int stepEndingState = getEndingIndex(s);
			return (stepEndingState == -1 || stepEndingState >= startingState) && stepStartingState <= endingState;
		};
		return traceRoot.getRootStep().getSubSteps().stream().filter(predicate).collect(Collectors.toList());
	}

	@Override
	public void notifyListeners() {
		for (ITraceListener listener : listeners) {
			listener.update();
		}
	}

	@Override
	public void addListener(ITraceListener listener) {
		if (listener != null) {
			listeners.add(listener);
		}
	}

	@Override
	public void removeListener(ITraceListener listener) {
		if (listener != null) {
			listeners.remove(listener);
		}
	}

	@Override
	public void update() {
		valueTraces.clear();
		valueTraces.addAll(getAllValueTraces());
		canBackValueCache.clear();
		notifyListeners();
	}

	@Override
	public Step getCurrentForwardStep() {
		if (!callStack.isEmpty()) {
			return callStack.get(callStack.size() - 1);
		}
		return null;
	}

	@Override
	public Step getCurrentBackwardStep() {
		return stepBackOverResult;
	}

	@Override
	public Step getCurrentBigStep() {
		return stepBackOutResult;
	}

	@Override
	public void jump(EObject o) {
		int idx = -1;
		if (o instanceof activitydiagramTrace.States.State) {
			idx = statesTrace.indexOf(o);
		} else if (o instanceof activitydiagramTrace.States.Value) {
			final activitydiagramTrace.States.State state = ((activitydiagramTrace.States.Value) o)
					.getStatesNoOpposite().get(0);
			idx = statesTrace.indexOf(state);
		}
		if (idx != -1) {
			jump(idx);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void loadLastState() {
		final int idx = statesTrace.size() - 1;
		final List<activitydiagramTrace.Steps.SpecificStep> steps = getStepsForStates(idx, idx);
		activitydiagramTrace.Steps.SpecificStep lastStep = null;
		while (!steps.isEmpty()) {
			lastStep = steps.get(steps.size() - 1);
			steps.clear();
			if (lastStep instanceof SequentialStep<?>) {
				steps.addAll(((SequentialStep<activitydiagramTrace.Steps.SpecificStep>) lastStep).getSubSteps());
			}
		}
		final int endingIndex = getEndingIndex(lastStep);
		if (endingIndex == -1 || endingIndex == idx) {
			jumpBeforeStep(lastStep);
		}
	}

	@Override
	public boolean stepInto() {
		if (stepIntoResult != null) {
			jumpBeforeStep(stepIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepOver() {
		if (stepOverResult != null) {
			jumpBeforeStep(stepOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepReturn() {
		if (stepReturnResult != null) {
			jumpBeforeStep(stepReturnResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackInto() {
		if (stepBackIntoResult != null) {
			jumpBeforeStep(stepBackIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOver() {
		if (stepBackOverResult != null) {
			jumpBeforeStep(stepBackOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOut() {
		if (stepBackOutResult != null) {
			jumpBeforeStep(stepBackOutResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean isInReplayMode() {
		return stepIntoResult != null;
	}

	@Override
	public void updateCallStack(Step step) {
		if (step instanceof activitydiagramTrace.Steps.SpecificStep) {
			activitydiagramTrace.Steps.SpecificStep step_cast = (activitydiagramTrace.Steps.SpecificStep) step;
			final List<activitydiagramTrace.Steps.SpecificStep> newPath = new ArrayList<>();
			newPath.add(step_cast);
			EObject container = step.eContainer();
			while (container != null && container instanceof activitydiagramTrace.Steps.SpecificStep) {
				newPath.add(0, (activitydiagramTrace.Steps.SpecificStep) container);
				container = container.eContainer();
			}
			computeExplorerState(newPath);
			update();
		} else {
			throw new IllegalArgumentException(
					"ActivitydiagramTraceExplorer expects specific steps and cannot handle this: " + step);
		}
	}
}
