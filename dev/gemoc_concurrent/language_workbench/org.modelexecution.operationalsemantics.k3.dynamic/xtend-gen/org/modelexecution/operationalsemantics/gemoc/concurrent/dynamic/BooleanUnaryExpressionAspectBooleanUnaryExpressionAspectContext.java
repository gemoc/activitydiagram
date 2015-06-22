package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.BooleanUnaryExpression;
import java.util.Map;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties;

@SuppressWarnings("all")
public class BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext {
  public final static BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext INSTANCE = new BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext();
  
  public static BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties getSelf(final BooleanUnaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanUnaryExpression, BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties> map = new java.util.WeakHashMap<activitydiagram.BooleanUnaryExpression, org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties>();
  
  public Map<BooleanUnaryExpression, BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties> getMap() {
    return map;
  }
}
