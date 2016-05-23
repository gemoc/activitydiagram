package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityFinalNode;
import java.util.Map;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityFinalNodeAspectActivityFinalNodeAspectProperties;

@SuppressWarnings("all")
public class ActivityFinalNodeAspectActivityFinalNodeAspectContext {
  public final static ActivityFinalNodeAspectActivityFinalNodeAspectContext INSTANCE = new ActivityFinalNodeAspectActivityFinalNodeAspectContext();
  
  public static ActivityFinalNodeAspectActivityFinalNodeAspectProperties getSelf(final ActivityFinalNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityFinalNodeAspectActivityFinalNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ActivityFinalNode, ActivityFinalNodeAspectActivityFinalNodeAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityFinalNode, org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityFinalNodeAspectActivityFinalNodeAspectProperties>();
  
  public Map<ActivityFinalNode, ActivityFinalNodeAspectActivityFinalNodeAspectProperties> getMap() {
    return map;
  }
}
