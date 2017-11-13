package org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Activity;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.BooleanValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.InitialNode;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.IntegerValue;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable;
import com.google.common.base.Objects;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.melange.annotation.Containment;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.TraceAspect;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = Activity.class)
@SuppressWarnings("all")
public class ActivityAspect extends NamedElementAspect {
  @InitializeModel
  public static void initializeModel(final Activity _self, final EList<String> args) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_initializeModel(_self_, _self,args);;
  }
  
  @Main
  public static void main(final Activity _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  @OverrideAspectMethod
  @Step
  public static void execute(final Activity _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Activity", "execute");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void reset(final Activity _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_reset(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Activity", "reset");
	} else {
		command.execute();
	}
	;
	;
}
  
  public static int getIntegerVariableValue(final Activity _self, final String variableName) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getIntegerVariableValue(_self_, _self, variableName);
	;
	return (int) result;
}
  
  public static boolean getBooleanVariableValue(final Activity _self, final String variableName) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getBooleanVariableValue(_self_, _self, variableName);
	;
	return (boolean) result;
}
  
  public static Value getVariableValue(final Activity _self, final String variableName) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getVariableValue(_self_, _self, variableName);
	;
	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Value) result;
}
  
  public static Variable getVariable(final Activity _self, final String variableName) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getVariable(_self_, _self, variableName);
	;
	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Variable) result;
}
  
  @Containment
  public static Trace trace(final Activity _self) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_trace(_self_, _self);
	;
	return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) result;
}
  
  @Containment
  public static void trace(final Activity _self, final Trace trace) {
	final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.ActivityAspectActivityAspectContext
			.getSelf(_self);
	_privk3_trace(_self_, _self, trace);
	;
}
  
  protected static void _privk3_initializeModel(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final EList<String> args) {
  }
  
  protected static void _privk3_main(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    ActivityAspect.execute(_self);
  }
  
  private static void super_execute(final Activity _self) {
    final org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectProperties _self_ = org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectContext.getSelf(_self);
     org.gemoc.activitydiagram.sequential.xactivitydiagram.aspects.NamedElementAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    final Consumer<Variable> _function = (Variable v) -> {
      VariableAspect.init(v);
    };
    _self.getLocals().forEach(_function);
    final Consumer<Variable> _function_1 = (Variable v) -> {
      VariableAspect.init(v);
    };
    _self.getInputs().forEach(_function_1);
    final Function1<ActivityNode, Boolean> _function_2 = (ActivityNode node) -> {
      return Boolean.valueOf((node instanceof InitialNode));
    };
    ActivityNode toExecute = ((ActivityNode[])Conversions.unwrapArray(IterableExtensions.<ActivityNode>filter(_self.getNodes(), _function_2), ActivityNode.class))[0];
    ActivityAspect.trace(_self, ActivitydiagramFactory.eINSTANCE.createTrace());
    TraceAspect.executedNodes(ActivityAspect.trace(_self)).add(toExecute);
    ActivityNodeAspect.execute(toExecute);
    final Function1<ActivityNode, Boolean> _function_3 = (ActivityNode node) -> {
      return Boolean.valueOf(ActivityNodeAspect.hasOffers(node));
    };
    Iterable<ActivityNode> list = IterableExtensions.<ActivityNode>filter(_self.getNodes(), _function_3);
    while (((!Objects.equal(list, null)) && (IterableExtensions.size(list) > 0))) {
      {
        final Iterable<ActivityNode> _converted_list = (Iterable<ActivityNode>)list;
        toExecute = ((ActivityNode[])Conversions.unwrapArray(_converted_list, ActivityNode.class))[0];
        TraceAspect.executedNodes(ActivityAspect.trace(_self)).add(toExecute);
        ActivityNodeAspect.execute(toExecute);
        final Function1<ActivityNode, Boolean> _function_4 = (ActivityNode node) -> {
          return Boolean.valueOf(ActivityNodeAspect.hasOffers(node));
        };
        list = IterableExtensions.<ActivityNode>filter(_self.getNodes(), _function_4);
      }
    }
  }
  
  protected static void _privk3_reset(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    ActivityAspect.trace(_self, null);
  }
  
  protected static int _privk3_getIntegerVariableValue(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final String variableName) {
    Value currentValue = ActivityAspect.getVariableValue(_self, variableName);
    if ((currentValue instanceof IntegerValue)) {
      IntegerValue integerValue = ((IntegerValue) currentValue);
      return integerValue.getValue();
    }
    return (-1);
  }
  
  protected static boolean _privk3_getBooleanVariableValue(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final String variableName) {
    Value currentValue = ActivityAspect.getVariableValue(_self, variableName);
    if ((currentValue instanceof BooleanValue)) {
      BooleanValue booleanValue = ((BooleanValue) currentValue);
      return booleanValue.isValue();
    }
    return false;
  }
  
  protected static Value _privk3_getVariableValue(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final String variableName) {
    Variable variable = ActivityAspect.getVariable(_self, variableName);
    Value currentValue = VariableAspect.currentValue(variable);
    return currentValue;
  }
  
  protected static Variable _privk3_getVariable(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final String variableName) {
    BasicEList<Variable> allVariables = new BasicEList<Variable>();
    allVariables.addAll(_self.getLocals());
    allVariables.addAll(_self.getInputs());
    for (final Variable var1 : allVariables) {
      boolean _equals = var1.getName().equals(variableName);
      if (_equals) {
        return var1;
      }
    }
    return null;
  }
  
  protected static Trace _privk3_trace(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTrace") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.sequential.xactivitydiagram.activitydiagram.Trace) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.trace;
  }
  
  protected static void _privk3_trace(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final Trace trace) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTrace")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, trace);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.trace = trace;
    }
  }
}
