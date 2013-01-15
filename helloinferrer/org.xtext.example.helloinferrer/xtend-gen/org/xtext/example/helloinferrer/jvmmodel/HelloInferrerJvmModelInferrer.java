package org.xtext.example.helloinferrer.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.helloinferrer.helloInferrer.Greeting;
import org.xtext.example.helloinferrer.helloInferrer.Operation;
import org.xtext.example.helloinferrer.runtime.HelloResult;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class HelloInferrerJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private TypeReferenceSerializer _typeReferenceSerializer;
  
  @Inject
  private XbaseCompiler xbaseCompiler;
  
  /**
   * The dispatch method {@code infer} is called for each instance of the
   * given element's type that is contained in a resource.
   * 
   * @param element
   *            the model to create one or more
   *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
  	 *            types
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
  protected void _infer(final Greeting element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(element);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _fullyQualifiedName);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          String _documentation = HelloInferrerJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(element);
          HelloInferrerJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
          EList<Operation> _operations = element.getOperations();
          for (final Operation o : _operations) {
            EList<JvmMember> _members = it.getMembers();
            String _name = o.getName();
            JvmFormalParameter _output = o.getOutput();
            JvmTypeReference _returnType = HelloInferrerJvmModelInferrer.this.returnType(_output);
            final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  String _documentation = HelloInferrerJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(o);
                  HelloInferrerJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  EList<JvmFormalParameter> _params = o.getParams();
                  for (final JvmFormalParameter p : _params) {
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    String _name = p.getName();
                    JvmTypeReference _parameterType = p.getParameterType();
                    JvmFormalParameter _parameter = HelloInferrerJvmModelInferrer.this._jvmTypesBuilder.toParameter(p, _name, _parameterType);
                    HelloInferrerJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  }
                  final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                      public void apply(final ITreeAppendable it) {
                        it.openScope();
                        JvmFormalParameter _output = o.getOutput();
                        HelloInferrerJvmModelInferrer.this.declareVariableForOutputParameter(it, _output);
                        XExpression _body = o.getBody();
                        JvmTypeReference _typeForName = HelloInferrerJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, o);
                        HelloInferrerJvmModelInferrer.this.xbaseCompiler.compile(_body, it, _typeForName, null);
                        JvmFormalParameter _output_1 = o.getOutput();
                        HelloInferrerJvmModelInferrer.this.generateFinalReturnStatement(it, _output_1);
                        it.closeScope();
                      }
                    };
                  HelloInferrerJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                }
              };
            JvmOperation _method = HelloInferrerJvmModelInferrer.this._jvmTypesBuilder.toMethod(o, _name, _returnType, _function);
            HelloInferrerJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
          }
        }
      };
    _accept.initializeLater(_function);
  }
  
  public ITreeAppendable declareVariableForOutputParameter(final ITreeAppendable it, final JvmFormalParameter o) {
    ITreeAppendable _xblockexpression = null;
    {
      String _simpleName = o.getSimpleName();
      final String outputVarName = it.declareVariable(o, _simpleName);
      final ITreeAppendable childAppendable = it.trace(o, true);
      JvmTypeReference _parameterType = o.getParameterType();
      this._typeReferenceSerializer.serialize(_parameterType, o, childAppendable);
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
    boolean _notEquals = ObjectExtensions.operator_notEquals(o, null);
    if (!_notEquals) {
      _and = false;
    } else {
      JvmTypeReference _parameterType = o.getParameterType();
      boolean _notEquals_1 = ObjectExtensions.operator_notEquals(_parameterType, null);
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
      this._typeReferenceSerializer.serialize(_returnType, o, childAppendable);
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
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof Greeting) {
      _infer((Greeting)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
}
