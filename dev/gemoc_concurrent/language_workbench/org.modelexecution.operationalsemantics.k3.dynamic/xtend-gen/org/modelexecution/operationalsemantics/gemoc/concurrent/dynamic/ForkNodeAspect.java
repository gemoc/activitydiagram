package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.Activity;
import activitydiagram.ActivityEdge;
import activitydiagram.ActivitydiagramFactory;
import activitydiagram.ForkNode;
import activitydiagram.ForkedToken;
import activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.Context;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ForkNodeAspectForkNodeAspectProperties;

@Aspect(className = ForkNode.class)
@SuppressWarnings("all")
public class ForkNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final ForkNode _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ForkNodeAspectForkNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ForkNodeAspectForkNodeAspectContext.getSelf(_self);
     if (_self instanceof activitydiagram.ForkNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ForkNodeAspect._privk3_execute(_self_, (activitydiagram.ForkNode)_self);
    } else  if (_self instanceof activitydiagram.ActivityNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect.execute((activitydiagram.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final ForkNode _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ForkNodeAspectForkNodeAspectProperties _self_, final ForkNode _self) {
    EObject _eContainer = _self.eContainer();
    Context _context = ActivityAspect.context(((Activity) _eContainer));
    _context.output.executedNodes.add(_self);
    EList<Token> tokens = _self.getHeldTokens();
    ArrayList<Token> forkedTokens = new ArrayList<Token>();
    for (final Token token : tokens) {
      {
        ForkedToken forkedToken = ActivitydiagramFactory.eINSTANCE.createForkedToken();
        forkedToken.setBaseToken(token);
        EList<ActivityEdge> _outgoing = _self.getOutgoing();
        int _size = _outgoing.size();
        forkedToken.setRemainingOffersCount(_size);
        forkedTokens.add(forkedToken);
      }
    }
    ActivityNodeAspect.addTokens(_self, forkedTokens);
  }
}
