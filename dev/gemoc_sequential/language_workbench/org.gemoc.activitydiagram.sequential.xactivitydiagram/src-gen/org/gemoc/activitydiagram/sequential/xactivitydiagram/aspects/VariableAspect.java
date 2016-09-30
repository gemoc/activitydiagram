package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public class VariableAspect {
  @Step
  public static void execute(final Variable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspect.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect.execute((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect._privk3_execute(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"Variable","execute");
    					} else {
    						command.execute();
    					}
    					;
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @Step
  public static void init(final Variable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspect.init((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable){
    					org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect.init((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect._privk3_init(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"Variable","init");
    					} else {
    						command.execute();
    					}
    					;
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static String print(final Variable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable){
    					result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.BooleanVariableAspect.print((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable){
    					result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.IntegerVariableAspect.print((org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerVariable)_self);
    } else  if (_self instanceof org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable){
    					result = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect._privk3_print(_self_, (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  public static Value currentValue(final Variable _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentValue(_self_, _self);;
    return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value)result;
  }
  
  public static void currentValue(final Variable _self, final Value currentValue) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    _privk3_currentValue(_self_, _self,currentValue);;
  }
  
  protected static void _privk3_execute(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
  }
  
  protected static void _privk3_init(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
  }
  
  protected static String _privk3_print(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
    return null;
  }
  
  protected static Value _privk3_currentValue(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentValue;
  }
  
  protected static void _privk3_currentValue(final VariableAspectVariableAspectProperties _self_, final Variable _self, final Value currentValue) {
    _self_.currentValue = currentValue; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentValue);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
