package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.ActivityNode;
import activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectProperties;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.NamedElementAspect;

@Aspect(className = ActivityNode.class)
@SuppressWarnings("all")
public class ActivityNodeAspect extends NamedElementAspect {
  public static void execute(final ActivityNode _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     if (_self instanceof activitydiagram.JoinNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.JoinNodeAspect.execute((activitydiagram.JoinNode)_self);
    } else  if (_self instanceof activitydiagram.ForkNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ForkNodeAspect.execute((activitydiagram.ForkNode)_self);
    } else  if (_self instanceof activitydiagram.InitialNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.InitialNodeAspect.execute((activitydiagram.InitialNode)_self);
    } else  if (_self instanceof activitydiagram.DecisionNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.DecisionNodeAspect.execute((activitydiagram.DecisionNode)_self);
    } else  if (_self instanceof activitydiagram.MergeNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.MergeNodeAspect.execute((activitydiagram.MergeNode)_self);
    } else  if (_self instanceof activitydiagram.OpaqueAction){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.OpaqueActionAspect.execute((activitydiagram.OpaqueAction)_self);
    } else  if (_self instanceof activitydiagram.ActivityFinalNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityFinalNodeAspect.execute((activitydiagram.ActivityFinalNode)_self);
    } else  if (_self instanceof activitydiagram.ActivityNode){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspect._privk3_execute(_self_, (activitydiagram.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void terminate(final ActivityNode _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_terminate(_self_, _self);
  }
  
  /**
   * @generated NOT
   */
  public static void addTokens(final ActivityNode _self, final List<Token> tokens) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_addTokens(_self_, _self,tokens);
  }
  
  public static void removeToken(final ActivityNode _self, final Token token) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_removeToken(_self_, _self,token);
  }
  
  protected static void _privk3_execute(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
  }
  
  protected static void _privk3_terminate(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    _self.setRunning(false);
  }
  
  protected static void _privk3_addTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final List<Token> tokens) {
    for (final Token token : tokens) {
      {
        token.setHolder(_self);
        Token transferredToken = token;
        EList<Token> _heldTokens = _self.getHeldTokens();
        _heldTokens.add(transferredToken);
      }
    }
  }
  
  protected static void _privk3_removeToken(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final Token token) {
    token.setHolder(null);
    EList<Token> _heldTokens = _self.getHeldTokens();
    _heldTokens.remove(token);
  }
}
