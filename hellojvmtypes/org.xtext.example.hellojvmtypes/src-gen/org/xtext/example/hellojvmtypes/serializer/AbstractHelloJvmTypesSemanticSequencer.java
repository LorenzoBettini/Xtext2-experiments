package org.xtext.example.hellojvmtypes.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.example.hellojvmtypes.helloJvmTypes.Greeting;
import org.xtext.example.hellojvmtypes.helloJvmTypes.HelloJvmTypesPackage;
import org.xtext.example.hellojvmtypes.helloJvmTypes.Model;
import org.xtext.example.hellojvmtypes.services.HelloJvmTypesGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractHelloJvmTypesSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected HelloJvmTypesGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == HelloJvmTypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case HelloJvmTypesPackage.GREETING:
				if(context == grammarAccess.getGreetingRule()) {
					sequence_Greeting(context, (Greeting) semanticObject); 
					return; 
				}
				else break;
			case HelloJvmTypesPackage.MODEL:
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
	 *     (name=ID javaTypes+=[JvmType|QualifiedName] javaTypes+=[JvmType|QualifiedName]*)
	 */
	protected void sequence_Greeting(EObject context, Greeting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     greetings+=Greeting*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
