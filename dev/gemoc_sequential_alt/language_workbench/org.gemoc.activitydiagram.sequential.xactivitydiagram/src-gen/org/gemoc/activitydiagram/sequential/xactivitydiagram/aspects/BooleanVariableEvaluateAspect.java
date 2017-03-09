package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableEvaluateAspectBooleanVariableAspectProperties;

@Aspect(className = BooleanVariable.class)
@SuppressWarnings("all")
public class BooleanVariableEvaluateAspect extends BooleanExpressionAspect {
  @OverrideAspectMethod
  public static boolean evaluate(final BooleanVariable _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableEvaluateAspectBooleanVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableEvaluateAspectBooleanVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (boolean) result;
}
  
  private static boolean super_evaluate(final BooleanVariable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static boolean _privk3_evaluate(final BooleanVariableEvaluateAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    return BooleanVariableAspect.currentValue(_self);
  }
}
