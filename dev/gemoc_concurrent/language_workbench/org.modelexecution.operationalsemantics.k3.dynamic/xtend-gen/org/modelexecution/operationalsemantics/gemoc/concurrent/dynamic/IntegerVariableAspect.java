package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.IntegerValue;
import activitydiagram.IntegerVariable;
import activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerVariableAspectIntegerVariableAspectProperties;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspect;

@Aspect(className = IntegerVariable.class)
@SuppressWarnings("all")
public class IntegerVariableAspect extends VariableAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerVariable _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerVariableAspectIntegerVariableAspectContext.getSelf(_self);
     if (_self instanceof activitydiagram.IntegerVariable){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerVariableAspect._privk3_execute(_self_, (activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof activitydiagram.Variable){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspect.execute((activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static String print(final IntegerVariable _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerVariableAspectIntegerVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof activitydiagram.IntegerVariable){
    result = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerVariableAspect._privk3_print(_self_, (activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof activitydiagram.Variable){
    result = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspect.print((activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  private static void super_execute(final IntegerVariable _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspectVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspectVariableAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
  }
  
  private static String super_print(final IntegerVariable _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspectVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspectVariableAspectContext.getSelf(_self);
    return  org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspect._privk3_print(_self_, _self);
  }
  
  protected static String _privk3_print(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
    StringBuffer text = new StringBuffer();
    String _name = _self.getName();
    text.append(_name);
    text.append(" = ");
    Value _currentValue = _self.getCurrentValue();
    int _value = ((IntegerValue) _currentValue).getValue();
    text.append(_value);
    return text.toString();
  }
}
