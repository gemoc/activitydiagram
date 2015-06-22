package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.Expression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspectExpressionAspectProperties;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static void execute(final Expression _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspectExpressionAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspectExpressionAspectContext.getSelf(_self);
     if (_self instanceof activitydiagram.IntegerCalculationExpression){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerCalculationExpressionAspect.execute((activitydiagram.IntegerCalculationExpression)_self);
    } else  if (_self instanceof activitydiagram.BooleanUnaryExpression){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanUnaryExpressionAspect.execute((activitydiagram.BooleanUnaryExpression)_self);
    } else  if (_self instanceof activitydiagram.BooleanBinaryExpression){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanBinaryExpressionAspect.execute((activitydiagram.BooleanBinaryExpression)_self);
    } else  if (_self instanceof activitydiagram.IntegerComparisonExpression){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerComparisonExpressionAspect.execute((activitydiagram.IntegerComparisonExpression)_self);
    } else  if (_self instanceof activitydiagram.Expression){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ExpressionAspect._privk3_execute(_self_, (activitydiagram.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self) {
  }
}
