package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectProperties;

@SuppressWarnings("all")
public class IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectContext {
  public final static IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectContext INSTANCE = new IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectContext();
  
  public static IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectProperties getSelf(final IntegerVariableAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerVariableAssignment, IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment, org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectProperties>();
  
  public Map<IntegerVariableAssignment, IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectProperties> getMap() {
    return map;
  }
}
