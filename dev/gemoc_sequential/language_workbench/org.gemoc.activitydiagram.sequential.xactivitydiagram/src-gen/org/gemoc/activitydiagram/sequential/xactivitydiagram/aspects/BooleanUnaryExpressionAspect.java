package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryOperator;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicBooleanValueAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect;

@Aspect(className = BooleanUnaryExpression.class)
@SuppressWarnings("all")
public class BooleanUnaryExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final BooleanUnaryExpression _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final BooleanUnaryExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties _self_, final BooleanUnaryExpression _self) {
    boolean boolValue = false;
    BooleanUnaryOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == BooleanUnaryOperator.NOT_VALUE);
    if (_equals) {
      BooleanVariable _operand = _self.getOperand();
      Value _currentValue = _operand.getCurrentValue();
      boolean _value_1 = DynamicBooleanValueAspect.value(((DynamicBooleanValue) _currentValue));
      boolean _not = (!_value_1);
      boolValue = _not;
    }
    BooleanVariable _assignee = _self.getAssignee();
    Value _currentValue_1 = _assignee.getCurrentValue();
    boolean _value_2 = DynamicBooleanValueAspect.value(((DynamicBooleanValue) _currentValue_1));
    boolean _notEquals = (boolValue != _value_2);
    if (_notEquals) {
      BooleanVariable _assignee_1 = _self.getAssignee();
      Value _currentValue_2 = _assignee_1.getCurrentValue();
      DynamicBooleanValueAspect.value(((DynamicBooleanValue) _currentValue_2), boolValue);
    }
  }
}
