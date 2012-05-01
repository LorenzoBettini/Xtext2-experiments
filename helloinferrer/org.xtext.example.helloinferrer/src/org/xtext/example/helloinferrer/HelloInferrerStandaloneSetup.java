
package org.xtext.example.helloinferrer;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HelloInferrerStandaloneSetup extends HelloInferrerStandaloneSetupGenerated{

	public static void doSetup() {
		new HelloInferrerStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

