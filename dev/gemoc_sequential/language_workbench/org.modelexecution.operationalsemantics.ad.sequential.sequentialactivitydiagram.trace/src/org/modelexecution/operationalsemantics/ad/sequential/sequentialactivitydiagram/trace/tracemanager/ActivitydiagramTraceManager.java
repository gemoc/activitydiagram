package org.modelexecution.operationalsemantics.ad.sequential.sequentialactivitydiagram.trace.tracemanager;

import fr.inria.diverse.trace.api.IValueTrace;
import fr.inria.diverse.trace.api.impl.GenericValueTrace;

import java.util.Collections;
import java.util.LinkedList;
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

public class ActivitydiagramTraceManager implements fr.inria.diverse.trace.gemoc.api.IGemocTraceManager {

	private activitydiagramTrace.Trace traceRoot;
	private Resource executedModel;

	private Map<EObject, EObject> exeToTraced;

	private activitydiagramTrace.States.State lastState;
	private List<IValueTrace> traces;

	private Resource traceResource;
	private Deque<activitydiagramTrace.Steps.Step> context = new LinkedList<activitydiagramTrace.Steps.Step>();

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

		Set<Resource> allResources = getAllExecutedModelResources();

		// We look at each object instance of a class with mutable properties 
		// Each of these objects should eventually become a traced object
		for (Resource r : allResources)
			for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
				EObject o = i.next();

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
					List<activitydiagramTrace.States.Trace_executedNodes_Value> valueSequence1 = tracedObject
							.getExecutedNodesSequence();
					activitydiagramTrace.States.Trace_executedNodes_Value previousValue1 = null;
					if (!valueSequence1.isEmpty())
						previousValue1 = valueSequence1.get(valueSequence1.size() - 1);

