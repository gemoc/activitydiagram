package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.Activity;
import activitydiagram.ForkedToken;
import activitydiagram.JoinNode;
import activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.Context;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.JoinNodeAspectJoinNodeAspectProperties;

@Aspect(className = JoinNode.class)
@SuppressWarnings("all")
public class JoinNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final JoinNode _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.JoinNodeAspectJoinNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.JoinNodeAspectJoinNodeAspectContext.getSelf(_self);
     if (_self instanceof activitydiagram.JoinNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.JoinNodeAspect._privk3_execute(_self_, (activitydiagram.JoinNode)_self);
    } else  if (_self instanceof activitydiagram.ActivityNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect.execute((activitydiagram.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final JoinNode _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final JoinNodeAspectJoinNodeAspectProperties _self_, final JoinNode _self) {
    EObject _eContainer = _self.eContainer();
    Context _context = ActivityAspect.context(((Activity) _eContainer));
    _context.output.executedNodes.add(_self);
    EList<Token> tokens = _self.getHeldTokens();
    final Consumer<Token> _function = new Consumer<Token>() {
      public void accept(final Token t) {
        int _remainingOffersCount = ((ForkedToken) t).getRemainingOffersCount();
        boolean _greaterThan = (_remainingOffersCount > 1);
        if (_greaterThan) {
          int _remainingOffersCount_1 = ((ForkedToken) t).getRemainingOffersCount();
          int _minus = (_remainingOffersCount_1 - 1);
          ((ForkedToken) t).setRemainingOffersCount(_minus);
        } else {
          EList<Token> _heldTokens = _self.getHeldTokens();
          _heldTokens.add(t);
        }
      }
    };
    tokens.forEach(_function);
  }
}
