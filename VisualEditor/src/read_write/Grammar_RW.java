package read_write;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import grammar.Grammar;
import grammar.GrammarPackage;
import graph.GraphPackage;

public class Grammar_RW {

	public static Grammar loadGrammar(String path){
		GraphPackage graphPackage = GraphPackage.eINSTANCE;
		GrammarPackage grammarPackage = GrammarPackage.eINSTANCE;
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("graph", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("grammar", new XMIResourceFactoryImpl());	
		URI uriGrammar = URI.createURI(path);
		Resource resourceGrammar = resourceSet.getResource(uriGrammar,true);
		
		try
		{
			resourceGrammar.load(null);
			
			Grammar g = (Grammar)resourceGrammar.getContents().get(0);
			//System.out.println(g);
			return g;		
			}
		catch (IOException e)
		{
		System.out.println("failed to read from "+ uriGrammar);
		return null;
		}
	}

}
