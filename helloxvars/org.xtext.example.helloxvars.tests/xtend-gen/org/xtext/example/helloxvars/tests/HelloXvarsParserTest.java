package org.xtext.example.helloxvars.tests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloxvars.HelloXvarsInjectorProvider;
import org.xtext.example.helloxvars.helloXvars.Model;

@InjectWith(value = HelloXvarsInjectorProvider.class)
@RunWith(value = XtextRunner.class)
@SuppressWarnings("all")
public class HelloXvarsParserTest {
  @Inject
  private ParseHelper<Model> parser;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testParsingAndLinking() {
    try {
      Model _parse = this.parser.parse("Hello foo from new String()!");
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingAndLinkingWithVars() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("val s1 = \'foo\'");
      _builder.newLine();
      _builder.append("val s2 = \'bar\'");
      _builder.newLine();
      _builder.append("val s3 = s1 + s2");
      _builder.newLine();
      _builder.append("Hello foo from new String(s3)!");
      _builder.newLine();
      Model _parse = this.parser.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingAndLinkingWithClosures() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("val s1 = \'foo\'");
      _builder.newLine();
      _builder.append("val s2 = \'bar\'");
      _builder.newLine();
      _builder.append("val s3 = s1 + [ s | s.toFirstLower + s1 ].apply(s2 + s1)");
      _builder.newLine();
      _builder.append("Hello foo from new String(s3)!");
      _builder.newLine();
      Model _parse = this.parser.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingAndLinkingWithMissingVar() {
    try {
      Model _parse = this.parser.parse("Hello foo from new String(s)!");
      EClass _xFeatureCall = XbasePackage.eINSTANCE.getXFeatureCall();
      this._validationTestHelper.assertError(_parse, _xFeatureCall, 
        Diagnostic.LINKING_DIAGNOSTIC, 
        "Couldn\'t resolve reference to JvmIdentifiableElement \'s\'.");
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingAndLinkingWithWrongVarOrder() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("val s1 = s2");
      _builder.newLine();
      _builder.append("val s2 = s1");
      _builder.newLine();
      _builder.append("Hello foo from new String(s1)!");
      _builder.newLine();
      Model _parse = this.parser.parse(_builder);
      EClass _xFeatureCall = XbasePackage.eINSTANCE.getXFeatureCall();
      this._validationTestHelper.assertError(_parse, _xFeatureCall, 
        Diagnostic.LINKING_DIAGNOSTIC, 
        "Couldn\'t resolve reference to JvmIdentifiableElement \'s2\'.");
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
