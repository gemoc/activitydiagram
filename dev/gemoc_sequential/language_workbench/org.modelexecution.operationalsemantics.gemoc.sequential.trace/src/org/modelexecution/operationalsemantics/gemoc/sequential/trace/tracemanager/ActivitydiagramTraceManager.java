package org.modelexecution.operationalsemantics.gemoc.sequential.trace.tracemanager;

import fr.inria.diverse.trace.api.ITraceManager;
import fr.inria.diverse.trace.api.IValueTrace;
import fr.inria.diverse.trace.api.impl.GenericValueTrace;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.TreeIterator;

public class ActivitydiagramTraceManager implements ITraceManager {

	private activitydiagramTrace.Trace traceRoot;
	private Resource executedModel;

	private Map<EObject, EObject> exeToTraced;

	private activitydiagramTrace.States.State lastState;
	private List<IValueTrace> traces;

	private Resource traceResource;
	private Deque<activitydiagramTrace.Steps.Step> context = new LinkedList<activitydiagramTrace.Steps.Step>();
	private static final List<String> bigSteps = Arrays.asList("Activitydiagram_Activity_Execute",
			"Activitydiagram_Activity_WriteTrace", "Activitydiagram_ActivityNode_AddTokens1",
			"Activitydiagram_ActivityNode_TakeOfferdTokens1");

