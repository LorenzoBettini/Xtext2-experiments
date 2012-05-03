package org.xtext.example.helloinferrer.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XAssignment;
import org.xtext.example.helloinferrer.helloInferrer.Operation;

@SuppressWarnings("restriction")
public class HelloInferrerJavaValidator extends
		AbstractHelloInferrerJavaValidator {

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
}
