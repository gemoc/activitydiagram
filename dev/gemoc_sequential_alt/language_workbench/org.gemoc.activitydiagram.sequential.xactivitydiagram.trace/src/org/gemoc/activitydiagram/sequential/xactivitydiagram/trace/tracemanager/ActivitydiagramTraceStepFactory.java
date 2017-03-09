
package org.gemoc.activitydiagram.sequential.xactivitydiagram.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class ActivitydiagramTraceStepFactory implements IStepFactory {

	@Override
	public fr.inria.diverse.trace.commons.model.trace.Step<?> createStep(
			fr.inria.diverse.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		fr.inria.diverse.trace.commons.model.trace.Step<?> step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getActivity().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_Activity_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("addToken")
				&& (ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getAction().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityFinalNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getControlNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getDecisionNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getFinalNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getFlowFinalNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getForkNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getInitialNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getJoinNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getMergeNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getOpaqueAction().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityNode_AddToken();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getAction().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityFinalNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getControlNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getDecisionNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getFinalNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getFlowFinalNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getForkNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getInitialNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getJoinNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getMergeNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getOpaqueAction().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityNode_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("removeToken")
				&& (ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getAction().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityFinalNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getControlNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getDecisionNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getFinalNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getFlowFinalNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getForkNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getInitialNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getJoinNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getMergeNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getOpaqueAction().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityNode_RemoveToken();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("terminate")
				&& (ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getAction().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityFinalNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getControlNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getDecisionNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getFinalNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getFlowFinalNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getForkNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getInitialNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getJoinNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getMergeNode().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getOpaqueAction().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityNode_Terminate();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("init")
				&& (ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getBooleanVariable().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_BooleanVariable_Init();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("init")
				&& (ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getIntegerVariable().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_IntegerVariable_Init();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("init")
				&& (ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getBooleanVariable().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getIntegerVariable().getClassifierID()
						|| ec.getClassifierID() == org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getVariable().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_Variable_Init();
		}

		else {
			step = fr.inria.diverse.trace.commons.model.generictrace.GenerictraceFactory.eINSTANCE
					.createGenericSequentialStep();
		}

		fr.inria.diverse.trace.commons.model.trace.MSEOccurrence mseocc = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}
