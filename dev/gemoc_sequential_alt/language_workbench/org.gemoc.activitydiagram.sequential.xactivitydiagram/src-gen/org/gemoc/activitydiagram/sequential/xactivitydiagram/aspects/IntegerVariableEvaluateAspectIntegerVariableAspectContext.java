package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableEvaluateAspectIntegerVariableAspectProperties;

@SuppressWarnings("all")
public class IntegerVariableEvaluateAspectIntegerVariableAspectContext {
  public final static IntegerVariableEvaluateAspectIntegerVariableAspectContext INSTANCE = new IntegerVariableEvaluateAspectIntegerVariableAspectContext();
  
  public static IntegerVariableEvaluateAspectIntegerVariableAspectProperties getSelf(final IntegerVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableEvaluateAspectIntegerVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerVariable, IntegerVariableEvaluateAspectIntegerVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableEvaluateAspectIntegerVariableAspectProperties>();
  
  public Map<IntegerVariable, IntegerVariableEvaluateAspectIntegerVariableAspectProperties> getMap() {
    return map;
  }
}
