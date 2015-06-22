package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.JoinNode;
import java.util.Map;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.JoinNodeAspectJoinNodeAspectProperties;

@SuppressWarnings("all")
public class JoinNodeAspectJoinNodeAspectContext {
  public final static JoinNodeAspectJoinNodeAspectContext INSTANCE = new JoinNodeAspectJoinNodeAspectContext();
  
  public static JoinNodeAspectJoinNodeAspectProperties getSelf(final JoinNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.JoinNodeAspectJoinNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JoinNode, JoinNodeAspectJoinNodeAspectProperties> map = new java.util.WeakHashMap<activitydiagram.JoinNode, org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.JoinNodeAspectJoinNodeAspectProperties>();
  
  public Map<JoinNode, JoinNodeAspectJoinNodeAspectProperties> getMap() {
    return map;
  }
}
