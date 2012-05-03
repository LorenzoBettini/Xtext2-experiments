package org.xtext.example.helloinferrer.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.helloinferrer.HelloInferrerInjectorProvider
import org.xtext.example.helloinferrer.helloInferrer.Model
import junit.framework.Assert

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloInferrerInjectorProvider))
class HelloInferrerParserTest {
	
	@Inject extension ParseHelper<Model>
	
	@Inject extension ValidationTestHelper
	
	@Test
	def void testGeneratedJava() {
		'''
		Hello my.test.hello {
			op myOp(String s, int i) output Boolean b {
				//val foo = s + i
			}
		}
		'''.checkModel
	}
	
	def checkModel(CharSequence prog) {
		val model = prog.parse
		Assert::assertNotNull(model)
		model.assertNoErrors
		model
	}
	
}