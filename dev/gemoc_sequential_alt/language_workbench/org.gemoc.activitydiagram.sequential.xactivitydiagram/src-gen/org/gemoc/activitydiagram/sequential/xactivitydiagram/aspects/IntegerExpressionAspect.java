package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspectIntegerExpressionAspectProperties;

@Aspect(className = IntegerExpression.class)
@SuppressWarnings("all")
public class IntegerExpressionAspect {
  public static int evaluate(final IntegerExpression _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspectIntegerExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspectIntegerExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspect._privk3_evaluate(
				_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerBinaryExpressionAspect.evaluate(
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableEvaluateAspect.evaluate(
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspect._privk3_evaluate(
				_self_,
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (int) result;
}
  
  protected static int _privk3_evaluate(final IntegerExpressionAspectIntegerExpressionAspectProperties _self_, final IntegerExpression _self) {
    return 0;
  }
}
