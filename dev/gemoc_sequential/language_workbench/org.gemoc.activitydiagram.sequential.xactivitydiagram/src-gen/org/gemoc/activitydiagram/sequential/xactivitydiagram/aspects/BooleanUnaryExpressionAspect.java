package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryOperator;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = BooleanUnaryExpression.class)
@SuppressWarnings("all")
public class BooleanUnaryExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final BooleanUnaryExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final BooleanUnaryExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties _self_, final BooleanUnaryExpression _self) {
    BooleanUnaryOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == BooleanUnaryOperator.NOT_VALUE);
    if (_equals) {
      BooleanVariable _assignee = _self.getAssignee();
      Value _currentValue = VariableAspect.currentValue(_assignee);
      BooleanVariable _operand = _self.getOperand();
      Value _currentValue_1 = VariableAspect.currentValue(_operand);
      boolean _isValue = ((BooleanValue) _currentValue_1).isValue();
      boolean _not = (!_isValue);
      ((BooleanValue) _currentValue).setValue(_not);
    }
  }
}
