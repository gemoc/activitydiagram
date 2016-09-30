package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.AcceptEventAction;
import java.util.Map;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectProperties;

@SuppressWarnings("all")
public class AcceptEventActionAspectAcceptEventActionAspectContext {
  public final static AcceptEventActionAspectAcceptEventActionAspectContext INSTANCE = new AcceptEventActionAspectAcceptEventActionAspectContext();
  
  public static AcceptEventActionAspectAcceptEventActionAspectProperties getSelf(final AcceptEventAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AcceptEventAction, AcceptEventActionAspectAcceptEventActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.AcceptEventAction, org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectProperties>();
  
  public Map<AcceptEventAction, AcceptEventActionAspectAcceptEventActionAspectProperties> getMap() {
    return map;
  }
}
