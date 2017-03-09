package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonOperator;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspect;

@Aspect(className = IntegerComparisonExpression.class)
@SuppressWarnings("all")
public class IntegerComparisonExpressionAspect extends BooleanExpressionAspect {
  @OverrideAspectMethod
  public static boolean evaluate(final IntegerComparisonExpression _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (boolean) result;
}
  
  private static boolean super_evaluate(final IntegerComparisonExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static boolean _privk3_evaluate(final IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties _self_, final IntegerComparisonExpression _self) {
    boolean boolValue = false;
    IntegerComparisonOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == IntegerComparisonOperator.EQUALS_VALUE);
    if (_equals) {
      IntegerExpression _operand1 = _self.getOperand1();
      int _evaluate = IntegerExpressionAspect.evaluate(_operand1);
      IntegerExpression _operand2 = _self.getOperand2();
      int _evaluate_1 = IntegerExpressionAspect.evaluate(_operand2);
      boolean _equals_1 = (_evaluate == _evaluate_1);
      boolValue = _equals_1;
    } else {
      IntegerComparisonOperator _operator_1 = _self.getOperator();
      int _value_1 = _operator_1.getValue();
      boolean _equals_2 = (_value_1 == IntegerComparisonOperator.GREATER_EQUALS_VALUE);
      if (_equals_2) {
        IntegerExpression _operand1_1 = _self.getOperand1();
        int _evaluate_2 = IntegerExpressionAspect.evaluate(_operand1_1);
        IntegerExpression _operand2_1 = _self.getOperand2();
        int _evaluate_3 = IntegerExpressionAspect.evaluate(_operand2_1);
        boolean _greaterEqualsThan = (_evaluate_2 >= _evaluate_3);
        boolValue = _greaterEqualsThan;
      } else {
        IntegerComparisonOperator _operator_2 = _self.getOperator();
        int _value_2 = _operator_2.getValue();
        boolean _equals_3 = (_value_2 == IntegerComparisonOperator.GREATER_VALUE);
        if (_equals_3) {
          IntegerExpression _operand1_2 = _self.getOperand1();
          int _evaluate_4 = IntegerExpressionAspect.evaluate(_operand1_2);
          IntegerExpression _operand2_2 = _self.getOperand2();
          int _evaluate_5 = IntegerExpressionAspect.evaluate(_operand2_2);
          boolean _greaterThan = (_evaluate_4 > _evaluate_5);
          boolValue = _greaterThan;
        } else {
          IntegerComparisonOperator _operator_3 = _self.getOperator();
          int _value_3 = _operator_3.getValue();
          boolean _equals_4 = (_value_3 == IntegerComparisonOperator.SMALLER_EQUALS_VALUE);
          if (_equals_4) {
            IntegerExpression _operand1_3 = _self.getOperand1();
            int _evaluate_6 = IntegerExpressionAspect.evaluate(_operand1_3);
            IntegerExpression _operand2_3 = _self.getOperand2();
            int _evaluate_7 = IntegerExpressionAspect.evaluate(_operand2_3);
            boolean _lessEqualsThan = (_evaluate_6 <= _evaluate_7);
            boolValue = _lessEqualsThan;
          } else {
            IntegerComparisonOperator _operator_4 = _self.getOperator();
            int _value_4 = _operator_4.getValue();
            boolean _equals_5 = (_value_4 == IntegerComparisonOperator.SMALLER_VALUE);
            if (_equals_5) {
              IntegerExpression _operand1_4 = _self.getOperand1();
              int _evaluate_8 = IntegerExpressionAspect.evaluate(_operand1_4);
              IntegerExpression _operand2_4 = _self.getOperand2();
              int _evaluate_9 = IntegerExpressionAspect.evaluate(_operand2_4);
              boolean _lessThan = (_evaluate_8 < _evaluate_9);
              boolValue = _lessThan;
            }
          }
        }
      }
    }
    return boolValue;
  }
}
