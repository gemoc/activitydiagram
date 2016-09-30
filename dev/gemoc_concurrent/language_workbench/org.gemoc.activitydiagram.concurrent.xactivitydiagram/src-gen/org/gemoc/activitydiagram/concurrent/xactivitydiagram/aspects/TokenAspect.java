package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TokenAspectTokenAspectProperties;

@Aspect(className = Token.class)
@SuppressWarnings("all")
public class TokenAspect {
  public static ActivityNode holder(final Token _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TokenAspectTokenAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TokenAspectTokenAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_holder(_self_, _self);;
    return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode)result;
  }
  
  public static void holder(final Token _self, final ActivityNode holder) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TokenAspectTokenAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TokenAspectTokenAspectContext.getSelf(_self);
    _privk3_holder(_self_, _self,holder);;
  }
  
  protected static ActivityNode _privk3_holder(final TokenAspectTokenAspectProperties _self_, final Token _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getHolder") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.holder;
  }
  
  protected static void _privk3_holder(final TokenAspectTokenAspectProperties _self_, final Token _self, final ActivityNode holder) {
    _self_.holder = holder; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setHolder")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, holder);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
