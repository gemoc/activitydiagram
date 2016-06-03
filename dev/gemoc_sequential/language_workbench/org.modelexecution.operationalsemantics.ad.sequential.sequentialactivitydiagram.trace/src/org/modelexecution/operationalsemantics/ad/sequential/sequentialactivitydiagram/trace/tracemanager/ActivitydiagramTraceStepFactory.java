package org.modelexecution.operationalsemantics.ad.sequential.sequentialactivitydiagram.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class ActivitydiagramTraceStepFactory implements IStepFactory {

	@Override
	public org.gemoc.executionframework.engine.mse.Step createStep(org.gemoc.executionframework.engine.mse.MSE mse,
			List<Object> parameters, List<Object> result) {

		org.gemoc.executionframework.engine.mse.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivity()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_Activity_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("initializeContext")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivity()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_Activity_InitializeContext();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("reset")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivity()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_Activity_Reset();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("writeTrace")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivity()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_Activity_WriteTrace();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivityFinalNode()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityFinalNode_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("addTokens1")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getAction()
						.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityFinalNode().getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivityNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getControlNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getDecisionNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getExecutableNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getFinalNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getForkNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getInitialNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getJoinNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getMergeNode()
								.getClassifierID() || ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getOpaqueAction().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityNode_AddTokens1();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getAction()
						.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityFinalNode().getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivityNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getControlNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getDecisionNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getExecutableNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getFinalNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getForkNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getInitialNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getJoinNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getMergeNode()
								.getClassifierID() || ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getOpaqueAction().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityNode_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("removeToken1")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getAction()
						.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityFinalNode().getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivityNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getControlNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getDecisionNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getExecutableNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getFinalNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getForkNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getInitialNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getJoinNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getMergeNode()
								.getClassifierID() || ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getOpaqueAction().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityNode_RemoveToken1();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("sendOffers1")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getAction()
						.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityFinalNode().getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivityNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getControlNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getDecisionNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getExecutableNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getFinalNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getForkNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getInitialNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getJoinNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getMergeNode()
								.getClassifierID() || ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getOpaqueAction().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityNode_SendOffers1();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("takeOfferdTokens1")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getAction()
						.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityFinalNode().getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivityNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getControlNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getDecisionNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getExecutableNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getFinalNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getForkNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getInitialNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getJoinNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getMergeNode()
								.getClassifierID() || ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getOpaqueAction().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ActivityNode_TakeOfferdTokens1();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("terminate")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getAction()
						.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityFinalNode().getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivityNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getControlNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getDecisionNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getExecutableNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getFinalNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getForkNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getInitialNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getJoinNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getMergeNode()
								.getClassifierID() || ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getOpaqueAction().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityNode_Terminate();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getBooleanBinaryExpression().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_BooleanBinaryExpression_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getBooleanUnaryExpression().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_BooleanUnaryExpression_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getBooleanVariable()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_BooleanVariable_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("init")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getBooleanVariable()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_BooleanVariable_Init();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getDecisionNode()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_DecisionNode_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("sendOffers1")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getDecisionNode()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_DecisionNode_SendOffers1();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getBooleanBinaryExpression().getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getBooleanExpression().getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getBooleanUnaryExpression().getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getExpression()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getIntegerCalculationExpression().getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getIntegerComparisonExpression().getClassifierID() || ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getIntegerExpression().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_Expression_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getForkNode()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ForkNode_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getInitialNode()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_InitialNode_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getIntegerCalculationExpression().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_IntegerCalculationExpression_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getIntegerComparisonExpression().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_IntegerComparisonExpression_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getIntegerVariable()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_IntegerVariable_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("init")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getIntegerVariable()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_IntegerVariable_Init();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getJoinNode()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_JoinNode_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getMergeNode()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_MergeNode_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getAction()
						.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivity()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivityEdge()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
								.getActivityFinalNode().getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getActivityNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getControlFlow()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getControlNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getDecisionNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getExecutableNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getFinalNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getForkNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getInitialNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getJoinNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getMergeNode()
								.getClassifierID()
						|| ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getNamedElement()
								.getClassifierID() || ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE
						.getOpaqueAction().getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_NamedElement_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == activitydiagram.ActivitydiagramPackage.eINSTANCE.getOpaqueAction()
						.getClassifierID()))

		{
			step = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_OpaqueAction_Execute();
		}

		else {
			step = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE.createGenericSequentialStep();
		}

		org.gemoc.executionframework.engine.mse.MSEOccurrence mseocc = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}
