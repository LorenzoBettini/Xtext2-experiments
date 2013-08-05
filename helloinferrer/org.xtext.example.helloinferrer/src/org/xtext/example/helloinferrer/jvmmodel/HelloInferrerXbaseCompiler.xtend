package org.xtext.example.helloinferrer.jvmmodel

import com.google.inject.Inject
import java.util.Set
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.xtext.example.helloinferrer.helloInferrer.Operation
import org.xtext.example.helloinferrer.runtime.HelloResult

class HelloInferrerXbaseCompiler extends XbaseCompiler {
	
	@Inject extension TypeReferences
	
	override compile(XExpression obj, ITreeAppendable appendable, JvmTypeReference expectedReturnType, Set<JvmTypeReference> declaredExceptions) {
		if (obj.eContainer instanceof Operation) {
			val o = obj.eContainer as Operation
			
			appendable.openScope
			appendable.newLine
			appendable.declareVariableForOutputParameter(o.output)
			
			super.compile(o.body, appendable, Void::TYPE.getTypeForName(o), null)
			
			appendable.generateFinalReturnStatement(o.output)
			appendable.closeScope
			
			return appendable
		}
		
		return super.compile(obj, appendable, expectedReturnType, declaredExceptions)
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