	public ActivitydiagramTraceManager(Resource exeModel, Resource traceResource) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.traces = new ArrayList<IValueTrace>();
	}

	@Override
	public boolean addStateIfChanged() {
		return addState(true);
	}

	@Override
	public void addState() {
		addState(false);
	}

	@SuppressWarnings("unchecked")
	private boolean addState(boolean onlyIfChange) {

		activitydiagramTrace.States.State newState = activitydiagramTrace.States.StatesFactory.eINSTANCE.createState();
		boolean changed = false;

		// We look at each object instance of a class with mutable properties 
		// Each of these objects should eventually become a traced object

		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		for (Resource r : allResources)
			for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
				EObject o = i.next();

				/**
				 * Storing the state of a activitydiagram.ControlToken object
				 */
				if (o instanceof activitydiagram.ControlToken) {

					activitydiagram.ControlToken o_cast = (activitydiagram.ControlToken) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedControlToken tracedObject = (activitydiagramTrace.States.activitydiagram.TracedControlToken) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Token_holder_Value> localTrace1 = tracedObject.getHolderSequence();
					activitydiagramTrace.States.Token_holder_Value previousValue1 = null;
					if (!localTrace1.isEmpty())
						previousValue1 = localTrace1.get(localTrace1.size() - 1);

					storeAsTracedObject(o_cast.getHolder());

					activitydiagramTrace.States.activitydiagram.TracedActivityNode content1 = null;
					if (o_cast.getHolder() != null)
						content1 = ((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast.getHolder()));

					boolean noChange1 = previousValue1 != null && previousValue1.getHolder() == content1;

					if (noChange1) {
						newState.getToken_holder_Values().add(previousValue1);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Token_holder_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createToken_holder_Value();

						newValue.setHolder(content1);

						tracedObject.getHolderSequence().add(newValue);
						newState.getToken_holder_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.InputValue object
				 */
				if (o instanceof activitydiagram.InputValue) {

					activitydiagram.InputValue o_cast = (activitydiagram.InputValue) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedInputValue tracedObject = (activitydiagramTrace.States.activitydiagram.TracedInputValue) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.InputValue_variable_Value> localTrace2 = tracedObject
							.getVariableSequence();
					activitydiagramTrace.States.InputValue_variable_Value previousValue2 = null;
					if (!localTrace2.isEmpty())
						previousValue2 = localTrace2.get(localTrace2.size() - 1);

					storeAsTracedObject(o_cast.getVariable());

					activitydiagramTrace.States.activitydiagram.TracedVariable content2 = null;
					if (o_cast.getVariable() != null)
						content2 = ((activitydiagramTrace.States.activitydiagram.TracedVariable) exeToTraced.get(o_cast
								.getVariable()));

					boolean noChange2 = previousValue2 != null && previousValue2.getVariable() == content2;

					if (noChange2) {
						newState.getInputValue_variable_Values().add(previousValue2);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.InputValue_variable_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createInputValue_variable_Value();

						newValue.setVariable(content2);

						tracedObject.getVariableSequence().add(newValue);
						newState.getInputValue_variable_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.InputValue_value_Value> localTrace3 = tracedObject
							.getValueSequence();
					activitydiagramTrace.States.InputValue_value_Value previousValue3 = null;
					if (!localTrace3.isEmpty())
						previousValue3 = localTrace3.get(localTrace3.size() - 1);

					storeAsTracedObject(o_cast.getValue());

					activitydiagramTrace.States.activitydiagram.TracedValue content3 = null;
					if (o_cast.getValue() != null)
						content3 = ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced.get(o_cast
								.getValue()));

					boolean noChange3 = previousValue3 != null && previousValue3.getValue() == content3;

					if (noChange3) {
						newState.getInputValue_value_Values().add(previousValue3);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.InputValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createInputValue_value_Value();

						newValue.setValue(content3);

						tracedObject.getValueSequence().add(newValue);
						newState.getInputValue_value_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.Trace object
				 */
				if (o instanceof activitydiagram.Trace) {

					activitydiagram.Trace o_cast = (activitydiagram.Trace) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedTrace tracedObject = (activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Trace_executedNodes_Value> localTrace4 = tracedObject
							.getExecutedNodesSequence();
					activitydiagramTrace.States.Trace_executedNodes_Value previousValue4 = null;
					if (!localTrace4.isEmpty())
						previousValue4 = localTrace4.get(localTrace4.size() - 1);

					for (activitydiagram.ActivityNode aValue : o_cast.getExecutedNodes()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange4 = true;
					if (previousValue4 != null) {

						if (previousValue4.getExecutedNodes().size() == o_cast.getExecutedNodes().size()) {

							java.util.Iterator<activitydiagram.ActivityNode> it = o_cast.getExecutedNodes().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityNode aPreviousValue : previousValue4
									.getExecutedNodes()) {
								activitydiagram.ActivityNode aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
						newState.getTrace_executedNodes_Values().add(previousValue4);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Trace_executedNodes_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createTrace_executedNodes_Value();

						newValue.getExecutedNodes()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityNode>) getExeToTraced(o_cast
										.getExecutedNodes()));

						tracedObject.getExecutedNodesSequence().add(newValue);
						newState.getTrace_executedNodes_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.ControlFlow object
				 */
				if (o instanceof activitydiagram.ControlFlow) {

					activitydiagram.ControlFlow o_cast = (activitydiagram.ControlFlow) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedControlFlow tracedObject = (activitydiagramTrace.States.activitydiagram.TracedControlFlow) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityEdge_offers_Value> localTrace5 = tracedObject
							.getOffersSequence();
					activitydiagramTrace.States.ActivityEdge_offers_Value previousValue5 = null;
					if (!localTrace5.isEmpty())
						previousValue5 = localTrace5.get(localTrace5.size() - 1);

					for (activitydiagram.Offer aValue : o_cast.getOffers()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange5 = true;
					if (previousValue5 != null) {

						if (previousValue5.getOffers().size() == o_cast.getOffers().size()) {

							java.util.Iterator<activitydiagram.Offer> it = o_cast.getOffers().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedOffer aPreviousValue : previousValue5
									.getOffers()) {
								activitydiagram.Offer aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange5 = false;
									break;
								}
							}

						} else {
							noChange5 = false;
						}
					} else {
						noChange5 = false;
					}

					if (noChange5) {
						newState.getActivityEdge_offers_Values().add(previousValue5);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityEdge_offers_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityEdge_offers_Value();

						newValue.getOffers()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedOffer>) getExeToTraced(o_cast
										.getOffers()));

						tracedObject.getOffersSequence().add(newValue);
						newState.getActivityEdge_offers_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.IntegerValue object
				 */
				if (o instanceof activitydiagram.IntegerValue) {

					activitydiagram.IntegerValue o_cast = (activitydiagram.IntegerValue) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedIntegerValue tracedObject = (activitydiagramTrace.States.activitydiagram.TracedIntegerValue) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.IntegerValue_value_Value> localTrace6 = tracedObject
							.getValueSequence();
					activitydiagramTrace.States.IntegerValue_value_Value previousValue6 = null;
					if (!localTrace6.isEmpty())
						previousValue6 = localTrace6.get(localTrace6.size() - 1);

					int content4 = o_cast.getValue();

					boolean noChange6 = previousValue6 != null && previousValue6.getValue() == content4;

					if (noChange6) {
						newState.getIntegerValue_value_Values().add(previousValue6);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.IntegerValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createIntegerValue_value_Value();

						newValue.setValue(content4);

						tracedObject.getValueSequence().add(newValue);
						newState.getIntegerValue_value_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.BooleanVariable object
				 */
				if (o instanceof activitydiagram.BooleanVariable) {

					activitydiagram.BooleanVariable o_cast = (activitydiagram.BooleanVariable) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedBooleanVariable tracedObject = (activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Variable_currentValue_Value> localTrace7 = tracedObject
							.getCurrentValueSequence();
					activitydiagramTrace.States.Variable_currentValue_Value previousValue7 = null;
					if (!localTrace7.isEmpty())
						previousValue7 = localTrace7.get(localTrace7.size() - 1);

					storeAsTracedObject(o_cast.getCurrentValue());

					activitydiagramTrace.States.activitydiagram.TracedValue content5 = null;
					if (o_cast.getCurrentValue() != null)
						content5 = ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced.get(o_cast
								.getCurrentValue()));

					boolean noChange7 = previousValue7 != null && previousValue7.getCurrentValue() == content5;

					if (noChange7) {
						newState.getVariable_currentValue_Values().add(previousValue7);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Variable_currentValue_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createVariable_currentValue_Value();

						newValue.setCurrentValue(content5);

						tracedObject.getCurrentValueSequence().add(newValue);
						newState.getVariable_currentValue_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.BooleanValue object
				 */
				if (o instanceof activitydiagram.BooleanValue) {

					activitydiagram.BooleanValue o_cast = (activitydiagram.BooleanValue) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedBooleanValue tracedObject = (activitydiagramTrace.States.activitydiagram.TracedBooleanValue) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.BooleanValue_value_Value> localTrace8 = tracedObject
							.getValueSequence();
					activitydiagramTrace.States.BooleanValue_value_Value previousValue8 = null;
					if (!localTrace8.isEmpty())
						previousValue8 = localTrace8.get(localTrace8.size() - 1);

					boolean content6 = o_cast.isValue();

					boolean noChange8 = previousValue8 != null && previousValue8.isValue() == content6;

					if (noChange8) {
						newState.getBooleanValue_value_Values().add(previousValue8);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.BooleanValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createBooleanValue_value_Value();

						newValue.setValue(content6);

						tracedObject.getValueSequence().add(newValue);
						newState.getBooleanValue_value_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.JoinNode object
				 */
				if (o instanceof activitydiagram.JoinNode) {

					activitydiagram.JoinNode o_cast = (activitydiagram.JoinNode) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedJoinNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedJoinNode) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> localTrace9 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue9 = null;
					if (!localTrace9.isEmpty())
						previousValue9 = localTrace9.get(localTrace9.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange9 = true;
					if (previousValue9 != null) {

						if (previousValue9.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue9
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange9 = false;
									break;
								}
							}

						} else {
							noChange9 = false;
						}
					} else {
						noChange9 = false;
					}

					if (noChange9) {
						newState.getActivityNode_heldTokens_Values().add(previousValue9);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_heldTokens_Value();

						newValue.getHeldTokens()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(o_cast
										.getHeldTokens()));

						tracedObject.getHeldTokensSequence().add(newValue);
						newState.getActivityNode_heldTokens_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.DecisionNode object
				 */
				if (o instanceof activitydiagram.DecisionNode) {

					activitydiagram.DecisionNode o_cast = (activitydiagram.DecisionNode) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedDecisionNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedDecisionNode) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> localTrace10 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue10 = null;
					if (!localTrace10.isEmpty())
						previousValue10 = localTrace10.get(localTrace10.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange10 = true;
					if (previousValue10 != null) {

						if (previousValue10.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue10
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
						newState.getActivityNode_heldTokens_Values().add(previousValue10);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_heldTokens_Value();

						newValue.getHeldTokens()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(o_cast
										.getHeldTokens()));

						tracedObject.getHeldTokensSequence().add(newValue);
						newState.getActivityNode_heldTokens_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.MergeNode object
				 */
				if (o instanceof activitydiagram.MergeNode) {

					activitydiagram.MergeNode o_cast = (activitydiagram.MergeNode) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedMergeNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedMergeNode) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> localTrace11 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue11 = null;
					if (!localTrace11.isEmpty())
						previousValue11 = localTrace11.get(localTrace11.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange11 = true;
					if (previousValue11 != null) {

						if (previousValue11.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue11
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
						newState.getActivityNode_heldTokens_Values().add(previousValue11);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_heldTokens_Value();

						newValue.getHeldTokens()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(o_cast
										.getHeldTokens()));

						tracedObject.getHeldTokensSequence().add(newValue);
						newState.getActivityNode_heldTokens_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.Activity object
				 */
				if (o instanceof activitydiagram.Activity) {

					activitydiagram.Activity o_cast = (activitydiagram.Activity) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedActivity tracedObject = (activitydiagramTrace.States.activitydiagram.TracedActivity) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Activity_trace_Value> localTrace12 = tracedObject
							.getTraceSequence();
					activitydiagramTrace.States.Activity_trace_Value previousValue12 = null;
					if (!localTrace12.isEmpty())
						previousValue12 = localTrace12.get(localTrace12.size() - 1);

					storeAsTracedObject(o_cast.getTrace());

					activitydiagramTrace.States.activitydiagram.TracedTrace content7 = null;
					if (o_cast.getTrace() != null)
						content7 = ((activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced.get(o_cast
								.getTrace()));

					boolean noChange12 = previousValue12 != null && previousValue12.getTrace() == content7;

					if (noChange12) {
						newState.getActivity_trace_Values().add(previousValue12);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Activity_trace_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivity_trace_Value();

						newValue.setTrace(content7);

						tracedObject.getTraceSequence().add(newValue);
						newState.getActivity_trace_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.IntegerVariable object
				 */
				if (o instanceof activitydiagram.IntegerVariable) {

					activitydiagram.IntegerVariable o_cast = (activitydiagram.IntegerVariable) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedIntegerVariable tracedObject = (activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Variable_currentValue_Value> localTrace13 = tracedObject
							.getCurrentValueSequence();
					activitydiagramTrace.States.Variable_currentValue_Value previousValue13 = null;
					if (!localTrace13.isEmpty())
						previousValue13 = localTrace13.get(localTrace13.size() - 1);

					storeAsTracedObject(o_cast.getCurrentValue());

					activitydiagramTrace.States.activitydiagram.TracedValue content8 = null;
					if (o_cast.getCurrentValue() != null)
						content8 = ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced.get(o_cast
								.getCurrentValue()));

					boolean noChange13 = previousValue13 != null && previousValue13.getCurrentValue() == content8;

					if (noChange13) {
						newState.getVariable_currentValue_Values().add(previousValue13);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Variable_currentValue_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createVariable_currentValue_Value();

						newValue.setCurrentValue(content8);

						tracedObject.getCurrentValueSequence().add(newValue);
						newState.getVariable_currentValue_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.ForkNode object
				 */
				if (o instanceof activitydiagram.ForkNode) {

					activitydiagram.ForkNode o_cast = (activitydiagram.ForkNode) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedForkNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedForkNode) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> localTrace14 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue14 = null;
					if (!localTrace14.isEmpty())
						previousValue14 = localTrace14.get(localTrace14.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange14 = true;
					if (previousValue14 != null) {

						if (previousValue14.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue14
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
						newState.getActivityNode_heldTokens_Values().add(previousValue14);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_heldTokens_Value();

						newValue.getHeldTokens()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(o_cast
										.getHeldTokens()));

						tracedObject.getHeldTokensSequence().add(newValue);
						newState.getActivityNode_heldTokens_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.Input object
				 */
				if (o instanceof activitydiagram.Input) {

					activitydiagram.Input o_cast = (activitydiagram.Input) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedInput tracedObject = (activitydiagramTrace.States.activitydiagram.TracedInput) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Input_inputValues_Value> localTrace15 = tracedObject
							.getInputValuesSequence();
					activitydiagramTrace.States.Input_inputValues_Value previousValue15 = null;
					if (!localTrace15.isEmpty())
						previousValue15 = localTrace15.get(localTrace15.size() - 1);

					for (activitydiagram.InputValue aValue : o_cast.getInputValues()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange15 = true;
					if (previousValue15 != null) {

						if (previousValue15.getInputValues().size() == o_cast.getInputValues().size()) {

							java.util.Iterator<activitydiagram.InputValue> it = o_cast.getInputValues().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedInputValue aPreviousValue : previousValue15
									.getInputValues()) {
								activitydiagram.InputValue aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange15 = false;
									break;
								}
							}

						} else {
							noChange15 = false;
						}
					} else {
						noChange15 = false;
					}

					if (noChange15) {
						newState.getInput_inputValues_Values().add(previousValue15);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Input_inputValues_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createInput_inputValues_Value();

						newValue.getInputValues()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedInputValue>) getExeToTraced(o_cast
										.getInputValues()));

						tracedObject.getInputValuesSequence().add(newValue);
						newState.getInput_inputValues_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.ForkedToken object
				 */
				if (o instanceof activitydiagram.ForkedToken) {

					activitydiagram.ForkedToken o_cast = (activitydiagram.ForkedToken) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedForkedToken tracedObject = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value> localTrace16 = tracedObject
							.getRemainingOffersCountSequence();
					activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value previousValue16 = null;
					if (!localTrace16.isEmpty())
						previousValue16 = localTrace16.get(localTrace16.size() - 1);

					int content9 = o_cast.getRemainingOffersCount();

					boolean noChange16 = previousValue16 != null
							&& previousValue16.getRemainingOffersCount() == content9;

					if (noChange16) {
						newState.getForkedToken_remainingOffersCount_Values().add(previousValue16);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createForkedToken_remainingOffersCount_Value();

						newValue.setRemainingOffersCount(content9);

						tracedObject.getRemainingOffersCountSequence().add(newValue);
						newState.getForkedToken_remainingOffersCount_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ForkedToken_baseToken_Value> localTrace17 = tracedObject
							.getBaseTokenSequence();
					activitydiagramTrace.States.ForkedToken_baseToken_Value previousValue17 = null;
					if (!localTrace17.isEmpty())
						previousValue17 = localTrace17.get(localTrace17.size() - 1);

					storeAsTracedObject(o_cast.getBaseToken());

					activitydiagramTrace.States.activitydiagram.TracedToken content10 = null;
					if (o_cast.getBaseToken() != null)
						content10 = ((activitydiagramTrace.States.activitydiagram.TracedToken) exeToTraced.get(o_cast
								.getBaseToken()));

					boolean noChange17 = previousValue17 != null && previousValue17.getBaseToken() == content10;

					if (noChange17) {
						newState.getForkedToken_baseToken_Values().add(previousValue17);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ForkedToken_baseToken_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createForkedToken_baseToken_Value();

						newValue.setBaseToken(content10);

						tracedObject.getBaseTokenSequence().add(newValue);
						newState.getForkedToken_baseToken_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Token_holder_Value> localTrace18 = tracedObject
							.getHolderSequence();
					activitydiagramTrace.States.Token_holder_Value previousValue18 = null;
					if (!localTrace18.isEmpty())
						previousValue18 = localTrace18.get(localTrace18.size() - 1);

					storeAsTracedObject(o_cast.getHolder());

					activitydiagramTrace.States.activitydiagram.TracedActivityNode content11 = null;
					if (o_cast.getHolder() != null)
						content11 = ((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast.getHolder()));

					boolean noChange18 = previousValue18 != null && previousValue18.getHolder() == content11;

					if (noChange18) {
						newState.getToken_holder_Values().add(previousValue18);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Token_holder_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createToken_holder_Value();

						newValue.setHolder(content11);

						tracedObject.getHolderSequence().add(newValue);
						newState.getToken_holder_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.Offer object
				 */
				if (o instanceof activitydiagram.Offer) {

					activitydiagram.Offer o_cast = (activitydiagram.Offer) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedOffer tracedObject = (activitydiagramTrace.States.activitydiagram.TracedOffer) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Offer_offeredTokens_Value> localTrace19 = tracedObject
							.getOfferedTokensSequence();
					activitydiagramTrace.States.Offer_offeredTokens_Value previousValue19 = null;
					if (!localTrace19.isEmpty())
						previousValue19 = localTrace19.get(localTrace19.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getOfferedTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange19 = true;
					if (previousValue19 != null) {

						if (previousValue19.getOfferedTokens().size() == o_cast.getOfferedTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getOfferedTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue19
									.getOfferedTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
						newState.getOffer_offeredTokens_Values().add(previousValue19);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Offer_offeredTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createOffer_offeredTokens_Value();

						newValue.getOfferedTokens()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(o_cast
										.getOfferedTokens()));

						tracedObject.getOfferedTokensSequence().add(newValue);
						newState.getOffer_offeredTokens_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.OpaqueAction object
				 */
				if (o instanceof activitydiagram.OpaqueAction) {

					activitydiagram.OpaqueAction o_cast = (activitydiagram.OpaqueAction) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedOpaqueAction tracedObject = (activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> localTrace20 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue20 = null;
					if (!localTrace20.isEmpty())
						previousValue20 = localTrace20.get(localTrace20.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange20 = true;
					if (previousValue20 != null) {

						if (previousValue20.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue20
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange20 = false;
									break;
								}
							}

						} else {
							noChange20 = false;
						}
					} else {
						noChange20 = false;
					}

					if (noChange20) {
						newState.getActivityNode_heldTokens_Values().add(previousValue20);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_heldTokens_Value();

						newValue.getHeldTokens()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(o_cast
										.getHeldTokens()));

						tracedObject.getHeldTokensSequence().add(newValue);
						newState.getActivityNode_heldTokens_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.ActivityFinalNode object
				 */
				if (o instanceof activitydiagram.ActivityFinalNode) {

					activitydiagram.ActivityFinalNode o_cast = (activitydiagram.ActivityFinalNode) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> localTrace21 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue21 = null;
					if (!localTrace21.isEmpty())
						previousValue21 = localTrace21.get(localTrace21.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange21 = true;
					if (previousValue21 != null) {

						if (previousValue21.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue21
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
						newState.getActivityNode_heldTokens_Values().add(previousValue21);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_heldTokens_Value();

						newValue.getHeldTokens()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(o_cast
										.getHeldTokens()));

						tracedObject.getHeldTokensSequence().add(newValue);
						newState.getActivityNode_heldTokens_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.InitialNode object
				 */
				if (o instanceof activitydiagram.InitialNode) {

					activitydiagram.InitialNode o_cast = (activitydiagram.InitialNode) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedInitialNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedInitialNode) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> localTrace22 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue22 = null;
					if (!localTrace22.isEmpty())
						previousValue22 = localTrace22.get(localTrace22.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange22 = true;
					if (previousValue22 != null) {

						if (previousValue22.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue22
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange22 = false;
									break;
								}
							}

						} else {
							noChange22 = false;
						}
					} else {
						noChange22 = false;
					}

					if (noChange22) {
						newState.getActivityNode_heldTokens_Values().add(previousValue22);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_heldTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_heldTokens_Value();

						newValue.getHeldTokens()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedToken>) getExeToTraced(o_cast
										.getHeldTokens()));

						tracedObject.getHeldTokensSequence().add(newValue);
						newState.getActivityNode_heldTokens_Values().add(newValue);
					}

				}
			}

		boolean createNewState = lastState == null || (!onlyIfChange || changed);
		if (createNewState) {
			lastState = newState;
			traceRoot.getStatesTrace().add(lastState);
		}

		// Undoing the new state created for nothing
		else {

			newState.getStartedSteps().clear();
			newState.getEndedSteps().clear();

			newState.getInput_inputValues_Values().clear();
			newState.getActivity_trace_Values().clear();
			newState.getIntegerValue_value_Values().clear();
			newState.getVariable_currentValue_Values().clear();
			newState.getTrace_executedNodes_Values().clear();
			newState.getActivityNode_heldTokens_Values().clear();
			newState.getInputValue_variable_Values().clear();
			newState.getInputValue_value_Values().clear();
			newState.getToken_holder_Values().clear();
			newState.getOffer_offeredTokens_Values().clear();
			newState.getForkedToken_remainingOffersCount_Values().clear();
			newState.getForkedToken_baseToken_Values().clear();
			newState.getActivityEdge_offers_Values().clear();
			newState.getBooleanValue_value_Values().clear();
		}

		return createNewState;

	}

	@Override
	public void retroAddStep(String stepRule, Map<String, Object> params) {
		addStep(stepRule, params, this.getTraceSize() - 2);

	}

	@Override
	public void addStep(String stepRule, Map<String, Object> params) {
		addStep(stepRule, params, this.getTraceSize() - 1);
	}

	private void addStep(String stepRule, Map<String, Object> params, int stateIndex) {

		activitydiagramTrace.Steps.Step toPush = null;

		if (stateIndex >= 0) {

			activitydiagramTrace.States.State state = this.traceRoot.getStatesTrace().get(stateIndex);

			if (stepRule.equalsIgnoreCase("activitydiagram.Activity.initializeContext")) {

				// First we create the step
				activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext activitydiagram_Activity_InitializeContextInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Activity_InitializeContext();
				activitydiagram_Activity_InitializeContextInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", activitydiagram_Activity_InitializeContextInstance);
				} else {
					traceRoot.getRootSteps().add(activitydiagram_Activity_InitializeContextInstance);
				}
				toPush = activitydiagram_Activity_InitializeContextInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v0 = params.get(k);
							if (v0 instanceof activitydiagram.Activity)
								activitydiagram_Activity_InitializeContextInstance
										.setThis((activitydiagram.Activity) v0);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_Activity_InitializeContext_Sequence().add(
						activitydiagram_Activity_InitializeContextInstance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.ActivityNode.addTokens1")) {

				// First we create the step
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1 activitydiagram_ActivityNode_AddTokens1Instance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_AddTokens1();
				activitydiagram_ActivityNode_AddTokens1Instance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", activitydiagram_ActivityNode_AddTokens1Instance);
				} else {
					traceRoot.getRootSteps().add(activitydiagram_ActivityNode_AddTokens1Instance);
				}
				toPush = activitydiagram_ActivityNode_AddTokens1Instance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v1 = params.get(k);
							if (v1 instanceof activitydiagram.ActivityNode)
								activitydiagram_ActivityNode_AddTokens1Instance
										.setThis((activitydiagram.ActivityNode) v1);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_ActivityNode_AddTokens1_Sequence().add(
						activitydiagram_ActivityNode_AddTokens1Instance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.ActivityNode.sendOffers1")) {

				// First we create the step
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1 activitydiagram_ActivityNode_SendOffers1Instance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_SendOffers1();
				activitydiagram_ActivityNode_SendOffers1Instance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", activitydiagram_ActivityNode_SendOffers1Instance);
				} else {
					traceRoot.getRootSteps().add(activitydiagram_ActivityNode_SendOffers1Instance);
				}
				toPush = activitydiagram_ActivityNode_SendOffers1Instance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v2 = params.get(k);
							if (v2 instanceof activitydiagram.ActivityNode)
								activitydiagram_ActivityNode_SendOffers1Instance
										.setThis((activitydiagram.ActivityNode) v2);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_ActivityNode_SendOffers1_Sequence().add(
						activitydiagram_ActivityNode_SendOffers1Instance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.Activity.writeTrace")) {

				// First we create the step
				activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace activitydiagram_Activity_WriteTraceInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Activity_WriteTrace();
				activitydiagram_Activity_WriteTraceInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", activitydiagram_Activity_WriteTraceInstance);
				} else {
					traceRoot.getRootSteps().add(activitydiagram_Activity_WriteTraceInstance);
				}
				toPush = activitydiagram_Activity_WriteTraceInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v3 = params.get(k);
							if (v3 instanceof activitydiagram.Activity)
								activitydiagram_Activity_WriteTraceInstance.setThis((activitydiagram.Activity) v3);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_Activity_WriteTrace_Sequence().add(
						activitydiagram_Activity_WriteTraceInstance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.Activity.reset")) {

				// First we create the step
				activitydiagramTrace.Steps.Activitydiagram_Activity_Reset activitydiagram_Activity_ResetInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Activity_Reset();
				activitydiagram_Activity_ResetInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", activitydiagram_Activity_ResetInstance);
				} else {
					traceRoot.getRootSteps().add(activitydiagram_Activity_ResetInstance);
				}
				toPush = activitydiagram_Activity_ResetInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v4 = params.get(k);
							if (v4 instanceof activitydiagram.Activity)
								activitydiagram_Activity_ResetInstance.setThis((activitydiagram.Activity) v4);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_Activity_Reset_Sequence().add(activitydiagram_Activity_ResetInstance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.ActivityNode.takeOfferdTokens1")) {

				// First we create the step
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1 activitydiagram_ActivityNode_TakeOfferdTokens1Instance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_TakeOfferdTokens1();
				activitydiagram_ActivityNode_TakeOfferdTokens1Instance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", activitydiagram_ActivityNode_TakeOfferdTokens1Instance);
				} else {
					traceRoot.getRootSteps().add(activitydiagram_ActivityNode_TakeOfferdTokens1Instance);
				}
				toPush = activitydiagram_ActivityNode_TakeOfferdTokens1Instance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v5 = params.get(k);
							if (v5 instanceof activitydiagram.ActivityNode)
								activitydiagram_ActivityNode_TakeOfferdTokens1Instance
										.setThis((activitydiagram.ActivityNode) v5);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence().add(
						activitydiagram_ActivityNode_TakeOfferdTokens1Instance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.ActivityNode.removeToken1")) {

				// First we create the step
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1 activitydiagram_ActivityNode_RemoveToken1Instance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_RemoveToken1();
				activitydiagram_ActivityNode_RemoveToken1Instance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", activitydiagram_ActivityNode_RemoveToken1Instance);
				} else {
					traceRoot.getRootSteps().add(activitydiagram_ActivityNode_RemoveToken1Instance);
				}
				toPush = activitydiagram_ActivityNode_RemoveToken1Instance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v6 = params.get(k);
							if (v6 instanceof activitydiagram.ActivityNode)
								activitydiagram_ActivityNode_RemoveToken1Instance
										.setThis((activitydiagram.ActivityNode) v6);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_ActivityNode_RemoveToken1_Sequence().add(
						activitydiagram_ActivityNode_RemoveToken1Instance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.ActivityNode.terminate")) {

				// First we create the step
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate activitydiagram_ActivityNode_TerminateInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_Terminate();
				activitydiagram_ActivityNode_TerminateInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", activitydiagram_ActivityNode_TerminateInstance);
				} else {
					traceRoot.getRootSteps().add(activitydiagram_ActivityNode_TerminateInstance);
				}
				toPush = activitydiagram_ActivityNode_TerminateInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v7 = params.get(k);
							if (v7 instanceof activitydiagram.ActivityNode)
								activitydiagram_ActivityNode_TerminateInstance
										.setThis((activitydiagram.ActivityNode) v7);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_ActivityNode_Terminate_Sequence().add(
						activitydiagram_ActivityNode_TerminateInstance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.Activity.execute")) {

				// First we create the step
				activitydiagramTrace.Steps.Activitydiagram_Activity_Execute activitydiagram_Activity_ExecuteInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Activity_Execute();
				activitydiagram_Activity_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", activitydiagram_Activity_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(activitydiagram_Activity_ExecuteInstance);
				}
				toPush = activitydiagram_Activity_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v8 = params.get(k);
							if (v8 instanceof activitydiagram.Activity)
								activitydiagram_Activity_ExecuteInstance.setThis((activitydiagram.Activity) v8);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_Activity_Execute_Sequence().add(
						activitydiagram_Activity_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.Variable.init")) {

				// First we create the step
				activitydiagramTrace.Steps.Activitydiagram_Variable_Init activitydiagram_Variable_InitInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Variable_Init();
				activitydiagram_Variable_InitInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", activitydiagram_Variable_InitInstance);
				} else {
					traceRoot.getRootSteps().add(activitydiagram_Variable_InitInstance);
				}
				toPush = activitydiagram_Variable_InitInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v9 = params.get(k);
							if (v9 instanceof activitydiagram.Variable)
								activitydiagram_Variable_InitInstance.setThis((activitydiagram.Variable) v9);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_Variable_Init_Sequence().add(activitydiagram_Variable_InitInstance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.ActivityNode.execute")) {

				// First we create the step
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute activitydiagram_ActivityNode_ExecuteInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_ActivityNode_Execute();
				activitydiagram_ActivityNode_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", activitydiagram_ActivityNode_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(activitydiagram_ActivityNode_ExecuteInstance);
				}
				toPush = activitydiagram_ActivityNode_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v10 = params.get(k);
							if (v10 instanceof activitydiagram.ActivityNode)
								activitydiagram_ActivityNode_ExecuteInstance
										.setThis((activitydiagram.ActivityNode) v10);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_ActivityNode_Execute_Sequence().add(
						activitydiagram_ActivityNode_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.Variable.execute")) {

				// First we create the step
				activitydiagramTrace.Steps.Activitydiagram_Variable_Execute activitydiagram_Variable_ExecuteInstance = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
						.createActivitydiagram_Variable_Execute();
				activitydiagram_Variable_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", activitydiagram_Variable_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(activitydiagram_Variable_ExecuteInstance);
				}
				toPush = activitydiagram_Variable_ExecuteInstance;
				if (params != null) {
					for (String k : params.keySet()) {

						switch (k) {
						case "this":
							Object v11 = params.get(k);
							if (v11 instanceof activitydiagram.Variable)
								activitydiagram_Variable_ExecuteInstance.setThis((activitydiagram.Variable) v11);

							break;

						}
					}
				}

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_Variable_Execute_Sequence().add(
						activitydiagram_Variable_ExecuteInstance);
			}
		}

		context.push(toPush);

	}

	@Override
	public void endStep(String stepRule, Object returnValue) {
		activitydiagramTrace.Steps.Step popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void goTo(EObject state) {

		if (state instanceof activitydiagramTrace.States.State) {
			activitydiagramTrace.States.State stateToGo = (activitydiagramTrace.States.State) state;

			for (activitydiagramTrace.States.Input_inputValues_Value value : stateToGo.getInput_inputValues_Values()) {

				activitydiagram.Input exeObject = (activitydiagram.Input) getTracedToExe(value.getParent());
				exeObject.getInputValues().clear();
				exeObject.getInputValues().addAll(
						(Collection<? extends activitydiagram.InputValue>) getTracedToExe(value.getInputValues()));

			}

			for (activitydiagramTrace.States.Activity_trace_Value value : stateToGo.getActivity_trace_Values()) {

				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedActivity) {
					activitydiagramTrace.States.activitydiagram.TracedActivity parent_cast = (activitydiagramTrace.States.activitydiagram.TracedActivity) value
							.getParent();
					activitydiagram.Trace toset = ((activitydiagram.Trace) getTracedToExe(value.getTrace()));
					activitydiagram.Trace current = ((activitydiagram.Activity) parent_cast.getOriginalObject())
							.getTrace();
					if (current != toset)
						((activitydiagram.Activity) parent_cast.getOriginalObject()).setTrace(toset);

				}

			}

			for (activitydiagramTrace.States.IntegerValue_value_Value value : stateToGo.getIntegerValue_value_Values()) {

				activitydiagram.IntegerValue exeObject = (activitydiagram.IntegerValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.getValue());

			}

			for (activitydiagramTrace.States.Variable_currentValue_Value value : stateToGo
					.getVariable_currentValue_Values()) {

				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) {
					activitydiagramTrace.States.activitydiagram.TracedBooleanVariable parent_cast = (activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) value
							.getParent();
					activitydiagram.Value toset = ((activitydiagram.Value) getTracedToExe(value.getCurrentValue()));
					activitydiagram.Value current = ((activitydiagram.Variable) parent_cast.getOriginalObject())
							.getCurrentValue();
					if (current != toset)
						((activitydiagram.Variable) parent_cast.getOriginalObject()).setCurrentValue(toset);

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) {
					activitydiagramTrace.States.activitydiagram.TracedIntegerVariable parent_cast = (activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) value
							.getParent();
					activitydiagram.Value toset = ((activitydiagram.Value) getTracedToExe(value.getCurrentValue()));
					activitydiagram.Value current = ((activitydiagram.Variable) parent_cast.getOriginalObject())
							.getCurrentValue();
					if (current != toset)
						((activitydiagram.Variable) parent_cast.getOriginalObject()).setCurrentValue(toset);

				}

			}

			for (activitydiagramTrace.States.Trace_executedNodes_Value value : stateToGo
					.getTrace_executedNodes_Values()) {

				activitydiagram.Trace exeObject = (activitydiagram.Trace) getTracedToExe(value.getParent());
				exeObject.getExecutedNodes().clear();
				exeObject.getExecutedNodes().addAll(
						(Collection<? extends activitydiagram.ActivityNode>) getTracedToExe(value.getExecutedNodes()));

			}

			for (activitydiagramTrace.States.ActivityNode_heldTokens_Value value : stateToGo
					.getActivityNode_heldTokens_Values()) {

				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedInitialNode) {
					activitydiagramTrace.States.activitydiagram.TracedInitialNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedInitialNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedForkNode) {
					activitydiagramTrace.States.activitydiagram.TracedForkNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedForkNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode) {
					activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedDecisionNode) {
					activitydiagramTrace.States.activitydiagram.TracedDecisionNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedDecisionNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedJoinNode) {
					activitydiagramTrace.States.activitydiagram.TracedJoinNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedJoinNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedMergeNode) {
					activitydiagramTrace.States.activitydiagram.TracedMergeNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedMergeNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) {
					activitydiagramTrace.States.activitydiagram.TracedOpaqueAction parent_cast = (activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast
							.getOriginalObject()
							.getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>) getTracedToExe(value.getHeldTokens()));

				}

			}

			for (activitydiagramTrace.States.InputValue_variable_Value value : stateToGo
					.getInputValue_variable_Values()) {

				activitydiagram.InputValue exeObject = (activitydiagram.InputValue) getTracedToExe(value.getParent());
				exeObject.setVariable(((activitydiagram.Variable) getTracedToExe(value.getVariable())));

			}

			for (activitydiagramTrace.States.InputValue_value_Value value : stateToGo.getInputValue_value_Values()) {

				activitydiagram.InputValue exeObject = (activitydiagram.InputValue) getTracedToExe(value.getParent());
				exeObject.setValue(((activitydiagram.Value) getTracedToExe(value.getValue())));

			}

			for (activitydiagramTrace.States.Token_holder_Value value : stateToGo.getToken_holder_Values()) {

				activitydiagram.Token exeObject = (activitydiagram.Token) getTracedToExe(value.getParent());
				exeObject.setHolder(((activitydiagram.ActivityNode) getTracedToExe(value.getHolder())));

			}

			for (activitydiagramTrace.States.Offer_offeredTokens_Value value : stateToGo
					.getOffer_offeredTokens_Values()) {

				activitydiagram.Offer exeObject = (activitydiagram.Offer) getTracedToExe(value.getParent());
				exeObject.getOfferedTokens().clear();
				exeObject.getOfferedTokens().addAll(
						(Collection<? extends activitydiagram.Token>) getTracedToExe(value.getOfferedTokens()));

			}

			for (activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value value : stateToGo
					.getForkedToken_remainingOffersCount_Values()) {

				activitydiagram.ForkedToken exeObject = (activitydiagram.ForkedToken) getTracedToExe(value.getParent());
				exeObject.setRemainingOffersCount(value.getRemainingOffersCount());

			}

			for (activitydiagramTrace.States.ForkedToken_baseToken_Value value : stateToGo
					.getForkedToken_baseToken_Values()) {

				activitydiagram.ForkedToken exeObject = (activitydiagram.ForkedToken) getTracedToExe(value.getParent());
				exeObject.setBaseToken(((activitydiagram.Token) getTracedToExe(value.getBaseToken())));

			}

			for (activitydiagramTrace.States.ActivityEdge_offers_Value value : stateToGo
					.getActivityEdge_offers_Values()) {

				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedControlFlow) {
					activitydiagramTrace.States.activitydiagram.TracedControlFlow parent_cast = (activitydiagramTrace.States.activitydiagram.TracedControlFlow) value
							.getParent();
					parent_cast.getOriginalObject().getOffers().clear();
					parent_cast.getOriginalObject().getOffers()
							.addAll((Collection<? extends activitydiagram.Offer>) getTracedToExe(value.getOffers()));

				}

			}

			for (activitydiagramTrace.States.BooleanValue_value_Value value : stateToGo.getBooleanValue_value_Values()) {

				activitydiagram.BooleanValue exeObject = (activitydiagram.BooleanValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.isValue());

			}

		} else {
			goToValue(state);
		}
	}

	@Override
	public void goTo(int stepNumber) {
		activitydiagramTrace.States.State stateToGo = traceRoot.getStatesTrace().get(stepNumber);
		goTo(stateToGo);
	}

	private void goToValue(EObject value) {
		Object states = emfGet(value, "states");
		if (states != null) {
			if (states instanceof List<?>) {
				// We get the first state in which this value existed
				Object state = ((List<?>) states).get(0);
				if (state instanceof activitydiagramTrace.States.State) {
					goTo((activitydiagramTrace.States.State) state);
				}
			}
		}
	}

	@Override
	public void initTrace() {
		// Create root
		this.traceRoot = activitydiagramTrace.ActivitydiagramTraceFactory.eINSTANCE.createTrace();

		// Put in the resource
		traceResource.getContents().add(traceRoot);

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
	public String getDescriptionOfExecutionState(int index) {
		StringBuilder result = new StringBuilder();
		activitydiagramTrace.States.State gs = traceRoot.getStatesTrace().get(index);

		if (!gs.getInput_inputValues_Values().isEmpty())
			result.append("\nInputValues values:");
		for (activitydiagramTrace.States.Input_inputValues_Value currenState : gs.getInput_inputValues_Values()) {
			result.append("\n\t" + currenState.getInputValues());
		}

		if (!gs.getActivity_trace_Values().isEmpty())
			result.append("\nTrace values:");
		for (activitydiagramTrace.States.Activity_trace_Value currenState : gs.getActivity_trace_Values()) {
			result.append("\n\t" + currenState.getTrace());
		}

		if (!gs.getIntegerValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (activitydiagramTrace.States.IntegerValue_value_Value currenState : gs.getIntegerValue_value_Values()) {
			result.append("\n\t" + currenState.getValue());
		}

		if (!gs.getVariable_currentValue_Values().isEmpty())
			result.append("\nCurrentValue values:");
		for (activitydiagramTrace.States.Variable_currentValue_Value currenState : gs.getVariable_currentValue_Values()) {
			result.append("\n\t" + currenState.getCurrentValue());
		}

		if (!gs.getTrace_executedNodes_Values().isEmpty())
			result.append("\nExecutedNodes values:");
		for (activitydiagramTrace.States.Trace_executedNodes_Value currenState : gs.getTrace_executedNodes_Values()) {
			result.append("\n\t" + currenState.getExecutedNodes());
		}

		if (!gs.getActivityNode_heldTokens_Values().isEmpty())
			result.append("\nHeldTokens values:");
		for (activitydiagramTrace.States.ActivityNode_heldTokens_Value currenState : gs
				.getActivityNode_heldTokens_Values()) {
			result.append("\n\t" + currenState.getHeldTokens());
		}

		if (!gs.getInputValue_variable_Values().isEmpty())
			result.append("\nVariable values:");
		for (activitydiagramTrace.States.InputValue_variable_Value currenState : gs.getInputValue_variable_Values()) {
			result.append("\n\t" + currenState.getVariable());
		}

		if (!gs.getInputValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (activitydiagramTrace.States.InputValue_value_Value currenState : gs.getInputValue_value_Values()) {
			result.append("\n\t" + currenState.getValue());
		}

		if (!gs.getToken_holder_Values().isEmpty())
			result.append("\nHolder values:");
		for (activitydiagramTrace.States.Token_holder_Value currenState : gs.getToken_holder_Values()) {
			result.append("\n\t" + currenState.getHolder());
		}

		if (!gs.getOffer_offeredTokens_Values().isEmpty())
			result.append("\nOfferedTokens values:");
		for (activitydiagramTrace.States.Offer_offeredTokens_Value currenState : gs.getOffer_offeredTokens_Values()) {
			result.append("\n\t" + currenState.getOfferedTokens());
		}

		if (!gs.getForkedToken_remainingOffersCount_Values().isEmpty())
			result.append("\nRemainingOffersCount values:");
		for (activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value currenState : gs
				.getForkedToken_remainingOffersCount_Values()) {
			result.append("\n\t" + currenState.getRemainingOffersCount());
		}

		if (!gs.getForkedToken_baseToken_Values().isEmpty())
			result.append("\nBaseToken values:");
		for (activitydiagramTrace.States.ForkedToken_baseToken_Value currenState : gs.getForkedToken_baseToken_Values()) {
			result.append("\n\t" + currenState.getBaseToken());
		}

		if (!gs.getActivityEdge_offers_Values().isEmpty())
			result.append("\nOffers values:");
		for (activitydiagramTrace.States.ActivityEdge_offers_Value currenState : gs.getActivityEdge_offers_Values()) {
			result.append("\n\t" + currenState.getOffers());
		}

		if (!gs.getBooleanValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (activitydiagramTrace.States.BooleanValue_value_Value currenState : gs.getBooleanValue_value_Values()) {
			result.append("\n\t" + currenState.isValue());
		}

		if (!gs.getStartedSteps().isEmpty()) {
			result.append("\n\nStarting steps: ");
			for (activitydiagramTrace.Steps.Step m : gs.getStartedSteps()) {
				result.append("\n\t" + m.eClass().getName());
				if (m.getEndingState() != null) {
					result.append(" (ends at state " + traceRoot.getStatesTrace().indexOf(m.getEndingState()) + ")");
				}
			}
		}

		result.deleteCharAt(0);
		return result.toString();
	}

	@Override
	public String getDescriptionOfValue(EObject eObject) {
		if (eObject instanceof activitydiagramTrace.States.Input_inputValues_Value) {
			return "activitydiagramTrace.States.Input_inputValues_Value: "
					+ ((activitydiagramTrace.States.Input_inputValues_Value) eObject).getInputValues();
		} else if (eObject instanceof activitydiagramTrace.States.Activity_trace_Value) {
			return "activitydiagramTrace.States.Activity_trace_Value: "
					+ ((activitydiagramTrace.States.Activity_trace_Value) eObject).getTrace();
		} else if (eObject instanceof activitydiagramTrace.States.IntegerValue_value_Value) {
			return "activitydiagramTrace.States.IntegerValue_value_Value: "
					+ ((activitydiagramTrace.States.IntegerValue_value_Value) eObject).getValue();
		} else if (eObject instanceof activitydiagramTrace.States.Variable_currentValue_Value) {
			return "activitydiagramTrace.States.Variable_currentValue_Value: "
					+ ((activitydiagramTrace.States.Variable_currentValue_Value) eObject).getCurrentValue();
		} else if (eObject instanceof activitydiagramTrace.States.Trace_executedNodes_Value) {
			return "activitydiagramTrace.States.Trace_executedNodes_Value: "
					+ ((activitydiagramTrace.States.Trace_executedNodes_Value) eObject).getExecutedNodes();
		} else if (eObject instanceof activitydiagramTrace.States.ActivityNode_heldTokens_Value) {
			return "activitydiagramTrace.States.ActivityNode_heldTokens_Value: "
					+ ((activitydiagramTrace.States.ActivityNode_heldTokens_Value) eObject).getHeldTokens();
		} else if (eObject instanceof activitydiagramTrace.States.InputValue_variable_Value) {
			return "activitydiagramTrace.States.InputValue_variable_Value: "
					+ ((activitydiagramTrace.States.InputValue_variable_Value) eObject).getVariable();
		} else if (eObject instanceof activitydiagramTrace.States.InputValue_value_Value) {
			return "activitydiagramTrace.States.InputValue_value_Value: "
					+ ((activitydiagramTrace.States.InputValue_value_Value) eObject).getValue();
		} else if (eObject instanceof activitydiagramTrace.States.Token_holder_Value) {
			return "activitydiagramTrace.States.Token_holder_Value: "
					+ ((activitydiagramTrace.States.Token_holder_Value) eObject).getHolder();
		} else if (eObject instanceof activitydiagramTrace.States.Offer_offeredTokens_Value) {
			return "activitydiagramTrace.States.Offer_offeredTokens_Value: "
					+ ((activitydiagramTrace.States.Offer_offeredTokens_Value) eObject).getOfferedTokens();
		} else if (eObject instanceof activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value) {
			return "activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value: "
					+ ((activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value) eObject)
							.getRemainingOffersCount();
		} else if (eObject instanceof activitydiagramTrace.States.ForkedToken_baseToken_Value) {
			return "activitydiagramTrace.States.ForkedToken_baseToken_Value: "
					+ ((activitydiagramTrace.States.ForkedToken_baseToken_Value) eObject).getBaseToken();
		} else if (eObject instanceof activitydiagramTrace.States.ActivityEdge_offers_Value) {
			return "activitydiagramTrace.States.ActivityEdge_offers_Value: "
					+ ((activitydiagramTrace.States.ActivityEdge_offers_Value) eObject).getOffers();
		} else if (eObject instanceof activitydiagramTrace.States.BooleanValue_value_Value) {
			return "activitydiagramTrace.States.BooleanValue_value_Value: "
					+ ((activitydiagramTrace.States.BooleanValue_value_Value) eObject).isValue();
		} else
			return "ERROR";
	}

	private void storeAsTracedObject(activitydiagram.InitialNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedInitialNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInitialNode();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedInitialNodes().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.ActivityFinalNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedActivityFinalNode();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedActivityFinalNodes().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.OpaqueAction o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedOpaqueAction tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedOpaqueAction();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedOpaqueActions().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.Offer o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedOffer tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedOffer();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedOffers().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getOfferedTokensSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.ForkedToken o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedForkedToken tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedForkedToken();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedForkedTokens().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getRemainingOffersCountSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getBaseTokenSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getHolderSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.Input o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedInput tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInput();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedInputs().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getInputValuesSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.ForkNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedForkNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedForkNode();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedForkNodes().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.IntegerVariable o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedIntegerVariable tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerVariable();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedIntegerVariables().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getCurrentValueSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.Activity o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedActivity tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedActivity();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedActivitys().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getTraceSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.MergeNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedMergeNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedMergeNode();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedMergeNodes().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.DecisionNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedDecisionNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedDecisionNode();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedDecisionNodes().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.JoinNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedJoinNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedJoinNode();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedJoinNodes().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.BooleanValue o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedBooleanValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanValue();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedBooleanValues().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.BooleanVariable o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedBooleanVariable tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanVariable();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedBooleanVariables().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getCurrentValueSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.IntegerValue o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedIntegerValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerValue();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedIntegerValues().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.ControlFlow o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedControlFlow tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedControlFlow();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedControlFlows().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getOffersSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.Trace o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedTrace tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedTrace();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedTraces().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getExecutedNodesSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.InputValue o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedInputValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInputValue();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedInputValues().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getVariableSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getValueSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.ControlToken o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedControlToken tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedControlToken();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedControlTokens().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getHolderSequence(), this));
		}
	}

	private void storeAsTracedObject(EObject o) {

		if (o instanceof activitydiagram.ControlToken)
			storeAsTracedObject((activitydiagram.ControlToken) o);
		else

		if (o instanceof activitydiagram.InputValue)
			storeAsTracedObject((activitydiagram.InputValue) o);
		else

		if (o instanceof activitydiagram.Trace)
			storeAsTracedObject((activitydiagram.Trace) o);
		else

		if (o instanceof activitydiagram.ControlFlow)
			storeAsTracedObject((activitydiagram.ControlFlow) o);
		else

		if (o instanceof activitydiagram.IntegerValue)
			storeAsTracedObject((activitydiagram.IntegerValue) o);
		else

		if (o instanceof activitydiagram.BooleanVariable)
			storeAsTracedObject((activitydiagram.BooleanVariable) o);
		else

		if (o instanceof activitydiagram.BooleanValue)
			storeAsTracedObject((activitydiagram.BooleanValue) o);
		else

		if (o instanceof activitydiagram.JoinNode)
			storeAsTracedObject((activitydiagram.JoinNode) o);
		else

		if (o instanceof activitydiagram.DecisionNode)
			storeAsTracedObject((activitydiagram.DecisionNode) o);
		else

		if (o instanceof activitydiagram.MergeNode)
			storeAsTracedObject((activitydiagram.MergeNode) o);
		else

		if (o instanceof activitydiagram.Activity)
			storeAsTracedObject((activitydiagram.Activity) o);
		else

		if (o instanceof activitydiagram.IntegerVariable)
			storeAsTracedObject((activitydiagram.IntegerVariable) o);
		else

		if (o instanceof activitydiagram.ForkNode)
			storeAsTracedObject((activitydiagram.ForkNode) o);
		else

		if (o instanceof activitydiagram.Input)
			storeAsTracedObject((activitydiagram.Input) o);
		else

		if (o instanceof activitydiagram.ForkedToken)
			storeAsTracedObject((activitydiagram.ForkedToken) o);
		else

		if (o instanceof activitydiagram.Offer)
			storeAsTracedObject((activitydiagram.Offer) o);
		else

		if (o instanceof activitydiagram.OpaqueAction)
			storeAsTracedObject((activitydiagram.OpaqueAction) o);
		else

		if (o instanceof activitydiagram.ActivityFinalNode)
			storeAsTracedObject((activitydiagram.ActivityFinalNode) o);
		else

		if (o instanceof activitydiagram.InitialNode)
			storeAsTracedObject((activitydiagram.InitialNode) o);

	}

	private Collection<? extends EObject> getExeToTraced(Collection<? extends EObject> exeObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject exeObject : exeObjects) {
			storeAsTracedObject(exeObject);
			result.add(exeToTraced.get(exeObject));
		}
		return result;
	}

	private Collection<? extends EObject> getTracedToExe(Collection<? extends EObject> tracedObjects) {
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

	@SuppressWarnings("unchecked")
	private static void emfAdd(EObject o, String property, Object value) {
		for (EReference r : o.eClass().getEAllReferences()) {
			if (r.getName().equalsIgnoreCase(property)) {
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
			if (r.getName().equalsIgnoreCase(property)) {
				return o.eGet(r);
			}
		}
		return null;
	}

	@Override
	public EObject getExecutionState(int index) {
		return traceRoot.getStatesTrace().get(index);
	}

	@Override
	public int getTraceSize() {
		return traceRoot.getStatesTrace().size();
	}

	@Override
	public int getNumberOfValueTraces() {
		return getAllValueTraces().size();
	}

	@Override
	public Set<EObject> getAllCurrentValues(int stateIndex) {
		activitydiagramTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);
		// We find all current values
		Set<EObject> currentValues = new HashSet<EObject>();
		if (currentState != null) {
			currentValues.addAll(currentState.getInput_inputValues_Values());
			currentValues.addAll(currentState.getActivity_trace_Values());
			currentValues.addAll(currentState.getIntegerValue_value_Values());
			currentValues.addAll(currentState.getVariable_currentValue_Values());
			currentValues.addAll(currentState.getTrace_executedNodes_Values());
			currentValues.addAll(currentState.getActivityNode_heldTokens_Values());
			currentValues.addAll(currentState.getInputValue_variable_Values());
			currentValues.addAll(currentState.getInputValue_value_Values());
			currentValues.addAll(currentState.getToken_holder_Values());
			currentValues.addAll(currentState.getOffer_offeredTokens_Values());
			currentValues.addAll(currentState.getForkedToken_remainingOffersCount_Values());
			currentValues.addAll(currentState.getForkedToken_baseToken_Values());
			currentValues.addAll(currentState.getActivityEdge_offers_Values());
			currentValues.addAll(currentState.getBooleanValue_value_Values());
		}
		return currentValues;
	}

	public List<IValueTrace> getAllValueTraces() {
		return traces;
	}

	@Override
	public int getStateIndex(EObject state) {
		return traceRoot.getStatesTrace().indexOf(state);
	}

	@Override
	public boolean isBigStep(String string) {
		return bigSteps.contains(string);
	}

	@Override
	public String currentBigStep() {
		if (!context.isEmpty() && context.getFirst() != null)
			return context.getFirst().eClass().getName();
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<fr.inria.diverse.trace.api.IStep> getStackForwardAfterState(int stateIndex) {
		List<fr.inria.diverse.trace.api.IStep> result = new ArrayList<fr.inria.diverse.trace.api.IStep>();
		activitydiagramTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);

		// We start at the top of the forward stack, and we go downward
		activitydiagramTrace.Steps.Step itStep = currentState.getStartedSteps().get(0);
		while (itStep != null) {
			activitydiagramTrace.Steps.Step itStep_prev = itStep;
			if (itStep instanceof activitydiagramTrace.Steps.Step) {
				result.add(createGenericStep((activitydiagramTrace.Steps.Step) itStep));
				List<activitydiagramTrace.Steps.Step> subSteps = (List<activitydiagramTrace.Steps.Step>) emfGet(itStep,
						"subSteps");
				if (subSteps != null) {
					itStep = subSteps.get(0);
				}
			}

			// If we didn't find anything new, we stop
			if (itStep == itStep_prev)
				itStep = null;
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<fr.inria.diverse.trace.api.IStep> getStackBackward(int stateIndex) {
		List<fr.inria.diverse.trace.api.IStep> result = new ArrayList<fr.inria.diverse.trace.api.IStep>();
		activitydiagramTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);

		// We start at the top of the backward stack, and we go downward
		activitydiagramTrace.Steps.Step itStep = currentState.getEndedSteps().get(0);
		while (itStep != null) {
			activitydiagramTrace.Steps.Step itStep_prev = itStep;
			if (itStep instanceof activitydiagramTrace.Steps.Step) {
				result.add(createGenericStep((activitydiagramTrace.Steps.Step) itStep));
				List<activitydiagramTrace.Steps.Step> subSteps = (List<activitydiagramTrace.Steps.Step>) emfGet(itStep,
						"subSteps");
				if (subSteps != null) {
					itStep = subSteps.get(subSteps.size() - 1);
				}
			}

			// If we didn't find anything new, we stop
			if (itStep == itStep_prev)
				itStep = null;
		}
		return result;
	}

	@Override
	public List<fr.inria.diverse.trace.api.IStep> getStackForwardBeforeState(int stateIndex) {
		LinkedList<fr.inria.diverse.trace.api.IStep> result = new LinkedList<fr.inria.diverse.trace.api.IStep>();
		activitydiagramTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);

		activitydiagramTrace.Steps.Step endedStep = currentState.getEndedSteps().get(0);
		if (endedStep.getStartingState() != currentState) {
			result.addFirst(createGenericStep(endedStep));
		}
		EObject itStep = currentState.getStartedSteps().get(0).eContainer();
		while (itStep != null) {
			if (itStep instanceof activitydiagramTrace.Steps.Step) {
				activitydiagramTrace.Steps.Step step = (activitydiagramTrace.Steps.Step) itStep;
				if (step.getStartingState() != currentState) {
					result.addFirst(createGenericStep(step));
				}
				itStep = itStep.eContainer();
			} else {
				itStep = null;
			}
		}
		return result;
	}

	@Override
	public List<fr.inria.diverse.trace.api.IStep.StepEvent> getEventsForState(int stateIndex) {
		final Map<activitydiagramTrace.Steps.Step, fr.inria.diverse.trace.api.IStep> step2IStep = new HashMap<>();
	
		final activitydiagramTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);
	
		final List<fr.inria.diverse.trace.api.IStep> endedSteps = currentState.getEndedSteps().stream().map(s -> {
			return step2IStep.computeIfAbsent(s, k -> createGenericStep(k));
		}).collect(Collectors.toList());
	
		final List<fr.inria.diverse.trace.api.IStep> startedSteps = currentState.getStartedSteps().stream().map(s -> {
			return step2IStep.computeIfAbsent(s, k -> createGenericStep(k));
		}).collect(Collectors.toList());
	
		final List<fr.inria.diverse.trace.api.IStep.StepEvent> events = new ArrayList<>();
		final LinkedList<fr.inria.diverse.trace.api.IStep> virtualStack = new LinkedList<>();
	
		final Iterator<fr.inria.diverse.trace.api.IStep> itEnding = endedSteps.iterator();
		final Iterator<fr.inria.diverse.trace.api.IStep> itStarting = startedSteps.iterator();
	
		while (itEnding.hasNext()) {
			// As long as we have ending steps
			final fr.inria.diverse.trace.api.IStep endedIStep = itEnding.next();
			if (endedIStep.getStartingIndex() != stateIndex) {
				events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(endedIStep, false));
			} else {
				if (virtualStack.peek() == endedIStep) {
					// A start event on this step has already been treated,
					// we thus can treat this end event.
					events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(endedIStep, false));
					virtualStack.pop();
				} else {
					while (virtualStack.peek() != endedIStep && itStarting.hasNext()) {
						// Pushing steps that start onto the stack until we pushed the one
						// we are trying to pop or we run out of steps.
						final fr.inria.diverse.trace.api.IStep startedIStep = itStarting.next();
						virtualStack.push(startedIStep);
						events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(startedIStep, true));
					}
					if (virtualStack.peek() == endedIStep) {
						// We try again.
						events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(endedIStep, false));
						virtualStack.pop();
					} else {
						// If it failed again, throw an exception. Not supposed to happen.
						throw new IllegalStateException();
					}
				}
			}
		}
		
		while (itStarting.hasNext()) {
			final fr.inria.diverse.trace.api.IStep startedIStep = itStarting.next();
			events.add(new fr.inria.diverse.trace.api.IStep.StepEvent(startedIStep, true));
		}
	
		return events;
	}

	private fr.inria.diverse.trace.api.IStep generateStep(activitydiagramTrace.Steps.Step step) {
		fr.inria.diverse.trace.api.IStep result = null;

		fr.inria.diverse.trace.api.IStep parentStep = null;
		if (step.eContainer() instanceof activitydiagramTrace.Steps.Step) {
			parentStep = createGenericStep((activitydiagramTrace.Steps.Step) step.eContainer());
		}

		if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext) {
			activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext step_cast = (activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Activity", "initializeContext",
					startIndex, endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1) {
			activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1 step_cast = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "addTokens1",
					startIndex, endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1) {
			activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1 step_cast = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "sendOffers1",
					startIndex, endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace) {
			activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace step_cast = (activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Activity", "writeTrace",
					startIndex, endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Reset) {
			activitydiagramTrace.Steps.Activitydiagram_Activity_Reset step_cast = (activitydiagramTrace.Steps.Activitydiagram_Activity_Reset) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Activity", "reset", startIndex,
					endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1) {
			activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1 step_cast = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode",
					"takeOfferdTokens1", startIndex, endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1) {
			activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1 step_cast = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "removeToken1",
					startIndex, endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate) {
			activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate step_cast = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "terminate",
					startIndex, endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) {
			activitydiagramTrace.Steps.Activitydiagram_Activity_Execute step_cast = (activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Activity", "execute", startIndex,
					endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Variable_Init) {
			activitydiagramTrace.Steps.Activitydiagram_Variable_Init step_cast = (activitydiagramTrace.Steps.Activitydiagram_Variable_Init) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Variable", "init", startIndex,
					endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) {
			activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute step_cast = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "execute",
					startIndex, endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Variable_Execute) {
			activitydiagramTrace.Steps.Activitydiagram_Variable_Execute step_cast = (activitydiagramTrace.Steps.Activitydiagram_Variable_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Variable", "execute", startIndex,
					endIndex, parentStep);

			result.addParameter("this", (step_cast.getThis()));

		}

		return result;
	}

	private fr.inria.diverse.trace.api.IStep createGenericStep(activitydiagramTrace.Steps.Step step) {
		return new fr.inria.diverse.trace.api.impl.LazyGenericStep(() -> {
			return generateStep(step);
		});
		
	}
}
