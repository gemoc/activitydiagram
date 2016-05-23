package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanUnaryExpression;
import java.util.Map;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties;

@SuppressWarnings("all")
public class BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext {
  public final static BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext INSTANCE = new BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectContext();
  
  public static BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties getSelf(final BooleanUnaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanUnaryExpression, BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanUnaryExpression, org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties>();
  
  public Map<BooleanUnaryExpression, BooleanUnaryExpressionAspectBooleanUnaryExpressionAspectProperties> getMap() {
    return map;
  }
}
