package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FlowFinalNodeAspectFlowFinalNodeAspectProperties;

@SuppressWarnings("all")
public class FlowFinalNodeAspectFlowFinalNodeAspectContext {
  public final static FlowFinalNodeAspectFlowFinalNodeAspectContext INSTANCE = new FlowFinalNodeAspectFlowFinalNodeAspectContext();
  
  public static FlowFinalNodeAspectFlowFinalNodeAspectProperties getSelf(final FlowFinalNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FlowFinalNodeAspectFlowFinalNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FlowFinalNode, FlowFinalNodeAspectFlowFinalNodeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FlowFinalNode, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.FlowFinalNodeAspectFlowFinalNodeAspectProperties>();
  
  public Map<FlowFinalNode, FlowFinalNodeAspectFlowFinalNodeAspectProperties> getMap() {
    return map;
  }
}
