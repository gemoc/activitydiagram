package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanValue;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerComparisonExpression;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerComparisonOperator;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerValue;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ExpressionAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = IntegerComparisonExpression.class)
@SuppressWarnings("all")
public class IntegerComparisonExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerComparisonExpression _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerComparisonExpression){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerComparisonExpressionAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerComparisonExpression)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Expression){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ExpressionAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final IntegerComparisonExpression _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ExpressionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties _self_, final IntegerComparisonExpression _self) {
    IntegerComparisonOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == IntegerComparisonOperator.EQUALS_VALUE);
    if (_equals) {
      BooleanVariable _assignee = _self.getAssignee();
      Value _currentValue = VariableAspect.currentValue(_assignee);
      IntegerVariable _operand1 = _self.getOperand1();
      Value _currentValue_1 = VariableAspect.currentValue(_operand1);
      int _value_1 = ((IntegerValue) _currentValue_1).getValue();
      IntegerVariable _operand2 = _self.getOperand2();
      Value _currentValue_2 = VariableAspect.currentValue(_operand2);
      int _value_2 = ((IntegerValue) _currentValue_2).getValue();
      boolean _equals_1 = (_value_1 == _value_2);
      ((BooleanValue) _currentValue).setValue(_equals_1);
    } else {
      IntegerComparisonOperator _operator_1 = _self.getOperator();
      int _value_3 = _operator_1.getValue();
      boolean _equals_2 = (_value_3 == IntegerComparisonOperator.GREATER_EQUALS_VALUE);
      if (_equals_2) {
        BooleanVariable _assignee_1 = _self.getAssignee();
        Value _currentValue_3 = VariableAspect.currentValue(_assignee_1);
        IntegerVariable _operand1_1 = _self.getOperand1();
        Value _currentValue_4 = VariableAspect.currentValue(_operand1_1);
        int _value_4 = ((IntegerValue) _currentValue_4).getValue();
        IntegerVariable _operand2_1 = _self.getOperand2();
        Value _currentValue_5 = VariableAspect.currentValue(_operand2_1);
        int _value_5 = ((IntegerValue) _currentValue_5).getValue();
        boolean _greaterEqualsThan = (_value_4 >= _value_5);
        ((BooleanValue) _currentValue_3).setValue(_greaterEqualsThan);
      } else {
        IntegerComparisonOperator _operator_2 = _self.getOperator();
        int _value_6 = _operator_2.getValue();
        boolean _equals_3 = (_value_6 == IntegerComparisonOperator.GREATER_VALUE);
        if (_equals_3) {
          BooleanVariable _assignee_2 = _self.getAssignee();
          Value _currentValue_6 = VariableAspect.currentValue(_assignee_2);
          IntegerVariable _operand1_2 = _self.getOperand1();
          Value _currentValue_7 = VariableAspect.currentValue(_operand1_2);
          int _value_7 = ((IntegerValue) _currentValue_7).getValue();
          IntegerVariable _operand2_2 = _self.getOperand2();
          Value _currentValue_8 = VariableAspect.currentValue(_operand2_2);
          int _value_8 = ((IntegerValue) _currentValue_8).getValue();
          boolean _greaterThan = (_value_7 > _value_8);
          ((BooleanValue) _currentValue_6).setValue(_greaterThan);
        } else {
          IntegerComparisonOperator _operator_3 = _self.getOperator();
          int _value_9 = _operator_3.getValue();
          boolean _equals_4 = (_value_9 == IntegerComparisonOperator.SMALLER_EQUALS_VALUE);
          if (_equals_4) {
            BooleanVariable _assignee_3 = _self.getAssignee();
            Value _currentValue_9 = VariableAspect.currentValue(_assignee_3);
            IntegerVariable _operand1_3 = _self.getOperand1();
            Value _currentValue_10 = VariableAspect.currentValue(_operand1_3);
            int _value_10 = ((IntegerValue) _currentValue_10).getValue();
            IntegerVariable _operand2_3 = _self.getOperand2();
            Value _currentValue_11 = VariableAspect.currentValue(_operand2_3);
            int _value_11 = ((IntegerValue) _currentValue_11).getValue();
            boolean _lessEqualsThan = (_value_10 <= _value_11);
            ((BooleanValue) _currentValue_9).setValue(_lessEqualsThan);
          } else {
            IntegerComparisonOperator _operator_4 = _self.getOperator();
            int _value_12 = _operator_4.getValue();
            boolean _equals_5 = (_value_12 == IntegerComparisonOperator.SMALLER_VALUE);
            if (_equals_5) {
              BooleanVariable _assignee_4 = _self.getAssignee();
              Value _currentValue_12 = VariableAspect.currentValue(_assignee_4);
              IntegerVariable _operand1_4 = _self.getOperand1();
              Value _currentValue_13 = VariableAspect.currentValue(_operand1_4);
              int _value_13 = ((IntegerValue) _currentValue_13).getValue();
              IntegerVariable _operand2_4 = _self.getOperand2();
              Value _currentValue_14 = VariableAspect.currentValue(_operand2_4);
              int _value_14 = ((IntegerValue) _currentValue_14).getValue();
              boolean _lessThan = (_value_13 < _value_14);
              ((BooleanValue) _currentValue_12).setValue(_lessThan);
            }
          }
        }
      }
    }
  }
}
