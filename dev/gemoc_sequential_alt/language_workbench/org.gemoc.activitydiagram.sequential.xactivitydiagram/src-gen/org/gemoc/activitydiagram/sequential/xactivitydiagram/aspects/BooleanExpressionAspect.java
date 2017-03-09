package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectProperties;

@Aspect(className = BooleanExpression.class)
@SuppressWarnings("all")
public class BooleanExpressionAspect {
  public static boolean evaluate(final BooleanExpression _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspect._privk3_evaluate(
				_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanBinaryExpressionAspect.evaluate(
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableEvaluateAspect.evaluate(
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerComparisonExpressionAspect
				.evaluate(
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspect.evaluate(
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression) {
		result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspect._privk3_evaluate(
				_self_,
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_evaluate(final BooleanExpressionAspectBooleanExpressionAspectProperties _self_, final BooleanExpression _self) {
    return false;
  }
}
