package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.DecisionNode;
import java.util.Map;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.DecisionNodeAspectDecisionNodeAspectProperties;

@SuppressWarnings("all")
public class DecisionNodeAspectDecisionNodeAspectContext {
  public final static DecisionNodeAspectDecisionNodeAspectContext INSTANCE = new DecisionNodeAspectDecisionNodeAspectContext();
  
  public static DecisionNodeAspectDecisionNodeAspectProperties getSelf(final DecisionNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.DecisionNodeAspectDecisionNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DecisionNode, DecisionNodeAspectDecisionNodeAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.DecisionNode, org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.DecisionNodeAspectDecisionNodeAspectProperties>();
  
  public Map<DecisionNode, DecisionNodeAspectDecisionNodeAspectProperties> getMap() {
    return map;
  }
}
