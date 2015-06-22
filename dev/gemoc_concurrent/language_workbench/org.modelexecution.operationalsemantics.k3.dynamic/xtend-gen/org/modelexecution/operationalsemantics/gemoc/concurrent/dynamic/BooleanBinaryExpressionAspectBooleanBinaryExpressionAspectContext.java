package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.BooleanBinaryExpression;
import java.util.Map;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties;

@SuppressWarnings("all")
public class BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext {
  public final static BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext INSTANCE = new BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext();
  
  public static BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties getSelf(final BooleanBinaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanBinaryExpression, BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties> map = new java.util.WeakHashMap<activitydiagram.BooleanBinaryExpression, org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties>();
  
  public Map<BooleanBinaryExpression, BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties> getMap() {
    return map;
  }
}
