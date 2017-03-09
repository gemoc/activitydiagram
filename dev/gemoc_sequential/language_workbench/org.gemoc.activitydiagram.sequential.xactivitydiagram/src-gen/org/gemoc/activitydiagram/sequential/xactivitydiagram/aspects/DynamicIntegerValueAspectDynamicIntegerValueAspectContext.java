package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicIntegerValueAspectDynamicIntegerValueAspectProperties;

@SuppressWarnings("all")
public class DynamicIntegerValueAspectDynamicIntegerValueAspectContext {
  public final static DynamicIntegerValueAspectDynamicIntegerValueAspectContext INSTANCE = new DynamicIntegerValueAspectDynamicIntegerValueAspectContext();
  
  public static DynamicIntegerValueAspectDynamicIntegerValueAspectProperties getSelf(final DynamicIntegerValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicIntegerValueAspectDynamicIntegerValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DynamicIntegerValue, DynamicIntegerValueAspectDynamicIntegerValueAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicIntegerValueAspectDynamicIntegerValueAspectProperties>();
  
  public Map<DynamicIntegerValue, DynamicIntegerValueAspectDynamicIntegerValueAspectProperties> getMap() {
    return map;
  }
}
