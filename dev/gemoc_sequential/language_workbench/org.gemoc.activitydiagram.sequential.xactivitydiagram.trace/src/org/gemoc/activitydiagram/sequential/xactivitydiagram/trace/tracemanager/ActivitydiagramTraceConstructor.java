package org.gemoc.activitydiagram.sequential.xactivitydiagram.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class ActivitydiagramTraceConstructor implements ITraceConstructor {
	private activitydiagramTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private activitydiagramTrace.States.State lastState;

	private Resource traceResource;
	private final Deque<activitydiagramTrace.Steps.SpecificStep> context = new LinkedList<activitydiagramTrace.Steps.SpecificStep>();

	public ActivitydiagramTraceConstructor(Resource exeModel, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
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

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedActivity tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedActivity();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedActivitys().add(tracedObject);

			// Creation of the first value of the field trace
			activitydiagramTrace.States.Activity_trace_Value firstValue_trace = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivity_trace_Value();

			if (o_cast.getTrace() != null) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) o_cast.getTrace(),
						newState);
				firstValue_trace.setTrace(
						(activitydiagramTrace.States.activitydiagram.TracedTrace) ((activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced
								.get(o_cast.getTrace())));
			} else {
				firstValue_trace.setTrace((activitydiagramTrace.States.activitydiagram.TracedTrace) null);
			}

			tracedObject.getTraceSequence().add(firstValue_trace);
			newState.getActivity_trace_Values().add(firstValue_trace);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedActivityFinalNode();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedActivityFinalNodes().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode) o_cast,
					newState);
		} else
			if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode) o_cast,
					newState);
		}

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedActivityNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedActivityNode();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedActivityNodes().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedBooleanValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanValue();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedBooleanValues().add(tracedObject);

			// Creation of the first value of the field value
			activitydiagramTrace.States.BooleanValue_value_Value firstValue_value = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createBooleanValue_value_Value();

			firstValue_value.setValue((boolean) o_cast.isValue());
			tracedObject.getValueSequence().add(firstValue_value);
			newState.getBooleanValue_value_Values().add(firstValue_value);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedBooleanVariable tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanVariable();
			tracedObject.setOriginalObject_Variable(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedBooleanVariables().add(tracedObject);

			// Creation of the first value of the field currentValue
			activitydiagramTrace.States.Variable_currentValue_Value firstValue_currentValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createVariable_currentValue_Value();

			if (o_cast.getCurrentValue() != null) {
				addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) o_cast
						.getCurrentValue(), newState);
				firstValue_currentValue.setCurrentValue(
						(activitydiagramTrace.States.activitydiagram.TracedValue) ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced
								.get(o_cast.getCurrentValue())));
			} else {
				firstValue_currentValue.setCurrentValue((activitydiagramTrace.States.activitydiagram.TracedValue) null);
			}

			tracedObject.getCurrentValueSequence().add(firstValue_currentValue);
			newState.getVariable_currentValue_Values().add(firstValue_currentValue);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedControlFlow tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedControlFlow();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedControlFlows().add(tracedObject);

			// Creation of the first value of the field offers
			activitydiagramTrace.States.ActivityEdge_offers_Value firstValue_offers = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityEdge_offers_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer aValue : o_cast
					.getOffers()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) aValue, newState);
			}

			firstValue_offers.getOffers()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedOffer>) getExeToTraced(
							o_cast.getOffers(), newState));

			tracedObject.getOffersSequence().add(firstValue_offers);
			newState.getActivityEdge_offers_Values().add(firstValue_offers);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) o_cast, newState);
		} else
			if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedControlToken tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedControlToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedControlTokens().add(tracedObject);

			// Creation of the first value of the field holder
			activitydiagramTrace.States.Token_holder_Value firstValue_holder = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createToken_holder_Value();

			if (o_cast.getHolder() != null) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast
								.getHolder(),
						newState);
				firstValue_holder.setHolder(
						(activitydiagramTrace.States.activitydiagram.TracedActivityNode) ((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast.getHolder())));
			} else {
				firstValue_holder.setHolder((activitydiagramTrace.States.activitydiagram.TracedActivityNode) null);
			}

			tracedObject.getHolderSequence().add(firstValue_holder);
			newState.getToken_holder_Values().add(firstValue_holder);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedDecisionNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedDecisionNode();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedDecisionNodes().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedForkNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedForkNode();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedForkNodes().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedForkedToken tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedForkedToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedForkedTokens().add(tracedObject);

			// Creation of the first value of the field baseToken
			activitydiagramTrace.States.ForkedToken_baseToken_Value firstValue_baseToken = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createForkedToken_baseToken_Value();

			if (o_cast.getBaseToken() != null) {
				addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) o_cast
						.getBaseToken(), newState);
				firstValue_baseToken.setBaseToken(
						(activitydiagramTrace.States.activitydiagram.TracedToken) ((activitydiagramTrace.States.activitydiagram.TracedToken) exeToTraced
								.get(o_cast.getBaseToken())));
			} else {
				firstValue_baseToken.setBaseToken((activitydiagramTrace.States.activitydiagram.TracedToken) null);
			}

			tracedObject.getBaseTokenSequence().add(firstValue_baseToken);
			newState.getForkedToken_baseToken_Values().add(firstValue_baseToken);

			// Creation of the first value of the field remainingOffersCount
			activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value firstValue_remainingOffersCount = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createForkedToken_remainingOffersCount_Value();

			firstValue_remainingOffersCount.setRemainingOffersCount((int) o_cast.getRemainingOffersCount());
			tracedObject.getRemainingOffersCountSequence().add(firstValue_remainingOffersCount);
			newState.getForkedToken_remainingOffersCount_Values().add(firstValue_remainingOffersCount);

			// Creation of the first value of the field holder
			activitydiagramTrace.States.Token_holder_Value firstValue_holder = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createToken_holder_Value();

			if (o_cast.getHolder() != null) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast
								.getHolder(),
						newState);
				firstValue_holder.setHolder(
						(activitydiagramTrace.States.activitydiagram.TracedActivityNode) ((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast.getHolder())));
			} else {
				firstValue_holder.setHolder((activitydiagramTrace.States.activitydiagram.TracedActivityNode) null);
			}

			tracedObject.getHolderSequence().add(firstValue_holder);
			newState.getToken_holder_Values().add(firstValue_holder);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedInitialNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInitialNode();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedInitialNodes().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedInput tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInput();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedInputs().add(tracedObject);

			// Creation of the first value of the field inputValues
			activitydiagramTrace.States.Input_inputValues_Value firstValue_inputValues = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createInput_inputValues_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue aValue : o_cast
					.getInputValues()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) aValue,
						newState);
			}

			firstValue_inputValues.getInputValues()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedInputValue>) getExeToTraced(
							o_cast.getInputValues(), newState));

			tracedObject.getInputValuesSequence().add(firstValue_inputValues);
			newState.getInput_inputValues_Values().add(firstValue_inputValues);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedInputValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInputValue();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedInputValues().add(tracedObject);

			// Creation of the first value of the field value
			activitydiagramTrace.States.InputValue_value_Value firstValue_value = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createInputValue_value_Value();

			if (o_cast.getValue() != null) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) o_cast.getValue(),
						newState);
				firstValue_value.setValue(
						(activitydiagramTrace.States.activitydiagram.TracedValue) ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced
								.get(o_cast.getValue())));
			} else {
				firstValue_value.setValue((activitydiagramTrace.States.activitydiagram.TracedValue) null);
			}

			tracedObject.getValueSequence().add(firstValue_value);
			newState.getInputValue_value_Values().add(firstValue_value);

			// Creation of the first value of the field variable
			activitydiagramTrace.States.InputValue_variable_Value firstValue_variable = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createInputValue_variable_Value();

			if (o_cast.getVariable() != null) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) o_cast
								.getVariable(),
						newState);
				firstValue_variable.setVariable(
						(activitydiagramTrace.States.activitydiagram.TracedVariable) ((activitydiagramTrace.States.activitydiagram.TracedVariable) exeToTraced
								.get(o_cast.getVariable())));
			} else {
				firstValue_variable.setVariable((activitydiagramTrace.States.activitydiagram.TracedVariable) null);
			}

			tracedObject.getVariableSequence().add(firstValue_variable);
			newState.getInputValue_variable_Values().add(firstValue_variable);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedIntegerValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerValue();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedIntegerValues().add(tracedObject);

			// Creation of the first value of the field value
			activitydiagramTrace.States.IntegerValue_value_Value firstValue_value = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createIntegerValue_value_Value();

			firstValue_value.setValue((int) o_cast.getValue());
			tracedObject.getValueSequence().add(firstValue_value);
			newState.getIntegerValue_value_Values().add(firstValue_value);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedIntegerVariable tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerVariable();
			tracedObject.setOriginalObject_Variable(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedIntegerVariables().add(tracedObject);

			// Creation of the first value of the field currentValue
			activitydiagramTrace.States.Variable_currentValue_Value firstValue_currentValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createVariable_currentValue_Value();

			if (o_cast.getCurrentValue() != null) {
				addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) o_cast
						.getCurrentValue(), newState);
				firstValue_currentValue.setCurrentValue(
						(activitydiagramTrace.States.activitydiagram.TracedValue) ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced
								.get(o_cast.getCurrentValue())));
			} else {
				firstValue_currentValue.setCurrentValue((activitydiagramTrace.States.activitydiagram.TracedValue) null);
			}

			tracedObject.getCurrentValueSequence().add(firstValue_currentValue);
			newState.getVariable_currentValue_Values().add(firstValue_currentValue);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedJoinNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedJoinNode();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedJoinNodes().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedMergeNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedMergeNode();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedMergeNodes().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast,
					newState);
		} else
			if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedOffer tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedOffer();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedOffers().add(tracedObject);

			// Creation of the first value of the field offeredTokens
			activitydiagramTrace.States.Offer_offeredTokens_Value firstValue_offeredTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createOffer_offeredTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token aValue : o_cast
					.getOfferedTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) aValue, newState);
			}

			firstValue_offeredTokens.getOfferedTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getOfferedTokens(), newState));

			tracedObject.getOfferedTokensSequence().add(firstValue_offeredTokens);
			newState.getOffer_offeredTokens_Values().add(firstValue_offeredTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedOpaqueAction tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedOpaqueAction();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedOpaqueActions().add(tracedObject);

			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) aValue, newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getHeldTokensSequence().add(firstValue_heldTokens);
			newState.getActivityNode_heldTokens_Values().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) o_cast,
					newState);
		} else
			if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) o_cast,
					newState);
		}

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedToken tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedTokens().add(tracedObject);

			// Creation of the first value of the field holder
			activitydiagramTrace.States.Token_holder_Value firstValue_holder = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createToken_holder_Value();

			if (o_cast.getHolder() != null) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast
								.getHolder(),
						newState);
				firstValue_holder.setHolder(
						(activitydiagramTrace.States.activitydiagram.TracedActivityNode) ((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast.getHolder())));
			} else {
				firstValue_holder.setHolder((activitydiagramTrace.States.activitydiagram.TracedActivityNode) null);
			}

			tracedObject.getHolderSequence().add(firstValue_holder);
			newState.getToken_holder_Values().add(firstValue_holder);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedTrace tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedTrace();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedTraces().add(tracedObject);

			// Creation of the first value of the field executedNodes
			activitydiagramTrace.States.Trace_executedNodes_Value firstValue_executedNodes = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createTrace_executedNodes_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode aValue : o_cast
					.getExecutedNodes()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) aValue,
						newState);
			}

			firstValue_executedNodes.getExecutedNodes()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityNode>) getExeToTraced(
							o_cast.getExecutedNodes(), newState));

			tracedObject.getExecutedNodesSequence().add(firstValue_executedNodes);
			newState.getTrace_executedNodes_Values().add(firstValue_executedNodes);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) o_cast,
					newState);
		} else
			if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) o_cast,
					newState);
		}

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedValue();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedValues().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable o_cast,
			activitydiagramTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) o_cast,
					newState);
		} else
			if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) o_cast,
					newState);
		}

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedVariable tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedVariable();
			tracedObject.setOriginalObject_Variable(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getActivitydiagram_tracedVariables().add(tracedObject);

			// Creation of the first value of the field currentValue
			activitydiagramTrace.States.Variable_currentValue_Value firstValue_currentValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createVariable_currentValue_Value();

			if (o_cast.getCurrentValue() != null) {
				addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) o_cast
						.getCurrentValue(), newState);
				firstValue_currentValue.setCurrentValue(
						(activitydiagramTrace.States.activitydiagram.TracedValue) ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced
								.get(o_cast.getCurrentValue())));
			} else {
				firstValue_currentValue.setCurrentValue((activitydiagramTrace.States.activitydiagram.TracedValue) null);
			}

			tracedObject.getCurrentValueSequence().add(firstValue_currentValue);
			newState.getVariable_currentValue_Values().add(firstValue_currentValue);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private activitydiagramTrace.States.State copyState(activitydiagramTrace.States.State oldState) {
		activitydiagramTrace.States.State newState = activitydiagramTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getVariable_currentValue_Values().addAll(oldState.getVariable_currentValue_Values());
		newState.getActivityNode_heldTokens_Values().addAll(oldState.getActivityNode_heldTokens_Values());
		newState.getActivityEdge_offers_Values().addAll(oldState.getActivityEdge_offers_Values());
		newState.getActivity_trace_Values().addAll(oldState.getActivity_trace_Values());
		newState.getBooleanValue_value_Values().addAll(oldState.getBooleanValue_value_Values());
		newState.getForkedToken_baseToken_Values().addAll(oldState.getForkedToken_baseToken_Values());
		newState.getForkedToken_remainingOffersCount_Values()
				.addAll(oldState.getForkedToken_remainingOffersCount_Values());
		newState.getInput_inputValues_Values().addAll(oldState.getInput_inputValues_Values());
		newState.getInputValue_value_Values().addAll(oldState.getInputValue_value_Values());
		newState.getInputValue_variable_Values().addAll(oldState.getInputValue_variable_Values());
		newState.getIntegerValue_value_Values().addAll(oldState.getIntegerValue_value_Values());
		newState.getOffer_offeredTokens_Values().addAll(oldState.getOffer_offeredTokens_Values());
		newState.getToken_holder_Values().addAll(oldState.getToken_holder_Values());
		newState.getTrace_executedNodes_Values().addAll(oldState.getTrace_executedNodes_Values());
		copiedState = true;
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
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
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) o;
						addNewObjectToState(o_cast, newState);
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) o;
						addNewObjectToState(o_cast, newState);
					}
				}
				// We only look at constructable objects that have mutable fields
				// Here we must rollback to remove the values of the removed object from the copied state
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.RemovedObjectModelChange) {
					stateChanged = true;
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) o;
						activitydiagramTrace.States.activitydiagram.TracedBooleanValue traced = (activitydiagramTrace.States.activitydiagram.TracedBooleanValue) exeToTraced
								.get(o_cast);
						newState.getBooleanValue_value_Values()
								.remove(traced.getValueSequence().get(traced.getValueSequence().size() - 1));
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) o;
						activitydiagramTrace.States.activitydiagram.TracedOffer traced = (activitydiagramTrace.States.activitydiagram.TracedOffer) exeToTraced
								.get(o_cast);
						newState.getOffer_offeredTokens_Values().remove(
								traced.getOfferedTokensSequence().get(traced.getOfferedTokensSequence().size() - 1));
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) o;
						activitydiagramTrace.States.activitydiagram.TracedForkedToken traced = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) exeToTraced
								.get(o_cast);
						newState.getForkedToken_baseToken_Values()
								.remove(traced.getBaseTokenSequence().get(traced.getBaseTokenSequence().size() - 1));
						newState.getForkedToken_remainingOffersCount_Values()
								.remove(traced.getRemainingOffersCountSequence()
										.get(traced.getRemainingOffersCountSequence().size() - 1));
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) o;
						activitydiagramTrace.States.activitydiagram.TracedToken traced = (activitydiagramTrace.States.activitydiagram.TracedToken) exeToTraced
								.get(o_cast);
						newState.getToken_holder_Values()
								.remove(traced.getHolderSequence().get(traced.getHolderSequence().size() - 1));
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) o;
						activitydiagramTrace.States.activitydiagram.TracedTrace traced = (activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced
								.get(o_cast);
						newState.getTrace_executedNodes_Values().remove(
								traced.getExecutedNodesSequence().get(traced.getExecutedNodesSequence().size() - 1));
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input) o;
						activitydiagramTrace.States.activitydiagram.TracedInput traced = (activitydiagramTrace.States.activitydiagram.TracedInput) exeToTraced
								.get(o_cast);
						newState.getInput_inputValues_Values().remove(
								traced.getInputValuesSequence().get(traced.getInputValuesSequence().size() - 1));
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) o;
						activitydiagramTrace.States.activitydiagram.TracedIntegerValue traced = (activitydiagramTrace.States.activitydiagram.TracedIntegerValue) exeToTraced
								.get(o_cast);
						newState.getIntegerValue_value_Values()
								.remove(traced.getValueSequence().get(traced.getValueSequence().size() - 1));
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) o;
						activitydiagramTrace.States.activitydiagram.TracedInputValue traced = (activitydiagramTrace.States.activitydiagram.TracedInputValue) exeToTraced
								.get(o_cast);
						newState.getInputValue_value_Values()
								.remove(traced.getValueSequence().get(traced.getValueSequence().size() - 1));
						newState.getInputValue_variable_Values()
								.remove(traced.getVariableSequence().get(traced.getVariableSequence().size() - 1));
					}
				}
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) o;

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getForkedToken_BaseToken().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedForkedToken traced = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) exeToTraced
									.get(o);
							activitydiagramTrace.States.ForkedToken_baseToken_Value lastValue = traced
									.getBaseTokenSequence().get(traced.getBaseTokenSequence().size() - 1);
							newState.getForkedToken_baseToken_Values().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.ForkedToken_baseToken_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createForkedToken_baseToken_Value();

							activitydiagramTrace.States.activitydiagram.TracedToken value = null;
							if (o_cast.getBaseToken() != null) {
								value = ((activitydiagramTrace.States.activitydiagram.TracedToken) exeToTraced
										.get(o_cast.getBaseToken()));
							}

							newValue.setBaseToken((activitydiagramTrace.States.activitydiagram.TracedToken) value);

							traced.getBaseTokenSequence().add(newValue);
							newState.getForkedToken_baseToken_Values().add(newValue);
						} else

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getForkedToken_RemainingOffersCount().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedForkedToken traced = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) exeToTraced
									.get(o);
							activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value lastValue = traced
									.getRemainingOffersCountSequence()
									.get(traced.getRemainingOffersCountSequence().size() - 1);
							newState.getForkedToken_remainingOffersCount_Values().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createForkedToken_remainingOffersCount_Value();

							int value = o_cast.getRemainingOffersCount();

							newValue.setRemainingOffersCount((int) value);

							traced.getRemainingOffersCountSequence().add(newValue);
							newState.getForkedToken_remainingOffersCount_Values().add(newValue);
						}
					}

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) o;

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getToken_Holder().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedToken traced = (activitydiagramTrace.States.activitydiagram.TracedToken) exeToTraced
									.get(o);
							activitydiagramTrace.States.Token_holder_Value lastValue = traced.getHolderSequence()
									.get(traced.getHolderSequence().size() - 1);
							newState.getToken_holder_Values().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.Token_holder_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createToken_holder_Value();

							activitydiagramTrace.States.activitydiagram.TracedActivityNode value = null;
							if (o_cast.getHolder() != null) {
								value = ((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
										.get(o_cast.getHolder()));
							}

							newValue.setHolder((activitydiagramTrace.States.activitydiagram.TracedActivityNode) value);

							traced.getHolderSequence().add(newValue);
							newState.getToken_holder_Values().add(newValue);
						}
					}

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) o;

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getVariable_CurrentValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedVariable traced = (activitydiagramTrace.States.activitydiagram.TracedVariable) exeToTraced
									.get(o);
							activitydiagramTrace.States.Variable_currentValue_Value lastValue = traced
									.getCurrentValueSequence().get(traced.getCurrentValueSequence().size() - 1);
							newState.getVariable_currentValue_Values().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.Variable_currentValue_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createVariable_currentValue_Value();

							activitydiagramTrace.States.activitydiagram.TracedValue value = null;
							if (o_cast.getCurrentValue() != null) {
								value = ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced
										.get(o_cast.getCurrentValue()));
							}

							newValue.setCurrentValue((activitydiagramTrace.States.activitydiagram.TracedValue) value);

							traced.getCurrentValueSequence().add(newValue);
							newState.getVariable_currentValue_Values().add(newValue);
						}
					}

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) o;

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
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

							boolean value = o_cast.isValue();

							newValue.setValue((boolean) value);

							traced.getValueSequence().add(newValue);
							newState.getBooleanValue_value_Values().add(newValue);
						}
					}

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) o;

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
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

							int value = o_cast.getValue();

							newValue.setValue((int) value);

							traced.getValueSequence().add(newValue);
							newState.getIntegerValue_value_Values().add(newValue);
						}
					}

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) o;

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivity_Trace().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedActivity traced = (activitydiagramTrace.States.activitydiagram.TracedActivity) exeToTraced
									.get(o);
							activitydiagramTrace.States.Activity_trace_Value lastValue = traced.getTraceSequence()
									.get(traced.getTraceSequence().size() - 1);
							newState.getActivity_trace_Values().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.Activity_trace_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createActivity_trace_Value();

							activitydiagramTrace.States.activitydiagram.TracedTrace value = null;
							if (o_cast.getTrace() != null) {
								value = ((activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced
										.get(o_cast.getTrace()));
							}

							newValue.setTrace((activitydiagramTrace.States.activitydiagram.TracedTrace) value);

							traced.getTraceSequence().add(newValue);
							newState.getActivity_trace_Values().add(newValue);
						}
					}

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) o;

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getInputValue_Value().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedInputValue traced = (activitydiagramTrace.States.activitydiagram.TracedInputValue) exeToTraced
									.get(o);
							activitydiagramTrace.States.InputValue_value_Value lastValue = traced.getValueSequence()
									.get(traced.getValueSequence().size() - 1);
							newState.getInputValue_value_Values().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.InputValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createInputValue_value_Value();

							activitydiagramTrace.States.activitydiagram.TracedValue value = null;
							if (o_cast.getValue() != null) {
								value = ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced
										.get(o_cast.getValue()));
							}

							newValue.setValue((activitydiagramTrace.States.activitydiagram.TracedValue) value);

							traced.getValueSequence().add(newValue);
							newState.getInputValue_value_Values().add(newValue);
						} else

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getInputValue_Variable().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedInputValue traced = (activitydiagramTrace.States.activitydiagram.TracedInputValue) exeToTraced
									.get(o);
							activitydiagramTrace.States.InputValue_variable_Value lastValue = traced
									.getVariableSequence().get(traced.getVariableSequence().size() - 1);
							newState.getInputValue_variable_Values().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.InputValue_variable_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createInputValue_variable_Value();

							activitydiagramTrace.States.activitydiagram.TracedVariable value = null;
							if (o_cast.getVariable() != null) {
								value = ((activitydiagramTrace.States.activitydiagram.TracedVariable) exeToTraced
										.get(o_cast.getVariable()));
							}

							newValue.setVariable((activitydiagramTrace.States.activitydiagram.TracedVariable) value);

							traced.getVariableSequence().add(newValue);
							newState.getInputValue_variable_Values().add(newValue);
						}
					}
				}
				// Here we look at collection mutable fields
				// We must first manually find out if the collection changed...
				// If it changed we must rollback the last values from the copied state, and add new values as well
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) {
					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o;
						activitydiagramTrace.States.activitydiagram.TracedActivityNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityNode_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(
										(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) aValue,
										newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token> it = o_cast
											.getHeldTokens().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token aCurrentValue = it
												.next();
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
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) o;
						activitydiagramTrace.States.activitydiagram.TracedTrace tracedObject = (activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getTrace_ExecutedNodes().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.Trace_executedNodes_Value> valueSequence = tracedObject
									.getExecutedNodesSequence();
							activitydiagramTrace.States.Trace_executedNodes_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode aValue : o_cast
									.getExecutedNodes()) {
								addNewObjectToState(
										(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) aValue,
										newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getExecutedNodes().size() == o_cast.getExecutedNodes().size()) {
									java.util.Iterator<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode> it = o_cast
											.getExecutedNodes().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedActivityNode aPreviousValue : previousValue
											.getExecutedNodes()) {
										org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode aCurrentValue = it
												.next();
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
										.getExecutedNodesSequence()
										.get(tracedObject.getExecutedNodesSequence().size() - 1);
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
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input) o;
						activitydiagramTrace.States.activitydiagram.TracedInput tracedObject = (activitydiagramTrace.States.activitydiagram.TracedInput) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getInput_InputValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.Input_inputValues_Value> valueSequence = tracedObject
									.getInputValuesSequence();
							activitydiagramTrace.States.Input_inputValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue aValue : o_cast
									.getInputValues()) {
								addNewObjectToState(
										(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) aValue,
										newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getInputValues().size() == o_cast.getInputValues().size()) {
									java.util.Iterator<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue> it = o_cast
											.getInputValues().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedInputValue aPreviousValue : previousValue
											.getInputValues()) {
										org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue aCurrentValue = it
												.next();
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
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) o;
						activitydiagramTrace.States.activitydiagram.TracedActivityEdge tracedObject = (activitydiagramTrace.States.activitydiagram.TracedActivityEdge) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityEdge_Offers().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.ActivityEdge_offers_Value> valueSequence = tracedObject
									.getOffersSequence();
							activitydiagramTrace.States.ActivityEdge_offers_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer aValue : o_cast
									.getOffers()) {
								addNewObjectToState(
										(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) aValue,
										newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOffers().size() == o_cast.getOffers().size()) {
									java.util.Iterator<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer> it = o_cast
											.getOffers().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedOffer aPreviousValue : previousValue
											.getOffers()) {
										org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer aCurrentValue = it
												.next();
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
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) o;
						activitydiagramTrace.States.activitydiagram.TracedOffer tracedObject = (activitydiagramTrace.States.activitydiagram.TracedOffer) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getOffer_OfferedTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.Offer_offeredTokens_Value> valueSequence = tracedObject
									.getOfferedTokensSequence();
							activitydiagramTrace.States.Offer_offeredTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token aValue : o_cast
									.getOfferedTokens()) {
								addNewObjectToState(
										(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) aValue,
										newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOfferedTokens().size() == o_cast.getOfferedTokens().size()) {
									java.util.Iterator<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token> it = o_cast
											.getOfferedTokens().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue
											.getOfferedTokens()) {
										org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token aCurrentValue = it
												.next();
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
										.getOfferedTokensSequence()
										.get(tracedObject.getOfferedTokensSequence().size() - 1);
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
					}
				}
			}
			if (stateChanged) {
				final activitydiagramTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final activitydiagramTrace.States.State startingState = lastState;
					final activitydiagramTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			} else if (copiedState) {
				newState.getVariable_currentValue_Values().clear();
				newState.getActivityNode_heldTokens_Values().clear();
				newState.getActivityEdge_offers_Values().clear();
				newState.getActivity_trace_Values().clear();
				newState.getBooleanValue_value_Values().clear();
				newState.getForkedToken_baseToken_Values().clear();
				newState.getForkedToken_remainingOffersCount_Values().clear();
				newState.getInput_inputValues_Values().clear();
				newState.getInputValue_value_Values().clear();
				newState.getInputValue_variable_Values().clear();
				newState.getIntegerValue_value_Values().clear();
				newState.getOffer_offeredTokens_Values().clear();
				newState.getToken_holder_Values().clear();
				newState.getTrace_executedNodes_Values().clear();
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		activitydiagramTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof activitydiagramTrace.Steps.SpecificStep) {
			step_cast = (activitydiagramTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			activitydiagramTrace.States.State state = traceRoot.getStatesTrace()
					.get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<activitydiagramTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps()
						.add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_Activity_Execute activitydiagram_Activity_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) step_cast;
				traceRoot.getActivitydiagram_Activity_Execute_Sequence().add(activitydiagram_Activity_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Reset) {
				activitydiagramTrace.Steps.Activitydiagram_Activity_Reset activitydiagram_Activity_ResetInstance = (activitydiagramTrace.Steps.Activitydiagram_Activity_Reset) step_cast;
				traceRoot.getActivitydiagram_Activity_Reset_Sequence().add(activitydiagram_Activity_ResetInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1 activitydiagram_ActivityNode_AddTokens1Instance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_AddTokens1_Sequence()
						.add(activitydiagram_ActivityNode_AddTokens1Instance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute activitydiagram_ActivityNode_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_Execute_Sequence()
						.add(activitydiagram_ActivityNode_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1 activitydiagram_ActivityNode_RemoveToken1Instance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_RemoveToken1_Sequence()
						.add(activitydiagram_ActivityNode_RemoveToken1Instance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1 activitydiagram_ActivityNode_SendOffers1Instance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_SendOffers1_Sequence()
						.add(activitydiagram_ActivityNode_SendOffers1Instance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1 activitydiagram_ActivityNode_TakeOfferdTokens1Instance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence()
						.add(activitydiagram_ActivityNode_TakeOfferdTokens1Instance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate activitydiagram_ActivityNode_TerminateInstance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_Terminate_Sequence()
						.add(activitydiagram_ActivityNode_TerminateInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute activitydiagram_BooleanVariable_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Execute) step_cast;
				traceRoot.getActivitydiagram_BooleanVariable_Execute_Sequence()
						.add(activitydiagram_BooleanVariable_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init) {
				activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init activitydiagram_BooleanVariable_InitInstance = (activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init) step_cast;
				traceRoot.getActivitydiagram_BooleanVariable_Init_Sequence()
						.add(activitydiagram_BooleanVariable_InitInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1) {
				activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1 activitydiagram_DecisionNode_SendOffers1Instance = (activitydiagramTrace.Steps.Activitydiagram_DecisionNode_SendOffers1) step_cast;
				traceRoot.getActivitydiagram_DecisionNode_SendOffers1_Sequence()
						.add(activitydiagram_DecisionNode_SendOffers1Instance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute activitydiagram_IntegerVariable_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Execute) step_cast;
				traceRoot.getActivitydiagram_IntegerVariable_Execute_Sequence()
						.add(activitydiagram_IntegerVariable_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init) {
				activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init activitydiagram_IntegerVariable_InitInstance = (activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init) step_cast;
				traceRoot.getActivitydiagram_IntegerVariable_Init_Sequence()
						.add(activitydiagram_IntegerVariable_InitInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_Variable_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_Variable_Execute activitydiagram_Variable_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_Variable_Execute) step_cast;
				traceRoot.getActivitydiagram_Variable_Execute_Sequence().add(activitydiagram_Variable_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_Variable_Init) {
				activitydiagramTrace.Steps.Activitydiagram_Variable_Init activitydiagram_Variable_InitInstance = (activitydiagramTrace.Steps.Activitydiagram_Variable_Init) step_cast;
				traceRoot.getActivitydiagram_Variable_Init_Sequence().add(activitydiagram_Variable_InitInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(activitydiagramTrace.Steps.SpecificStep currentStep,
			activitydiagramTrace.States.State startingState, activitydiagramTrace.States.State endingState) {

		activitydiagramTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1) {
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
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<activitydiagramTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
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
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<activitydiagramTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
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
