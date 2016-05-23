package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerVariable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Value;
import com.google.common.base.Objects;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Context;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = IntegerVariable.class)
@SuppressWarnings("all")
public class IntegerVariableAspect extends VariableAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerVariable _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerVariable){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerVariableAspect._privk3_execute(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerVariable)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static void init(final IntegerVariable _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerVariable){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerVariableAspect._privk3_init(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerVariable)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect.init((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static String print(final IntegerVariable _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerVariable){
    					result = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.IntegerVariableAspect._privk3_print(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable){
    					result = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect.print((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  private static void super_execute(final IntegerVariable _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self, final Context c) {
  }
  
  private static void super_init(final IntegerVariable _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect._privk3_init(_self_, _self,c);
  }
  
  protected static void _privk3_init(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self, final Context c) {
    Value _currentValue = _self.getCurrentValue();
    boolean _equals = Objects.equal(_currentValue, null);
    if (_equals) {
      Value _initialValue = _self.getInitialValue();
      boolean _notEquals = (!Objects.equal(_initialValue, null));
      if (_notEquals) {
        Value _initialValue_1 = _self.getInitialValue();
        _self.setCurrentValue(_initialValue_1);
      } else {
        final IntegerValue defaultValue = ActivitydiagramFactory.eINSTANCE.createIntegerValue();
        defaultValue.setValue(0);
        _self.setCurrentValue(defaultValue);
      }
    }
  }
  
  private static String super_print(final IntegerVariable _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    return  org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect._privk3_print(_self_, _self);
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
