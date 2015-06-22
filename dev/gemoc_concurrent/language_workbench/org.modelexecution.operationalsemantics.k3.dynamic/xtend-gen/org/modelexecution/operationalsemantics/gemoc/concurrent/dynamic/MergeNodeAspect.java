package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.Activity;
import activitydiagram.ActivityEdge;
import activitydiagram.MergeNode;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityEdgeAspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.Context;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.MergeNodeAspectMergeNodeAspectProperties;

@Aspect(className = MergeNode.class)
@SuppressWarnings("all")
public class MergeNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final MergeNode _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.MergeNodeAspectMergeNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.MergeNodeAspectMergeNodeAspectContext.getSelf(_self);
     if (_self instanceof activitydiagram.MergeNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.MergeNodeAspect._privk3_execute(_self_, (activitydiagram.MergeNode)_self);
    } else  if (_self instanceof activitydiagram.ActivityNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect.execute((activitydiagram.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final MergeNode _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final MergeNodeAspectMergeNodeAspectProperties _self_, final MergeNode _self) {
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
    EList<ActivityEdge> _outgoing = _self.getOutgoing();
    final Consumer<ActivityEdge> _function_1 = new Consumer<ActivityEdge>() {
      public void accept(final ActivityEdge o) {
        ActivityEdgeAspect.sendOffer(o);
      }
    };
    _outgoing.forEach(_function_1);
  }
}
