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

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) o;
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

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression) o;
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
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,
						newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedControlToken>) getExeToTraced(
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
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedBooleanBinaryExpression tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanBinaryExpression();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedBooleanUnaryExpression tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanUnaryExpression();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedBooleanValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanValue();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedBooleanVariable tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedBooleanVariable();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field currentValue
			tracedObject.setBooleanVariable_currentValue_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createBooleanVariable_currentValue_Dimension());
			// Creation of the first value of the field currentValue
			activitydiagramTrace.States.BooleanVariable_currentValue_Value firstValue_currentValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createBooleanVariable_currentValue_Value();

			firstValue_currentValue.setCurrentValue((boolean) o_cast.isCurrentValue());
			tracedObject.getBooleanVariable_currentValue_Dimension().getValues().add(firstValue_currentValue);
			newState.getValues().add(firstValue_currentValue);

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

			// Creation of the dimension corresponding to the field offeredTokens
			tracedObject.setActivityEdge_offeredTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityEdge_offeredTokens_Dimension());
			// Creation of the first value of the field offeredTokens
			activitydiagramTrace.States.ActivityEdge_offeredTokens_Value firstValue_offeredTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityEdge_offeredTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast
					.getOfferedTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,
						newState);
			}

			firstValue_offeredTokens.getOfferedTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedControlToken>) getExeToTraced(
							o_cast.getOfferedTokens(), newState));

			tracedObject.getActivityEdge_offeredTokens_Dimension().getValues().add(firstValue_offeredTokens);
			newState.getValues().add(firstValue_offeredTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) o_cast,
					newState);
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
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,
						newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedControlToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedFlowFinalNode tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedFlowFinalNode();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,
						newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedControlToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
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
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,
						newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedControlToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

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
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,
						newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedControlToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedIntegerBinaryExpression tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerBinaryExpression();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedIntegerComparisonExpression tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerComparisonExpression();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedIntegerValue tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerValue();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedIntegerVariable tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedIntegerVariable();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field currentValue
			tracedObject.setIntegerVariable_currentValue_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createIntegerVariable_currentValue_Dimension());
			// Creation of the first value of the field currentValue
			activitydiagramTrace.States.IntegerVariable_currentValue_Value firstValue_currentValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createIntegerVariable_currentValue_Value();

			firstValue_currentValue.setCurrentValue((int) o_cast.getCurrentValue());
			tracedObject.getIntegerVariable_currentValue_Dimension().getValues().add(firstValue_currentValue);
			newState.getValues().add(firstValue_currentValue);

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
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,
						newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedControlToken>) getExeToTraced(
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
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,
						newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedControlToken>) getExeToTraced(
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
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			activitydiagramTrace.States.activitydiagram.TracedOffer tracedObject = activitydiagramTrace.States.activitydiagram.ActivitydiagramFactory.eINSTANCE
					.createTracedOffer();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

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
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			tracedObject.setActivityNode_heldTokens_Dimension(
					activitydiagramTrace.States.StatesFactory.eINSTANCE.createActivityNode_heldTokens_Dimension());
			// Creation of the first value of the field heldTokens
			activitydiagramTrace.States.ActivityNode_heldTokens_Value firstValue_heldTokens = activitydiagramTrace.States.StatesFactory.eINSTANCE
					.createActivityNode_heldTokens_Value();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,
						newState);
			}

			firstValue_heldTokens.getHeldTokens()
					.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedControlToken>) getExeToTraced(
							o_cast.getHeldTokens(), newState));

			tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable o_cast,
			activitydiagramTrace.States.SpecificState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) o_cast,
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
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) o;

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getBooleanVariable_CurrentValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedBooleanVariable traced = (activitydiagramTrace.States.activitydiagram.TracedBooleanVariable) exeToTraced
									.get(o);
							activitydiagramTrace.States.BooleanVariable_currentValue_Value lastValue = traced
									.getBooleanVariable_currentValue_Dimension().getValues()
									.get(traced.getBooleanVariable_currentValue_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.BooleanVariable_currentValue_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createBooleanVariable_currentValue_Value();

							boolean value = o_cast.isCurrentValue();

							newValue.setCurrentValue((boolean) value);

							traced.getBooleanVariable_currentValue_Dimension().getValues().add(newValue);
							newState.getValues().add(newValue);
						}
					}

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) o;

						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getIntegerVariable_CurrentValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							activitydiagramTrace.States.activitydiagram.TracedIntegerVariable traced = (activitydiagramTrace.States.activitydiagram.TracedIntegerVariable) exeToTraced
									.get(o);
							activitydiagramTrace.States.IntegerVariable_currentValue_Value lastValue = traced
									.getIntegerVariable_currentValue_Dimension().getValues()
									.get(traced.getIntegerVariable_currentValue_Dimension().getValues().size() - 1);
							newState.getValues().remove(lastValue);

							// And we create a proper new value
							activitydiagramTrace.States.IntegerVariable_currentValue_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
									.createIntegerVariable_currentValue_Value();

							int value = o_cast.getCurrentValue();

							newValue.setCurrentValue((int) value);

							traced.getIntegerVariable_currentValue_Dimension().getValues().add(newValue);
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
					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) o;
						activitydiagramTrace.States.activitydiagram.TracedActivityEdge tracedObject = (activitydiagramTrace.States.activitydiagram.TracedActivityEdge) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityEdge_OfferedTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<activitydiagramTrace.States.ActivityEdge_offeredTokens_Value> valueSequence = tracedObject
									.getActivityEdge_offeredTokens_Dimension().getValues();
							activitydiagramTrace.States.ActivityEdge_offeredTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast
									.getOfferedTokens()) {
								addNewObjectToState(
										(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,
										newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOfferedTokens().size() == o_cast.getOfferedTokens().size()) {
									java.util.Iterator<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken> it = o_cast
											.getOfferedTokens().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedControlToken aPreviousValue : previousValue
											.getOfferedTokens()) {
										org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aCurrentValue = it
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
								activitydiagramTrace.States.ActivityEdge_offeredTokens_Value lastValue = tracedObject
										.getActivityEdge_offeredTokens_Dimension().getValues()
										.get(tracedObject.getActivityEdge_offeredTokens_Dimension().getValues().size()
												- 1);
								newState.getValues().remove(lastValue);
								// And we create a proper new value
								activitydiagramTrace.States.ActivityEdge_offeredTokens_Value newValue = activitydiagramTrace.States.StatesFactory.eINSTANCE
										.createActivityEdge_offeredTokens_Value();
								newValue.getOfferedTokens()
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedControlToken>) getExeToTraced(
												o_cast.getOfferedTokens(), newState));
								tracedObject.getActivityEdge_offeredTokens_Dimension().getValues().add(newValue);
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
							for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast
									.getHeldTokens()) {
								addNewObjectToState(
										(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,
										newState);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken> it = o_cast
											.getHeldTokens().iterator();
									for (activitydiagramTrace.States.activitydiagram.TracedControlToken aPreviousValue : previousValue
											.getHeldTokens()) {
										org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aCurrentValue = it
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
										.addAll((Collection<? extends activitydiagramTrace.States.activitydiagram.TracedControlToken>) getExeToTraced(
												o_cast.getHeldTokens(), newState));
								tracedObject.getActivityNode_heldTokens_Dimension().getValues().add(newValue);
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
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddToken) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddToken activitydiagram_ActivityNode_AddTokenInstance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_AddToken) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_AddToken_Sequence()
						.add(activitydiagram_ActivityNode_AddTokenInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute activitydiagram_ActivityNode_ExecuteInstance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Execute) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_Execute_Sequence()
						.add(activitydiagram_ActivityNode_ExecuteInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken activitydiagram_ActivityNode_RemoveTokenInstance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_RemoveToken) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_RemoveToken_Sequence()
						.add(activitydiagram_ActivityNode_RemoveTokenInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate) {
				activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate activitydiagram_ActivityNode_TerminateInstance = (activitydiagramTrace.Steps.Activitydiagram_ActivityNode_Terminate) step_cast;
				traceRoot.getActivitydiagram_ActivityNode_Terminate_Sequence()
						.add(activitydiagram_ActivityNode_TerminateInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init) {
				activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init activitydiagram_BooleanVariable_InitInstance = (activitydiagramTrace.Steps.Activitydiagram_BooleanVariable_Init) step_cast;
				traceRoot.getActivitydiagram_BooleanVariable_Init_Sequence()
						.add(activitydiagram_BooleanVariable_InitInstance);
			} else if (step_cast instanceof activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init) {
				activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init activitydiagram_IntegerVariable_InitInstance = (activitydiagramTrace.Steps.Activitydiagram_IntegerVariable_Init) step_cast;
				traceRoot.getActivitydiagram_IntegerVariable_Init_Sequence()
						.add(activitydiagram_IntegerVariable_InitInstance);
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
