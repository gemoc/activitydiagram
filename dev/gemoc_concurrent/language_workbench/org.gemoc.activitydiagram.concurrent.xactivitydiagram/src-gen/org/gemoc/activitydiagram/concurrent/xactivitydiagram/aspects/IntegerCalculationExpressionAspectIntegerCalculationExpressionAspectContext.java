package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerCalculationExpression;
import java.util.Map;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties;

@SuppressWarnings("all")
public class IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext {
  public final static IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext INSTANCE = new IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext();
  
  public static IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties getSelf(final IntegerCalculationExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerCalculationExpression, IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerCalculationExpression, org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties>();
  
  public Map<IntegerCalculationExpression, IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties> getMap() {
    return map;
  }
}
