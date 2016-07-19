package graph_grammar__plugins;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import grammar.Grammar;
import grammar.GrammarPackage;


public class LoadGrammar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrammarPackage grammarPackage = GrammarPackage.eINSTANCE;
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("grammar", new XMIResourceFactoryImpl());
		URI uriGrammar = URI.createURI("file:///E:/Etudes/Master 2/pfe/runtime-New_configuration/Test/My.graph");
		Resource resourceGrammar = resourceSet.getResource(uriGrammar,true);
		
		try
		{
			
			resourceGrammar.load(null);
			Grammar Grm = (Grammar)resourceGrammar.getContents().get(0);
			System.out.println("******The Grammar********");
			System.out.println("loaded: " + Grm);
			System.out.println("******The Grammar********");
		}
		catch (IOException e)
		{
		System.out.println("failed to read from " );
		}

				
	
	

	}

}
