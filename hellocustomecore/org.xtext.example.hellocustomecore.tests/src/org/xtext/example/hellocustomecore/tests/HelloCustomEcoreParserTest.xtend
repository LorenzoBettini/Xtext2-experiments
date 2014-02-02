package org.xtext.example.hellocustomecore.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.hellocustomecore.HelloCustomEcoreInjectorProvider
import org.xtext.example.hellocustomecore.hellocustomecore.Model

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloCustomEcoreInjectorProvider))
class HelloCustomEcoreParserTest {
	
	@Inject extension ParseHelper<Model>
	
	@Inject extension ValidationTestHelper
	
	@BeforeClass
	def static void setNewLine() {
		System::setProperty("line.separator", "\n")
	}
	
	@Test
	def void testHello() {
		'''
		Hello foo!
		'''.parse.assertNoErrors
	}

	@Test
	def void testGreeting() {
		'''
		import java.util.Date
		
		Greeting foo {
			(new Date).toString
		}
		'''.parse.assertNoErrors
	}
	
}