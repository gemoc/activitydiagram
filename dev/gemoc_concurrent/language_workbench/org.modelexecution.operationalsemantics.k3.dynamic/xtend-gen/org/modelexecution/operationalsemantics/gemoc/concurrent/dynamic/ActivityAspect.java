package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.Activity;
import activitydiagram.ActivityNode;
import activitydiagram.BooleanValue;
import activitydiagram.Input;
import activitydiagram.InputValue;
import activitydiagram.IntegerValue;
import activitydiagram.Value;
import activitydiagram.Variable;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.Context;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.NamedElementAspect;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.RuntimeTrace;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.Util;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.VariableAspect;

@Aspect(className = Activity.class)
@SuppressWarnings("all")
public class ActivityAspect extends NamedElementAspect {
  @ReplaceAspectMethod
  public static void initialize(final Activity _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self);
  }
  
  public static void execute(final Activity _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_execute(_self_, _self);
  }
  
  public static void reset(final Activity _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_reset(_self_, _self);
  }
  
  public static void writeToFile(final Activity _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_writeToFile(_self_, _self);
  }
  
  public static String printTrace(final Activity _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_printTrace(_self_, _self);
    return (java.lang.String)result;
  }
  
  public static int getIntegerVariableValue(final Activity _self, final String variableName) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getIntegerVariableValue(_self_, _self,variableName);
    return (int)result;
  }
  
  public static boolean getBooleanVariableValue(final Activity _self, final String variableName) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getBooleanVariableValue(_self_, _self,variableName);
    return (boolean)result;
  }
  
  public static Value getVariableValue(final Activity _self, final String variableName) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getVariableValue(_self_, _self,variableName);
    return (activitydiagram.Value)result;
  }
  
  public static Variable getVariable(final Activity _self, final String variableName) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getVariable(_self_, _self,variableName);
    return (activitydiagram.Variable)result;
  }
  
  public static void finish(final Activity _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_finish(_self_, _self);
  }
  
  private static RuntimeTrace runtimeTrace(final Activity _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_runtimeTrace(_self_, _self);
    return (org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.RuntimeTrace)result;
  }
  
  private static void runtimeTrace(final Activity _self, final RuntimeTrace runtimeTrace) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_runtimeTrace(_self_, _self,runtimeTrace);
  }
  
  public static Context context(final Activity _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_context(_self_, _self);
    return (org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.Context)result;
  }
  
  public static void context(final Activity _self, final Context context) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_context(_self_, _self,context);
  }
  
  private static long start(final Activity _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_start(_self_, _self);
    return (long)result;
  }
  
  private static void start(final Activity _self, final long start) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_start(_self_, _self,start);
  }
  
  private static long stop(final Activity _self) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_stop(_self_, _self);
    return (long)result;
  }
  
  private static void stop(final Activity _self, final long stop) {
    org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_stop(_self_, _self,stop);
  }
  
  protected static void _privk3_initialize(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    InputOutput.<String>println("############## let\'s start ! ##############");
    List<InputValue> inputValues = new ArrayList<InputValue>();
    String inputPath = _self.getInputValuePath();
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(inputPath, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(inputPath, ""));
      _and = _notEquals_1;
    }
    if (_and) {
      Input input = Util.getInput(inputPath);
      boolean _notEquals_2 = (!Objects.equal(input, null));
      if (_notEquals_2) {
        EList<InputValue> _inputValues = input.getInputValues();
        inputValues.addAll(_inputValues);
        if (inputValues!=null) {
          final Consumer<InputValue> _function = new Consumer<InputValue>() {
            public void accept(final InputValue v) {
              final Variable theV = v.getVariable();
              EList<Variable> _inputs = _self.getInputs();
              final Consumer<Variable> _function = new Consumer<Variable>() {
                public void accept(final Variable i) {
                  String _name = i.getName();
                  String _name_1 = theV.getName();
                  boolean _equals = Objects.equal(_name, _name_1);
                  if (_equals) {
                    Value _value = v.getValue();
                    i.setCurrentValue(_value);
                    Value _value_1 = v.getValue();
                    i.setInitialValue(_value_1);
                  }
                }
              };
              _inputs.forEach(_function);
            }
          };
          inputValues.forEach(_function);
        }
      }
    }
    long _nanoTime = System.nanoTime();
    ActivityAspect.start(_self, _nanoTime);
    Context _context = new Context();
    ActivityAspect.context(_self, _context);
    Context _context_1 = ActivityAspect.context(_self);
    _context_1.inputValues = inputValues;
    Context _context_2 = ActivityAspect.context(_self);
    _context_2.activity = _self;
    RuntimeTrace _runtimeTrace = new RuntimeTrace();
    ActivityAspect.runtimeTrace(_self, _runtimeTrace);
    Context _context_3 = ActivityAspect.context(_self);
    RuntimeTrace _runtimeTrace_1 = ActivityAspect.runtimeTrace(_self);
    _context_3.output = _runtimeTrace_1;
    EList<ActivityNode> _nodes = _self.getNodes();
    final Consumer<ActivityNode> _function_1 = new Consumer<ActivityNode>() {
      public void accept(final ActivityNode n) {
        n.setRunning(true);
      }
    };
    _nodes.forEach(_function_1);
    EList<Variable> _locals = _self.getLocals();
    final Consumer<Variable> _function_2 = new Consumer<Variable>() {
      public void accept(final Variable v) {
        VariableAspect.init(v);
      }
    };
    _locals.forEach(_function_2);
  }
  
  protected static void _privk3_execute(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
  }
  
  protected static void _privk3_reset(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    ActivityAspect.runtimeTrace(_self, null);
  }
  
  protected static void _privk3_writeToFile(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    String text = ActivityAspect.printTrace(_self);
    try {
      String _name = _self.getName();
      String _plus = (_name + ".txt");
      File _file = new File(_plus);
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
    RuntimeTrace _runtimeTrace = ActivityAspect.runtimeTrace(_self);
    final Consumer<ActivityNode> _function = new Consumer<ActivityNode>() {
      public void accept(final ActivityNode n) {
        String _name = n.getName();
        text.append(_name);
        text.append(Util.LINE_BREAK);
      }
    };
    _runtimeTrace.executedNodes.forEach(_function);
    EList<Variable> _locals = _self.getLocals();
    final Consumer<Variable> _function_1 = new Consumer<Variable>() {
      public void accept(final Variable v) {
        String _print = VariableAspect.print(v);
        text.append(_print);
        text.append(Util.LINE_BREAK);
      }
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
  
  protected static void _privk3_finish(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    long _nanoTime = System.nanoTime();
    ActivityAspect.stop(_self, _nanoTime);
    InputOutput.<String>println("##############  finished ! ############## ");
    long _stop = ActivityAspect.stop(_self);
    long _start = ActivityAspect.start(_self);
    long _minus = (_stop - _start);
    String _plus = ("time to execute " + Long.valueOf(_minus));
    InputOutput.<String>println(_plus);
    String _printTrace = ActivityAspect.printTrace(_self);
    InputOutput.<String>println(_printTrace);
    ActivityAspect.writeToFile(_self);
    ActivityAspect.reset(_self);
  }
  
  protected static RuntimeTrace _privk3_runtimeTrace(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
     return _self_.runtimeTrace; 
  }
  
  protected static void _privk3_runtimeTrace(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final RuntimeTrace runtimeTrace) {
    _self_.runtimeTrace = runtimeTrace; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "RuntimeTrace")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, runtimeTrace);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
  
  protected static Context _privk3_context(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
     return _self_.context; 
  }
  
  protected static void _privk3_context(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final Context context) {
    _self_.context = context; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "Context")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, context);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
  
  protected static long _privk3_start(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
     return _self_.start; 
  }
  
  protected static void _privk3_start(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final long start) {
    _self_.start = start; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "Start")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, start);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
  
  protected static long _privk3_stop(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
     return _self_.stop; 
  }
  
  protected static void _privk3_stop(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final long stop) {
    _self_.stop = stop; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "Stop")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, stop);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
}
