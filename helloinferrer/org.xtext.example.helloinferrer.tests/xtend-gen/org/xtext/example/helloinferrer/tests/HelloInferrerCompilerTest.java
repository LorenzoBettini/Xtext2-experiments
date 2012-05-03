package org.xtext.example.helloinferrer.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloinferrer.tests.HelloInferrerInjectorProviderCustom;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(HelloInferrerInjectorProviderCustom.class)
public class HelloInferrerCompilerTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void testGeneratedJavaClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.MyHello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.test;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
  }
  
  @Test
  public void testGeneratedJavaMethod() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.MyHello {");
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
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.test;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void myOp(final String s, final int i) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Boolean b = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("final String foo = (s + Integer.valueOf(i));");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_builder, _builder_1);
  }
  
  @Test
  public void testAccessToOututParameter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.MyHello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp(String s, int i) output Boolean b {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("b = true");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.test;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void myOp(final String s, final int i) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Boolean b = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("b = Boolean.valueOf(true);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_builder, _builder_1);
  }
  
  private void assertCorrectJavaCodeGeneration(final CharSequence input, final CharSequence expected) {
    final Procedure1<Result> _function = new Procedure1<Result>() {
        public void apply(final Result it) {
          String _string = expected.toString();
          String _generatedCode = it.getGeneratedCode();
          Assert.assertEquals(_string, _generatedCode);
          it.getCompiledClass();
        }
      };
    this._compilationTestHelper.compile(input, new IAcceptor<Result>() {
        public void accept(Result t) {
          _function.apply(t);
        }
    });
  }
}
