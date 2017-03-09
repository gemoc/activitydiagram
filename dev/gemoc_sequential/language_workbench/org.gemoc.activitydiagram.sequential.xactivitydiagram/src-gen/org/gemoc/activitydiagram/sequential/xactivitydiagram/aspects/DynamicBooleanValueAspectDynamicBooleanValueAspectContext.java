package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicBooleanValueAspectDynamicBooleanValueAspectProperties;

@SuppressWarnings("all")
public class DynamicBooleanValueAspectDynamicBooleanValueAspectContext {
  public final static DynamicBooleanValueAspectDynamicBooleanValueAspectContext INSTANCE = new DynamicBooleanValueAspectDynamicBooleanValueAspectContext();
  
  public static DynamicBooleanValueAspectDynamicBooleanValueAspectProperties getSelf(final DynamicBooleanValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicBooleanValueAspectDynamicBooleanValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DynamicBooleanValue, DynamicBooleanValueAspectDynamicBooleanValueAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicBooleanValueAspectDynamicBooleanValueAspectProperties>();
  
  public Map<DynamicBooleanValue, DynamicBooleanValueAspectDynamicBooleanValueAspectProperties> getMap() {
    return map;
  }
}
