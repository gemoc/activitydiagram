package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Activity;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.InitialNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ControlToken;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Token;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Trace;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityEdgeAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TokenAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TraceAspect;

@Aspect(className = InitialNode.class)
@SuppressWarnings("all")
public class InitialNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final InitialNode _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.InitialNode){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.InitialNodeAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.InitialNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final InitialNode _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self) {
    ControlToken r = ActivitydiagramFactory.eINSTANCE.createControlToken();
    TokenAspect.holder(r, _self);
    EList<Token> _heldTokens = ActivityNodeAspect.heldTokens(_self);
    _heldTokens.add(r);
    EObject _eContainer = _self.eContainer();
    Context _context = ActivityAspect.context(((Activity) _eContainer));
    Trace _output = ContextAspect.output(_context);
    EList<ActivityNode> _executedNodes = TraceAspect.executedNodes(_output);
    _executedNodes.add(_self);
    EList<ActivityEdge> _outgoing = _self.getOutgoing();
    final Consumer<ActivityEdge> _function = new Consumer<ActivityEdge>() {
      @Override
      public void accept(final ActivityEdge o) {
        ActivityEdgeAspect.sendOffer(o);
      }
    };
    _outgoing.forEach(_function);
  }
}
