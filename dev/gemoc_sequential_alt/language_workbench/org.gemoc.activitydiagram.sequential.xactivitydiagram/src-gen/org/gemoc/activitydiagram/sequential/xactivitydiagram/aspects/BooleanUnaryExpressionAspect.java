package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryOperator;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties;

@Aspect(className = BooleanUnaryExpression.class)
@SuppressWarnings("all")
public class BooleanUnaryExpressionAspect extends BooleanExpressionAspect {
  @OverrideAspectMethod
  public static boolean evaluate(final BooleanUnaryExpression _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (boolean) result;
}
  
  private static boolean super_evaluate(final BooleanUnaryExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static boolean _privk3_evaluate(final BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties _self_, final BooleanUnaryExpression _self) {
    boolean boolValue = false;
    BooleanUnaryOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == BooleanUnaryOperator.NOT_VALUE);
    if (_equals) {
      BooleanExpression _operand = _self.getOperand();
      boolean _evaluate = BooleanExpressionAspect.evaluate(_operand);
      boolean _not = (!_evaluate);
      boolValue = _not;
    }
    return boolValue;
  }
}
