package org.xtext.example.helloinferrer.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.helloinferrer.HelloInferrerInjectorProvider

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloInferrerInjectorProvider))
class HelloInferrerCompilerTest {
	
	@Inject extension CompilationTestHelper
	
	@Test
	def void testGeneratedJava() {
		'''
		Hello my.test.MyHello {
			
		}
		'''.assertCompilesTo(
		'''
		package my.test;

		public class MyHello {
		}
		'''
		)
	}

	
}