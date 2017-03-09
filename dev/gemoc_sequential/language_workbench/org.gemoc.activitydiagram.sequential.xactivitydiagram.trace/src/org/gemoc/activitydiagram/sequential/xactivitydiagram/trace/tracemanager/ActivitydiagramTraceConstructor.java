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

import fr.inria.diverse.trace.commons.model.launchconfiguration.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.TracedObject;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class ActivitydiagramTraceConstructor implements ITraceConstructor {
	private activitydiagramTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, TracedObject<?>> exeToTraced;

	private activitydiagramTrace.States.SpecificState lastState;

	private Resource traceResource;
	private final Deque<activitydiagramTrace.Steps.SpecificStep> context = new LinkedList<activitydiagramTrace.Steps.SpecificStep>();

	public ActivitydiagramTraceConstructor(Resource exeModel, Resource traceResource,
			Map<EObject, TracedObject<?>> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = activitydiagramTrace.States.StatesFactory.eINSTANCE.createSpecificState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement) o;
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

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStates().add(lastState);
		}
	}

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action o_cast,
			activitydiagramTrace.States.SpecificState newState) {
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
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedActivity tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedActivity();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field trace
			tracedObject.setActivity_trace_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivity_trace_Dimension());
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

			tracedObject.getActivity_trace_Dimension().getValues().add(firstValue_trace);
			newState.getValues().add(firstValue_trace);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge o_cast,
			activitydiagramTrace.States.SpecificState newState) {
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
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedActivityFinalNode();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
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

			tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode) {
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
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
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

			tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedControlFlow tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedControlFlow();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field offers
			tracedObject.setActivityEdge_offers_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityEdge_offers_Dimension());
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

			tracedObject.getActivityEdge_offers_Dimension().getValues().add(firstValue_offers);
			newState.getValues().add(firstValue_offers);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedControlToken tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedControlToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedDecisionNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedDecisionNode();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
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

			tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedDynamicBooleanValue();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field value
			tracedObject.setDynamicBooleanValue_value_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createDynamicBooleanValue_value_Dimension());
			// Creation of the first value of the field value
			activitydiagramTrace.States.DynamicBooleanValue_value_Value firstValue_value = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createDynamicBooleanValue_value_Value();

			firstValue_value.setValue((boolean) o_cast.isValue());
			tracedObject.getDynamicBooleanValue_value_Dimension().getValues().add(firstValue_value);
			newState.getValues().add(firstValue_value);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedDynamicIntegerValue();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field value
			tracedObject.setDynamicIntegerValue_value_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createDynamicIntegerValue_value_Dimension());
			// Creation of the first value of the field value
			activitydiagramTrace.States.DynamicIntegerValue_value_Value firstValue_value = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createDynamicIntegerValue_value_Value();

			firstValue_value.setValue((int) o_cast.getValue());
			tracedObject.getDynamicIntegerValue_value_Dimension().getValues().add(firstValue_value);
			newState.getValues().add(firstValue_value);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode o_cast,
			activitydiagramTrace.States.SpecificState newState) {
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
			activitydiagramTrace.States.SpecificState newState) {
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
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedForkNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedForkNode();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
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

			tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedForkedToken tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedForkedToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field baseToken
			tracedObject.setForkedToken_baseToken_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createForkedToken_baseToken_Dimension());
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

			tracedObject.getForkedToken_baseToken_Dimension().getValues().add(firstValue_baseToken);
			newState.getValues().add(firstValue_baseToken);

			// Creation of the dimension corresponding to the field remainingOffersCount
			tracedObject
					.setForkedToken_remainingOffersCount_Dimension(activitydiagramTrace.States.StatesFactory.eINSTANCE
							.createForkedToken_remainingOffersCount_Dimension());
			// Creation of the first value of the field remainingOffersCount
			activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value firstValue_remainingOffersCount = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createForkedToken_remainingOffersCount_Value();

			firstValue_remainingOffersCount.setRemainingOffersCount((int) o_cast.getRemainingOffersCount());
			tracedObject.getForkedToken_remainingOffersCount_Dimension().getValues()
					.add(firstValue_remainingOffersCount);
			newState.getValues().add(firstValue_remainingOffersCount);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedInitialNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInitialNode();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
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

			tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedInput tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInput();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field inputValues
			tracedObject.setInput_inputValues_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createInput_inputValues_Dimension());
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

			tracedObject.getInput_inputValues_Dimension().getValues().add(firstValue_inputValues);
			newState.getValues().add(firstValue_inputValues);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedInputValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInputValue();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedJoinNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedJoinNode();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
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

			tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedMergeNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedMergeNode();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
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

			tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedOffer tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedOffer();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field offeredTokens
			tracedObject.setOffer_offeredTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createOffer_offeredTokens_Dimension());
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

			tracedObject.getOffer_offeredTokens_Dimension().getValues().add(firstValue_offeredTokens);
			newState.getValues().add(firstValue_offeredTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedOpaqueAction tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedOpaqueAction();
			tracedObject.setOriginalObject_ActivityNode(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
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

			tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.StaticBooleanValue o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedStaticBooleanValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedStaticBooleanValue();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.StaticBooleanValue) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.StaticIntegerValue o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedStaticIntegerValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedStaticIntegerValue();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.StaticIntegerValue) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) o_cast,
					newState);
		}

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedToken tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedToken();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedTrace tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedTrace();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field executedNodes
			tracedObject.setTrace_executedNodes_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createTrace_executedNodes_Dimension());
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

			tracedObject.getTrace_executedNodes_Dimension().getValues().add(firstValue_executedNodes);
			newState.getValues().add(firstValue_executedNodes);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.StaticIntegerValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.StaticIntegerValue) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.StaticBooleanValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.StaticBooleanValue) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private activitydiagramTrace.States.SpecificState copyState(activitydiagramTrace.States.SpecificState oldState) {
		activitydiagramTrace.States.SpecificState newState = activitydiagramTrace.States.StatesFactory.eINSTANCE
				.createSpecificState();
		newState.getValues().addAll(oldState.getValues());
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
			activitydiagramTrace.States.SpecificState newState = copyState(lastState);
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
				}
				// We only look at constructable objects that have mutable fields
				// Here we must rollback to remove the values of the removed object from the copied state
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.RemovedObjectModelChange) {
					stateChanged = true;
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) o;
						activitydiagramTrace.States.activitydiagram.TracedForkedToken traced = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) exeToTraced
								.get(o_cast);
						newState.getValues().remove(traced.getForkedToken_baseToken_Dimension().getValues()
								.get(traced.getForkedToken_baseToken_Dimension().getValues().size() - 1));
						newState.getValues().remove(traced.getForkedToken_remainingOffersCount_Dimension().getValues()
								.get(traced.getForkedToken_remainingOffersCount_Dimension().getValues().size() - 1));
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) o;
						activitydiagramTrace.States.activitydiagram.TracedOffer traced = (activitydiagramTrace.States.activitydiagram.TracedOffer) exeToTraced
								.get(o_cast);
						newState.getValues().remove(traced.getOffer_offeredTokens_Dimension().getValues()
								.get(traced.getOffer_offeredTokens_Dimension().getValues().size() - 1));
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) o;
						activitydiagramTrace.States.activitydiagram.TracedTrace traced = (activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced
								.get(o_cast);
						newState.getValues().remove(traced.getTrace_executedNodes_Dimension().getValues()
								.get(traced.getTrace_executedNodes_Dimension().getValues().size() - 1));
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input) o;
						activitydiagramTrace.States.activitydiagram.TracedInput traced = (activitydiagramTrace.States.activitydiagram.TracedInput) exeToTraced
								.get(o_cast);
						newState.getValues().remove(traced.getInput_inputValues_Dimension().getValues()
								.get(traced.getInput_inputValues_Dimension().getValues().size() - 1));
					}
				}
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue) o;

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getDynamicBooleanValue_Value().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue traced = (activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue) exeToTraced
									.get(o);
							activitydiagramTrace.States.DynamicBooleanValue_value_Value lastValue = traced
									.getDynamicBooleanValue_value_Dimension().getValues()
									.get(traced.getDynamicBooleanValue_value_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.DynamicBooleanValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createDynamicBooleanValue_value_Value();

							boolean value = o_cast.isValue();

							newValue.setValue((boolean) value);

							traced.getDynamicBooleanValue_value_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						}
					}

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) o;

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getForkedToken_BaseToken().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedForkedToken traced = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) exeToTraced
									.get(o);
							activitydiagramTrace.States.ForkedToken_baseToken_Value lastValue = traced
									.getForkedToken_baseToken_Dimension().getValues()
									.get(traced.getForkedToken_baseToken_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.ForkedToken_baseToken_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createForkedToken_baseToken_Value();

							activitydiagramTrace.States.activitydiagram.TracedToken value = null;
							if (o_cast.getBaseToken() != null) {
								addNewObjectToState(o_cast.getBaseToken(), newState);
								value = ((activitydiagramTrace.States.activitydiagram.TracedToken) exeToTraced
										.get(o_cast.getBaseToken()));
							}

							newValue.setBaseToken((activitydiagramTrace.States.activitydiagram.TracedToken) value);

							traced.getForkedToken_baseToken_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						} else

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getForkedToken_RemainingOffersCount().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedForkedToken traced = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) exeToTraced
									.get(o);
							activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value lastValue = traced
									.getForkedToken_remainingOffersCount_Dimension().getValues()
									.get(traced.getForkedToken_remainingOffersCount_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createForkedToken_remainingOffersCount_Value();

							int value = o_cast.getRemainingOffersCount();

							newValue.setRemainingOffersCount((int) value);

							traced.getForkedToken_remainingOffersCount_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						}
					}

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue) o;

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getDynamicIntegerValue_Value().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue traced = (activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue) exeToTraced
									.get(o);
							activitydiagramTrace.States.DynamicIntegerValue_value_Value lastValue = traced
									.getDynamicIntegerValue_value_Dimension().getValues()
									.get(traced.getDynamicIntegerValue_value_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.DynamicIntegerValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createDynamicIntegerValue_value_Value();

							int value = o_cast.getValue();

							newValue.setValue((int) value);

							traced.getDynamicIntegerValue_value_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						}
					}

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) o;

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivity_Trace().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedActivity traced = (activitydiagramTrace.States.activitydiagram.TracedActivity) exeToTraced
									.get(o);
							activitydiagramTrace.States.Activity_trace_Value lastValue = traced
									.getActivity_trace_Dimension().getValues()
									.get(traced.getActivity_trace_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.Activity_trace_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createActivity_trace_Value();

							activitydiagramTrace.States.activitydiagram.TracedTrace value = null;
							if (o_cast.getTrace() != null) {
								addNewObjectToState(o_cast.getTrace(), newState);
								value = ((activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced
										.get(o_cast.getTrace()));
							}

							newValue.setTrace((activitydiagramTrace.States.activitydiagram.TracedTrace) value);

							traced.getActivity_trace_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						}
					}
				}
				// Here we look at collection mutable fields
				// We must first manually find out if the collection changed...
				// If it changed we must rollback the last values from the copied state, and add new values as well
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) {
					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) o;
						activitydiagramTrace.States.activitydiagram.TracedOffer tracedObject = (activitydiagramTrace.States.activitydiagram.TracedOffer) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getOffer_OfferedTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.Offer_offeredTokens_Value> valueSequence = tracedObject
									.getOffer_offeredTokens_Dimension().getValues();
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
										.getOffer_offeredTokens_Dimension().getValues()
										.get(tracedObject.getOffer_offeredTokens_Dimension().getValues().size() - 1);
								newState.getValues().remove(lastValue);
								// And we create a proper new value
								activitydiagramTrace.States.Offer_offeredTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createOffer_offeredTokens_Value();
								newValue.getOfferedTokens()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
												o_cast.getOfferedTokens(), newState));
								tracedObject.getOffer_offeredTokens_Dimension().getValues().add(newValue);
								newState.getValues().add(newValue);
							}
						}
					}
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o;
						activitydiagramTrace.States.activitydiagram.TracedActivityNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityNode_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence = tracedObject
									.getActivityNode_heldTokens_Dimension().getValues();
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
										.getActivityNode_heldTokens_Dimension().getValues()
										.get(tracedObject.getActivityNode_heldTokens_Dimension().getValues().size()
												- 1);
								newState.getValues().remove(lastValue);
								// And we create a proper new value
								activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createActivityNode_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(newValue);
								newState.getValues().add(newValue);
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
									.getInput_inputValues_Dimension().getValues();
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
										.getInput_inputValues_Dimension().getValues()
										.get(tracedObject.getInput_inputValues_Dimension().getValues().size() - 1);
								newState.getValues().remove(lastValue);
								// And we create a proper new value
								activitydiagramTrace.States.Input_inputValues_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createInput_inputValues_Value();
								newValue.getInputValues()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedInputValue>) getExeToTraced(
												o_cast.getInputValues(), newState));
								tracedObject.getInput_inputValues_Dimension().getValues().add(newValue);
								newState.getValues().add(newValue);
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
									.getActivityEdge_offers_Dimension().getValues();
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
										.getActivityEdge_offers_Dimension().getValues()
										.get(tracedObject.getActivityEdge_offers_Dimension().getValues().size() - 1);
								newState.getValues().remove(lastValue);
								// And we create a proper new value
								activitydiagramTrace.States.ActivityEdge_offers_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createActivityEdge_offers_Value();
								newValue.getOffers()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedOffer>) getExeToTraced(
												o_cast.getOffers(), newState));
								tracedObject.getActivityEdge_offers_Dimension().getValues().add(newValue);
								newState.getValues().add(newValue);
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
									.getTrace_executedNodes_Dimension().getValues();
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
										.getTrace_executedNodes_Dimension().getValues()
										.get(tracedObject.getTrace_executedNodes_Dimension().getValues().size() - 1);
								newState.getValues().remove(lastValue);
								// And we create a proper new value
								activitydiagramTrace.States.Trace_executedNodes_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createTrace_executedNodes_Value();
								newValue.getExecutedNodes()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityNode>) getExeToTraced(
												o_cast.getExecutedNodes(), newState));
								tracedObject.getTrace_executedNodes_Dimension().getValues().add(newValue);
								newState.getValues().add(newValue);
							}
						}
					}
				}
			}
			if (stateChanged) {
				final activitydiagramTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final activitydiagramTrace.States.SpecificState startingState = lastState;
					final activitydiagramTrace.States.SpecificState endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStates().add(lastState);
			} else if (copiedState) {
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
				newState.getValues().clear();
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step<?> step) {
		activitydiagramTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof activitydiagramTrace.Steps.SpecificStep) {
			step_cast = (activitydiagramTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			activitydiagramTrace.States.SpecificState state = traceRoot.getStates()
					.get(traceRoot.getStates().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<activitydiagramTrace.Steps.SpecificStep, activitydiagramTrace.States.SpecificState>) context
						.getFirst()).getSubSteps().add(step_cast);
			} else {
				((SequentialStep<activitydiagramTrace.Steps.SpecificStep, activitydiagramTrace.States.SpecificState>) traceRoot
						.getRootStep()).getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_Activity_Execute activitydiagram_Activity_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) step_cast;
				traceRoot.getActivitydiagram_Activity_Execute_Sequence().add(activitydiagram_Activity_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Reset) {
				activitydiagramTrace.Steps.Activitydiagram_Activity_Reset activitydiagram_Activity_ResetInstance = (activitydiagramTrace.Steps.Activitydiagram_Activity_Reset) step_cast;
				traceRoot.getActivitydiagram_Activity_Reset_Sequence().add(activitydiagram_Activity_ResetInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddToken) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddToken activitydiagram_ActivityNode_AddTokenInstance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddToken) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_AddToken_Sequence()
						.add(activitydiagram_ActivityNode_AddTokenInstance);
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
			activitydiagramTrace.States.SpecificState startingState,
			activitydiagramTrace.States.SpecificState endingState) {

		activitydiagramTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ActivityNode_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_Activity_Execute_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<activitydiagramTrace.Steps.SpecificStep, activitydiagramTrace.States.SpecificState>) currentStep)
					.getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step<?> step) {
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
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<activitydiagramTrace.Steps.SpecificStep, activitydiagramTrace.States.SpecificState> rootStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
				.createSpecificRootStep();
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
		allResources.removeIf(r -> r == null);
		return allResources;
	}

	private Collection<? extends EObject> getExeToTraced(Collection<? extends EObject> exeObjects,
			activitydiagramTrace.States.SpecificState newState) {
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
