package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = IntegerVariable.class)
@SuppressWarnings("all")
public class IntegerVariableAspect extends VariableAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerVariable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static void init(final IntegerVariable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect._privk3_init(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect.init((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static String print(final IntegerVariable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable){
    					result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect._privk3_print(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable){
    					result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect.print((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  private static void super_execute(final IntegerVariable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
  }
  
  private static void super_init(final IntegerVariable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect._privk3_init(_self_, _self);
  }
  
  protected static void _privk3_init(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
    Value _currentValue = VariableAspect.currentValue(_self);
    boolean _equals = Objects.equal(_currentValue, null);
    if (_equals) {
      Value _initialValue = _self.getInitialValue();
      boolean _notEquals = (!Objects.equal(_initialValue, null));
      if (_notEquals) {
        Value _initialValue_1 = _self.getInitialValue();
        VariableAspect.currentValue(_self, _initialValue_1);
      } else {
        final IntegerValue defaultValue = ActivitydiagramFactory.eINSTANCE.createIntegerValue();
        defaultValue.setValue(0);
        VariableAspect.currentValue(_self, defaultValue);
      }
    }
  }
  
  private static String super_print(final IntegerVariable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect._privk3_print(_self_, _self);
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
