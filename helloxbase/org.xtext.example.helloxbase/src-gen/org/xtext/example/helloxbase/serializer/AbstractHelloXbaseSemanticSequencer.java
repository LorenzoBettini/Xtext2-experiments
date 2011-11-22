package org.xtext.example.helloxbase.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.helloxbase.helloXbase.Greeting;
import org.xtext.example.helloxbase.helloXbase.HelloXbasePackage;
import org.xtext.example.helloxbase.helloXbase.Model;
import org.xtext.example.helloxbase.services.HelloXbaseGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractHelloXbaseSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected HelloXbaseGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == HelloXbasePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case HelloXbasePackage.GREETING:
				if(context == grammarAccess.getGreetingRule()) {
					sequence_Greeting(context, (Greeting) semanticObject); 
					return; 
				}
				else break;
			case HelloXbasePackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID javaType=[JvmType|QualifiedName])
	 */
	protected void sequence_Greeting(EObject context, Greeting semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HelloXbasePackage.Literals.GREETING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HelloXbasePackage.Literals.GREETING__NAME));
			if(transientValues.isValueTransient(semanticObject, HelloXbasePackage.Literals.GREETING__JAVA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HelloXbasePackage.Literals.GREETING__JAVA_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGreetingAccess().getJavaTypeJvmTypeQualifiedNameParserRuleCall_3_0_1(), semanticObject.getJavaType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     greetings+=Greeting*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
