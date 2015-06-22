package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.DecisionNode;
import java.util.Map;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.DecisionNodeAspectDecisionNodeAspectProperties;

@SuppressWarnings("all")
public class DecisionNodeAspectDecisionNodeAspectContext {
  public final static DecisionNodeAspectDecisionNodeAspectContext INSTANCE = new DecisionNodeAspectDecisionNodeAspectContext();
  
  public static DecisionNodeAspectDecisionNodeAspectProperties getSelf(final DecisionNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.DecisionNodeAspectDecisionNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DecisionNode, DecisionNodeAspectDecisionNodeAspectProperties> map = new java.util.WeakHashMap<activitydiagram.DecisionNode, org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.DecisionNodeAspectDecisionNodeAspectProperties>();
  
  public Map<DecisionNode, DecisionNodeAspectDecisionNodeAspectProperties> getMap() {
    return map;
  }
}
