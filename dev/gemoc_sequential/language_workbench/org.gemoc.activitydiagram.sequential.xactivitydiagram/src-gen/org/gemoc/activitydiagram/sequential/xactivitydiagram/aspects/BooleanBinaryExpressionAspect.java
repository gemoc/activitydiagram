package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryOperator;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect;

@Aspect(className = BooleanBinaryExpression.class)
@SuppressWarnings("all")
public class BooleanBinaryExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final BooleanBinaryExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanBinaryExpressionAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final BooleanBinaryExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties _self_, final BooleanBinaryExpression _self) {
    BooleanBinaryOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == BooleanBinaryOperator.AND_VALUE);
    if (_equals) {
      BooleanVariable _assignee = _self.getAssignee();
      Value _currentValue = _assignee.getCurrentValue();
      boolean _and = false;
      BooleanVariable _operand1 = _self.getOperand1();
      Value _currentValue_1 = _operand1.getCurrentValue();
      boolean _isValue = ((BooleanValue) _currentValue_1).isValue();
      if (!_isValue) {
        _and = false;
      } else {
        BooleanVariable _operand2 = _self.getOperand2();
        Value _currentValue_2 = _operand2.getCurrentValue();
        boolean _isValue_1 = ((BooleanValue) _currentValue_2).isValue();
        _and = _isValue_1;
      }
      ((BooleanValue) _currentValue).setValue(_and);
    } else {
      BooleanBinaryOperator _operator_1 = _self.getOperator();
      int _value_1 = _operator_1.getValue();
      boolean _equals_1 = (_value_1 == BooleanBinaryOperator.OR_VALUE);
      if (_equals_1) {
        BooleanVariable _assignee_1 = _self.getAssignee();
        Value _currentValue_3 = _assignee_1.getCurrentValue();
        boolean _or = false;
        BooleanVariable _operand1_1 = _self.getOperand1();
        Value _currentValue_4 = _operand1_1.getCurrentValue();
        boolean _isValue_2 = ((BooleanValue) _currentValue_4).isValue();
        if (_isValue_2) {
          _or = true;
        } else {
          BooleanVariable _operand2_1 = _self.getOperand2();
          Value _currentValue_5 = _operand2_1.getCurrentValue();
          boolean _isValue_3 = ((BooleanValue) _currentValue_5).isValue();
          _or = _isValue_3;
        }
        ((BooleanValue) _currentValue_3).setValue(_or);
      }
    }
  }
}
