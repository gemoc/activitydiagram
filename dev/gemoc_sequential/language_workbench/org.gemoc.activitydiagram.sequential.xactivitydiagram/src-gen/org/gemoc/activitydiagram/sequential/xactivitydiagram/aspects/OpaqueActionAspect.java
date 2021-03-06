package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspectOpaqueActionAspectProperties;

@Aspect(className = OpaqueAction.class)
@SuppressWarnings("all")
public class OpaqueActionAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final OpaqueAction _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspectOpaqueActionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspectOpaqueActionAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  private static void super_execute(final OpaqueAction _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final OpaqueActionAspectOpaqueActionAspectProperties _self_, final OpaqueAction _self) {
    ActivityNodeAspect.sendOffers(_self, ActivityNodeAspect.takeOfferdTokens(_self));
  }
}
