package org.xtext.example.helloinferrer.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloinferrer.HelloInferrerInjectorProvider;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(HelloInferrerInjectorProvider.class)
public class HelloInferrerCompilerTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  private ReflectExtensions _reflectExtensions;
  
  @Test
  public void testGeneratedJava() {
  }
}
