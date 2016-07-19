package graph_grammar__plugins;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import grammar.Grammar;
import grammar.GrammarPackage;
import graph.Graph;
import graph.GraphPackage;

public class LoadGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphPackage graphPackage = GraphPackage.eINSTANCE;
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("graph", new XMIResourceFactoryImpl());
		URI uriGraph = URI.createURI("file:///E:/Etudes/Master 2/pfe/runtime-New_configuration/Test/My.graph");
		Resource resourceGraph = resourceSet.getResource(uriGraph,true);
		
		try
		{
			
			resourceGraph.load(null);
			Graph G = (Graph)resourceGraph.getContents().get(0);
			System.out.println("******The Graph********");
			//{[List of vertex....], [list of link (source,dest), ..... ]}
			System.out.println("loaded: " + G);
			System.out.println("******The Graph********");
			System.out.println("");
			//Print only Nodes
			System.out.println("Different Nodes are " + G.getNodes());
			//Print only Edges
			System.out.println("Different Edges are " + G.getEdges());
			
		}
		catch (IOException e)
		{
		System.out.println("failed to read from " );
		}

				
	
	

	}

}
