package org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic;

import activitydiagram.Activity;
import activitydiagram.InputValue;
import activitydiagram.JoinNode;
import java.util.List;
import org.modelexecution.operationalsemantics.gemoc.concurrent.dynamic.RuntimeTrace;

@SuppressWarnings("all")
public class Context {
  public RuntimeTrace output;
  
  public Activity activity;
  
  public Context parent;
  
  public List<InputValue> inputValues;
  
  public JoinNode node;
  
  public Context() {
  }
  
  public Context(final RuntimeTrace c, final Activity a, final List<InputValue> inputValues, final Context parent) {
    this.output = c;
    this.activity = a;
    this.inputValues = inputValues;
    this.parent = parent;
  }
}
