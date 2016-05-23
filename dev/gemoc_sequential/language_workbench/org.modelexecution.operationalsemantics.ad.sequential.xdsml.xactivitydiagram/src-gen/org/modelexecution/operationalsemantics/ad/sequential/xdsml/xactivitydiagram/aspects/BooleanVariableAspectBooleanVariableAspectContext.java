package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanVariable;
import java.util.Map;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties;

@SuppressWarnings("all")
public class BooleanVariableAspectBooleanVariableAspectContext {
  public final static BooleanVariableAspectBooleanVariableAspectContext INSTANCE = new BooleanVariableAspectBooleanVariableAspectContext();
  
  public static BooleanVariableAspectBooleanVariableAspectProperties getSelf(final BooleanVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanVariable, BooleanVariableAspectBooleanVariableAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanVariable, org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties>();
  
  public Map<BooleanVariable, BooleanVariableAspectBooleanVariableAspectProperties> getMap() {
    return map;
  }
}
