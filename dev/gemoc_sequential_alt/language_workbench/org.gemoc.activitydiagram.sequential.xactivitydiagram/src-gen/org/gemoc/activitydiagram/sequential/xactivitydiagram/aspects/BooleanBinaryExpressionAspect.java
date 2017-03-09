package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryOperator;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspect;

@Aspect(className = BooleanBinaryExpression.class)
@SuppressWarnings("all")
public class BooleanBinaryExpressionAspect extends BooleanExpressionAspect {
  @OverrideAspectMethod
  public static boolean evaluate(final BooleanBinaryExpression _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (boolean) result;
}
  
  private static boolean super_evaluate(final BooleanBinaryExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static boolean _privk3_evaluate(final BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties _self_, final BooleanBinaryExpression _self) {
    boolean boolValue = false;
    BooleanBinaryOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == BooleanBinaryOperator.AND_VALUE);
    if (_equals) {
      boolValue = (BooleanExpressionAspect.evaluate(_self.getOperand1()) && BooleanExpressionAspect.evaluate(_self.getOperand2()));
    } else {
      BooleanBinaryOperator _operator_1 = _self.getOperator();
      int _value_1 = _operator_1.getValue();
      boolean _equals_1 = (_value_1 == BooleanBinaryOperator.OR_VALUE);
      if (_equals_1) {
        boolValue = (BooleanExpressionAspect.evaluate(_self.getOperand1()) || BooleanExpressionAspect.evaluate(_self.getOperand2()));
      }
    }
    return boolValue;
  }
}
