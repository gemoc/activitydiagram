package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.MergeNode;
import java.util.Map;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.MergeNodeAspectMergeNodeAspectProperties;

@SuppressWarnings("all")
public class MergeNodeAspectMergeNodeAspectContext {
  public final static MergeNodeAspectMergeNodeAspectContext INSTANCE = new MergeNodeAspectMergeNodeAspectContext();
  
  public static MergeNodeAspectMergeNodeAspectProperties getSelf(final MergeNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.MergeNodeAspectMergeNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MergeNode, MergeNodeAspectMergeNodeAspectProperties> map = new java.util.WeakHashMap<activitydiagram.MergeNode, org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.MergeNodeAspectMergeNodeAspectProperties>();
  
  public Map<MergeNode, MergeNodeAspectMergeNodeAspectProperties> getMap() {
    return map;
  }
}
