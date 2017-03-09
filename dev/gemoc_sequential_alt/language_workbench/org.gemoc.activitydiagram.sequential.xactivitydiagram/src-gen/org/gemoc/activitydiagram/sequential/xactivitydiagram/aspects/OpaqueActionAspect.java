package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.OpaqueAction;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.VariableAssignment;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspectOpaqueActionAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAssignmentAspect;

@Aspect(className = OpaqueAction.class)
@SuppressWarnings("all")
public class OpaqueActionAspect extends ActivityNodeAspect {
  public static void sendOffer(final OpaqueAction _self, final ControlToken token) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspectOpaqueActionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspectOpaqueActionAspectContext
			.getSelf(_self);
	_privk3_sendOffer(_self_, _self, token);
	;
}
  
  @OverrideAspectMethod
  public static void execute(final OpaqueAction _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspectOpaqueActionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspectOpaqueActionAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  @OverrideAspectMethod
  public static boolean hasOffers(final OpaqueAction _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspectOpaqueActionAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.OpaqueActionAspectOpaqueActionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hasOffers(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static void _privk3_sendOffer(final OpaqueActionAspectOpaqueActionAspectProperties _self_, final OpaqueAction _self, final ControlToken token) {
    ActivityEdge _outgoing = _self.getOutgoing();
    ActivityEdgeAspect.sendOffer(_outgoing, token);
  }
  
  private static void super_execute(final OpaqueAction _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final OpaqueActionAspectOpaqueActionAspectProperties _self_, final OpaqueAction _self) {
    EList<VariableAssignment> _assignments = _self.getAssignments();
    final Consumer<VariableAssignment> _function = (VariableAssignment a) -> {
      VariableAssignmentAspect.execute(a);
    };
    _assignments.forEach(_function);
    ActivityEdge _incoming = _self.getIncoming();
    EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(_incoming);
    final ControlToken token = IterableExtensions.<ControlToken>head(_offeredTokens);
    ActivityNodeAspect.addToken(_self, token);
    OpaqueActionAspect.sendOffer(_self, token);
  }
  
  private static boolean super_hasOffers(final OpaqueAction _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers(_self_, _self);
  }
  
  protected static boolean _privk3_hasOffers(final OpaqueActionAspectOpaqueActionAspectProperties _self_, final OpaqueAction _self) {
    ActivityEdge _incoming = _self.getIncoming();
    EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(_incoming);
    boolean _isEmpty = _offeredTokens.isEmpty();
    return (!_isEmpty);
  }
}
