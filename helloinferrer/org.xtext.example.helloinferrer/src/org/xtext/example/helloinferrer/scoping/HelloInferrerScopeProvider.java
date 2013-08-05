package org.xtext.example.helloinferrer.scoping;

import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

public class HelloInferrerScopeProvider extends XbaseScopeProvider {

//	@Inject
//	IJvmModelAssociations associations;
//
//	@Override
//	protected IScope createLocalVarScopeForJvmOperation(JvmOperation context,
//			IScope parentScope) {
//		parentScope = super.createLocalVarScopeForJvmOperation(context,
//				parentScope);
//
//		// retrieve the AST element associated to the method
//		// created by our model inferrer
//		EObject sourceElement = associations.getPrimarySourceElement(context);
//		if (sourceElement instanceof Operation) {
//			Operation operation = (Operation) sourceElement;
//			return createLocalScopeForParameter(operation.getOutput(),
//					parentScope);
//		}
//
//		return parentScope;
//	}
}
