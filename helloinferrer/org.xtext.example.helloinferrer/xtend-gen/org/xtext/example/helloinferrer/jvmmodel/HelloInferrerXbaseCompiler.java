package org.xtext.example.helloinferrer.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.helloinferrer.helloInferrer.Operation;
import org.xtext.example.helloinferrer.runtime.HelloResult;

@SuppressWarnings("all")
public class HelloInferrerXbaseCompiler extends XbaseCompiler {
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  public ITreeAppendable compile(final XExpression obj, final ITreeAppendable appendable, final JvmTypeReference expectedReturnType, final Set<JvmTypeReference> declaredExceptions) {
    EObject _eContainer = obj.eContainer();
    if ((_eContainer instanceof Operation)) {
      EObject _eContainer_1 = obj.eContainer();
      final Operation o = ((Operation) _eContainer_1);
      appendable.openScope();
      appendable.newLine();
      JvmFormalParameter _output = o.getOutput();
      this.declareVariableForOutputParameter(appendable, _output);
      XExpression _body = o.getBody();
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, o);
      super.compile(_body, appendable, _typeForName, null);
      JvmFormalParameter _output_1 = o.getOutput();
      this.generateFinalReturnStatement(appendable, _output_1);
      appendable.closeScope();
      return appendable;
    }
    return super.compile(obj, appendable, expectedReturnType, declaredExceptions);
  }
  
  public ITreeAppendable declareVariableForOutputParameter(final ITreeAppendable it, final JvmFormalParameter o) {
    ITreeAppendable _xblockexpression = null;
    {
      String _simpleName = o.getSimpleName();
      final String outputVarName = it.declareVariable(o, _simpleName);
      final ITreeAppendable childAppendable = it.trace(o, true);
      JvmTypeReference _parameterType = o.getParameterType();
      this.serialize(_parameterType, o, childAppendable);
      String _plus = (" " + outputVarName);
      String _plus_1 = (_plus + " = null; // output parameter");
      ITreeAppendable _append = childAppendable.append(_plus_1);
      _xblockexpression = (_append);
    }
    return _xblockexpression;
  }
  
  public JvmTypeReference returnType(final JvmFormalParameter o) {
    JvmTypeReference _xifexpression = null;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(o, null));
    if (!_notEquals) {
      _and = false;
    } else {
      JvmTypeReference _parameterType = o.getParameterType();
      boolean _notEquals_1 = (!Objects.equal(_parameterType, null));
      _and = (_notEquals && _notEquals_1);
    }
    if (_and) {
      JvmTypeReference _parameterType_1 = o.getParameterType();
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(HelloResult.class, o, _parameterType_1);
      _xifexpression = _typeForName;
    }
    return _xifexpression;
  }
  
  public ITreeAppendable generateFinalReturnStatement(final ITreeAppendable it, final JvmFormalParameter o) {
    ITreeAppendable _xblockexpression = null;
    {
      final ITreeAppendable childAppendable = it.trace(o, false);
      ITreeAppendable _newLine = childAppendable.newLine();
      _newLine.append("return new ");
      JvmTypeReference _returnType = this.returnType(o);
      this.serialize(_returnType, o, childAppendable);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      String _name = childAppendable.getName(o);
      _builder.append(_name, "");
      _builder.append(");");
      ITreeAppendable _append = childAppendable.append(_builder);
      _xblockexpression = (_append);
    }
    return _xblockexpression;
  }
}
