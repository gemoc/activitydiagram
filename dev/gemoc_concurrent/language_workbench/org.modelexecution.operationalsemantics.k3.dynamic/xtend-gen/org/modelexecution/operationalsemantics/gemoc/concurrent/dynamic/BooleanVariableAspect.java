package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanVariableAspectBooleanVariableAspectProperties;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspect;

@Aspect(className = BooleanVariable.class)
@OverrideAspectMethod
@SuppressWarnings("all")
public class BooleanVariableAspect extends VariableAspect {
  public static void execute(final BooleanVariable _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanVariableAspectBooleanVariableAspectContext.getSelf(_self);
     if (_self instanceof activitydiagram.BooleanVariable){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanVariableAspect._privk3_execute(_self_, (activitydiagram.BooleanVariable)_self);
    } else  if (_self instanceof activitydiagram.Variable){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspect.execute((activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static String print(final BooleanVariable _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanVariableAspectBooleanVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof activitydiagram.BooleanVariable){
    result = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanVariableAspect._privk3_print(_self_, (activitydiagram.BooleanVariable)_self);
    } else  if (_self instanceof activitydiagram.Variable){
    result = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspect.print((activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static void _privk3_execute(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
  }
  
  private static String super_print(final BooleanVariable _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspectVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspectVariableAspectContext.getSelf(_self);
    return  org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspect._privk3_print(_self_, _self);
  }
  
  protected static String _privk3_print(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    StringBuffer text = new StringBuffer();
    String _name = _self.getName();
    text.append(_name);
    text.append(" = ");
    Value _currentValue = _self.getCurrentValue();
    boolean _isValue = ((BooleanValue) _currentValue).isValue();
    text.append(_isValue);
    return text.toString();
  }
}
