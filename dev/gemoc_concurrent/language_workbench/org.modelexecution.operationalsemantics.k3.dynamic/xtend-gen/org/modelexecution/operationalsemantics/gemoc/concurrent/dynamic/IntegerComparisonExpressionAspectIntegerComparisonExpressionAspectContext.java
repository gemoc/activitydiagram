package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.IntegerComparisonExpression;
import java.util.Map;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties;

@SuppressWarnings("all")
public class IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext {
  public final static IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext INSTANCE = new IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext();
  
  public static IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties getSelf(final IntegerComparisonExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerComparisonExpression, IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties> map = new java.util.WeakHashMap<activitydiagram.IntegerComparisonExpression, org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties>();
  
  public Map<IntegerComparisonExpression, IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties> getMap() {
    return map;
  }
}
