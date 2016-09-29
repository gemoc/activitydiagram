package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.JoinNodeAspectJoinNodeAspectProperties;

@Aspect(className = JoinNode.class)
@SuppressWarnings("all")
public class JoinNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final JoinNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.JoinNodeAspectJoinNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.JoinNodeAspectJoinNodeAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.JoinNodeAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.JoinNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final JoinNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final JoinNodeAspectJoinNodeAspectProperties _self_, final JoinNode _self) {
    EList<Token> tokens = ActivityNodeAspect.takeOfferdTokens1(_self);
    final Consumer<Token> _function = (Token t) -> {
      int _remainingOffersCount = ForkedTokenAspect.remainingOffersCount(((ForkedToken) t));
      boolean _greaterThan = (_remainingOffersCount > 1);
      if (_greaterThan) {
        int _remainingOffersCount_1 = ForkedTokenAspect.remainingOffersCount(((ForkedToken) t));
        int _minus = (_remainingOffersCount_1 - 1);
        ForkedTokenAspect.remainingOffersCount(((ForkedToken) t), _minus);
      } else {
        BasicEList<Token> list = new BasicEList<Token>();
        list.add(t);
        ActivityNodeAspect.sendOffers1(_self, list);
      }
    };
    tokens.forEach(_function);
  }
}
