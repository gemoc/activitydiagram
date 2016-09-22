package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkNodeAspectForkNodeAspectProperties;

@SuppressWarnings("all")
public class ForkNodeAspectForkNodeAspectContext {
  public final static ForkNodeAspectForkNodeAspectContext INSTANCE = new ForkNodeAspectForkNodeAspectContext();
  
  public static ForkNodeAspectForkNodeAspectProperties getSelf(final ForkNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkNodeAspectForkNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ForkNode, ForkNodeAspectForkNodeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkNodeAspectForkNodeAspectProperties>();
  
  public Map<ForkNode, ForkNodeAspectForkNodeAspectProperties> getMap() {
    return map;
  }
}
