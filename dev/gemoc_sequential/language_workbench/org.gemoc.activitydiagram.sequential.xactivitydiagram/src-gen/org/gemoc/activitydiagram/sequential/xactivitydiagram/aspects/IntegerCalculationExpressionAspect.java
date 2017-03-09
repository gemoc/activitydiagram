package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationOperator;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicIntegerValueAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties;

@Aspect(className = IntegerCalculationExpression.class)
@SuppressWarnings("all")
public class IntegerCalculationExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerCalculationExpression _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final IntegerCalculationExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties _self_, final IntegerCalculationExpression _self) {
    int intValue = 0;
    IntegerCalculationOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == IntegerCalculationOperator.ADD_VALUE);
    if (_equals) {
      IntegerVariable _operand1 = _self.getOperand1();
      Value _currentValue = _operand1.getCurrentValue();
      int _value_1 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue));
      IntegerVariable _operand2 = _self.getOperand2();
      Value _currentValue_1 = _operand2.getCurrentValue();
      int _value_2 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_1));
      int _plus = (_value_1 + _value_2);
      intValue = _plus;
    } else {
      IntegerCalculationOperator _operator_1 = _self.getOperator();
      int _value_3 = _operator_1.getValue();
      boolean _equals_1 = (_value_3 == IntegerCalculationOperator.SUBRACT_VALUE);
      if (_equals_1) {
        IntegerVariable _operand1_1 = _self.getOperand1();
        Value _currentValue_2 = _operand1_1.getCurrentValue();
        int _value_4 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_2));
        IntegerVariable _operand2_1 = _self.getOperand2();
        Value _currentValue_3 = _operand2_1.getCurrentValue();
        int _value_5 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_3));
        int _minus = (_value_4 - _value_5);
        intValue = _minus;
      }
    }
    IntegerVariable _assignee = _self.getAssignee();
    Value _currentValue_4 = _assignee.getCurrentValue();
    int _value_6 = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_4));
    boolean _notEquals = (intValue != _value_6);
    if (_notEquals) {
      IntegerVariable _assignee_1 = _self.getAssignee();
      Value _currentValue_5 = _assignee_1.getCurrentValue();
      DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_5), intValue);
    }
  }
}
