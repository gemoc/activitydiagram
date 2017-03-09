package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariableAssignment;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAssignmentAspectBooleanVariableAssignmentAspectProperties;

@SuppressWarnings("all")
public class BooleanVariableAssignmentAspectBooleanVariableAssignmentAspectContext {
  public final static BooleanVariableAssignmentAspectBooleanVariableAssignmentAspectContext INSTANCE = new BooleanVariableAssignmentAspectBooleanVariableAssignmentAspectContext();
  
  public static BooleanVariableAssignmentAspectBooleanVariableAssignmentAspectProperties getSelf(final BooleanVariableAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAssignmentAspectBooleanVariableAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanVariableAssignment, BooleanVariableAssignmentAspectBooleanVariableAssignmentAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariableAssignment, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAssignmentAspectBooleanVariableAssignmentAspectProperties>();
  
  public Map<BooleanVariableAssignment, BooleanVariableAssignmentAspectBooleanVariableAssignmentAspectProperties> getMap() {
    return map;
  }
}
