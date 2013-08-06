package org.xtext.example.helloinferrer.scoping

import org.eclipse.xtext.xbase.annotations.scoping.XbaseWithAnnotationsScopeProvider
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider.LocalVariableAcceptor
import org.eclipse.xtext.xbase.scoping.featurecalls.LocalVarDescription
import org.eclipse.xtext.naming.QualifiedName
import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.xtext.example.helloinferrer.helloInferrer.Operation

/*
 * This custom scope provider will be used only by the content assist.
 * The custom scoping for the Xbase type system must be implemented in
 * a custom TypeComputer (see HelloInferrerTypeComputer)
 */
class HelloInferrerXbaseScopeProvider extends XbaseWithAnnotationsScopeProvider {

	@Inject extension IJvmModelAssociations

	override protected createLocalVarScopeForJvmOperation(JvmOperation context, LocalVariableAcceptor acceptor) {
		super.createLocalVarScopeForJvmOperation(context, acceptor)

		// retrieve the AST element associated to the method
		// created by our model inferrer
		val sourceElement = context.getPrimarySourceElement
		if (sourceElement instanceof Operation) {
			// put the output parameter in the scope
			val op = sourceElement as Operation;
			acceptor.accept(
				"operation " + context.getSimpleName(),
				new LocalVarDescription(
					QualifiedName.create(op.output.name),
					op.output
				)
			)
		}

	}

}
