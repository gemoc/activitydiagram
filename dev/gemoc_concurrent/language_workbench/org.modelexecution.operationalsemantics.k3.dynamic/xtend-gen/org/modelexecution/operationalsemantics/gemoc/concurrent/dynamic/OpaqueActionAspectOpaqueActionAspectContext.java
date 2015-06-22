package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.OpaqueAction;
import java.util.Map;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.OpaqueActionAspectOpaqueActionAspectProperties;

@SuppressWarnings("all")
public class OpaqueActionAspectOpaqueActionAspectContext {
  public final static OpaqueActionAspectOpaqueActionAspectContext INSTANCE = new OpaqueActionAspectOpaqueActionAspectContext();
  
  public static OpaqueActionAspectOpaqueActionAspectProperties getSelf(final OpaqueAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.OpaqueActionAspectOpaqueActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OpaqueAction, OpaqueActionAspectOpaqueActionAspectProperties> map = new java.util.WeakHashMap<activitydiagram.OpaqueAction, org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.OpaqueActionAspectOpaqueActionAspectProperties>();
  
  public Map<OpaqueAction, OpaqueActionAspectOpaqueActionAspectProperties> getMap() {
    return map;
  }
}
