package org.modelexecution.operationalsemantics.gemoc.sequential.dynamic

import activitydiagram.Activity
import activitydiagram.ActivityNode
import activitydiagram.ActivitydiagramPackage
import activitydiagram.BooleanValue
import activitydiagram.BooleanVariable
import activitydiagram.Input
import activitydiagram.InputValue
import activitydiagram.IntegerValue
import activitydiagram.IntegerVariable
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
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.ActivityAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.Activity_QueryAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.ControlFlowAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.OpaqueActionAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.InitialNodeAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.ActivityFinalNodeAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.ForkNodeAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.JoinNodeAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.MergeNodeAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.DecisionNodeAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.IntegerVariableAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.BooleanVariableAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.IntegerCalculationExpressionAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.IntegerComparisonExpressionAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.BooleanUnaryExpressionAspect.*
import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.BooleanBinaryExpressionAspect.*

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
import activitydiagram.FinalNode
import activitydiagram.impl.ForkedTokenImpl
import org.eclipse.emf.transaction.TransactionalEditingDomain
import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.Context

class Main {
	protected XtextResourceSet resourceSet ;
	protected ResourceSet resourceSetxmi ;

	/**
	 * main used by Gemoc plain K3
	 */
	def static void main(Activity activity) {
		val inputValues = new ArrayList<InputValue>();
		// search input variables in companion file if it exists
		// ignore if not found or invalid
		val resSet = activity.eResource.resourceSet
		val org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain = org.eclipse.emf.transaction.TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(resSet); 
		val command = new XtendRecordingCommand(editingDomain){
			override def void doExecute() {
    			try{
					val inputResource = resSet.getResource(URI.createURI(activity.eResource.URI.toString+"input"), true)
					val input = inputResource.contents.get(0) as Input
					inputValues.addAll(input.inputValues)
				}
				catch(Exception e){
					println("not able to find companion input variable file : Ignoring")
				}
    		}
		}
	    editingDomain.getCommandStack().execute(command);

		var start = System.nanoTime;
		val context = new Context
		activity.initializeContext(inputValues, context)
    	activity.execute(context)
		var stop = System.nanoTime;
		println("time to execute " + ( stop - start))
		println(activity.printTrace())
	}

	def Activity getActivity(String modelPath) {
		var resource = resourceSet.getResource(createFileURI(modelPath), true);
		var eObject = resource.getContents().get(0);
		if (eObject instanceof Activity) {
			var activity = eObject as Activity;
			return activity;
		}
		return null;
	}

	def URI createFileURI(String path) {
		return URI.createFileURI(createFile(path).getAbsolutePath());
	}

	def Activity getActivityfromXMI(String modelPath) {
		var resource = resourceSetxmi.getResource(createFileURI(modelPath), true);
		var eObject = resource.getContents().get(0);
		if (eObject instanceof Activity) {
			var activity = eObject as Activity;
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
			var resource = resourceSet.getResource(createFileURI(inputPath), true);
			var eObject = resource.getContents().get(0);
			if (eObject instanceof Input) {
				input = eObject as Input;
			}
		}
		return input;
	}

}

abstract class XtendRecordingCommand extends org.eclipse.emf.transaction.RecordingCommand {
	
	new(TransactionalEditingDomain domain) {
		super(domain)
	}
	
	
}

