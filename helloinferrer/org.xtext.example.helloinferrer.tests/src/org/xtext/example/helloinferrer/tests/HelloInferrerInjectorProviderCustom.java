package org.xtext.example.helloinferrer.tests;

import org.xtext.example.helloinferrer.HelloInferrerInjectorProvider;
import org.xtext.example.helloinferrer.HelloInferrerRuntimeModule;
import org.xtext.example.helloinferrer.HelloInferrerStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class HelloInferrerInjectorProviderCustom extends
		HelloInferrerInjectorProvider {

	@Override
	protected Injector internalCreateInjector() {
		return new HelloInferrerStandaloneSetup() {
			@Override
			public Injector createInjector() {
				return Guice.createInjector(new HelloInferrerRuntimeModule() {
					@Override
					public ClassLoader bindClassLoaderToInstance() {
						return HelloInferrerInjectorProviderCustom.class
								.getClassLoader();
					}
				});
			}
		}.createInjectorAndDoEMFRegistration();
	}
}
