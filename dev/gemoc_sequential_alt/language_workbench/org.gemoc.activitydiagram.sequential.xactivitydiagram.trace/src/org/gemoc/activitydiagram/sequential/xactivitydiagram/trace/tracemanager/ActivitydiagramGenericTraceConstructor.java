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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange;

import fr.inria.diverse.trace.commons.model.generictrace.BooleanAttributeValue;
import fr.inria.diverse.trace.commons.model.generictrace.GenericDimension;
import fr.inria.diverse.trace.commons.model.generictrace.GenericSequentialStep;
import fr.inria.diverse.trace.commons.model.generictrace.GenericSmallStep;
import fr.inria.diverse.trace.commons.model.generictrace.GenericState;
import fr.inria.diverse.trace.commons.model.generictrace.GenericStep;
import fr.inria.diverse.trace.commons.model.generictrace.GenericTracedObject;
import fr.inria.diverse.trace.commons.model.generictrace.GenericValue;
import fr.inria.diverse.trace.commons.model.generictrace.GenerictraceFactory;
import fr.inria.diverse.trace.commons.model.generictrace.GenerictracePackage;
import fr.inria.diverse.trace.commons.model.generictrace.IntegerAttributeValue;
import fr.inria.diverse.trace.commons.model.generictrace.ManyReferenceValue;
import fr.inria.diverse.trace.commons.model.launchconfiguration.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.commons.model.trace.Trace;
import fr.inria.diverse.trace.commons.model.trace.TracedObject;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class ActivitydiagramGenericTraceConstructor implements ITraceConstructor {
	private Trace<GenericSequentialStep, GenericTracedObject, GenericState> traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, TracedObject<?>> exeToTraced;

	private GenericState lastState;

	private Resource traceResource;
	private final Deque<GenericSequentialStep> context = new LinkedList<GenericSequentialStep>();

	public ActivitydiagramGenericTraceConstructor(Resource exeModel, Resource traceResource,
			Map<EObject, TracedObject<?>> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = GenerictraceFactory.eINSTANCE.createGenericState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Offer) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) {
						org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStates().add(lastState);
		}
	}

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action o_cast,
			GenericState newState) {
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
			GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge o_cast,
			GenericState newState) {
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
			GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			GenericDimension dimension = GenerictraceFactory.eINSTANCE.createGenericDimension();
			dimension.setDynamicProperty(ActivitydiagramPackage.eINSTANCE.getActivityNode_HeldTokens());
			tracedObject.getAllDimensions().add(dimension);
			// Creation of the first value of the field heldTokens
			ManyReferenceValue firstValue_heldTokens = GenerictraceFactory.eINSTANCE.createManyReferenceValue();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast
					.getHeldTokens()) {
				addNewObjectToState(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,
						newState);
			}

			firstValue_heldTokens.getReferenceValues()
					.addAll((Collection<? extends GenericTracedObject>) getExeToTraced(o_cast.getHeldTokens()));

			dimension.getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode o_cast,
			GenericState newState) {
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
			GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression o_cast,
			GenericState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression o_cast, GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue o_cast, GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable o_cast, GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field currentValue
			GenericDimension dimension = GenerictraceFactory.eINSTANCE.createGenericDimension();
			dimension.setDynamicProperty(ActivitydiagramPackage.eINSTANCE.getBooleanVariable_CurrentValue());
			tracedObject.getAllDimensions().add(dimension);
			// Creation of the first value of the field currentValue
			BooleanAttributeValue firstValue_currentValue = GenerictraceFactory.eINSTANCE.createBooleanAttributeValue();

			firstValue_currentValue.setAttributeValue(o_cast.isCurrentValue());
			dimension.getValues().add(firstValue_currentValue);
			newState.getValues().add(firstValue_currentValue);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow o_cast, GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field offeredTokens
			GenericDimension dimension = GenerictraceFactory.eINSTANCE.createGenericDimension();
			dimension.setDynamicProperty(ActivitydiagramPackage.eINSTANCE.getActivityEdge_OfferedTokens());
			tracedObject.getAllDimensions().add(dimension);
			// Creation of the first value of the field offeredTokens
			ManyReferenceValue firstValue_offeredTokens = GenerictraceFactory.eINSTANCE.createManyReferenceValue();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast.getOfferedTokens()) {
				addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,newState);
			}

			firstValue_offeredTokens.getReferenceValues().addAll((Collection<? extends GenericTracedObject>) getExeToTraced(o_cast.getOfferedTokens()));

			dimension.getValues().add(firstValue_offeredTokens);
			newState.getValues().add(firstValue_offeredTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode o_cast,
			GenericState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken o_cast, GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode o_cast, GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			GenericDimension dimension = GenerictraceFactory.eINSTANCE.createGenericDimension();
			dimension.setDynamicProperty(ActivitydiagramPackage.eINSTANCE.getActivityNode_HeldTokens());
			tracedObject.getAllDimensions().add(dimension);
			// Creation of the first value of the field heldTokens
			ManyReferenceValue firstValue_heldTokens = GenerictraceFactory.eINSTANCE.createManyReferenceValue();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast.getHeldTokens()) {
				addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,newState);
			}

			firstValue_heldTokens.getReferenceValues().addAll((Collection<? extends GenericTracedObject>) getExeToTraced(o_cast.getHeldTokens()));

			dimension.getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression o_cast,
			GenericState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode o_cast,
			GenericState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode o_cast, GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			GenericDimension dimension = GenerictraceFactory.eINSTANCE.createGenericDimension();
			dimension.setDynamicProperty(ActivitydiagramPackage.eINSTANCE.getActivityNode_HeldTokens());
			tracedObject.getAllDimensions().add(dimension);
			// Creation of the first value of the field heldTokens
			ManyReferenceValue firstValue_heldTokens = GenerictraceFactory.eINSTANCE.createManyReferenceValue();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast.getHeldTokens()) {
				addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,newState);
			}

			firstValue_heldTokens.getReferenceValues().addAll((Collection<? extends GenericTracedObject>) getExeToTraced(o_cast.getHeldTokens()));

			dimension.getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode o_cast, GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			GenericDimension dimension = GenerictraceFactory.eINSTANCE.createGenericDimension();
			dimension.setDynamicProperty(ActivitydiagramPackage.eINSTANCE.getActivityNode_HeldTokens());
			tracedObject.getAllDimensions().add(dimension);
			// Creation of the first value of the field heldTokens
			ManyReferenceValue firstValue_heldTokens = GenerictraceFactory.eINSTANCE.createManyReferenceValue();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast.getHeldTokens()) {
				addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,newState);
			}

			firstValue_heldTokens.getReferenceValues().addAll((Collection<? extends GenericTracedObject>) getExeToTraced(o_cast.getHeldTokens()));

			dimension.getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode o_cast,
			GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			GenericDimension dimension = GenerictraceFactory.eINSTANCE.createGenericDimension();
			dimension.setDynamicProperty(ActivitydiagramPackage.eINSTANCE.getActivityNode_HeldTokens());
			tracedObject.getAllDimensions().add(dimension);
			// Creation of the first value of the field heldTokens
			ManyReferenceValue firstValue_heldTokens = GenerictraceFactory.eINSTANCE.createManyReferenceValue();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast.getHeldTokens()) {
				addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,newState);
			}

			firstValue_heldTokens.getReferenceValues().addAll((Collection<? extends GenericTracedObject>) getExeToTraced(o_cast.getHeldTokens()));

			dimension.getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression o_cast,
			GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression o_cast,
			GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression o_cast,
			GenericState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue o_cast,
			GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable o_cast, GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field currentValue
			GenericDimension dimension = GenerictraceFactory.eINSTANCE.createGenericDimension();
			dimension.setDynamicProperty(ActivitydiagramPackage.eINSTANCE.getIntegerVariable_CurrentValue());
			tracedObject.getAllDimensions().add(dimension);
			// Creation of the first value of the field currentValue
			IntegerAttributeValue firstValue_currentValue = GenerictraceFactory.eINSTANCE.createIntegerAttributeValue();

			firstValue_currentValue.setAttributeValue(o_cast.getCurrentValue());
			dimension.getValues().add(firstValue_currentValue);
			newState.getValues().add(firstValue_currentValue);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode o_cast,
			GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			GenericDimension dimension = GenerictraceFactory.eINSTANCE.createGenericDimension();
			dimension.setDynamicProperty(ActivitydiagramPackage.eINSTANCE.getActivityNode_HeldTokens());
			tracedObject.getAllDimensions().add(dimension);
			// Creation of the first value of the field heldTokens
			ManyReferenceValue firstValue_heldTokens = GenerictraceFactory.eINSTANCE.createManyReferenceValue();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast.getHeldTokens()) {
				addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue,newState);
			}

			firstValue_heldTokens.getReferenceValues().addAll((Collection<? extends GenericTracedObject>) getExeToTraced(o_cast.getHeldTokens()));

			dimension.getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode o_cast,
			GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE.createGenericTracedObject();
			tracedObject.setOriginalObject(o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			GenericDimension dimension = GenerictraceFactory.eINSTANCE.createGenericDimension();
			dimension.setDynamicProperty(ActivitydiagramPackage.eINSTANCE.getActivityNode_HeldTokens());
			tracedObject.getAllDimensions().add(dimension);
			// Creation of the first value of the field heldTokens
			ManyReferenceValue firstValue_heldTokens = GenerictraceFactory.eINSTANCE.createManyReferenceValue();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast.getHeldTokens()) {
				addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue, newState);
			}

			firstValue_heldTokens.getReferenceValues().addAll((Collection<? extends GenericTracedObject>) getExeToTraced(o_cast.getHeldTokens()));

			dimension.getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement o_cast,
			GenericState newState) {
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
			GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE
					.createGenericTracedObject();
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	@SuppressWarnings("unchecked")
	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction o_cast,
			GenericState newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			GenericTracedObject tracedObject = GenerictraceFactory.eINSTANCE
					.createGenericTracedObject();
			tracedObject.setOriginalObject(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getTracedObjects().add(tracedObject);

			// Creation of the dimension corresponding to the field heldTokens
			GenericDimension dimension = GenerictraceFactory.eINSTANCE.createGenericDimension();
			dimension.setDynamicProperty(ActivitydiagramPackage.eINSTANCE.getActivityNode_HeldTokens());
			tracedObject.getAllDimensions().add(dimension);
			// Creation of the first value of the field heldTokens
			ManyReferenceValue firstValue_heldTokens = GenerictraceFactory.eINSTANCE.createManyReferenceValue();

			for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast.getHeldTokens()) {
				addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue, newState);
			}

			firstValue_heldTokens.getReferenceValues().addAll((Collection<? extends GenericTracedObject>) getExeToTraced(o_cast.getHeldTokens()));

			dimension.getValues().add(firstValue_heldTokens);
			newState.getValues().add(firstValue_heldTokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(
			org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value o_cast,
			GenericState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) o_cast,
					newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) {
			added = addNewObjectToState(
					(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) o_cast,
					newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable o_cast, GenericState newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) {
			added = addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private GenericState copyState(GenericState oldState) {
		GenericState newState = GenerictraceFactory.eINSTANCE
				.createGenericState();
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
			GenericState newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					EStructuralFeature p = ((NonCollectionFieldModelChange) modelChange).getChangedField();
					
					final GenericTracedObject tracedObject = (GenericTracedObject) exeToTraced.get(o);
					final GenericDimension dimension = tracedObject.getAllDimensions().stream()
							.filter(d -> d.getDynamicProperty() == p)
							.findFirst().orElse(null);
					if (dimension != null) {
						final List<GenericValue> values = newState.getValues();
						if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) {
							org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) o;
							if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE.getIntegerVariable_CurrentValue().getFeatureID()) {
								// Rollback: we remove the last value of this field from the new state
								tracedObject.getAllDimensions().forEach(d -> values.remove(d.getValues().get(d.getValues().size() - 1)));
								// And we create a proper new value
								IntegerAttributeValue newValue = GenerictraceFactory.eINSTANCE.createIntegerAttributeValue();
								int value = o_cast.getCurrentValue();
								newValue.setAttributeValue(value);
								dimension.getValues().add(newValue);
								newState.getValues().add(newValue);
							}
						}

						if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) {
							org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) o;
							if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE.getBooleanVariable_CurrentValue().getFeatureID()) {
								// Rollback: we remove the last value of this field from the new state
								tracedObject.getAllDimensions().forEach(d -> values.remove(d.getValues().get(d.getValues().size() - 1)));
								// And we create a proper new value
								BooleanAttributeValue newValue = GenerictraceFactory.eINSTANCE.createBooleanAttributeValue();
								boolean value = o_cast.isCurrentValue();
								newValue.setAttributeValue(value);
								dimension.getValues().add(newValue);
								newState.getValues().add(newValue);
							}
						}
					}
					
					
				}
				// Here we look at collection mutable fields
				// We must first manually find out if the collection changed...
				// If it changed we must rollback the last values from the copied state, and add new values as well
				else if (modelChange instanceof PotentialCollectionFieldModelChange) {
					EStructuralFeature p = ((PotentialCollectionFieldModelChange) modelChange).getChangedField();
					
					final GenericTracedObject tracedObject = (GenericTracedObject) exeToTraced.get(o);
					final GenericDimension dimension = tracedObject.getAllDimensions().stream()
							.filter(d -> d.getDynamicProperty() == p)
							.findFirst().orElse(null);
					if (dimension != null) {
						if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) {
							org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) o;
							if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
									.getActivityEdge_OfferedTokens().getFeatureID()) {
								// We compare the last collection in the value sequence, and the current one in the potentially changed object
								final List<GenericValue> dimensionValues = dimension.getValues();
								final ManyReferenceValue lastValue = (ManyReferenceValue) dimensionValues.get(dimensionValues.size() - 1);
								for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast.getOfferedTokens()) {
									addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue, newState);
								}
								boolean change = false;
								if (lastValue != null) {
									if (lastValue.getReferenceValues().size() == o_cast.getOfferedTokens().size()) {
										java.util.Iterator<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken> it = o_cast.getOfferedTokens().iterator();
										for (EObject aPreviousValue : lastValue.getReferenceValues()) {
											org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aCurrentValue = it.next();
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
									newState.getValues().remove(lastValue);
									// And we create a proper new value
									ManyReferenceValue newValue = GenerictraceFactory.eINSTANCE.createManyReferenceValue();
									newValue.getReferenceValues().addAll((Collection<? extends GenericTracedObject>) getExeToTraced(o_cast.getOfferedTokens()));
									dimension.getValues().add(newValue);
									newState.getValues().add(newValue);
								}
							}
						}
						if (o instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) {
							org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode o_cast = (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) o;
							
							if (p.getFeatureID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
									.getActivityEdge_OfferedTokens().getFeatureID()) {
								// We compare the last collection in the value sequence, and the current one in the potentially changed object
								final List<GenericValue> dimensionValues = dimension.getValues();
								final ManyReferenceValue lastValue = (ManyReferenceValue) dimensionValues.get(dimensionValues.size() - 1);
								for (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aValue : o_cast.getHeldTokens()) {
									addNewObjectToState((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) aValue, newState);
								}
								boolean change = false;
								if (lastValue != null) {
									if (lastValue.getReferenceValues().size() == o_cast.getHeldTokens().size()) {
										java.util.Iterator<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken> it = o_cast.getHeldTokens().iterator();
										for (EObject aPreviousValue : lastValue.getReferenceValues()) {
											org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken aCurrentValue = it.next();
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
									newState.getValues().remove(lastValue);
									// And we create a proper new value
									ManyReferenceValue newValue = GenerictraceFactory.eINSTANCE.createManyReferenceValue();
									newValue.getReferenceValues().addAll((Collection<? extends GenericTracedObject>) getExeToTraced(o_cast.getHeldTokens()));
									dimension.getValues().add(newValue);
									newState.getValues().add(newValue);
								}
							}
						}
					}
				}
			}
			if (stateChanged) {
				final GenericStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final GenericState startingState = lastState;
					final GenericState endingState = newState;
					addImplicitStep((BigStep<GenericStep, GenericState>) currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStates().add(lastState);
			} else if (copiedState) {
				newState.getValues().clear();
			}
			copiedState = false;
		}
	}

	@Override
	public void addStep(Step<?> step) {
		GenericSequentialStep step_cast = null;
		if (step != null && step instanceof GenericSequentialStep) {
			step_cast = (GenericSequentialStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());
			GenericState state = traceRoot.getStates().get(traceRoot.getStates().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				context.getFirst().getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}
		}
		context.push(step_cast);
	}

	@Override
	public void endStep(Step<?> step) {
		GenericStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}
	
	private void addImplicitStep(BigStep<GenericStep, GenericState> currentStep, GenericState startingState, GenericState endingState) {
		GenericSmallStep implicitStep = GenerictraceFactory.eINSTANCE.createGenericSmallStep();
		implicitStep.setStartingState(startingState);
		implicitStep.setEndingState(endingState);
		currentStep.getSubSteps().add(implicitStep);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = GenerictraceFactory.eINSTANCE.createGenericTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		GenericSequentialStep rootStep = GenerictraceFactory.eINSTANCE.createGenericSequentialStep();
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

	private Collection<? extends EObject> getExeToTraced(Collection<? extends EObject> exeObjects) {
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
