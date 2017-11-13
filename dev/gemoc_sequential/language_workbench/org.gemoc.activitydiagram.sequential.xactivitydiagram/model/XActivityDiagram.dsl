DSL org.gemoc.activitydiagram.sequential.XActivityDiagram {
	abstract-syntax {
		ecore = "platform:/resource/org.gemoc.activitydiagram.sequential.xactivitydiagram/model/XActivityDiagram.ecore"
	}
	semantic {
		k3 = "org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityFinalNodeAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanBinaryExpressionAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.JoinNodeAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OfferAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DecisionNodeAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TraceAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ControlFlowAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerCalculationExpressionAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerComparisonExpressionAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkNodeAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputAspect",
		"org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspect"
	}
}
