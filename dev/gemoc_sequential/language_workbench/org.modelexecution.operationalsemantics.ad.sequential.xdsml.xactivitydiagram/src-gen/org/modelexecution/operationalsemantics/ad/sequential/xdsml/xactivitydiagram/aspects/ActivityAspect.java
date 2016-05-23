package org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects;

import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Activity;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivityNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.BooleanValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.InitialNode;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.InputValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.IntegerValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Trace;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Value;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable;
import com.google.common.base.Objects;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Context;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityNodeAspect;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspect;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = Activity.class)
@SuppressWarnings("all")
public class ActivityAspect extends NamedElementAspect {
  @InitializeModel
  public static void initializeModel(final Activity _self, final EList<String> args) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_initializeModel(_self_, _self,args);;
  }
  
  @Main
  public static void main(final Activity _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_main(_self_, _self);;
  }
  
  @Step
  public static void initializeContext(final Activity _self, final EList<InputValue> value, final Context context) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initializeContext(_self_, _self,value,context);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Activity","initializeContext");
    } else {
    	command.execute();
    }
    ;;
  }
  
  @OverrideAspectMethod
  @Step
  public static void execute(final Activity _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Activity){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspect._privk3_execute(_self_, (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Activity)_self,c);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"Activity","execute");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.NamedElement){
    					org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspect.execute((org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.NamedElement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @Step
  public static void reset(final Activity _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_reset(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Activity","reset");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static void writeToFile(final Activity _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_writeToFile(_self_, _self);;
  }
  
  public static String printTrace(final Activity _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_printTrace(_self_, _self);;
    return (java.lang.String)result;
  }
  
  public static int getIntegerVariableValue(final Activity _self, final String variableName) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getIntegerVariableValue(_self_, _self,variableName);;
    return (int)result;
  }
  
  public static boolean getBooleanVariableValue(final Activity _self, final String variableName) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getBooleanVariableValue(_self_, _self,variableName);;
    return (boolean)result;
  }
  
  public static Value getVariableValue(final Activity _self, final String variableName) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getVariableValue(_self_, _self,variableName);;
    return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Value)result;
  }
  
  public static Variable getVariable(final Activity _self, final String variableName) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getVariable(_self_, _self,variableName);;
    return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Variable)result;
  }
  
  @Step
  public static void writeTrace(final Activity _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_writeTrace(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Activity","writeTrace");
    } else {
    	command.execute();
    }
    ;;
  }
  
  private static Context context(final Activity _self) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_context(_self_, _self);;
    return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Context)result;
  }
  
  protected static void _privk3_initializeModel(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final EList<String> args) {
    final BasicEList<InputValue> inputValues = new BasicEList<InputValue>();
    Resource _eResource = _self.eResource();
    final ResourceSet resSet = _eResource.getResourceSet();
    Context _context = ActivityAspect.context(_self);
    ActivityAspect.initializeContext(_self, inputValues, _context);
    InputOutput.<String>println("context initialized ");
  }
  
  protected static void _privk3_main(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    final long start = System.nanoTime();
    Context _context = ActivityAspect.context(_self);
    ActivityAspect.execute(_self, _context);
    final long stop = System.nanoTime();
    InputOutput.<String>println(("time to execute " + Long.valueOf((stop - start))));
    String _printTrace = ActivityAspect.printTrace(_self);
    InputOutput.<String>println(_printTrace);
  }
  
  protected static void _privk3_initializeContext(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final EList<InputValue> value, final Context context) {
    EList<InputValue> _inputValues = context.getInputValues();
    _inputValues.addAll(value);
    context.setActivity(_self);
    Trace _createTrace = ActivitydiagramFactory.eINSTANCE.createTrace();
    _self.setTrace(_createTrace);
    Trace _trace = _self.getTrace();
    context.setOutput(_trace);
    if (value!=null) {
      final Consumer<InputValue> _function = (InputValue v) -> {
        Variable _variable = v.getVariable();
        Value _value = v.getValue();
        _variable.setCurrentValue(_value);
      };
      value.forEach(_function);
    }
    EList<ActivityNode> _nodes = _self.getNodes();
    final Consumer<ActivityNode> _function_1 = (ActivityNode n) -> {
      n.setRunning(true);
    };
    _nodes.forEach(_function_1);
  }
  
  private static void super_execute(final Activity _self, final Context c) {
    final org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectProperties _self_ = org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspectNamedElementAspectContext.getSelf(_self);
     org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.aspects.NamedElementAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final Context c) {
    EList<Variable> _locals = _self.getLocals();
    final Consumer<Variable> _function = (Variable v) -> {
      VariableAspect.init(v, c);
    };
    _locals.forEach(_function);
    EList<Variable> _inputs = _self.getInputs();
    final Consumer<Variable> _function_1 = (Variable v) -> {
      VariableAspect.init(v, c);
    };
    _inputs.forEach(_function_1);
    EList<ActivityNode> _nodes = _self.getNodes();
    final Function1<ActivityNode, Boolean> _function_2 = (ActivityNode node) -> {
      return Boolean.valueOf((node instanceof InitialNode));
    };
    Iterable<ActivityNode> _filter = IterableExtensions.<ActivityNode>filter(_nodes, _function_2);
    ActivityNode _get = ((ActivityNode[])Conversions.unwrapArray(_filter, ActivityNode.class))[0];
    ActivityNodeAspect.execute(_get, c);
    EList<ActivityNode> _nodes_1 = _self.getNodes();
    final Function1<ActivityNode, Boolean> _function_3 = (ActivityNode node) -> {
      return Boolean.valueOf(ActivityNodeAspect.hasOffers1(node));
    };
    Iterable<ActivityNode> list = IterableExtensions.<ActivityNode>filter(_nodes_1, _function_3);
    while (((!Objects.equal(list, null)) && (IterableExtensions.size(list) > 0))) {
      {
        final Iterable<ActivityNode> _converted_list = (Iterable<ActivityNode>)list;
        ActivityNode _get_1 = ((ActivityNode[])Conversions.unwrapArray(_converted_list, ActivityNode.class))[0];
        ActivityNodeAspect.execute(_get_1, c);
        EList<ActivityNode> _nodes_2 = _self.getNodes();
        final Function1<ActivityNode, Boolean> _function_4 = (ActivityNode node) -> {
          return Boolean.valueOf(ActivityNodeAspect.hasOffers1(node));
        };
        Iterable<ActivityNode> _filter_1 = IterableExtensions.<ActivityNode>filter(_nodes_2, _function_4);
        list = _filter_1;
      }
    }
  }
  
  protected static void _privk3_reset(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    _self.setTrace(null);
  }
  
  protected static void _privk3_writeToFile(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    String text = ActivityAspect.printTrace(_self);
    try {
      String _name = _self.getName();
      String _plus = ("trace/" + _name);
      String _plus_1 = (_plus + ".txt");
      File _file = new File(_plus_1);
      FileOutputStream _fileOutputStream = new FileOutputStream(_file);
      OutputStreamWriter _outputStreamWriter = new OutputStreamWriter(_fileOutputStream);
      BufferedWriter writer = new BufferedWriter(_outputStreamWriter);
      writer.write(text);
      writer.close();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected static String _privk3_printTrace(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    final StringBuffer text = new StringBuffer();
    Trace _trace = _self.getTrace();
    EList<ActivityNode> _executedNodes = _trace.getExecutedNodes();
    final Consumer<ActivityNode> _function = (ActivityNode n) -> {
      String _name = n.getName();
      text.append(_name);
      String _property = System.getProperty("line.separator");
      text.append(_property);
    };
    _executedNodes.forEach(_function);
    EList<Variable> _locals = _self.getLocals();
    final Consumer<Variable> _function_1 = (Variable v) -> {
      String _print = VariableAspect.print(v);
      text.append(_print);
      String _property = System.getProperty("line.separator");
      text.append(_property);
    };
    _locals.forEach(_function_1);
    return text.toString();
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
    Value currentValue = variable.getCurrentValue();
    return currentValue;
  }
  
  protected static Variable _privk3_getVariable(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final String variableName) {
    ArrayList<Variable> allVariables = new ArrayList<Variable>();
    EList<Variable> _locals = _self.getLocals();
    allVariables.addAll(_locals);
    EList<Variable> _inputs = _self.getInputs();
    allVariables.addAll(_inputs);
    for (final Variable var1 : allVariables) {
      String _name = var1.getName();
      boolean _equals = _name.equals(variableName);
      if (_equals) {
        return var1;
      }
    }
    return null;
  }
  
  protected static void _privk3_writeTrace(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    ActivityAspect.writeToFile(_self);
    ActivityAspect.reset(_self);
  }
  
  protected static Context _privk3_context(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getContext") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.modelexecution.operationalsemantics.ad.sequential.xdsml.xactivitydiagram.activitydiagram.Context) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.context;
  }
}
