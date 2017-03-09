package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspectIntegerExpressionAspectProperties;

@SuppressWarnings("all")
public class IntegerExpressionAspectIntegerExpressionAspectContext {
  public final static IntegerExpressionAspectIntegerExpressionAspectContext INSTANCE = new IntegerExpressionAspectIntegerExpressionAspectContext();
  
  public static IntegerExpressionAspectIntegerExpressionAspectProperties getSelf(final IntegerExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspectIntegerExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerExpression, IntegerExpressionAspectIntegerExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspectIntegerExpressionAspectProperties>();
  
  public Map<IntegerExpression, IntegerExpressionAspectIntegerExpressionAspectProperties> getMap() {
    return map;
  }
}
