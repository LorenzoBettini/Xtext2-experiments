/*
* generated by Xtext
*/
package org.xtext.example.hellocustomecore;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HelloCustomEcoreStandaloneSetup extends HelloCustomEcoreStandaloneSetupGenerated{

	public static void doSetup() {
		new HelloCustomEcoreStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	@Override
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.xtext.org/example/hellocustomecore/HelloCustomEcore")) {
			EPackage.Registry.INSTANCE.put("http://www.xtext.org/example/hellocustomecore/HelloCustomEcore", org.xtext.example.hellocustomecore.hellocustomecore.HellocustomecorePackage.eINSTANCE);
		}
		super.register(injector);
	}
}

