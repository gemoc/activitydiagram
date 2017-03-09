package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = IntegerVariable.class)
@SuppressWarnings("all")
public class IntegerVariableAspect extends VariableAspect {
  @OverrideAspectMethod
  public static void init(final IntegerVariable _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext
			.getSelf(_self);
	_privk3_init(_self_, _self);
	;
}
  
  public static int currentValue(final IntegerVariable _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentValue(_self_, _self);
	;
	return (int) result;
}
  
  public static void currentValue(final IntegerVariable _self, final int currentValue) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext
			.getSelf(_self);
	_privk3_currentValue(_self_, _self, currentValue);
	;
}
  
  private static void super_init(final IntegerVariable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect._privk3_init(_self_, _self);
  }
  
  protected static void _privk3_init(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
    int _initialValue = _self.getInitialValue();
    IntegerVariableAspect.currentValue(_self, _initialValue);
  }
  
  protected static int _privk3_currentValue(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentValue") &&
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
    return _self_.currentValue;
  }
  
  protected static void _privk3_currentValue(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self, final int currentValue) {
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
