package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableEvaluateAspectBooleanVariableAspectProperties;

@SuppressWarnings("all")
public class BooleanVariableEvaluateAspectBooleanVariableAspectContext {
  public final static BooleanVariableEvaluateAspectBooleanVariableAspectContext INSTANCE = new BooleanVariableEvaluateAspectBooleanVariableAspectContext();
  
  public static BooleanVariableEvaluateAspectBooleanVariableAspectProperties getSelf(final BooleanVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableEvaluateAspectBooleanVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanVariable, BooleanVariableEvaluateAspectBooleanVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableEvaluateAspectBooleanVariableAspectProperties>();
  
  public Map<BooleanVariable, BooleanVariableEvaluateAspectBooleanVariableAspectProperties> getMap() {
    return map;
  }
}
