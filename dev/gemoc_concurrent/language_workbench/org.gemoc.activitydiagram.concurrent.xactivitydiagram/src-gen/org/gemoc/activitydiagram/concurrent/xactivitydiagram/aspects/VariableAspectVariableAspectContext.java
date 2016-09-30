package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable;
import java.util.Map;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectProperties;

@SuppressWarnings("all")
public class VariableAspectVariableAspectContext {
  public final static VariableAspectVariableAspectContext INSTANCE = new VariableAspectVariableAspectContext();
  
  public static VariableAspectVariableAspectProperties getSelf(final Variable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Variable, VariableAspectVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable, org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectProperties>();
  
  public Map<Variable, VariableAspectVariableAspectProperties> getMap() {
    return map;
  }
}
