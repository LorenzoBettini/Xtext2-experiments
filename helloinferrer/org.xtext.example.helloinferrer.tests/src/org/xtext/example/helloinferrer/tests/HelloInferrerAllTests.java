package org.xtext.example.helloinferrer.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	HelloInferrerParserTest.class,
	HelloInferrerCompilerTest.class
})
class HelloInferrerAllTests {
	
}