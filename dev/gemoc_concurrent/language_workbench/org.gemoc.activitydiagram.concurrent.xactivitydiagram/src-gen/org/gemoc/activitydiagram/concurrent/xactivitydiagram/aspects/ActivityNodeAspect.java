package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Containment;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.NamedElementAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TokenAspect;

@Aspect(className = ActivityNode.class)
@SuppressWarnings("all")
public class ActivityNodeAspect extends NamedElementAspect {
  @ReplaceAspectMethod
  public static void execute(final ActivityNode _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.AcceptEventAction){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.AcceptEventActionAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.AcceptEventAction)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.MergeNode){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.MergeNodeAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.MergeNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ForkNode){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ForkNodeAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ForkNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.DecisionNode){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.DecisionNodeAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.DecisionNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.InitialNode){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.InitialNodeAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.InitialNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.OpaqueAction){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.OpaqueActionAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.OpaqueAction)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.JoinNode){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.JoinNodeAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.JoinNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityFinalNode){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityFinalNodeAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityFinalNode)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.SendSignalAction){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.SendSignalActionAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.SendSignalAction)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @ReplaceAspectMethod
  public static void terminate(final ActivityNode _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_terminate(_self_, _self);;
  }
  
  public static void addTokens(final ActivityNode _self, final EList<Token> tokens) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_addTokens(_self_, _self,tokens);;
  }
  
  public static void removeToken(final ActivityNode _self, final Token token) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_removeToken(_self_, _self,token);;
  }
  
  @Containment
  public static EList<Token> heldTokens(final ActivityNode _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_heldTokens(_self_, _self);;
    return (org.eclipse.emf.common.util.EList<org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Token>)result;
  }
  
  @Containment
  public static void heldTokens(final ActivityNode _self, final EList<Token> heldTokens) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_heldTokens(_self_, _self,heldTokens);;
  }
  
  public static Boolean running(final ActivityNode _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_running(_self_, _self);;
    return (java.lang.Boolean)result;
  }
  
  public static void running(final ActivityNode _self, final Boolean running) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_running(_self_, _self,running);;
  }
  
  protected static void _privk3_execute(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
  }
  
  protected static void _privk3_terminate(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    ActivityNodeAspect.running(_self, Boolean.valueOf(false));
  }
  
  protected static void _privk3_addTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final EList<Token> tokens) {
    for (final Token token : tokens) {
      {
        TokenAspect.holder(token, _self);
        Token transferredToken = token;
        EList<Token> _heldTokens = ActivityNodeAspect.heldTokens(_self);
        _heldTokens.add(transferredToken);
      }
    }
  }
  
  protected static void _privk3_removeToken(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final Token token) {
    TokenAspect.holder(token, null);
    EList<Token> _heldTokens = ActivityNodeAspect.heldTokens(_self);
    _heldTokens.remove(token);
  }
  
  protected static EList<Token> _privk3_heldTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getHeldTokens") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.heldTokens;
  }
  
  protected static void _privk3_heldTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final EList<Token> heldTokens) {
    _self_.heldTokens = heldTokens; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setHeldTokens")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, heldTokens);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static Boolean _privk3_running(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getRunning") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Boolean) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.running;
  }
  
  protected static void _privk3_running(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final Boolean running) {
    _self_.running = running; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setRunning")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, running);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
