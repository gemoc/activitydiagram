package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanBinaryExpression;
import java.util.Map;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties;

@SuppressWarnings("all")
public class BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext {
  public final static BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext INSTANCE = new BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext();
  
  public static BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties getSelf(final BooleanBinaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanBinaryExpression, BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanBinaryExpression, org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties>();
  
  public Map<BooleanBinaryExpression, BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties> getMap() {
    return map;
  }
}
