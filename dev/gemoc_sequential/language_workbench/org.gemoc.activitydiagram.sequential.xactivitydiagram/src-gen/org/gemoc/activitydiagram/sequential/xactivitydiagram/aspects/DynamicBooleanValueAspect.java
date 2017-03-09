package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicBooleanValueAspectDynamicBooleanValueAspectProperties;

@Aspect(className = DynamicBooleanValue.class)
@OverrideAspectMethod
@SuppressWarnings("all")
public class DynamicBooleanValueAspect {
  public static boolean value(final DynamicBooleanValue _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicBooleanValueAspectDynamicBooleanValueAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicBooleanValueAspectDynamicBooleanValueAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_value(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void value(final DynamicBooleanValue _self, final boolean value) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicBooleanValueAspectDynamicBooleanValueAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicBooleanValueAspectDynamicBooleanValueAspectContext
			.getSelf(_self);
	_privk3_value(_self_, _self, value);
	;
}
  
  protected static boolean _privk3_value(final DynamicBooleanValueAspectDynamicBooleanValueAspectProperties _self_, final DynamicBooleanValue _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final DynamicBooleanValueAspectDynamicBooleanValueAspectProperties _self_, final DynamicBooleanValue _self, final boolean value) {
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
