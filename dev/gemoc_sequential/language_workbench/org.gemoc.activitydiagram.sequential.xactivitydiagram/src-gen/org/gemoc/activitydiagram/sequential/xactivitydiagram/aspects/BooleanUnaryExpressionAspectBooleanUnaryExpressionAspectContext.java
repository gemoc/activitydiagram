package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties;

@SuppressWarnings("all")
public class BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext {
  public final static BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext INSTANCE = new BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext();
  
  public static BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties getSelf(final BooleanUnaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanUnaryExpression, BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanUnaryExpression, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties>();
  
  public Map<BooleanUnaryExpression, BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties> getMap() {
    return map;
  }
}
