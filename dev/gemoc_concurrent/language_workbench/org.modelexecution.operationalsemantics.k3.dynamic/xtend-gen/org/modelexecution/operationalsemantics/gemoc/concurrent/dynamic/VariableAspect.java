package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.Value;
import activitydiagram.Variable;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspectVariableAspectProperties;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public class VariableAspect {
  public static void execute(final Variable _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspectVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspectVariableAspectContext.getSelf(_self);
     if (_self instanceof activitydiagram.BooleanVariable){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanVariableAspect.execute((activitydiagram.BooleanVariable)_self);
    } else  if (_self instanceof activitydiagram.IntegerVariable){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerVariableAspect.execute((activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof activitydiagram.Variable){
     org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspect._privk3_execute(_self_, (activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void init(final Variable _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspectVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspectVariableAspectContext.getSelf(_self);
    _privk3_init(_self_, _self);
  }
  
  public static String print(final Variable _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspectVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspectVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof activitydiagram.BooleanVariable){
    result = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.BooleanVariableAspect.print((activitydiagram.BooleanVariable)_self);
    } else  if (_self instanceof activitydiagram.IntegerVariable){
    result = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.IntegerVariableAspect.print((activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof activitydiagram.Variable){
    result = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspect._privk3_print(_self_, (activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static void _privk3_execute(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
  }
  
  protected static void _privk3_init(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
    Value _initialValue = _self.getInitialValue();
    boolean _notEquals = (!Objects.equal(_initialValue, null));
    if (_notEquals) {
      Value _initialValue_1 = _self.getInitialValue();
      _self.setCurrentValue(_initialValue_1);
    }
  }
  
  protected static String _privk3_print(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
    return null;
  }
}
