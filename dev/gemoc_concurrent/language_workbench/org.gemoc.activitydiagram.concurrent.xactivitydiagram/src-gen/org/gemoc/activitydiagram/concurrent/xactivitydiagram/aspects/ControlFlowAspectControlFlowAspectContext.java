package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ControlFlow;
import java.util.Map;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ControlFlowAspectControlFlowAspectProperties;

@SuppressWarnings("all")
public class ControlFlowAspectControlFlowAspectContext {
  public final static ControlFlowAspectControlFlowAspectContext INSTANCE = new ControlFlowAspectControlFlowAspectContext();
  
  public static ControlFlowAspectControlFlowAspectProperties getSelf(final ControlFlow _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ControlFlowAspectControlFlowAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ControlFlow, ControlFlowAspectControlFlowAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ControlFlow, org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ControlFlowAspectControlFlowAspectProperties>();
  
  public Map<ControlFlow, ControlFlowAspectControlFlowAspectProperties> getMap() {
    return map;
  }
}
