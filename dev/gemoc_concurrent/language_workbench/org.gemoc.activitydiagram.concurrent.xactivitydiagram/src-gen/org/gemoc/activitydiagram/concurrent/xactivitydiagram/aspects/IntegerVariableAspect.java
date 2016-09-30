package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerValue;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = IntegerVariable.class)
@SuppressWarnings("all")
public class IntegerVariableAspect extends VariableAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerVariable _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerVariable){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerVariableAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static String print(final IntegerVariable _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerVariable){
    					result = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.IntegerVariableAspect._privk3_print(_self_, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable){
    					result = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect.print((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  private static void super_execute(final IntegerVariable _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
  }
  
  private static String super_print(final IntegerVariable _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect._privk3_print(_self_, _self);
  }
  
  protected static String _privk3_print(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
    StringBuffer text = new StringBuffer();
    String _name = _self.getName();
    text.append(_name);
    text.append(" = ");
    Value _currentValue = VariableAspect.currentValue(_self);
    int _value = ((IntegerValue) _currentValue).getValue();
    text.append(_value);
    return text.toString();
  }
}
