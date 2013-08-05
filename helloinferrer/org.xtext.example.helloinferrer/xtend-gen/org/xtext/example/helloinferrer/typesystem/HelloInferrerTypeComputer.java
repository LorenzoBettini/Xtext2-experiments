package org.xtext.example.helloinferrer.typesystem;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.xtext.example.helloinferrer.helloInferrer.Operation;

@SuppressWarnings("all")
public class HelloInferrerTypeComputer extends XbaseWithAnnotationsTypeComputer {
  public void _computeTypes(final XBlockExpression b, final ITypeComputationState state) {
    EObject _eContainer = b.eContainer();
    if ((_eContainer instanceof Operation)) {
      EObject _eContainer_1 = b.eContainer();
      final Operation o = ((Operation) _eContainer_1);
      JvmFormalParameter _output = o.getOutput();
      state.addLocalToCurrentScope(_output);
      ITypeComputationState _withoutRootExpectation = state.withoutRootExpectation();
      super._computeTypes(b, _withoutRootExpectation);
    } else {
      super._computeTypes(b, state);
    }
  }
}
