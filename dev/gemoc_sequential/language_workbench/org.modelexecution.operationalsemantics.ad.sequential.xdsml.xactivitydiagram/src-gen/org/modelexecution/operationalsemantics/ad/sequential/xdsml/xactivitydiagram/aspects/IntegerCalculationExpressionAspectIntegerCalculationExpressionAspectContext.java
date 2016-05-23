package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerCalculationExpression;
import java.util.Map;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties;

@SuppressWarnings("all")
public class IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext {
  public final static IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext INSTANCE = new IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectContext();
  
  public static IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties getSelf(final IntegerCalculationExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerCalculationExpression, IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerCalculationExpression, org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties>();
  
  public Map<IntegerCalculationExpression, IntegerCalculationExpressionAspectIntegerCalculationExpressionAspectProperties> getMap() {
    return map;
  }
}
