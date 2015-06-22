package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.IntegerVariable;
import java.util.Map;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerVariableAspectIntegerVariableAspectProperties;

@SuppressWarnings("all")
public class IntegerVariableAspectIntegerVariableAspectContext {
  public final static IntegerVariableAspectIntegerVariableAspectContext INSTANCE = new IntegerVariableAspectIntegerVariableAspectContext();
  
  public static IntegerVariableAspectIntegerVariableAspectProperties getSelf(final IntegerVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerVariableAspectIntegerVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerVariable, IntegerVariableAspectIntegerVariableAspectProperties> map = new java.util.WeakHashMap<activitydiagram.IntegerVariable, org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerVariableAspectIntegerVariableAspectProperties>();
  
  public Map<IntegerVariable, IntegerVariableAspectIntegerVariableAspectProperties> getMap() {
    return map;
  }
}
