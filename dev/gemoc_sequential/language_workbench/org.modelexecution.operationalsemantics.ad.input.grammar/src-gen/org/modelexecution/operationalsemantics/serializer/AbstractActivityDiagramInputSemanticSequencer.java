/*
 * generated by Xtext
 */
package org.modelexecution.operationalsemantics.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.ActivitydiagramPackage;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.BooleanValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.Input;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.InputValue;
import org.modelexecution.operationalsemantics.ad.sequential.xdsml.sequentialactivitydiagramextended.activitydiagram.IntegerValue;
import org.modelexecution.operationalsemantics.services.ActivityDiagramInputGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractActivityDiagramInputSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ActivityDiagramInputGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ActivitydiagramPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ActivitydiagramPackage.BOOLEAN_VALUE:
				sequence_BooleanValue(context, (BooleanValue) semanticObject); 
				return; 
			case ActivitydiagramPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case ActivitydiagramPackage.INPUT_VALUE:
				sequence_InputValue(context, (InputValue) semanticObject); 
				return; 
			case ActivitydiagramPackage.INTEGER_VALUE:
				sequence_IntegerValue(context, (IntegerValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=EBoolean
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.BOOLEAN_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[Variable|EString] value=Value)
	 */
	protected void sequence_InputValue(EObject context, InputValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.INPUT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.INPUT_VALUE__VALUE));
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.INPUT_VALUE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.INPUT_VALUE__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInputValueAccess().getVariableVariableEStringParserRuleCall_0_0_1(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getInputValueAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (inputValues+=InputValue inputValues+=InputValue*)
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EInt
	 */
	protected void sequence_IntegerValue(EObject context, IntegerValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ActivitydiagramPackage.Literals.INTEGER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActivitydiagramPackage.Literals.INTEGER_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
}
