package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.VariableAssignment;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectProperties;

@Aspect(className = VariableAssignment.class)
@SuppressWarnings("all")
public class VariableAssignmentAspect {
  public static void execute(final VariableAssignment _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariableAssignment) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAssignmentAspect.execute(
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariableAssignment) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAssignmentAspect.execute(
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.VariableAssignment) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspect._privk3_execute(_self_,
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.VariableAssignment) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_execute(final VariableAssignmentAspectVariableAssignmentAspectProperties _self_, final VariableAssignment _self) {
  }
}
