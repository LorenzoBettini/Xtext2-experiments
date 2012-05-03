package org.xtext.example.helloinferrer.tests;

import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler;

/**
 * This is useful only for Tycho builds, since the tests are run
 * as Junit plugins, and the -classpath would be empty in that case.
 * 
 * @author bettini
 *
 */
@SuppressWarnings("restriction")
public class HelloInferrerOnTheFlyJavaCompiler extends OnTheFlyJavaCompiler {
	@Override
	public String getClasspathArgs() {
		String classpathArgs = super.getClasspathArgs();
		
		if ("-classpath".equals(classpathArgs.trim())) {
			return "-classpath .";
		}
		
		return classpathArgs;
	}
}
