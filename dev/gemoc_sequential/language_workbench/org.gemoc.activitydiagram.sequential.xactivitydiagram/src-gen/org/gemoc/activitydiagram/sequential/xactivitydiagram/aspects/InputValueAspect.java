package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InputValue;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.melange.annotation.Containment;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspectInputValueAspectProperties;

@Aspect(className = InputValue.class)
@SuppressWarnings("all")
public class InputValueAspect {
  public static Variable variable(final InputValue _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspectInputValueAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspectInputValueAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_variable(_self_, _self);
	;
	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) result;
}
  
  public static void variable(final InputValue _self, final Variable variable) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspectInputValueAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspectInputValueAspectContext
			.getSelf(_self);
	_privk3_variable(_self_, _self, variable);
	;
}
  
  @Containment
  public static Value value(final InputValue _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspectInputValueAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspectInputValueAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_value(_self_, _self);
	;
	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) result;
}
  
  @Containment
  public static void value(final InputValue _self, final Value value) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspectInputValueAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.InputValueAspectInputValueAspectContext
			.getSelf(_self);
	_privk3_value(_self_, _self, value);
	;
}
  
  protected static Variable _privk3_variable(final InputValueAspectInputValueAspectProperties _self_, final InputValue _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getVariable") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.variable;
  }
  
  protected static void _privk3_variable(final InputValueAspectInputValueAspectProperties _self_, final InputValue _self, final Variable variable) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setVariable")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, variable);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.variable = variable;
    }
  }
  
  protected static Value _privk3_value(final InputValueAspectInputValueAspectProperties _self_, final InputValue _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final InputValueAspectInputValueAspectProperties _self_, final InputValue _self, final Value value) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.value = value;
    }
  }
}
