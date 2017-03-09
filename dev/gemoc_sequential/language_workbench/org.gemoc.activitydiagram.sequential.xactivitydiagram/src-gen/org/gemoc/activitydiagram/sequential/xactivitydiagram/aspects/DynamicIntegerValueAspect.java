package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicIntegerValueAspectDynamicIntegerValueAspectProperties;

@Aspect(className = DynamicIntegerValue.class)
@OverrideAspectMethod
@SuppressWarnings("all")
public class DynamicIntegerValueAspect {
  public static int value(final DynamicIntegerValue _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicIntegerValueAspectDynamicIntegerValueAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicIntegerValueAspectDynamicIntegerValueAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_value(_self_, _self);
	;
	return (int) result;
}
  
  public static void value(final DynamicIntegerValue _self, final int value) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicIntegerValueAspectDynamicIntegerValueAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicIntegerValueAspectDynamicIntegerValueAspectContext
			.getSelf(_self);
	_privk3_value(_self_, _self, value);
	;
}
  
  protected static int _privk3_value(final DynamicIntegerValueAspectDynamicIntegerValueAspectProperties _self_, final DynamicIntegerValue _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final DynamicIntegerValueAspectDynamicIntegerValueAspectProperties _self_, final DynamicIntegerValue _self, final int value) {
    _self_.value = value; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
