package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.MergeNode;
import java.util.Map;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties;

@SuppressWarnings("all")
public class MergeNodeAspectMergeNodeAspectContext {
  public final static MergeNodeAspectMergeNodeAspectContext INSTANCE = new MergeNodeAspectMergeNodeAspectContext();
  
  public static MergeNodeAspectMergeNodeAspectProperties getSelf(final MergeNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MergeNode, MergeNodeAspectMergeNodeAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.MergeNode, org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.MergeNodeAspectMergeNodeAspectProperties>();
  
  public Map<MergeNode, MergeNodeAspectMergeNodeAspectProperties> getMap() {
    return map;
  }
}
