package org.xtext.example.helloinferrer.scoping;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.annotations.scoping.XbaseWithAnnotationsScopeProvider;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.LocalVarDescription;
import org.xtext.example.helloinferrer.helloInferrer.Operation;

/**
 * This custom scope provider will be used only by the content assist.
 * The custom scoping for the Xbase type system must be implemented in
 * a custom TypeComputer (see HelloInferrerTypeComputer)
 */
@SuppressWarnings("all")
public class HelloInferrerXbaseScopeProvider extends XbaseWithAnnotationsScopeProvider {
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  protected void createLocalVarScopeForJvmOperation(final JvmOperation context, final XbaseScopeProvider.LocalVariableAcceptor acceptor) {
    super.createLocalVarScopeForJvmOperation(context, acceptor);
    final EObject sourceElement = this._iJvmModelAssociations.getPrimarySourceElement(context);
    if ((sourceElement instanceof Operation)) {
      final Operation op = ((Operation) sourceElement);
      String _simpleName = context.getSimpleName();
      String _plus = ("operation " + _simpleName);
      JvmFormalParameter _output = op.getOutput();
      String _name = _output.getName();
      QualifiedName _create = QualifiedName.create(_name);
      JvmFormalParameter _output_1 = op.getOutput();
      LocalVarDescription _localVarDescription = new LocalVarDescription(_create, _output_1);
      acceptor.accept(_plus, _localVarDescription);
    }
  }
}
