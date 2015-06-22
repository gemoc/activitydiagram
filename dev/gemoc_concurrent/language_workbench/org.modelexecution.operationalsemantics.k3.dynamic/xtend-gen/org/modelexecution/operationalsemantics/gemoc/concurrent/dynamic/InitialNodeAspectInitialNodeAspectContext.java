package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.InitialNode;
import java.util.Map;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.InitialNodeAspectInitialNodeAspectProperties;

@SuppressWarnings("all")
public class InitialNodeAspectInitialNodeAspectContext {
  public final static InitialNodeAspectInitialNodeAspectContext INSTANCE = new InitialNodeAspectInitialNodeAspectContext();
  
  public static InitialNodeAspectInitialNodeAspectProperties getSelf(final InitialNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.InitialNodeAspectInitialNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InitialNode, InitialNodeAspectInitialNodeAspectProperties> map = new java.util.WeakHashMap<activitydiagram.InitialNode, org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.InitialNodeAspectInitialNodeAspectProperties>();
  
  public Map<InitialNode, InitialNodeAspectInitialNodeAspectProperties> getMap() {
    return map;
  }
}
