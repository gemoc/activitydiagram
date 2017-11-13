package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ForkedToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspectForkedTokenAspectProperties;

@Aspect(className = ForkedToken.class)
@SuppressWarnings("all")
public class ForkedTokenAspect {
  public static Token baseToken(final ForkedToken _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspectForkedTokenAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspectForkedTokenAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_baseToken(_self_, _self);
	;
	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) result;
}
  
  public static void baseToken(final ForkedToken _self, final Token baseToken) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspectForkedTokenAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspectForkedTokenAspectContext
			.getSelf(_self);
	_privk3_baseToken(_self_, _self, baseToken);
	;
}
  
  public static int remainingOffersCount(final ForkedToken _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspectForkedTokenAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspectForkedTokenAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_remainingOffersCount(_self_, _self);
	;
	return (int) result;
}
  
  public static void remainingOffersCount(final ForkedToken _self, final int remainingOffersCount) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspectForkedTokenAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ForkedTokenAspectForkedTokenAspectContext
			.getSelf(_self);
	_privk3_remainingOffersCount(_self_, _self, remainingOffersCount);
	;
}
  
  protected static Token _privk3_baseToken(final ForkedTokenAspectForkedTokenAspectProperties _self_, final ForkedToken _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getBaseToken") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Token) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.baseToken;
  }
  
  protected static void _privk3_baseToken(final ForkedTokenAspectForkedTokenAspectProperties _self_, final ForkedToken _self, final Token baseToken) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setBaseToken")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, baseToken);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.baseToken = baseToken;
    }
  }
  
  protected static int _privk3_remainingOffersCount(final ForkedTokenAspectForkedTokenAspectProperties _self_, final ForkedToken _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getRemainingOffersCount") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.remainingOffersCount;
  }
  
  protected static void _privk3_remainingOffersCount(final ForkedTokenAspectForkedTokenAspectProperties _self_, final ForkedToken _self, final int remainingOffersCount) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setRemainingOffersCount")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, remainingOffersCount);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.remainingOffersCount = remainingOffersCount;
    }
  }
}
