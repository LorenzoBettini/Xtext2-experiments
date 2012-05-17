package org.xtext.example.helloinferrer.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.example.helloinferrer.helloInferrer.Greeting
import org.xtext.example.helloinferrer.runtime.HelloResult

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class HelloInferrerJvmModelInferrer extends AbstractModelInferrer {

    /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	
	@Inject extension IQualifiedNameProvider
	
	@Inject extension TypeReferences
	
	@Inject extension TypeReferenceSerializer
	
	@Inject XbaseCompiler xbaseCompiler

	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
   	def dispatch void infer(Greeting element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		acceptor.accept(
			element.toClass( element.fullyQualifiedName )
		).initializeLater [
			documentation = element.documentation
			for (o : element.operations) {
				members += o.toMethod(o.name, 
					o.output.returnType
				) [
					documentation = o.documentation
					for (p : o.params) {
						parameters += p.toParameter(p.name, p.parameterType)
					}
					body = [
						it.openScope
						it.declareVariableForOutputParameter(o.output)
						
						xbaseCompiler.compile(o.body, it, Void::TYPE.getTypeForName(o), null)
						
						it.generateFinalReturnStatement(o.output)
						it.closeScope
					]
				]
			}
		]
   	}
   	
   	def declareVariableForOutputParameter(ITreeAppendable it, JvmFormalParameter o) {
   		val outputVarName = it.declareVariable(o, o.simpleName)
   		val childAppendable = it.trace(o, true)
		o.parameterType.serialize(o, childAppendable)
		childAppendable.append(" " + outputVarName + " = null; // output parameter")
   	}
   	
   	def returnType(JvmFormalParameter o) {
   		if (o != null && o.parameterType != null)
   			typeof(HelloResult).getTypeForName(o, o.parameterType)
   	}
   	
   	def generateFinalReturnStatement(ITreeAppendable it, JvmFormalParameter o) {
   		val childAppendable = it.trace(o, false)
   		childAppendable.newLine.append("return new ")
   		o.returnType.serialize(o, childAppendable)
   		childAppendable.append('''(«childAppendable.getName(o)»);''')
   	}
}

