package org.xtext.example.helloxvars.tests

import com.google.inject.Inject
import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.xbase.XbasePackage
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.helloxvars.HelloXvarsInjectorProvider
import org.xtext.example.helloxvars.helloXvars.Greeting
import org.xtext.example.helloxvars.helloXvars.Model

@InjectWith(typeof(HelloXvarsInjectorProvider))
@RunWith(typeof(XtextRunner))
class HelloXvarsParserTest {

	@Inject
	ParseHelper<Model> parser

	@Inject extension ValidationTestHelper

	@Test
	def void testParsingAndLinking() {
		parser.parse('''Hello foo from new String()!''').assertNoErrors
	}

	@Test
	def void testParsingAndLinkingWithVars() {
		parser.parse('''
			val s = 'foo'
			Hello foo from new String(s)!
		''').assertNoErrors
	}

	@Test
	def void testParsingAndLinkingWithMissingVar() {
		parser.parse('''
			Hello foo from new String(s)!
		''').assertError(XbasePackage::eINSTANCE.XFeatureCall,
				Diagnostic::LINKING_DIAGNOSTIC,
				"Couldn't resolve reference to JvmIdentifiableElement 's'.")
	}
    
    @Test
    def void testExpression() {
		val model = parser.parse("Hello foo from new String()!")
		val greeting = model.greetings.head as Greeting
	}
}