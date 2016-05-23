package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Expression;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Context;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static void execute(final Expression _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerCalculationExpression){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerCalculationExpressionAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerCalculationExpression)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanBinaryExpression){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanBinaryExpressionAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanBinaryExpression)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanUnaryExpression){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanUnaryExpressionAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanUnaryExpression)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerComparisonExpression){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerComparisonExpressionAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerComparisonExpression)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Expression){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ExpressionAspect._privk3_execute(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Expression)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Context c) {
  }
}
