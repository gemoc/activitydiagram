package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.BooleanBinaryExpression;
import activitydiagram.BooleanBinaryOperator;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspect;

@Aspect(className = BooleanBinaryExpression.class)
@SuppressWarnings("all")
public class BooleanBinaryExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final BooleanBinaryExpression _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext.getSelf(_self);
     if (_self instanceof activitydiagram.BooleanBinaryExpression){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanBinaryExpressionAspect._privk3_execute(_self_, (activitydiagram.BooleanBinaryExpression)_self);
    } else  if (_self instanceof activitydiagram.Expression){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspect.execute((activitydiagram.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final BooleanBinaryExpression _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspectExpressionAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspect._privk3_execute(_self_, _self);
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
