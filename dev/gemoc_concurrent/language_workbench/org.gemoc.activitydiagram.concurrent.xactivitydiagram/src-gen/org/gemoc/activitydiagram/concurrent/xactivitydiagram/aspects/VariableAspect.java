package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Value;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectProperties;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public class VariableAspect {
  public static void execute(final Variable _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanVariable){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanVariableAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerVariable){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerVariableAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void init(final Variable _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    _privk3_init(_self_, _self);;
  }
  
  public static String print(final Variable _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanVariable){
    					result = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanVariableAspect.print((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerVariable){
    					result = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerVariableAspect.print((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable){
    					result = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect._privk3_print(_self_, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  public static Value currentValue(final Variable _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentValue(_self_, _self);;
    return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Value)result;
  }
  
  public static void currentValue(final Variable _self, final Value currentValue) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    _privk3_currentValue(_self_, _self,currentValue);;
  }
  
  protected static void _privk3_execute(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
  }
  
  protected static void _privk3_init(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
    Value _initialValue = _self.getInitialValue();
    boolean _notEquals = (!Objects.equal(_initialValue, null));
    if (_notEquals) {
      Value _initialValue_1 = _self.getInitialValue();
      VariableAspect.currentValue(_self, _initialValue_1);
    }
  }
  
  protected static String _privk3_print(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
    return null;
  }
  
  protected static Value _privk3_currentValue(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Value) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentValue;
  }
  
  protected static void _privk3_currentValue(final VariableAspectVariableAspectProperties _self_, final Variable _self, final Value currentValue) {
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
