package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationOperator;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = IntegerCalculationExpression.class)
@SuppressWarnings("all")
public class IntegerCalculationExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerCalculationExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationExpression){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerCalculationExpressionAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerCalculationExpression)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final IntegerCalculationExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties _self_, final IntegerCalculationExpression _self) {
    IntegerCalculationOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == IntegerCalculationOperator.ADD_VALUE);
    if (_equals) {
      IntegerVariable _assignee = _self.getAssignee();
      Value _currentValue = VariableAspect.currentValue(_assignee);
      IntegerVariable _operand1 = _self.getOperand1();
      Value _currentValue_1 = VariableAspect.currentValue(_operand1);
      int _value_1 = ((IntegerValue) _currentValue_1).getValue();
      IntegerVariable _operand2 = _self.getOperand2();
      Value _currentValue_2 = VariableAspect.currentValue(_operand2);
      int _value_2 = ((IntegerValue) _currentValue_2).getValue();
      int _plus = (_value_1 + _value_2);
      ((IntegerValue) _currentValue).setValue(_plus);
    } else {
      IntegerCalculationOperator _operator_1 = _self.getOperator();
      int _value_3 = _operator_1.getValue();
      boolean _equals_1 = (_value_3 == IntegerCalculationOperator.SUBRACT_VALUE);
      if (_equals_1) {
        IntegerVariable _assignee_1 = _self.getAssignee();
        Value _currentValue_3 = VariableAspect.currentValue(_assignee_1);
        IntegerVariable _operand1_1 = _self.getOperand1();
        Value _currentValue_4 = VariableAspect.currentValue(_operand1_1);
        int _value_4 = ((IntegerValue) _currentValue_4).getValue();
        IntegerVariable _operand2_1 = _self.getOperand2();
        Value _currentValue_5 = VariableAspect.currentValue(_operand2_1);
        int _value_5 = ((IntegerValue) _currentValue_5).getValue();
        int _minus = (_value_4 - _value_5);
        ((IntegerValue) _currentValue_3).setValue(_minus);
      }
    }
  }
}
