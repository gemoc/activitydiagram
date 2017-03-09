package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableEvaluateAspectIntegerVariableAspectProperties;

@Aspect(className = IntegerVariable.class)
@SuppressWarnings("all")
public class IntegerVariableEvaluateAspect extends IntegerExpressionAspect {
  @OverrideAspectMethod
  public static int evaluate(final IntegerVariable _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableEvaluateAspectIntegerVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableEvaluateAspectIntegerVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (int) result;
}
  
  private static int super_evaluate(final IntegerVariable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspectIntegerExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspectIntegerExpressionAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static int _privk3_evaluate(final IntegerVariableEvaluateAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
    return IntegerVariableAspect.currentValue(_self);
  }
}
