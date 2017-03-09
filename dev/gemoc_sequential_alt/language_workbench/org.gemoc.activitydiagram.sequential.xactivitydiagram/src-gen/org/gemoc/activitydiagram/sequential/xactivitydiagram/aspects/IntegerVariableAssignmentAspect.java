package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerExpression;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariableAssignment;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerExpressionAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspect;

@Aspect(className = IntegerVariableAssignment.class)
@SuppressWarnings("all")
public class IntegerVariableAssignmentAspect extends VariableAssignmentAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerVariableAssignment _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final IntegerVariableAssignment _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspectVariableAssignmentAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final IntegerVariableAssignmentAspectIntegerVariableAssignmentAspectProperties _self_, final IntegerVariableAssignment _self) {
    IntegerVariable _assignee = _self.getAssignee();
    IntegerExpression _expression = _self.getExpression();
    int _evaluate = IntegerExpressionAspect.evaluate(_expression);
    IntegerVariableAspect.currentValue(_assignee, _evaluate);
  }
}