					for (activitydiagram.ActivityNode aValue : o_cast.getExecutedNodes()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange1 = true;
					if (previousValue1 != null) {

						if (previousValue1.getExecutedNodes().size() == o_cast.getExecutedNodes().size()) {

							java.util.Iterator<activitydiagram.ActivityNode> it = o_cast.getExecutedNodes().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityNode aPreviousValue : previousValue1
									.getExecutedNodes()) {
								activitydiagram.ActivityNode aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
						newState.getTrace_executedNodes_Values().add(previousValue1);

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
				 * Storing the state of a activitydiagram.OpaqueAction object
				 */
				if (o instanceof activitydiagram.OpaqueAction) {

					activitydiagram.OpaqueAction o_cast = (activitydiagram.OpaqueAction) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedOpaqueAction tracedObject = (activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence2 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue2 = null;
					if (!valueSequence2.isEmpty())
						previousValue2 = valueSequence2.get(valueSequence2.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange2 = true;
					if (previousValue2 != null) {

						if (previousValue2.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue2
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
						newState.getActivityNode_heldTokens_Values().add(previousValue2);

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
				 * Storing the state of a activitydiagram.Offer object
				 */
				if (o instanceof activitydiagram.Offer) {

					activitydiagram.Offer o_cast = (activitydiagram.Offer) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedOffer tracedObject = (activitydiagramTrace.States.activitydiagram.TracedOffer) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Offer_offeredTokens_Value> valueSequence3 = tracedObject
							.getOfferedTokensSequence();
					activitydiagramTrace.States.Offer_offeredTokens_Value previousValue3 = null;
					if (!valueSequence3.isEmpty())
						previousValue3 = valueSequence3.get(valueSequence3.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getOfferedTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange3 = true;
					if (previousValue3 != null) {

						if (previousValue3.getOfferedTokens().size() == o_cast.getOfferedTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getOfferedTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue3
									.getOfferedTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
						newState.getOffer_offeredTokens_Values().add(previousValue3);

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
				 * Storing the state of a activitydiagram.MergeNode object
				 */
				if (o instanceof activitydiagram.MergeNode) {

					activitydiagram.MergeNode o_cast = (activitydiagram.MergeNode) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedMergeNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedMergeNode) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence4 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue4 = null;
					if (!valueSequence4.isEmpty())
						previousValue4 = valueSequence4.get(valueSequence4.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange4 = true;
					if (previousValue4 != null) {

						if (previousValue4.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue4
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
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
						newState.getActivityNode_heldTokens_Values().add(previousValue4);

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
				 * Storing the state of a activitydiagram.JoinNode object
				 */
				if (o instanceof activitydiagram.JoinNode) {

					activitydiagram.JoinNode o_cast = (activitydiagram.JoinNode) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedJoinNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedJoinNode) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence5 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue5 = null;
					if (!valueSequence5.isEmpty())
						previousValue5 = valueSequence5.get(valueSequence5.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange5 = true;
					if (previousValue5 != null) {

						if (previousValue5.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue5
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
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
						newState.getActivityNode_heldTokens_Values().add(previousValue5);

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
				 * Storing the state of a activitydiagram.IntegerVariable object
				 */
				if (o instanceof activitydiagram.IntegerVariable) {

					activitydiagram.IntegerVariable o_cast = (activitydiagram.IntegerVariable) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedIntegerVariable tracedObject = (activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Variable_currentValue_Value> valueSequence6 = tracedObject
							.getCurrentValueSequence();
					activitydiagramTrace.States.Variable_currentValue_Value previousValue6 = null;
					if (!valueSequence6.isEmpty())
						previousValue6 = valueSequence6.get(valueSequence6.size() - 1);

					storeAsTracedObject(o_cast.getCurrentValue());

					activitydiagramTrace.States.activitydiagram.TracedValue content1 = null;
					if (o_cast.getCurrentValue() != null)
						content1 = ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced.get(o_cast
								.getCurrentValue()));

					boolean noChange6 = previousValue6 != null && previousValue6.getCurrentValue() == content1;

					if (noChange6) {
						newState.getVariable_currentValue_Values().add(previousValue6);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Variable_currentValue_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createVariable_currentValue_Value();

						newValue.setCurrentValue(content1);

						tracedObject.getCurrentValueSequence().add(newValue);
						newState.getVariable_currentValue_Values().add(newValue);
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
					List<activitydiagramTrace.States.IntegerValue_value_Value> valueSequence7 = tracedObject
							.getValueSequence();
					activitydiagramTrace.States.IntegerValue_value_Value previousValue7 = null;
					if (!valueSequence7.isEmpty())
						previousValue7 = valueSequence7.get(valueSequence7.size() - 1);

					int content2 = o_cast.getValue();

					boolean noChange7 = previousValue7 != null && previousValue7.getValue() == content2;

					if (noChange7) {
						newState.getIntegerValue_value_Values().add(previousValue7);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.IntegerValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createIntegerValue_value_Value();

						newValue.setValue(content2);

						tracedObject.getValueSequence().add(newValue);
						newState.getIntegerValue_value_Values().add(newValue);
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
					List<activitydiagramTrace.States.InputValue_value_Value> valueSequence8 = tracedObject
							.getValueSequence();
					activitydiagramTrace.States.InputValue_value_Value previousValue8 = null;
					if (!valueSequence8.isEmpty())
						previousValue8 = valueSequence8.get(valueSequence8.size() - 1);

					storeAsTracedObject(o_cast.getValue());

					activitydiagramTrace.States.activitydiagram.TracedValue content3 = null;
					if (o_cast.getValue() != null)
						content3 = ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced.get(o_cast
								.getValue()));

					boolean noChange8 = previousValue8 != null && previousValue8.getValue() == content3;

					if (noChange8) {
						newState.getInputValue_value_Values().add(previousValue8);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.InputValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createInputValue_value_Value();

						newValue.setValue(content3);

						tracedObject.getValueSequence().add(newValue);
						newState.getInputValue_value_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.InputValue_variable_Value> valueSequence9 = tracedObject
							.getVariableSequence();
					activitydiagramTrace.States.InputValue_variable_Value previousValue9 = null;
					if (!valueSequence9.isEmpty())
						previousValue9 = valueSequence9.get(valueSequence9.size() - 1);

					storeAsTracedObject(o_cast.getVariable());

					activitydiagramTrace.States.activitydiagram.TracedVariable content4 = null;
					if (o_cast.getVariable() != null)
						content4 = ((activitydiagramTrace.States.activitydiagram.TracedVariable) exeToTraced.get(o_cast
								.getVariable()));

					boolean noChange9 = previousValue9 != null && previousValue9.getVariable() == content4;

					if (noChange9) {
						newState.getInputValue_variable_Values().add(previousValue9);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.InputValue_variable_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createInputValue_variable_Value();

						newValue.setVariable(content4);

						tracedObject.getVariableSequence().add(newValue);
						newState.getInputValue_variable_Values().add(newValue);
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
					List<activitydiagramTrace.States.Input_inputValues_Value> valueSequence10 = tracedObject
							.getInputValuesSequence();
					activitydiagramTrace.States.Input_inputValues_Value previousValue10 = null;
					if (!valueSequence10.isEmpty())
						previousValue10 = valueSequence10.get(valueSequence10.size() - 1);

					for (activitydiagram.InputValue aValue : o_cast.getInputValues()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange10 = true;
					if (previousValue10 != null) {

						if (previousValue10.getInputValues().size() == o_cast.getInputValues().size()) {

							java.util.Iterator<activitydiagram.InputValue> it = o_cast.getInputValues().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedInputValue aPreviousValue : previousValue10
									.getInputValues()) {
								activitydiagram.InputValue aCurrentValue = it.next();
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
						newState.getInput_inputValues_Values().add(previousValue10);

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
				 * Storing the state of a activitydiagram.InitialNode object
				 */
				if (o instanceof activitydiagram.InitialNode) {

					activitydiagram.InitialNode o_cast = (activitydiagram.InitialNode) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedInitialNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedInitialNode) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence11 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue11 = null;
					if (!valueSequence11.isEmpty())
						previousValue11 = valueSequence11.get(valueSequence11.size() - 1);

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
				 * Storing the state of a activitydiagram.ForkedToken object
				 */
				if (o instanceof activitydiagram.ForkedToken) {

					activitydiagram.ForkedToken o_cast = (activitydiagram.ForkedToken) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedForkedToken tracedObject = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ForkedToken_baseToken_Value> valueSequence12 = tracedObject
							.getBaseTokenSequence();
					activitydiagramTrace.States.ForkedToken_baseToken_Value previousValue12 = null;
					if (!valueSequence12.isEmpty())
						previousValue12 = valueSequence12.get(valueSequence12.size() - 1);

					storeAsTracedObject(o_cast.getBaseToken());

					activitydiagramTrace.States.activitydiagram.TracedToken content5 = null;
					if (o_cast.getBaseToken() != null)
						content5 = ((activitydiagramTrace.States.activitydiagram.TracedToken) exeToTraced.get(o_cast
								.getBaseToken()));

					boolean noChange12 = previousValue12 != null && previousValue12.getBaseToken() == content5;

					if (noChange12) {
						newState.getForkedToken_baseToken_Values().add(previousValue12);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ForkedToken_baseToken_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createForkedToken_baseToken_Value();

						newValue.setBaseToken(content5);

						tracedObject.getBaseTokenSequence().add(newValue);
						newState.getForkedToken_baseToken_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value> valueSequence13 = tracedObject
							.getRemainingOffersCountSequence();
					activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value previousValue13 = null;
					if (!valueSequence13.isEmpty())
						previousValue13 = valueSequence13.get(valueSequence13.size() - 1);

					int content6 = o_cast.getRemainingOffersCount();

					boolean noChange13 = previousValue13 != null
							&& previousValue13.getRemainingOffersCount() == content6;

					if (noChange13) {
						newState.getForkedToken_remainingOffersCount_Values().add(previousValue13);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createForkedToken_remainingOffersCount_Value();

						newValue.setRemainingOffersCount(content6);

						tracedObject.getRemainingOffersCountSequence().add(newValue);
						newState.getForkedToken_remainingOffersCount_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Token_holder_Value> valueSequence14 = tracedObject
							.getHolderSequence();
					activitydiagramTrace.States.Token_holder_Value previousValue14 = null;
					if (!valueSequence14.isEmpty())
						previousValue14 = valueSequence14.get(valueSequence14.size() - 1);

					storeAsTracedObject(o_cast.getHolder());

					activitydiagramTrace.States.activitydiagram.TracedActivityNode content7 = null;
					if (o_cast.getHolder() != null)
						content7 = ((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast.getHolder()));

					boolean noChange14 = previousValue14 != null && previousValue14.getHolder() == content7;

					if (noChange14) {
						newState.getToken_holder_Values().add(previousValue14);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Token_holder_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createToken_holder_Value();

						newValue.setHolder(content7);

						tracedObject.getHolderSequence().add(newValue);
						newState.getToken_holder_Values().add(newValue);
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
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence15 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue15 = null;
					if (!valueSequence15.isEmpty())
						previousValue15 = valueSequence15.get(valueSequence15.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange15 = true;
					if (previousValue15 != null) {

						if (previousValue15.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue15
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
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
						newState.getActivityNode_heldTokens_Values().add(previousValue15);

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
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence16 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue16 = null;
					if (!valueSequence16.isEmpty())
						previousValue16 = valueSequence16.get(valueSequence16.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange16 = true;
					if (previousValue16 != null) {

						if (previousValue16.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue16
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
						newState.getActivityNode_heldTokens_Values().add(previousValue16);

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
				 * Storing the state of a activitydiagram.ControlToken object
				 */
				if (o instanceof activitydiagram.ControlToken) {

					activitydiagram.ControlToken o_cast = (activitydiagram.ControlToken) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedControlToken tracedObject = (activitydiagramTrace.States.activitydiagram.TracedControlToken) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Token_holder_Value> valueSequence17 = tracedObject
							.getHolderSequence();
					activitydiagramTrace.States.Token_holder_Value previousValue17 = null;
					if (!valueSequence17.isEmpty())
						previousValue17 = valueSequence17.get(valueSequence17.size() - 1);

					storeAsTracedObject(o_cast.getHolder());

					activitydiagramTrace.States.activitydiagram.TracedActivityNode content8 = null;
					if (o_cast.getHolder() != null)
						content8 = ((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast.getHolder()));

					boolean noChange17 = previousValue17 != null && previousValue17.getHolder() == content8;

					if (noChange17) {
						newState.getToken_holder_Values().add(previousValue17);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Token_holder_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createToken_holder_Value();

						newValue.setHolder(content8);

						tracedObject.getHolderSequence().add(newValue);
						newState.getToken_holder_Values().add(newValue);
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
					List<activitydiagramTrace.States.ActivityEdge_offers_Value> valueSequence18 = tracedObject
							.getOffersSequence();
					activitydiagramTrace.States.ActivityEdge_offers_Value previousValue18 = null;
					if (!valueSequence18.isEmpty())
						previousValue18 = valueSequence18.get(valueSequence18.size() - 1);

					for (activitydiagram.Offer aValue : o_cast.getOffers()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange18 = true;
					if (previousValue18 != null) {

						if (previousValue18.getOffers().size() == o_cast.getOffers().size()) {

							java.util.Iterator<activitydiagram.Offer> it = o_cast.getOffers().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedOffer aPreviousValue : previousValue18
									.getOffers()) {
								activitydiagram.Offer aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange18 = false;
									break;
								}
							}

						} else {
							noChange18 = false;
						}
					} else {
						noChange18 = false;
					}

					if (noChange18) {
						newState.getActivityEdge_offers_Values().add(previousValue18);

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
				 * Storing the state of a activitydiagram.BooleanVariable object
				 */
				if (o instanceof activitydiagram.BooleanVariable) {

					activitydiagram.BooleanVariable o_cast = (activitydiagram.BooleanVariable) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedBooleanVariable tracedObject = (activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Variable_currentValue_Value> valueSequence19 = tracedObject
							.getCurrentValueSequence();
					activitydiagramTrace.States.Variable_currentValue_Value previousValue19 = null;
					if (!valueSequence19.isEmpty())
						previousValue19 = valueSequence19.get(valueSequence19.size() - 1);

					storeAsTracedObject(o_cast.getCurrentValue());

					activitydiagramTrace.States.activitydiagram.TracedValue content9 = null;
					if (o_cast.getCurrentValue() != null)
						content9 = ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced.get(o_cast
								.getCurrentValue()));

					boolean noChange19 = previousValue19 != null && previousValue19.getCurrentValue() == content9;

					if (noChange19) {
						newState.getVariable_currentValue_Values().add(previousValue19);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Variable_currentValue_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createVariable_currentValue_Value();

						newValue.setCurrentValue(content9);

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
					List<activitydiagramTrace.States.BooleanValue_value_Value> valueSequence20 = tracedObject
							.getValueSequence();
					activitydiagramTrace.States.BooleanValue_value_Value previousValue20 = null;
					if (!valueSequence20.isEmpty())
						previousValue20 = valueSequence20.get(valueSequence20.size() - 1);

					boolean content10 = o_cast.isValue();

					boolean noChange20 = previousValue20 != null && previousValue20.isValue() == content10;

					if (noChange20) {
						newState.getBooleanValue_value_Values().add(previousValue20);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.BooleanValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createBooleanValue_value_Value();

						newValue.setValue(content10);

						tracedObject.getValueSequence().add(newValue);
						newState.getBooleanValue_value_Values().add(newValue);
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
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> valueSequence21 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue21 = null;
					if (!valueSequence21.isEmpty())
						previousValue21 = valueSequence21.get(valueSequence21.size() - 1);

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
				 * Storing the state of a activitydiagram.Activity object
				 */
				if (o instanceof activitydiagram.Activity) {

					activitydiagram.Activity o_cast = (activitydiagram.Activity) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedActivity tracedObject = (activitydiagramTrace.States.activitydiagram.TracedActivity) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Activity_trace_Value> valueSequence22 = tracedObject
							.getTraceSequence();
					activitydiagramTrace.States.Activity_trace_Value previousValue22 = null;
					if (!valueSequence22.isEmpty())
						previousValue22 = valueSequence22.get(valueSequence22.size() - 1);

					storeAsTracedObject(o_cast.getTrace());

					activitydiagramTrace.States.activitydiagram.TracedTrace content11 = null;
					if (o_cast.getTrace() != null)
						content11 = ((activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced.get(o_cast
								.getTrace()));

					boolean noChange22 = previousValue22 != null && previousValue22.getTrace() == content11;

					if (noChange22) {
						newState.getActivity_trace_Values().add(previousValue22);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Activity_trace_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivity_trace_Value();

						newValue.setTrace(content11);

						tracedObject.getTraceSequence().add(newValue);
						newState.getActivity_trace_Values().add(newValue);
					}

				}
			}

		boolean createNewState = lastState == null || (!onlyIfChange || changed);
		if (createNewState) {

			final activitydiagramTrace.Steps.Step currentStep = context.peekFirst();
			if (currentStep != null && currentStep instanceof activitydiagramTrace.Steps.BigStep) {
				final activitydiagramTrace.States.State startingState = lastState;
				final activitydiagramTrace.States.State endingState = newState;
				addImplicitStep(currentStep, startingState, endingState);
			}

			lastState = newState;
			traceRoot.getStatesTrace().add(lastState);
		}

		// Undoing the new state created for nothing
		else {

			newState.getStartedSteps().clear();
			newState.getEndedSteps().clear();

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

		return createNewState;

	}

	@Override
	public void addStep(String stepRule, Map<String, Object> params) {
		addStep(stepRule, params, this.getTraceSize() - 1);
	}

	private void addStep(String stepRule, Map<String, Object> params, int stateIndex) {

		activitydiagramTrace.Steps.Step toPush = null;

		if (stateIndex >= 0) {

			activitydiagramTrace.States.State state = this.traceRoot.getStatesTrace().get(stateIndex);

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

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_Activity_Execute_Sequence().add(
						activitydiagram_Activity_ExecuteInstance);
			} else

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

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_Activity_InitializeContext_Sequence().add(
						activitydiagram_Activity_InitializeContextInstance);
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

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_Activity_Reset_Sequence().add(activitydiagram_Activity_ResetInstance);
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

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_Activity_WriteTrace_Sequence().add(
						activitydiagram_Activity_WriteTraceInstance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.Action.addTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ActivityFinalNode.addTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ActivityNode.addTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ControlNode.addTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.DecisionNode.addTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ExecutableNode.addTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.FinalNode.addTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ForkNode.addTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.InitialNode.addTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.JoinNode.addTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.MergeNode.addTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.OpaqueAction.addTokens1")) {
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

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_ActivityNode_AddTokens1_Sequence().add(
						activitydiagram_ActivityNode_AddTokens1Instance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.Action.execute")
					|| stepRule.equalsIgnoreCase("activitydiagram.ActivityFinalNode.execute")
					|| stepRule.equalsIgnoreCase("activitydiagram.ActivityNode.execute")
					|| stepRule.equalsIgnoreCase("activitydiagram.ControlNode.execute")
					|| stepRule.equalsIgnoreCase("activitydiagram.DecisionNode.execute")
					|| stepRule.equalsIgnoreCase("activitydiagram.ExecutableNode.execute")
					|| stepRule.equalsIgnoreCase("activitydiagram.FinalNode.execute")
					|| stepRule.equalsIgnoreCase("activitydiagram.ForkNode.execute")
					|| stepRule.equalsIgnoreCase("activitydiagram.InitialNode.execute")
					|| stepRule.equalsIgnoreCase("activitydiagram.JoinNode.execute")
					|| stepRule.equalsIgnoreCase("activitydiagram.MergeNode.execute")
					|| stepRule.equalsIgnoreCase("activitydiagram.OpaqueAction.execute")) {
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

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_ActivityNode_Execute_Sequence().add(
						activitydiagram_ActivityNode_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.Action.removeToken1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ActivityFinalNode.removeToken1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ActivityNode.removeToken1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ControlNode.removeToken1")
					|| stepRule.equalsIgnoreCase("activitydiagram.DecisionNode.removeToken1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ExecutableNode.removeToken1")
					|| stepRule.equalsIgnoreCase("activitydiagram.FinalNode.removeToken1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ForkNode.removeToken1")
					|| stepRule.equalsIgnoreCase("activitydiagram.InitialNode.removeToken1")
					|| stepRule.equalsIgnoreCase("activitydiagram.JoinNode.removeToken1")
					|| stepRule.equalsIgnoreCase("activitydiagram.MergeNode.removeToken1")
					|| stepRule.equalsIgnoreCase("activitydiagram.OpaqueAction.removeToken1")) {
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

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_ActivityNode_RemoveToken1_Sequence().add(
						activitydiagram_ActivityNode_RemoveToken1Instance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.Action.sendOffers1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ActivityFinalNode.sendOffers1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ActivityNode.sendOffers1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ControlNode.sendOffers1")
					|| stepRule.equalsIgnoreCase("activitydiagram.DecisionNode.sendOffers1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ExecutableNode.sendOffers1")
					|| stepRule.equalsIgnoreCase("activitydiagram.FinalNode.sendOffers1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ForkNode.sendOffers1")
					|| stepRule.equalsIgnoreCase("activitydiagram.InitialNode.sendOffers1")
					|| stepRule.equalsIgnoreCase("activitydiagram.JoinNode.sendOffers1")
					|| stepRule.equalsIgnoreCase("activitydiagram.MergeNode.sendOffers1")
					|| stepRule.equalsIgnoreCase("activitydiagram.OpaqueAction.sendOffers1")) {
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

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_ActivityNode_SendOffers1_Sequence().add(
						activitydiagram_ActivityNode_SendOffers1Instance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.Action.takeOfferdTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ActivityFinalNode.takeOfferdTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ActivityNode.takeOfferdTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ControlNode.takeOfferdTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.DecisionNode.takeOfferdTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ExecutableNode.takeOfferdTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.FinalNode.takeOfferdTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.ForkNode.takeOfferdTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.InitialNode.takeOfferdTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.JoinNode.takeOfferdTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.MergeNode.takeOfferdTokens1")
					|| stepRule.equalsIgnoreCase("activitydiagram.OpaqueAction.takeOfferdTokens1")) {
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

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence().add(
						activitydiagram_ActivityNode_TakeOfferdTokens1Instance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.Action.terminate")
					|| stepRule.equalsIgnoreCase("activitydiagram.ActivityFinalNode.terminate")
					|| stepRule.equalsIgnoreCase("activitydiagram.ActivityNode.terminate")
					|| stepRule.equalsIgnoreCase("activitydiagram.ControlNode.terminate")
					|| stepRule.equalsIgnoreCase("activitydiagram.DecisionNode.terminate")
					|| stepRule.equalsIgnoreCase("activitydiagram.ExecutableNode.terminate")
					|| stepRule.equalsIgnoreCase("activitydiagram.FinalNode.terminate")
					|| stepRule.equalsIgnoreCase("activitydiagram.ForkNode.terminate")
					|| stepRule.equalsIgnoreCase("activitydiagram.InitialNode.terminate")
					|| stepRule.equalsIgnoreCase("activitydiagram.JoinNode.terminate")
					|| stepRule.equalsIgnoreCase("activitydiagram.MergeNode.terminate")
					|| stepRule.equalsIgnoreCase("activitydiagram.OpaqueAction.terminate")) {
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

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_ActivityNode_Terminate_Sequence().add(
						activitydiagram_ActivityNode_TerminateInstance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.BooleanVariable.execute")
					|| stepRule.equalsIgnoreCase("activitydiagram.IntegerVariable.execute")
					|| stepRule.equalsIgnoreCase("activitydiagram.Variable.execute")) {
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

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_Variable_Execute_Sequence().add(
						activitydiagram_Variable_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("activitydiagram.BooleanVariable.init")
					|| stepRule.equalsIgnoreCase("activitydiagram.IntegerVariable.init")
					|| stepRule.equalsIgnoreCase("activitydiagram.Variable.init")) {
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

				// Then we add it to its trace
				this.traceRoot.getActivitydiagram_Variable_Init_Sequence().add(activitydiagram_Variable_InitInstance);
			}

		}

		context.push(toPush);

	}

	private void addImplicitStep(activitydiagramTrace.Steps.Step currentStep,
			activitydiagramTrace.States.State startingState, activitydiagramTrace.States.State endingState) {

		activitydiagramTrace.Steps.Step implicitStep = null;
		if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ActivityNode_AddTokens1_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ActivityNode_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ActivityNode_SendOffers1_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_Activity_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_Activity_WriteTrace_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_Variable_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_Variable_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_Variable_Init) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_Variable_Init_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			emfAdd(currentStep, "subSteps", implicitStep);
		}
	}

	@Override
	public boolean addStep(org.gemoc.executionframework.engine.mse.MSEOccurrence mseOccurrence) {

		activitydiagramTrace.Steps.Step step = null;

		if (mseOccurrence != null && mseOccurrence instanceof activitydiagramTrace.Steps.Step) {

			step = (activitydiagramTrace.Steps.Step) mseOccurrence;

			// Creating generic (or almost generic) links
			activitydiagramTrace.States.State state = this.traceRoot.getStatesTrace().get(this.getTraceSize() - 1);
			step.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				emfAdd(context.getFirst(), "subSteps", step);
			} else {
				traceRoot.getRootSteps().add(step);
			}

			// Adding step in its dedicated sequence/dimension
			if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_Activity_Execute activitydiagram_Activity_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) step;
				this.traceRoot.getActivitydiagram_Activity_Execute_Sequence().add(
						activitydiagram_Activity_ExecuteInstance);
			} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext) {
				activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext activitydiagram_Activity_InitializeContextInstance = (activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext) step;
				this.traceRoot.getActivitydiagram_Activity_InitializeContext_Sequence().add(
						activitydiagram_Activity_InitializeContextInstance);
			} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Reset) {
				activitydiagramTrace.Steps.Activitydiagram_Activity_Reset activitydiagram_Activity_ResetInstance = (activitydiagramTrace.Steps.Activitydiagram_Activity_Reset) step;
				this.traceRoot.getActivitydiagram_Activity_Reset_Sequence().add(activitydiagram_Activity_ResetInstance);
			} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace) {
				activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace activitydiagram_Activity_WriteTraceInstance = (activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace) step;
				this.traceRoot.getActivitydiagram_Activity_WriteTrace_Sequence().add(
						activitydiagram_Activity_WriteTraceInstance);
			} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1 activitydiagram_ActivityNode_AddTokens1Instance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1) step;
				this.traceRoot.getActivitydiagram_ActivityNode_AddTokens1_Sequence().add(
						activitydiagram_ActivityNode_AddTokens1Instance);
			} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute activitydiagram_ActivityNode_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) step;
				this.traceRoot.getActivitydiagram_ActivityNode_Execute_Sequence().add(
						activitydiagram_ActivityNode_ExecuteInstance);
			} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1 activitydiagram_ActivityNode_RemoveToken1Instance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1) step;
				this.traceRoot.getActivitydiagram_ActivityNode_RemoveToken1_Sequence().add(
						activitydiagram_ActivityNode_RemoveToken1Instance);
			} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1 activitydiagram_ActivityNode_SendOffers1Instance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1) step;
				this.traceRoot.getActivitydiagram_ActivityNode_SendOffers1_Sequence().add(
						activitydiagram_ActivityNode_SendOffers1Instance);
			} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1 activitydiagram_ActivityNode_TakeOfferdTokens1Instance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1) step;
				this.traceRoot.getActivitydiagram_ActivityNode_TakeOfferdTokens1_Sequence().add(
						activitydiagram_ActivityNode_TakeOfferdTokens1Instance);
			} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate activitydiagram_ActivityNode_TerminateInstance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate) step;
				this.traceRoot.getActivitydiagram_ActivityNode_Terminate_Sequence().add(
						activitydiagram_ActivityNode_TerminateInstance);
			} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Variable_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_Variable_Execute activitydiagram_Variable_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_Variable_Execute) step;
				this.traceRoot.getActivitydiagram_Variable_Execute_Sequence().add(
						activitydiagram_Variable_ExecuteInstance);
			} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Variable_Init) {
				activitydiagramTrace.Steps.Activitydiagram_Variable_Init activitydiagram_Variable_InitInstance = (activitydiagramTrace.Steps.Activitydiagram_Variable_Init) step;
				this.traceRoot.getActivitydiagram_Variable_Init_Sequence().add(activitydiagram_Variable_InitInstance);
			}
		}
		context.push(step);

		return (step != null);
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

			for (activitydiagramTrace.States.Variable_currentValue_Value value : stateToGo
					.getVariable_currentValue_Values()) {

				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) {
					activitydiagramTrace.States.activitydiagram.TracedBooleanVariable parent_cast = (activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) value
							.getParent();
					activitydiagram.Value toset = (activitydiagram.Value)

					getTracedToExe(value.getCurrentValue());
					activitydiagram.Value current = ((activitydiagram.Variable) parent_cast.getOriginalObject())
							.getCurrentValue();
					if (current != toset)
						((activitydiagram.Variable) parent_cast.getOriginalObject()).setCurrentValue(toset);

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) {
					activitydiagramTrace.States.activitydiagram.TracedIntegerVariable parent_cast = (activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) value
							.getParent();
					activitydiagram.Value toset = (activitydiagram.Value)

					getTracedToExe(value.getCurrentValue());
					activitydiagram.Value current = ((activitydiagram.Variable) parent_cast.getOriginalObject())
							.getCurrentValue();
					if (current != toset)
						((activitydiagram.Variable) parent_cast.getOriginalObject()).setCurrentValue(toset);

				}

			}

			for (activitydiagramTrace.States.ActivityNode_heldTokens_Value value : stateToGo
					.getActivityNode_heldTokens_Values()) {

				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode) {
					activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast.getOriginalObject().getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>)

							getTracedToExe(value.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedDecisionNode) {
					activitydiagramTrace.States.activitydiagram.TracedDecisionNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedDecisionNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast.getOriginalObject().getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>)

							getTracedToExe(value.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedForkNode) {
					activitydiagramTrace.States.activitydiagram.TracedForkNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedForkNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast.getOriginalObject().getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>)

							getTracedToExe(value.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedInitialNode) {
					activitydiagramTrace.States.activitydiagram.TracedInitialNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedInitialNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast.getOriginalObject().getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>)

							getTracedToExe(value.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedJoinNode) {
					activitydiagramTrace.States.activitydiagram.TracedJoinNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedJoinNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast.getOriginalObject().getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>)

							getTracedToExe(value.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedMergeNode) {
					activitydiagramTrace.States.activitydiagram.TracedMergeNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedMergeNode) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast.getOriginalObject().getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>)

							getTracedToExe(value.getHeldTokens()));

				}
				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) {
					activitydiagramTrace.States.activitydiagram.TracedOpaqueAction parent_cast = (activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) value
							.getParent();
					parent_cast.getOriginalObject().getHeldTokens().clear();
					parent_cast.getOriginalObject().getHeldTokens()
							.addAll((Collection<? extends activitydiagram.Token>)

							getTracedToExe(value.getHeldTokens()));

				}

			}

			for (activitydiagramTrace.States.ActivityEdge_offers_Value value : stateToGo
					.getActivityEdge_offers_Values()) {

				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedControlFlow) {
					activitydiagramTrace.States.activitydiagram.TracedControlFlow parent_cast = (activitydiagramTrace.States.activitydiagram.TracedControlFlow) value
							.getParent();
					parent_cast.getOriginalObject().getOffers().clear();
					parent_cast.getOriginalObject().getOffers().addAll((Collection<? extends activitydiagram.Offer>)

					getTracedToExe(value.getOffers()));

				}

			}

			for (activitydiagramTrace.States.Activity_trace_Value value : stateToGo.getActivity_trace_Values()) {

				if (value.getParent() instanceof activitydiagramTrace.States.activitydiagram.TracedActivity) {
					activitydiagramTrace.States.activitydiagram.TracedActivity parent_cast = (activitydiagramTrace.States.activitydiagram.TracedActivity) value
							.getParent();
					activitydiagram.Trace toset = (activitydiagram.Trace)

					getTracedToExe(value.getTrace());
					activitydiagram.Trace current = ((activitydiagram.Activity) parent_cast.getOriginalObject())
							.getTrace();
					if (current != toset)
						((activitydiagram.Activity) parent_cast.getOriginalObject()).setTrace(toset);

				}

			}

			for (activitydiagramTrace.States.BooleanValue_value_Value value : stateToGo.getBooleanValue_value_Values()) {

				activitydiagram.BooleanValue exeObject = (activitydiagram.BooleanValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.isValue());

			}

			for (activitydiagramTrace.States.ForkedToken_baseToken_Value value : stateToGo
					.getForkedToken_baseToken_Values()) {

				activitydiagram.ForkedToken exeObject = (activitydiagram.ForkedToken) getTracedToExe(value.getParent());
				exeObject.setBaseToken((activitydiagram.Token)

				getTracedToExe(value.getBaseToken()));

			}

			for (activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value value : stateToGo
					.getForkedToken_remainingOffersCount_Values()) {

				activitydiagram.ForkedToken exeObject = (activitydiagram.ForkedToken) getTracedToExe(value.getParent());
				exeObject.setRemainingOffersCount(value.getRemainingOffersCount());

			}

			for (activitydiagramTrace.States.Input_inputValues_Value value : stateToGo.getInput_inputValues_Values()) {

				activitydiagram.Input exeObject = (activitydiagram.Input) getTracedToExe(value.getParent());
				exeObject.getInputValues().clear();

				exeObject.getInputValues().addAll(
						(Collection<? extends activitydiagram.InputValue>) getTracedToExe(value.getInputValues()));

			}

			for (activitydiagramTrace.States.InputValue_value_Value value : stateToGo.getInputValue_value_Values()) {

				activitydiagram.InputValue exeObject = (activitydiagram.InputValue) getTracedToExe(value.getParent());
				exeObject.setValue((activitydiagram.Value)

				getTracedToExe(value.getValue()));

			}

			for (activitydiagramTrace.States.InputValue_variable_Value value : stateToGo
					.getInputValue_variable_Values()) {

				activitydiagram.InputValue exeObject = (activitydiagram.InputValue) getTracedToExe(value.getParent());
				exeObject.setVariable((activitydiagram.Variable)

				getTracedToExe(value.getVariable()));

			}

			for (activitydiagramTrace.States.IntegerValue_value_Value value : stateToGo.getIntegerValue_value_Values()) {

				activitydiagram.IntegerValue exeObject = (activitydiagram.IntegerValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.getValue());

			}

			for (activitydiagramTrace.States.Offer_offeredTokens_Value value : stateToGo
					.getOffer_offeredTokens_Values()) {

				activitydiagram.Offer exeObject = (activitydiagram.Offer) getTracedToExe(value.getParent());
				exeObject.getOfferedTokens().clear();

				exeObject.getOfferedTokens().addAll(
						(Collection<? extends activitydiagram.Token>) getTracedToExe(value.getOfferedTokens()));

			}

			for (activitydiagramTrace.States.Token_holder_Value value : stateToGo.getToken_holder_Values()) {

				activitydiagram.Token exeObject = (activitydiagram.Token) getTracedToExe(value.getParent());
				exeObject.setHolder((activitydiagram.ActivityNode)

				getTracedToExe(value.getHolder()));

			}

			for (activitydiagramTrace.States.Trace_executedNodes_Value value : stateToGo
					.getTrace_executedNodes_Values()) {

				activitydiagram.Trace exeObject = (activitydiagram.Trace) getTracedToExe(value.getParent());
				exeObject.getExecutedNodes().clear();

				exeObject.getExecutedNodes().addAll(
						(Collection<? extends activitydiagram.ActivityNode>) getTracedToExe(value.getExecutedNodes()));

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
		//try {
		//	traceResource.save(null);
		//} catch (java.io.IOException e) {
		//	e.printStackTrace();
		//}
	}

	@Override
	public String getDescriptionOfExecutionState(int index) {
		StringBuilder result = new StringBuilder();
		activitydiagramTrace.States.State gs = traceRoot.getStatesTrace().get(index);

		if (!gs.getVariable_currentValue_Values().isEmpty())
			result.append("\nCurrentValue values:");
		for (activitydiagramTrace.States.Variable_currentValue_Value currentState : gs
				.getVariable_currentValue_Values()) {
			result.append("\n\t" + currentState.getCurrentValue());
		}

		if (!gs.getActivityNode_heldTokens_Values().isEmpty())
			result.append("\nHeldTokens values:");
		for (activitydiagramTrace.States.ActivityNode_heldTokens_Value currentState : gs
				.getActivityNode_heldTokens_Values()) {
			String d = "";
			List<activitydiagramTrace.States.activitydiagram.TracedToken> l = currentState.getHeldTokens();
			int s = l.size();
			for (int i = 0; i < s - 1; i++) {
				d += l.get(i).toString() + ",\n\t\t";
			}
			if (s > 0) {
				d += l.get(s - 1).toString();
			}
			result.append("\n\t" + "[" + d + "]");
		}

		if (!gs.getActivityEdge_offers_Values().isEmpty())
			result.append("\nOffers values:");
		for (activitydiagramTrace.States.ActivityEdge_offers_Value currentState : gs.getActivityEdge_offers_Values()) {
			String d = "";
			List<activitydiagramTrace.States.activitydiagram.TracedOffer> l = currentState.getOffers();
			int s = l.size();
			for (int i = 0; i < s - 1; i++) {
				d += l.get(i).toString() + ",\n\t\t";
			}
			if (s > 0) {
				d += l.get(s - 1).toString();
			}
			result.append("\n\t" + "[" + d + "]");
		}

		if (!gs.getActivity_trace_Values().isEmpty())
			result.append("\nTrace values:");
		for (activitydiagramTrace.States.Activity_trace_Value currentState : gs.getActivity_trace_Values()) {
			result.append("\n\t" + currentState.getTrace());
		}

		if (!gs.getBooleanValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (activitydiagramTrace.States.BooleanValue_value_Value currentState : gs.getBooleanValue_value_Values()) {
			result.append("\n\t" + currentState.isValue());
		}

		if (!gs.getForkedToken_baseToken_Values().isEmpty())
			result.append("\nBaseToken values:");
		for (activitydiagramTrace.States.ForkedToken_baseToken_Value currentState : gs
				.getForkedToken_baseToken_Values()) {
			result.append("\n\t" + currentState.getBaseToken());
		}

		if (!gs.getForkedToken_remainingOffersCount_Values().isEmpty())
			result.append("\nRemainingOffersCount values:");
		for (activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value currentState : gs
				.getForkedToken_remainingOffersCount_Values()) {
			result.append("\n\t" + currentState.getRemainingOffersCount());
		}

		if (!gs.getInput_inputValues_Values().isEmpty())
			result.append("\nInputValues values:");
		for (activitydiagramTrace.States.Input_inputValues_Value currentState : gs.getInput_inputValues_Values()) {
			String d = "";
			List<activitydiagramTrace.States.activitydiagram.TracedInputValue> l = currentState.getInputValues();
			int s = l.size();
			for (int i = 0; i < s - 1; i++) {
				d += l.get(i).toString() + ",\n\t\t";
			}
			if (s > 0) {
				d += l.get(s - 1).toString();
			}
			result.append("\n\t" + "[" + d + "]");
		}

		if (!gs.getInputValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (activitydiagramTrace.States.InputValue_value_Value currentState : gs.getInputValue_value_Values()) {
			result.append("\n\t" + currentState.getValue());
		}

		if (!gs.getInputValue_variable_Values().isEmpty())
			result.append("\nVariable values:");
		for (activitydiagramTrace.States.InputValue_variable_Value currentState : gs.getInputValue_variable_Values()) {
			result.append("\n\t" + currentState.getVariable());
		}

		if (!gs.getIntegerValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (activitydiagramTrace.States.IntegerValue_value_Value currentState : gs.getIntegerValue_value_Values()) {
			result.append("\n\t" + currentState.getValue());
		}

		if (!gs.getOffer_offeredTokens_Values().isEmpty())
			result.append("\nOfferedTokens values:");
		for (activitydiagramTrace.States.Offer_offeredTokens_Value currentState : gs.getOffer_offeredTokens_Values()) {
			String d = "";
			List<activitydiagramTrace.States.activitydiagram.TracedToken> l = currentState.getOfferedTokens();
			int s = l.size();
			for (int i = 0; i < s - 1; i++) {
				d += l.get(i).toString() + ",\n\t\t";
			}
			if (s > 0) {
				d += l.get(s - 1).toString();
			}
			result.append("\n\t" + "[" + d + "]");
		}

		if (!gs.getToken_holder_Values().isEmpty())
			result.append("\nHolder values:");
		for (activitydiagramTrace.States.Token_holder_Value currentState : gs.getToken_holder_Values()) {
			result.append("\n\t" + currentState.getHolder());
		}

		if (!gs.getTrace_executedNodes_Values().isEmpty())
			result.append("\nExecutedNodes values:");
		for (activitydiagramTrace.States.Trace_executedNodes_Value currentState : gs.getTrace_executedNodes_Values()) {
			String d = "";
			List<activitydiagramTrace.States.activitydiagram.TracedActivityNode> l = currentState.getExecutedNodes();
			int s = l.size();
			for (int i = 0; i < s - 1; i++) {
				d += l.get(i).toString() + ",\n\t\t";
			}
			if (s > 0) {
				d += l.get(s - 1).toString();
			}
			result.append("\n\t" + "[" + d + "]");
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
	public String getDescriptionOfValue(EObject value) {
		if (value instanceof activitydiagramTrace.States.Variable_currentValue_Value) {
			return "activitydiagramTrace.States.Variable_currentValue_Value: "
					+ ((activitydiagramTrace.States.Variable_currentValue_Value) value).getCurrentValue();
		} else if (value instanceof activitydiagramTrace.States.ActivityNode_heldTokens_Value) {
			return "activitydiagramTrace.States.ActivityNode_heldTokens_Value: "
					+ ((activitydiagramTrace.States.ActivityNode_heldTokens_Value) value).getHeldTokens();
		} else if (value instanceof activitydiagramTrace.States.ActivityEdge_offers_Value) {
			return "activitydiagramTrace.States.ActivityEdge_offers_Value: "
					+ ((activitydiagramTrace.States.ActivityEdge_offers_Value) value).getOffers();
		} else if (value instanceof activitydiagramTrace.States.Activity_trace_Value) {
			return "activitydiagramTrace.States.Activity_trace_Value: "
					+ ((activitydiagramTrace.States.Activity_trace_Value) value).getTrace();
		} else if (value instanceof activitydiagramTrace.States.BooleanValue_value_Value) {
			return "activitydiagramTrace.States.BooleanValue_value_Value: "
					+ ((activitydiagramTrace.States.BooleanValue_value_Value) value).isValue();
		} else if (value instanceof activitydiagramTrace.States.ForkedToken_baseToken_Value) {
			return "activitydiagramTrace.States.ForkedToken_baseToken_Value: "
					+ ((activitydiagramTrace.States.ForkedToken_baseToken_Value) value).getBaseToken();
		} else if (value instanceof activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value) {
			return "activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value: "
					+ ((activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value) value)
							.getRemainingOffersCount();
		} else if (value instanceof activitydiagramTrace.States.Input_inputValues_Value) {
			return "activitydiagramTrace.States.Input_inputValues_Value: "
					+ ((activitydiagramTrace.States.Input_inputValues_Value) value).getInputValues();
		} else if (value instanceof activitydiagramTrace.States.InputValue_value_Value) {
			return "activitydiagramTrace.States.InputValue_value_Value: "
					+ ((activitydiagramTrace.States.InputValue_value_Value) value).getValue();
		} else if (value instanceof activitydiagramTrace.States.InputValue_variable_Value) {
			return "activitydiagramTrace.States.InputValue_variable_Value: "
					+ ((activitydiagramTrace.States.InputValue_variable_Value) value).getVariable();
		} else if (value instanceof activitydiagramTrace.States.IntegerValue_value_Value) {
			return "activitydiagramTrace.States.IntegerValue_value_Value: "
					+ ((activitydiagramTrace.States.IntegerValue_value_Value) value).getValue();
		} else if (value instanceof activitydiagramTrace.States.Offer_offeredTokens_Value) {
			return "activitydiagramTrace.States.Offer_offeredTokens_Value: "
					+ ((activitydiagramTrace.States.Offer_offeredTokens_Value) value).getOfferedTokens();
		} else if (value instanceof activitydiagramTrace.States.Token_holder_Value) {
			return "activitydiagramTrace.States.Token_holder_Value: "
					+ ((activitydiagramTrace.States.Token_holder_Value) value).getHolder();
		} else if (value instanceof activitydiagramTrace.States.Trace_executedNodes_Value) {
			return "activitydiagramTrace.States.Trace_executedNodes_Value: "
					+ ((activitydiagramTrace.States.Trace_executedNodes_Value) value).getExecutedNodes();
		} else
			return "ERROR";
	}

	@Override
	public Object getContainedValue(EObject value) {
		if (value instanceof activitydiagramTrace.States.Variable_currentValue_Value) {
			return ((activitydiagramTrace.States.Variable_currentValue_Value) value).getCurrentValue();
		} else if (value instanceof activitydiagramTrace.States.ActivityNode_heldTokens_Value) {
			return ((activitydiagramTrace.States.ActivityNode_heldTokens_Value) value).getHeldTokens();
		} else if (value instanceof activitydiagramTrace.States.ActivityEdge_offers_Value) {
			return ((activitydiagramTrace.States.ActivityEdge_offers_Value) value).getOffers();
		} else if (value instanceof activitydiagramTrace.States.Activity_trace_Value) {
			return ((activitydiagramTrace.States.Activity_trace_Value) value).getTrace();
		} else if (value instanceof activitydiagramTrace.States.BooleanValue_value_Value) {
			return ((activitydiagramTrace.States.BooleanValue_value_Value) value).isValue();
		} else if (value instanceof activitydiagramTrace.States.ForkedToken_baseToken_Value) {
			return ((activitydiagramTrace.States.ForkedToken_baseToken_Value) value).getBaseToken();
		} else if (value instanceof activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value) {
			return ((activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value) value)
					.getRemainingOffersCount();
		} else if (value instanceof activitydiagramTrace.States.Input_inputValues_Value) {
			return ((activitydiagramTrace.States.Input_inputValues_Value) value).getInputValues();
		} else if (value instanceof activitydiagramTrace.States.InputValue_value_Value) {
			return ((activitydiagramTrace.States.InputValue_value_Value) value).getValue();
		} else if (value instanceof activitydiagramTrace.States.InputValue_variable_Value) {
			return ((activitydiagramTrace.States.InputValue_variable_Value) value).getVariable();
		} else if (value instanceof activitydiagramTrace.States.IntegerValue_value_Value) {
			return ((activitydiagramTrace.States.IntegerValue_value_Value) value).getValue();
		} else if (value instanceof activitydiagramTrace.States.Offer_offeredTokens_Value) {
			return ((activitydiagramTrace.States.Offer_offeredTokens_Value) value).getOfferedTokens();
		} else if (value instanceof activitydiagramTrace.States.Token_holder_Value) {
			return ((activitydiagramTrace.States.Token_holder_Value) value).getHolder();
		} else if (value instanceof activitydiagramTrace.States.Trace_executedNodes_Value) {
			return ((activitydiagramTrace.States.Trace_executedNodes_Value) value).getExecutedNodes();
		} else
			return null;
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

	private void storeAsTracedObject(activitydiagram.ForkedToken o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedForkedToken tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedForkedToken();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedForkedTokens().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getBaseTokenSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getRemainingOffersCountSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getHolderSequence(), this));
		}
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

	private void storeAsTracedObject(activitydiagram.InputValue o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedInputValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedInputValue();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedInputValues().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getValueSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getVariableSequence(), this));
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

	private void storeAsTracedObject(EObject o) {
		if (o instanceof activitydiagram.Trace) {
			storeAsTracedObject((activitydiagram.Trace) o);
		} else if (o instanceof activitydiagram.OpaqueAction) {
			storeAsTracedObject((activitydiagram.OpaqueAction) o);
		} else if (o instanceof activitydiagram.Offer) {
			storeAsTracedObject((activitydiagram.Offer) o);
		} else if (o instanceof activitydiagram.MergeNode) {
			storeAsTracedObject((activitydiagram.MergeNode) o);
		} else if (o instanceof activitydiagram.JoinNode) {
			storeAsTracedObject((activitydiagram.JoinNode) o);
		} else if (o instanceof activitydiagram.IntegerVariable) {
			storeAsTracedObject((activitydiagram.IntegerVariable) o);
		} else if (o instanceof activitydiagram.IntegerValue) {
			storeAsTracedObject((activitydiagram.IntegerValue) o);
		} else if (o instanceof activitydiagram.InputValue) {
			storeAsTracedObject((activitydiagram.InputValue) o);
		} else if (o instanceof activitydiagram.Input) {
			storeAsTracedObject((activitydiagram.Input) o);
		} else if (o instanceof activitydiagram.InitialNode) {
			storeAsTracedObject((activitydiagram.InitialNode) o);
		} else if (o instanceof activitydiagram.ForkedToken) {
			storeAsTracedObject((activitydiagram.ForkedToken) o);
		} else if (o instanceof activitydiagram.ForkNode) {
			storeAsTracedObject((activitydiagram.ForkNode) o);
		} else if (o instanceof activitydiagram.DecisionNode) {
			storeAsTracedObject((activitydiagram.DecisionNode) o);
		} else if (o instanceof activitydiagram.ControlToken) {
			storeAsTracedObject((activitydiagram.ControlToken) o);
		} else if (o instanceof activitydiagram.ControlFlow) {
			storeAsTracedObject((activitydiagram.ControlFlow) o);
		} else if (o instanceof activitydiagram.BooleanVariable) {
			storeAsTracedObject((activitydiagram.BooleanVariable) o);
		} else if (o instanceof activitydiagram.BooleanValue) {
			storeAsTracedObject((activitydiagram.BooleanValue) o);
		} else if (o instanceof activitydiagram.ActivityFinalNode) {
			storeAsTracedObject((activitydiagram.ActivityFinalNode) o);
		} else if (o instanceof activitydiagram.Activity) {
			storeAsTracedObject((activitydiagram.Activity) o);
		}
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
		return traces.size();
	}

	@Override
	public Set<EObject> getAllCurrentValues(int stateIndex) {
		activitydiagramTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);
		// We find all current values
		Set<EObject> currentValues = new HashSet<EObject>();
		if (currentState != null) {
			currentValues.addAll(currentState.getVariable_currentValue_Values());
			currentValues.addAll(currentState.getActivityNode_heldTokens_Values());
			currentValues.addAll(currentState.getActivityEdge_offers_Values());
			currentValues.addAll(currentState.getActivity_trace_Values());
			currentValues.addAll(currentState.getBooleanValue_value_Values());
			currentValues.addAll(currentState.getForkedToken_baseToken_Values());
			currentValues.addAll(currentState.getForkedToken_remainingOffersCount_Values());
			currentValues.addAll(currentState.getInput_inputValues_Values());
			currentValues.addAll(currentState.getInputValue_value_Values());
			currentValues.addAll(currentState.getInputValue_variable_Values());
			currentValues.addAll(currentState.getIntegerValue_value_Values());
			currentValues.addAll(currentState.getOffer_offeredTokens_Values());
			currentValues.addAll(currentState.getToken_holder_Values());
			currentValues.addAll(currentState.getTrace_executedNodes_Values());
		}
		return currentValues;
	}

	public List<IValueTrace> getAllValueTraces() {
		return traces;
	}

	@Override
	public int getStateOrValueIndex(EObject stateOrValue) {
		int idx = traceRoot.getStatesTrace().indexOf(stateOrValue);
		if (idx == -1) {
			final Object states = emfGet(stateOrValue, "states");
			if (states != null) {
				if (states instanceof List<?>) {
					// We get the first state in which this value existed
					Object valueState = ((List<?>) states).get(0);
					if (valueState instanceof activitydiagramTrace.States.State) {
						idx = traceRoot.getStatesTrace().indexOf(valueState);
					}
				}
			}
		}
		return idx;
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
		List<activitydiagramTrace.Steps.Step> endedSteps = currentState.getEndedSteps();

		if (!endedSteps.isEmpty()) {
			final activitydiagramTrace.Steps.Step endedStep = endedSteps.get(0);
			if (endedStep.getStartingState() != currentState) {
				result.addFirst(createGenericStep(endedStep));
			}
			EObject itStep = endedStep.eContainer();
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
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private Map<fr.inria.diverse.trace.api.IStep,List<fr.inria.diverse.trace.api.IStep>> getStepSubGraph(
			activitydiagramTrace.Steps.Step step, int startingState, int endingState,
			Map<fr.inria.diverse.trace.api.IStep,List<fr.inria.diverse.trace.api.IStep>> accumulator,
			Map<activitydiagramTrace.Steps.Step, fr.inria.diverse.trace.api.IStep> step2IStep) {
		
		final List<activitydiagramTrace.Steps.Step> steps = (List<activitydiagramTrace.Steps.Step>) emfGet(step, "subSteps");
		final List<activitydiagramTrace.States.State> states = this.traceRoot.getStatesTrace();
		final fr.inria.diverse.trace.api.IStep iStep = step2IStep.computeIfAbsent(step, (s)->createGenericStep(s));
		
		if (steps != null && !steps.isEmpty()) {
			final List<activitydiagramTrace.Steps.Step> eligibleSteps = steps.stream().filter(s->{
				final int stepStartingState = states.indexOf(s.getStartingState());
				final int stepEndingState = states.indexOf(s.getEndingState());
				return (stepEndingState == -1 || stepEndingState > startingState) && stepStartingState < endingState;
			}).collect(Collectors.toList());
			
			accumulator.put(iStep, eligibleSteps.stream().map(s->step2IStep.computeIfAbsent(s, (k)->createGenericStep(k))).collect(Collectors.toList()));
			
			for (activitydiagramTrace.Steps.Step subStep : eligibleSteps) {
				getStepSubGraph(subStep, startingState, endingState, accumulator, step2IStep);
			}
		} else {
			accumulator.put(iStep, Collections.EMPTY_LIST);
		}
		
		return accumulator;
	}

	@Override
	public Map<fr.inria.diverse.trace.api.IStep, List<fr.inria.diverse.trace.api.IStep>> getStepsForStates(
			int startingState, int endingState) {

		final List<activitydiagramTrace.Steps.Step> rootSteps = this.traceRoot.getRootSteps();
		final List<activitydiagramTrace.States.State> states = this.traceRoot.getStatesTrace();
		final Map<activitydiagramTrace.Steps.Step, fr.inria.diverse.trace.api.IStep> step2IStep = new HashMap<>();
		final Map<fr.inria.diverse.trace.api.IStep, List<fr.inria.diverse.trace.api.IStep>> result = new HashMap<>();

		for (activitydiagramTrace.Steps.Step step : rootSteps) {
			final int stepStartingState = states.indexOf(step.getStartingState());
			final int stepEndingState = states.indexOf(step.getEndingState());
			if ((stepEndingState == -1 || stepEndingState > startingState) && stepStartingState < endingState) {
				getStepSubGraph(step, startingState, endingState, result, step2IStep);
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

		if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) {
			activitydiagramTrace.Steps.Activitydiagram_Activity_Execute step_cast = (activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Activity", "execute", startIndex,
					endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext) {
			activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext step_cast = (activitydiagramTrace.Steps.Activitydiagram_Activity_InitializeContext) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Activity", "initializeContext",
					startIndex, endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Reset) {
			activitydiagramTrace.Steps.Activitydiagram_Activity_Reset step_cast = (activitydiagramTrace.Steps.Activitydiagram_Activity_Reset) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Activity", "reset", startIndex,
					endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace) {
			activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace step_cast = (activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Activity", "writeTrace",
					startIndex, endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1) {
			activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1 step_cast = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "addTokens1",
					startIndex, endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) {
			activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute step_cast = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "execute",
					startIndex, endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1) {
			activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1 step_cast = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken1) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "removeToken1",
					startIndex, endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1) {
			activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1 step_cast = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "sendOffers1",
					startIndex, endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1) {
			activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1 step_cast = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode",
					"takeOfferdTokens1", startIndex, endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate) {
			activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate step_cast = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "terminate",
					startIndex, endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Variable_Execute) {
			activitydiagramTrace.Steps.Activitydiagram_Variable_Execute step_cast = (activitydiagramTrace.Steps.Activitydiagram_Variable_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Variable", "execute", startIndex,
					endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Variable_Init) {
			activitydiagramTrace.Steps.Activitydiagram_Variable_Init step_cast = (activitydiagramTrace.Steps.Activitydiagram_Variable_Init) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Variable", "init", startIndex,
					endIndex, parentStep);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddTokens1_ImplicitStep) {
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "implicitStep",
					startIndex, endIndex, parentStep);
			result.addParameter("this", step);
		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute_ImplicitStep) {
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "implicitStep",
					startIndex, endIndex, parentStep);
			result.addParameter("this", step);
		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_SendOffers1_ImplicitStep) {
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "implicitStep",
					startIndex, endIndex, parentStep);
			result.addParameter("this", step);
		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep) {
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.ActivityNode", "implicitStep",
					startIndex, endIndex, parentStep);
			result.addParameter("this", step);
		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Execute_ImplicitStep) {
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Activity", "implicitStep",
					startIndex, endIndex, parentStep);
			result.addParameter("this", step);
		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace_ImplicitStep) {
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Activity", "implicitStep",
					startIndex, endIndex, parentStep);
			result.addParameter("this", step);
		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Variable_Execute_ImplicitStep) {
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Variable", "implicitStep",
					startIndex, endIndex, parentStep);
			result.addParameter("this", step);
		} else if (step instanceof activitydiagramTrace.Steps.Activitydiagram_Variable_Init_ImplicitStep) {
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.GenericStep("activitydiagram.Variable", "implicitStep",
					startIndex, endIndex, parentStep);
			result.addParameter("this", step);
		}

		return result;
	}

	private fr.inria.diverse.trace.api.IStep createGenericStep(activitydiagramTrace.Steps.Step step) {
		return new fr.inria.diverse.trace.api.impl.LazyGenericStep(() -> {
			return generateStep(step);
		});
		
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		return allResources;
	}

}
