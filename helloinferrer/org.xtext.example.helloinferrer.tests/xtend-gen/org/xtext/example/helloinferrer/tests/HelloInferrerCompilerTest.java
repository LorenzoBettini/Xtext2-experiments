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
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloinferrer.tests.HelloInferrerInjectorProviderCustom;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(HelloInferrerInjectorProviderCustom.class)
public class HelloInferrerCompilerTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @BeforeClass
  public static void setNewLine() {
    System.setProperty("line.separator", "\n");
  }
  
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
  
  @Test
  public void testInitializationOfOututParameter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.MyHello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOpWithClassOutputParameter(String s, int i) output Boolean b {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOpWithBasicOutputParameter(String s, int i) output boolean b {");
    _builder.newLine();
    _builder.append("\t\t");
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
    _builder_1.append("public void myOpWithClassOutputParameter(final String s, final int i) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Boolean b = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void myOpWithBasicOutputParameter(final String s, final int i) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("boolean b = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_builder, _builder_1);
  }
  
  @Test
  public void testAccessThis() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.MyHello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp(String s, int i) output Boolean b {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("myOp2(true, \'foo\')");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.myOp2(true, \'foo\')");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp2(boolean b, String s) output int i {");
    _builder.newLine();
    _builder.append("\t\t");
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
    _builder_1.append("this.myOp2(true, \"foo\");");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("this.myOp2(true, \"foo\");");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void myOp2(final boolean b, final String s) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("int i = null; // output parameter");
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
