package org.modelexecution.operationalsemantics.ad.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.modelexecution.operationalsemantics.ActivityDiagramInputStandaloneSetup;
import org.modelexecution.operationalsemantics.ActivityDiagramStandaloneSetup;

import activitydiagram.Activity;
import activitydiagram.ActivityNode;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.Input;
import activitydiagram.InputValue;
import activitydiagram.IntegerValue;
import activitydiagram.IntegerVariable;
import activitydiagram.Trace;
import activitydiagram.Value;
import activitydiagram.Variable;

public class TestSuite {

	private static final Object LINE_BREAK = System
			.getProperty("line.separator");
	
	protected XtextResourceSet resourceSet = null;
	private Trace trace = null;;
	
	@Before
	final public void initializeResourceSet() {
		resourceSet = new XtextResourceSet();
	}

	@Before
	final public void setupGrammar() {
		ActivityDiagramStandaloneSetup.doSetup();
		ActivityDiagramInputStandaloneSetup.doSetup();
	}
	
	@After
	final public void printTrace() {
		writeToFile(trace);
		reset();
	}
	
	protected void writeToFile(Trace trace) {
		Activity activity = (Activity)trace.eContainer();
		String text = printTrace(trace);
		try {
			Writer writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(new File("trace/" + activity.getName()
							+ ".txt"))));
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void reset() {
		trace = null;
	}
	

	@Test
	final public void test1() {
		trace = executeActivity("model/test1.ad");
		assertTrue(checkTotalExecutionOrder(trace, "initialNode1", "action1",
				"finalNode1"));
	}

	@Test
	final public void test2() {
		trace = executeActivity("model/test2.ad");
		assertTrue(checkPartialExecutionOrder(trace, "initialNode2",
				"forkNode1", "action2", "joinNode1", "finalNode2"));
		assertTrue(checkPartialExecutionOrder(trace, "initialNode2",
				"forkNode1", "action3", "joinNode1", "finalNode2"));
	}

	@Test
	final public void test3() {
		trace = executeActivity("model/test3.ad");
		assertTrue(checkTotalExecutionOrder(trace, "initialNode3",
				"decisionNode1", "action4", "mergeNode1", "finalNode3"));
		assertFalse(checkNodeExecuted(trace, "action5"));
	}

	@Test
	final public void test4() {
		trace = executeActivity("model/test4.ad");
		assertTrue(checkTotalExecutionOrder(trace, "initialNode4", "action6",
				"action7", "action8", "action9", "finalNode4"));
		assertEquals(3, getIntegerVariableValue(trace, "var3"));
		assertEquals(1, getIntegerVariableValue(trace, "var4"));
		assertEquals(2, getIntegerVariableValue(trace, "var5"));
		assertTrue(getBooleanVariableValue(trace, "var6"));
		assertFalse(getBooleanVariableValue(trace, "var7"));
		assertTrue(getBooleanVariableValue(trace, "var8"));
	}

	@Test
	final public void test5() {
		trace = executeActivity("model/test5.ad", "model/test5.adinput");
		assertTrue(checkTotalExecutionOrder(trace, "initialNode5", "action10",
				"finalNode5"));
		assertEquals(10, getIntegerVariableValue(trace, "var9"));
		assertEquals(5, getIntegerVariableValue(trace, "var10"));
		assertEquals(15, getIntegerVariableValue(trace, "var11"));
	}
	
	@Test
	final public void test6_false() {
		trace = executeActivity("model/test6.ad", "model/test6_false.adinput");
		assertTrue(checkTotalExecutionOrder(trace, "initialNode6", "register", "decisionInternal",
				"assignToProjectExternal", "mergeAuthorizePayment", "authorizePayment", "finalNode6"));
		assertFalse(checkNodeExecuted(trace, "getWelcomePackage"));
		assertFalse(checkNodeExecuted(trace, "forkGetWelcomePackage"));
		assertFalse(checkNodeExecuted(trace, "assignToProject"));
		assertFalse(checkNodeExecuted(trace, "addToWebsite"));
		assertFalse(checkNodeExecuted(trace, "joinManagerInterview"));
		assertFalse(checkNodeExecuted(trace, "managerInterview"));
		assertFalse(checkNodeExecuted(trace, "managerReport"));
	}
	
