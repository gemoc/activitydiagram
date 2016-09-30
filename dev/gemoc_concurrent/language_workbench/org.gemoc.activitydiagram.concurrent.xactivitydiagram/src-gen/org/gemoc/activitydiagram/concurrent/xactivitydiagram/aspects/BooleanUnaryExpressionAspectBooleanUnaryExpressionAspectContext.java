package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanUnaryExpression;
import java.util.Map;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties;

@SuppressWarnings("all")
public class BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext {
  public final static BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext INSTANCE = new BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext();
  
  public static BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties getSelf(final BooleanUnaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanUnaryExpression, BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanUnaryExpression, org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties>();
  
  public Map<BooleanUnaryExpression, BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties> getMap() {
    return map;
  }
}
