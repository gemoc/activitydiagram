package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ForkedToken;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.JoinNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Token;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Trace;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Context;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.JoinNodeAspectJoinNodeAspectProperties;

@Aspect(className = JoinNode.class)
@SuppressWarnings("all")
public class JoinNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final JoinNode _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.JoinNodeAspectJoinNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.JoinNodeAspectJoinNodeAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.JoinNode){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.JoinNodeAspect._privk3_execute(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.JoinNode)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.NamedElement){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.NamedElement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final JoinNode _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final JoinNodeAspectJoinNodeAspectProperties _self_, final JoinNode _self, final Context c) {
    Trace _output = c.getOutput();
    EList<ActivityNode> _executedNodes = _output.getExecutedNodes();
    _executedNodes.add(_self);
    EList<Token> tokens = ActivityNodeAspect.takeOfferdTokens1(_self);
    final Consumer<Token> _function = (Token t) -> {
      int _remainingOffersCount = ((ForkedToken) t).getRemainingOffersCount();
      boolean _greaterThan = (_remainingOffersCount > 1);
      if (_greaterThan) {
        int _remainingOffersCount_1 = ((ForkedToken) t).getRemainingOffersCount();
        int _minus = (_remainingOffersCount_1 - 1);
        ((ForkedToken) t).setRemainingOffersCount(_minus);
      } else {
        BasicEList<Token> list = new BasicEList<Token>();
        list.add(t);
        ActivityNodeAspect.sendOffers1(_self, list);
      }
    };
    tokens.forEach(_function);
  }
}