	@Test
	final public void test6_true() {
		trace = executeActivity("model/test6.ad", "model/test6_true.adinput");
		assertTrue(checkPartialExecutionOrder(trace, "initialNode6", "register", "decisionInternal",
				"getWelcomePackage", "forkGetWelcomePackage", "joinManagerInterview", "managerInterview", "managerReport",
				"mergeAuthorizePayment", "authorizePayment", "finalNode6"));
		assertTrue(checkPartialExecutionOrder(trace, "forkGetWelcomePackage", "assignToProject", "joinManagerInterview"));
		assertTrue(checkPartialExecutionOrder(trace, "forkGetWelcomePackage", "addToWebsite", "joinManagerInterview"));
		
		assertFalse(checkNodeExecuted(trace, "assignToProjectExternal"));
	}

	@Test
	public void test_performance_variant1() {
		trace = executeActivity("model/testperformance_variant1.ad");
		assertEquals(1002, trace.getExecutedNodes().size());
	}
	
	@Test
	public void test_performance_variant2() {
		trace = executeActivity("model/testperformance_variant2.ad");
		assertEquals(1004, trace.getExecutedNodes().size());
	}
	
	@Test
	public void test_performance_variant3_1() {
		trace = executeActivity("model/testperformance_variant3_1.ad");
		Activity activity = (Activity)trace.eContainer();
		for (Variable variable : activity.getLocals()) {
			if (variable.getName().equals("one"))
				continue;
			assertEquals(10, ((IntegerValue)variable.getCurrentValue()).getValue());
		}
		assertEquals(1004, trace.getExecutedNodes().size());
	}
	
	@Test
	public void test_performance_variant3_2() {
		trace = executeActivity("model/testperformance_variant3_2.ad", "model/testperformance_variant3_2.adinput");
		assertEquals(141, getIntegerVariableValue(trace, "loop"));
		assertEquals(1001, trace.getExecutedNodes().size());
	}
	
	final protected Trace executeActivity(String modelPath) {
		return executeActivity(modelPath, null);
	}

	protected Trace executeActivity(String modelPath, String inputPath) {
		Activity activity = getActivity(modelPath);
		List<InputValue> inputValues = getInputValues(inputPath);
		activity.main(inputValues);
		Trace trace = activity.getTrace();
		return trace;
	}

	protected Activity getActivity(String modelPath) {
		Resource resource = resourceSet.getResource(createFileURI(modelPath),
				true);
		EObject eObject = resource.getContents().get(0);
		if (eObject instanceof Activity) {
			Activity activity = (Activity) eObject;
			return activity;
		}
		return null;
	}

	final protected List<InputValue> getInputValues(String inputPath) {
		List<InputValue> inputValues = new ArrayList<InputValue>();
		Input input = getInput(inputPath);
		if (input != null) {
			inputValues.addAll(input.getInputValues());
		}		
		return inputValues;
	}
	
