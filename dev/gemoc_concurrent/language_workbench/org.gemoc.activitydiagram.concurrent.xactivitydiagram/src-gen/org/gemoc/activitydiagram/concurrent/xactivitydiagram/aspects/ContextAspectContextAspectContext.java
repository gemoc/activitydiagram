package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context;
import java.util.Map;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties;

@SuppressWarnings("all")
public class ContextAspectContextAspectContext {
  public final static ContextAspectContextAspectContext INSTANCE = new ContextAspectContextAspectContext();
  
  public static ContextAspectContextAspectProperties getSelf(final Context _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Context, ContextAspectContextAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context, org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspectContextAspectProperties>();
  
  public Map<Context, ContextAspectContextAspectProperties> getMap() {
    return map;
  }
}
