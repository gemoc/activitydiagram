package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.IntegerCalculationExpression;
import java.util.Map;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties;

@SuppressWarnings("all")
public class IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext {
  public final static IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext INSTANCE = new IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext();
  
  public static IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties getSelf(final IntegerCalculationExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerCalculationExpression, IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties> map = new java.util.WeakHashMap<activitydiagram.IntegerCalculationExpression, org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties>();
  
  public Map<IntegerCalculationExpression, IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties> getMap() {
    return map;
  }
}
