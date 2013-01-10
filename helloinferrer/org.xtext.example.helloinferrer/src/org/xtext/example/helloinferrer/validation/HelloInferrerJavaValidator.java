package org.xtext.example.helloinferrer.validation;

import static org.eclipse.xtext.xbase.validation.IssueCodes.INVALID_RETURN;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.util.Primitives;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.validation.IssueCodes;
import org.xtext.example.helloinferrer.helloInferrer.Operation;

import com.google.inject.Inject;

public class HelloInferrerJavaValidator extends
		AbstractHelloInferrerJavaValidator {

	@Inject
	private Primitives primitives;

	@Override
	public void checkAssignment(XAssignment assignment) {
		JvmIdentifiableElement assignmentFeature = assignment.getFeature();
		if (assignmentFeature instanceof JvmFormalParameter) {
			EObject container = assignmentFeature.eContainer();
			// it is OK to assign to an Operation's output parameter
			if (container instanceof Operation
					&& ((Operation) container).getOutput() == assignmentFeature) {
				return;
			}
		}
		super.checkAssignment(assignment);
	}

	@Override
	public void checkImplicitReturn(XExpression expr) {
		// we will deal with this during generation
		return;
	}

	@Override
	public void checkReturn(XReturnExpression expr) {
		error("Explicit return not available in this language.", expr, null,
				ValidationMessageAcceptor.INSIGNIFICANT_INDEX, INVALID_RETURN);
	}

	@Check
	public void checkOperation(Operation operation) {
		if (operation.getOutput() != null
				&& operation.getOutput().getParameterType() != null) {
			if (primitives
					.isPrimitive(operation.getOutput().getParameterType())) {
				error("Primitive types cannot be used as output parameters.",
						operation.getOutput().getParameterType(), null,
						IssueCodes.INVALID_USE_OF_TYPE);
			}
		}
	}
}
