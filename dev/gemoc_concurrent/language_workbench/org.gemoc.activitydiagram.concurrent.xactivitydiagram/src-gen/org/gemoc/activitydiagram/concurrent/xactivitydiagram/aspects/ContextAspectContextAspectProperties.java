package org.gemoc.activitydiagram.concurrent.xactivitydiagram.aspects;

import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Activity;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.InputValue;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.JoinNode;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Context;
import org.gemoc.activitydiagram.concurrent.xactivitydiagram.activitydiagram.Trace;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ContextAspectContextAspectProperties {
  public Trace output;
  
  public Activity activity;
  
  public Context parent;
  
  public EList<InputValue> inputValues;
  
  public JoinNode node;
}
