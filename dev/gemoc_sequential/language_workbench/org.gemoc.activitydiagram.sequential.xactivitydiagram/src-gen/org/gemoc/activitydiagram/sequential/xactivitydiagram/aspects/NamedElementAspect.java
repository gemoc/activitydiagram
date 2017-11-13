package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectProperties;

@Aspect(className = NamedElement.class)
@SuppressWarnings("all")
public class NamedElementAspect {
  public static void execute(final NamedElement _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectContext
			.getSelf(_self);
	if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Action) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ExecutableNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect._privk3_execute(_self_,
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlFlow) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.MergeNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.MergeNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect._privk3_execute(_self_,
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.JoinNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DecisionNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DecisionNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityFinalNodeAspect.execute(
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityFinalNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.FinalNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspect
				.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity) _self);
	} else if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement) {
		org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect._privk3_execute(_self_,
				(org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_execute(final NamedElementAspectNamedElementAspectProperties _self_, final NamedElement _self) {
  }
}
