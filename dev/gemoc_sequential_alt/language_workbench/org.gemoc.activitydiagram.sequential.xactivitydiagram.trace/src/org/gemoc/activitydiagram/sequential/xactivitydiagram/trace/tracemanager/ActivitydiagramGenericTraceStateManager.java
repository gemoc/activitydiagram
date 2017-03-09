package org.gemoc.activitydiagram.sequential.xactivitydiagram.trace.tracemanager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import org.gemoc.executionframework.engine.core.CommandExecution;

import fr.inria.diverse.trace.commons.model.generictrace.BooleanAttributeValue;
import fr.inria.diverse.trace.commons.model.generictrace.GenericDimension;
import fr.inria.diverse.trace.commons.model.generictrace.GenericState;
import fr.inria.diverse.trace.commons.model.generictrace.GenericTracedObject;
import fr.inria.diverse.trace.commons.model.generictrace.GenericValue;
import fr.inria.diverse.trace.commons.model.generictrace.IntegerAttributeValue;
import fr.inria.diverse.trace.commons.model.generictrace.ManyReferenceValue;
import fr.inria.diverse.trace.commons.model.trace.State;
import fr.inria.diverse.trace.commons.model.trace.TracedObject;
import fr.inria.diverse.trace.gemoc.api.IStateManager;

public class ActivitydiagramGenericTraceStateManager implements IStateManager<State<?, ?>> {

	private final Resource modelResource;

	private final Map<TracedObject<?>, EObject> tracedToExe;

	private final EStructuralFeature booleanVariableCurrentValue = ActivitydiagramPackage.eINSTANCE.getBooleanVariable_CurrentValue();
	private final EStructuralFeature integerVariableCurrentValue = ActivitydiagramPackage.eINSTANCE.getIntegerVariable_CurrentValue();
	private final EStructuralFeature activityNodeHeldTokens = ActivitydiagramPackage.eINSTANCE.getActivityNode_HeldTokens();
	private final EStructuralFeature activityEdgeOfferedTokens = ActivitydiagramPackage.eINSTANCE.getActivityEdge_OfferedTokens();

	private Consumer<Long> logger;
	
	public ActivitydiagramGenericTraceStateManager(Resource modelResource, Map<TracedObject<?>, EObject> tracedToExe, Consumer<Long> logger) {
		this.modelResource = modelResource;
		this.tracedToExe = tracedToExe;
		this.logger = logger;
	}
	

	@Override
	public void restoreState(State<?, ?> state) {
		if (modelResource != null && state instanceof GenericState) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				if (ed != null) {
					final RecordingCommand command = new RecordingCommand(ed, "") {
						protected void doExecute() {
							if (logger != null) {
								long t = System.nanoTime();
								restoreStateExecute((GenericState) state);
								logger.accept((System.nanoTime() - t));
							} else {
								restoreStateExecute((GenericState) state);
							}
						}
					};
					CommandExecution.execute(ed, command);
				}
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private Collection<? extends EObject> getTracedToExe(Collection<? extends EObject> tracedObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject tracedObject : tracedObjects) {
			result.add(tracedToExe.get(tracedObject));
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private void restoreStateExecute(GenericState state) {
		for (GenericValue value : state.getValues()) {
			GenericDimension dimension = (GenericDimension) value.eContainer();
//			final GenericTracedObject tracedObject = (GenericTracedObject) dimension.eContainer();
			EStructuralFeature f = dimension.getDynamicProperty();
			if (f == booleanVariableCurrentValue) {
				final BooleanVariable originalObject = (BooleanVariable) tracedToExe.get(dimension.eContainer());
				final boolean toSet = ((BooleanAttributeValue) value).isAttributeValue();
				final boolean current = originalObject.isCurrentValue();
				if (current != toSet) {
					originalObject.setCurrentValue(toSet);
				}
			} else if (f == integerVariableCurrentValue) {
				final IntegerVariable originalObject = (IntegerVariable) tracedToExe.get(dimension.eContainer());
				final int toSet = ((IntegerAttributeValue) value).getAttributeValue();
				final int current = originalObject.getCurrentValue();
				if (current != toSet) {
					originalObject.setCurrentValue(toSet);
				}
			} else if (f == activityNodeHeldTokens) {
				final ActivityNode originalObject = (ActivityNode) tracedToExe.get(dimension.eContainer());
				originalObject.getHeldTokens().clear();
				originalObject.getHeldTokens().addAll((Collection<? extends ControlToken>) getTracedToExe(((ManyReferenceValue) value).getReferenceValues()));
			} else if (f == activityEdgeOfferedTokens) {
				final ActivityEdge originalObject = (ActivityEdge) tracedToExe.get(dimension.eContainer());
				originalObject.getOfferedTokens().clear();
				originalObject.getOfferedTokens().addAll((Collection<? extends ControlToken>) getTracedToExe(((ManyReferenceValue) value).getReferenceValues()));
			}
		}
	}
}
