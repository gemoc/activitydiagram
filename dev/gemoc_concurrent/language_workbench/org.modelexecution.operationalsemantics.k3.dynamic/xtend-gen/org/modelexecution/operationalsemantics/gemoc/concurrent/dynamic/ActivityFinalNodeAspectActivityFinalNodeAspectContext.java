package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.ActivityFinalNode;
import java.util.Map;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityFinalNodeAspectActivityFinalNodeAspectProperties;

@SuppressWarnings("all")
public class ActivityFinalNodeAspectActivityFinalNodeAspectContext {
  public final static ActivityFinalNodeAspectActivityFinalNodeAspectContext INSTANCE = new ActivityFinalNodeAspectActivityFinalNodeAspectContext();
  
  public static ActivityFinalNodeAspectActivityFinalNodeAspectProperties getSelf(final ActivityFinalNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityFinalNodeAspectActivityFinalNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ActivityFinalNode, ActivityFinalNodeAspectActivityFinalNodeAspectProperties> map = new java.util.WeakHashMap<activitydiagram.ActivityFinalNode, org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityFinalNodeAspectActivityFinalNodeAspectProperties>();
  
  public Map<ActivityFinalNode, ActivityFinalNodeAspectActivityFinalNodeAspectProperties> getMap() {
    return map;
  }
}
