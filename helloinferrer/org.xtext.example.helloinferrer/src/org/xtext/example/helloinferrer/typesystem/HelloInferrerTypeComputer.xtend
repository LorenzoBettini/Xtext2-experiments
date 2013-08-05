package org.xtext.example.helloinferrer.typesystem

import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.xtext.example.helloinferrer.helloInferrer.Operation

class HelloInferrerTypeComputer extends XbaseWithAnnotationsTypeComputer {
	override void _computeTypes(XBlockExpression b, ITypeComputationState state) {
		if (b.eContainer instanceof Operation) {
			val o = b.eContainer as Operation

			// insert the output parameter in the scope
			state.addLocalToCurrentScope(o.output)

			super._computeTypes(b, state.withoutRootExpectation)
		} else {
			super._computeTypes(b, state)
		}
	}
}
