package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.AcceptEventAction;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Activity;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Trace;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectProperties;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TraceAspect;

@Aspect(className = AcceptEventAction.class)
@SuppressWarnings("all")
public class AcceptEventActionAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final AcceptEventAction _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.AcceptEventActionAspectAcceptEventActionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.AcceptEventAction){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.AcceptEventActionAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.AcceptEventAction)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final AcceptEventAction _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final AcceptEventActionAspectAcceptEventActionAspectProperties _self_, final AcceptEventAction _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    final Consumer<ActivityEdge> _function = new Consumer<ActivityEdge>() {
      @Override
      public void accept(final ActivityEdge i) {
        ActivityEdgeAspect.takeOfferedTokens(i);
      }
    };
    _incoming.forEach(_function);
    EObject _eContainer = _self.eContainer();
    Context _context = ActivityAspect.context(((Activity) _eContainer));
    Trace _output = ContextAspect.output(_context);
    EList<ActivityNode> _executedNodes = TraceAspect.executedNodes(_output);
    _executedNodes.add(_self);
    EList<ActivityEdge> _outgoing = _self.getOutgoing();
    final Consumer<ActivityEdge> _function_1 = new Consumer<ActivityEdge>() {
      @Override
      public void accept(final ActivityEdge o) {
        ActivityEdgeAspect.sendOffer(o);
      }
    };
    _outgoing.forEach(_function_1);
  }
}
