package org.modelexecution.operationalsemantics.k3.dynamic

import activitydiagram.Activity
import activitydiagram.ActivityNode
import activitydiagram.ActivitydiagramPackage
import activitydiagram.BooleanValue
import activitydiagram.BooleanVariable
import activitydiagram.Input
import activitydiagram.InputValue
import activitydiagram.IntegerValue
import activitydiagram.IntegerVariable
import activitydiagram.Trace
import activitydiagram.Value
import activitydiagram.Variable
import java.io.BufferedWriter
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStreamWriter
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.resource.XtextResourceSet
import org.modelexecution.operationalsemantics.ActivityDiagramInputStandaloneSetup
import org.modelexecution.operationalsemantics.ActivityDiagramStandaloneSetup
import static extension org.modelexecution.operationalsemantics.k3.dynamic.ActivityAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.ControlFlowAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.OpaqueActionAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.InitialNodeAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.ActivityFinalNodeAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.ForkNodeAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.JoinNodeAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.MergeNodeAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.DecisionNodeAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.IntegerVariableAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.BooleanVariableAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.IntegerCalculationExpressionAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.IntegerComparisonExpressionAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.BooleanUnaryExpressionAspect.*
import static extension org.modelexecution.operationalsemantics.k3.dynamic.BooleanBinaryExpressionAspect.*


import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import activitydiagram.ActivitydiagramFactory
import activitydiagram.OpaqueAction
import activitydiagram.InitialNode
import activitydiagram.ActivityFinalNode
import activitydiagram.ForkNode
import activitydiagram.JoinNode
import activitydiagram.MergeNode
import activitydiagram.DecisionNode
import activitydiagram.IntegerCalculationExpression
import activitydiagram.IntegerComparisonExpression
import activitydiagram.BooleanUnaryExpression
import activitydiagram.BooleanBinaryExpression
import activitydiagram.Offer
import activitydiagram.ControlToken
import activitydiagram.ForkedToken
import activitydiagram.ControlFlow
import activitydiagram.NamedElement
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import java.util.concurrent.Executors
import activitydiagram.ActivityEdge
import java.util.concurrent.Future
import java.util.concurrent.Callable
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import activitydiagram.Expression
import activitydiagram.IntegerCalculationOperator
import activitydiagram.IntegerComparisonOperator
import activitydiagram.BooleanUnaryOperator
import activitydiagram.BooleanBinaryOperator

class Util{
		public static final Object LINE_BREAK = System
			.getProperty("line.separator");
	
}

class Main{


	protected XtextResourceSet resourceSet ;
	protected ResourceSet resourceSetxmi ;
	private Trace trace = null;

		def static void main(String[] args) {
			new Main().run(args);

	}

