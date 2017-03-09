package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationOperator;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerBinaryExpressionAspectIntegerBinaryExpressionAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspect;

@Aspect(className = IntegerBinaryExpression.class)
@SuppressWarnings("all")
public class IntegerBinaryExpressionAspect extends IntegerExpressionAspect {
  @OverrideAspectMethod
  public static int evaluate(final IntegerBinaryExpression _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerBinaryExpressionAspectIntegerBinaryExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerBinaryExpressionAspectIntegerBinaryExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (int) result;
}
  
  private static int super_evaluate(final IntegerBinaryExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspectIntegerExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspectIntegerExpressionAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static int _privk3_evaluate(final IntegerBinaryExpressionAspectIntegerBinaryExpressionAspectProperties _self_, final IntegerBinaryExpression _self) {
    int intValue = 0;
    IntegerCalculationOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == IntegerCalculationOperator.ADD_VALUE);
    if (_equals) {
      IntegerExpression _operand1 = _self.getOperand1();
      int _evaluate = IntegerExpressionAspect.evaluate(_operand1);
      IntegerExpression _operand2 = _self.getOperand2();
      int _evaluate_1 = IntegerExpressionAspect.evaluate(_operand2);
      int _plus = (_evaluate + _evaluate_1);
      intValue = _plus;
    } else {
      IntegerCalculationOperator _operator_1 = _self.getOperator();
      int _value_1 = _operator_1.getValue();
      boolean _equals_1 = (_value_1 == IntegerCalculationOperator.SUBRACT_VALUE);
      if (_equals_1) {
        IntegerExpression _operand1_1 = _self.getOperand1();
        int _evaluate_2 = IntegerExpressionAspect.evaluate(_operand1_1);
        IntegerExpression _operand2_1 = _self.getOperand2();
        int _evaluate_3 = IntegerExpressionAspect.evaluate(_operand2_1);
        int _minus = (_evaluate_2 - _evaluate_3);
        intValue = _minus;
      }
    }
    return intValue;
  }
}
