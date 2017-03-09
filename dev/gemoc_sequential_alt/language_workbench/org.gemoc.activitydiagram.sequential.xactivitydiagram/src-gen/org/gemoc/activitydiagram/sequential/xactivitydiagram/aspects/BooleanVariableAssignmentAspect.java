package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariableAssignment;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanExpressionAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAssignmentAspectBooleanVariableAssignmentAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspect;

@Aspect(className = BooleanVariableAssignment.class)
@SuppressWarnings("all")
public class BooleanVariableAssignmentAspect extends VariableAssignmentAspect {
  @OverrideAspectMethod
  public static void execute(final BooleanVariableAssignment _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAssignmentAspectBooleanVariableAssignmentAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAssignmentAspectBooleanVariableAssignmentAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final BooleanVariableAssignment _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final BooleanVariableAssignmentAspectBooleanVariableAssignmentAspectProperties _self_, final BooleanVariableAssignment _self) {
    BooleanVariable _assignee = _self.getAssignee();
    BooleanExpression _expression = _self.getExpression();
    boolean _evaluate = BooleanExpressionAspect.evaluate(_expression);
    BooleanVariableAspect.currentValue(_assignee, _evaluate);
  }
}
