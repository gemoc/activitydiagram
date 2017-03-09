package org.gemoc.activitydiagram.sequential.xactivitydiagram.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

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

	public ActivitydiagramTraceStateManager(Resource modelResource, Map<TracedObject<?>, EObject> tracedToExe) {
		this.modelResource = modelResource;
		this.tracedToExe = tracedToExe;
	}
	
	private int nbRestore = 0;
	
	private double averageTime = 0;

	@Override
	public void restoreState(State<?, ?> state) {
		if (modelResource != null && state instanceof activitydiagramTrace.States.SpecificState) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				if (ed != null) {
					final RecordingCommand command = new RecordingCommand(ed, "") {
						protected void doExecute() {
							double t1 = System.nanoTime();
							restoreStateExecuteOptimized((activitydiagramTrace.States.SpecificState) state);
							double t2 = System.nanoTime();
							double totalTime = averageTime * nbRestore;
							nbRestore++;
							averageTime = (totalTime + t2 - t1) / nbRestore;
							System.out.println("--Restore time: " + (t2 - t1)/1000000);
							System.out.println("--Average time: " + averageTime/1000000 + "ms");
						}
					};
					CommandExecution.execute(ed, command);
				}
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private EObject getTracedToExe(EObject tracedObject) {
		return tracedToExe.get(tracedObject);
	}

	private Collection<? extends EObject> getTracedToExe(Collection<? extends EObject> tracedObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject tracedObject : tracedObjects) {
			result.add(tracedToExe.get(tracedObject));
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private void restoreStateExecuteOptimized(activitydiagramTrace.States.SpecificState state) {
		for (activitydiagramTrace.States.SpecificValue value : state.getValues()) {
			if (value instanceof activitydiagramTrace.States.ActivityNode_heldTokens_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedActivityNode tracedObject = (activitydiagramTrace.States.activitydiagram.TracedActivityNode) value
						.eContainer().eContainer();
				final org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) tracedToExe
						.get(tracedObject);
				originalObject.getHeldTokens().clear();
				originalObject.getHeldTokens()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
								((activitydiagramTrace.States.ActivityNode_heldTokens_Value) value).getHeldTokens()));
			} else if (value instanceof activitydiagramTrace.States.ActivityEdge_offers_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedActivityEdge tracedObject = (activitydiagramTrace.States.activitydiagram.TracedActivityEdge) value
						.eContainer().eContainer();
				final org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) tracedToExe
						.get(tracedObject);
				originalObject.getOffers().clear();
				originalObject.getOffers()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer>) getTracedToExe(
								((activitydiagramTrace.States.ActivityEdge_offers_Value) value).getOffers()));
			} else if (value instanceof activitydiagramTrace.States.Activity_trace_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedActivity tracedObject = (activitydiagramTrace.States.activitydiagram.TracedActivity) value
						.eContainer().eContainer();
				final org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) tracedToExe
						.get(tracedObject);
				final org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace toSet = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) getTracedToExe(
						((activitydiagramTrace.States.Activity_trace_Value) value).getTrace());
				final org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace current = originalObject
						.getTrace();
				if (current != toSet) {
					originalObject.setTrace(
							(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) toSet);
				}
			} else if (value instanceof activitydiagramTrace.States.DynamicBooleanValue_value_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue tracedObject = (activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue) value
						.eContainer().eContainer();
				final org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue) tracedToExe
						.get(tracedObject);
				final boolean toSet = ((activitydiagramTrace.States.DynamicBooleanValue_value_Value) value).isValue();
				final boolean current = originalObject.isValue();
				if (current != toSet) {
					originalObject.setValue((boolean) toSet);
				}
			} else if (value instanceof activitydiagramTrace.States.ForkedToken_baseToken_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedForkedToken tracedObject = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) value
						.eContainer().eContainer();
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) getTracedToExe(
						tracedObject);
				exeObject.setBaseToken(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) getTracedToExe(
								((activitydiagramTrace.States.ForkedToken_baseToken_Value) value).getBaseToken()));
			} else if (value instanceof activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedForkedToken tracedObject = (activitydiagramTrace.States.activitydiagram.TracedForkedToken) value
						.eContainer().eContainer();
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) getTracedToExe(
						tracedObject);
				exeObject.setRemainingOffersCount(
						(int) ((activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value) value)
								.getRemainingOffersCount());
			} else if (value instanceof activitydiagramTrace.States.Input_inputValues_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedInput tracedObject = (activitydiagramTrace.States.activitydiagram.TracedInput) value
						.eContainer().eContainer();
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input) getTracedToExe(
						tracedObject);
				exeObject.getInputValues().clear();
				exeObject.getInputValues()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue>) getTracedToExe(
								((activitydiagramTrace.States.Input_inputValues_Value) value).getInputValues()));
			} else if (value instanceof activitydiagramTrace.States.Offer_offeredTokens_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedOffer tracedObject = (activitydiagramTrace.States.activitydiagram.TracedOffer) value
						.eContainer().eContainer();
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) getTracedToExe(
						tracedObject);
				exeObject.getOfferedTokens().clear();
				exeObject.getOfferedTokens()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
								((activitydiagramTrace.States.Offer_offeredTokens_Value) value).getOfferedTokens()));
			} else if (value instanceof activitydiagramTrace.States.Trace_executedNodes_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedTrace tracedObject = (activitydiagramTrace.States.activitydiagram.TracedTrace) value
						.eContainer().eContainer();
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) getTracedToExe(
						tracedObject);
				exeObject.getExecutedNodes().clear();
				exeObject.getExecutedNodes()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode>) getTracedToExe(
								((activitydiagramTrace.States.Trace_executedNodes_Value) value).getExecutedNodes()));
			} else if (value instanceof activitydiagramTrace.States.DynamicIntegerValue_value_Value) {
				final activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue tracedObject = (activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue) value
						.eContainer().eContainer();
				final org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue) tracedToExe
						.get(tracedObject);
				final int toSet = ((activitydiagramTrace.States.DynamicIntegerValue_value_Value) value).getValue();
				final int current = originalObject.getValue();
				if (current != toSet) {
					originalObject.setValue((int) toSet);
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void restoreStateExecute(activitydiagramTrace.States.SpecificState state) {
		for (activitydiagramTrace.States.SpecificValue value : state.getValues()) {
			final EObject parent = value.eContainer().eContainer();
			if (value instanceof activitydiagramTrace.States.ActivityNode_heldTokens_Value) {
				if (parent instanceof activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode) {
					activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedActivityFinalNode) parent;
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									((activitydiagramTrace.States.ActivityNode_heldTokens_Value) value)
											.getHeldTokens()));
				}
				if (parent instanceof activitydiagramTrace.States.activitydiagram.TracedActivityNode) {
					activitydiagramTrace.States.activitydiagram.TracedActivityNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedActivityNode) parent;
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									((activitydiagramTrace.States.ActivityNode_heldTokens_Value) value)
											.getHeldTokens()));
				}
				if (parent instanceof activitydiagramTrace.States.activitydiagram.TracedDecisionNode) {
					activitydiagramTrace.States.activitydiagram.TracedDecisionNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedDecisionNode) parent;
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									((activitydiagramTrace.States.ActivityNode_heldTokens_Value) value)
											.getHeldTokens()));
				}
				if (parent instanceof activitydiagramTrace.States.activitydiagram.TracedForkNode) {
					activitydiagramTrace.States.activitydiagram.TracedForkNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedForkNode) parent;
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									((activitydiagramTrace.States.ActivityNode_heldTokens_Value) value)
											.getHeldTokens()));
				}
				if (parent instanceof activitydiagramTrace.States.activitydiagram.TracedInitialNode) {
					activitydiagramTrace.States.activitydiagram.TracedInitialNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedInitialNode) parent;
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									((activitydiagramTrace.States.ActivityNode_heldTokens_Value) value)
											.getHeldTokens()));
				}
				if (parent instanceof activitydiagramTrace.States.activitydiagram.TracedJoinNode) {
					activitydiagramTrace.States.activitydiagram.TracedJoinNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedJoinNode) parent;
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									((activitydiagramTrace.States.ActivityNode_heldTokens_Value) value)
											.getHeldTokens()));
				}
				if (parent instanceof activitydiagramTrace.States.activitydiagram.TracedMergeNode) {
					activitydiagramTrace.States.activitydiagram.TracedMergeNode parent_cast = (activitydiagramTrace.States.activitydiagram.TracedMergeNode) parent;
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									((activitydiagramTrace.States.ActivityNode_heldTokens_Value) value)
											.getHeldTokens()));
				}
				if (parent instanceof activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) {
					activitydiagramTrace.States.activitydiagram.TracedOpaqueAction parent_cast = (activitydiagramTrace.States.activitydiagram.TracedOpaqueAction) parent;
					org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) parent_cast
							.getOriginalObject_ActivityNode();
					originalObject.getHeldTokens().clear();
					originalObject.getHeldTokens()
							.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
									((activitydiagramTrace.States.ActivityNode_heldTokens_Value) value)
											.getHeldTokens()));
				}
			} else if (value instanceof activitydiagramTrace.States.ActivityEdge_offers_Value) {
				activitydiagramTrace.States.activitydiagram.TracedControlFlow parent_cast = (activitydiagramTrace.States.activitydiagram.TracedControlFlow) parent;
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge originalObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) parent_cast
						.getOriginalObject();
				originalObject.getOffers().clear();
				originalObject.getOffers()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer>) getTracedToExe(
								((activitydiagramTrace.States.ActivityEdge_offers_Value) value).getOffers()));
			} else if (value instanceof activitydiagramTrace.States.Activity_trace_Value) {
				activitydiagramTrace.States.activitydiagram.TracedActivity parent_cast = (activitydiagramTrace.States.activitydiagram.TracedActivity) parent;
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace toSet = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) getTracedToExe(
						((activitydiagramTrace.States.Activity_trace_Value) value).getTrace());
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace current = ((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) parent_cast
						.getOriginalObject()).getTrace();
				if (current != toSet) {
					((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) parent_cast
							.getOriginalObject()).setTrace(
									(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) toSet);
				}
			} else if (value instanceof activitydiagramTrace.States.DynamicIntegerValue_value_Value) {
				activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue parent_cast = (activitydiagramTrace.States.activitydiagram.TracedDynamicIntegerValue) parent;
				int toSet = ((activitydiagramTrace.States.DynamicIntegerValue_value_Value) value).getValue();
				int current = ((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue) parent_cast
						.getOriginalObject()).getValue();
				if (current != toSet) {
					((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue) parent_cast
							.getOriginalObject()).setValue((int) toSet);
				}
			} else if (value instanceof activitydiagramTrace.States.DynamicBooleanValue_value_Value) {
				activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue parent_cast = (activitydiagramTrace.States.activitydiagram.TracedDynamicBooleanValue) parent;
				boolean toSet = ((activitydiagramTrace.States.DynamicBooleanValue_value_Value) value).isValue();
				boolean current = ((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue) parent_cast
						.getOriginalObject()).isValue();
				if (current != toSet) {
					((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue) parent_cast
							.getOriginalObject()).setValue((boolean) toSet);
				}
			} else if (value instanceof activitydiagramTrace.States.ForkedToken_baseToken_Value) {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) getTracedToExe(
						parent);
				exeObject.setBaseToken(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) getTracedToExe(
								((activitydiagramTrace.States.ForkedToken_baseToken_Value) value).getBaseToken()));
			} else if (value instanceof activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value) {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken) getTracedToExe(
						parent);
				exeObject.setRemainingOffersCount(
						(int) ((activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value) value)
								.getRemainingOffersCount());
			} else if (value instanceof activitydiagramTrace.States.Input_inputValues_Value) {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Input) getTracedToExe(
						parent);
				exeObject.getInputValues().clear();
				exeObject.getInputValues()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue>) getTracedToExe(
								((activitydiagramTrace.States.Input_inputValues_Value) value).getInputValues()));
			} else if (value instanceof activitydiagramTrace.States.Offer_offeredTokens_Value) {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) getTracedToExe(
						parent);
				exeObject.getOfferedTokens().clear();
				exeObject.getOfferedTokens()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token>) getTracedToExe(
								((activitydiagramTrace.States.Offer_offeredTokens_Value) value).getOfferedTokens()));
			} else if (value instanceof activitydiagramTrace.States.Trace_executedNodes_Value) {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace exeObject = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) getTracedToExe(
						parent);
				exeObject.getExecutedNodes().clear();
				exeObject.getExecutedNodes()
						.addAll((Collection<? extends org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode>) getTracedToExe(
								((activitydiagramTrace.States.Trace_executedNodes_Value) value).getExecutedNodes()));
			}
		}
	}
}
