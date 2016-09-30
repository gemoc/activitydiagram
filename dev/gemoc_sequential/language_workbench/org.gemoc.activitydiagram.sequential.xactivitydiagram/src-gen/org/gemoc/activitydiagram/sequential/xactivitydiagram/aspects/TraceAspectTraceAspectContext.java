package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TraceAspectTraceAspectProperties;

@SuppressWarnings("all")
public class TraceAspectTraceAspectContext {
  public final static TraceAspectTraceAspectContext INSTANCE = new TraceAspectTraceAspectContext();
  
  public static TraceAspectTraceAspectProperties getSelf(final Trace _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TraceAspectTraceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Trace, TraceAspectTraceAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TraceAspectTraceAspectProperties>();
  
  public Map<Trace, TraceAspectTraceAspectProperties> getMap() {
    return map;
  }
}
