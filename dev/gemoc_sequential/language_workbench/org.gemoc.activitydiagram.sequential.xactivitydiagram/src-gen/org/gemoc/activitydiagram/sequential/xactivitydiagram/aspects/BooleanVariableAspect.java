package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicBooleanValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.StaticBooleanValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicBooleanValueAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicIntegerValueAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = BooleanVariable.class)
@OverrideAspectMethod
@SuppressWarnings("all")
public class BooleanVariableAspect extends VariableAspect {
  public static void execute(final BooleanVariable _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  @OverrideAspectMethod
  public static void init(final BooleanVariable _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectContext
			.getSelf(_self);
	_privk3_init(_self_, _self);
	;
}
  
  @OverrideAspectMethod
  public static String print(final BooleanVariable _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspectBooleanVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  protected static void _privk3_execute(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
  }
  
  private static void super_init(final BooleanVariable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect._privk3_init(_self_, _self);
  }
  
  protected static void _privk3_init(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    Value _initialValue = _self.getInitialValue();
    boolean _notEquals = (!Objects.equal(_initialValue, null));
    if (_notEquals) {
      Value _currentValue = _self.getCurrentValue();
      Value _initialValue_1 = _self.getInitialValue();
      boolean _isValue = ((StaticBooleanValue) _initialValue_1).isValue();
      DynamicBooleanValueAspect.value(((DynamicBooleanValue) _currentValue), _isValue);
    } else {
      Value _currentValue_1 = _self.getCurrentValue();
      DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_1), 0);
    }
  }
  
  private static String super_print(final BooleanVariable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    return  org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect._privk3_print(_self_, _self);
  }
  
  protected static String _privk3_print(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    StringBuffer text = new StringBuffer();
    String _name = _self.getName();
    text.append(_name);
    text.append(" = ");
    Value _currentValue = _self.getCurrentValue();
    boolean _value = DynamicBooleanValueAspect.value(((DynamicBooleanValue) _currentValue));
    text.append(_value);
    return text.toString();
  }
}
