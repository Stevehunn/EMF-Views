package fr.alma.website.plugin;

import fr.alma.web.model.webmodel.Folder;
import fr.alma.web.model.webmodel.Site;
import fr.alma.web.model.webmodel.WebmodelFactory;
import fr.alma.web.model.webmodel.WebmodelPackage;

public class Main {

	public static void main(String[] args) {
		WebmodelPackage wPackage = WebmodelPackage.eINSTANCE;
		WebmodelFactory factory = wPackage.getWebmodelFactory();

		Site site = factory.createSite();
		site.setTitle("Alma website");

		Folder root = factory.createFolder();
		root.setName("root");

		site.getFolders().add(root);
		
		

	}
	
	/*
	 * Je ne sais pas ou le mettre
	// Association de l'extension 'webmodel' au
			// format de persistance XMI :

			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("webmodel", new XMIResourceFactoryImpl());
	*/
}
