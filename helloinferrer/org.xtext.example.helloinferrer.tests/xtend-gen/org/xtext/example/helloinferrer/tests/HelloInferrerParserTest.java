package org.xtext.example.helloinferrer.tests;

import com.google.inject.Inject;
import junit.framework.Assert;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.validation.IssueCodes;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloinferrer.HelloInferrerInjectorProvider;
import org.xtext.example.helloinferrer.helloInferrer.Model;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(HelloInferrerInjectorProvider.class)
public class HelloInferrerParserTest {
  @Inject
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @BeforeClass
  public static void setNewLine() {
    System.setProperty("line.separator", "\n");
  }
  
  @Test
  public void testOperation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.hello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp(String s, int i) output Boolean b {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val foo = s + i");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.checkModel(_builder);
  }
  
  @Test
  public void testAccessToOutput() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.hello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp(String s, int i) output Boolean b {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("b != null");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.checkModel(_builder);
  }
  
  @Test
  public void testAssignToOutput() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.hello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp(String s, int i) output Boolean b {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("b = (s != null)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.checkModel(_builder);
  }
  
  @Test
  public void testWrongAssignToInputParam() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello my.test.hello {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("op myOp(String s, int i) output Boolean b {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("s = null");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _xAssignment = XbasePackage.eINSTANCE.getXAssignment();
      this._validationTestHelper.assertError(_parse, _xAssignment, 
        IssueCodes.ASSIGNMENT_TO_FINAL);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWrongAssignToOutputParam() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello my.test.hello {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("op myOp(String s, int i) output Boolean b {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("b = s");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _xFeatureCall = XbasePackage.eINSTANCE.getXFeatureCall();
      this._validationTestHelper.assertError(_parse, _xFeatureCall, 
        IssueCodes.INCOMPATIBLE_TYPES);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidReturn() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello my.test.hello {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("op myOp(String s, int i) output Boolean b {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return true");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _xReturnExpression = XbasePackage.eINSTANCE.getXReturnExpression();
      this._validationTestHelper.assertError(_parse, _xReturnExpression, 
        IssueCodes.INVALID_RETURN, 
        "Explicit return not available in this language.");
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Model checkModel(final CharSequence prog) {
    try {
      Model _xblockexpression = null;
      {
        final Model model = this._parseHelper.parse(prog);
        Assert.assertNotNull(model);
        this._validationTestHelper.assertNoErrors(model);
        _xblockexpression = (model);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
