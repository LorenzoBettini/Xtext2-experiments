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
import org.xtext.example.helloxvars.helloXvars.Model

@InjectWith(typeof(HelloXvarsInjectorProvider))
@RunWith(typeof(XtextRunner))
class HelloXvarsParserTest {

	@Inject
	ParseHelper<Model> parser

	@Inject extension ValidationTestHelper

	@Test
	def void testParsingAndLinking() {
		parser.parse("Hello foo from new String()!").assertNoErrors
	}

	@Test
	def void testParsingAndLinkingWithVars() {
		parser.parse("
			val s1 = 'foo'
			val s2 = 'bar'
			val s3 = s1 + s2
			Hello foo from new String(s3)!
		").assertNoErrors
	}
	
	@Test
	def void testParsingAndLinkingWithClosures() {
		parser.parse("
			val s1 = 'foo'
			val s2 = 'bar'
			val s3 = s1 + [ s | s.toFirstLower + s1 ].apply(s2 + s1)
			Hello foo from new String(s3)!
		").assertNoErrors
	}

	@Test
	def void testParsingAndLinkingWithMissingVar() {
		parser.parse("
			Hello foo from new String(s)!
		").assertError(XbasePackage::eINSTANCE.XFeatureCall,
				Diagnostic::LINKING_DIAGNOSTIC,
				"Couldn't resolve reference to JvmIdentifiableElement 's'.")
	}

	@Test
	def void testParsingAndLinkingWithWrongVarOrder() {
		parser.parse("
			val s1 = s2
			val s2 = s1
			Hello foo from new String(s1)!
		").assertError(XbasePackage::eINSTANCE.XFeatureCall,
				Diagnostic::LINKING_DIAGNOSTIC,
				"Couldn't resolve reference to JvmIdentifiableElement 's2'.")
	}
    
}