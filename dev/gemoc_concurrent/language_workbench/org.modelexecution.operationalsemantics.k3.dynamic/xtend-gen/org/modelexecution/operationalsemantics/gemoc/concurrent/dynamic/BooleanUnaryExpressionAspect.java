package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.BooleanUnaryExpression;
import activitydiagram.BooleanUnaryOperator;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspect;

@Aspect(className = BooleanUnaryExpression.class)
@SuppressWarnings("all")
public class BooleanUnaryExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final BooleanUnaryExpression _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext.getSelf(_self);
     if (_self instanceof activitydiagram.BooleanUnaryExpression){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanUnaryExpressionAspect._privk3_execute(_self_, (activitydiagram.BooleanUnaryExpression)_self);
    } else  if (_self instanceof activitydiagram.Expression){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspect.execute((activitydiagram.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final BooleanUnaryExpression _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspectExpressionAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties _self_, final BooleanUnaryExpression _self) {
    BooleanUnaryOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == BooleanUnaryOperator.NOT_VALUE);
    if (_equals) {
      BooleanVariable _assignee = _self.getAssignee();
      Value _currentValue = _assignee.getCurrentValue();
      BooleanVariable _operand = _self.getOperand();
      Value _currentValue_1 = _operand.getCurrentValue();
      boolean _isValue = ((BooleanValue) _currentValue_1).isValue();
      boolean _not = (!_isValue);
      ((BooleanValue) _currentValue).setValue(_not);
    }
  }
}
