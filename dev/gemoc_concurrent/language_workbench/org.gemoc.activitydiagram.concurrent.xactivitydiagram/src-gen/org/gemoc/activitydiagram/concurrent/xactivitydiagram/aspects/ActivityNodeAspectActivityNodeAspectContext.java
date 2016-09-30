package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode;
import java.util.Map;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties;

@SuppressWarnings("all")
public class ActivityNodeAspectActivityNodeAspectContext {
  public final static ActivityNodeAspectActivityNodeAspectContext INSTANCE = new ActivityNodeAspectActivityNodeAspectContext();
  
  public static ActivityNodeAspectActivityNodeAspectProperties getSelf(final ActivityNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ActivityNode, ActivityNodeAspectActivityNodeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode, org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties>();
  
  public Map<ActivityNode, ActivityNodeAspectActivityNodeAspectProperties> getMap() {
    return map;
  }
}