	protected Input getInput(String inputPath) {
		Input input = null;
		if (inputPath != null) {
			Resource resource = resourceSet.getResource(
					createFileURI(inputPath), true);
			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof Input) {
				input = (Input) eObject;
			}
		}
		return input;
	}

	final protected URI createFileURI(String path) {
		return URI.createFileURI(createFile(path).getAbsolutePath());
	}

	final protected File createFile(String path) {
		return new File(path);
	}

	final protected boolean checkTotalExecutionOrder(Trace trace,
			String... activityNodeNames) {
		boolean result = true;
		if (trace.getExecutedNodes().size() != activityNodeNames.length) {
			result = false;
		} else {
			for (int i = 0; i < trace.getExecutedNodes().size(); ++i) {
				ActivityNode activityNode = trace.getExecutedNodes().get(i);
				String activityNodeName = activityNode.getName();
				String expectedActivityNodeName = activityNodeNames[i];
				if (!activityNodeName.equals(expectedActivityNodeName)) {
					result = false;
				}
			}
		}
		return result;
	}

	final protected boolean checkPartialExecutionOrder(Trace trace,
			String... activityNodeNames) {
		int[] orderIndexes = new int[activityNodeNames.length];
		for (int i = 0; i < activityNodeNames.length; ++i) {
			orderIndexes[i] = getFirstOrderIndex(trace, activityNodeNames[i]);
		}
		for (int i = 0; i < activityNodeNames.length - 1; ++i) {
			int index1 = orderIndexes[i];
			int index2 = orderIndexes[i + 1];
			if (!(index1 < index2)) {
				return false;
			}
		}
		return true;
	}

	private int getFirstOrderIndex(Trace trace, String activityNodeName) {
		for (int i = 0; i < trace.getExecutedNodes().size(); ++i) {
			ActivityNode node = trace.getExecutedNodes().get(i);
			if (node.getName().equals(activityNodeName)) {
				return i;
			}
		}
		return -1;
	}

	final protected boolean checkNodeExecuted(Trace trace, String string) {
		int orderIndex = getFirstOrderIndex(trace, string);
		return orderIndex != -1;
	}

	final protected int getIntegerVariableValue(Trace trace, String variableName) {
		Value currentValue = getVariableValue(trace, variableName);
		if (currentValue instanceof IntegerValue) {
			IntegerValue integerValue = (IntegerValue) currentValue;
			return integerValue.getValue();
		} else {
			if (currentValue == null)
				Assert.fail("No value found");
			else
				Assert.fail("Value of wrong type");
		}
		return -1;
	}

	private boolean getBooleanVariableValue(Trace trace, String variableName) {
		Value currentValue = getVariableValue(trace, variableName);
		if (currentValue instanceof BooleanValue) {
			BooleanValue booleanValue = (BooleanValue) currentValue;
			return booleanValue.isValue();
		} else {
			if (currentValue == null)
				Assert.fail("No value found");
			else
				Assert.fail("Value of wrong type");
		}
		return false;
	}

	private Value getVariableValue(Trace trace, String variableName) {
		Activity activity = getActivity(trace);
		Variable variable = getVariable(activity, variableName);
		Value currentValue = variable.getCurrentValue();
		return currentValue;
	}

	private Variable getVariable(Activity activity, String variableName) {
		List<Variable> allVariables = new ArrayList<Variable>();
		allVariables.addAll(activity.getLocals());
		allVariables.addAll(activity.getInputs());
		for (Variable var : allVariables) {
			if (var.getName().equals(variableName)) {
				return var;
			}
		}
		return null;
	}

	private Activity getActivity(Trace trace) {
		Activity activity = (Activity) trace.eContainer();
		return activity;
	}

	final protected String printTrace(Trace trace) {
		StringBuffer text = new StringBuffer();
		for(ActivityNode node : trace.getExecutedNodes()) {
			text.append(node.getName());
			text.append(LINE_BREAK);
		}
		
		Activity activity = (Activity)trace.eContainer();
		for(Variable variable : activity.getLocals()) {
			text.append(print(variable));
			text.append(LINE_BREAK);
		}
		return text.toString();
	}
	
	private String print(Variable variable) {
		StringBuffer text = new StringBuffer();
		if (variable instanceof IntegerVariable) {
			text.append(print((IntegerVariable)variable));
		} else if (variable instanceof BooleanVariable) {
			text.append(print((BooleanVariable)variable));
		}
		return text.toString();
	}
	
	private String print(IntegerVariable variable){
		StringBuffer text = new StringBuffer();
		text.append(variable.getName());
		text.append(" = ");
		text.append(((IntegerValue)variable.getCurrentValue()).getValue());
		return text.toString();
	}
	
	private String print(BooleanVariable variable){
		StringBuffer text = new StringBuffer();
		text.append(variable.getName());
		text.append(" = ");
		text.append(((BooleanValue)variable.getCurrentValue()).isValue());
		return text.toString();
	}
}
