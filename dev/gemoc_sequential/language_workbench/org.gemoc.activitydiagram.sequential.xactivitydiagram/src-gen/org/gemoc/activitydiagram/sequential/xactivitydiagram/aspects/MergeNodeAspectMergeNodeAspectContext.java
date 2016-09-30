package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties;

@SuppressWarnings("all")
public class MergeNodeAspectMergeNodeAspectContext {
  public final static MergeNodeAspectMergeNodeAspectContext INSTANCE = new MergeNodeAspectMergeNodeAspectContext();
  
  public static MergeNodeAspectMergeNodeAspectProperties getSelf(final MergeNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MergeNode, MergeNodeAspectMergeNodeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties>();
  
  public Map<MergeNode, MergeNodeAspectMergeNodeAspectProperties> getMap() {
    return map;
  }
}
