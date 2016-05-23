package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanVariable;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Value;
import com.google.common.base.Objects;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Context;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = BooleanVariable.class)
@OverrideAspectMethod
@SuppressWarnings("all")
public class BooleanVariableAspect extends VariableAspect {
  public static void execute(final BooleanVariable _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanVariable){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspect._privk3_execute(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanVariable)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static void init(final BooleanVariable _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanVariable){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspect._privk3_init(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanVariable)_self,c);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect.init((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static String print(final BooleanVariable _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanVariable){
    					result = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.BooleanVariableAspect._privk3_print(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanVariable)_self);
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable){
    					result = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect.print((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static void _privk3_execute(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self, final Context c) {
  }
  
  private static void super_init(final BooleanVariable _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect._privk3_init(_self_, _self,c);
  }
  
  protected static void _privk3_init(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self, final Context c) {
    Value _currentValue = _self.getCurrentValue();
    boolean _equals = Objects.equal(_currentValue, null);
    if (_equals) {
      Value _initialValue = _self.getInitialValue();
      boolean _notEquals = (!Objects.equal(_initialValue, null));
      if (_notEquals) {
        Value _initialValue_1 = _self.getInitialValue();
        _self.setCurrentValue(_initialValue_1);
      } else {
        final BooleanValue defaultValue = ActivitydiagramFactory.eINSTANCE.createBooleanValue();
        defaultValue.setValue(false);
        _self.setCurrentValue(defaultValue);
      }
    }
  }
  
  private static String super_print(final BooleanVariable _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    return  org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect._privk3_print(_self_, _self);
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
