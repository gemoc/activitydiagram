package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.VariableAssignment;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectProperties;

@SuppressWarnings("all")
public class VariableAssignmentAspectVariableAssignmentAspectContext {
  public final static VariableAssignmentAspectVariableAssignmentAspectContext INSTANCE = new VariableAssignmentAspectVariableAssignmentAspectContext();
  
  public static VariableAssignmentAspectVariableAssignmentAspectProperties getSelf(final VariableAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<VariableAssignment, VariableAssignmentAspectVariableAssignmentAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.VariableAssignment, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectProperties>();
  
  public Map<VariableAssignment, VariableAssignmentAspectVariableAssignmentAspectProperties> getMap() {
    return map;
  }
}
