import java.util.Arrays;

import org.atlanmod.emfviews.core.View;
import org.atlanmod.emfviews.core.Viewpoint;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

public class CreateView {
	{
	// 1. Create viewpoint
	Viewpoint viewpoint = new Viewpoint(Arrays.asList(UMLPackage.eINSTANCE));
	// 2. Create model
	UMLFactory f=UMLFactory.eINSTANCE;
	Component C1 = f.createComponent();
	C1.setName("Comp1");
	Component C2 = f.createComponent();
	C2.setName("Comp2");
	

	Resource model = new ResourceImpl();
	model.getContents().addAll(Arrays.asList(C1, C2));
	
	View view = new View(viewpoint, Arrays.asList(model));

	for (EObject o : view.getVirtualContents()) {
		  System.out.println(o.eGet(o.eClass().getEStructuralFeature("name")));
		}
}}