	def void run(String[] args) {
		resourceSet = new XtextResourceSet();
		resourceSetxmi = new ResourceSetImpl();
		ActivityDiagramStandaloneSetup.doSetup();
		ActivityDiagramInputStandaloneSetup.doSetup();
		if (!EPackage.Registry.INSTANCE.containsKey(ActivitydiagramPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(ActivitydiagramPackage.eNS_URI, ActivitydiagramPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl);
		
//		var inputPath = "../org.modelexecution.operationalsemantics.ad.test/model/test1.ad"
//		var inputPath = "../org.modelexecution.operationalsemantics.ad.test/model/test2.ad"
		var inputPath = "../org.modelexecution.operationalsemantics.ad.test/model/testperformance_variant3_2.ad"
		var inputPath1 = "../org.modelexecution.operationalsemantics.ad.test/model/testperformance_variant3_2.adinput"
		var inputValues = this.getInputValues(inputPath1);
//		var inputValues =	 new ArrayList<InputValue>()
	 	var activity = getActivity(inputPath)
//		var inputPath = "../org.modelexecution.operationalsemantics.ad.test/model/xmi/test5.xmi"
//		var activity = getActivityfromXMI(inputPath)
		var start = System.nanoTime;
	 	activity.main1(inputValues);
		var stop = System.nanoTime;
		println("time to execute "+ ( stop - start))

		println(activity.printTrace())
	}

	def Activity getActivity(String modelPath) {
		var resource = resourceSet.getResource(createFileURI(modelPath),
				true);
		var eObject = resource.getContents().get(0);
		if (eObject instanceof Activity) {
			var activity =  eObject as Activity;
			return activity;
		}
		return null;
	}

	def URI createFileURI(String path) {
		return URI.createFileURI(createFile(path).getAbsolutePath());
	}

	def Activity getActivityfromXMI(String modelPath) {
		var resource = resourceSetxmi.getResource(createFileURI(modelPath),
				true);
		var eObject = resource.getContents().get(0);
		if (eObject instanceof Activity) {
			var activity =  eObject as Activity;
			//println((activity.locals.get(0) as BooleanVariable).initialValue)
			return activity;
		}
		return null;
	}

	def File createFile(String path) {
		return new File(path);
	}


	def List<InputValue> getInputValues(String inputPath) {
		var inputValues = new ArrayList<InputValue>();
		var input = getInput(inputPath);
		if (input != null) {
			inputValues.addAll(input.getInputValues());
		}
		return inputValues;
	}
	def Input getInput(String inputPath) {
		var Input input = null;
		if (inputPath != null) {
			var resource = resourceSet.getResource(
					createFileURI(inputPath), true);
			var eObject = resource.getContents().get(0);
			if (eObject instanceof Input) {
				input =  eObject as Input;
			}
		}
		return input;
	}



}

class Context{
	public Trace output;
	public Activity activity;
	public Context parent;
	public List<InputValue> inputValues ;
	public  JoinNode node ;
	new(){
	}
	new(Trace c, Activity a, List<InputValue> inputValues, Context parent ){
		this.output =c
		this.activity = a
		this.inputValues=inputValues
		this.parent=parent		
	}




}


@Aspect(className=Activity)
class ActivityAspect extends NamedElementAspect {

	@ReplaceAspectMethod
	 def void main1(List<InputValue> value){
	 	var c = new Context
	 	c.inputValues = value
	 	c.activity = _self
		 _self.trace =  ActivitydiagramFactory.eINSTANCE.createTrace() as Trace;
		c.output = _self.trace
		//value.forEach[v | _self.locals.add(v.variable)]
		value?.forEach[v|v.getVariable().setCurrentValue(v.getValue());]
		_self.nodes.forEach[e|e.running = true]
		_self.execute(c)
	}
	 @OverrideAspectMethod
	 def void execute(Context c){
	 	_self.locals.forEach[v | v.init(c)]
		_self.nodes.filter[node| node instanceof InitialNode].get(0).execute(c)
	}
	
	
	
	def void reset() {
		_self.trace = null;
	}
	
	
	def void writeToFile() {
		var text = _self.printTrace();
		try {
			var writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(new File("trace/" + _self.getName()
							+ ".txt"))));
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	def String printTrace() {
		val text = new StringBuffer();
		 _self.trace.getExecutedNodes().forEach[n | 		
		 	text.append(n.getName());
			text.append(Util.LINE_BREAK);]

		_self.getLocals().forEach[v|
			text.append(v.print);
			text.append(Util.LINE_BREAK);
		]
		return text.toString();
	}
	def int getIntegerVariableValue(String variableName) {
		var currentValue = _self.getVariableValue(variableName);
		if (currentValue instanceof IntegerValue) {
			var integerValue =  currentValue as IntegerValue;
			return integerValue.getValue();
		}
		return -1;
	}

	def boolean getBooleanVariableValue(String variableName) {
		var currentValue = _self.getVariableValue(variableName);
		if (currentValue instanceof BooleanValue) {
			var booleanValue =  currentValue as BooleanValue;
			return booleanValue.isValue();
		}
		return false;
	}

	def Value getVariableValue( String variableName) {
		var variable = _self.getVariable(variableName);
		var currentValue = variable.getCurrentValue();
		return currentValue;
	}


	def Variable getVariable(String variableName) {
		var allVariables = new ArrayList<Variable>();
		allVariables.addAll(_self.getLocals());
		allVariables.addAll(_self.getInputs());
		for (Variable var1 : allVariables) {
			if (var1.getName().equals(variableName)) {
				return var1;
			}
		}
		return null;
	}
	def void writeTrace() {
		_self.writeToFile;
		_self.reset();
	}
	

	
}

@Aspect(className=NamedElement)
class NamedElementAspect  {
	 def void execute(Context c){

	}
}

@Aspect(className=ControlFlow)
class ControlFlowAspect extends NamedElementAspect {
	 @OverrideAspectMethod
	 def void execute(Context c){
	 //warning here the guard can/may be a boolean expression....
	 	if (_self.guard != null){
	 		if ((_self.guard.currentValue as BooleanValue).value){
	 			_self.target.execute(c)
	 			return
	 		}else{
	 			return
	 		}
	 	}else
	 		_self.target.execute(c)
	}
}



@Aspect(className=OpaqueAction)
class OpaqueActionAspect extends NamedElementAspect {
	 @OverrideAspectMethod
	 def void execute(Context c){
		 c.output.executedNodes.add(_self)
		 
		 _self.expressions.forEach[e | e.execute(c)]
		 
		 _self.outgoing.forEach[e|e.execute(c)]
		
	}
}

@Aspect(className=InitialNode)
class InitialNodeAspect extends NamedElementAspect {
	 @OverrideAspectMethod
	 def void execute(Context c){
		 c.output.executedNodes.add(_self)
		 _self.outgoing.forEach[e|e.execute(c)]
	}
}

@Aspect(className=Expression)
class ExpressionAspect  {
	 def void execute(Context c){
	}
}


@Aspect(className=ActivityFinalNode)
class ActivityFinalNodeAspect extends NamedElementAspect {
	 @OverrideAspectMethod
	 def void execute(Context c){
		 c.output.executedNodes.add(_self)
	}
}


class Run implements Callable<Object>{
	ActivityEdge a;
	Context c;
	new(ActivityEdge a,Context c){
		this.a = a
		this.c=c
	}
	
	
	override call() throws Exception {
		a.execute(c)
		return this
	}
	
}

@Aspect(className=ForkNode)
class ForkNodeAspect extends NamedElementAspect {
	 @OverrideAspectMethod
	 def void execute(Context c){
		c.output.executedNodes.add(_self)
	 	val newContext = new Context(c.output,c.activity,c.inputValues,c);	 	
	 	val service = Executors.newSingleThreadExecutor()
	 	val futures = new ArrayList<Future>()
	 	_self.outgoing.forEach[e|
	 		futures.add(service.submit(new Run(e,newContext)))
	 	];	 	
	 	futures.forEach[e|e.get]
	 	service.shutdown()
		newContext.node.executeNext(c)
	}
}

@Aspect(className=JoinNode)
class JoinNodeAspect extends NamedElementAspect {
	 @OverrideAspectMethod
	 def void execute(Context c){	 	
		c.node = _self
	}
	def void executeNext(Context c){
	 	c.output.executedNodes.add(_self)
		_self.outgoing.forEach[e|e.execute(c)]
	}
	
}

@Aspect(className=MergeNode)
class MergeNodeAspect extends NamedElementAspect {
	 @OverrideAspectMethod
	 def void execute(Context c){
	 	c.output.executedNodes.add(_self)
		_self.outgoing.forEach[e|e.execute(c)]
	 

	}
}

@Aspect(className=DecisionNode)
class DecisionNodeAspect extends NamedElementAspect {
	 @OverrideAspectMethod
	 def void execute(Context c){
	 	c.output.executedNodes.add(_self)
		_self.outgoing.forEach[e|e.execute(c)]
	 	

	}
}


@Aspect(className=Variable)
class VariableAspect {
	 def void execute(Context c){

	}
	 def void init(Context c){
		_self.currentValue = _self.initialValue
	}
	def String print(){
		
	}
}

@Aspect(className=IntegerVariable)
class IntegerVariableAspect extends org.modelexecution.operationalsemantics.k3.dynamic.VariableAspect{
 @OverrideAspectMethod
		 def void execute(Context c){

	}
	 @OverrideAspectMethod
	def String print(){
		var text = new StringBuffer();
		text.append(_self.getName());
		text.append(" = ");
		text.append((_self.getCurrentValue() as IntegerValue).getValue());
		return text.toString();
	}
}

@Aspect(className=BooleanVariable)
 @OverrideAspectMethod
	class BooleanVariableAspect  extends org.modelexecution.operationalsemantics.k3.dynamic.VariableAspect {
	 def void execute(Context c){

	}
	 @OverrideAspectMethod
	def String print(){
		var text = new StringBuffer();
		text.append(_self.getName());
		text.append(" = ");
		text.append((_self.getCurrentValue() as BooleanValue).isValue());
		return text.toString();
	}
	
}







@Aspect(className=IntegerCalculationExpression)
class IntegerCalculationExpressionAspect extends org.modelexecution.operationalsemantics.k3.dynamic.ExpressionAspect{
	@OverrideAspectMethod
	 def void execute(Context c){
	 	if(_self.operator.value==IntegerCalculationOperator.ADD_VALUE ){
		 	(_self.assignee.currentValue as IntegerValue).value = (_self.operand1.currentValue as IntegerValue).value + (_self.operand2.currentValue as IntegerValue).value		
	 	}
	 	else if(_self.operator.value==IntegerCalculationOperator.SUBRACT_VALUE ){
		 	(_self.assignee.currentValue as IntegerValue).value = (_self.operand1.currentValue as IntegerValue).value - (_self.operand2.currentValue as IntegerValue).value		
	 	}
		
	}
}

@Aspect(className=IntegerComparisonExpression)
class IntegerComparisonExpressionAspect  extends org.modelexecution.operationalsemantics.k3.dynamic.ExpressionAspect{
	@OverrideAspectMethod
	 def void execute(Context c){
	 	if(_self.operator.value==IntegerComparisonOperator.EQUALS_VALUE ){
		 	(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value == (_self.operand2.currentValue as IntegerValue).value		
	 	}
		else if(_self.operator.value==IntegerComparisonOperator.GREATER_EQUALS_VALUE ){
		 	(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value >= (_self.operand2.currentValue as IntegerValue).value		
	 	}
		else if(_self.operator.value==IntegerComparisonOperator.GREATER_VALUE ){
		 	(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value > (_self.operand2.currentValue as IntegerValue).value		
	 	}
		else if(_self.operator.value==IntegerComparisonOperator.SMALLER_EQUALS_VALUE ){
		 	(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value <= (_self.operand2.currentValue as IntegerValue).value		
	 	}
		else if(_self.operator.value==IntegerComparisonOperator.SMALLER_VALUE ){
		 	(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value < (_self.operand2.currentValue as IntegerValue).value		
	 	}
	}
}

@Aspect(className=BooleanUnaryExpression)
class BooleanUnaryExpressionAspect  extends org.modelexecution.operationalsemantics.k3.dynamic.ExpressionAspect{
	@OverrideAspectMethod
	 def void execute(Context c){
	 	if(_self.operator.value==BooleanUnaryOperator.NOT_VALUE ){
		 	(_self.assignee.currentValue as BooleanValue).value = !(_self.operand.currentValue as BooleanValue).value 		
	 	}

	}
}

@Aspect(className=BooleanBinaryExpression)
class BooleanBinaryExpressionAspect  extends org.modelexecution.operationalsemantics.k3.dynamic.ExpressionAspect{
	@OverrideAspectMethod
	 def void execute(Context c){
	 	if(_self.operator.value==BooleanBinaryOperator.AND_VALUE ){
		 	(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as BooleanValue).value && (_self.operand2.currentValue as BooleanValue).value 		
	 	}
	 	else if(_self.operator.value==BooleanBinaryOperator.OR_VALUE ){
		 	(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as BooleanValue).value || (_self.operand2.currentValue as BooleanValue).value 		
	 	}
	}
}

