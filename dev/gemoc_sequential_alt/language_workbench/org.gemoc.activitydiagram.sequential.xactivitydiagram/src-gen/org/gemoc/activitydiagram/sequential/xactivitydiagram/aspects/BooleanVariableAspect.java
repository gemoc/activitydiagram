package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = BooleanVariable.class)
@OverrideAspectMethod
@SuppressWarnings("all")
public class BooleanVariableAspect extends VariableAspect {
  @OverrideAspectMethod
  public static void init(final BooleanVariable _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectContext
			.getSelf(_self);
	_privk3_init(_self_, _self);
	;
}
  
  public static boolean currentValue(final BooleanVariable _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentValue(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void currentValue(final BooleanVariable _self, final boolean currentValue) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectContext
			.getSelf(_self);
	_privk3_currentValue(_self_, _self, currentValue);
	;
}
  
  private static void super_init(final BooleanVariable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect._privk3_init(_self_, _self);
  }
  
  protected static void _privk3_init(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    boolean _isInitialValue = _self.isInitialValue();
    BooleanVariableAspect.currentValue(_self, _isInitialValue);
  }
  
  protected static boolean _privk3_currentValue(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentValue") &&
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
    return _self_.currentValue;
  }
  
  protected static void _privk3_currentValue(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self, final boolean currentValue) {
    _self_.currentValue = currentValue; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentValue);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
