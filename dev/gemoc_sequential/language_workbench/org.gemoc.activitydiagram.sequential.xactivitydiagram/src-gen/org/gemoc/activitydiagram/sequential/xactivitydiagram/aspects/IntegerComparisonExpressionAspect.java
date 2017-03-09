package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerComparisonOperator;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicBooleanValueAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicIntegerValueAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties;

@Aspect(className = IntegerComparisonExpression.class)
@SuppressWarnings("all")
public class IntegerComparisonExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerComparisonExpression _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final IntegerComparisonExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties _self_, final IntegerComparisonExpression _self) {
    boolean boolValue = false;
    IntegerComparisonOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == IntegerComparisonOperator.EQUALS_VALUE);
    if (_equals) {
      IntegerVariable _operand1 = _self.getOperand1();
      Value _currentValue = _operand1.getCurrentValue();
      int _value_1 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue));
      IntegerVariable _operand2 = _self.getOperand2();
      Value _currentValue_1 = _operand2.getCurrentValue();
      int _value_2 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_1));
      boolean _equals_1 = (_value_1 == _value_2);
      boolValue = _equals_1;
    } else {
      IntegerComparisonOperator _operator_1 = _self.getOperator();
      int _value_3 = _operator_1.getValue();
      boolean _equals_2 = (_value_3 == IntegerComparisonOperator.GREATER_EQUALS_VALUE);
      if (_equals_2) {
        IntegerVariable _operand1_1 = _self.getOperand1();
        Value _currentValue_2 = _operand1_1.getCurrentValue();
        int _value_4 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_2));
        IntegerVariable _operand2_1 = _self.getOperand2();
        Value _currentValue_3 = _operand2_1.getCurrentValue();
        int _value_5 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_3));
        boolean _greaterEqualsThan = (_value_4 >= _value_5);
        boolValue = _greaterEqualsThan;
      } else {
        IntegerComparisonOperator _operator_2 = _self.getOperator();
        int _value_6 = _operator_2.getValue();
        boolean _equals_3 = (_value_6 == IntegerComparisonOperator.GREATER_VALUE);
        if (_equals_3) {
          IntegerVariable _operand1_2 = _self.getOperand1();
          Value _currentValue_4 = _operand1_2.getCurrentValue();
          int _value_7 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_4));
          IntegerVariable _operand2_2 = _self.getOperand2();
          Value _currentValue_5 = _operand2_2.getCurrentValue();
          int _value_8 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_5));
          boolean _greaterThan = (_value_7 > _value_8);
          boolValue = _greaterThan;
        } else {
          IntegerComparisonOperator _operator_3 = _self.getOperator();
          int _value_9 = _operator_3.getValue();
          boolean _equals_4 = (_value_9 == IntegerComparisonOperator.SMALLER_EQUALS_VALUE);
          if (_equals_4) {
            IntegerVariable _operand1_3 = _self.getOperand1();
            Value _currentValue_6 = _operand1_3.getCurrentValue();
            int _value_10 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_6));
            IntegerVariable _operand2_3 = _self.getOperand2();
            Value _currentValue_7 = _operand2_3.getCurrentValue();
            int _value_11 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_7));
            boolean _lessEqualsThan = (_value_10 <= _value_11);
            boolValue = _lessEqualsThan;
          } else {
            IntegerComparisonOperator _operator_4 = _self.getOperator();
            int _value_12 = _operator_4.getValue();
            boolean _equals_5 = (_value_12 == IntegerComparisonOperator.SMALLER_VALUE);
            if (_equals_5) {
              IntegerVariable _operand1_4 = _self.getOperand1();
              Value _currentValue_8 = _operand1_4.getCurrentValue();
              int _value_13 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_8));
              IntegerVariable _operand2_4 = _self.getOperand2();
              Value _currentValue_9 = _operand2_4.getCurrentValue();
              int _value_14 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_9));
              boolean _lessThan = (_value_13 < _value_14);
              boolValue = _lessThan;
            }
          }
        }
      }
    }
    BooleanVariable _assignee = _self.getAssignee();
    Value _currentValue_10 = _assignee.getCurrentValue();
    boolean _value_15 = DynamicBooleanValueAspect.value(((DynamicBooleanValue) _currentValue_10));
    boolean _notEquals = (boolValue != _value_15);
    if (_notEquals) {
      BooleanVariable _assignee_1 = _self.getAssignee();
      Value _currentValue_11 = _assignee_1.getCurrentValue();
      DynamicBooleanValueAspect.value(((DynamicBooleanValue) _currentValue_11), boolValue);
    }
  }
}
