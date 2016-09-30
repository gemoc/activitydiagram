package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.SendSignalAction;
import java.util.Map;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.SendSignalActionAspectSendSignalActionAspectProperties;

@SuppressWarnings("all")
public class SendSignalActionAspectSendSignalActionAspectContext {
  public final static SendSignalActionAspectSendSignalActionAspectContext INSTANCE = new SendSignalActionAspectSendSignalActionAspectContext();
  
  public static SendSignalActionAspectSendSignalActionAspectProperties getSelf(final SendSignalAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.SendSignalActionAspectSendSignalActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SendSignalAction, SendSignalActionAspectSendSignalActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.SendSignalAction, org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.SendSignalActionAspectSendSignalActionAspectProperties>();
  
  public Map<SendSignalAction, SendSignalActionAspectSendSignalActionAspectProperties> getMap() {
    return map;
  }
}
