package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Expression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static void execute(final Expression _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerCalculationExpression){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerCalculationExpressionAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerCalculationExpression)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerComparisonExpression){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerComparisonExpressionAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerComparisonExpression)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanUnaryExpression){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanUnaryExpressionAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanUnaryExpression)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanBinaryExpression){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanBinaryExpressionAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanBinaryExpression)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Expression){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ExpressionAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self) {
  }
}
