package org.modelexecution.operationalsemantics.gemoc.sequential.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class ActivitydiagramTraceStepFactory implements IStepFactory {

	@Override
	public org.gemoc.executionframework.engine.mse.MSEOccurrence createMSEOccurrence(
			org.gemoc.executionframework.engine.mse.MSE mse, List<Object> parameters, List<Object> result) {

		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(mse.getCaller().eClass(), ".") + "."
				+ mse.getAction().getName();
		org.gemoc.executionframework.engine.mse.MSEOccurrence mseocc = null;

		if (stepRule.equalsIgnoreCase("activitydiagram.Activity.execute")) {
			mseocc = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_Activity_Execute();
		} else

		if (stepRule.equalsIgnoreCase("activitydiagram.Activity.initializeContext")) {
			mseocc = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_Activity_InitializeContext();
		} else

		if (stepRule.equalsIgnoreCase("activitydiagram.Activity.reset")) {
			mseocc = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_Activity_Reset();
		} else

		if (stepRule.equalsIgnoreCase("activitydiagram.Activity.writeTrace")) {
			mseocc = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_Activity_WriteTrace();
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
			mseocc = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityNode_AddTokens1();
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
			mseocc = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityNode_Execute();
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
			mseocc = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ActivityNode_RemoveToken1();
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
			mseocc = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityNode_SendOffers1();
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
			mseocc = activitydiagramTrace.Steps.StepsFactory.eINSTANCE
					.createActivitydiagram_ActivityNode_TakeOfferdTokens1();
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
			mseocc = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_ActivityNode_Terminate();
		} else

		if (stepRule.equalsIgnoreCase("activitydiagram.BooleanVariable.execute")
				|| stepRule.equalsIgnoreCase("activitydiagram.IntegerVariable.execute")
				|| stepRule.equalsIgnoreCase("activitydiagram.Variable.execute")) {
			mseocc = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_Variable_Execute();
		} else

		if (stepRule.equalsIgnoreCase("activitydiagram.BooleanVariable.init")
				|| stepRule.equalsIgnoreCase("activitydiagram.IntegerVariable.init")
				|| stepRule.equalsIgnoreCase("activitydiagram.Variable.init")) {
			mseocc = activitydiagramTrace.Steps.StepsFactory.eINSTANCE.createActivitydiagram_Variable_Init();
		}

		else {
			mseocc = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE.createMSEOccurrence();
		}

		if (mseocc != null) {
			mseocc.setMse(mse);
			mseocc.getParameters().addAll(parameters);
			mseocc.getResult().addAll(result);
		}
		return mseocc;
	}
}
