package org.modelexecution.operationalsemantics.gemoc.sequential.trace.tracemanager;

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

public class ActivitydiagramTraceManager implements fr.inria.diverse.trace.gemoc.api.IGemocTraceManager {

	private activitydiagramTrace.Trace traceRoot;
	private Resource executedModel;

	private Map<EObject, EObject> exeToTraced;

	private activitydiagramTrace.States.State lastState;
	private List<IValueTrace> traces;

	private Resource traceResource;
	private Deque<activitydiagramTrace.Steps.Step> context = new LinkedList<activitydiagramTrace.Steps.Step>();
	private static final List<String> bigSteps = Arrays.asList("Activitydiagram_ActivityNode_AddTokens1",
			"Activitydiagram_ActivityNode_Execute", "Activitydiagram_ActivityNode_TakeOfferdTokens1",
			"Activitydiagram_Activity_Execute", "Activitydiagram_Activity_WriteTrace");

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
				 * Storing the state of a activitydiagram.Trace object
				 */
				if (o instanceof activitydiagram.Trace) {

					activitydiagram.Trace o_cast = (activitydiagram.Trace) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedTrace tracedObject = (activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Trace_executedNodes_Value> localTrace1 = tracedObject
							.getExecutedNodesSequence();
					activitydiagramTrace.States.Trace_executedNodes_Value previousValue1 = null;
					if (!localTrace1.isEmpty())
						previousValue1 = localTrace1.get(localTrace1.size() - 1);

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
					List<activitydiagramTrace.States.ActivityNode_activity_Value> localTrace2 = tracedObject
							.getActivitySequence();
					activitydiagramTrace.States.ActivityNode_activity_Value previousValue2 = null;
					if (!localTrace2.isEmpty())
						previousValue2 = localTrace2.get(localTrace2.size() - 1);

					storeAsTracedObject(o_cast.getActivity());

					activitydiagramTrace.States.activitydiagram.TracedActivity content1 = null;
					if (o_cast.getActivity() != null)
						content1 = ((activitydiagramTrace.States.activitydiagram.TracedActivity) exeToTraced.get(o_cast
								.getActivity()));

					boolean noChange2 = previousValue2 != null && previousValue2.getActivity() == content1;

					if (noChange2) {
						newState.getActivityNode_activity_Values().add(previousValue2);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_activity_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_activity_Value();

						newValue.setActivity(content1);

						tracedObject.getActivitySequence().add(newValue);
						newState.getActivityNode_activity_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> localTrace3 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue3 = null;
					if (!localTrace3.isEmpty())
						previousValue3 = localTrace3.get(localTrace3.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange3 = true;
					if (previousValue3 != null) {

						if (previousValue3.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue3
									.getHeldTokens()) {
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
						newState.getActivityNode_heldTokens_Values().add(previousValue3);

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

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_incoming_Value> localTrace4 = tracedObject
							.getIncomingSequence();
					activitydiagramTrace.States.ActivityNode_incoming_Value previousValue4 = null;
					if (!localTrace4.isEmpty())
						previousValue4 = localTrace4.get(localTrace4.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getIncoming()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange4 = true;
					if (previousValue4 != null) {

						if (previousValue4.getIncoming().size() == o_cast.getIncoming().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getIncoming().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue4
									.getIncoming()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
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
						newState.getActivityNode_incoming_Values().add(previousValue4);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_incoming_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_incoming_Value();

						newValue.getIncoming()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getIncoming()));

						tracedObject.getIncomingSequence().add(newValue);
						newState.getActivityNode_incoming_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_outgoing_Value> localTrace5 = tracedObject
							.getOutgoingSequence();
					activitydiagramTrace.States.ActivityNode_outgoing_Value previousValue5 = null;
					if (!localTrace5.isEmpty())
						previousValue5 = localTrace5.get(localTrace5.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getOutgoing()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange5 = true;
					if (previousValue5 != null) {

						if (previousValue5.getOutgoing().size() == o_cast.getOutgoing().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getOutgoing().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue5
									.getOutgoing()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
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
						newState.getActivityNode_outgoing_Values().add(previousValue5);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_outgoing_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_outgoing_Value();

						newValue.getOutgoing()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getOutgoing()));

						tracedObject.getOutgoingSequence().add(newValue);
						newState.getActivityNode_outgoing_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_running_Value> localTrace6 = tracedObject
							.getRunningSequence();
					activitydiagramTrace.States.ActivityNode_running_Value previousValue6 = null;
					if (!localTrace6.isEmpty())
						previousValue6 = localTrace6.get(localTrace6.size() - 1);

					boolean content2 = o_cast.isRunning();

					boolean noChange6 = previousValue6 != null && previousValue6.isRunning() == content2;

					if (noChange6) {
						newState.getActivityNode_running_Values().add(previousValue6);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_running_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_running_Value();

						newValue.setRunning(content2);

						tracedObject.getRunningSequence().add(newValue);
						newState.getActivityNode_running_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.NamedElement_name_Value> localTrace7 = tracedObject
							.getNameSequence();
					activitydiagramTrace.States.NamedElement_name_Value previousValue7 = null;
					if (!localTrace7.isEmpty())
						previousValue7 = localTrace7.get(localTrace7.size() - 1);

					java.lang.String content3 = o_cast.getName();

					boolean noChange7 = previousValue7 != null && previousValue7.getName() == content3;

					if (noChange7) {
						newState.getNamedElement_name_Values().add(previousValue7);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.NamedElement_name_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createNamedElement_name_Value();

						newValue.setName(content3);

						tracedObject.getNameSequence().add(newValue);
						newState.getNamedElement_name_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.OpaqueAction_expressions_Value> localTrace8 = tracedObject
							.getExpressionsSequence();
					activitydiagramTrace.States.OpaqueAction_expressions_Value previousValue8 = null;
					if (!localTrace8.isEmpty())
						previousValue8 = localTrace8.get(localTrace8.size() - 1);

					for (activitydiagram.Expression aValue : o_cast.getExpressions()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange8 = true;
					if (previousValue8 != null) {

						if (previousValue8.getExpressions().size() == o_cast.getExpressions().size()) {

							java.util.Iterator<activitydiagram.Expression> it = o_cast.getExpressions().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedExpression aPreviousValue : previousValue8
									.getExpressions()) {
								activitydiagram.Expression aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange8 = false;
									break;
								}
							}

						} else {
							noChange8 = false;
						}
					} else {
						noChange8 = false;
					}

					if (noChange8) {
						newState.getOpaqueAction_expressions_Values().add(previousValue8);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.OpaqueAction_expressions_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createOpaqueAction_expressions_Value();

						newValue.getExpressions()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedExpression>) getExeToTraced(o_cast
										.getExpressions()));

						tracedObject.getExpressionsSequence().add(newValue);
						newState.getOpaqueAction_expressions_Values().add(newValue);
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
					List<activitydiagramTrace.States.Offer_offeredTokens_Value> localTrace9 = tracedObject
							.getOfferedTokensSequence();
					activitydiagramTrace.States.Offer_offeredTokens_Value previousValue9 = null;
					if (!localTrace9.isEmpty())
						previousValue9 = localTrace9.get(localTrace9.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getOfferedTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange9 = true;
					if (previousValue9 != null) {

						if (previousValue9.getOfferedTokens().size() == o_cast.getOfferedTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getOfferedTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue9
									.getOfferedTokens()) {
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
						newState.getOffer_offeredTokens_Values().add(previousValue9);

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
					List<activitydiagramTrace.States.ActivityNode_activity_Value> localTrace10 = tracedObject
							.getActivitySequence();
					activitydiagramTrace.States.ActivityNode_activity_Value previousValue10 = null;
					if (!localTrace10.isEmpty())
						previousValue10 = localTrace10.get(localTrace10.size() - 1);

					storeAsTracedObject(o_cast.getActivity());

					activitydiagramTrace.States.activitydiagram.TracedActivity content4 = null;
					if (o_cast.getActivity() != null)
						content4 = ((activitydiagramTrace.States.activitydiagram.TracedActivity) exeToTraced.get(o_cast
								.getActivity()));

					boolean noChange10 = previousValue10 != null && previousValue10.getActivity() == content4;

					if (noChange10) {
						newState.getActivityNode_activity_Values().add(previousValue10);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_activity_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_activity_Value();

						newValue.setActivity(content4);

						tracedObject.getActivitySequence().add(newValue);
						newState.getActivityNode_activity_Values().add(newValue);
					}

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

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_incoming_Value> localTrace12 = tracedObject
							.getIncomingSequence();
					activitydiagramTrace.States.ActivityNode_incoming_Value previousValue12 = null;
					if (!localTrace12.isEmpty())
						previousValue12 = localTrace12.get(localTrace12.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getIncoming()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange12 = true;
					if (previousValue12 != null) {

						if (previousValue12.getIncoming().size() == o_cast.getIncoming().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getIncoming().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue12
									.getIncoming()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange12 = false;
									break;
								}
							}

						} else {
							noChange12 = false;
						}
					} else {
						noChange12 = false;
					}

					if (noChange12) {
						newState.getActivityNode_incoming_Values().add(previousValue12);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_incoming_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_incoming_Value();

						newValue.getIncoming()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getIncoming()));

						tracedObject.getIncomingSequence().add(newValue);
						newState.getActivityNode_incoming_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_outgoing_Value> localTrace13 = tracedObject
							.getOutgoingSequence();
					activitydiagramTrace.States.ActivityNode_outgoing_Value previousValue13 = null;
					if (!localTrace13.isEmpty())
						previousValue13 = localTrace13.get(localTrace13.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getOutgoing()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange13 = true;
					if (previousValue13 != null) {

						if (previousValue13.getOutgoing().size() == o_cast.getOutgoing().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getOutgoing().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue13
									.getOutgoing()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange13 = false;
									break;
								}
							}

						} else {
							noChange13 = false;
						}
					} else {
						noChange13 = false;
					}

					if (noChange13) {
						newState.getActivityNode_outgoing_Values().add(previousValue13);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_outgoing_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_outgoing_Value();

						newValue.getOutgoing()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getOutgoing()));

						tracedObject.getOutgoingSequence().add(newValue);
						newState.getActivityNode_outgoing_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_running_Value> localTrace14 = tracedObject
							.getRunningSequence();
					activitydiagramTrace.States.ActivityNode_running_Value previousValue14 = null;
					if (!localTrace14.isEmpty())
						previousValue14 = localTrace14.get(localTrace14.size() - 1);

					boolean content5 = o_cast.isRunning();

					boolean noChange14 = previousValue14 != null && previousValue14.isRunning() == content5;

					if (noChange14) {
						newState.getActivityNode_running_Values().add(previousValue14);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_running_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_running_Value();

						newValue.setRunning(content5);

						tracedObject.getRunningSequence().add(newValue);
						newState.getActivityNode_running_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.NamedElement_name_Value> localTrace15 = tracedObject
							.getNameSequence();
					activitydiagramTrace.States.NamedElement_name_Value previousValue15 = null;
					if (!localTrace15.isEmpty())
						previousValue15 = localTrace15.get(localTrace15.size() - 1);

					java.lang.String content6 = o_cast.getName();

					boolean noChange15 = previousValue15 != null && previousValue15.getName() == content6;

					if (noChange15) {
						newState.getNamedElement_name_Values().add(previousValue15);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.NamedElement_name_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createNamedElement_name_Value();

						newValue.setName(content6);

						tracedObject.getNameSequence().add(newValue);
						newState.getNamedElement_name_Values().add(newValue);
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
					List<activitydiagramTrace.States.ActivityNode_activity_Value> localTrace16 = tracedObject
							.getActivitySequence();
					activitydiagramTrace.States.ActivityNode_activity_Value previousValue16 = null;
					if (!localTrace16.isEmpty())
						previousValue16 = localTrace16.get(localTrace16.size() - 1);

					storeAsTracedObject(o_cast.getActivity());

					activitydiagramTrace.States.activitydiagram.TracedActivity content7 = null;
					if (o_cast.getActivity() != null)
						content7 = ((activitydiagramTrace.States.activitydiagram.TracedActivity) exeToTraced.get(o_cast
								.getActivity()));

					boolean noChange16 = previousValue16 != null && previousValue16.getActivity() == content7;

					if (noChange16) {
						newState.getActivityNode_activity_Values().add(previousValue16);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_activity_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_activity_Value();

						newValue.setActivity(content7);

						tracedObject.getActivitySequence().add(newValue);
						newState.getActivityNode_activity_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> localTrace17 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue17 = null;
					if (!localTrace17.isEmpty())
						previousValue17 = localTrace17.get(localTrace17.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange17 = true;
					if (previousValue17 != null) {

						if (previousValue17.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue17
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
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
						newState.getActivityNode_heldTokens_Values().add(previousValue17);

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

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_incoming_Value> localTrace18 = tracedObject
							.getIncomingSequence();
					activitydiagramTrace.States.ActivityNode_incoming_Value previousValue18 = null;
					if (!localTrace18.isEmpty())
						previousValue18 = localTrace18.get(localTrace18.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getIncoming()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange18 = true;
					if (previousValue18 != null) {

						if (previousValue18.getIncoming().size() == o_cast.getIncoming().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getIncoming().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue18
									.getIncoming()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
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
						newState.getActivityNode_incoming_Values().add(previousValue18);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_incoming_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_incoming_Value();

						newValue.getIncoming()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getIncoming()));

						tracedObject.getIncomingSequence().add(newValue);
						newState.getActivityNode_incoming_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_outgoing_Value> localTrace19 = tracedObject
							.getOutgoingSequence();
					activitydiagramTrace.States.ActivityNode_outgoing_Value previousValue19 = null;
					if (!localTrace19.isEmpty())
						previousValue19 = localTrace19.get(localTrace19.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getOutgoing()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange19 = true;
					if (previousValue19 != null) {

						if (previousValue19.getOutgoing().size() == o_cast.getOutgoing().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getOutgoing().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue19
									.getOutgoing()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
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
						newState.getActivityNode_outgoing_Values().add(previousValue19);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_outgoing_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_outgoing_Value();

						newValue.getOutgoing()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getOutgoing()));

						tracedObject.getOutgoingSequence().add(newValue);
						newState.getActivityNode_outgoing_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_running_Value> localTrace20 = tracedObject
							.getRunningSequence();
					activitydiagramTrace.States.ActivityNode_running_Value previousValue20 = null;
					if (!localTrace20.isEmpty())
						previousValue20 = localTrace20.get(localTrace20.size() - 1);

					boolean content8 = o_cast.isRunning();

					boolean noChange20 = previousValue20 != null && previousValue20.isRunning() == content8;

					if (noChange20) {
						newState.getActivityNode_running_Values().add(previousValue20);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_running_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_running_Value();

						newValue.setRunning(content8);

						tracedObject.getRunningSequence().add(newValue);
						newState.getActivityNode_running_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.NamedElement_name_Value> localTrace21 = tracedObject
							.getNameSequence();
					activitydiagramTrace.States.NamedElement_name_Value previousValue21 = null;
					if (!localTrace21.isEmpty())
						previousValue21 = localTrace21.get(localTrace21.size() - 1);

					java.lang.String content9 = o_cast.getName();

					boolean noChange21 = previousValue21 != null && previousValue21.getName() == content9;

					if (noChange21) {
						newState.getNamedElement_name_Values().add(previousValue21);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.NamedElement_name_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createNamedElement_name_Value();

						newValue.setName(content9);

						tracedObject.getNameSequence().add(newValue);
						newState.getNamedElement_name_Values().add(newValue);
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
					List<activitydiagramTrace.States.Variable_currentValue_Value> localTrace22 = tracedObject
							.getCurrentValueSequence();
					activitydiagramTrace.States.Variable_currentValue_Value previousValue22 = null;
					if (!localTrace22.isEmpty())
						previousValue22 = localTrace22.get(localTrace22.size() - 1);

					storeAsTracedObject(o_cast.getCurrentValue());

					activitydiagramTrace.States.activitydiagram.TracedValue content10 = null;
					if (o_cast.getCurrentValue() != null)
						content10 = ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced.get(o_cast
								.getCurrentValue()));

					boolean noChange22 = previousValue22 != null && previousValue22.getCurrentValue() == content10;

					if (noChange22) {
						newState.getVariable_currentValue_Values().add(previousValue22);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Variable_currentValue_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createVariable_currentValue_Value();

						newValue.setCurrentValue(content10);

						tracedObject.getCurrentValueSequence().add(newValue);
						newState.getVariable_currentValue_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Variable_initialValue_Value> localTrace23 = tracedObject
							.getInitialValueSequence();
					activitydiagramTrace.States.Variable_initialValue_Value previousValue23 = null;
					if (!localTrace23.isEmpty())
						previousValue23 = localTrace23.get(localTrace23.size() - 1);

					storeAsTracedObject(o_cast.getInitialValue());

					activitydiagramTrace.States.activitydiagram.TracedValue content11 = null;
					if (o_cast.getInitialValue() != null)
						content11 = ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced.get(o_cast
								.getInitialValue()));

					boolean noChange23 = previousValue23 != null && previousValue23.getInitialValue() == content11;

					if (noChange23) {
						newState.getVariable_initialValue_Values().add(previousValue23);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Variable_initialValue_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createVariable_initialValue_Value();

						newValue.setInitialValue(content11);

						tracedObject.getInitialValueSequence().add(newValue);
						newState.getVariable_initialValue_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Variable_name_Value> localTrace24 = tracedObject.getNameSequence();
					activitydiagramTrace.States.Variable_name_Value previousValue24 = null;
					if (!localTrace24.isEmpty())
						previousValue24 = localTrace24.get(localTrace24.size() - 1);

					java.lang.String content12 = o_cast.getName();

					boolean noChange24 = previousValue24 != null && previousValue24.getName() == content12;

					if (noChange24) {
						newState.getVariable_name_Values().add(previousValue24);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Variable_name_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createVariable_name_Value();

						newValue.setName(content12);

						tracedObject.getNameSequence().add(newValue);
						newState.getVariable_name_Values().add(newValue);
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
					List<activitydiagramTrace.States.IntegerValue_value_Value> localTrace25 = tracedObject
							.getValueSequence();
					activitydiagramTrace.States.IntegerValue_value_Value previousValue25 = null;
					if (!localTrace25.isEmpty())
						previousValue25 = localTrace25.get(localTrace25.size() - 1);

					int content13 = o_cast.getValue();

					boolean noChange25 = previousValue25 != null && previousValue25.getValue() == content13;

					if (noChange25) {
						newState.getIntegerValue_value_Values().add(previousValue25);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.IntegerValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createIntegerValue_value_Value();

						newValue.setValue(content13);

						tracedObject.getValueSequence().add(newValue);
						newState.getIntegerValue_value_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.IntegerComparisonExpression object
				 */
				if (o instanceof activitydiagram.IntegerComparisonExpression) {

					activitydiagram.IntegerComparisonExpression o_cast = (activitydiagram.IntegerComparisonExpression) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression tracedObject = (activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value> localTrace26 = tracedObject
							.getAssigneeSequence();
					activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value previousValue26 = null;
					if (!localTrace26.isEmpty())
						previousValue26 = localTrace26.get(localTrace26.size() - 1);

					storeAsTracedObject(o_cast.getAssignee());

					activitydiagramTrace.States.activitydiagram.TracedBooleanVariable content14 = null;
					if (o_cast.getAssignee() != null)
						content14 = ((activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) exeToTraced
								.get(o_cast.getAssignee()));

					boolean noChange26 = previousValue26 != null && previousValue26.getAssignee() == content14;

					if (noChange26) {
						newState.getIntegerComparisonExpression_assignee_Values().add(previousValue26);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createIntegerComparisonExpression_assignee_Value();

						newValue.setAssignee(content14);

						tracedObject.getAssigneeSequence().add(newValue);
						newState.getIntegerComparisonExpression_assignee_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.IntegerComparisonExpression_operator_Value> localTrace27 = tracedObject
							.getOperatorSequence();
					activitydiagramTrace.States.IntegerComparisonExpression_operator_Value previousValue27 = null;
					if (!localTrace27.isEmpty())
						previousValue27 = localTrace27.get(localTrace27.size() - 1);

					activitydiagram.IntegerComparisonOperator content15 = o_cast.getOperator();

					boolean noChange27 = previousValue27 != null && previousValue27.getOperator() == content15;

					if (noChange27) {
						newState.getIntegerComparisonExpression_operator_Values().add(previousValue27);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.IntegerComparisonExpression_operator_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createIntegerComparisonExpression_operator_Value();

						newValue.setOperator(content15);

						tracedObject.getOperatorSequence().add(newValue);
						newState.getIntegerComparisonExpression_operator_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.IntegerExpression_operand1_Value> localTrace28 = tracedObject
							.getOperand1Sequence();
					activitydiagramTrace.States.IntegerExpression_operand1_Value previousValue28 = null;
					if (!localTrace28.isEmpty())
						previousValue28 = localTrace28.get(localTrace28.size() - 1);

					storeAsTracedObject(o_cast.getOperand1());

					activitydiagramTrace.States.activitydiagram.TracedIntegerVariable content16 = null;
					if (o_cast.getOperand1() != null)
						content16 = ((activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) exeToTraced
								.get(o_cast.getOperand1()));

					boolean noChange28 = previousValue28 != null && previousValue28.getOperand1() == content16;

					if (noChange28) {
						newState.getIntegerExpression_operand1_Values().add(previousValue28);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.IntegerExpression_operand1_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createIntegerExpression_operand1_Value();

						newValue.setOperand1(content16);

						tracedObject.getOperand1Sequence().add(newValue);
						newState.getIntegerExpression_operand1_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.IntegerExpression_operand2_Value> localTrace29 = tracedObject
							.getOperand2Sequence();
					activitydiagramTrace.States.IntegerExpression_operand2_Value previousValue29 = null;
					if (!localTrace29.isEmpty())
						previousValue29 = localTrace29.get(localTrace29.size() - 1);

					storeAsTracedObject(o_cast.getOperand2());

					activitydiagramTrace.States.activitydiagram.TracedIntegerVariable content17 = null;
					if (o_cast.getOperand2() != null)
						content17 = ((activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) exeToTraced
								.get(o_cast.getOperand2()));

					boolean noChange29 = previousValue29 != null && previousValue29.getOperand2() == content17;

					if (noChange29) {
						newState.getIntegerExpression_operand2_Values().add(previousValue29);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.IntegerExpression_operand2_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createIntegerExpression_operand2_Value();

						newValue.setOperand2(content17);

						tracedObject.getOperand2Sequence().add(newValue);
						newState.getIntegerExpression_operand2_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.IntegerCalculationExpression object
				 */
				if (o instanceof activitydiagram.IntegerCalculationExpression) {

					activitydiagram.IntegerCalculationExpression o_cast = (activitydiagram.IntegerCalculationExpression) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression tracedObject = (activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value> localTrace30 = tracedObject
							.getAssigneeSequence();
					activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value previousValue30 = null;
					if (!localTrace30.isEmpty())
						previousValue30 = localTrace30.get(localTrace30.size() - 1);

					storeAsTracedObject(o_cast.getAssignee());

					activitydiagramTrace.States.activitydiagram.TracedIntegerVariable content18 = null;
					if (o_cast.getAssignee() != null)
						content18 = ((activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) exeToTraced
								.get(o_cast.getAssignee()));

					boolean noChange30 = previousValue30 != null && previousValue30.getAssignee() == content18;

					if (noChange30) {
						newState.getIntegerCalculationExpression_assignee_Values().add(previousValue30);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createIntegerCalculationExpression_assignee_Value();

						newValue.setAssignee(content18);

						tracedObject.getAssigneeSequence().add(newValue);
						newState.getIntegerCalculationExpression_assignee_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.IntegerCalculationExpression_operator_Value> localTrace31 = tracedObject
							.getOperatorSequence();
					activitydiagramTrace.States.IntegerCalculationExpression_operator_Value previousValue31 = null;
					if (!localTrace31.isEmpty())
						previousValue31 = localTrace31.get(localTrace31.size() - 1);

					activitydiagram.IntegerCalculationOperator content19 = o_cast.getOperator();

					boolean noChange31 = previousValue31 != null && previousValue31.getOperator() == content19;

					if (noChange31) {
						newState.getIntegerCalculationExpression_operator_Values().add(previousValue31);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.IntegerCalculationExpression_operator_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createIntegerCalculationExpression_operator_Value();

						newValue.setOperator(content19);

						tracedObject.getOperatorSequence().add(newValue);
						newState.getIntegerCalculationExpression_operator_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.IntegerExpression_operand1_Value> localTrace32 = tracedObject
							.getOperand1Sequence();
					activitydiagramTrace.States.IntegerExpression_operand1_Value previousValue32 = null;
					if (!localTrace32.isEmpty())
						previousValue32 = localTrace32.get(localTrace32.size() - 1);

					storeAsTracedObject(o_cast.getOperand1());

					activitydiagramTrace.States.activitydiagram.TracedIntegerVariable content20 = null;
					if (o_cast.getOperand1() != null)
						content20 = ((activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) exeToTraced
								.get(o_cast.getOperand1()));

					boolean noChange32 = previousValue32 != null && previousValue32.getOperand1() == content20;

					if (noChange32) {
						newState.getIntegerExpression_operand1_Values().add(previousValue32);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.IntegerExpression_operand1_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createIntegerExpression_operand1_Value();

						newValue.setOperand1(content20);

						tracedObject.getOperand1Sequence().add(newValue);
						newState.getIntegerExpression_operand1_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.IntegerExpression_operand2_Value> localTrace33 = tracedObject
							.getOperand2Sequence();
					activitydiagramTrace.States.IntegerExpression_operand2_Value previousValue33 = null;
					if (!localTrace33.isEmpty())
						previousValue33 = localTrace33.get(localTrace33.size() - 1);

					storeAsTracedObject(o_cast.getOperand2());

					activitydiagramTrace.States.activitydiagram.TracedIntegerVariable content21 = null;
					if (o_cast.getOperand2() != null)
						content21 = ((activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) exeToTraced
								.get(o_cast.getOperand2()));

					boolean noChange33 = previousValue33 != null && previousValue33.getOperand2() == content21;

					if (noChange33) {
						newState.getIntegerExpression_operand2_Values().add(previousValue33);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.IntegerExpression_operand2_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createIntegerExpression_operand2_Value();

						newValue.setOperand2(content21);

						tracedObject.getOperand2Sequence().add(newValue);
						newState.getIntegerExpression_operand2_Values().add(newValue);
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
					List<activitydiagramTrace.States.InputValue_value_Value> localTrace34 = tracedObject
							.getValueSequence();
					activitydiagramTrace.States.InputValue_value_Value previousValue34 = null;
					if (!localTrace34.isEmpty())
						previousValue34 = localTrace34.get(localTrace34.size() - 1);

					storeAsTracedObject(o_cast.getValue());

					activitydiagramTrace.States.activitydiagram.TracedValue content22 = null;
					if (o_cast.getValue() != null)
						content22 = ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced.get(o_cast
								.getValue()));

					boolean noChange34 = previousValue34 != null && previousValue34.getValue() == content22;

					if (noChange34) {
						newState.getInputValue_value_Values().add(previousValue34);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.InputValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createInputValue_value_Value();

						newValue.setValue(content22);

						tracedObject.getValueSequence().add(newValue);
						newState.getInputValue_value_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.InputValue_variable_Value> localTrace35 = tracedObject
							.getVariableSequence();
					activitydiagramTrace.States.InputValue_variable_Value previousValue35 = null;
					if (!localTrace35.isEmpty())
						previousValue35 = localTrace35.get(localTrace35.size() - 1);

					storeAsTracedObject(o_cast.getVariable());

					activitydiagramTrace.States.activitydiagram.TracedVariable content23 = null;
					if (o_cast.getVariable() != null)
						content23 = ((activitydiagramTrace.States.activitydiagram.TracedVariable) exeToTraced
								.get(o_cast.getVariable()));

					boolean noChange35 = previousValue35 != null && previousValue35.getVariable() == content23;

					if (noChange35) {
						newState.getInputValue_variable_Values().add(previousValue35);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.InputValue_variable_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createInputValue_variable_Value();

						newValue.setVariable(content23);

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
					List<activitydiagramTrace.States.Input_inputValues_Value> localTrace36 = tracedObject
							.getInputValuesSequence();
					activitydiagramTrace.States.Input_inputValues_Value previousValue36 = null;
					if (!localTrace36.isEmpty())
						previousValue36 = localTrace36.get(localTrace36.size() - 1);

					for (activitydiagram.InputValue aValue : o_cast.getInputValues()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange36 = true;
					if (previousValue36 != null) {

						if (previousValue36.getInputValues().size() == o_cast.getInputValues().size()) {

							java.util.Iterator<activitydiagram.InputValue> it = o_cast.getInputValues().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedInputValue aPreviousValue : previousValue36
									.getInputValues()) {
								activitydiagram.InputValue aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange36 = false;
									break;
								}
							}

						} else {
							noChange36 = false;
						}
					} else {
						noChange36 = false;
					}

					if (noChange36) {
						newState.getInput_inputValues_Values().add(previousValue36);

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
					List<activitydiagramTrace.States.ActivityNode_activity_Value> localTrace37 = tracedObject
							.getActivitySequence();
					activitydiagramTrace.States.ActivityNode_activity_Value previousValue37 = null;
					if (!localTrace37.isEmpty())
						previousValue37 = localTrace37.get(localTrace37.size() - 1);

					storeAsTracedObject(o_cast.getActivity());

					activitydiagramTrace.States.activitydiagram.TracedActivity content24 = null;
					if (o_cast.getActivity() != null)
						content24 = ((activitydiagramTrace.States.activitydiagram.TracedActivity) exeToTraced
								.get(o_cast.getActivity()));

					boolean noChange37 = previousValue37 != null && previousValue37.getActivity() == content24;

					if (noChange37) {
						newState.getActivityNode_activity_Values().add(previousValue37);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_activity_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_activity_Value();

						newValue.setActivity(content24);

						tracedObject.getActivitySequence().add(newValue);
						newState.getActivityNode_activity_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> localTrace38 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue38 = null;
					if (!localTrace38.isEmpty())
						previousValue38 = localTrace38.get(localTrace38.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange38 = true;
					if (previousValue38 != null) {

						if (previousValue38.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue38
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange38 = false;
									break;
								}
							}

						} else {
							noChange38 = false;
						}
					} else {
						noChange38 = false;
					}

					if (noChange38) {
						newState.getActivityNode_heldTokens_Values().add(previousValue38);

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

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_incoming_Value> localTrace39 = tracedObject
							.getIncomingSequence();
					activitydiagramTrace.States.ActivityNode_incoming_Value previousValue39 = null;
					if (!localTrace39.isEmpty())
						previousValue39 = localTrace39.get(localTrace39.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getIncoming()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange39 = true;
					if (previousValue39 != null) {

						if (previousValue39.getIncoming().size() == o_cast.getIncoming().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getIncoming().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue39
									.getIncoming()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange39 = false;
									break;
								}
							}

						} else {
							noChange39 = false;
						}
					} else {
						noChange39 = false;
					}

					if (noChange39) {
						newState.getActivityNode_incoming_Values().add(previousValue39);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_incoming_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_incoming_Value();

						newValue.getIncoming()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getIncoming()));

						tracedObject.getIncomingSequence().add(newValue);
						newState.getActivityNode_incoming_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_outgoing_Value> localTrace40 = tracedObject
							.getOutgoingSequence();
					activitydiagramTrace.States.ActivityNode_outgoing_Value previousValue40 = null;
					if (!localTrace40.isEmpty())
						previousValue40 = localTrace40.get(localTrace40.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getOutgoing()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange40 = true;
					if (previousValue40 != null) {

						if (previousValue40.getOutgoing().size() == o_cast.getOutgoing().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getOutgoing().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue40
									.getOutgoing()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange40 = false;
									break;
								}
							}

						} else {
							noChange40 = false;
						}
					} else {
						noChange40 = false;
					}

					if (noChange40) {
						newState.getActivityNode_outgoing_Values().add(previousValue40);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_outgoing_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_outgoing_Value();

						newValue.getOutgoing()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getOutgoing()));

						tracedObject.getOutgoingSequence().add(newValue);
						newState.getActivityNode_outgoing_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_running_Value> localTrace41 = tracedObject
							.getRunningSequence();
					activitydiagramTrace.States.ActivityNode_running_Value previousValue41 = null;
					if (!localTrace41.isEmpty())
						previousValue41 = localTrace41.get(localTrace41.size() - 1);

					boolean content25 = o_cast.isRunning();

					boolean noChange41 = previousValue41 != null && previousValue41.isRunning() == content25;

					if (noChange41) {
						newState.getActivityNode_running_Values().add(previousValue41);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_running_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_running_Value();

						newValue.setRunning(content25);

						tracedObject.getRunningSequence().add(newValue);
						newState.getActivityNode_running_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.NamedElement_name_Value> localTrace42 = tracedObject
							.getNameSequence();
					activitydiagramTrace.States.NamedElement_name_Value previousValue42 = null;
					if (!localTrace42.isEmpty())
						previousValue42 = localTrace42.get(localTrace42.size() - 1);

					java.lang.String content26 = o_cast.getName();

					boolean noChange42 = previousValue42 != null && previousValue42.getName() == content26;

					if (noChange42) {
						newState.getNamedElement_name_Values().add(previousValue42);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.NamedElement_name_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createNamedElement_name_Value();

						newValue.setName(content26);

						tracedObject.getNameSequence().add(newValue);
						newState.getNamedElement_name_Values().add(newValue);
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
					List<activitydiagramTrace.States.ForkedToken_baseToken_Value> localTrace43 = tracedObject
							.getBaseTokenSequence();
					activitydiagramTrace.States.ForkedToken_baseToken_Value previousValue43 = null;
					if (!localTrace43.isEmpty())
						previousValue43 = localTrace43.get(localTrace43.size() - 1);

					storeAsTracedObject(o_cast.getBaseToken());

					activitydiagramTrace.States.activitydiagram.TracedToken content27 = null;
					if (o_cast.getBaseToken() != null)
						content27 = ((activitydiagramTrace.States.activitydiagram.TracedToken) exeToTraced.get(o_cast
								.getBaseToken()));

					boolean noChange43 = previousValue43 != null && previousValue43.getBaseToken() == content27;

					if (noChange43) {
						newState.getForkedToken_baseToken_Values().add(previousValue43);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ForkedToken_baseToken_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createForkedToken_baseToken_Value();

						newValue.setBaseToken(content27);

						tracedObject.getBaseTokenSequence().add(newValue);
						newState.getForkedToken_baseToken_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value> localTrace44 = tracedObject
							.getRemainingOffersCountSequence();
					activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value previousValue44 = null;
					if (!localTrace44.isEmpty())
						previousValue44 = localTrace44.get(localTrace44.size() - 1);

					int content28 = o_cast.getRemainingOffersCount();

					boolean noChange44 = previousValue44 != null
							&& previousValue44.getRemainingOffersCount() == content28;

					if (noChange44) {
						newState.getForkedToken_remainingOffersCount_Values().add(previousValue44);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createForkedToken_remainingOffersCount_Value();

						newValue.setRemainingOffersCount(content28);

						tracedObject.getRemainingOffersCountSequence().add(newValue);
						newState.getForkedToken_remainingOffersCount_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Token_holder_Value> localTrace45 = tracedObject
							.getHolderSequence();
					activitydiagramTrace.States.Token_holder_Value previousValue45 = null;
					if (!localTrace45.isEmpty())
						previousValue45 = localTrace45.get(localTrace45.size() - 1);

					storeAsTracedObject(o_cast.getHolder());

					activitydiagramTrace.States.activitydiagram.TracedActivityNode content29 = null;
					if (o_cast.getHolder() != null)
						content29 = ((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast.getHolder()));

					boolean noChange45 = previousValue45 != null && previousValue45.getHolder() == content29;

					if (noChange45) {
						newState.getToken_holder_Values().add(previousValue45);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Token_holder_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createToken_holder_Value();

						newValue.setHolder(content29);

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
					List<activitydiagramTrace.States.ActivityNode_activity_Value> localTrace46 = tracedObject
							.getActivitySequence();
					activitydiagramTrace.States.ActivityNode_activity_Value previousValue46 = null;
					if (!localTrace46.isEmpty())
						previousValue46 = localTrace46.get(localTrace46.size() - 1);

					storeAsTracedObject(o_cast.getActivity());

					activitydiagramTrace.States.activitydiagram.TracedActivity content30 = null;
					if (o_cast.getActivity() != null)
						content30 = ((activitydiagramTrace.States.activitydiagram.TracedActivity) exeToTraced
								.get(o_cast.getActivity()));

					boolean noChange46 = previousValue46 != null && previousValue46.getActivity() == content30;

					if (noChange46) {
						newState.getActivityNode_activity_Values().add(previousValue46);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_activity_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_activity_Value();

						newValue.setActivity(content30);

						tracedObject.getActivitySequence().add(newValue);
						newState.getActivityNode_activity_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> localTrace47 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue47 = null;
					if (!localTrace47.isEmpty())
						previousValue47 = localTrace47.get(localTrace47.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange47 = true;
					if (previousValue47 != null) {

						if (previousValue47.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue47
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange47 = false;
									break;
								}
							}

						} else {
							noChange47 = false;
						}
					} else {
						noChange47 = false;
					}

					if (noChange47) {
						newState.getActivityNode_heldTokens_Values().add(previousValue47);

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

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_incoming_Value> localTrace48 = tracedObject
							.getIncomingSequence();
					activitydiagramTrace.States.ActivityNode_incoming_Value previousValue48 = null;
					if (!localTrace48.isEmpty())
						previousValue48 = localTrace48.get(localTrace48.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getIncoming()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange48 = true;
					if (previousValue48 != null) {

						if (previousValue48.getIncoming().size() == o_cast.getIncoming().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getIncoming().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue48
									.getIncoming()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange48 = false;
									break;
								}
							}

						} else {
							noChange48 = false;
						}
					} else {
						noChange48 = false;
					}

					if (noChange48) {
						newState.getActivityNode_incoming_Values().add(previousValue48);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_incoming_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_incoming_Value();

						newValue.getIncoming()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getIncoming()));

						tracedObject.getIncomingSequence().add(newValue);
						newState.getActivityNode_incoming_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_outgoing_Value> localTrace49 = tracedObject
							.getOutgoingSequence();
					activitydiagramTrace.States.ActivityNode_outgoing_Value previousValue49 = null;
					if (!localTrace49.isEmpty())
						previousValue49 = localTrace49.get(localTrace49.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getOutgoing()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange49 = true;
					if (previousValue49 != null) {

						if (previousValue49.getOutgoing().size() == o_cast.getOutgoing().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getOutgoing().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue49
									.getOutgoing()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange49 = false;
									break;
								}
							}

						} else {
							noChange49 = false;
						}
					} else {
						noChange49 = false;
					}

					if (noChange49) {
						newState.getActivityNode_outgoing_Values().add(previousValue49);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_outgoing_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_outgoing_Value();

						newValue.getOutgoing()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getOutgoing()));

						tracedObject.getOutgoingSequence().add(newValue);
						newState.getActivityNode_outgoing_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_running_Value> localTrace50 = tracedObject
							.getRunningSequence();
					activitydiagramTrace.States.ActivityNode_running_Value previousValue50 = null;
					if (!localTrace50.isEmpty())
						previousValue50 = localTrace50.get(localTrace50.size() - 1);

					boolean content31 = o_cast.isRunning();

					boolean noChange50 = previousValue50 != null && previousValue50.isRunning() == content31;

					if (noChange50) {
						newState.getActivityNode_running_Values().add(previousValue50);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_running_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_running_Value();

						newValue.setRunning(content31);

						tracedObject.getRunningSequence().add(newValue);
						newState.getActivityNode_running_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.NamedElement_name_Value> localTrace51 = tracedObject
							.getNameSequence();
					activitydiagramTrace.States.NamedElement_name_Value previousValue51 = null;
					if (!localTrace51.isEmpty())
						previousValue51 = localTrace51.get(localTrace51.size() - 1);

					java.lang.String content32 = o_cast.getName();

					boolean noChange51 = previousValue51 != null && previousValue51.getName() == content32;

					if (noChange51) {
						newState.getNamedElement_name_Values().add(previousValue51);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.NamedElement_name_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createNamedElement_name_Value();

						newValue.setName(content32);

						tracedObject.getNameSequence().add(newValue);
						newState.getNamedElement_name_Values().add(newValue);
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
					List<activitydiagramTrace.States.ActivityNode_activity_Value> localTrace52 = tracedObject
							.getActivitySequence();
					activitydiagramTrace.States.ActivityNode_activity_Value previousValue52 = null;
					if (!localTrace52.isEmpty())
						previousValue52 = localTrace52.get(localTrace52.size() - 1);

					storeAsTracedObject(o_cast.getActivity());

					activitydiagramTrace.States.activitydiagram.TracedActivity content33 = null;
					if (o_cast.getActivity() != null)
						content33 = ((activitydiagramTrace.States.activitydiagram.TracedActivity) exeToTraced
								.get(o_cast.getActivity()));

					boolean noChange52 = previousValue52 != null && previousValue52.getActivity() == content33;

					if (noChange52) {
						newState.getActivityNode_activity_Values().add(previousValue52);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_activity_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_activity_Value();

						newValue.setActivity(content33);

						tracedObject.getActivitySequence().add(newValue);
						newState.getActivityNode_activity_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> localTrace53 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue53 = null;
					if (!localTrace53.isEmpty())
						previousValue53 = localTrace53.get(localTrace53.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange53 = true;
					if (previousValue53 != null) {

						if (previousValue53.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue53
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange53 = false;
									break;
								}
							}

						} else {
							noChange53 = false;
						}
					} else {
						noChange53 = false;
					}

					if (noChange53) {
						newState.getActivityNode_heldTokens_Values().add(previousValue53);

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

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_incoming_Value> localTrace54 = tracedObject
							.getIncomingSequence();
					activitydiagramTrace.States.ActivityNode_incoming_Value previousValue54 = null;
					if (!localTrace54.isEmpty())
						previousValue54 = localTrace54.get(localTrace54.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getIncoming()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange54 = true;
					if (previousValue54 != null) {

						if (previousValue54.getIncoming().size() == o_cast.getIncoming().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getIncoming().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue54
									.getIncoming()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange54 = false;
									break;
								}
							}

						} else {
							noChange54 = false;
						}
					} else {
						noChange54 = false;
					}

					if (noChange54) {
						newState.getActivityNode_incoming_Values().add(previousValue54);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_incoming_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_incoming_Value();

						newValue.getIncoming()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getIncoming()));

						tracedObject.getIncomingSequence().add(newValue);
						newState.getActivityNode_incoming_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_outgoing_Value> localTrace55 = tracedObject
							.getOutgoingSequence();
					activitydiagramTrace.States.ActivityNode_outgoing_Value previousValue55 = null;
					if (!localTrace55.isEmpty())
						previousValue55 = localTrace55.get(localTrace55.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getOutgoing()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange55 = true;
					if (previousValue55 != null) {

						if (previousValue55.getOutgoing().size() == o_cast.getOutgoing().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getOutgoing().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue55
									.getOutgoing()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange55 = false;
									break;
								}
							}

						} else {
							noChange55 = false;
						}
					} else {
						noChange55 = false;
					}

					if (noChange55) {
						newState.getActivityNode_outgoing_Values().add(previousValue55);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_outgoing_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_outgoing_Value();

						newValue.getOutgoing()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getOutgoing()));

						tracedObject.getOutgoingSequence().add(newValue);
						newState.getActivityNode_outgoing_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_running_Value> localTrace56 = tracedObject
							.getRunningSequence();
					activitydiagramTrace.States.ActivityNode_running_Value previousValue56 = null;
					if (!localTrace56.isEmpty())
						previousValue56 = localTrace56.get(localTrace56.size() - 1);

					boolean content34 = o_cast.isRunning();

					boolean noChange56 = previousValue56 != null && previousValue56.isRunning() == content34;

					if (noChange56) {
						newState.getActivityNode_running_Values().add(previousValue56);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_running_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_running_Value();

						newValue.setRunning(content34);

						tracedObject.getRunningSequence().add(newValue);
						newState.getActivityNode_running_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.NamedElement_name_Value> localTrace57 = tracedObject
							.getNameSequence();
					activitydiagramTrace.States.NamedElement_name_Value previousValue57 = null;
					if (!localTrace57.isEmpty())
						previousValue57 = localTrace57.get(localTrace57.size() - 1);

					java.lang.String content35 = o_cast.getName();

					boolean noChange57 = previousValue57 != null && previousValue57.getName() == content35;

					if (noChange57) {
						newState.getNamedElement_name_Values().add(previousValue57);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.NamedElement_name_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createNamedElement_name_Value();

						newValue.setName(content35);

						tracedObject.getNameSequence().add(newValue);
						newState.getNamedElement_name_Values().add(newValue);
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
					List<activitydiagramTrace.States.Token_holder_Value> localTrace58 = tracedObject
							.getHolderSequence();
					activitydiagramTrace.States.Token_holder_Value previousValue58 = null;
					if (!localTrace58.isEmpty())
						previousValue58 = localTrace58.get(localTrace58.size() - 1);

					storeAsTracedObject(o_cast.getHolder());

					activitydiagramTrace.States.activitydiagram.TracedActivityNode content36 = null;
					if (o_cast.getHolder() != null)
						content36 = ((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast.getHolder()));

					boolean noChange58 = previousValue58 != null && previousValue58.getHolder() == content36;

					if (noChange58) {
						newState.getToken_holder_Values().add(previousValue58);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Token_holder_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createToken_holder_Value();

						newValue.setHolder(content36);

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
					List<activitydiagramTrace.States.ActivityEdge_offers_Value> localTrace59 = tracedObject
							.getOffersSequence();
					activitydiagramTrace.States.ActivityEdge_offers_Value previousValue59 = null;
					if (!localTrace59.isEmpty())
						previousValue59 = localTrace59.get(localTrace59.size() - 1);

					for (activitydiagram.Offer aValue : o_cast.getOffers()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange59 = true;
					if (previousValue59 != null) {

						if (previousValue59.getOffers().size() == o_cast.getOffers().size()) {

							java.util.Iterator<activitydiagram.Offer> it = o_cast.getOffers().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedOffer aPreviousValue : previousValue59
									.getOffers()) {
								activitydiagram.Offer aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange59 = false;
									break;
								}
							}

						} else {
							noChange59 = false;
						}
					} else {
						noChange59 = false;
					}

					if (noChange59) {
						newState.getActivityEdge_offers_Values().add(previousValue59);

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

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityEdge_source_Value> localTrace60 = tracedObject
							.getSourceSequence();
					activitydiagramTrace.States.ActivityEdge_source_Value previousValue60 = null;
					if (!localTrace60.isEmpty())
						previousValue60 = localTrace60.get(localTrace60.size() - 1);

					storeAsTracedObject(o_cast.getSource());

					activitydiagramTrace.States.activitydiagram.TracedActivityNode content37 = null;
					if (o_cast.getSource() != null)
						content37 = ((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast.getSource()));

					boolean noChange60 = previousValue60 != null && previousValue60.getSource() == content37;

					if (noChange60) {
						newState.getActivityEdge_source_Values().add(previousValue60);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityEdge_source_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityEdge_source_Value();

						newValue.setSource(content37);

						tracedObject.getSourceSequence().add(newValue);
						newState.getActivityEdge_source_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityEdge_target_Value> localTrace61 = tracedObject
							.getTargetSequence();
					activitydiagramTrace.States.ActivityEdge_target_Value previousValue61 = null;
					if (!localTrace61.isEmpty())
						previousValue61 = localTrace61.get(localTrace61.size() - 1);

					storeAsTracedObject(o_cast.getTarget());

					activitydiagramTrace.States.activitydiagram.TracedActivityNode content38 = null;
					if (o_cast.getTarget() != null)
						content38 = ((activitydiagramTrace.States.activitydiagram.TracedActivityNode) exeToTraced
								.get(o_cast.getTarget()));

					boolean noChange61 = previousValue61 != null && previousValue61.getTarget() == content38;

					if (noChange61) {
						newState.getActivityEdge_target_Values().add(previousValue61);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityEdge_target_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityEdge_target_Value();

						newValue.setTarget(content38);

						tracedObject.getTargetSequence().add(newValue);
						newState.getActivityEdge_target_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ControlFlow_guard_Value> localTrace62 = tracedObject
							.getGuardSequence();
					activitydiagramTrace.States.ControlFlow_guard_Value previousValue62 = null;
					if (!localTrace62.isEmpty())
						previousValue62 = localTrace62.get(localTrace62.size() - 1);

					storeAsTracedObject(o_cast.getGuard());

					activitydiagramTrace.States.activitydiagram.TracedBooleanVariable content39 = null;
					if (o_cast.getGuard() != null)
						content39 = ((activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) exeToTraced
								.get(o_cast.getGuard()));

					boolean noChange62 = previousValue62 != null && previousValue62.getGuard() == content39;

					if (noChange62) {
						newState.getControlFlow_guard_Values().add(previousValue62);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ControlFlow_guard_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createControlFlow_guard_Value();

						newValue.setGuard(content39);

						tracedObject.getGuardSequence().add(newValue);
						newState.getControlFlow_guard_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.NamedElement_name_Value> localTrace63 = tracedObject
							.getNameSequence();
					activitydiagramTrace.States.NamedElement_name_Value previousValue63 = null;
					if (!localTrace63.isEmpty())
						previousValue63 = localTrace63.get(localTrace63.size() - 1);

					java.lang.String content40 = o_cast.getName();

					boolean noChange63 = previousValue63 != null && previousValue63.getName() == content40;

					if (noChange63) {
						newState.getNamedElement_name_Values().add(previousValue63);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.NamedElement_name_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createNamedElement_name_Value();

						newValue.setName(content40);

						tracedObject.getNameSequence().add(newValue);
						newState.getNamedElement_name_Values().add(newValue);
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
					List<activitydiagramTrace.States.Variable_currentValue_Value> localTrace64 = tracedObject
							.getCurrentValueSequence();
					activitydiagramTrace.States.Variable_currentValue_Value previousValue64 = null;
					if (!localTrace64.isEmpty())
						previousValue64 = localTrace64.get(localTrace64.size() - 1);

					storeAsTracedObject(o_cast.getCurrentValue());

					activitydiagramTrace.States.activitydiagram.TracedValue content41 = null;
					if (o_cast.getCurrentValue() != null)
						content41 = ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced.get(o_cast
								.getCurrentValue()));

					boolean noChange64 = previousValue64 != null && previousValue64.getCurrentValue() == content41;

					if (noChange64) {
						newState.getVariable_currentValue_Values().add(previousValue64);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Variable_currentValue_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createVariable_currentValue_Value();

						newValue.setCurrentValue(content41);

						tracedObject.getCurrentValueSequence().add(newValue);
						newState.getVariable_currentValue_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Variable_initialValue_Value> localTrace65 = tracedObject
							.getInitialValueSequence();
					activitydiagramTrace.States.Variable_initialValue_Value previousValue65 = null;
					if (!localTrace65.isEmpty())
						previousValue65 = localTrace65.get(localTrace65.size() - 1);

					storeAsTracedObject(o_cast.getInitialValue());

					activitydiagramTrace.States.activitydiagram.TracedValue content42 = null;
					if (o_cast.getInitialValue() != null)
						content42 = ((activitydiagramTrace.States.activitydiagram.TracedValue) exeToTraced.get(o_cast
								.getInitialValue()));

					boolean noChange65 = previousValue65 != null && previousValue65.getInitialValue() == content42;

					if (noChange65) {
						newState.getVariable_initialValue_Values().add(previousValue65);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Variable_initialValue_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createVariable_initialValue_Value();

						newValue.setInitialValue(content42);

						tracedObject.getInitialValueSequence().add(newValue);
						newState.getVariable_initialValue_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Variable_name_Value> localTrace66 = tracedObject.getNameSequence();
					activitydiagramTrace.States.Variable_name_Value previousValue66 = null;
					if (!localTrace66.isEmpty())
						previousValue66 = localTrace66.get(localTrace66.size() - 1);

					java.lang.String content43 = o_cast.getName();

					boolean noChange66 = previousValue66 != null && previousValue66.getName() == content43;

					if (noChange66) {
						newState.getVariable_name_Values().add(previousValue66);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Variable_name_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createVariable_name_Value();

						newValue.setName(content43);

						tracedObject.getNameSequence().add(newValue);
						newState.getVariable_name_Values().add(newValue);
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
					List<activitydiagramTrace.States.BooleanValue_value_Value> localTrace67 = tracedObject
							.getValueSequence();
					activitydiagramTrace.States.BooleanValue_value_Value previousValue67 = null;
					if (!localTrace67.isEmpty())
						previousValue67 = localTrace67.get(localTrace67.size() - 1);

					boolean content44 = o_cast.isValue();

					boolean noChange67 = previousValue67 != null && previousValue67.isValue() == content44;

					if (noChange67) {
						newState.getBooleanValue_value_Values().add(previousValue67);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.BooleanValue_value_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createBooleanValue_value_Value();

						newValue.setValue(content44);

						tracedObject.getValueSequence().add(newValue);
						newState.getBooleanValue_value_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.BooleanUnaryExpression object
				 */
				if (o instanceof activitydiagram.BooleanUnaryExpression) {

					activitydiagram.BooleanUnaryExpression o_cast = (activitydiagram.BooleanUnaryExpression) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression tracedObject = (activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.BooleanExpression_assignee_Value> localTrace68 = tracedObject
							.getAssigneeSequence();
					activitydiagramTrace.States.BooleanExpression_assignee_Value previousValue68 = null;
					if (!localTrace68.isEmpty())
						previousValue68 = localTrace68.get(localTrace68.size() - 1);

					storeAsTracedObject(o_cast.getAssignee());

					activitydiagramTrace.States.activitydiagram.TracedBooleanVariable content45 = null;
					if (o_cast.getAssignee() != null)
						content45 = ((activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) exeToTraced
								.get(o_cast.getAssignee()));

					boolean noChange68 = previousValue68 != null && previousValue68.getAssignee() == content45;

					if (noChange68) {
						newState.getBooleanExpression_assignee_Values().add(previousValue68);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.BooleanExpression_assignee_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createBooleanExpression_assignee_Value();

						newValue.setAssignee(content45);

						tracedObject.getAssigneeSequence().add(newValue);
						newState.getBooleanExpression_assignee_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.BooleanUnaryExpression_operand_Value> localTrace69 = tracedObject
							.getOperandSequence();
					activitydiagramTrace.States.BooleanUnaryExpression_operand_Value previousValue69 = null;
					if (!localTrace69.isEmpty())
						previousValue69 = localTrace69.get(localTrace69.size() - 1);

					storeAsTracedObject(o_cast.getOperand());

					activitydiagramTrace.States.activitydiagram.TracedBooleanVariable content46 = null;
					if (o_cast.getOperand() != null)
						content46 = ((activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) exeToTraced
								.get(o_cast.getOperand()));

					boolean noChange69 = previousValue69 != null && previousValue69.getOperand() == content46;

					if (noChange69) {
						newState.getBooleanUnaryExpression_operand_Values().add(previousValue69);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.BooleanUnaryExpression_operand_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createBooleanUnaryExpression_operand_Value();

						newValue.setOperand(content46);

						tracedObject.getOperandSequence().add(newValue);
						newState.getBooleanUnaryExpression_operand_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.BooleanUnaryExpression_operator_Value> localTrace70 = tracedObject
							.getOperatorSequence();
					activitydiagramTrace.States.BooleanUnaryExpression_operator_Value previousValue70 = null;
					if (!localTrace70.isEmpty())
						previousValue70 = localTrace70.get(localTrace70.size() - 1);

					activitydiagram.BooleanUnaryOperator content47 = o_cast.getOperator();

					boolean noChange70 = previousValue70 != null && previousValue70.getOperator() == content47;

					if (noChange70) {
						newState.getBooleanUnaryExpression_operator_Values().add(previousValue70);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.BooleanUnaryExpression_operator_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createBooleanUnaryExpression_operator_Value();

						newValue.setOperator(content47);

						tracedObject.getOperatorSequence().add(newValue);
						newState.getBooleanUnaryExpression_operator_Values().add(newValue);
					}

				} else

				/**
				 * Storing the state of a activitydiagram.BooleanBinaryExpression object
				 */
				if (o instanceof activitydiagram.BooleanBinaryExpression) {

					activitydiagram.BooleanBinaryExpression o_cast = (activitydiagram.BooleanBinaryExpression) o;

					storeAsTracedObject(o_cast);

					activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression tracedObject = (activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression) exeToTraced
							.get(o);

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value> localTrace71 = tracedObject
							.getOperand1Sequence();
					activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value previousValue71 = null;
					if (!localTrace71.isEmpty())
						previousValue71 = localTrace71.get(localTrace71.size() - 1);

					storeAsTracedObject(o_cast.getOperand1());

					activitydiagramTrace.States.activitydiagram.TracedBooleanVariable content48 = null;
					if (o_cast.getOperand1() != null)
						content48 = ((activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) exeToTraced
								.get(o_cast.getOperand1()));

					boolean noChange71 = previousValue71 != null && previousValue71.getOperand1() == content48;

					if (noChange71) {
						newState.getBooleanBinaryExpression_operand1_Values().add(previousValue71);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createBooleanBinaryExpression_operand1_Value();

						newValue.setOperand1(content48);

						tracedObject.getOperand1Sequence().add(newValue);
						newState.getBooleanBinaryExpression_operand1_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value> localTrace72 = tracedObject
							.getOperand2Sequence();
					activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value previousValue72 = null;
					if (!localTrace72.isEmpty())
						previousValue72 = localTrace72.get(localTrace72.size() - 1);

					storeAsTracedObject(o_cast.getOperand2());

					activitydiagramTrace.States.activitydiagram.TracedBooleanVariable content49 = null;
					if (o_cast.getOperand2() != null)
						content49 = ((activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) exeToTraced
								.get(o_cast.getOperand2()));

					boolean noChange72 = previousValue72 != null && previousValue72.getOperand2() == content49;

					if (noChange72) {
						newState.getBooleanBinaryExpression_operand2_Values().add(previousValue72);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createBooleanBinaryExpression_operand2_Value();

						newValue.setOperand2(content49);

						tracedObject.getOperand2Sequence().add(newValue);
						newState.getBooleanBinaryExpression_operand2_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.BooleanBinaryExpression_operator_Value> localTrace73 = tracedObject
							.getOperatorSequence();
					activitydiagramTrace.States.BooleanBinaryExpression_operator_Value previousValue73 = null;
					if (!localTrace73.isEmpty())
						previousValue73 = localTrace73.get(localTrace73.size() - 1);

					activitydiagram.BooleanBinaryOperator content50 = o_cast.getOperator();

					boolean noChange73 = previousValue73 != null && previousValue73.getOperator() == content50;

					if (noChange73) {
						newState.getBooleanBinaryExpression_operator_Values().add(previousValue73);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.BooleanBinaryExpression_operator_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createBooleanBinaryExpression_operator_Value();

						newValue.setOperator(content50);

						tracedObject.getOperatorSequence().add(newValue);
						newState.getBooleanBinaryExpression_operator_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.BooleanExpression_assignee_Value> localTrace74 = tracedObject
							.getAssigneeSequence();
					activitydiagramTrace.States.BooleanExpression_assignee_Value previousValue74 = null;
					if (!localTrace74.isEmpty())
						previousValue74 = localTrace74.get(localTrace74.size() - 1);

					storeAsTracedObject(o_cast.getAssignee());

					activitydiagramTrace.States.activitydiagram.TracedBooleanVariable content51 = null;
					if (o_cast.getAssignee() != null)
						content51 = ((activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) exeToTraced
								.get(o_cast.getAssignee()));

					boolean noChange74 = previousValue74 != null && previousValue74.getAssignee() == content51;

					if (noChange74) {
						newState.getBooleanExpression_assignee_Values().add(previousValue74);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.BooleanExpression_assignee_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createBooleanExpression_assignee_Value();

						newValue.setAssignee(content51);

						tracedObject.getAssigneeSequence().add(newValue);
						newState.getBooleanExpression_assignee_Values().add(newValue);
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
					List<activitydiagramTrace.States.ActivityNode_activity_Value> localTrace75 = tracedObject
							.getActivitySequence();
					activitydiagramTrace.States.ActivityNode_activity_Value previousValue75 = null;
					if (!localTrace75.isEmpty())
						previousValue75 = localTrace75.get(localTrace75.size() - 1);

					storeAsTracedObject(o_cast.getActivity());

					activitydiagramTrace.States.activitydiagram.TracedActivity content52 = null;
					if (o_cast.getActivity() != null)
						content52 = ((activitydiagramTrace.States.activitydiagram.TracedActivity) exeToTraced
								.get(o_cast.getActivity()));

					boolean noChange75 = previousValue75 != null && previousValue75.getActivity() == content52;

					if (noChange75) {
						newState.getActivityNode_activity_Values().add(previousValue75);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_activity_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_activity_Value();

						newValue.setActivity(content52);

						tracedObject.getActivitySequence().add(newValue);
						newState.getActivityNode_activity_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_heldTokens_Value> localTrace76 = tracedObject
							.getHeldTokensSequence();
					activitydiagramTrace.States.ActivityNode_heldTokens_Value previousValue76 = null;
					if (!localTrace76.isEmpty())
						previousValue76 = localTrace76.get(localTrace76.size() - 1);

					for (activitydiagram.Token aValue : o_cast.getHeldTokens()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange76 = true;
					if (previousValue76 != null) {

						if (previousValue76.getHeldTokens().size() == o_cast.getHeldTokens().size()) {

							java.util.Iterator<activitydiagram.Token> it = o_cast.getHeldTokens().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedToken aPreviousValue : previousValue76
									.getHeldTokens()) {
								activitydiagram.Token aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange76 = false;
									break;
								}
							}

						} else {
							noChange76 = false;
						}
					} else {
						noChange76 = false;
					}

					if (noChange76) {
						newState.getActivityNode_heldTokens_Values().add(previousValue76);

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

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_incoming_Value> localTrace77 = tracedObject
							.getIncomingSequence();
					activitydiagramTrace.States.ActivityNode_incoming_Value previousValue77 = null;
					if (!localTrace77.isEmpty())
						previousValue77 = localTrace77.get(localTrace77.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getIncoming()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange77 = true;
					if (previousValue77 != null) {

						if (previousValue77.getIncoming().size() == o_cast.getIncoming().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getIncoming().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue77
									.getIncoming()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange77 = false;
									break;
								}
							}

						} else {
							noChange77 = false;
						}
					} else {
						noChange77 = false;
					}

					if (noChange77) {
						newState.getActivityNode_incoming_Values().add(previousValue77);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_incoming_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_incoming_Value();

						newValue.getIncoming()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getIncoming()));

						tracedObject.getIncomingSequence().add(newValue);
						newState.getActivityNode_incoming_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_outgoing_Value> localTrace78 = tracedObject
							.getOutgoingSequence();
					activitydiagramTrace.States.ActivityNode_outgoing_Value previousValue78 = null;
					if (!localTrace78.isEmpty())
						previousValue78 = localTrace78.get(localTrace78.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getOutgoing()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange78 = true;
					if (previousValue78 != null) {

						if (previousValue78.getOutgoing().size() == o_cast.getOutgoing().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getOutgoing().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue78
									.getOutgoing()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange78 = false;
									break;
								}
							}

						} else {
							noChange78 = false;
						}
					} else {
						noChange78 = false;
					}

					if (noChange78) {
						newState.getActivityNode_outgoing_Values().add(previousValue78);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_outgoing_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_outgoing_Value();

						newValue.getOutgoing()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getOutgoing()));

						tracedObject.getOutgoingSequence().add(newValue);
						newState.getActivityNode_outgoing_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.ActivityNode_running_Value> localTrace79 = tracedObject
							.getRunningSequence();
					activitydiagramTrace.States.ActivityNode_running_Value previousValue79 = null;
					if (!localTrace79.isEmpty())
						previousValue79 = localTrace79.get(localTrace79.size() - 1);

					boolean content53 = o_cast.isRunning();

					boolean noChange79 = previousValue79 != null && previousValue79.isRunning() == content53;

					if (noChange79) {
						newState.getActivityNode_running_Values().add(previousValue79);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.ActivityNode_running_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivityNode_running_Value();

						newValue.setRunning(content53);

						tracedObject.getRunningSequence().add(newValue);
						newState.getActivityNode_running_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.NamedElement_name_Value> localTrace80 = tracedObject
							.getNameSequence();
					activitydiagramTrace.States.NamedElement_name_Value previousValue80 = null;
					if (!localTrace80.isEmpty())
						previousValue80 = localTrace80.get(localTrace80.size() - 1);

					java.lang.String content54 = o_cast.getName();

					boolean noChange80 = previousValue80 != null && previousValue80.getName() == content54;

					if (noChange80) {
						newState.getNamedElement_name_Values().add(previousValue80);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.NamedElement_name_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createNamedElement_name_Value();

						newValue.setName(content54);

						tracedObject.getNameSequence().add(newValue);
						newState.getNamedElement_name_Values().add(newValue);
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
					List<activitydiagramTrace.States.Activity_edges_Value> localTrace81 = tracedObject
							.getEdgesSequence();
					activitydiagramTrace.States.Activity_edges_Value previousValue81 = null;
					if (!localTrace81.isEmpty())
						previousValue81 = localTrace81.get(localTrace81.size() - 1);

					for (activitydiagram.ActivityEdge aValue : o_cast.getEdges()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange81 = true;
					if (previousValue81 != null) {

						if (previousValue81.getEdges().size() == o_cast.getEdges().size()) {

							java.util.Iterator<activitydiagram.ActivityEdge> it = o_cast.getEdges().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityEdge aPreviousValue : previousValue81
									.getEdges()) {
								activitydiagram.ActivityEdge aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange81 = false;
									break;
								}
							}

						} else {
							noChange81 = false;
						}
					} else {
						noChange81 = false;
					}

					if (noChange81) {
						newState.getActivity_edges_Values().add(previousValue81);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Activity_edges_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivity_edges_Value();

						newValue.getEdges()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityEdge>) getExeToTraced(o_cast
										.getEdges()));

						tracedObject.getEdgesSequence().add(newValue);
						newState.getActivity_edges_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Activity_inputs_Value> localTrace82 = tracedObject
							.getInputsSequence();
					activitydiagramTrace.States.Activity_inputs_Value previousValue82 = null;
					if (!localTrace82.isEmpty())
						previousValue82 = localTrace82.get(localTrace82.size() - 1);

					for (activitydiagram.Variable aValue : o_cast.getInputs()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange82 = true;
					if (previousValue82 != null) {

						if (previousValue82.getInputs().size() == o_cast.getInputs().size()) {

							java.util.Iterator<activitydiagram.Variable> it = o_cast.getInputs().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedVariable aPreviousValue : previousValue82
									.getInputs()) {
								activitydiagram.Variable aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange82 = false;
									break;
								}
							}

						} else {
							noChange82 = false;
						}
					} else {
						noChange82 = false;
					}

					if (noChange82) {
						newState.getActivity_inputs_Values().add(previousValue82);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Activity_inputs_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivity_inputs_Value();

						newValue.getInputs()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedVariable>) getExeToTraced(o_cast
										.getInputs()));

						tracedObject.getInputsSequence().add(newValue);
						newState.getActivity_inputs_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Activity_locals_Value> localTrace83 = tracedObject
							.getLocalsSequence();
					activitydiagramTrace.States.Activity_locals_Value previousValue83 = null;
					if (!localTrace83.isEmpty())
						previousValue83 = localTrace83.get(localTrace83.size() - 1);

					for (activitydiagram.Variable aValue : o_cast.getLocals()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange83 = true;
					if (previousValue83 != null) {

						if (previousValue83.getLocals().size() == o_cast.getLocals().size()) {

							java.util.Iterator<activitydiagram.Variable> it = o_cast.getLocals().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedVariable aPreviousValue : previousValue83
									.getLocals()) {
								activitydiagram.Variable aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange83 = false;
									break;
								}
							}

						} else {
							noChange83 = false;
						}
					} else {
						noChange83 = false;
					}

					if (noChange83) {
						newState.getActivity_locals_Values().add(previousValue83);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Activity_locals_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivity_locals_Value();

						newValue.getLocals()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedVariable>) getExeToTraced(o_cast
										.getLocals()));

						tracedObject.getLocalsSequence().add(newValue);
						newState.getActivity_locals_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Activity_nodes_Value> localTrace84 = tracedObject
							.getNodesSequence();
					activitydiagramTrace.States.Activity_nodes_Value previousValue84 = null;
					if (!localTrace84.isEmpty())
						previousValue84 = localTrace84.get(localTrace84.size() - 1);

					for (activitydiagram.ActivityNode aValue : o_cast.getNodes()) {
						storeAsTracedObject(aValue);
					}

					boolean noChange84 = true;
					if (previousValue84 != null) {

						if (previousValue84.getNodes().size() == o_cast.getNodes().size()) {

							java.util.Iterator<activitydiagram.ActivityNode> it = o_cast.getNodes().iterator();
							for (activitydiagramTrace.States.activitydiagram.TracedActivityNode aPreviousValue : previousValue84
									.getNodes()) {
								activitydiagram.ActivityNode aCurrentValue = it.next();
								if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
									noChange84 = false;
									break;
								}
							}

						} else {
							noChange84 = false;
						}
					} else {
						noChange84 = false;
					}

					if (noChange84) {
						newState.getActivity_nodes_Values().add(previousValue84);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Activity_nodes_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivity_nodes_Value();

						newValue.getNodes()
								.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedActivityNode>) getExeToTraced(o_cast
										.getNodes()));

						tracedObject.getNodesSequence().add(newValue);
						newState.getActivity_nodes_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.Activity_trace_Value> localTrace85 = tracedObject
							.getTraceSequence();
					activitydiagramTrace.States.Activity_trace_Value previousValue85 = null;
					if (!localTrace85.isEmpty())
						previousValue85 = localTrace85.get(localTrace85.size() - 1);

					storeAsTracedObject(o_cast.getTrace());

					activitydiagramTrace.States.activitydiagram.TracedTrace content55 = null;
					if (o_cast.getTrace() != null)
						content55 = ((activitydiagramTrace.States.activitydiagram.TracedTrace) exeToTraced.get(o_cast
								.getTrace()));

					boolean noChange85 = previousValue85 != null && previousValue85.getTrace() == content55;

					if (noChange85) {
						newState.getActivity_trace_Values().add(previousValue85);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.Activity_trace_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createActivity_trace_Value();

						newValue.setTrace(content55);

						tracedObject.getTraceSequence().add(newValue);
						newState.getActivity_trace_Values().add(newValue);
					}

					// Then we compare the value of the field with the last stored value
					// If same value, we create no local state and we refer to the previous
					List<activitydiagramTrace.States.NamedElement_name_Value> localTrace86 = tracedObject
							.getNameSequence();
					activitydiagramTrace.States.NamedElement_name_Value previousValue86 = null;
					if (!localTrace86.isEmpty())
						previousValue86 = localTrace86.get(localTrace86.size() - 1);

					java.lang.String content56 = o_cast.getName();

					boolean noChange86 = previousValue86 != null && previousValue86.getName() == content56;

					if (noChange86) {
						newState.getNamedElement_name_Values().add(previousValue86);

					} // Else we create one
					else {
						changed = true;
						activitydiagramTrace.States.NamedElement_name_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
								.createNamedElement_name_Value();

						newValue.setName(content56);

						tracedObject.getNameSequence().add(newValue);
						newState.getNamedElement_name_Values().add(newValue);
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

			newState.getActivity_edges_Values().clear();
			newState.getActivity_inputs_Values().clear();
			newState.getActivity_locals_Values().clear();
			newState.getActivity_nodes_Values().clear();
			newState.getActivity_trace_Values().clear();
			newState.getActivityEdge_offers_Values().clear();
			newState.getActivityEdge_source_Values().clear();
			newState.getActivityEdge_target_Values().clear();
			newState.getActivityNode_activity_Values().clear();
			newState.getActivityNode_heldTokens_Values().clear();
			newState.getActivityNode_incoming_Values().clear();
			newState.getActivityNode_outgoing_Values().clear();
			newState.getActivityNode_running_Values().clear();
			newState.getBooleanBinaryExpression_operand1_Values().clear();
			newState.getBooleanBinaryExpression_operand2_Values().clear();
			newState.getBooleanBinaryExpression_operator_Values().clear();
			newState.getBooleanExpression_assignee_Values().clear();
			newState.getBooleanUnaryExpression_operand_Values().clear();
			newState.getBooleanUnaryExpression_operator_Values().clear();
			newState.getBooleanValue_value_Values().clear();
			newState.getControlFlow_guard_Values().clear();
			newState.getForkedToken_baseToken_Values().clear();
			newState.getForkedToken_remainingOffersCount_Values().clear();
			newState.getInput_inputValues_Values().clear();
			newState.getInputValue_value_Values().clear();
			newState.getInputValue_variable_Values().clear();
			newState.getIntegerCalculationExpression_assignee_Values().clear();
			newState.getIntegerCalculationExpression_operator_Values().clear();
			newState.getIntegerComparisonExpression_assignee_Values().clear();
			newState.getIntegerComparisonExpression_operator_Values().clear();
			newState.getIntegerExpression_operand1_Values().clear();
			newState.getIntegerExpression_operand2_Values().clear();
			newState.getIntegerValue_value_Values().clear();
			newState.getNamedElement_name_Values().clear();
			newState.getOffer_offeredTokens_Values().clear();
			newState.getOpaqueAction_expressions_Values().clear();
			newState.getToken_holder_Values().clear();
			newState.getTrace_executedNodes_Values().clear();
			newState.getVariable_currentValue_Values().clear();
			newState.getVariable_initialValue_Values().clear();
			newState.getVariable_name_Values().clear();
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
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_TakeOfferdTokens1) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ActivityNode_TakeOfferdTokens1_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_Execute) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_Activity_Execute_ImplicitStep();
		} else if (currentStep instanceof activitydiagramTrace.Steps.Activitydiagram_Activity_WriteTrace) {
			implicitStep = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_Activity_WriteTrace_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			emfAdd(currentStep, "subSteps", implicitStep);
		}
	}

	@Override
	public boolean addStep(org.gemoc.execution.engine.mse.engine_mse.MSEOccurrence mseOccurrence) {

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

			for (activitydiagramTrace.States.Activity_edges_Value value : stateToGo.getActivity_edges_Values()) {

				activitydiagram.Activity exeObject = (activitydiagram.Activity) getTracedToExe(value.getParent());
				exeObject.getEdges().clear();
				exeObject.getEdges().addAll(
						(Collection<? extends activitydiagram.ActivityEdge>) getTracedToExe(value.getEdges()));

			}

			for (activitydiagramTrace.States.Activity_inputs_Value value : stateToGo.getActivity_inputs_Values()) {

				activitydiagram.Activity exeObject = (activitydiagram.Activity) getTracedToExe(value.getParent());
				exeObject.getInputs().clear();
				exeObject.getInputs().addAll(
						(Collection<? extends activitydiagram.Variable>) getTracedToExe(value.getInputs()));

			}

			for (activitydiagramTrace.States.Activity_locals_Value value : stateToGo.getActivity_locals_Values()) {

				activitydiagram.Activity exeObject = (activitydiagram.Activity) getTracedToExe(value.getParent());
				exeObject.getLocals().clear();
				exeObject.getLocals().addAll(
						(Collection<? extends activitydiagram.Variable>) getTracedToExe(value.getLocals()));

			}

			for (activitydiagramTrace.States.Activity_nodes_Value value : stateToGo.getActivity_nodes_Values()) {

				activitydiagram.Activity exeObject = (activitydiagram.Activity) getTracedToExe(value.getParent());
				exeObject.getNodes().clear();
				exeObject.getNodes().addAll(
						(Collection<? extends activitydiagram.ActivityNode>) getTracedToExe(value.getNodes()));

			}

			for (activitydiagramTrace.States.Activity_trace_Value value : stateToGo.getActivity_trace_Values()) {

				activitydiagram.Activity exeObject = (activitydiagram.Activity) getTracedToExe(value.getParent());
				exeObject.setTrace(((activitydiagram.Trace) getTracedToExe(value.getTrace())));

			}

			for (activitydiagramTrace.States.ActivityEdge_offers_Value value : stateToGo
					.getActivityEdge_offers_Values()) {

				activitydiagram.ActivityEdge exeObject = (activitydiagram.ActivityEdge) getTracedToExe(value
						.getParent());
				exeObject.getOffers().clear();
				exeObject.getOffers().addAll(
						(Collection<? extends activitydiagram.Offer>) getTracedToExe(value.getOffers()));

			}

			for (activitydiagramTrace.States.ActivityEdge_source_Value value : stateToGo
					.getActivityEdge_source_Values()) {

				activitydiagram.ActivityEdge exeObject = (activitydiagram.ActivityEdge) getTracedToExe(value
						.getParent());
				exeObject.setSource(((activitydiagram.ActivityNode) getTracedToExe(value.getSource())));

			}

			for (activitydiagramTrace.States.ActivityEdge_target_Value value : stateToGo
					.getActivityEdge_target_Values()) {

				activitydiagram.ActivityEdge exeObject = (activitydiagram.ActivityEdge) getTracedToExe(value
						.getParent());
				exeObject.setTarget(((activitydiagram.ActivityNode) getTracedToExe(value.getTarget())));

			}

			for (activitydiagramTrace.States.ActivityNode_activity_Value value : stateToGo
					.getActivityNode_activity_Values()) {

				activitydiagram.ActivityNode exeObject = (activitydiagram.ActivityNode) getTracedToExe(value
						.getParent());
				exeObject.setActivity(((activitydiagram.Activity) getTracedToExe(value.getActivity())));

			}

			for (activitydiagramTrace.States.ActivityNode_heldTokens_Value value : stateToGo
					.getActivityNode_heldTokens_Values()) {

				activitydiagram.ActivityNode exeObject = (activitydiagram.ActivityNode) getTracedToExe(value
						.getParent());
				exeObject.getHeldTokens().clear();
				exeObject.getHeldTokens().addAll(
						(Collection<? extends activitydiagram.Token>) getTracedToExe(value.getHeldTokens()));

			}

			for (activitydiagramTrace.States.ActivityNode_incoming_Value value : stateToGo
					.getActivityNode_incoming_Values()) {

				activitydiagram.ActivityNode exeObject = (activitydiagram.ActivityNode) getTracedToExe(value
						.getParent());
				exeObject.getIncoming().clear();
				exeObject.getIncoming().addAll(
						(Collection<? extends activitydiagram.ActivityEdge>) getTracedToExe(value.getIncoming()));

			}

			for (activitydiagramTrace.States.ActivityNode_outgoing_Value value : stateToGo
					.getActivityNode_outgoing_Values()) {

				activitydiagram.ActivityNode exeObject = (activitydiagram.ActivityNode) getTracedToExe(value
						.getParent());
				exeObject.getOutgoing().clear();
				exeObject.getOutgoing().addAll(
						(Collection<? extends activitydiagram.ActivityEdge>) getTracedToExe(value.getOutgoing()));

			}

			for (activitydiagramTrace.States.ActivityNode_running_Value value : stateToGo
					.getActivityNode_running_Values()) {

				activitydiagram.ActivityNode exeObject = (activitydiagram.ActivityNode) getTracedToExe(value
						.getParent());
				exeObject.setRunning(value.isRunning());

			}

			for (activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value value : stateToGo
					.getBooleanBinaryExpression_operand1_Values()) {

				activitydiagram.BooleanBinaryExpression exeObject = (activitydiagram.BooleanBinaryExpression) getTracedToExe(value
						.getParent());
				exeObject.setOperand1(((activitydiagram.BooleanVariable) getTracedToExe(value.getOperand1())));

			}

			for (activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value value : stateToGo
					.getBooleanBinaryExpression_operand2_Values()) {

				activitydiagram.BooleanBinaryExpression exeObject = (activitydiagram.BooleanBinaryExpression) getTracedToExe(value
						.getParent());
				exeObject.setOperand2(((activitydiagram.BooleanVariable) getTracedToExe(value.getOperand2())));

			}

			for (activitydiagramTrace.States.BooleanBinaryExpression_operator_Value value : stateToGo
					.getBooleanBinaryExpression_operator_Values()) {

				activitydiagram.BooleanBinaryExpression exeObject = (activitydiagram.BooleanBinaryExpression) getTracedToExe(value
						.getParent());
				exeObject.setOperator(value.getOperator());

			}

			for (activitydiagramTrace.States.BooleanExpression_assignee_Value value : stateToGo
					.getBooleanExpression_assignee_Values()) {

				activitydiagram.BooleanExpression exeObject = (activitydiagram.BooleanExpression) getTracedToExe(value
						.getParent());
				exeObject.setAssignee(((activitydiagram.BooleanVariable) getTracedToExe(value.getAssignee())));

			}

			for (activitydiagramTrace.States.BooleanUnaryExpression_operand_Value value : stateToGo
					.getBooleanUnaryExpression_operand_Values()) {

				activitydiagram.BooleanUnaryExpression exeObject = (activitydiagram.BooleanUnaryExpression) getTracedToExe(value
						.getParent());
				exeObject.setOperand(((activitydiagram.BooleanVariable) getTracedToExe(value.getOperand())));

			}

			for (activitydiagramTrace.States.BooleanUnaryExpression_operator_Value value : stateToGo
					.getBooleanUnaryExpression_operator_Values()) {

				activitydiagram.BooleanUnaryExpression exeObject = (activitydiagram.BooleanUnaryExpression) getTracedToExe(value
						.getParent());
				exeObject.setOperator(value.getOperator());

			}

			for (activitydiagramTrace.States.BooleanValue_value_Value value : stateToGo.getBooleanValue_value_Values()) {

				activitydiagram.BooleanValue exeObject = (activitydiagram.BooleanValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.isValue());

			}

			for (activitydiagramTrace.States.ControlFlow_guard_Value value : stateToGo.getControlFlow_guard_Values()) {

				activitydiagram.ControlFlow exeObject = (activitydiagram.ControlFlow) getTracedToExe(value.getParent());
				exeObject.setGuard(((activitydiagram.BooleanVariable) getTracedToExe(value.getGuard())));

			}

			for (activitydiagramTrace.States.ForkedToken_baseToken_Value value : stateToGo
					.getForkedToken_baseToken_Values()) {

				activitydiagram.ForkedToken exeObject = (activitydiagram.ForkedToken) getTracedToExe(value.getParent());
				exeObject.setBaseToken(((activitydiagram.Token) getTracedToExe(value.getBaseToken())));

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
				exeObject.setValue(((activitydiagram.Value) getTracedToExe(value.getValue())));

			}

			for (activitydiagramTrace.States.InputValue_variable_Value value : stateToGo
					.getInputValue_variable_Values()) {

				activitydiagram.InputValue exeObject = (activitydiagram.InputValue) getTracedToExe(value.getParent());
				exeObject.setVariable(((activitydiagram.Variable) getTracedToExe(value.getVariable())));

			}

			for (activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value value : stateToGo
					.getIntegerCalculationExpression_assignee_Values()) {

				activitydiagram.IntegerCalculationExpression exeObject = (activitydiagram.IntegerCalculationExpression) getTracedToExe(value
						.getParent());
				exeObject.setAssignee(((activitydiagram.IntegerVariable) getTracedToExe(value.getAssignee())));

			}

			for (activitydiagramTrace.States.IntegerCalculationExpression_operator_Value value : stateToGo
					.getIntegerCalculationExpression_operator_Values()) {

				activitydiagram.IntegerCalculationExpression exeObject = (activitydiagram.IntegerCalculationExpression) getTracedToExe(value
						.getParent());
				exeObject.setOperator(value.getOperator());

			}

			for (activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value value : stateToGo
					.getIntegerComparisonExpression_assignee_Values()) {

				activitydiagram.IntegerComparisonExpression exeObject = (activitydiagram.IntegerComparisonExpression) getTracedToExe(value
						.getParent());
				exeObject.setAssignee(((activitydiagram.BooleanVariable) getTracedToExe(value.getAssignee())));

			}

			for (activitydiagramTrace.States.IntegerComparisonExpression_operator_Value value : stateToGo
					.getIntegerComparisonExpression_operator_Values()) {

				activitydiagram.IntegerComparisonExpression exeObject = (activitydiagram.IntegerComparisonExpression) getTracedToExe(value
						.getParent());
				exeObject.setOperator(value.getOperator());

			}

			for (activitydiagramTrace.States.IntegerExpression_operand1_Value value : stateToGo
					.getIntegerExpression_operand1_Values()) {

				activitydiagram.IntegerExpression exeObject = (activitydiagram.IntegerExpression) getTracedToExe(value
						.getParent());
				exeObject.setOperand1(((activitydiagram.IntegerVariable) getTracedToExe(value.getOperand1())));

			}

			for (activitydiagramTrace.States.IntegerExpression_operand2_Value value : stateToGo
					.getIntegerExpression_operand2_Values()) {

				activitydiagram.IntegerExpression exeObject = (activitydiagram.IntegerExpression) getTracedToExe(value
						.getParent());
				exeObject.setOperand2(((activitydiagram.IntegerVariable) getTracedToExe(value.getOperand2())));

			}

			for (activitydiagramTrace.States.IntegerValue_value_Value value : stateToGo.getIntegerValue_value_Values()) {

				activitydiagram.IntegerValue exeObject = (activitydiagram.IntegerValue) getTracedToExe(value
						.getParent());
				exeObject.setValue(value.getValue());

			}

			for (activitydiagramTrace.States.NamedElement_name_Value value : stateToGo.getNamedElement_name_Values()) {

				activitydiagram.NamedElement exeObject = (activitydiagram.NamedElement) getTracedToExe(value
						.getParent());
				exeObject.setName(value.getName());

			}

			for (activitydiagramTrace.States.Offer_offeredTokens_Value value : stateToGo
					.getOffer_offeredTokens_Values()) {

				activitydiagram.Offer exeObject = (activitydiagram.Offer) getTracedToExe(value.getParent());
				exeObject.getOfferedTokens().clear();
				exeObject.getOfferedTokens().addAll(
						(Collection<? extends activitydiagram.Token>) getTracedToExe(value.getOfferedTokens()));

			}

			for (activitydiagramTrace.States.OpaqueAction_expressions_Value value : stateToGo
					.getOpaqueAction_expressions_Values()) {

				activitydiagram.OpaqueAction exeObject = (activitydiagram.OpaqueAction) getTracedToExe(value
						.getParent());
				exeObject.getExpressions().clear();
				exeObject.getExpressions().addAll(
						(Collection<? extends activitydiagram.Expression>) getTracedToExe(value.getExpressions()));

			}

			for (activitydiagramTrace.States.Token_holder_Value value : stateToGo.getToken_holder_Values()) {

				activitydiagram.Token exeObject = (activitydiagram.Token) getTracedToExe(value.getParent());
				exeObject.setHolder(((activitydiagram.ActivityNode) getTracedToExe(value.getHolder())));

			}

			for (activitydiagramTrace.States.Trace_executedNodes_Value value : stateToGo
					.getTrace_executedNodes_Values()) {

				activitydiagram.Trace exeObject = (activitydiagram.Trace) getTracedToExe(value.getParent());
				exeObject.getExecutedNodes().clear();
				exeObject.getExecutedNodes().addAll(
						(Collection<? extends activitydiagram.ActivityNode>) getTracedToExe(value.getExecutedNodes()));

			}

			for (activitydiagramTrace.States.Variable_currentValue_Value value : stateToGo
					.getVariable_currentValue_Values()) {

				activitydiagram.Variable exeObject = (activitydiagram.Variable) getTracedToExe(value.getParent());
				exeObject.setCurrentValue(((activitydiagram.Value) getTracedToExe(value.getCurrentValue())));

			}

			for (activitydiagramTrace.States.Variable_initialValue_Value value : stateToGo
					.getVariable_initialValue_Values()) {

				activitydiagram.Variable exeObject = (activitydiagram.Variable) getTracedToExe(value.getParent());
				exeObject.setInitialValue(((activitydiagram.Value) getTracedToExe(value.getInitialValue())));

			}

			for (activitydiagramTrace.States.Variable_name_Value value : stateToGo.getVariable_name_Values()) {

				activitydiagram.Variable exeObject = (activitydiagram.Variable) getTracedToExe(value.getParent());
				exeObject.setName(value.getName());

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
		//} catch (IOException e) {
		//	e.printStackTrace();
		//}
	}

	@Override
	public String getDescriptionOfExecutionState(int index) {
		StringBuilder result = new StringBuilder();
		activitydiagramTrace.States.State gs = traceRoot.getStatesTrace().get(index);

		if (!gs.getActivity_edges_Values().isEmpty())
			result.append("\nEdges values:");
		for (activitydiagramTrace.States.Activity_edges_Value currenState : gs.getActivity_edges_Values()) {
			result.append("\n\t" + currenState.getEdges());
		}

		if (!gs.getActivity_inputs_Values().isEmpty())
			result.append("\nInputs values:");
		for (activitydiagramTrace.States.Activity_inputs_Value currenState : gs.getActivity_inputs_Values()) {
			result.append("\n\t" + currenState.getInputs());
		}

		if (!gs.getActivity_locals_Values().isEmpty())
			result.append("\nLocals values:");
		for (activitydiagramTrace.States.Activity_locals_Value currenState : gs.getActivity_locals_Values()) {
			result.append("\n\t" + currenState.getLocals());
		}

		if (!gs.getActivity_nodes_Values().isEmpty())
			result.append("\nNodes values:");
		for (activitydiagramTrace.States.Activity_nodes_Value currenState : gs.getActivity_nodes_Values()) {
			result.append("\n\t" + currenState.getNodes());
		}

		if (!gs.getActivity_trace_Values().isEmpty())
			result.append("\nTrace values:");
		for (activitydiagramTrace.States.Activity_trace_Value currenState : gs.getActivity_trace_Values()) {
			result.append("\n\t" + currenState.getTrace());
		}

		if (!gs.getActivityEdge_offers_Values().isEmpty())
			result.append("\nOffers values:");
		for (activitydiagramTrace.States.ActivityEdge_offers_Value currenState : gs.getActivityEdge_offers_Values()) {
			result.append("\n\t" + currenState.getOffers());
		}

		if (!gs.getActivityEdge_source_Values().isEmpty())
			result.append("\nSource values:");
		for (activitydiagramTrace.States.ActivityEdge_source_Value currenState : gs.getActivityEdge_source_Values()) {
			result.append("\n\t" + currenState.getSource());
		}

		if (!gs.getActivityEdge_target_Values().isEmpty())
			result.append("\nTarget values:");
		for (activitydiagramTrace.States.ActivityEdge_target_Value currenState : gs.getActivityEdge_target_Values()) {
			result.append("\n\t" + currenState.getTarget());
		}

		if (!gs.getActivityNode_activity_Values().isEmpty())
			result.append("\nActivity values:");
		for (activitydiagramTrace.States.ActivityNode_activity_Value currenState : gs.getActivityNode_activity_Values()) {
			result.append("\n\t" + currenState.getActivity());
		}

		if (!gs.getActivityNode_heldTokens_Values().isEmpty())
			result.append("\nHeldTokens values:");
		for (activitydiagramTrace.States.ActivityNode_heldTokens_Value currenState : gs
				.getActivityNode_heldTokens_Values()) {
			result.append("\n\t" + currenState.getHeldTokens());
		}

		if (!gs.getActivityNode_incoming_Values().isEmpty())
			result.append("\nIncoming values:");
		for (activitydiagramTrace.States.ActivityNode_incoming_Value currenState : gs.getActivityNode_incoming_Values()) {
			result.append("\n\t" + currenState.getIncoming());
		}

		if (!gs.getActivityNode_outgoing_Values().isEmpty())
			result.append("\nOutgoing values:");
		for (activitydiagramTrace.States.ActivityNode_outgoing_Value currenState : gs.getActivityNode_outgoing_Values()) {
			result.append("\n\t" + currenState.getOutgoing());
		}

		if (!gs.getActivityNode_running_Values().isEmpty())
			result.append("\nRunning values:");
		for (activitydiagramTrace.States.ActivityNode_running_Value currenState : gs.getActivityNode_running_Values()) {
			result.append("\n\t" + currenState.isRunning());
		}

		if (!gs.getBooleanBinaryExpression_operand1_Values().isEmpty())
			result.append("\nOperand1 values:");
		for (activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value currenState : gs
				.getBooleanBinaryExpression_operand1_Values()) {
			result.append("\n\t" + currenState.getOperand1());
		}

		if (!gs.getBooleanBinaryExpression_operand2_Values().isEmpty())
			result.append("\nOperand2 values:");
		for (activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value currenState : gs
				.getBooleanBinaryExpression_operand2_Values()) {
			result.append("\n\t" + currenState.getOperand2());
		}

		if (!gs.getBooleanBinaryExpression_operator_Values().isEmpty())
			result.append("\nOperator values:");
		for (activitydiagramTrace.States.BooleanBinaryExpression_operator_Value currenState : gs
				.getBooleanBinaryExpression_operator_Values()) {
			result.append("\n\t" + currenState.getOperator());
		}

		if (!gs.getBooleanExpression_assignee_Values().isEmpty())
			result.append("\nAssignee values:");
		for (activitydiagramTrace.States.BooleanExpression_assignee_Value currenState : gs
				.getBooleanExpression_assignee_Values()) {
			result.append("\n\t" + currenState.getAssignee());
		}

		if (!gs.getBooleanUnaryExpression_operand_Values().isEmpty())
			result.append("\nOperand values:");
		for (activitydiagramTrace.States.BooleanUnaryExpression_operand_Value currenState : gs
				.getBooleanUnaryExpression_operand_Values()) {
			result.append("\n\t" + currenState.getOperand());
		}

		if (!gs.getBooleanUnaryExpression_operator_Values().isEmpty())
			result.append("\nOperator values:");
		for (activitydiagramTrace.States.BooleanUnaryExpression_operator_Value currenState : gs
				.getBooleanUnaryExpression_operator_Values()) {
			result.append("\n\t" + currenState.getOperator());
		}

		if (!gs.getBooleanValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (activitydiagramTrace.States.BooleanValue_value_Value currenState : gs.getBooleanValue_value_Values()) {
			result.append("\n\t" + currenState.isValue());
		}

		if (!gs.getControlFlow_guard_Values().isEmpty())
			result.append("\nGuard values:");
		for (activitydiagramTrace.States.ControlFlow_guard_Value currenState : gs.getControlFlow_guard_Values()) {
			result.append("\n\t" + currenState.getGuard());
		}

		if (!gs.getForkedToken_baseToken_Values().isEmpty())
			result.append("\nBaseToken values:");
		for (activitydiagramTrace.States.ForkedToken_baseToken_Value currenState : gs.getForkedToken_baseToken_Values()) {
			result.append("\n\t" + currenState.getBaseToken());
		}

		if (!gs.getForkedToken_remainingOffersCount_Values().isEmpty())
			result.append("\nRemainingOffersCount values:");
		for (activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value currenState : gs
				.getForkedToken_remainingOffersCount_Values()) {
			result.append("\n\t" + currenState.getRemainingOffersCount());
		}

		if (!gs.getInput_inputValues_Values().isEmpty())
			result.append("\nInputValues values:");
		for (activitydiagramTrace.States.Input_inputValues_Value currenState : gs.getInput_inputValues_Values()) {
			result.append("\n\t" + currenState.getInputValues());
		}

		if (!gs.getInputValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (activitydiagramTrace.States.InputValue_value_Value currenState : gs.getInputValue_value_Values()) {
			result.append("\n\t" + currenState.getValue());
		}

		if (!gs.getInputValue_variable_Values().isEmpty())
			result.append("\nVariable values:");
		for (activitydiagramTrace.States.InputValue_variable_Value currenState : gs.getInputValue_variable_Values()) {
			result.append("\n\t" + currenState.getVariable());
		}

		if (!gs.getIntegerCalculationExpression_assignee_Values().isEmpty())
			result.append("\nAssignee values:");
		for (activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value currenState : gs
				.getIntegerCalculationExpression_assignee_Values()) {
			result.append("\n\t" + currenState.getAssignee());
		}

		if (!gs.getIntegerCalculationExpression_operator_Values().isEmpty())
			result.append("\nOperator values:");
		for (activitydiagramTrace.States.IntegerCalculationExpression_operator_Value currenState : gs
				.getIntegerCalculationExpression_operator_Values()) {
			result.append("\n\t" + currenState.getOperator());
		}

		if (!gs.getIntegerComparisonExpression_assignee_Values().isEmpty())
			result.append("\nAssignee values:");
		for (activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value currenState : gs
				.getIntegerComparisonExpression_assignee_Values()) {
			result.append("\n\t" + currenState.getAssignee());
		}

		if (!gs.getIntegerComparisonExpression_operator_Values().isEmpty())
			result.append("\nOperator values:");
		for (activitydiagramTrace.States.IntegerComparisonExpression_operator_Value currenState : gs
				.getIntegerComparisonExpression_operator_Values()) {
			result.append("\n\t" + currenState.getOperator());
		}

		if (!gs.getIntegerExpression_operand1_Values().isEmpty())
			result.append("\nOperand1 values:");
		for (activitydiagramTrace.States.IntegerExpression_operand1_Value currenState : gs
				.getIntegerExpression_operand1_Values()) {
			result.append("\n\t" + currenState.getOperand1());
		}

		if (!gs.getIntegerExpression_operand2_Values().isEmpty())
			result.append("\nOperand2 values:");
		for (activitydiagramTrace.States.IntegerExpression_operand2_Value currenState : gs
				.getIntegerExpression_operand2_Values()) {
			result.append("\n\t" + currenState.getOperand2());
		}

		if (!gs.getIntegerValue_value_Values().isEmpty())
			result.append("\nValue values:");
		for (activitydiagramTrace.States.IntegerValue_value_Value currenState : gs.getIntegerValue_value_Values()) {
			result.append("\n\t" + currenState.getValue());
		}

		if (!gs.getNamedElement_name_Values().isEmpty())
			result.append("\nName values:");
		for (activitydiagramTrace.States.NamedElement_name_Value currenState : gs.getNamedElement_name_Values()) {
			result.append("\n\t" + currenState.getName());
		}

		if (!gs.getOffer_offeredTokens_Values().isEmpty())
			result.append("\nOfferedTokens values:");
		for (activitydiagramTrace.States.Offer_offeredTokens_Value currenState : gs.getOffer_offeredTokens_Values()) {
			result.append("\n\t" + currenState.getOfferedTokens());
		}

		if (!gs.getOpaqueAction_expressions_Values().isEmpty())
			result.append("\nExpressions values:");
		for (activitydiagramTrace.States.OpaqueAction_expressions_Value currenState : gs
				.getOpaqueAction_expressions_Values()) {
			result.append("\n\t" + currenState.getExpressions());
		}

		if (!gs.getToken_holder_Values().isEmpty())
			result.append("\nHolder values:");
		for (activitydiagramTrace.States.Token_holder_Value currenState : gs.getToken_holder_Values()) {
			result.append("\n\t" + currenState.getHolder());
		}

		if (!gs.getTrace_executedNodes_Values().isEmpty())
			result.append("\nExecutedNodes values:");
		for (activitydiagramTrace.States.Trace_executedNodes_Value currenState : gs.getTrace_executedNodes_Values()) {
			result.append("\n\t" + currenState.getExecutedNodes());
		}

		if (!gs.getVariable_currentValue_Values().isEmpty())
			result.append("\nCurrentValue values:");
		for (activitydiagramTrace.States.Variable_currentValue_Value currenState : gs.getVariable_currentValue_Values()) {
			result.append("\n\t" + currenState.getCurrentValue());
		}

		if (!gs.getVariable_initialValue_Values().isEmpty())
			result.append("\nInitialValue values:");
		for (activitydiagramTrace.States.Variable_initialValue_Value currenState : gs.getVariable_initialValue_Values()) {
			result.append("\n\t" + currenState.getInitialValue());
		}

		if (!gs.getVariable_name_Values().isEmpty())
			result.append("\nName values:");
		for (activitydiagramTrace.States.Variable_name_Value currenState : gs.getVariable_name_Values()) {
			result.append("\n\t" + currenState.getName());
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
		if (eObject instanceof activitydiagramTrace.States.Activity_edges_Value) {
			return "activitydiagramTrace.States.Activity_edges_Value: "
					+ ((activitydiagramTrace.States.Activity_edges_Value) eObject).getEdges();
		} else if (eObject instanceof activitydiagramTrace.States.Activity_inputs_Value) {
			return "activitydiagramTrace.States.Activity_inputs_Value: "
					+ ((activitydiagramTrace.States.Activity_inputs_Value) eObject).getInputs();
		} else if (eObject instanceof activitydiagramTrace.States.Activity_locals_Value) {
			return "activitydiagramTrace.States.Activity_locals_Value: "
					+ ((activitydiagramTrace.States.Activity_locals_Value) eObject).getLocals();
		} else if (eObject instanceof activitydiagramTrace.States.Activity_nodes_Value) {
			return "activitydiagramTrace.States.Activity_nodes_Value: "
					+ ((activitydiagramTrace.States.Activity_nodes_Value) eObject).getNodes();
		} else if (eObject instanceof activitydiagramTrace.States.Activity_trace_Value) {
			return "activitydiagramTrace.States.Activity_trace_Value: "
					+ ((activitydiagramTrace.States.Activity_trace_Value) eObject).getTrace();
		} else if (eObject instanceof activitydiagramTrace.States.ActivityEdge_offers_Value) {
			return "activitydiagramTrace.States.ActivityEdge_offers_Value: "
					+ ((activitydiagramTrace.States.ActivityEdge_offers_Value) eObject).getOffers();
		} else if (eObject instanceof activitydiagramTrace.States.ActivityEdge_source_Value) {
			return "activitydiagramTrace.States.ActivityEdge_source_Value: "
					+ ((activitydiagramTrace.States.ActivityEdge_source_Value) eObject).getSource();
		} else if (eObject instanceof activitydiagramTrace.States.ActivityEdge_target_Value) {
			return "activitydiagramTrace.States.ActivityEdge_target_Value: "
					+ ((activitydiagramTrace.States.ActivityEdge_target_Value) eObject).getTarget();
		} else if (eObject instanceof activitydiagramTrace.States.ActivityNode_activity_Value) {
			return "activitydiagramTrace.States.ActivityNode_activity_Value: "
					+ ((activitydiagramTrace.States.ActivityNode_activity_Value) eObject).getActivity();
		} else if (eObject instanceof activitydiagramTrace.States.ActivityNode_heldTokens_Value) {
			return "activitydiagramTrace.States.ActivityNode_heldTokens_Value: "
					+ ((activitydiagramTrace.States.ActivityNode_heldTokens_Value) eObject).getHeldTokens();
		} else if (eObject instanceof activitydiagramTrace.States.ActivityNode_incoming_Value) {
			return "activitydiagramTrace.States.ActivityNode_incoming_Value: "
					+ ((activitydiagramTrace.States.ActivityNode_incoming_Value) eObject).getIncoming();
		} else if (eObject instanceof activitydiagramTrace.States.ActivityNode_outgoing_Value) {
			return "activitydiagramTrace.States.ActivityNode_outgoing_Value: "
					+ ((activitydiagramTrace.States.ActivityNode_outgoing_Value) eObject).getOutgoing();
		} else if (eObject instanceof activitydiagramTrace.States.ActivityNode_running_Value) {
			return "activitydiagramTrace.States.ActivityNode_running_Value: "
					+ ((activitydiagramTrace.States.ActivityNode_running_Value) eObject).isRunning();
		} else if (eObject instanceof activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value) {
			return "activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value: "
					+ ((activitydiagramTrace.States.BooleanBinaryExpression_operand1_Value) eObject).getOperand1();
		} else if (eObject instanceof activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value) {
			return "activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value: "
					+ ((activitydiagramTrace.States.BooleanBinaryExpression_operand2_Value) eObject).getOperand2();
		} else if (eObject instanceof activitydiagramTrace.States.BooleanBinaryExpression_operator_Value) {
			return "activitydiagramTrace.States.BooleanBinaryExpression_operator_Value: "
					+ ((activitydiagramTrace.States.BooleanBinaryExpression_operator_Value) eObject).getOperator();
		} else if (eObject instanceof activitydiagramTrace.States.BooleanExpression_assignee_Value) {
			return "activitydiagramTrace.States.BooleanExpression_assignee_Value: "
					+ ((activitydiagramTrace.States.BooleanExpression_assignee_Value) eObject).getAssignee();
		} else if (eObject instanceof activitydiagramTrace.States.BooleanUnaryExpression_operand_Value) {
			return "activitydiagramTrace.States.BooleanUnaryExpression_operand_Value: "
					+ ((activitydiagramTrace.States.BooleanUnaryExpression_operand_Value) eObject).getOperand();
		} else if (eObject instanceof activitydiagramTrace.States.BooleanUnaryExpression_operator_Value) {
			return "activitydiagramTrace.States.BooleanUnaryExpression_operator_Value: "
					+ ((activitydiagramTrace.States.BooleanUnaryExpression_operator_Value) eObject).getOperator();
		} else if (eObject instanceof activitydiagramTrace.States.BooleanValue_value_Value) {
			return "activitydiagramTrace.States.BooleanValue_value_Value: "
					+ ((activitydiagramTrace.States.BooleanValue_value_Value) eObject).isValue();
		} else if (eObject instanceof activitydiagramTrace.States.ControlFlow_guard_Value) {
			return "activitydiagramTrace.States.ControlFlow_guard_Value: "
					+ ((activitydiagramTrace.States.ControlFlow_guard_Value) eObject).getGuard();
		} else if (eObject instanceof activitydiagramTrace.States.ForkedToken_baseToken_Value) {
			return "activitydiagramTrace.States.ForkedToken_baseToken_Value: "
					+ ((activitydiagramTrace.States.ForkedToken_baseToken_Value) eObject).getBaseToken();
		} else if (eObject instanceof activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value) {
			return "activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value: "
					+ ((activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value) eObject)
							.getRemainingOffersCount();
		} else if (eObject instanceof activitydiagramTrace.States.Input_inputValues_Value) {
			return "activitydiagramTrace.States.Input_inputValues_Value: "
					+ ((activitydiagramTrace.States.Input_inputValues_Value) eObject).getInputValues();
		} else if (eObject instanceof activitydiagramTrace.States.InputValue_value_Value) {
			return "activitydiagramTrace.States.InputValue_value_Value: "
					+ ((activitydiagramTrace.States.InputValue_value_Value) eObject).getValue();
		} else if (eObject instanceof activitydiagramTrace.States.InputValue_variable_Value) {
			return "activitydiagramTrace.States.InputValue_variable_Value: "
					+ ((activitydiagramTrace.States.InputValue_variable_Value) eObject).getVariable();
		} else if (eObject instanceof activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value) {
			return "activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value: "
					+ ((activitydiagramTrace.States.IntegerCalculationExpression_assignee_Value) eObject).getAssignee();
		} else if (eObject instanceof activitydiagramTrace.States.IntegerCalculationExpression_operator_Value) {
			return "activitydiagramTrace.States.IntegerCalculationExpression_operator_Value: "
					+ ((activitydiagramTrace.States.IntegerCalculationExpression_operator_Value) eObject).getOperator();
		} else if (eObject instanceof activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value) {
			return "activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value: "
					+ ((activitydiagramTrace.States.IntegerComparisonExpression_assignee_Value) eObject).getAssignee();
		} else if (eObject instanceof activitydiagramTrace.States.IntegerComparisonExpression_operator_Value) {
			return "activitydiagramTrace.States.IntegerComparisonExpression_operator_Value: "
					+ ((activitydiagramTrace.States.IntegerComparisonExpression_operator_Value) eObject).getOperator();
		} else if (eObject instanceof activitydiagramTrace.States.IntegerExpression_operand1_Value) {
			return "activitydiagramTrace.States.IntegerExpression_operand1_Value: "
					+ ((activitydiagramTrace.States.IntegerExpression_operand1_Value) eObject).getOperand1();
		} else if (eObject instanceof activitydiagramTrace.States.IntegerExpression_operand2_Value) {
			return "activitydiagramTrace.States.IntegerExpression_operand2_Value: "
					+ ((activitydiagramTrace.States.IntegerExpression_operand2_Value) eObject).getOperand2();
		} else if (eObject instanceof activitydiagramTrace.States.IntegerValue_value_Value) {
			return "activitydiagramTrace.States.IntegerValue_value_Value: "
					+ ((activitydiagramTrace.States.IntegerValue_value_Value) eObject).getValue();
		} else if (eObject instanceof activitydiagramTrace.States.NamedElement_name_Value) {
			return "activitydiagramTrace.States.NamedElement_name_Value: "
					+ ((activitydiagramTrace.States.NamedElement_name_Value) eObject).getName();
		} else if (eObject instanceof activitydiagramTrace.States.Offer_offeredTokens_Value) {
			return "activitydiagramTrace.States.Offer_offeredTokens_Value: "
					+ ((activitydiagramTrace.States.Offer_offeredTokens_Value) eObject).getOfferedTokens();
		} else if (eObject instanceof activitydiagramTrace.States.OpaqueAction_expressions_Value) {
			return "activitydiagramTrace.States.OpaqueAction_expressions_Value: "
					+ ((activitydiagramTrace.States.OpaqueAction_expressions_Value) eObject).getExpressions();
		} else if (eObject instanceof activitydiagramTrace.States.Token_holder_Value) {
			return "activitydiagramTrace.States.Token_holder_Value: "
					+ ((activitydiagramTrace.States.Token_holder_Value) eObject).getHolder();
		} else if (eObject instanceof activitydiagramTrace.States.Trace_executedNodes_Value) {
			return "activitydiagramTrace.States.Trace_executedNodes_Value: "
					+ ((activitydiagramTrace.States.Trace_executedNodes_Value) eObject).getExecutedNodes();
		} else if (eObject instanceof activitydiagramTrace.States.Variable_currentValue_Value) {
			return "activitydiagramTrace.States.Variable_currentValue_Value: "
					+ ((activitydiagramTrace.States.Variable_currentValue_Value) eObject).getCurrentValue();
		} else if (eObject instanceof activitydiagramTrace.States.Variable_initialValue_Value) {
			return "activitydiagramTrace.States.Variable_initialValue_Value: "
					+ ((activitydiagramTrace.States.Variable_initialValue_Value) eObject).getInitialValue();
		} else if (eObject instanceof activitydiagramTrace.States.Variable_name_Value) {
			return "activitydiagramTrace.States.Variable_name_Value: "
					+ ((activitydiagramTrace.States.Variable_name_Value) eObject).getName();
		} else
			return "ERROR";
	}

	private void storeAsTracedObject(activitydiagram.Activity o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedActivity tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedActivity();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedActivitys().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getEdgesSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getInputsSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getLocalsSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getNodesSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getTraceSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getNameSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.ActivityFinalNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedActivityFinalNode();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedActivityFinalNodes().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getActivitySequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getIncomingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOutgoingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getRunningSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getNameSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.BooleanBinaryExpression o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanBinaryExpression();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedBooleanBinaryExpressions().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getOperand1Sequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOperand2Sequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOperatorSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getAssigneeSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.BooleanUnaryExpression o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanUnaryExpression();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedBooleanUnaryExpressions().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getAssigneeSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOperandSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOperatorSequence(), this));
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
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedBooleanVariables().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getCurrentValueSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getInitialValueSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getNameSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.ControlFlow o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedControlFlow tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedControlFlow();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedControlFlows().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getOffersSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getSourceSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getTargetSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getGuardSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getNameSequence(), this));
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
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedDecisionNodes().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getActivitySequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getIncomingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOutgoingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getRunningSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getNameSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.ForkNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedForkNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedForkNode();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedForkNodes().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getActivitySequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getIncomingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOutgoingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getRunningSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getNameSequence(), this));
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
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedInitialNodes().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getActivitySequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getIncomingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOutgoingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getRunningSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getNameSequence(), this));
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

	private void storeAsTracedObject(activitydiagram.IntegerCalculationExpression o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedIntegerCalculationExpression tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerCalculationExpression();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedIntegerCalculationExpressions().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getAssigneeSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOperatorSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOperand1Sequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOperand2Sequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.IntegerComparisonExpression o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerComparisonExpression();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedIntegerComparisonExpressions().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getAssigneeSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOperatorSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOperand1Sequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOperand2Sequence(), this));
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
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedIntegerVariables().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getCurrentValueSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getInitialValueSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getNameSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.JoinNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedJoinNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedJoinNode();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedJoinNodes().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getActivitySequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getIncomingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOutgoingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getRunningSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getNameSequence(), this));
		}
	}

	private void storeAsTracedObject(activitydiagram.MergeNode o) {

		// First we find the traced object, and we create it if required
		activitydiagramTrace.States.activitydiagram.TracedMergeNode tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedMergeNode();
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedMergeNodes().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getActivitySequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getIncomingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOutgoingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getRunningSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getNameSequence(), this));
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
			exeToTraced.put(o, tracedObject);
			traceRoot.getActivitydiagram_tracedOpaqueActions().add(tracedObject);

			traces.add(new GenericValueTrace(tracedObject.getActivitySequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getHeldTokensSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getIncomingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getOutgoingSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getRunningSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getNameSequence(), this));
			traces.add(new GenericValueTrace(tracedObject.getExpressionsSequence(), this));
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
		} else if (o instanceof activitydiagram.IntegerComparisonExpression) {
			storeAsTracedObject((activitydiagram.IntegerComparisonExpression) o);
		} else if (o instanceof activitydiagram.IntegerCalculationExpression) {
			storeAsTracedObject((activitydiagram.IntegerCalculationExpression) o);
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
		} else if (o instanceof activitydiagram.BooleanUnaryExpression) {
			storeAsTracedObject((activitydiagram.BooleanUnaryExpression) o);
		} else if (o instanceof activitydiagram.BooleanBinaryExpression) {
			storeAsTracedObject((activitydiagram.BooleanBinaryExpression) o);
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
			currentValues.addAll(currentState.getActivity_edges_Values());
			currentValues.addAll(currentState.getActivity_inputs_Values());
			currentValues.addAll(currentState.getActivity_locals_Values());
			currentValues.addAll(currentState.getActivity_nodes_Values());
			currentValues.addAll(currentState.getActivity_trace_Values());
			currentValues.addAll(currentState.getActivityEdge_offers_Values());
			currentValues.addAll(currentState.getActivityEdge_source_Values());
			currentValues.addAll(currentState.getActivityEdge_target_Values());
			currentValues.addAll(currentState.getActivityNode_activity_Values());
			currentValues.addAll(currentState.getActivityNode_heldTokens_Values());
			currentValues.addAll(currentState.getActivityNode_incoming_Values());
			currentValues.addAll(currentState.getActivityNode_outgoing_Values());
			currentValues.addAll(currentState.getActivityNode_running_Values());
			currentValues.addAll(currentState.getBooleanBinaryExpression_operand1_Values());
			currentValues.addAll(currentState.getBooleanBinaryExpression_operand2_Values());
			currentValues.addAll(currentState.getBooleanBinaryExpression_operator_Values());
			currentValues.addAll(currentState.getBooleanExpression_assignee_Values());
			currentValues.addAll(currentState.getBooleanUnaryExpression_operand_Values());
			currentValues.addAll(currentState.getBooleanUnaryExpression_operator_Values());
			currentValues.addAll(currentState.getBooleanValue_value_Values());
			currentValues.addAll(currentState.getControlFlow_guard_Values());
			currentValues.addAll(currentState.getForkedToken_baseToken_Values());
			currentValues.addAll(currentState.getForkedToken_remainingOffersCount_Values());
			currentValues.addAll(currentState.getInput_inputValues_Values());
			currentValues.addAll(currentState.getInputValue_value_Values());
			currentValues.addAll(currentState.getInputValue_variable_Values());
			currentValues.addAll(currentState.getIntegerCalculationExpression_assignee_Values());
			currentValues.addAll(currentState.getIntegerCalculationExpression_operator_Values());
			currentValues.addAll(currentState.getIntegerComparisonExpression_assignee_Values());
			currentValues.addAll(currentState.getIntegerComparisonExpression_operator_Values());
			currentValues.addAll(currentState.getIntegerExpression_operand1_Values());
			currentValues.addAll(currentState.getIntegerExpression_operand2_Values());
			currentValues.addAll(currentState.getIntegerValue_value_Values());
			currentValues.addAll(currentState.getNamedElement_name_Values());
			currentValues.addAll(currentState.getOffer_offeredTokens_Values());
			currentValues.addAll(currentState.getOpaqueAction_expressions_Values());
			currentValues.addAll(currentState.getToken_holder_Values());
			currentValues.addAll(currentState.getTrace_executedNodes_Values());
			currentValues.addAll(currentState.getVariable_currentValue_Values());
			currentValues.addAll(currentState.getVariable_initialValue_Values());
			currentValues.addAll(currentState.getVariable_name_Values());
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
		}

		return result;
	}

	private fr.inria.diverse.trace.api.IStep createGenericStep(activitydiagramTrace.Steps.Step step) {
		return new fr.inria.diverse.trace.api.impl.LazyGenericStep(() -> {
			return generateStep(step);
		});
		
	}
}
