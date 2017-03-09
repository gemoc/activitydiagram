package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanBinaryOperator;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicBooleanValueAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect;

@Aspect(className = BooleanBinaryExpression.class)
@SuppressWarnings("all")
public class BooleanBinaryExpressionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final BooleanBinaryExpression _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final BooleanBinaryExpression _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ExpressionAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties _self_, final BooleanBinaryExpression _self) {
    boolean boolValue = false;
    BooleanBinaryOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == BooleanBinaryOperator.AND_VALUE);
    if (_equals) {
      boolValue = (DynamicBooleanValueAspect.value(((DynamicBooleanValue) _self.getOperand1().getCurrentValue())) && DynamicBooleanValueAspect.value(((DynamicBooleanValue) _self.getOperand2().getCurrentValue())));
    } else {
      BooleanBinaryOperator _operator_1 = _self.getOperator();
      int _value_1 = _operator_1.getValue();
      boolean _equals_1 = (_value_1 == BooleanBinaryOperator.OR_VALUE);
      if (_equals_1) {
        boolValue = (DynamicBooleanValueAspect.value(((DynamicBooleanValue) _self.getOperand1().getCurrentValue())) || DynamicBooleanValueAspect.value(((DynamicBooleanValue) _self.getOperand2().getCurrentValue())));
      }
    }
    BooleanVariable _assignee = _self.getAssignee();
    Value _currentValue = _assignee.getCurrentValue();
    boolean _value_2 = DynamicBooleanValueAspect.value(((DynamicBooleanValue) _currentValue));
    boolean _notEquals = (boolValue != _value_2);
    if (_notEquals) {
      BooleanVariable _assignee_1 = _self.getAssignee();
      Value _currentValue_1 = _assignee_1.getCurrentValue();
      DynamicBooleanValueAspect.value(((DynamicBooleanValue) _currentValue_1), boolValue);
    }
  }
}
