package org.xtext.example.helloinferrer.tests;

import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.EclipseRuntimeDependentJavaCompiler;
import org.xtext.example.helloinferrer.runtime.HelloResult;

/**
 * This is useful only for Tycho builds, since the tests are run as Junit
 * plugins, and the -classpath would be empty in that case.
 * 
 * @author bettini
 * 
 */
@SuppressWarnings("restriction")
public class HelloInferrerOnTheFlyJavaCompiler extends
		EclipseRuntimeDependentJavaCompiler {
	@Override
	public String getClasspathArgs() {
		addClassPathOfClass(HelloResult.class);

		return super.getClasspathArgs();
	}
}
