package org.modelexecution.operationalsemantics.gemoc.sequential.dynamic

import activitydiagram.Activity
import activitydiagram.Input
import activitydiagram.InputValue
import java.io.File
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.transaction.RecordingCommand
import org.eclipse.emf.transaction.TransactionalEditingDomain
import org.eclipse.xtext.resource.XtextResourceSet
import org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.Context

import static extension org.modelexecution.operationalsemantics.gemoc.sequential.dynamic_allinecore.ActivityAspect.*

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
		val TransactionalEditingDomain editingDomain = TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(resSet); 
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

abstract class XtendRecordingCommand extends RecordingCommand {
	
	new(TransactionalEditingDomain domain) {
		super(domain)
	}
	
	
}

