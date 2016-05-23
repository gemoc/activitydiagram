package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerComparisonExpression;
import java.util.Map;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties;

@SuppressWarnings("all")
public class IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext {
  public final static IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext INSTANCE = new IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext();
  
  public static IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties getSelf(final IntegerComparisonExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerComparisonExpression, IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerComparisonExpression, org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties>();
  
  public Map<IntegerComparisonExpression, IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties> getMap() {
    return map;
  }
}
