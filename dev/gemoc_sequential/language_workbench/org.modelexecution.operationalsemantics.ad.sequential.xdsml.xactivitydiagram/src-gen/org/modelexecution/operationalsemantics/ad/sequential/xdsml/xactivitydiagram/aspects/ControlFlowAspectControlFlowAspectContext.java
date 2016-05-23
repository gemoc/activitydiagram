package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ControlFlow;
import java.util.Map;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ControlFlowAspectControlFlowAspectProperties;

@SuppressWarnings("all")
public class ControlFlowAspectControlFlowAspectContext {
  public final static ControlFlowAspectControlFlowAspectContext INSTANCE = new ControlFlowAspectControlFlowAspectContext();
  
  public static ControlFlowAspectControlFlowAspectProperties getSelf(final ControlFlow _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ControlFlowAspectControlFlowAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ControlFlow, ControlFlowAspectControlFlowAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ControlFlow, org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ControlFlowAspectControlFlowAspectProperties>();
  
  public Map<ControlFlow, ControlFlowAspectControlFlowAspectProperties> getMap() {
    return map;
  }
}
