package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public class VariableAspect {
  @Step
  public static void init(final Variable _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect
				.init((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspect
				.init((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect._privk3_init(_self_,
						(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Variable", "init");
		} else {
			fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_init(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
  }
}
