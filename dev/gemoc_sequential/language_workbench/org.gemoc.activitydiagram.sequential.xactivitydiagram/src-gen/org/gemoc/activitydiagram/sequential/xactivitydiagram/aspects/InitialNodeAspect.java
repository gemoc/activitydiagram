package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.UniqueEList;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TokenAspect;

@Aspect(className = InitialNode.class)
@SuppressWarnings("all")
public class InitialNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final InitialNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.NamedElement)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static boolean hasOffers1(final InitialNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspectInitialNodeAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode){
    					result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InitialNodeAspect._privk3_hasOffers1(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode){
    					result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect.hasOffers1((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static void super_execute(final InitialNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self) {
    ControlToken r = ActivitydiagramFactory.eINSTANCE.createControlToken();
    TokenAspect.holder(r, _self);
    UniqueEList<Token> _heldTokens = ActivityNodeAspect.heldTokens(_self);
    _heldTokens.add(r);
    BasicEList<Token> list = new BasicEList<Token>();
    list.add(r);
    ActivityNodeAspect.sendOffers1(_self, list);
  }
  
  private static boolean super_hasOffers1(final InitialNode _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect._privk3_hasOffers1(_self_, _self);
  }
  
  protected static boolean _privk3_hasOffers1(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self) {
    return false;
  }
}
