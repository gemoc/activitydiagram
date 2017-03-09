package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ControlTokenAspectControlTokenAspectProperties;

@SuppressWarnings("all")
public class ControlTokenAspectControlTokenAspectContext {
  public final static ControlTokenAspectControlTokenAspectContext INSTANCE = new ControlTokenAspectControlTokenAspectContext();
  
  public static ControlTokenAspectControlTokenAspectProperties getSelf(final ControlToken _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ControlTokenAspectControlTokenAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ControlToken, ControlTokenAspectControlTokenAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ControlTokenAspectControlTokenAspectProperties>();
  
  public Map<ControlToken, ControlTokenAspectControlTokenAspectProperties> getMap() {
    return map;
  }
}
