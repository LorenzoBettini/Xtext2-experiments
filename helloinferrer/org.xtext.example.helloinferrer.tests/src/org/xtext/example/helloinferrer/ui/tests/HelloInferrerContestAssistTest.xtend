package org.xtext.example.helloinferrer.ui.tests

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.junit.ui.AbstractContentAssistTest
import org.junit.runner.RunWith
import org.xtext.example.helloinferrer.HelloInferrerUiInjectorProvider
import org.junit.Test

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloInferrerUiInjectorProvider))
class HelloInferrerContestAssistTest extends AbstractContentAssistTest {
	
	@Test def void testParameterCompletion() {
		newBuilder.append(
		'''
		Hello my.test.hello {
			op myOp(String myString, int i) output Boolean b {
				myS'''
		).assertText("myString")
	}
}