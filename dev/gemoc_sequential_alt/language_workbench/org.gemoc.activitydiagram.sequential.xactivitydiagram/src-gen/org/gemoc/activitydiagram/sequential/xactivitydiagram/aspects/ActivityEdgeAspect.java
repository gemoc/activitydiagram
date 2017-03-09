package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityEdge;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.melange.annotation.Containment;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect;

@Aspect(className = ActivityEdge.class)
@SuppressWarnings("all")
public class ActivityEdgeAspect extends NamedElementAspect {
  public static void sendOffer(final ActivityEdge _self, final ControlToken token) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext
			.getSelf(_self);
	_privk3_sendOffer(_self_, _self, token);
	;
}
  
  public static ControlToken takeOfferedToken(final ActivityEdge _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_takeOfferedToken(_self_, _self);
	;
	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ControlToken) result;
}
  
  public static boolean hasOffer(final ActivityEdge _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_hasOffer(_self_, _self);
	;
	return (boolean) result;
}
  
  @Containment
  public static EList<ControlToken> offeredTokens(final ActivityEdge _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_offeredTokens(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  @Containment
  public static void offeredTokens(final ActivityEdge _self, final EList<ControlToken> offeredTokens) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_offeredTokens(_self_, _self,offeredTokens);;
  }
  
  protected static void _privk3_sendOffer(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final ControlToken token) {
    EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(_self);
    _offeredTokens.add(token);
  }
  
  protected static ControlToken _privk3_takeOfferedToken(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    boolean _hasOffer = ActivityEdgeAspect.hasOffer(_self);
    if (_hasOffer) {
      EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(_self);
      return IterableExtensions.<ControlToken>head(_offeredTokens);
    }
    return null;
  }
  
  protected static boolean _privk3_hasOffer(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    EList<ControlToken> _offeredTokens = ActivityEdgeAspect.offeredTokens(_self);
    boolean _isEmpty = _offeredTokens.isEmpty();
    return (!_isEmpty);
  }
  
  protected static EList<ControlToken> _privk3_offeredTokens(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOfferedTokens") &&
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
    return _self_.offeredTokens;
  }
  
  protected static void _privk3_offeredTokens(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final EList<ControlToken> offeredTokens) {
    _self_.offeredTokens = offeredTokens; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOfferedTokens")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, offeredTokens);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
