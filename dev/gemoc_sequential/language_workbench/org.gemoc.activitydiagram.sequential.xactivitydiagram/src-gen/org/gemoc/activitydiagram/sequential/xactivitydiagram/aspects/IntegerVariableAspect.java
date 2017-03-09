package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.DynamicIntegerValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.StaticIntegerValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.DynamicIntegerValueAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = IntegerVariable.class)
@SuppressWarnings("all")
public class IntegerVariableAspect extends VariableAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerVariable _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  @OverrideAspectMethod
  public static void init(final IntegerVariable _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext
			.getSelf(_self);
	_privk3_init(_self_, _self);
	;
}
  
  @OverrideAspectMethod
  public static String print(final IntegerVariable _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspectIntegerVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_print(_self_, _self);
	;
	return (java.lang.String) result;
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
    Value _initialValue = _self.getInitialValue();
    boolean _notEquals = (!Objects.equal(_initialValue, null));
    if (_notEquals) {
      Value _currentValue = _self.getCurrentValue();
      Value _initialValue_1 = _self.getInitialValue();
      int _value = ((StaticIntegerValue) _initialValue_1).getValue();
      DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue), _value);
    } else {
      Value _currentValue_1 = _self.getCurrentValue();
      DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue_1), 0);
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
    Value _currentValue = _self.getCurrentValue();
    int _value = DynamicIntegerValueAspect.value(((DynamicIntegerValue) _currentValue));
    text.append(_value);
    return text.toString();
  }
}
