package org.modelexecution.operationalsemantics.gemoc.sequential.trace.tracemanager;

import fr.inria.diverse.trace.api.ITraceManager;
import fr.inria.diverse.trace.api.IValueTrace;
import fr.inria.diverse.trace.api.impl.GenericValueTrace;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.TreeIterator;

public class ActivitydiagramTraceManager implements ITraceManager {

	private activitydiagramTrace.Trace traceRoot;
	private activitydiagramTrace.Traced.TracedObjects tracedObjects;
	private activitydiagramTrace.Steps.Steps events;
	private Resource executedModel;

	private Map<EObject, EObject> exeToTraced;

	private activitydiagramTrace.State lastState;
	private activitydiagramTrace.State currentState;
	private List<IValueTrace> traces;

	private Resource traceResource;
	private Deque<activitydiagramTrace.Steps.BigStep> context = new ArrayDeque<activitydiagramTrace.Steps.BigStep>();
	private static final List<String> macroEvents = Arrays.asList(
			"Activitydiagram_Activity_Execute",
			"Activitydiagram_ActivityNode_AddTokens1",
			"Activitydiagram_Activity_WriteTrace",
			"Activitydiagram_ActivityNode_Execute",
			"Activitydiagram_ActivityNode_TakeOfferdTokens1");

