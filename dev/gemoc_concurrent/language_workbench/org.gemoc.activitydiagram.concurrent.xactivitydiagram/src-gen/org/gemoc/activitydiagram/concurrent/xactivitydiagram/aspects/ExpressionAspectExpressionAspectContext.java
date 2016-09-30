package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Expression;
import java.util.Map;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties;

@SuppressWarnings("all")
public class ExpressionAspectExpressionAspectContext {
  public final static ExpressionAspectExpressionAspectContext INSTANCE = new ExpressionAspectExpressionAspectContext();
  
  public static ExpressionAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression, ExpressionAspectExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Expression, org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ExpressionAspectExpressionAspectProperties>();
  
  public Map<Expression, ExpressionAspectExpressionAspectProperties> getMap() {
    return map;
  }
}
