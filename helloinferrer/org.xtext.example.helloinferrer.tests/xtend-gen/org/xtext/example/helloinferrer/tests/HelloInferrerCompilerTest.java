package org.xtext.example.helloinferrer.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloinferrer.tests.HelloInferrerInjectorProviderCustom;

@RunWith(value = XtextRunner.class)
@InjectWith(value = HelloInferrerInjectorProviderCustom.class)
@SuppressWarnings("all")
public class HelloInferrerCompilerTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @BeforeClass
  public static void setNewLine() {
    System.setProperty("line.separator", "\n");
  }
  
  @Test
  public void testGeneratedJavaClass() {
    try {
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
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
    _builder_1.append("import org.xtext.example.helloinferrer.runtime.HelloResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Boolean> myOp(final String s, final int i) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Boolean b = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("final String foo = (s + Integer.valueOf(i));");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Boolean>(b);");
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
    _builder_1.append("import org.xtext.example.helloinferrer.runtime.HelloResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Boolean> myOp(final String s, final int i) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Boolean b = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("b = Boolean.valueOf(true);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Boolean>(b);");
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
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package my.test;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import org.xtext.example.helloinferrer.runtime.HelloResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Boolean> myOpWithClassOutputParameter(final String s, final int i) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Boolean b = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Boolean>(b);");
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
    _builder.append("op myOp2(boolean b, String s) output Integer i {");
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
    _builder_1.append("import org.xtext.example.helloinferrer.runtime.HelloResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Boolean> myOp(final String s, final int i) {");
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
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Boolean>(b);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Integer> myOp2(final boolean b, final String s) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Integer i = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Integer>(i);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_builder, _builder_1);
  }
  
  @Test
  public void testAutomaticBoxing() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello my.test.MyHello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op myOp(String s, int j) output Integer i {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("i = j + 1");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (i < 0)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("i = 1");
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
    _builder_1.append("import org.xtext.example.helloinferrer.runtime.HelloResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Integer> myOp(final String s, final int j) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Integer i = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("int _plus = (j + 1);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("i = Integer.valueOf(_plus);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("boolean _lessThan = ((i).intValue() < 0);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("if (_lessThan) {");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("i = Integer.valueOf(1);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Integer>(i);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_builder, _builder_1);
  }
  
  @Test
  public void testUseOfResult() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello MyHello {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op foo(int j) output Integer i {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("i = new MyHello().bar(this).value.bar2().value");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op bar(MyHello myHello) output MyHello result {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("result = myHello");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("op bar2() output Integer res {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("res = 10");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import org.xtext.example.helloinferrer.runtime.HelloResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class MyHello {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Integer> foo(final int j) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Integer i = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("MyHello _myHello = new MyHello();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("HelloResult<MyHello> _bar = _myHello.bar(this);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("MyHello _value = _bar.getValue();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("HelloResult<Integer> _bar2 = _value.bar2();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Integer _value_1 = _bar2.getValue();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("i = _value_1;");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Integer>(i);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<MyHello> bar(final MyHello myHello) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("MyHello result = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("result = myHello;");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<MyHello>(result);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public HelloResult<Integer> bar2() {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Integer res = null; // output parameter");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("res = Integer.valueOf(10);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return new HelloResult<Integer>(res);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCorrectJavaCodeGeneration(_builder, _builder_1);
  }
  
  private void assertCorrectJavaCodeGeneration(final CharSequence input, final CharSequence expected) {
    try {
      final Procedure1<Result> _function = new Procedure1<Result>() {
          public void apply(final Result it) {
            String _string = expected.toString();
            String _singleGeneratedCode = it.getSingleGeneratedCode();
            Assert.assertEquals(_string, _singleGeneratedCode);
            it.getCompiledClass();
          }
        };
      this._compilationTestHelper.compile(input, new IAcceptor<Result>() {
          public void accept(Result t) {
            _function.apply(t);
          }
      });
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
