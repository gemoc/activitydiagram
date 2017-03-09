package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectProperties;

@SuppressWarnings("all")
public class BooleanExpressionAspectBooleanExpressionAspectContext {
  public final static BooleanExpressionAspectBooleanExpressionAspectContext INSTANCE = new BooleanExpressionAspectBooleanExpressionAspectContext();
  
  public static BooleanExpressionAspectBooleanExpressionAspectProperties getSelf(final BooleanExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanExpression, BooleanExpressionAspectBooleanExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspectBooleanExpressionAspectProperties>();
  
  public Map<BooleanExpression, BooleanExpressionAspectBooleanExpressionAspectProperties> getMap() {
    return map;
  }
}
