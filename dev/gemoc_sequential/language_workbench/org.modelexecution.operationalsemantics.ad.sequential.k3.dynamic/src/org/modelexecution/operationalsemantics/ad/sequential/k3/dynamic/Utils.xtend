package org.modelexecution.operationalsemantics.ad.sequential.k3.dynamic

import activitydiagram.Activity
import activitydiagram.Input
import activitydiagram.InputValue
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.transaction.RecordingCommand
import org.eclipse.emf.transaction.TransactionalEditingDomain
import java.util.ArrayList
import java.io.File

abstract class XtendRecordingCommand extends RecordingCommand {
	
	new(TransactionalEditingDomain domain) {
		super(domain)
	}
	
	
}

class LoadInputValuesRecordingCommand extends XtendRecordingCommand{
	var List<InputValue> inputValuesToUpdate;
	var  Activity activity
	
	new(TransactionalEditingDomain domain, Activity activity, List<InputValue> inputValuesToUpdate) {
		super(domain)
		this.inputValuesToUpdate = inputValuesToUpdate
		this.activity = activity
	}
	
	override def void doExecute() {
		try{
			val resSet = activity.eResource.resourceSet
			val inputResource = resSet.getResource(URI.createURI(activity.eResource.getURI.toString+"input"), true)
			val input = inputResource.contents.get(0) as Input
			inputValuesToUpdate.addAll(input.inputValues)
		}
		catch(Exception e){
			println("not able to find companion input variable file : Ignoring")
		}
	}
}