	public ActivitydiagramTraceManager(Resource exeModel, Resource traceResource) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.traces = new ArrayList<IValueTrace>();
	}

	private Collection<? extends EObject> getExeToTraced(
			Collection<? extends EObject> exeObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject exeObject : exeObjects) {
			storeAsTracedObject(exeObject);
			result.add(exeToTraced.get(exeObject));
		}
		return result;
	}

	private Collection<? extends EObject> getTracedToExe(
			Collection<? extends EObject> tracedObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject tracedObject : tracedObjects) {
			result.add(getTracedToExe(tracedObject));
		}
		return result;
	}

	private EObject getTracedToExe(EObject tracedObject) {
		for (EObject key : exeToTraced.keySet()) {
			if (exeToTraced.get(key) == tracedObject)
				return key;
		}
		return null;
	}

	private void storeAsTracedObject(activitydiagram.IntegerValue o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerValue();
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedIntegerValues().add(
					tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueTrace(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.Input o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedInput tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInput();
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedInputs().add(tracedObject);

			traces.add(new GenericValueTrace(
					tracedObject.getInputValuesTrace(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.BooleanValue o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedBooleanValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanValue();
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedBooleanValues().add(
					tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueTrace(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.Trace o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedTrace tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedTrace();
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedTraces().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject
					.getExecutedNodesTrace(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.ControlToken o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedControlToken tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedControlToken();
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedControlTokens().add(
					tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHolderTrace(),
					this));
		}
	}

	private void storeAsTracedObject(activitydiagram.DecisionNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedDecisionNode();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedDecisionNodes().add(
					tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensTrace(),
					this));
		}
	}

	private void storeAsTracedObject(activitydiagram.JoinNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedJoinNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedJoinNode();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedJoinNodes()
					.add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensTrace(),
					this));
		}
	}

	private void storeAsTracedObject(activitydiagram.BooleanVariable o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanVariable();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedBooleanVariables().add(
					tracedObject);

			traces.add(new GenericValueTrace(tracedObject
					.getCurrentValueTrace(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.ActivityFinalNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedActivityFinalNode();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedActivityFinalNodes().add(
					tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensTrace(),
					this));
		}
	}

	private void storeAsTracedObject(activitydiagram.InputValue o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedInputValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInputValue();
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedInputValues().add(
					tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueTrace(), this));
			traces.add(new GenericValueTrace(tracedObject.getVariableTrace(),
					this));
		}
	}

	private void storeAsTracedObject(activitydiagram.ControlFlow o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedControlFlow tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedControlFlow();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedControlFlows().add(
					tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getOffersTrace(),
					this));
		}
	}

	private void storeAsTracedObject(activitydiagram.ForkNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedForkNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedForkNode();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedForkNodes()
					.add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensTrace(),
					this));
		}
	}

	private void storeAsTracedObject(activitydiagram.ForkedToken o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedForkedToken tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedForkedToken();
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedForkedTokens().add(
					tracedObject);

			traces.add(new GenericValueTrace(tracedObject
					.getRemainingOffersCountTrace(), this));
			traces.add(new GenericValueTrace(tracedObject.getHolderTrace(),
					this));
			traces.add(new GenericValueTrace(tracedObject.getBaseTokenTrace(),
					this));
		}
	}

	private void storeAsTracedObject(activitydiagram.IntegerVariable o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerVariable();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedIntegerVariables().add(
					tracedObject);

			traces.add(new GenericValueTrace(tracedObject
					.getCurrentValueTrace(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.Activity o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedActivity tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedActivity();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedActivitys()
					.add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getTraceTrace(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.OpaqueAction o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedOpaqueAction();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedOpaqueActions().add(
					tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensTrace(),
					this));
		}
	}

	private void storeAsTracedObject(activitydiagram.InitialNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedInitialNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInitialNode();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedInitialNodes().add(
					tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensTrace(),
					this));
		}
	}

	private void storeAsTracedObject(activitydiagram.MergeNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedMergeNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedMergeNode();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedMergeNodes().add(
					tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensTrace(),
					this));
		}
	}

	private void storeAsTracedObject(activitydiagram.Offer o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.Traced.activitydiagram.TracedOffer tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.Traced.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedOffer();
			exeToTraced.put(o, tracedObject);
			tracedObjects.getActivitydiagram_tracedOffers().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject
					.getOfferedTokensTrace(), this));
		}
	}

	private void storeAsTracedObject(EObject o) {

		if (o instanceof activitydiagram.Offer)
			storeAsTracedObject((activitydiagram.Offer) o);
		else

		if (o instanceof activitydiagram.MergeNode)
			storeAsTracedObject((activitydiagram.MergeNode) o);
		else

		if (o instanceof activitydiagram.InitialNode)
			storeAsTracedObject((activitydiagram.InitialNode) o);
		else

		if (o instanceof activitydiagram.OpaqueAction)
			storeAsTracedObject((activitydiagram.OpaqueAction) o);
		else

		if (o instanceof activitydiagram.Activity)
			storeAsTracedObject((activitydiagram.Activity) o);
		else

		if (o instanceof activitydiagram.IntegerVariable)
			storeAsTracedObject((activitydiagram.IntegerVariable) o);
		else

		if (o instanceof activitydiagram.ForkedToken)
			storeAsTracedObject((activitydiagram.ForkedToken) o);
		else

		if (o instanceof activitydiagram.ForkNode)
			storeAsTracedObject((activitydiagram.ForkNode) o);
		else

		if (o instanceof activitydiagram.ControlFlow)
			storeAsTracedObject((activitydiagram.ControlFlow) o);
		else

		if (o instanceof activitydiagram.InputValue)
			storeAsTracedObject((activitydiagram.InputValue) o);
		else

		if (o instanceof activitydiagram.ActivityFinalNode)
			storeAsTracedObject((activitydiagram.ActivityFinalNode) o);
		else

		if (o instanceof activitydiagram.BooleanVariable)
			storeAsTracedObject((activitydiagram.BooleanVariable) o);
		else

		if (o instanceof activitydiagram.JoinNode)
			storeAsTracedObject((activitydiagram.JoinNode) o);
		else

		if (o instanceof activitydiagram.DecisionNode)
			storeAsTracedObject((activitydiagram.DecisionNode) o);
		else

		if (o instanceof activitydiagram.ControlToken)
			storeAsTracedObject((activitydiagram.ControlToken) o);
		else

		if (o instanceof activitydiagram.Trace)
			storeAsTracedObject((activitydiagram.Trace) o);
		else

		if (o instanceof activitydiagram.BooleanValue)
			storeAsTracedObject((activitydiagram.BooleanValue) o);
		else

		if (o instanceof activitydiagram.Input)
			storeAsTracedObject((activitydiagram.Input) o);
		else

		if (o instanceof activitydiagram.IntegerValue)
			storeAsTracedObject((activitydiagram.IntegerValue) o);

	}

	@SuppressWarnings("unchecked")
	private boolean addState(boolean onlyIfChange) {

		activitydiagramTrace.State newState = activitydiagramTrace.ActivitydiagramTraceFactory.eINSTANCE
				.createState();
		boolean changed = false;

		// We look at each object instance of a class with mutable properties 
		// Each of these objects should eventually become a traced object

		for (TreeIterator<EObject> i = executedModel.getAllContents(); i
				.hasNext();) {
			EObject o = i.next();

			/**
			 * Storing the state of a activitydiagram.Offer object
			 */
			if (o instanceof activitydiagram.Offer) {

				activitydiagram.Offer o_cast = (activitydiagram.Offer) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedOffer tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedOffer) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.Offer_offeredTokens_Value> localTrace1 = tracedObject
						.getOfferedTokensTrace();
				activitydiagramTrace.Values.Offer_offeredTokens_Value previousValue1 = null;
				if (!localTrace1.isEmpty())
					previousValue1 = localTrace1.get(localTrace1.size() - 1);

				for (activitydiagram.Token aValue : o_cast.getOfferedTokens()) {
					storeAsTracedObject(aValue);
				}

				boolean noChange1 = true;
				if (previousValue1 != null) {

					if (previousValue1.getOfferedTokens().size() == o_cast
							.getOfferedTokens().size()) {

						java.util.Iterator<activitydiagram.Token> it = o_cast
								.getOfferedTokens().iterator();
						for (activitydiagramTrace.Traced.activitydiagram.TracedToken aPreviousValue : previousValue1
								.getOfferedTokens()) {
							activitydiagram.Token aCurrentValue = it.next();
							if (aPreviousValue != exeToTraced
									.get(aCurrentValue)) {
								noChange1 = false;
								break;
							}
						}

					} else {
						noChange1 = false;
					}
				} else {
					noChange1 = false;
				}

				if (noChange1) {
					newState.getOffer_offeredTokens_Values()
							.add(previousValue1);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.Offer_offeredTokens_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createOffer_offeredTokens_Value();

					newValue.getOfferedTokens()
							.addAll((Collection<? extends activitydiagramTrace.Traced.activitydiagram.TracedToken>) getExeToTraced(o_cast
									.getOfferedTokens()));

					tracedObject.getOfferedTokensTrace().add(newValue);
					newState.getOffer_offeredTokens_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.MergeNode object
			 */
			if (o instanceof activitydiagram.MergeNode) {

				activitydiagram.MergeNode o_cast = (activitydiagram.MergeNode) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedMergeNode tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedMergeNode) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.ActivityNode_heldTokens_Value> localTrace2 = tracedObject
						.getHeldTokensTrace();
				activitydiagramTrace.Values.ActivityNode_heldTokens_Value previousValue2 = null;
				if (!localTrace2.isEmpty())
					previousValue2 = localTrace2.get(localTrace2.size() - 1);

				for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
					storeAsTracedObject(aValue);
				}

				boolean noChange2 = true;
				if (previousValue2 != null) {

					if (previousValue2.getHeldTokens().size() == o_cast
							.getHeldTokens().size()) {

						java.util.Iterator<activitydiagram.Token> it = o_cast
								.getHeldTokens().iterator();
						for (activitydiagramTrace.Traced.activitydiagram.TracedToken aPreviousValue : previousValue2
								.getHeldTokens()) {
							activitydiagram.Token aCurrentValue = it.next();
							if (aPreviousValue != exeToTraced
									.get(aCurrentValue)) {
								noChange2 = false;
								break;
							}
						}

					} else {
						noChange2 = false;
					}
				} else {
					noChange2 = false;
				}

				if (noChange2) {
					newState.getActivityNode_heldTokens_Values().add(
							previousValue2);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createActivityNode_heldTokens_Value();

					newValue.getHeldTokens()
							.addAll((Collection<? extends activitydiagramTrace.Traced.activitydiagram.TracedToken>) getExeToTraced(o_cast
									.getHeldTokens()));

					tracedObject.getHeldTokensTrace().add(newValue);
					newState.getActivityNode_heldTokens_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.InitialNode object
			 */
			if (o instanceof activitydiagram.InitialNode) {

				activitydiagram.InitialNode o_cast = (activitydiagram.InitialNode) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedInitialNode tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedInitialNode) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.ActivityNode_heldTokens_Value> localTrace3 = tracedObject
						.getHeldTokensTrace();
				activitydiagramTrace.Values.ActivityNode_heldTokens_Value previousValue3 = null;
				if (!localTrace3.isEmpty())
					previousValue3 = localTrace3.get(localTrace3.size() - 1);

				for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
					storeAsTracedObject(aValue);
				}

				boolean noChange3 = true;
				if (previousValue3 != null) {

					if (previousValue3.getHeldTokens().size() == o_cast
							.getHeldTokens().size()) {

						java.util.Iterator<activitydiagram.Token> it = o_cast
								.getHeldTokens().iterator();
						for (activitydiagramTrace.Traced.activitydiagram.TracedToken aPreviousValue : previousValue3
								.getHeldTokens()) {
							activitydiagram.Token aCurrentValue = it.next();
							if (aPreviousValue != exeToTraced
									.get(aCurrentValue)) {
								noChange3 = false;
								break;
							}
						}

					} else {
						noChange3 = false;
					}
				} else {
					noChange3 = false;
				}

				if (noChange3) {
					newState.getActivityNode_heldTokens_Values().add(
							previousValue3);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createActivityNode_heldTokens_Value();

					newValue.getHeldTokens()
							.addAll((Collection<? extends activitydiagramTrace.Traced.activitydiagram.TracedToken>) getExeToTraced(o_cast
									.getHeldTokens()));

					tracedObject.getHeldTokensTrace().add(newValue);
					newState.getActivityNode_heldTokens_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.OpaqueAction object
			 */
			if (o instanceof activitydiagram.OpaqueAction) {

				activitydiagram.OpaqueAction o_cast = (activitydiagram.OpaqueAction) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.ActivityNode_heldTokens_Value> localTrace4 = tracedObject
						.getHeldTokensTrace();
				activitydiagramTrace.Values.ActivityNode_heldTokens_Value previousValue4 = null;
				if (!localTrace4.isEmpty())
					previousValue4 = localTrace4.get(localTrace4.size() - 1);

				for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
					storeAsTracedObject(aValue);
				}

				boolean noChange4 = true;
				if (previousValue4 != null) {

					if (previousValue4.getHeldTokens().size() == o_cast
							.getHeldTokens().size()) {

						java.util.Iterator<activitydiagram.Token> it = o_cast
								.getHeldTokens().iterator();
						for (activitydiagramTrace.Traced.activitydiagram.TracedToken aPreviousValue : previousValue4
								.getHeldTokens()) {
							activitydiagram.Token aCurrentValue = it.next();
							if (aPreviousValue != exeToTraced
									.get(aCurrentValue)) {
								noChange4 = false;
								break;
							}
						}

					} else {
						noChange4 = false;
					}
				} else {
					noChange4 = false;
				}

				if (noChange4) {
					newState.getActivityNode_heldTokens_Values().add(
							previousValue4);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createActivityNode_heldTokens_Value();

					newValue.getHeldTokens()
							.addAll((Collection<? extends activitydiagramTrace.Traced.activitydiagram.TracedToken>) getExeToTraced(o_cast
									.getHeldTokens()));

					tracedObject.getHeldTokensTrace().add(newValue);
					newState.getActivityNode_heldTokens_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.Activity object
			 */
			if (o instanceof activitydiagram.Activity) {

				activitydiagram.Activity o_cast = (activitydiagram.Activity) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedActivity tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedActivity) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.Activity_trace_Value> localTrace5 = tracedObject
						.getTraceTrace();
				activitydiagramTrace.Values.Activity_trace_Value previousValue5 = null;
				if (!localTrace5.isEmpty())
					previousValue5 = localTrace5.get(localTrace5.size() - 1);

				storeAsTracedObject(o_cast.getTrace());

				activitydiagramTrace.Traced.activitydiagram.TracedTrace content1 = null;
				if (o_cast.getTrace() != null)
					content1 = ((activitydiagramTrace.Traced.activitydiagram.TracedTrace) exeToTraced
							.get(o_cast.getTrace()));

				boolean noChange5 = previousValue5 != null
						&& previousValue5.getTrace() == content1;

				if (noChange5) {
					newState.getActivity_trace_Values().add(previousValue5);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.Activity_trace_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createActivity_trace_Value();

					newValue.setTrace(content1);

					tracedObject.getTraceTrace().add(newValue);
					newState.getActivity_trace_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.IntegerVariable object
			 */
			if (o instanceof activitydiagram.IntegerVariable) {

				activitydiagram.IntegerVariable o_cast = (activitydiagram.IntegerVariable) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.Variable_currentValue_Value> localTrace6 = tracedObject
						.getCurrentValueTrace();
				activitydiagramTrace.Values.Variable_currentValue_Value previousValue6 = null;
				if (!localTrace6.isEmpty())
					previousValue6 = localTrace6.get(localTrace6.size() - 1);

				storeAsTracedObject(o_cast.getCurrentValue());

				activitydiagramTrace.Traced.activitydiagram.TracedValue content2 = null;
				if (o_cast.getCurrentValue() != null)
					content2 = ((activitydiagramTrace.Traced.activitydiagram.TracedValue) exeToTraced
							.get(o_cast.getCurrentValue()));

				boolean noChange6 = previousValue6 != null
						&& previousValue6.getCurrentValue() == content2;

				if (noChange6) {
					newState.getVariable_currentValue_Values().add(
							previousValue6);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.Variable_currentValue_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createVariable_currentValue_Value();

					newValue.setCurrentValue(content2);

					tracedObject.getCurrentValueTrace().add(newValue);
					newState.getVariable_currentValue_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.ForkedToken object
			 */
			if (o instanceof activitydiagram.ForkedToken) {

				activitydiagram.ForkedToken o_cast = (activitydiagram.ForkedToken) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedForkedToken tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedForkedToken) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value> localTrace7 = tracedObject
						.getRemainingOffersCountTrace();
				activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value previousValue7 = null;
				if (!localTrace7.isEmpty())
					previousValue7 = localTrace7.get(localTrace7.size() - 1);

				int content3 = o_cast.getRemainingOffersCount();

				boolean noChange7 = previousValue7 != null
						&& previousValue7.getRemainingOffersCount() == content3;

				if (noChange7) {
					newState.getForkedToken_remainingOffersCount_Values().add(
							previousValue7);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createForkedToken_remainingOffersCount_Value();

					newValue.setRemainingOffersCount(content3);

					tracedObject.getRemainingOffersCountTrace().add(newValue);
					newState.getForkedToken_remainingOffersCount_Values().add(
							newValue);
				}

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.Token_holder_Value> localTrace8 = tracedObject
						.getHolderTrace();
				activitydiagramTrace.Values.Token_holder_Value previousValue8 = null;
				if (!localTrace8.isEmpty())
					previousValue8 = localTrace8.get(localTrace8.size() - 1);

				storeAsTracedObject(o_cast.getHolder());

				activitydiagramTrace.Traced.activitydiagram.TracedActivityNode content4 = null;
				if (o_cast.getHolder() != null)
					content4 = ((activitydiagramTrace.Traced.activitydiagram.TracedActivityNode) exeToTraced
							.get(o_cast.getHolder()));

				boolean noChange8 = previousValue8 != null
						&& previousValue8.getHolder() == content4;

				if (noChange8) {
					newState.getToken_holder_Values().add(previousValue8);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.Token_holder_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createToken_holder_Value();

					newValue.setHolder(content4);

					tracedObject.getHolderTrace().add(newValue);
					newState.getToken_holder_Values().add(newValue);
				}

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.ForkedToken_baseToken_Value> localTrace9 = tracedObject
						.getBaseTokenTrace();
				activitydiagramTrace.Values.ForkedToken_baseToken_Value previousValue9 = null;
				if (!localTrace9.isEmpty())
					previousValue9 = localTrace9.get(localTrace9.size() - 1);

				storeAsTracedObject(o_cast.getBaseToken());

				activitydiagramTrace.Traced.activitydiagram.TracedToken content5 = null;
				if (o_cast.getBaseToken() != null)
					content5 = ((activitydiagramTrace.Traced.activitydiagram.TracedToken) exeToTraced
							.get(o_cast.getBaseToken()));

				boolean noChange9 = previousValue9 != null
						&& previousValue9.getBaseToken() == content5;

				if (noChange9) {
					newState.getForkedToken_baseToken_Values().add(
							previousValue9);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.ForkedToken_baseToken_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createForkedToken_baseToken_Value();

					newValue.setBaseToken(content5);

					tracedObject.getBaseTokenTrace().add(newValue);
					newState.getForkedToken_baseToken_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.ForkNode object
			 */
			if (o instanceof activitydiagram.ForkNode) {

				activitydiagram.ForkNode o_cast = (activitydiagram.ForkNode) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedForkNode tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedForkNode) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.ActivityNode_heldTokens_Value> localTrace10 = tracedObject
						.getHeldTokensTrace();
				activitydiagramTrace.Values.ActivityNode_heldTokens_Value previousValue10 = null;
				if (!localTrace10.isEmpty())
					previousValue10 = localTrace10.get(localTrace10.size() - 1);

				for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
					storeAsTracedObject(aValue);
				}

				boolean noChange10 = true;
				if (previousValue10 != null) {

					if (previousValue10.getHeldTokens().size() == o_cast
							.getHeldTokens().size()) {

						java.util.Iterator<activitydiagram.Token> it = o_cast
								.getHeldTokens().iterator();
						for (activitydiagramTrace.Traced.activitydiagram.TracedToken aPreviousValue : previousValue10
								.getHeldTokens()) {
							activitydiagram.Token aCurrentValue = it.next();
							if (aPreviousValue != exeToTraced
									.get(aCurrentValue)) {
								noChange10 = false;
								break;
							}
						}

					} else {
						noChange10 = false;
					}
				} else {
					noChange10 = false;
				}

				if (noChange10) {
					newState.getActivityNode_heldTokens_Values().add(
							previousValue10);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createActivityNode_heldTokens_Value();

					newValue.getHeldTokens()
							.addAll((Collection<? extends activitydiagramTrace.Traced.activitydiagram.TracedToken>) getExeToTraced(o_cast
									.getHeldTokens()));

					tracedObject.getHeldTokensTrace().add(newValue);
					newState.getActivityNode_heldTokens_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.ControlFlow object
			 */
			if (o instanceof activitydiagram.ControlFlow) {

				activitydiagram.ControlFlow o_cast = (activitydiagram.ControlFlow) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedControlFlow tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedControlFlow) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.ActivityEdge_offers_Value> localTrace11 = tracedObject
						.getOffersTrace();
				activitydiagramTrace.Values.ActivityEdge_offers_Value previousValue11 = null;
				if (!localTrace11.isEmpty())
					previousValue11 = localTrace11.get(localTrace11.size() - 1);

				for (activitydiagram.Offer aValue : o_cast.getOffers()) {
					storeAsTracedObject(aValue);
				}

				boolean noChange11 = true;
				if (previousValue11 != null) {

					if (previousValue11.getOffers().size() == o_cast
							.getOffers().size()) {

						java.util.Iterator<activitydiagram.Offer> it = o_cast
								.getOffers().iterator();
						for (activitydiagramTrace.Traced.activitydiagram.TracedOffer aPreviousValue : previousValue11
								.getOffers()) {
							activitydiagram.Offer aCurrentValue = it.next();
							if (aPreviousValue != exeToTraced
									.get(aCurrentValue)) {
								noChange11 = false;
								break;
							}
						}

					} else {
						noChange11 = false;
					}
				} else {
					noChange11 = false;
				}

				if (noChange11) {
					newState.getActivityEdge_offers_Values().add(
							previousValue11);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.ActivityEdge_offers_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createActivityEdge_offers_Value();

					newValue.getOffers()
							.addAll((Collection<? extends activitydiagramTrace.Traced.activitydiagram.TracedOffer>) getExeToTraced(o_cast
									.getOffers()));

					tracedObject.getOffersTrace().add(newValue);
					newState.getActivityEdge_offers_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.InputValue object
			 */
			if (o instanceof activitydiagram.InputValue) {

				activitydiagram.InputValue o_cast = (activitydiagram.InputValue) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedInputValue tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedInputValue) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.InputValue_value_Value> localTrace12 = tracedObject
						.getValueTrace();
				activitydiagramTrace.Values.InputValue_value_Value previousValue12 = null;
				if (!localTrace12.isEmpty())
					previousValue12 = localTrace12.get(localTrace12.size() - 1);

				storeAsTracedObject(o_cast.getValue());

				activitydiagramTrace.Traced.activitydiagram.TracedValue content6 = null;
				if (o_cast.getValue() != null)
					content6 = ((activitydiagramTrace.Traced.activitydiagram.TracedValue) exeToTraced
							.get(o_cast.getValue()));

				boolean noChange12 = previousValue12 != null
						&& previousValue12.getValue() == content6;

				if (noChange12) {
					newState.getInputValue_value_Values().add(previousValue12);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.InputValue_value_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createInputValue_value_Value();

					newValue.setValue(content6);

					tracedObject.getValueTrace().add(newValue);
					newState.getInputValue_value_Values().add(newValue);
				}

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.InputValue_variable_Value> localTrace13 = tracedObject
						.getVariableTrace();
				activitydiagramTrace.Values.InputValue_variable_Value previousValue13 = null;
				if (!localTrace13.isEmpty())
					previousValue13 = localTrace13.get(localTrace13.size() - 1);

				storeAsTracedObject(o_cast.getVariable());

				activitydiagramTrace.Traced.activitydiagram.TracedVariable content7 = null;
				if (o_cast.getVariable() != null)
					content7 = ((activitydiagramTrace.Traced.activitydiagram.TracedVariable) exeToTraced
							.get(o_cast.getVariable()));

				boolean noChange13 = previousValue13 != null
						&& previousValue13.getVariable() == content7;

				if (noChange13) {
					newState.getInputValue_variable_Values().add(
							previousValue13);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.InputValue_variable_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createInputValue_variable_Value();

					newValue.setVariable(content7);

					tracedObject.getVariableTrace().add(newValue);
					newState.getInputValue_variable_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.ActivityFinalNode object
			 */
			if (o instanceof activitydiagram.ActivityFinalNode) {

				activitydiagram.ActivityFinalNode o_cast = (activitydiagram.ActivityFinalNode) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.ActivityNode_heldTokens_Value> localTrace14 = tracedObject
						.getHeldTokensTrace();
				activitydiagramTrace.Values.ActivityNode_heldTokens_Value previousValue14 = null;
				if (!localTrace14.isEmpty())
					previousValue14 = localTrace14.get(localTrace14.size() - 1);

				for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
					storeAsTracedObject(aValue);
				}

				boolean noChange14 = true;
				if (previousValue14 != null) {

					if (previousValue14.getHeldTokens().size() == o_cast
							.getHeldTokens().size()) {

						java.util.Iterator<activitydiagram.Token> it = o_cast
								.getHeldTokens().iterator();
						for (activitydiagramTrace.Traced.activitydiagram.TracedToken aPreviousValue : previousValue14
								.getHeldTokens()) {
							activitydiagram.Token aCurrentValue = it.next();
							if (aPreviousValue != exeToTraced
									.get(aCurrentValue)) {
								noChange14 = false;
								break;
							}
						}

					} else {
						noChange14 = false;
					}
				} else {
					noChange14 = false;
				}

				if (noChange14) {
					newState.getActivityNode_heldTokens_Values().add(
							previousValue14);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createActivityNode_heldTokens_Value();

					newValue.getHeldTokens()
							.addAll((Collection<? extends activitydiagramTrace.Traced.activitydiagram.TracedToken>) getExeToTraced(o_cast
									.getHeldTokens()));

					tracedObject.getHeldTokensTrace().add(newValue);
					newState.getActivityNode_heldTokens_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.BooleanVariable object
			 */
			if (o instanceof activitydiagram.BooleanVariable) {

				activitydiagram.BooleanVariable o_cast = (activitydiagram.BooleanVariable) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.Variable_currentValue_Value> localTrace15 = tracedObject
						.getCurrentValueTrace();
				activitydiagramTrace.Values.Variable_currentValue_Value previousValue15 = null;
				if (!localTrace15.isEmpty())
					previousValue15 = localTrace15.get(localTrace15.size() - 1);

				storeAsTracedObject(o_cast.getCurrentValue());

				activitydiagramTrace.Traced.activitydiagram.TracedValue content8 = null;
				if (o_cast.getCurrentValue() != null)
					content8 = ((activitydiagramTrace.Traced.activitydiagram.TracedValue) exeToTraced
							.get(o_cast.getCurrentValue()));

				boolean noChange15 = previousValue15 != null
						&& previousValue15.getCurrentValue() == content8;

				if (noChange15) {
					newState.getVariable_currentValue_Values().add(
							previousValue15);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.Variable_currentValue_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createVariable_currentValue_Value();

					newValue.setCurrentValue(content8);

					tracedObject.getCurrentValueTrace().add(newValue);
					newState.getVariable_currentValue_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.JoinNode object
			 */
			if (o instanceof activitydiagram.JoinNode) {

				activitydiagram.JoinNode o_cast = (activitydiagram.JoinNode) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedJoinNode tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedJoinNode) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.ActivityNode_heldTokens_Value> localTrace16 = tracedObject
						.getHeldTokensTrace();
				activitydiagramTrace.Values.ActivityNode_heldTokens_Value previousValue16 = null;
				if (!localTrace16.isEmpty())
					previousValue16 = localTrace16.get(localTrace16.size() - 1);

				for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
					storeAsTracedObject(aValue);
				}

				boolean noChange16 = true;
				if (previousValue16 != null) {

					if (previousValue16.getHeldTokens().size() == o_cast
							.getHeldTokens().size()) {

						java.util.Iterator<activitydiagram.Token> it = o_cast
								.getHeldTokens().iterator();
						for (activitydiagramTrace.Traced.activitydiagram.TracedToken aPreviousValue : previousValue16
								.getHeldTokens()) {
							activitydiagram.Token aCurrentValue = it.next();
							if (aPreviousValue != exeToTraced
									.get(aCurrentValue)) {
								noChange16 = false;
								break;
							}
						}

					} else {
						noChange16 = false;
					}
				} else {
					noChange16 = false;
				}

				if (noChange16) {
					newState.getActivityNode_heldTokens_Values().add(
							previousValue16);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createActivityNode_heldTokens_Value();

					newValue.getHeldTokens()
							.addAll((Collection<? extends activitydiagramTrace.Traced.activitydiagram.TracedToken>) getExeToTraced(o_cast
									.getHeldTokens()));

					tracedObject.getHeldTokensTrace().add(newValue);
					newState.getActivityNode_heldTokens_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.DecisionNode object
			 */
			if (o instanceof activitydiagram.DecisionNode) {

				activitydiagram.DecisionNode o_cast = (activitydiagram.DecisionNode) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.ActivityNode_heldTokens_Value> localTrace17 = tracedObject
						.getHeldTokensTrace();
				activitydiagramTrace.Values.ActivityNode_heldTokens_Value previousValue17 = null;
				if (!localTrace17.isEmpty())
					previousValue17 = localTrace17.get(localTrace17.size() - 1);

				for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
					storeAsTracedObject(aValue);
				}

				boolean noChange17 = true;
				if (previousValue17 != null) {

					if (previousValue17.getHeldTokens().size() == o_cast
							.getHeldTokens().size()) {

						java.util.Iterator<activitydiagram.Token> it = o_cast
								.getHeldTokens().iterator();
						for (activitydiagramTrace.Traced.activitydiagram.TracedToken aPreviousValue : previousValue17
								.getHeldTokens()) {
							activitydiagram.Token aCurrentValue = it.next();
							if (aPreviousValue != exeToTraced
									.get(aCurrentValue)) {
								noChange17 = false;
								break;
							}
						}

					} else {
						noChange17 = false;
					}
				} else {
					noChange17 = false;
				}

				if (noChange17) {
					newState.getActivityNode_heldTokens_Values().add(
							previousValue17);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createActivityNode_heldTokens_Value();

					newValue.getHeldTokens()
							.addAll((Collection<? extends activitydiagramTrace.Traced.activitydiagram.TracedToken>) getExeToTraced(o_cast
									.getHeldTokens()));

					tracedObject.getHeldTokensTrace().add(newValue);
					newState.getActivityNode_heldTokens_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.ControlToken object
			 */
			if (o instanceof activitydiagram.ControlToken) {

				activitydiagram.ControlToken o_cast = (activitydiagram.ControlToken) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedControlToken tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedControlToken) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.Token_holder_Value> localTrace18 = tracedObject
						.getHolderTrace();
				activitydiagramTrace.Values.Token_holder_Value previousValue18 = null;
				if (!localTrace18.isEmpty())
					previousValue18 = localTrace18.get(localTrace18.size() - 1);

				storeAsTracedObject(o_cast.getHolder());

				activitydiagramTrace.Traced.activitydiagram.TracedActivityNode content9 = null;
				if (o_cast.getHolder() != null)
					content9 = ((activitydiagramTrace.Traced.activitydiagram.TracedActivityNode) exeToTraced
							.get(o_cast.getHolder()));

				boolean noChange18 = previousValue18 != null
						&& previousValue18.getHolder() == content9;

				if (noChange18) {
					newState.getToken_holder_Values().add(previousValue18);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.Token_holder_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createToken_holder_Value();

					newValue.setHolder(content9);

					tracedObject.getHolderTrace().add(newValue);
					newState.getToken_holder_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.Trace object
			 */
			if (o instanceof activitydiagram.Trace) {

				activitydiagram.Trace o_cast = (activitydiagram.Trace) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedTrace tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedTrace) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.Trace_executedNodes_Value> localTrace19 = tracedObject
						.getExecutedNodesTrace();
				activitydiagramTrace.Values.Trace_executedNodes_Value previousValue19 = null;
				if (!localTrace19.isEmpty())
					previousValue19 = localTrace19.get(localTrace19.size() - 1);

				for (activitydiagram.ActivityNode aValue : o_cast
						.getExecutedNodes()) {
					storeAsTracedObject(aValue);
				}

				boolean noChange19 = true;
				if (previousValue19 != null) {

					if (previousValue19.getExecutedNodes().size() == o_cast
							.getExecutedNodes().size()) {

						java.util.Iterator<activitydiagram.ActivityNode> it = o_cast
								.getExecutedNodes().iterator();
						for (activitydiagramTrace.Traced.activitydiagram.TracedActivityNode aPreviousValue : previousValue19
								.getExecutedNodes()) {
							activitydiagram.ActivityNode aCurrentValue = it
									.next();
							if (aPreviousValue != exeToTraced
									.get(aCurrentValue)) {
								noChange19 = false;
								break;
							}
						}

					} else {
						noChange19 = false;
					}
				} else {
					noChange19 = false;
				}

				if (noChange19) {
					newState.getTrace_executedNodes_Values().add(
							previousValue19);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.Trace_executedNodes_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createTrace_executedNodes_Value();

					newValue.getExecutedNodes()
							.addAll((Collection<? extends activitydiagramTrace.Traced.activitydiagram.TracedActivityNode>) getExeToTraced(o_cast
									.getExecutedNodes()));

					tracedObject.getExecutedNodesTrace().add(newValue);
					newState.getTrace_executedNodes_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.BooleanValue object
			 */
			if (o instanceof activitydiagram.BooleanValue) {

				activitydiagram.BooleanValue o_cast = (activitydiagram.BooleanValue) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedBooleanValue tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedBooleanValue) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.BooleanValue_value_Value> localTrace20 = tracedObject
						.getValueTrace();
				activitydiagramTrace.Values.BooleanValue_value_Value previousValue20 = null;
				if (!localTrace20.isEmpty())
					previousValue20 = localTrace20.get(localTrace20.size() - 1);

				boolean content10 = o_cast.isValue();

				boolean noChange20 = previousValue20 != null
						&& previousValue20.isValue() == content10;

				if (noChange20) {
					newState.getBooleanValue_value_Values()
							.add(previousValue20);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.BooleanValue_value_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createBooleanValue_value_Value();

					newValue.setValue(content10);

					tracedObject.getValueTrace().add(newValue);
					newState.getBooleanValue_value_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.Input object
			 */
			if (o instanceof activitydiagram.Input) {

				activitydiagram.Input o_cast = (activitydiagram.Input) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedInput tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedInput) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.Input_inputValues_Value> localTrace21 = tracedObject
						.getInputValuesTrace();
				activitydiagramTrace.Values.Input_inputValues_Value previousValue21 = null;
				if (!localTrace21.isEmpty())
					previousValue21 = localTrace21.get(localTrace21.size() - 1);

				for (activitydiagram.InputValue aValue : o_cast
						.getInputValues()) {
					storeAsTracedObject(aValue);
				}

				boolean noChange21 = true;
				if (previousValue21 != null) {

					if (previousValue21.getInputValues().size() == o_cast
							.getInputValues().size()) {

						java.util.Iterator<activitydiagram.InputValue> it = o_cast
								.getInputValues().iterator();
						for (activitydiagramTrace.Traced.activitydiagram.TracedInputValue aPreviousValue : previousValue21
								.getInputValues()) {
							activitydiagram.InputValue aCurrentValue = it
									.next();
							if (aPreviousValue != exeToTraced
									.get(aCurrentValue)) {
								noChange21 = false;
								break;
							}
						}

					} else {
						noChange21 = false;
					}
				} else {
					noChange21 = false;
				}

				if (noChange21) {
					newState.getInput_inputValues_Values().add(previousValue21);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.Input_inputValues_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createInput_inputValues_Value();

					newValue.getInputValues()
							.addAll((Collection<? extends activitydiagramTrace.Traced.activitydiagram.TracedInputValue>) getExeToTraced(o_cast
									.getInputValues()));

					tracedObject.getInputValuesTrace().add(newValue);
					newState.getInput_inputValues_Values().add(newValue);
				}

			} else

			/**
			 * Storing the state of a activitydiagram.IntegerValue object
			 */
			if (o instanceof activitydiagram.IntegerValue) {

				activitydiagram.IntegerValue o_cast = (activitydiagram.IntegerValue) o;

				storeAsTracedObject(o_cast);

				activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue tracedObject = (activitydiagramTrace.Traced.activitydiagram.TracedIntegerValue) exeToTraced
						.get(o);

				// Then we compare the value of the field with the last stored value
				// If same value, we create no local state and we refer to the previous
				List<activitydiagramTrace.Values.IntegerValue_value_Value> localTrace22 = tracedObject
						.getValueTrace();
				activitydiagramTrace.Values.IntegerValue_value_Value previousValue22 = null;
				if (!localTrace22.isEmpty())
					previousValue22 = localTrace22.get(localTrace22.size() - 1);

				int content11 = o_cast.getValue();

				boolean noChange22 = previousValue22 != null
						&& previousValue22.getValue() == content11;

				if (noChange22) {
					newState.getIntegerValue_value_Values()
							.add(previousValue22);

				} // Else we create one
				else {
					changed = true;
					activitydiagramTrace.Values.IntegerValue_value_Value newValue = activitydiagramTrace.Values.ValuesFactory.eINSTANCE
							.createIntegerValue_value_Value();

					newValue.setValue(content11);

					tracedObject.getValueTrace().add(newValue);
					newState.getIntegerValue_value_Values().add(newValue);
				}

			}
		}

		boolean createNewState = lastState == null
				|| (!onlyIfChange || changed);
		if (createNewState) {
			lastState = newState;
			currentState = lastState;
			traceRoot.getStatesTrace().add(lastState);
		}

		// Undoing the new state created for nothing
		else {

			newState.getStartedBigSteps().clear();
			newState.getEndedBigSteps().clear();
			newState.setFollowingStep(null);

			newState.getIntegerValue_value_Values().clear();
			newState.getActivityEdge_offers_Values().clear();
			newState.getInputValue_value_Values().clear();
			newState.getInputValue_variable_Values().clear();
			newState.getInput_inputValues_Values().clear();
			newState.getForkedToken_remainingOffersCount_Values().clear();
			newState.getForkedToken_baseToken_Values().clear();
			newState.getBooleanValue_value_Values().clear();
			newState.getTrace_executedNodes_Values().clear();
			newState.getActivityNode_heldTokens_Values().clear();
			newState.getActivity_trace_Values().clear();
			newState.getToken_holder_Values().clear();
			newState.getOffer_offeredTokens_Values().clear();
			newState.getVariable_currentValue_Values().clear();
		}

		return createNewState;

	}

	@SuppressWarnings("unchecked")
	@Override
	public void goTo(EObject state) {

		if (state instanceof activitydiagramTrace.State) {
			activitydiagramTrace.State stateToGo = (activitydiagramTrace.State) state;

			for (activitydiagramTrace.Values.IntegerValue_value_Value value : stateToGo
					.getIntegerValue_value_Values()) {

				activitydiagram.IntegerValue exeObject = (activitydiagram.IntegerValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.getValue());

			}

			for (activitydiagramTrace.Values.ActivityEdge_offers_Value value : stateToGo
					.getActivityEdge_offers_Values()) {

				if (value.getParent() instanceof activitydiagramTrace.Traced.activitydiagram.TracedControlFlow) {
					activitydiagramTrace.Traced.activitydiagram.TracedControlFlow parent_cast = (activitydiagramTrace.Traced.activitydiagram.TracedControlFlow) value
							.getParent();
					parent_cast.getOriginalObject().getOffers().clear();
					parent_cast
							.getOriginalObject()
							.getOffers()
							.addAll((Collection<? extends activitydiagram.Offer>) getTracedToExe(value
									.getOffers()));

				}

			}

			for (activitydiagramTrace.Values.InputValue_value_Value value : stateToGo
					.getInputValue_value_Values()) {

				activitydiagram.InputValue exeObject = (activitydiagram.InputValue) getTracedToExe(value
						.getParent());
				exeObject
						.setValue(((activitydiagram.Value) getTracedToExe(value
								.getValue())));

			}

			for (activitydiagramTrace.Values.InputValue_variable_Value value : stateToGo
					.getInputValue_variable_Values()) {

				activitydiagram.InputValue exeObject = (activitydiagram.InputValue) getTracedToExe(value
						.getParent());
				exeObject
						.setVariable(((activitydiagram.Variable) getTracedToExe(value
								.getVariable())));

			}

			for (activitydiagramTrace.Values.Input_inputValues_Value value : stateToGo
					.getInput_inputValues_Values()) {

				activitydiagram.Input exeObject = (activitydiagram.Input) getTracedToExe(value
						.getParent());
				exeObject.getInputValues().clear();
				exeObject
						.getInputValues()
						.addAll((Collection<? extends activitydiagram.InputValue>) getTracedToExe(value
								.getInputValues()));

			}

			for (activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value value : stateToGo
					.getForkedToken_remainingOffersCount_Values()) {

				activitydiagram.ForkedToken exeObject = (activitydiagram.ForkedToken) getTracedToExe(value
						.getParent());
				exeObject.setRemainingOffersCount(value
						.getRemainingOffersCount());

			}

			for (activitydiagramTrace.Values.ForkedToken_baseToken_Value value : stateToGo
					.getForkedToken_baseToken_Values()) {

				activitydiagram.ForkedToken exeObject = (activitydiagram.ForkedToken) getTracedToExe(value
						.getParent());
				exeObject
						.setBaseToken(((activitydiagram.Token) getTracedToExe(value
								.getBaseToken())));

			}

			for (activitydiagramTrace.Values.BooleanValue_value_Value value : stateToGo
					.getBooleanValue_value_Values()) {

				activitydiagram.BooleanValue exeObject = (activitydiagram.BooleanValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.isValue());

			}

			for (activitydiagramTrace.Values.Trace_executedNodes_Value value : stateToGo
					.getTrace_executedNodes_Values()) {

				activitydiagram.Trace exeObject = (activitydiagram.Trace) getTracedToExe(value
						.getParent());
				exeObject.getExecutedNodes().clear();
				exeObject
						.getExecutedNodes()
						.addAll((Collection<? extends activitydiagram.ActivityNode>) getTracedToExe(value
								.getExecutedNodes()));

			}

			for (activitydiagramTrace.Values.ActivityNode_heldTokens_Value value : stateToGo
					.getActivityNode_heldTokens_Values()) {

				if (value.getParent() instanceof activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode) {
					activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode parent_cast = (activitydiagramTrace.Traced.activitydiagram.TracedDecisionNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value
									.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.Traced.activitydiagram.TracedJoinNode) {
					activitydiagramTrace.Traced.activitydiagram.TracedJoinNode parent_cast = (activitydiagramTrace.Traced.activitydiagram.TracedJoinNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value
									.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.Traced.activitydiagram.TracedMergeNode) {
					activitydiagramTrace.Traced.activitydiagram.TracedMergeNode parent_cast = (activitydiagramTrace.Traced.activitydiagram.TracedMergeNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value
									.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode) {
					activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode parent_cast = (activitydiagramTrace.Traced.activitydiagram.TracedActivityFinalNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value
									.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.Traced.activitydiagram.TracedForkNode) {
					activitydiagramTrace.Traced.activitydiagram.TracedForkNode parent_cast = (activitydiagramTrace.Traced.activitydiagram.TracedForkNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value
									.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.Traced.activitydiagram.TracedInitialNode) {
					activitydiagramTrace.Traced.activitydiagram.TracedInitialNode parent_cast = (activitydiagramTrace.Traced.activitydiagram.TracedInitialNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value
									.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction) {
					activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction parent_cast = (activitydiagramTrace.Traced.activitydiagram.TracedOpaqueAction) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value
									.getHeldTokens()));

				}

			}

			for (activitydiagramTrace.Values.Activity_trace_Value value : stateToGo
					.getActivity_trace_Values()) {

				if (value.getParent() instanceof activitydiagramTrace.Traced.activitydiagram.TracedActivity) {
					activitydiagramTrace.Traced.activitydiagram.TracedActivity parent_cast = (activitydiagramTrace.Traced.activitydiagram.TracedActivity) value
							.getParent();
					activitydiagram.Trace toset = ((activitydiagram.Trace) getTracedToExe(value
							.getTrace()));
					activitydiagram.Trace current = ((activitydiagram.Activity) parent_cast
							.getOriginalObject()).getTrace();
					if (current != toset)
						((activitydiagram.Activity) parent_cast
								.getOriginalObject()).setTrace(toset);

				}

			}

			for (activitydiagramTrace.Values.Token_holder_Value value : stateToGo
					.getToken_holder_Values()) {

				activitydiagram.Token exeObject = (activitydiagram.Token) getTracedToExe(value
						.getParent());
				exeObject
						.setHolder(((activitydiagram.ActivityNode) getTracedToExe(value
								.getHolder())));

			}

			for (activitydiagramTrace.Values.Offer_offeredTokens_Value value : stateToGo
					.getOffer_offeredTokens_Values()) {

				activitydiagram.Offer exeObject = (activitydiagram.Offer) getTracedToExe(value
						.getParent());
				exeObject.getOfferedTokens().clear();
				exeObject
						.getOfferedTokens()
						.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value
								.getOfferedTokens()));

			}

			for (activitydiagramTrace.Values.Variable_currentValue_Value value : stateToGo
					.getVariable_currentValue_Values()) {

				if (value.getParent() instanceof activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable) {
					activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable parent_cast = (activitydiagramTrace.Traced.activitydiagram.TracedIntegerVariable) value
							.getParent();
					activitydiagram.Value toset = ((activitydiagram.Value) getTracedToExe(value
							.getCurrentValue()));
					activitydiagram.Value current = ((activitydiagram.Variable) parent_cast
							.getOriginalObject()).getCurrentValue();
					if (current != toset)
						((activitydiagram.Variable) parent_cast
								.getOriginalObject()).setCurrentValue(toset);

				}
				if (value.getParent() instanceof activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable) {
					activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable parent_cast = (activitydiagramTrace.Traced.activitydiagram.TracedBooleanVariable) value
							.getParent();
					activitydiagram.Value toset = ((activitydiagram.Value) getTracedToExe(value
							.getCurrentValue()));
					activitydiagram.Value current = ((activitydiagram.Variable) parent_cast
							.getOriginalObject()).getCurrentValue();
					if (current != toset)
						((activitydiagram.Variable) parent_cast
								.getOriginalObject()).setCurrentValue(toset);

				}

			}

			currentState = stateToGo;
		} else {
			goToValue(state);
		}
	}

	@Override
	public void goTo(int stepNumber) {
		activitydiagramTrace.State stateToGo = traceRoot.getStatesTrace().get(
				stepNumber);
		goTo(stateToGo);
	}

	private void goToValue(EObject value) {
		Object states = emfGet(value, "states");
		if (states != null) {
			if (states instanceof List<?>) {
				// We get the first state in which this value existed
				Object state = ((List<?>) states).get(0);
				if (state instanceof activitydiagramTrace.State) {
					goTo((activitydiagramTrace.State) state);
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static void emfAdd(EObject o, String property, Object value) {
		for (EReference r : o.eClass().getEAllReferences()) {
			if (r.getName().equals(property)) {
				Object coll = o.eGet(r);
				if (coll instanceof Collection) {
					((Collection<Object>) coll).add(value);
					return;
				}
			}
		}
	}

	private static Object emfGet(EObject o, String property) {
		for (EReference r : o.eClass().getEAllReferences()) {
			if (r.getName().equals(property)) {
				return o.eGet(r);
			}
		}
		return null;
	}

	@Override
	public void retroAddEvent(String eventName, Map<String, Object> params) {
		addEvent(eventName, params, this.getTraceSize() - 2);

	}

	@Override
	public void addEvent(String eventName, Map<String, Object> params) {
		addEvent(eventName, params, this.getTraceSize() - 1);
	}

	private void addEvent(String eventName, Map<String, Object> params,
			int stateIndex) {

		if (stateIndex >= 0) {

			activitydiagramTrace.State state = this.traceRoot.getStatesTrace()
					.get(stateIndex);

			switch (eventName) {

			case "Activitydiagram_Activity_Reset":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_Activity_Reset activitydiagram_Activity_ResetInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Activity_Reset();
				activitydiagram_Activity_ResetInstance.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_Activity_ResetInstance);
				}
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof activitydiagram.Activity)
								activitydiagram_Activity_ResetInstance
										.setThis((activitydiagramTrace.Traced.activitydiagram.TracedActivity) exeToTraced
												.get(v));

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getActivitydiagram_Activity_Reset_Trace().add(
						activitydiagram_Activity_ResetInstance);
				break;

			case "Activitydiagram_ActivityNode_RemoveToken1":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1 activitydiagram_ActivityNode_RemoveToken1Instance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_RemoveToken1();
				activitydiagram_ActivityNode_RemoveToken1Instance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_ActivityNode_RemoveToken1Instance);
				}
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof activitydiagram.ActivityNode)
								activitydiagram_ActivityNode_RemoveToken1Instance
										.setThis((activitydiagramTrace.Traced.activitydiagram.TracedActivityNode) exeToTraced
												.get(v));

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events
						.getActivitydiagram_ActivityNode_RemoveToken1_Trace()
						.add(activitydiagram_ActivityNode_RemoveToken1Instance);
				break;

			case "Activitydiagram_ActivityNode_SendOffers1":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1 activitydiagram_ActivityNode_SendOffers1Instance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_SendOffers1();
				activitydiagram_ActivityNode_SendOffers1Instance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_ActivityNode_SendOffers1Instance);
				}
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof activitydiagram.ActivityNode)
								activitydiagram_ActivityNode_SendOffers1Instance
										.setThis((activitydiagramTrace.Traced.activitydiagram.TracedActivityNode) exeToTraced
												.get(v));

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getActivitydiagram_ActivityNode_SendOffers1_Trace()
						.add(activitydiagram_ActivityNode_SendOffers1Instance);
				break;

			case "Activitydiagram_Activity_Execute_FillEvent":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_FillEvent activitydiagram_Activity_Execute_FillEventInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Activity_Execute_FillEvent();
				activitydiagram_Activity_Execute_FillEventInstance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_Activity_Execute_FillEventInstance);
				}

				// Then we add it to its trace
				this.events
						.getActivitydiagram_Activity_Execute_FillEvent_Trace()
						.add(activitydiagram_Activity_Execute_FillEventInstance);
				break;

			case "Activitydiagram_ActivityNode_Execute_FillEvent":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_FillEvent activitydiagram_ActivityNode_Execute_FillEventInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_Execute_FillEvent();
				activitydiagram_ActivityNode_Execute_FillEventInstance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_ActivityNode_Execute_FillEventInstance);
				}

				// Then we add it to its trace
				this.events
						.getActivitydiagram_ActivityNode_Execute_FillEvent_Trace()
						.add(activitydiagram_ActivityNode_Execute_FillEventInstance);
				break;

			case "Activitydiagram_Activity_WriteTrace_FillEvent":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_FillEvent activitydiagram_Activity_WriteTrace_FillEventInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Activity_WriteTrace_FillEvent();
				activitydiagram_Activity_WriteTrace_FillEventInstance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_Activity_WriteTrace_FillEventInstance);
				}

				// Then we add it to its trace
				this.events
						.getActivitydiagram_Activity_WriteTrace_FillEvent_Trace()
						.add(activitydiagram_Activity_WriteTrace_FillEventInstance);
				break;

			case "Activitydiagram_Variable_Init":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_Variable_Init activitydiagram_Variable_InitInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Variable_Init();
				activitydiagram_Variable_InitInstance.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_Variable_InitInstance);
				}
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof activitydiagram.Variable)
								activitydiagram_Variable_InitInstance
										.setThis((activitydiagramTrace.Traced.activitydiagram.TracedVariable) exeToTraced
												.get(v));

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getActivitydiagram_Variable_Init_Trace().add(
						activitydiagram_Variable_InitInstance);
				break;

			case "Activitydiagram_Variable_Execute":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_Variable_Execute activitydiagram_Variable_ExecuteInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Variable_Execute();
				activitydiagram_Variable_ExecuteInstance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_Variable_ExecuteInstance);
				}
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof activitydiagram.Variable)
								activitydiagram_Variable_ExecuteInstance
										.setThis((activitydiagramTrace.Traced.activitydiagram.TracedVariable) exeToTraced
												.get(v));

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getActivitydiagram_Variable_Execute_Trace().add(
						activitydiagram_Variable_ExecuteInstance);
				break;

			case "Activitydiagram_ActivityNode_AddTokens1_FillEvent":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_FillEvent activitydiagram_ActivityNode_AddTokens1_FillEventInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_AddTokens1_FillEvent();
				activitydiagram_ActivityNode_AddTokens1_FillEventInstance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_ActivityNode_AddTokens1_FillEventInstance);
				}

				// Then we add it to its trace
				this.events
						.getActivitydiagram_ActivityNode_AddTokens1_FillEvent_Trace()
						.add(activitydiagram_ActivityNode_AddTokens1_FillEventInstance);
				break;

			case "Activitydiagram_ActivityNode_Terminate":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate activitydiagram_ActivityNode_TerminateInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_Terminate();
				activitydiagram_ActivityNode_TerminateInstance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_ActivityNode_TerminateInstance);
				}
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof activitydiagram.ActivityNode)
								activitydiagram_ActivityNode_TerminateInstance
										.setThis((activitydiagramTrace.Traced.activitydiagram.TracedActivityNode) exeToTraced
												.get(v));

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getActivitydiagram_ActivityNode_Terminate_Trace()
						.add(activitydiagram_ActivityNode_TerminateInstance);
				break;

			case "FillEvent":

				// First we create the event
				activitydiagramTrace.Steps.FillEvent fillEventInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createFillEvent();
				fillEventInstance.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps", fillEventInstance);
				}

				// Then we add it to its trace
				this.events.getFillEvent_Trace().add(fillEventInstance);
				break;

			case "Activitydiagram_Activity_Execute":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_Activity_Execute activitydiagram_Activity_ExecuteInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Activity_Execute();
				activitydiagram_Activity_ExecuteInstance
						.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_Activity_ExecuteInstance);
				}
				context.push(activitydiagram_Activity_ExecuteInstance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof activitydiagram.Activity)
								activitydiagram_Activity_ExecuteInstance
										.setThis((activitydiagramTrace.Traced.activitydiagram.TracedActivity) exeToTraced
												.get(v));

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getActivitydiagram_Activity_Execute_Trace().add(
						activitydiagram_Activity_ExecuteInstance);
				break;

			case "Activitydiagram_ActivityNode_AddTokens1":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1 activitydiagram_ActivityNode_AddTokens1Instance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_AddTokens1();
				activitydiagram_ActivityNode_AddTokens1Instance
						.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_ActivityNode_AddTokens1Instance);
				}
				context.push(activitydiagram_ActivityNode_AddTokens1Instance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof activitydiagram.ActivityNode)
								activitydiagram_ActivityNode_AddTokens1Instance
										.setThis((activitydiagramTrace.Traced.activitydiagram.TracedActivityNode) exeToTraced
												.get(v));

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getActivitydiagram_ActivityNode_AddTokens1_Trace()
						.add(activitydiagram_ActivityNode_AddTokens1Instance);
				break;

			case "Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent();
				activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventInstance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventInstance);
				}

				// Then we add it to its trace
				this.events
						.getActivitydiagram_ActivityNode_TakeOfferdTokens1_FillEvent_Trace()
						.add(activitydiagram_ActivityNode_TakeOfferdTokens1_FillEventInstance);
				break;

			case "Activitydiagram_Activity_InitializeContext":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext activitydiagram_Activity_InitializeContextInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Activity_InitializeContext();
				activitydiagram_Activity_InitializeContextInstance
						.setPrecedingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_Activity_InitializeContextInstance);
				}
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof activitydiagram.Activity)
								activitydiagram_Activity_InitializeContextInstance
										.setThis((activitydiagramTrace.Traced.activitydiagram.TracedActivity) exeToTraced
												.get(v));

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events
						.getActivitydiagram_Activity_InitializeContext_Trace()
						.add(activitydiagram_Activity_InitializeContextInstance);
				break;

			case "Activitydiagram_Activity_WriteTrace":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace activitydiagram_Activity_WriteTraceInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Activity_WriteTrace();
				activitydiagram_Activity_WriteTraceInstance
						.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_Activity_WriteTraceInstance);
				}
				context.push(activitydiagram_Activity_WriteTraceInstance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof activitydiagram.Activity)
								activitydiagram_Activity_WriteTraceInstance
										.setThis((activitydiagramTrace.Traced.activitydiagram.TracedActivity) exeToTraced
												.get(v));

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getActivitydiagram_Activity_WriteTrace_Trace().add(
						activitydiagram_Activity_WriteTraceInstance);
				break;

			case "Activitydiagram_ActivityNode_Execute":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute activitydiagram_ActivityNode_ExecuteInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_Execute();
				activitydiagram_ActivityNode_ExecuteInstance
						.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_ActivityNode_ExecuteInstance);
				}
				context.push(activitydiagram_ActivityNode_ExecuteInstance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof activitydiagram.ActivityNode)
								activitydiagram_ActivityNode_ExecuteInstance
										.setThis((activitydiagramTrace.Traced.activitydiagram.TracedActivityNode) exeToTraced
												.get(v));

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events.getActivitydiagram_ActivityNode_Execute_Trace()
						.add(activitydiagram_ActivityNode_ExecuteInstance);
				break;

			case "Activitydiagram_ActivityNode_TakeOfferdTokens1":

				// First we create the event
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1 activitydiagram_ActivityNode_TakeOfferdTokens1Instance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_TakeOfferdTokens1();
				activitydiagram_ActivityNode_TakeOfferdTokens1Instance
						.setStartingState(state);

				if (!context.isEmpty()) {
					emfAdd(context.getFirst(), "subSteps",
							activitydiagram_ActivityNode_TakeOfferdTokens1Instance);
				}
				context.push(activitydiagram_ActivityNode_TakeOfferdTokens1Instance);
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v = params.get(k);
							if (v instanceof activitydiagram.ActivityNode)
								activitydiagram_ActivityNode_TakeOfferdTokens1Instance
										.setThis((activitydiagramTrace.Traced.activitydiagram.TracedActivityNode) exeToTraced
												.get(v));

							break;

						}
					}
				}

				// Then we add it to its trace
				this.events
						.getActivitydiagram_ActivityNode_TakeOfferdTokens1_Trace()
						.add(activitydiagram_ActivityNode_TakeOfferdTokens1Instance);
				break;
			}

		}
	}

	@Override
	public void endEvent(String eventName, Object returnValue) {
		if (isMacro(eventName)) {
			context.pop().setEndingState(lastState);
		}
	}

	@Override
	public void initTrace() {
		// Create root
		this.traceRoot = activitydiagramTrace.ActivitydiagramTraceFactory.eINSTANCE
				.createTrace();

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		// Create objects storage
		this.tracedObjects = activitydiagramTrace.Traced.TracedFactory.eINSTANCE
				.createTracedObjects();
		this.traceRoot.setTracedObjects(tracedObjects);

		// Create events storage
		this.events = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
				.createSteps();
		this.traceRoot.setSteps(events);

		// Initializing the map exeobject -> tracedobject
		this.exeToTraced = new HashMap<EObject, EObject>();
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public EObject getExecutionState(int index) {
		return traceRoot.getStatesTrace().get(index);
	}

	@Override
	public String getDescriptionOfExecutionState(int index) {
		StringBuilder result = new StringBuilder();
		activitydiagramTrace.State gs = traceRoot.getStatesTrace().get(index);

		if (!gs.getIntegerValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (activitydiagramTrace.Values.IntegerValue_value_Value currenState : gs
				.getIntegerValue_value_Values()) {
			result.append("\n\t" + currenState.getValue());
		}

		if (!gs.getActivityEdge_offers_Values().isEmpty())
			result.append("\nOffers values:");
		for (activitydiagramTrace.Values.ActivityEdge_offers_Value currenState : gs
				.getActivityEdge_offers_Values()) {
			result.append("\n\t" + currenState.getOffers());
		}

		if (!gs.getInputValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (activitydiagramTrace.Values.InputValue_value_Value currenState : gs
				.getInputValue_value_Values()) {
			result.append("\n\t" + currenState.getValue());
		}

		if (!gs.getInputValue_variable_Values().isEmpty())
			result.append("\nVariable values:");
		for (activitydiagramTrace.Values.InputValue_variable_Value currenState : gs
				.getInputValue_variable_Values()) {
			result.append("\n\t" + currenState.getVariable());
		}

		if (!gs.getInput_inputValues_Values().isEmpty())
			result.append("\nInputValues values:");
		for (activitydiagramTrace.Values.Input_inputValues_Value currenState : gs
				.getInput_inputValues_Values()) {
			result.append("\n\t" + currenState.getInputValues());
		}

		if (!gs.getForkedToken_remainingOffersCount_Values().isEmpty())
			result.append("\nRemainingOffersCount values:");
		for (activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value currenState : gs
				.getForkedToken_remainingOffersCount_Values()) {
			result.append("\n\t" + currenState.getRemainingOffersCount());
		}

		if (!gs.getForkedToken_baseToken_Values().isEmpty())
			result.append("\nBaseToken values:");
		for (activitydiagramTrace.Values.ForkedToken_baseToken_Value currenState : gs
				.getForkedToken_baseToken_Values()) {
			result.append("\n\t" + currenState.getBaseToken());
		}

		if (!gs.getBooleanValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (activitydiagramTrace.Values.BooleanValue_value_Value currenState : gs
				.getBooleanValue_value_Values()) {
			result.append("\n\t" + currenState.isValue());
		}

		if (!gs.getTrace_executedNodes_Values().isEmpty())
			result.append("\nExecutedNodes values:");
		for (activitydiagramTrace.Values.Trace_executedNodes_Value currenState : gs
				.getTrace_executedNodes_Values()) {
			result.append("\n\t" + currenState.getExecutedNodes());
		}

		if (!gs.getActivityNode_heldTokens_Values().isEmpty())
			result.append("\nHeldTokens values:");
		for (activitydiagramTrace.Values.ActivityNode_heldTokens_Value currenState : gs
				.getActivityNode_heldTokens_Values()) {
			result.append("\n\t" + currenState.getHeldTokens());
		}

		if (!gs.getActivity_trace_Values().isEmpty())
			result.append("\nTrace values:");
		for (activitydiagramTrace.Values.Activity_trace_Value currenState : gs
				.getActivity_trace_Values()) {
			result.append("\n\t" + currenState.getTrace());
		}

		if (!gs.getToken_holder_Values().isEmpty())
			result.append("\nHolder values:");
		for (activitydiagramTrace.Values.Token_holder_Value currenState : gs
				.getToken_holder_Values()) {
			result.append("\n\t" + currenState.getHolder());
		}

		if (!gs.getOffer_offeredTokens_Values().isEmpty())
			result.append("\nOfferedTokens values:");
		for (activitydiagramTrace.Values.Offer_offeredTokens_Value currenState : gs
				.getOffer_offeredTokens_Values()) {
			result.append("\n\t" + currenState.getOfferedTokens());
		}

		if (!gs.getVariable_currentValue_Values().isEmpty())
			result.append("\nCurrentValue values:");
		for (activitydiagramTrace.Values.Variable_currentValue_Value currenState : gs
				.getVariable_currentValue_Values()) {
			result.append("\n\t" + currenState.getCurrentValue());
		}

		if (gs.getFollowingStep() != null)
			result.append("\n\nFollowing small step: "
					+ gs.getFollowingStep().eClass().getName());
		if (!gs.getEndedBigSteps().isEmpty()) {
			result.append("\n\nFinished big steps: ");
			for (activitydiagramTrace.Steps.BigStep m : gs.getEndedBigSteps()) {
				result.append("\n\t" + m.eClass().getName());
				result.append(" (began at state "
						+ traceRoot.getStatesTrace().indexOf(
								m.getStartingState()) + ")");
			}
		}
		if (!gs.getStartedBigSteps().isEmpty()) {
			result.append("\n\nStarting big steps: ");
			for (activitydiagramTrace.Steps.BigStep m : gs.getStartedBigSteps()) {
				result.append("\n\t" + m.eClass().getName());
				if (m.getEndingState() != null) {
					result.append(" (ends at state "
							+ traceRoot.getStatesTrace().indexOf(
									m.getEndingState()) + ")");
				}
			}
		}

		result.deleteCharAt(0);
		return result.toString();
	}

	@Override
	public int getTraceSize() {
		return traceRoot.getStatesTrace().size();
	}

	@Override
	public boolean isMacro(String string) {
		return macroEvents.contains(string);
	}

	@Override
	public boolean addStateIfChanged() {
		return addState(true);
	}

	@Override
	public void addState() {
		addState(false);
	}

	@Override
	public String currentMacro() {
		if (!context.isEmpty())
			return context.getFirst().eClass().getName();
		else
			return null;
	}

	@Override
	public int getNumberOfValueTraces() {
		return getAllValueTraces().size();
	}

	@Override
	public Set<EObject> getAllCurrentValues() {
		// We find all current values
		Set<EObject> currentValues = new HashSet<EObject>();
		if (currentState != null) {
			currentValues.addAll(currentState.getIntegerValue_value_Values());
			currentValues.addAll(currentState.getActivityEdge_offers_Values());
			currentValues.addAll(currentState.getInputValue_value_Values());
			currentValues.addAll(currentState.getInputValue_variable_Values());
			currentValues.addAll(currentState.getInput_inputValues_Values());
			currentValues.addAll(currentState
					.getForkedToken_remainingOffersCount_Values());
			currentValues
					.addAll(currentState.getForkedToken_baseToken_Values());
			currentValues.addAll(currentState.getBooleanValue_value_Values());
			currentValues.addAll(currentState.getTrace_executedNodes_Values());
			currentValues.addAll(currentState
					.getActivityNode_heldTokens_Values());
			currentValues.addAll(currentState.getActivity_trace_Values());
			currentValues.addAll(currentState.getToken_holder_Values());
			currentValues.addAll(currentState.getOffer_offeredTokens_Values());
			currentValues
					.addAll(currentState.getVariable_currentValue_Values());
		}
		return currentValues;
	}

	public List<IValueTrace> getAllValueTraces() {
		return traces;
	}

	@Override
	public String getDescriptionOfValue(EObject eObject) {
		if (eObject instanceof activitydiagramTrace.Values.IntegerValue_value_Value) {
			return "activitydiagramTrace.Values.IntegerValue_value_Value: "
					+ ((activitydiagramTrace.Values.IntegerValue_value_Value) eObject)
							.getValue();
		} else if (eObject instanceof activitydiagramTrace.Values.ActivityEdge_offers_Value) {
			return "activitydiagramTrace.Values.ActivityEdge_offers_Value: "
					+ ((activitydiagramTrace.Values.ActivityEdge_offers_Value) eObject)
							.getOffers();
		} else if (eObject instanceof activitydiagramTrace.Values.InputValue_value_Value) {
			return "activitydiagramTrace.Values.InputValue_value_Value: "
					+ ((activitydiagramTrace.Values.InputValue_value_Value) eObject)
							.getValue();
		} else if (eObject instanceof activitydiagramTrace.Values.InputValue_variable_Value) {
			return "activitydiagramTrace.Values.InputValue_variable_Value: "
					+ ((activitydiagramTrace.Values.InputValue_variable_Value) eObject)
							.getVariable();
		} else if (eObject instanceof activitydiagramTrace.Values.Input_inputValues_Value) {
			return "activitydiagramTrace.Values.Input_inputValues_Value: "
					+ ((activitydiagramTrace.Values.Input_inputValues_Value) eObject)
							.getInputValues();
		} else if (eObject instanceof activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value) {
			return "activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value: "
					+ ((activitydiagramTrace.Values.ForkedToken_remainingOffersCount_Value) eObject)
							.getRemainingOffersCount();
		} else if (eObject instanceof activitydiagramTrace.Values.ForkedToken_baseToken_Value) {
			return "activitydiagramTrace.Values.ForkedToken_baseToken_Value: "
					+ ((activitydiagramTrace.Values.ForkedToken_baseToken_Value) eObject)
							.getBaseToken();
		} else if (eObject instanceof activitydiagramTrace.Values.BooleanValue_value_Value) {
			return "activitydiagramTrace.Values.BooleanValue_value_Value: "
					+ ((activitydiagramTrace.Values.BooleanValue_value_Value) eObject)
							.isValue();
		} else if (eObject instanceof activitydiagramTrace.Values.Trace_executedNodes_Value) {
			return "activitydiagramTrace.Values.Trace_executedNodes_Value: "
					+ ((activitydiagramTrace.Values.Trace_executedNodes_Value) eObject)
							.getExecutedNodes();
		} else if (eObject instanceof activitydiagramTrace.Values.ActivityNode_heldTokens_Value) {
			return "activitydiagramTrace.Values.ActivityNode_heldTokens_Value: "
					+ ((activitydiagramTrace.Values.ActivityNode_heldTokens_Value) eObject)
							.getHeldTokens();
		} else if (eObject instanceof activitydiagramTrace.Values.Activity_trace_Value) {
			return "activitydiagramTrace.Values.Activity_trace_Value: "
					+ ((activitydiagramTrace.Values.Activity_trace_Value) eObject)
							.getTrace();
		} else if (eObject instanceof activitydiagramTrace.Values.Token_holder_Value) {
			return "activitydiagramTrace.Values.Token_holder_Value: "
					+ ((activitydiagramTrace.Values.Token_holder_Value) eObject)
							.getHolder();
		} else if (eObject instanceof activitydiagramTrace.Values.Offer_offeredTokens_Value) {
			return "activitydiagramTrace.Values.Offer_offeredTokens_Value: "
					+ ((activitydiagramTrace.Values.Offer_offeredTokens_Value) eObject)
							.getOfferedTokens();
		} else if (eObject instanceof activitydiagramTrace.Values.Variable_currentValue_Value) {
			return "activitydiagramTrace.Values.Variable_currentValue_Value: "
					+ ((activitydiagramTrace.Values.Variable_currentValue_Value) eObject)
							.getCurrentValue();
		} else
			return "ERROR";
	}

	@Override
	public int getCurrentIndex() {
		return traceRoot.getStatesTrace().indexOf(currentState);
	}

}
