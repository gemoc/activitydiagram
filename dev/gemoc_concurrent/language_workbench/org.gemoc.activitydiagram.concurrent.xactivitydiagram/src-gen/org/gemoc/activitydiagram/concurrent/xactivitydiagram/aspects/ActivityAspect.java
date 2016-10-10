package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Activity;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivityNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.BooleanValue;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Input;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.InputValue;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.IntegerValue;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Value;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable;
import com.google.common.base.Objects;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.ActivitydiagramFactory;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Trace;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityNodeAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ContextAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.NamedElementAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.TraceAspect;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.VariableAspect;

@Aspect(className = Activity.class)
@SuppressWarnings("all")
public class ActivityAspect extends NamedElementAspect {
  @InitializeModel
  public static void initializeModel(final Activity _self, final EList<String> args) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_initializeModel(_self_, _self,args);;
  }
  
  @ReplaceAspectMethod
  public static void initialize(final Activity _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_initialize(_self_, _self);;
  }
  
  @ReplaceAspectMethod
  public static void execute(final Activity _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_execute(_self_, _self);;
  }
  
  @ReplaceAspectMethod
  public static void reset(final Activity _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_reset(_self_, _self);;
  }
  
  private static void writeToFile(final Activity _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_writeToFile(_self_, _self);;
  }
  
  private static String printTrace(final Activity _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_printTrace(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static Input getInput(final Activity _self, final String inputPath) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getInput(_self_, _self,inputPath);;
    return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Input)result;
  }
  
  public static int getIntegerVariableValue(final Activity _self, final String variableName) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getIntegerVariableValue(_self_, _self,variableName);;
    return (int)result;
  }
  
  public static boolean getBooleanVariableValue(final Activity _self, final String variableName) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getBooleanVariableValue(_self_, _self,variableName);;
    return (boolean)result;
  }
  
  public static Value getVariableValue(final Activity _self, final String variableName) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getVariableValue(_self_, _self,variableName);;
    return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Value)result;
  }
  
  public static Variable getVariable(final Activity _self, final String variableName) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getVariable(_self_, _self,variableName);;
    return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Variable)result;
  }
  
  public static void finish(final Activity _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_finish(_self_, _self);;
  }
  
  public static Trace trace(final Activity _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_trace(_self_, _self);;
    return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Trace)result;
  }
  
  public static void trace(final Activity _self, final Trace trace) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_trace(_self_, _self,trace);;
  }
  
  public static Context context(final Activity _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_context(_self_, _self);;
    return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context)result;
  }
  
  public static void context(final Activity _self, final Context context) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_context(_self_, _self,context);;
  }
  
  private static long start(final Activity _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_start(_self_, _self);;
    return (long)result;
  }
  
  private static void start(final Activity _self, final long start) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_start(_self_, _self,start);;
  }
  
  private static long stop(final Activity _self) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_stop(_self_, _self);;
    return (long)result;
  }
  
  private static void stop(final Activity _self, final long stop) {
    final org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectProperties _self_ = org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_stop(_self_, _self,stop);;
  }
  
  protected static void _privk3_initializeModel(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final EList<String> args) {
    EList<InputValue> inputValues = new BasicEList<InputValue>();
    int _size = args.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      String inputPath = args.get(0);
      Input input = ActivityAspect.getInput(_self, inputPath);
      boolean _notEquals = (!Objects.equal(input, null));
      if (_notEquals) {
        EList<InputValue> _inputValues = input.getInputValues();
        inputValues.addAll(_inputValues);
        if (inputValues!=null) {
          final Consumer<InputValue> _function = new Consumer<InputValue>() {
            @Override
            public void accept(final InputValue v) {
              final Variable theV = v.getVariable();
              EList<Variable> _inputs = _self.getInputs();
              final Consumer<Variable> _function = new Consumer<Variable>() {
                @Override
                public void accept(final Variable i) {
                  String _name = i.getName();
                  String _name_1 = theV.getName();
                  boolean _equals = Objects.equal(_name, _name_1);
                  if (_equals) {
                    Value _value = v.getValue();
                    VariableAspect.currentValue(i, _value);
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
  }
  
  protected static void _privk3_initialize(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    InputOutput.<String>println("############## let\'s start ! ##############");
    long _nanoTime = System.nanoTime();
    ActivityAspect.start(_self, _nanoTime);
    Context _createContext = ActivitydiagramFactory.eINSTANCE.createContext();
    ActivityAspect.context(_self, _createContext);
    Context _context = ActivityAspect.context(_self);
    ContextAspect.activity(_context, _self);
    Trace _createTrace = ActivitydiagramFactory.eINSTANCE.createTrace();
    ActivityAspect.trace(_self, _createTrace);
    Context _context_1 = ActivityAspect.context(_self);
    Trace _trace = ActivityAspect.trace(_self);
    ContextAspect.output(_context_1, _trace);
    EList<ActivityNode> _nodes = _self.getNodes();
    final Consumer<ActivityNode> _function = new Consumer<ActivityNode>() {
      @Override
      public void accept(final ActivityNode n) {
        ActivityNodeAspect.running(n, Boolean.valueOf(true));
      }
    };
    _nodes.forEach(_function);
    EList<Variable> _locals = _self.getLocals();
    final Consumer<Variable> _function_1 = new Consumer<Variable>() {
      @Override
      public void accept(final Variable v) {
        VariableAspect.init(v);
      }
    };
    _locals.forEach(_function_1);
  }
  
  protected static void _privk3_execute(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
  }
  
  protected static void _privk3_reset(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    ActivityAspect.trace(_self, null);
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
    final String LINE_BREAK = System.getProperty("line.separator");
    final StringBuffer text = new StringBuffer();
    Trace _trace = ActivityAspect.trace(_self);
    EList<ActivityNode> _executedNodes = TraceAspect.executedNodes(_trace);
    final Consumer<ActivityNode> _function = new Consumer<ActivityNode>() {
      @Override
      public void accept(final ActivityNode n) {
        String _name = n.getName();
        text.append(_name);
        text.append(LINE_BREAK);
      }
    };
    _executedNodes.forEach(_function);
    EList<Variable> _locals = _self.getLocals();
    final Consumer<Variable> _function_1 = new Consumer<Variable>() {
      @Override
      public void accept(final Variable v) {
        String _print = VariableAspect.print(v);
        text.append(_print);
        text.append(LINE_BREAK);
      }
    };
    _locals.forEach(_function_1);
    return text.toString();
  }
  
  protected static Input _privk3_getInput(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final String inputPath) {
    Input input = null;
    boolean _notEquals = (!Objects.equal(inputPath, null));
    if (_notEquals) {
      XtextResourceSet resourceSet = null;
      XtextResourceSet _xtextResourceSet = new XtextResourceSet();
      resourceSet = _xtextResourceSet;
      URI _createURI = URI.createURI(inputPath);
      Resource resource = resourceSet.getResource(_createURI, true);
      EList<EObject> _contents = resource.getContents();
      EObject eObject = _contents.get(0);
      if ((eObject instanceof Input)) {
        input = ((Input) eObject);
      }
    }
    return input;
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
  
  protected static Trace _privk3_trace(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTrace") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Trace) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.trace;
  }
  
  protected static void _privk3_trace(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final Trace trace) {
    _self_.trace = trace; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTrace")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, trace);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static Context _privk3_context(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getContext") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.context;
  }
  
  protected static void _privk3_context(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final Context context) {
    _self_.context = context; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setContext")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, context);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static long _privk3_start(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStart") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.start;
  }
  
  protected static void _privk3_start(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final long start) {
    _self_.start = start; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setStart")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, start);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static long _privk3_stop(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStop") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.stop;
  }
  
  protected static void _privk3_stop(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final long stop) {
    _self_.stop = stop; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setStop")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, stop);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
