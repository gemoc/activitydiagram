package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerBinaryExpressionAspectIntegerBinaryExpressionAspectProperties;

@SuppressWarnings("all")
public class IntegerBinaryExpressionAspectIntegerBinaryExpressionAspectContext {
  public final static IntegerBinaryExpressionAspectIntegerBinaryExpressionAspectContext INSTANCE = new IntegerBinaryExpressionAspectIntegerBinaryExpressionAspectContext();
  
  public static IntegerBinaryExpressionAspectIntegerBinaryExpressionAspectProperties getSelf(final IntegerBinaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerBinaryExpressionAspectIntegerBinaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerBinaryExpression, IntegerBinaryExpressionAspectIntegerBinaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerBinaryExpression, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerBinaryExpressionAspectIntegerBinaryExpressionAspectProperties>();
  
  public Map<IntegerBinaryExpression, IntegerBinaryExpressionAspectIntegerBinaryExpressionAspectProperties> getMap() {
    return map;
  }
}
