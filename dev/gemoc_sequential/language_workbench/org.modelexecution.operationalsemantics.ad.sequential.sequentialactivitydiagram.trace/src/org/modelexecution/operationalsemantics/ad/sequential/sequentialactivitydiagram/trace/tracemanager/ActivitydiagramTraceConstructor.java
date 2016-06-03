package org.modelexecution.operationalsemantics.ad.sequential.sequentialactivitydiagram.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.executionframework.engine.mse.LaunchConfiguration;
import org.gemoc.executionframework.engine.mse.MSEModel;
import org.gemoc.executionframework.engine.mse.SequentialStep;

import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class ActivitydiagramTraceConstructor implements ITraceConstructor {
	private activitydiagramTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private activitydiagramTrace.States.State lastState;

	private Resource traceResource;
	private Deque<activitydiagramTrace.Steps.SpecificStep> context = new LinkedList<activitydiagramTrace.Steps.SpecificStep>();

	public ActivitydiagramTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = activitydiagramTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof activitydiagram.Trace) {
						activitydiagram.Trace o_cast = (activitydiagram.Trace) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.OpaqueAction) {
						activitydiagram.OpaqueAction o_cast = (activitydiagram.OpaqueAction) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.Offer) {
						activitydiagram.Offer o_cast = (activitydiagram.Offer) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.MergeNode) {
						activitydiagram.MergeNode o_cast = (activitydiagram.MergeNode) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.JoinNode) {
						activitydiagram.JoinNode o_cast = (activitydiagram.JoinNode) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.IntegerVariable) {
						activitydiagram.IntegerVariable o_cast = (activitydiagram.IntegerVariable) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.IntegerValue) {
						activitydiagram.IntegerValue o_cast = (activitydiagram.IntegerValue) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.InputValue) {
						activitydiagram.InputValue o_cast = (activitydiagram.InputValue) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.Input) {
						activitydiagram.Input o_cast = (activitydiagram.Input) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.InitialNode) {
						activitydiagram.InitialNode o_cast = (activitydiagram.InitialNode) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.ForkedToken) {
						activitydiagram.ForkedToken o_cast = (activitydiagram.ForkedToken) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.ForkNode) {
						activitydiagram.ForkNode o_cast = (activitydiagram.ForkNode) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.DecisionNode) {
						activitydiagram.DecisionNode o_cast = (activitydiagram.DecisionNode) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.ControlToken) {
						activitydiagram.ControlToken o_cast = (activitydiagram.ControlToken) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.ControlFlow) {
						activitydiagram.ControlFlow o_cast = (activitydiagram.ControlFlow) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.BooleanVariable) {
						activitydiagram.BooleanVariable o_cast = (activitydiagram.BooleanVariable) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.BooleanValue) {
						activitydiagram.BooleanValue o_cast = (activitydiagram.BooleanValue) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.ActivityFinalNode) {
						activitydiagram.ActivityFinalNode o_cast = (activitydiagram.ActivityFinalNode) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof activitydiagram.Activity) {
						activitydiagram.Activity o_cast = (activitydiagram.Activity) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.Action o_cast, activitydiagramTrace.States.State newState) {

		if (o_cast instanceof activitydiagram.OpaqueAction) {
			addNewObjectToState((activitydiagram.OpaqueAction) o_cast, newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(activitydiagram.Activity o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedActivity tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedActivity();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedActivitys().add(tracedObject);

			// Creation of the first value of the field trace
			activitydiagramTrace.States.Activity_trace_Value firstValue_trace = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivity_trace_Value();

			if (o_cast.getTrace() != null) {
				addNewObjectToState(o_cast.getTrace(), newState);
				firstValue_trace.setTrace(((activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced
						.get(o_cast.getTrace())));
			} else {
				firstValue_trace.setTrace(null);
			}

			tracedObject.getTraceSequence().add(firstValue_trace);
			newState.getActivity_trace_Values().add(firstValue_trace);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.ActivityEdge o_cast, activitydiagramTrace.States.State newState) {

		if (o_cast instanceof activitydiagram.ControlFlow) {
			addNewObjectToState((activitydiagram.ControlFlow) o_cast, newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.ActivityFinalNode o_cast,
			activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedActivityFinalNode();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedActivityFinalNodes().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens().addAll(
					(Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.ActivityNode o_cast, activitydiagramTrace.States.State newState) {

		if (o_cast instanceof activitydiagram.OpaqueAction) {
			addNewObjectToState((activitydiagram.OpaqueAction) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.JoinNode) {
			addNewObjectToState((activitydiagram.JoinNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.ActivityFinalNode) {
			addNewObjectToState((activitydiagram.ActivityFinalNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.DecisionNode) {
			addNewObjectToState((activitydiagram.DecisionNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.MergeNode) {
			addNewObjectToState((activitydiagram.MergeNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.InitialNode) {
			addNewObjectToState((activitydiagram.InitialNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.ForkNode) {
			addNewObjectToState((activitydiagram.ForkNode) o_cast, newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(activitydiagram.BooleanValue o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedBooleanValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanValue();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedBooleanValues().add(tracedObject);

			// Creation of the first value of the field value
			activitydiagramTrace.States.BooleanValue_value_Value firstValue_value = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createBooleanValue_value_Value();

			firstValue_value.setValue(o_cast.isValue());
			tracedObject.getValueSequence().add(firstValue_value);
			newState.getBooleanValue_value_Values().add(firstValue_value);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(activitydiagram.BooleanVariable o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedBooleanVariable tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanVariable();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedBooleanVariables().add(tracedObject);

			// Creation of the first value of the field currentValue
			activitydiagramTrace.States.Variable_currentValue_Value firstValue_currentValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createVariable_currentValue_Value();

			if (o_cast.getCurrentValue() != null) {
				addNewObjectToState(o_cast.getCurrentValue(), newState);
				firstValue_currentValue
						.setCurrentValue(((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced
								.get(o_cast.getCurrentValue())));
			} else {
				firstValue_currentValue.setCurrentValue(null);
			}

			tracedObject.getCurrentValueSequence().add(firstValue_currentValue);
			newState.getVariable_currentValue_Values().add(firstValue_currentValue);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.ControlFlow o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedControlFlow tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedControlFlow();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedControlFlows().add(tracedObject);

			// Creation of the first value of the field offers
			activitydiagramTrace.States.ActivityEdge_offers_Value firstValue_offers = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityEdge_offers_Value();

			for (activitydiagram.Offer aValue : o_cast.getOffers()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_offers.getOffers().addAll(
					(Collection<? extends activitydiagramTrace.States.activitydiagram.TracedOffer>) getExeToTraced(
							o_cast.getOffers(), newState));

			tracedObject.getOffersSequence().add(firstValue_offers);
			newState.getActivityEdge_offers_Values().add(firstValue_offers);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.ControlNode o_cast, activitydiagramTrace.States.State newState) {

		if (o_cast instanceof activitydiagram.JoinNode) {
			addNewObjectToState((activitydiagram.JoinNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.ActivityFinalNode) {
			addNewObjectToState((activitydiagram.ActivityFinalNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.DecisionNode) {
			addNewObjectToState((activitydiagram.DecisionNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.MergeNode) {
			addNewObjectToState((activitydiagram.MergeNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.InitialNode) {
			addNewObjectToState((activitydiagram.InitialNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.ForkNode) {
			addNewObjectToState((activitydiagram.ForkNode) o_cast, newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(activitydiagram.ControlToken o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedControlToken tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedControlToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedControlTokens().add(tracedObject);

			// Creation of the first value of the field holder
			activitydiagramTrace.States.Token_holder_Value firstValue_holder = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createToken_holder_Value();

			if (o_cast.getHolder() != null) {
				addNewObjectToState(o_cast.getHolder(), newState);
				firstValue_holder
						.setHolder(((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast.getHolder())));
			} else {
				firstValue_holder.setHolder(null);
			}

			tracedObject.getHolderSequence().add(firstValue_holder);
			newState.getToken_holder_Values().add(firstValue_holder);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.DecisionNode o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedDecisionNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedDecisionNode();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedDecisionNodes().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens().addAll(
					(Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.ExecutableNode o_cast, activitydiagramTrace.States.State newState) {

		if (o_cast instanceof activitydiagram.OpaqueAction) {
			addNewObjectToState((activitydiagram.OpaqueAction) o_cast, newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.FinalNode o_cast, activitydiagramTrace.States.State newState) {

		if (o_cast instanceof activitydiagram.ActivityFinalNode) {
			addNewObjectToState((activitydiagram.ActivityFinalNode) o_cast, newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.ForkNode o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedForkNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedForkNode();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedForkNodes().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens().addAll(
					(Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(activitydiagram.ForkedToken o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedForkedToken tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedForkedToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedForkedTokens().add(tracedObject);

			// Creation of the first value of the field baseToken
			activitydiagramTrace.States.ForkedToken_baseToken_Value firstValue_baseToken = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createForkedToken_baseToken_Value();

			if (o_cast.getBaseToken() != null) {
				addNewObjectToState(o_cast.getBaseToken(), newState);
				firstValue_baseToken
						.setBaseToken(((activitydiagramTrace.States.activitydiagram.TracedToken) exeToTraced.get(o_cast
								.getBaseToken())));
			} else {
				firstValue_baseToken.setBaseToken(null);
			}

			tracedObject.getBaseTokenSequence().add(firstValue_baseToken);
			newState.getForkedToken_baseToken_Values().add(firstValue_baseToken);

			// Creation of the first value of the field remainingOffersCount
			activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value firstValue_remainingOffersCount = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createForkedToken_remainingOffersCount_Value();

			firstValue_remainingOffersCount.setRemainingOffersCount(o_cast.getRemainingOffersCount());
			tracedObject.getRemainingOffersCountSequence().add(firstValue_remainingOffersCount);
			newState.getForkedToken_remainingOffersCount_Values().add(firstValue_remainingOffersCount);

			// Creation of the first value of the field holder
			activitydiagramTrace.States.Token_holder_Value firstValue_holder = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createToken_holder_Value();

			if (o_cast.getHolder() != null) {
				addNewObjectToState(o_cast.getHolder(), newState);
				firstValue_holder
						.setHolder(((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast.getHolder())));
			} else {
				firstValue_holder.setHolder(null);
			}

			tracedObject.getHolderSequence().add(firstValue_holder);
			newState.getToken_holder_Values().add(firstValue_holder);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.InitialNode o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedInitialNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInitialNode();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedInitialNodes().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens().addAll(
					(Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.Input o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedInput tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInput();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedInputs().add(tracedObject);

			// Creation of the first value of the field inputValues
			activitydiagramTrace.States.Input_inputValues_Value firstValue_inputValues = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createInput_inputValues_Value();

			for (activitydiagram.InputValue aValue : o_cast.getInputValues()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_inputValues
					.getInputValues()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedInputValue>) getExeToTraced(
							o_cast.getInputValues(), newState));

			tracedObject.getInputValuesSequence().add(firstValue_inputValues);
			newState.getInput_inputValues_Values().add(firstValue_inputValues);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(activitydiagram.InputValue o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedInputValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInputValue();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedInputValues().add(tracedObject);

			// Creation of the first value of the field value
			activitydiagramTrace.States.InputValue_value_Value firstValue_value = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createInputValue_value_Value();

			if (o_cast.getValue() != null) {
				addNewObjectToState(o_cast.getValue(), newState);
				firstValue_value.setValue(((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced
						.get(o_cast.getValue())));
			} else {
				firstValue_value.setValue(null);
			}

			tracedObject.getValueSequence().add(firstValue_value);
			newState.getInputValue_value_Values().add(firstValue_value);

			// Creation of the first value of the field variable
			activitydiagramTrace.States.InputValue_variable_Value firstValue_variable = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createInputValue_variable_Value();

			if (o_cast.getVariable() != null) {
				addNewObjectToState(o_cast.getVariable(), newState);
				firstValue_variable
						.setVariable(((activitydiagramTrace.States.activitydiagram.TracedVariable) exeToTraced
								.get(o_cast.getVariable())));
			} else {
				firstValue_variable.setVariable(null);
			}

			tracedObject.getVariableSequence().add(firstValue_variable);
			newState.getInputValue_variable_Values().add(firstValue_variable);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(activitydiagram.IntegerValue o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedIntegerValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerValue();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedIntegerValues().add(tracedObject);

			// Creation of the first value of the field value
			activitydiagramTrace.States.IntegerValue_value_Value firstValue_value = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createIntegerValue_value_Value();

			firstValue_value.setValue(o_cast.getValue());
			tracedObject.getValueSequence().add(firstValue_value);
			newState.getIntegerValue_value_Values().add(firstValue_value);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(activitydiagram.IntegerVariable o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedIntegerVariable tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerVariable();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedIntegerVariables().add(tracedObject);

			// Creation of the first value of the field currentValue
			activitydiagramTrace.States.Variable_currentValue_Value firstValue_currentValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createVariable_currentValue_Value();

			if (o_cast.getCurrentValue() != null) {
				addNewObjectToState(o_cast.getCurrentValue(), newState);
				firstValue_currentValue
						.setCurrentValue(((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced
								.get(o_cast.getCurrentValue())));
			} else {
				firstValue_currentValue.setCurrentValue(null);
			}

			tracedObject.getCurrentValueSequence().add(firstValue_currentValue);
			newState.getVariable_currentValue_Values().add(firstValue_currentValue);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.JoinNode o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedJoinNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedJoinNode();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedJoinNodes().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens().addAll(
					(Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.MergeNode o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedMergeNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedMergeNode();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedMergeNodes().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens().addAll(
					(Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(activitydiagram.NamedElement o_cast, activitydiagramTrace.States.State newState) {

		if (o_cast instanceof activitydiagram.OpaqueAction) {
			addNewObjectToState((activitydiagram.OpaqueAction) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.Activity) {
			addNewObjectToState((activitydiagram.Activity) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.JoinNode) {
			addNewObjectToState((activitydiagram.JoinNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.ActivityFinalNode) {
			addNewObjectToState((activitydiagram.ActivityFinalNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.DecisionNode) {
			addNewObjectToState((activitydiagram.DecisionNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.MergeNode) {
			addNewObjectToState((activitydiagram.MergeNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.InitialNode) {
			addNewObjectToState((activitydiagram.InitialNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.ForkNode) {
			addNewObjectToState((activitydiagram.ForkNode) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.ControlFlow) {
			addNewObjectToState((activitydiagram.ControlFlow) o_cast, newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.Offer o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedOffer tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedOffer();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedOffers().add(tracedObject);

			// Creation of the first value of the field offeredTokens
			activitydiagramTrace.States.Offer_offeredTokens_Value firstValue_offeredTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createOffer_offeredTokens_Value();

			for (activitydiagram.Token aValue : o_cast.getOfferedTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_offeredTokens.getOfferedTokens().addAll(
					(Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getOfferedTokens(), newState));

			tracedObject.getOfferedTokensSequence().add(firstValue_offeredTokens);
			newState.getOffer_offeredTokens_Values().add(firstValue_offeredTokens);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.OpaqueAction o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedOpaqueAction tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedOpaqueAction();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedOpaqueActions().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens().addAll(
					(Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(activitydiagram.Token o_cast, activitydiagramTrace.States.State newState) {

		if (o_cast instanceof activitydiagram.ControlToken) {
			addNewObjectToState((activitydiagram.ControlToken) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.ForkedToken) {
			addNewObjectToState((activitydiagram.ForkedToken) o_cast, newState);
		}

	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(activitydiagram.Trace o_cast, activitydiagramTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedTrace tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedTrace();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedTraces().add(tracedObject);

			// Creation of the first value of the field executedNodes
			activitydiagramTrace.States.Trace_executedNodes_Value firstValue_executedNodes = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createTrace_executedNodes_Value();

			for (activitydiagram.ActivityNode aValue : o_cast.getExecutedNodes()) {
				addNewObjectToState(aValue, newState);
			}

			firstValue_executedNodes
					.getExecutedNodes()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityNode>) getExeToTraced(
							o_cast.getExecutedNodes(), newState));

			tracedObject.getExecutedNodesSequence().add(firstValue_executedNodes);
			newState.getTrace_executedNodes_Values().add(firstValue_executedNodes);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(activitydiagram.Value o_cast, activitydiagramTrace.States.State newState) {

		if (o_cast instanceof activitydiagram.BooleanValue) {
			addNewObjectToState((activitydiagram.BooleanValue) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.IntegerValue) {
			addNewObjectToState((activitydiagram.IntegerValue) o_cast, newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(activitydiagram.Variable o_cast, activitydiagramTrace.States.State newState) {

		if (o_cast instanceof activitydiagram.IntegerVariable) {
			addNewObjectToState((activitydiagram.IntegerVariable) o_cast, newState);
		} else if (o_cast instanceof activitydiagram.BooleanVariable) {
			addNewObjectToState((activitydiagram.BooleanVariable) o_cast, newState);
		}

	}// end addNewObjectToState

	private activitydiagramTrace.States.State copyState(activitydiagramTrace.States.State oldState) {
		activitydiagramTrace.States.State newState = activitydiagramTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getTrace_executedNodes_Values().addAll(oldState.getTrace_executedNodes_Values());
		newState.getActivityNode_heldTokens_Values().addAll(oldState.getActivityNode_heldTokens_Values());
		newState.getOffer_offeredTokens_Values().addAll(oldState.getOffer_offeredTokens_Values());
		newState.getActivityNode_heldTokens_Values().addAll(oldState.getActivityNode_heldTokens_Values());
		newState.getActivityNode_heldTokens_Values().addAll(oldState.getActivityNode_heldTokens_Values());
		newState.getVariable_currentValue_Values().addAll(oldState.getVariable_currentValue_Values());
		newState.getIntegerValue_value_Values().addAll(oldState.getIntegerValue_value_Values());
		newState.getInputValue_value_Values().addAll(oldState.getInputValue_value_Values());
		newState.getInputValue_variable_Values().addAll(oldState.getInputValue_variable_Values());
		newState.getInput_inputValues_Values().addAll(oldState.getInput_inputValues_Values());
		newState.getActivityNode_heldTokens_Values().addAll(oldState.getActivityNode_heldTokens_Values());
		newState.getForkedToken_baseToken_Values().addAll(oldState.getForkedToken_baseToken_Values());
		newState.getForkedToken_remainingOffersCount_Values().addAll(
				oldState.getForkedToken_remainingOffersCount_Values());
		newState.getToken_holder_Values().addAll(oldState.getToken_holder_Values());
		newState.getActivityNode_heldTokens_Values().addAll(oldState.getActivityNode_heldTokens_Values());
		newState.getActivityNode_heldTokens_Values().addAll(oldState.getActivityNode_heldTokens_Values());
		newState.getToken_holder_Values().addAll(oldState.getToken_holder_Values());
		newState.getActivityEdge_offers_Values().addAll(oldState.getActivityEdge_offers_Values());
		newState.getVariable_currentValue_Values().addAll(oldState.getVariable_currentValue_Values());
		newState.getBooleanValue_value_Values().addAll(oldState.getBooleanValue_value_Values());
		newState.getActivityNode_heldTokens_Values().addAll(oldState.getActivityNode_heldTokens_Values());
		newState.getActivity_trace_Values().addAll(oldState.getActivity_trace_Values());
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(Set<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			activitydiagramTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// We only look at constructable objects that have mutable fields
				// Here we have nothing to rollback, just a new object to add
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NewObjectModelChange) {
					stateChanged = true;
					if (o instanceof activitydiagram.BooleanValue) {
						activitydiagram.BooleanValue o_cast = (activitydiagram.BooleanValue) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof activitydiagram.ForkedToken) {
						activitydiagram.ForkedToken o_cast = (activitydiagram.ForkedToken) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof activitydiagram.IntegerValue) {
						activitydiagram.IntegerValue o_cast = (activitydiagram.IntegerValue) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof activitydiagram.Trace) {
						activitydiagram.Trace o_cast = (activitydiagram.Trace) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof activitydiagram.Offer) {
						activitydiagram.Offer o_cast = (activitydiagram.Offer) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof activitydiagram.InputValue) {
						activitydiagram.InputValue o_cast = (activitydiagram.InputValue) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof activitydiagram.ControlToken) {
						activitydiagram.ControlToken o_cast = (activitydiagram.ControlToken) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof activitydiagram.Input) {
						activitydiagram.Input o_cast = (activitydiagram.Input) o;
						addNewObjectToState(o_cast, newState);
					}
				}
				// We only look at constructable objects that have mutable fields
				// Here we must rollback to remove the values of the removed object from the copied state
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.RemovedObjectModelChange) {
					stateChanged = true;
					if (o instanceof activitydiagram.BooleanValue) {
						activitydiagram.BooleanValue o_cast = (activitydiagram.BooleanValue) o;
						activitydiagramTrace.States.activitydiagram.TracedBooleanValue traced = (activitydiagramTrace.States.activitydiagram.TracedBooleanValue) exeToTraced
								.get(o_cast);
						newState.getBooleanValue_value_Values().remove(
								traced.getValueSequence().get(traced.getValueSequence().size() - 1));
					}
					if (o instanceof activitydiagram.ForkedToken) {
						activitydiagram.ForkedToken o_cast = (activitydiagram.ForkedToken) o;
						activitydiagramTrace.States.activitydiagram.TracedForkedToken traced = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) exeToTraced
								.get(o_cast);
						newState.getForkedToken_baseToken_Values().remove(
								traced.getBaseTokenSequence().get(traced.getBaseTokenSequence().size() - 1));
						newState.getForkedToken_remainingOffersCount_Values().remove(
								traced.getRemainingOffersCountSequence().get(
										traced.getRemainingOffersCountSequence().size() - 1));
					}
					if (o instanceof activitydiagram.IntegerValue) {
						activitydiagram.IntegerValue o_cast = (activitydiagram.IntegerValue) o;
						activitydiagramTrace.States.activitydiagram.TracedIntegerValue traced = (activitydiagramTrace.States.activitydiagram.TracedIntegerValue) exeToTraced
								.get(o_cast);
						newState.getIntegerValue_value_Values().remove(
								traced.getValueSequence().get(traced.getValueSequence().size() - 1));
					}
					if (o instanceof activitydiagram.Trace) {
						activitydiagram.Trace o_cast = (activitydiagram.Trace) o;
						activitydiagramTrace.States.activitydiagram.TracedTrace traced = (activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced
								.get(o_cast);
						newState.getTrace_executedNodes_Values().remove(
								traced.getExecutedNodesSequence().get(traced.getExecutedNodesSequence().size() - 1));
					}
					if (o instanceof activitydiagram.Offer) {
						activitydiagram.Offer o_cast = (activitydiagram.Offer) o;
						activitydiagramTrace.States.activitydiagram.TracedOffer traced = (activitydiagramTrace.States.activitydiagram.TracedOffer) exeToTraced
								.get(o_cast);
						newState.getOffer_offeredTokens_Values().remove(
								traced.getOfferedTokensSequence().get(traced.getOfferedTokensSequence().size() - 1));
					}
					if (o instanceof activitydiagram.InputValue) {
						activitydiagram.InputValue o_cast = (activitydiagram.InputValue) o;
						activitydiagramTrace.States.activitydiagram.TracedInputValue traced = (activitydiagramTrace.States.activitydiagram.TracedInputValue) exeToTraced
								.get(o_cast);
						newState.getInputValue_value_Values().remove(
								traced.getValueSequence().get(traced.getValueSequence().size() - 1));
						newState.getInputValue_variable_Values().remove(
								traced.getVariableSequence().get(traced.getVariableSequence().size() - 1));
					}
					if (o instanceof activitydiagram.ControlToken) {
						activitydiagram.ControlToken o_cast = (activitydiagram.ControlToken) o;
						activitydiagramTrace.States.activitydiagram.TracedControlToken traced = (activitydiagramTrace.States.activitydiagram.TracedControlToken) exeToTraced
								.get(o_cast);
					}
					if (o instanceof activitydiagram.Input) {
						activitydiagram.Input o_cast = (activitydiagram.Input) o;
						activitydiagramTrace.States.activitydiagram.TracedInput traced = (activitydiagramTrace.States.activitydiagram.TracedInput) exeToTraced
								.get(o_cast);
						newState.getInput_inputValues_Values().remove(
								traced.getInputValuesSequence().get(traced.getInputValuesSequence().size() - 1));
					}
				}
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof activitydiagram.Activity) {
						activitydiagram.Activity o_cast = (activitydiagram.Activity) o;

						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivity_Trace()
								.getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedActivity traced = (activitydiagramTrace.States.activitydiagram.TracedActivity) exeToTraced
									.get(o);
							activitydiagramTrace.States.Activity_trace_Value lastValue = traced.getTraceSequence().get(
									traced.getTraceSequence().size() - 1);
							newState.getActivity_trace_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getTrace(), newState);
							activitydiagramTrace.States.Activity_trace_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createActivity_trace_Value();
							newValue.setTrace(((activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced
									.get(o_cast.getTrace())));
							traced.getTraceSequence().add(newValue);
							newState.getActivity_trace_Values().add(newValue);
						}
					} else if (o instanceof activitydiagram.BooleanValue) {
						activitydiagram.BooleanValue o_cast = (activitydiagram.BooleanValue) o;

						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getBooleanValue_Value().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedBooleanValue traced = (activitydiagramTrace.States.activitydiagram.TracedBooleanValue) exeToTraced
									.get(o);
							activitydiagramTrace.States.BooleanValue_value_Value lastValue = traced.getValueSequence()
									.get(traced.getValueSequence().size() - 1);
							newState.getBooleanValue_value_Values().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.BooleanValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createBooleanValue_value_Value();
							newValue.setValue(o_cast.isValue());
							traced.getValueSequence().add(newValue);
							newState.getBooleanValue_value_Values().add(newValue);
						}
					} else if (o instanceof activitydiagram.BooleanVariable) {
						activitydiagram.BooleanVariable o_cast = (activitydiagram.BooleanVariable) o;

						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getVariable_CurrentValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedBooleanVariable traced = (activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) exeToTraced
									.get(o);
							activitydiagramTrace.States.Variable_currentValue_Value lastValue = traced
									.getCurrentValueSequence().get(traced.getCurrentValueSequence().size() - 1);
							newState.getVariable_currentValue_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getCurrentValue(), newState);
							activitydiagramTrace.States.Variable_currentValue_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createVariable_currentValue_Value();
							newValue.setCurrentValue(((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced
									.get(o_cast.getCurrentValue())));
							traced.getCurrentValueSequence().add(newValue);
							newState.getVariable_currentValue_Values().add(newValue);
						}
					} else if (o instanceof activitydiagram.ControlToken) {
						activitydiagram.ControlToken o_cast = (activitydiagram.ControlToken) o;

						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getToken_Holder()
								.getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedControlToken traced = (activitydiagramTrace.States.activitydiagram.TracedControlToken) exeToTraced
									.get(o);
							activitydiagramTrace.States.Token_holder_Value lastValue = traced.getHolderSequence().get(
									traced.getHolderSequence().size() - 1);
							newState.getToken_holder_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getHolder(), newState);
							activitydiagramTrace.States.Token_holder_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createToken_holder_Value();
							newValue.setHolder(((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
									.get(o_cast.getHolder())));
							traced.getHolderSequence().add(newValue);
							newState.getToken_holder_Values().add(newValue);
						}
					} else if (o instanceof activitydiagram.ForkedToken) {
						activitydiagram.ForkedToken o_cast = (activitydiagram.ForkedToken) o;

						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getForkedToken_RemainingOffersCount().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedForkedToken traced = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) exeToTraced
									.get(o);
							activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value lastValue = traced
									.getRemainingOffersCountSequence().get(
											traced.getRemainingOffersCountSequence().size() - 1);
							newState.getForkedToken_remainingOffersCount_Values().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createForkedToken_remainingOffersCount_Value();
							newValue.setRemainingOffersCount(o_cast.getRemainingOffersCount());
							traced.getRemainingOffersCountSequence().add(newValue);
							newState.getForkedToken_remainingOffersCount_Values().add(newValue);
						}

						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getForkedToken_BaseToken().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedForkedToken traced = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) exeToTraced
									.get(o);
							activitydiagramTrace.States.ForkedToken_baseToken_Value lastValue = traced
									.getBaseTokenSequence().get(traced.getBaseTokenSequence().size() - 1);
							newState.getForkedToken_baseToken_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getBaseToken(), newState);
							activitydiagramTrace.States.ForkedToken_baseToken_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createForkedToken_baseToken_Value();
							newValue.setBaseToken(((activitydiagramTrace.States.activitydiagram.TracedToken) exeToTraced
									.get(o_cast.getBaseToken())));
							traced.getBaseTokenSequence().add(newValue);
							newState.getForkedToken_baseToken_Values().add(newValue);
						}

						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getToken_Holder()
								.getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedForkedToken traced = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) exeToTraced
									.get(o);
							activitydiagramTrace.States.Token_holder_Value lastValue = traced.getHolderSequence().get(
									traced.getHolderSequence().size() - 1);
							newState.getToken_holder_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getHolder(), newState);
							activitydiagramTrace.States.Token_holder_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createToken_holder_Value();
							newValue.setHolder(((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
									.get(o_cast.getHolder())));
							traced.getHolderSequence().add(newValue);
							newState.getToken_holder_Values().add(newValue);
						}
					} else if (o instanceof activitydiagram.InputValue) {
						activitydiagram.InputValue o_cast = (activitydiagram.InputValue) o;

						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getInputValue_Variable().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedInputValue traced = (activitydiagramTrace.States.activitydiagram.TracedInputValue) exeToTraced
									.get(o);
							activitydiagramTrace.States.InputValue_variable_Value lastValue = traced
									.getVariableSequence().get(traced.getVariableSequence().size() - 1);
							newState.getInputValue_variable_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getVariable(), newState);
							activitydiagramTrace.States.InputValue_variable_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createInputValue_variable_Value();
							newValue.setVariable(((activitydiagramTrace.States.activitydiagram.TracedVariable) exeToTraced
									.get(o_cast.getVariable())));
							traced.getVariableSequence().add(newValue);
							newState.getInputValue_variable_Values().add(newValue);
						}

						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getInputValue_Value()
								.getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedInputValue traced = (activitydiagramTrace.States.activitydiagram.TracedInputValue) exeToTraced
									.get(o);
							activitydiagramTrace.States.InputValue_value_Value lastValue = traced.getValueSequence()
									.get(traced.getValueSequence().size() - 1);
							newState.getInputValue_value_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getValue(), newState);
							activitydiagramTrace.States.InputValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createInputValue_value_Value();
							newValue.setValue(((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced
									.get(o_cast.getValue())));
							traced.getValueSequence().add(newValue);
							newState.getInputValue_value_Values().add(newValue);
						}
					} else if (o instanceof activitydiagram.IntegerValue) {
						activitydiagram.IntegerValue o_cast = (activitydiagram.IntegerValue) o;

						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getIntegerValue_Value().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedIntegerValue traced = (activitydiagramTrace.States.activitydiagram.TracedIntegerValue) exeToTraced
									.get(o);
							activitydiagramTrace.States.IntegerValue_value_Value lastValue = traced.getValueSequence()
									.get(traced.getValueSequence().size() - 1);
							newState.getIntegerValue_value_Values().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.IntegerValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createIntegerValue_value_Value();
							newValue.setValue(o_cast.getValue());
							traced.getValueSequence().add(newValue);
							newState.getIntegerValue_value_Values().add(newValue);
						}
					} else if (o instanceof activitydiagram.IntegerVariable) {
						activitydiagram.IntegerVariable o_cast = (activitydiagram.IntegerVariable) o;

						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getVariable_CurrentValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedIntegerVariable traced = (activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) exeToTraced
									.get(o);
							activitydiagramTrace.States.Variable_currentValue_Value lastValue = traced
									.getCurrentValueSequence().get(traced.getCurrentValueSequence().size() - 1);
							newState.getVariable_currentValue_Values().remove(lastValue);

							// And we create a proper new value
							addNewObjectToState(o_cast.getCurrentValue(), newState);
							activitydiagramTrace.States.Variable_currentValue_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createVariable_currentValue_Value();
							newValue.setCurrentValue(((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced
									.get(o_cast.getCurrentValue())));
							traced.getCurrentValueSequence().add(newValue);
							newState.getVariable_currentValue_Values().add(newValue);
						}
					}
				}
				// Here we look at collection mutable fields
				// We must first manually find out if the collection changed...
				// If it changed we must rollback the last values from the copied state, and add new values as well
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) {
					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof activitydiagram.ActivityFinalNode) {
						activitydiagram.ActivityFinalNode o_cast = (activitydiagram.ActivityFinalNode) o;
						activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityNode_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										activitydiagram.Token aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								activitydiagramTrace.States.ActivityNode_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNode_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createActivityNode_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNode_heldTokens_Values().add(newValue);
							}
						}
					} else if (o instanceof activitydiagram.ControlFlow) {
						activitydiagram.ControlFlow o_cast = (activitydiagram.ControlFlow) o;
						activitydiagramTrace.States.activitydiagram.TracedControlFlow tracedObject = (activitydiagramTrace.States.activitydiagram.TracedControlFlow) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityEdge_Offers().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.ActivityEdge_offers_Value> valueSequence = tracedObject
									.getOffersSequence();
							activitydiagramTrace.States.ActivityEdge_offers_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (activitydiagram.Offer aValue : o_cast.getOffers()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOffers().size() == o_cast.getOffers().size()) {
									java.util.Iterator<activitydiagram.Offer> it = o_cast.getOffers().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedOffer aPreviousValue : previousValue
											.getOffers()) {
										activitydiagram.Offer aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								activitydiagramTrace.States.ActivityEdge_offers_Value lastValue = tracedObject
										.getOffersSequence().get(tracedObject.getOffersSequence().size() - 1);
								newState.getActivityEdge_offers_Values().remove(lastValue);
								// And we create a proper new value							
								activitydiagramTrace.States.ActivityEdge_offers_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createActivityEdge_offers_Value();
								newValue.getOffers()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedOffer>) getExeToTraced(
												o_cast.getOffers(), newState));
								tracedObject.getOffersSequence().add(newValue);
								newState.getActivityEdge_offers_Values().add(newValue);
							}
						}
					} else if (o instanceof activitydiagram.DecisionNode) {
						activitydiagram.DecisionNode o_cast = (activitydiagram.DecisionNode) o;
						activitydiagramTrace.States.activitydiagram.TracedDecisionNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedDecisionNode) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityNode_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										activitydiagram.Token aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								activitydiagramTrace.States.ActivityNode_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNode_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createActivityNode_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNode_heldTokens_Values().add(newValue);
							}
						}
					} else if (o instanceof activitydiagram.ForkNode) {
						activitydiagram.ForkNode o_cast = (activitydiagram.ForkNode) o;
						activitydiagramTrace.States.activitydiagram.TracedForkNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedForkNode) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityNode_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										activitydiagram.Token aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								activitydiagramTrace.States.ActivityNode_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNode_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createActivityNode_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNode_heldTokens_Values().add(newValue);
							}
						}
					} else if (o instanceof activitydiagram.InitialNode) {
						activitydiagram.InitialNode o_cast = (activitydiagram.InitialNode) o;
						activitydiagramTrace.States.activitydiagram.TracedInitialNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedInitialNode) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityNode_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										activitydiagram.Token aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								activitydiagramTrace.States.ActivityNode_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNode_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createActivityNode_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNode_heldTokens_Values().add(newValue);
							}
						}
					} else if (o instanceof activitydiagram.Input) {
						activitydiagram.Input o_cast = (activitydiagram.Input) o;
						activitydiagramTrace.States.activitydiagram.TracedInput tracedObject = (activitydiagramTrace.States.activitydiagram.TracedInput) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getInput_InputValues()
								.getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.Input_inputValues_Value> valueSequence = tracedObject
									.getInputValuesSequence();
							activitydiagramTrace.States.Input_inputValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (activitydiagram.InputValue aValue : o_cast.getInputValues()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getInputValues().size() == o_cast.getInputValues().size()) {
									java.util.Iterator<activitydiagram.InputValue> it = o_cast.getInputValues()
											.iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedInputValue aPreviousValue : previousValue
											.getInputValues()) {
										activitydiagram.InputValue aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								activitydiagramTrace.States.Input_inputValues_Value lastValue = tracedObject
										.getInputValuesSequence().get(tracedObject.getInputValuesSequence().size() - 1);
								newState.getInput_inputValues_Values().remove(lastValue);
								// And we create a proper new value							
								activitydiagramTrace.States.Input_inputValues_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createInput_inputValues_Value();
								newValue.getInputValues()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedInputValue>) getExeToTraced(
												o_cast.getInputValues(), newState));
								tracedObject.getInputValuesSequence().add(newValue);
								newState.getInput_inputValues_Values().add(newValue);
							}
						}
					} else if (o instanceof activitydiagram.JoinNode) {
						activitydiagram.JoinNode o_cast = (activitydiagram.JoinNode) o;
						activitydiagramTrace.States.activitydiagram.TracedJoinNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedJoinNode) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityNode_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										activitydiagram.Token aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								activitydiagramTrace.States.ActivityNode_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNode_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createActivityNode_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNode_heldTokens_Values().add(newValue);
							}
						}
					} else if (o instanceof activitydiagram.MergeNode) {
						activitydiagram.MergeNode o_cast = (activitydiagram.MergeNode) o;
						activitydiagramTrace.States.activitydiagram.TracedMergeNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedMergeNode) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityNode_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										activitydiagram.Token aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								activitydiagramTrace.States.ActivityNode_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNode_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createActivityNode_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNode_heldTokens_Values().add(newValue);
							}
						}
					} else if (o instanceof activitydiagram.Offer) {
						activitydiagram.Offer o_cast = (activitydiagram.Offer) o;
						activitydiagramTrace.States.activitydiagram.TracedOffer tracedObject = (activitydiagramTrace.States.activitydiagram.TracedOffer) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getOffer_OfferedTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.Offer_offeredTokens_Value> valueSequence = tracedObject
									.getOfferedTokensSequence();
							activitydiagramTrace.States.Offer_offeredTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (activitydiagram.Token aValue : o_cast.getOfferedTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOfferedTokens().size() == o_cast.getOfferedTokens().size()) {
									java.util.Iterator<activitydiagram.Token> it = o_cast.getOfferedTokens().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue
											.getOfferedTokens()) {
										activitydiagram.Token aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								activitydiagramTrace.States.Offer_offeredTokens_Value lastValue = tracedObject
										.getOfferedTokensSequence().get(
												tracedObject.getOfferedTokensSequence().size() - 1);
								newState.getOffer_offeredTokens_Values().remove(lastValue);
								// And we create a proper new value							
								activitydiagramTrace.States.Offer_offeredTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createOffer_offeredTokens_Value();
								newValue.getOfferedTokens()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
												o_cast.getOfferedTokens(), newState));
								tracedObject.getOfferedTokensSequence().add(newValue);
								newState.getOffer_offeredTokens_Values().add(newValue);
							}
						}
					} else if (o instanceof activitydiagram.OpaqueAction) {
						activitydiagram.OpaqueAction o_cast = (activitydiagram.OpaqueAction) o;
						activitydiagramTrace.States.activitydiagram.TracedOpaqueAction tracedObject = (activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityNode_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										activitydiagram.Token aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								activitydiagramTrace.States.ActivityNode_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNode_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createActivityNode_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNode_heldTokens_Values().add(newValue);
							}
						}
					} else if (o instanceof activitydiagram.Trace) {
						activitydiagram.Trace o_cast = (activitydiagram.Trace) o;
						activitydiagramTrace.States.activitydiagram.TracedTrace tracedObject = (activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getTrace_ExecutedNodes().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.Trace_executedNodes_Value> valueSequence = tracedObject
									.getExecutedNodesSequence();
							activitydiagramTrace.States.Trace_executedNodes_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (activitydiagram.ActivityNode aValue : o_cast.getExecutedNodes()) {
								addNewObjectToState(aValue, newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getExecutedNodes().size() == o_cast.getExecutedNodes().size()) {
									java.util.Iterator<activitydiagram.ActivityNode> it = o_cast.getExecutedNodes()
											.iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedActivityNode aPreviousValue : previousValue
											.getExecutedNodes()) {
										activitydiagram.ActivityNode aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								activitydiagramTrace.States.Trace_executedNodes_Value lastValue = tracedObject
										.getExecutedNodesSequence().get(
												tracedObject.getExecutedNodesSequence().size() - 1);
								newState.getTrace_executedNodes_Values().remove(lastValue);
								// And we create a proper new value							
								activitydiagramTrace.States.Trace_executedNodes_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createTrace_executedNodes_Value();
								newValue.getExecutedNodes()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityNode>) getExeToTraced(
												o_cast.getExecutedNodes(), newState));
								tracedObject.getExecutedNodesSequence().add(newValue);
								newState.getTrace_executedNodes_Values().add(newValue);
							}
						}
					}
				}
			}
			if (stateChanged) {
				final activitydiagramTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof org.gemoc.executionframework.engine.mse.BigStep) {
					final activitydiagramTrace.States.State startingState = lastState;
					final activitydiagramTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(org.gemoc.executionframework.engine.mse.Step step) {
		activitydiagramTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof activitydiagramTrace.Steps.SpecificStep) {
			step_cast = (activitydiagramTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			activitydiagramTrace.States.State state = traceRoot.getStatesTrace().get(
					traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<activitydiagramTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(
						step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_Activity_Execute activitydiagram_Activity_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) step_cast;
				traceRoot.getActivitydiagram_Activity_Execute_Sequence().add(activitydiagram_Activity_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext) {
				activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext activitydiagram_Activity_InitializeContextInstance = (activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext) step_cast;
				traceRoot.getActivitydiagram_Activity_InitializeContext_Sequence().add(
						activitydiagram_Activity_InitializeContextInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Reset) {
				activitydiagramTrace.Steps.Activitydiagram_Activity_Reset activitydiagram_Activity_ResetInstance = (activitydiagramTrace.Steps.Activitydiagram_Activity_Reset) step_cast;
				traceRoot.getActivitydiagram_Activity_Reset_Sequence().add(activitydiagram_Activity_ResetInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace) {
				activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace activitydiagram_Activity_WriteTraceInstance = (activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace) step_cast;
				traceRoot.getActivitydiagram_Activity_WriteTrace_Sequence().add(
						activitydiagram_Activity_WriteTraceInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute activitydiagram_ActivityFinalNode_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute) step_cast;
				traceRoot.getActivitydiagram_ActivityFinalNode_Execute_Sequence().add(
						activitydiagram_ActivityFinalNode_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1 activitydiagram_ActivityNode_AddTokens1Instance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_AddTokens1_Sequence().add(
						activitydiagram_ActivityNode_AddTokens1Instance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute activitydiagram_ActivityNode_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_Execute_Sequence().add(
						activitydiagram_ActivityNode_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1 activitydiagram_ActivityNode_RemoveToken1Instance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_RemoveToken1_Sequence().add(
						activitydiagram_ActivityNode_RemoveToken1Instance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1 activitydiagram_ActivityNode_SendOffers1Instance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_SendOffers1_Sequence().add(
						activitydiagram_ActivityNode_SendOffers1Instance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1 activitydiagram_ActivityNode_TakeOfferdTokens1Instance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence().add(
						activitydiagram_ActivityNode_TakeOfferdTokens1Instance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate activitydiagram_ActivityNode_TerminateInstance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_Terminate_Sequence().add(
						activitydiagram_ActivityNode_TerminateInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_BooleanBinaryExpression_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_BooleanBinaryExpression_Execute activitydiagram_BooleanBinaryExpression_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_BooleanBinaryExpression_Execute) step_cast;
				traceRoot.getActivitydiagram_BooleanBinaryExpression_Execute_Sequence().add(
						activitydiagram_BooleanBinaryExpression_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_BooleanUnaryExpression_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_BooleanUnaryExpression_Execute activitydiagram_BooleanUnaryExpression_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_BooleanUnaryExpression_Execute) step_cast;
				traceRoot.getActivitydiagram_BooleanUnaryExpression_Execute_Sequence().add(
						activitydiagram_BooleanUnaryExpression_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute activitydiagram_BooleanVariable_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute) step_cast;
				traceRoot.getActivitydiagram_BooleanVariable_Execute_Sequence().add(
						activitydiagram_BooleanVariable_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init) {
				activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init activitydiagram_BooleanVariable_InitInstance = (activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init) step_cast;
				traceRoot.getActivitydiagram_BooleanVariable_Init_Sequence().add(
						activitydiagram_BooleanVariable_InitInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute activitydiagram_DecisionNode_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute) step_cast;
				traceRoot.getActivitydiagram_DecisionNode_Execute_Sequence().add(
						activitydiagram_DecisionNode_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1) {
				activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1 activitydiagram_DecisionNode_SendOffers1Instance = (activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1) step_cast;
				traceRoot.getActivitydiagram_DecisionNode_SendOffers1_Sequence().add(
						activitydiagram_DecisionNode_SendOffers1Instance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_Expression_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_Expression_Execute activitydiagram_Expression_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_Expression_Execute) step_cast;
				traceRoot.getActivitydiagram_Expression_Execute_Sequence().add(
						activitydiagram_Expression_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute activitydiagram_ForkNode_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute) step_cast;
				traceRoot.getActivitydiagram_ForkNode_Execute_Sequence().add(activitydiagram_ForkNode_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute activitydiagram_InitialNode_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute) step_cast;
				traceRoot.getActivitydiagram_InitialNode_Execute_Sequence().add(
						activitydiagram_InitialNode_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_IntegerCalculationExpression_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_IntegerCalculationExpression_Execute activitydiagram_IntegerCalculationExpression_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_IntegerCalculationExpression_Execute) step_cast;
				traceRoot.getActivitydiagram_IntegerCalculationExpression_Execute_Sequence().add(
						activitydiagram_IntegerCalculationExpression_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_IntegerComparisonExpression_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_IntegerComparisonExpression_Execute activitydiagram_IntegerComparisonExpression_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_IntegerComparisonExpression_Execute) step_cast;
				traceRoot.getActivitydiagram_IntegerComparisonExpression_Execute_Sequence().add(
						activitydiagram_IntegerComparisonExpression_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute activitydiagram_IntegerVariable_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute) step_cast;
				traceRoot.getActivitydiagram_IntegerVariable_Execute_Sequence().add(
						activitydiagram_IntegerVariable_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init) {
				activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init activitydiagram_IntegerVariable_InitInstance = (activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init) step_cast;
				traceRoot.getActivitydiagram_IntegerVariable_Init_Sequence().add(
						activitydiagram_IntegerVariable_InitInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute activitydiagram_JoinNode_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute) step_cast;
				traceRoot.getActivitydiagram_JoinNode_Execute_Sequence().add(activitydiagram_JoinNode_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute activitydiagram_MergeNode_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute) step_cast;
				traceRoot.getActivitydiagram_MergeNode_Execute_Sequence()
						.add(activitydiagram_MergeNode_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute activitydiagram_NamedElement_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute) step_cast;
				traceRoot.getActivitydiagram_NamedElement_Execute_Sequence().add(
						activitydiagram_NamedElement_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute activitydiagram_OpaqueAction_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute) step_cast;
				traceRoot.getActivitydiagram_OpaqueAction_Execute_Sequence().add(
						activitydiagram_OpaqueAction_ExecuteInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(activitydiagramTrace.Steps.SpecificStep currentStep,
			activitydiagramTrace.States.State startingState, activitydiagramTrace.States.State endingState) {

		activitydiagramTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityFinalNode_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ActivityFinalNode_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ActivityNode_AddTokens1_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ActivityNode_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_Activity_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_Activity_WriteTrace_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_BooleanVariable_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_DecisionNode_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_DecisionNode_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_ForkNode_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ForkNode_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_InitialNode_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_InitialNode_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_JoinNode_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_JoinNode_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_MergeNode_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_MergeNode_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_NamedElement_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_NamedElement_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_OpaqueAction_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_OpaqueAction_Execute_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<activitydiagramTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(org.gemoc.executionframework.engine.mse.Step step) {
		activitydiagramTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = activitydiagramTrace.ActivitydiagramTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		org.gemoc.executionframework.engine.mse.SequentialStep<activitydiagramTrace.Steps.SpecificStep> rootStep = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE
				.createSequentialStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		return allResources;
	}

	private Collection<? extends EObject> getExeToTraced(Collection<? extends EObject> exeObjects,
			activitydiagramTrace.States.State newState) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject exeObject : exeObjects) {
			result.add(exeToTraced.get(exeObject));
		}
		return result;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
