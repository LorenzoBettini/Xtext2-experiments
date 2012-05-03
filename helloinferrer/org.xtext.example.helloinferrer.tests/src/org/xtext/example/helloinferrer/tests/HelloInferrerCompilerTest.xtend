package org.xtext.example.helloinferrer.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.xtext.example.helloinferrer.HelloInferrerInjectorProvider

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloInferrerInjectorProvider))
class HelloInferrerCompilerTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	@Test
	def void testGeneratedJava() {
		
	}

	
}