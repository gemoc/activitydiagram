package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties;

@SuppressWarnings("all")
public class InitialNodeAspectInitialNodeAspectContext {
  public final static InitialNodeAspectInitialNodeAspectContext INSTANCE = new InitialNodeAspectInitialNodeAspectContext();
  
  public static InitialNodeAspectInitialNodeAspectProperties getSelf(final InitialNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InitialNode, InitialNodeAspectInitialNodeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties>();
  
  public Map<InitialNode, InitialNodeAspectInitialNodeAspectProperties> getMap() {
    return map;
  }
}
