package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspectForkedTokenAspectProperties;

@SuppressWarnings("all")
public class ForkedTokenAspectForkedTokenAspectContext {
  public final static ForkedTokenAspectForkedTokenAspectContext INSTANCE = new ForkedTokenAspectForkedTokenAspectContext();
  
  public static ForkedTokenAspectForkedTokenAspectProperties getSelf(final ForkedToken _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspectForkedTokenAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ForkedToken, ForkedTokenAspectForkedTokenAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspectForkedTokenAspectProperties>();
  
  public Map<ForkedToken, ForkedTokenAspectForkedTokenAspectProperties> getMap() {
    return map;
  }
}
