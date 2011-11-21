package org.xtext.example.hellojvmtypes.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractHelloJvmTypesJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.example.hellojvmtypes.helloJvmTypes.HelloJvmTypesPackage.eINSTANCE);
		return result;
	}

}
