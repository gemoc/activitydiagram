package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanValue;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = BooleanVariable.class)
@OverrideAspectMethod
@SuppressWarnings("all")
public class BooleanVariableAspect extends VariableAspect {
  public static void execute(final BooleanVariable _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanVariable){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanVariableAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable){
    					org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect.execute((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static String print(final BooleanVariable _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanVariable){
    					result = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.BooleanVariableAspect._privk3_print(_self_, (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable){
    					result = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect.print((org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static void _privk3_execute(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
  }
  
  private static String super_print(final BooleanVariable _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect._privk3_print(_self_, _self);
  }
  
  protected static String _privk3_print(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    StringBuffer text = new StringBuffer();
    String _name = _self.getName();
    text.append(_name);
    text.append(" = ");
    Value _currentValue = VariableAspect.currentValue(_self);
    boolean _isValue = ((BooleanValue) _currentValue).isValue();
    text.append(_isValue);
    return text.toString();
  }
}
