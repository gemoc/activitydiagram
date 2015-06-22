package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.Activity;
import activitydiagram.ActivityEdge;
import activitydiagram.ActivityFinalNode;
import activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityFinalNodeAspectActivityFinalNodeAspectProperties;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.Context;

@Aspect(className = ActivityFinalNode.class)
@SuppressWarnings("all")
public class ActivityFinalNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final ActivityFinalNode _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityFinalNodeAspectActivityFinalNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityFinalNodeAspectActivityFinalNodeAspectContext.getSelf(_self);
     if (_self instanceof activitydiagram.ActivityFinalNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityFinalNodeAspect._privk3_execute(_self_, (activitydiagram.ActivityFinalNode)_self);
    } else  if (_self instanceof activitydiagram.ActivityNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect.execute((activitydiagram.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final ActivityFinalNode _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ActivityFinalNodeAspectActivityFinalNodeAspectProperties _self_, final ActivityFinalNode _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    final Consumer<ActivityEdge> _function = new Consumer<ActivityEdge>() {
      public void accept(final ActivityEdge i) {
        ActivityEdgeAspect.takeOfferedTokens(i);
      }
    };
    _incoming.forEach(_function);
    EObject _eContainer = _self.eContainer();
    Context _context = ActivityAspect.context(((Activity) _eContainer));
    _context.output.executedNodes.add(_self);
    EList<Token> _heldTokens = _self.getHeldTokens();
    _heldTokens.clear();
  }
}
