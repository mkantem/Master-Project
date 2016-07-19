package read_write;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import graph.Graph;
import graph.GraphPackage;

public class Graph_RW {

	public static Graph loadGraph(String path){
		GraphPackage graphPackage = GraphPackage.eINSTANCE;
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("graph", new XMIResourceFactoryImpl());
		URI uriGraph = URI.createURI(path);
		Resource resourceGraph = resourceSet.getResource(uriGraph,true);
		try
		{
			resourceGraph.load(null);
			Graph g = (Graph)resourceGraph.getContents().get(0);
			return g;
		}
		catch (IOException e)
		{
		System.out.println("failed to read from " +  uriGraph );
		return null;
		}
		
	}

	public static void saveGraph (Graph graph)

	{
		Resource resourceGraph = graph.eResource();// resourceSet.getResource(uriGraph,true);
			
			try 
			{
				resourceGraph.save(null);
		 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			//	out.println("saving problem\n"+e.getMessage() );
			}	
		
		// out.println("saved");
	         }

    }
