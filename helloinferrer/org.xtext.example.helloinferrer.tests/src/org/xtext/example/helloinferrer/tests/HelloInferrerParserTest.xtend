package org.xtext.example.helloinferrer.tests

import com.google.inject.Inject
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.xbase.validation.IssueCodes
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.helloinferrer.HelloInferrerInjectorProvider
import org.xtext.example.helloinferrer.helloInferrer.Model
import org.junit.Assert

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloInferrerInjectorProvider))
class HelloInferrerParserTest {
	
	@Inject extension ParseHelper<Model>
	
	@Inject extension ValidationTestHelper
	
	@BeforeClass
	def static void setNewLine() {
		System::setProperty("line.separator", "\n")
	}
	
	@Test
	def void testOperation() {
		'''
		Hello my.test.hello {
			op myOp(String s, int i) output Boolean b {
				val foo = s + i
			}
		}
		'''.checkModel
	}

	@Test
	def void testImports() {
		'''
		import java.util.Date
		import java.io.BufferedInputStream
		
		Hello my.test.hello {
			op myOp(String s, int i) output Boolean b {
				val date = new Date
				val is = new BufferedInputStream(null, 0)
				val foo = s + i
			}
		}
		'''.checkModel
	}
	
	@Test
	def void testAccessToOutput() {
		'''
		Hello my.test.hello {
			op myOp(String s, int i) output Boolean b {
				b != null
			}
		}
		'''.checkModel
	}
	
	@Test
	def void testAssignToOutput() {
		'''
		Hello my.test.hello {
			op myOp(String s, int i) output Boolean b {
				b = (s != null)
			}
		}
		'''.checkModel
	}
	
	@Test
	def void testWrongAssignToInputParam() {
		'''
		Hello my.test.hello {
			op myOp(String s, int i) output Boolean b {
				s = null
			}
		}
		'''.parse.assertError(
			XbasePackage::eINSTANCE.XAssignment,
			IssueCodes::ASSIGNMENT_TO_FINAL
		)
	}
	
	@Test
	def void testWrongAssignToOutputParam() {
		'''
		Hello my.test.hello {
			op myOp(String s, int i) output Boolean b {
				b = s
			}
		}
		'''.parse.assertError(
			XbasePackage::eINSTANCE.XFeatureCall,
			IssueCodes::INCOMPATIBLE_TYPES
		)
	}
	
	@Test
	def void testInvalidReturn() {
		'''
		Hello my.test.hello {
			op myOp(String s, int i) output Boolean b {
				return true
			}
		}
		'''.parse.assertError(
			XbasePackage::eINSTANCE.XReturnExpression,
			IssueCodes::INVALID_RETURN,
			"Explicit return not available in this language."
		)
	}
	
	@Test
	def void testInvalidPrimitiveType() {
		'''
		Hello my.test.hello {
			op myOp(String s, int i) output boolean b {
				return true
			}
		}
		'''.parse.assertError(
			TypesPackage::eINSTANCE.jvmTypeReference,
			IssueCodes::INVALID_USE_OF_TYPE,
			"Primitive types cannot be used as output parameters."
		)
	}
	
	def checkModel(CharSequence prog) {
		val model = prog.parse
		Assert::assertNotNull(model)
		model.assertNoErrors
		model
	}
	
}