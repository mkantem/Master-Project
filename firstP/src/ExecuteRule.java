import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import grammar.ConnexionInstruction;
import grammar.Embedding;
import grammar.Grammar;
import grammar.GrammarPackage;
import grammar.Rule;
import graph.Edge;
import graph.Graph;
import graph.GraphFactory;
import graph.GraphPackage;
import graph.Node;

public class ExecuteRule implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	private MessageConsole findConsole(String name) {
	      ConsolePlugin plugin = ConsolePlugin.getDefault();
	      IConsoleManager conMan = plugin.getConsoleManager();
	      IConsole[] existing = conMan.getConsoles();
	      for (int i = 0; i < existing.length; i++)
	         if (name.equals(existing[i].getName()))
	            return (MessageConsole) existing[i];
	      //no console found, so create a new one
	      MessageConsole myConsole = new MessageConsole(name, null);
	      conMan.addConsoles(new IConsole[]{myConsole});
	      return myConsole;
	   }
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		MessageConsole myConsole = findConsole("graph transformation console");
	    MessageConsoleStream out = myConsole.newMessageStream();
		out.println("host graph");
		 Graph a =loadGraph("file:///E:/bara/runtime-EclipseApplication/Eg1/host.graph");
			out.println("loaded: " + a);

		 Grammar g= loadGrammar("file:///E:/bara/runtime-EclipseApplication/xx/M.grammar");
			executeGrammar(a,g);
			
			out.println("Resulat: " + a);
			return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}
	
	public  void supprimer(Graph gr, Node n)
	   {
		String label = n.getName();
		gr.getNodes().remove(n);
		EList<Edge> edge= gr.getEdges();
		for(int i=0; i<edge.size() ;i++)
		{
		     Edge e=edge.get(i);
		  
		     if (label.equals(e.getSource().getName()) || label.equals(e.getTarget().getName())) 
		     {
		    	 System.out.println(e);
		    	 gr.getEdges().remove(e);
		    	 i--;
		     }
		}
		gr.getEdges().remove(n);
		System.out.println("node "+n.getName()+" deleted");
		}
	
	private static void ajouter(Graph H, Graph D, Embedding C) {
		EList<Node> Vd = D.getNodes();
		EList<Node> nh = H.getNodes();
		System.out.println(Vd.size());
	    for(int i=0;i<Vd.size();i++)
	    {
			Node nd= Vd.get(i);
			Node node = GraphFactory.eINSTANCE.createNode();
		    node.setName(nd.getName());
		    node.markNode();
		    node.setParent(H);
		    for(int j=0;j<C.getInstructions().size();j++)
			 {
				 ConnexionInstruction e = C.getInstructions().get(j); 
				 for(int k=0;k<nh.size();k++) 
				 {
					Node n = nh.get(k);
				    int	m=n.Mark();
					if (m==0) 
					{
						if(n.getName().equals(e.getM()) && nd.getName().equals(e.getD().getName()))
						{
							Edge edge = GraphFactory.eINSTANCE.createEdge();
							edge.setSource(n);  
							edge.setTarget(nd);
							edge.setParent(H);
						}
		
				 }
			 }
	    }
	    }
	    
	  // tissage(H,C);
	}


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

	public void saveGraph (Graph graph)

	{

	}

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
			System.out.println(g);
			return g;		
			}
		catch (IOException e)
		{
		System.out.println("failed to read from "+ uriGrammar);
		return null;
		}
	}


	//execute a grammar on a graph
	public  void executeGrammar (Graph gr, Grammar G ) 
	   
	   {  
		  EList<Rule> rules = G.getRules();
		  
		  Iterator<Rule> R =rules.iterator();
		  while(R.hasNext())
		  {
			  Rule rul =R.next();
			//  System.out.println("Rule");
			//  System.out.println(rul.getLhs().getNode());
			//  System.out.println(rul.getRhs().getSubGraph());
			  executeRule(gr,rul );  
		  }
	  
	}
		

	//Only one rule 
	public static int pos = -1;
	public  void executeRule (Graph gr, Rule r) {
		
		EList<Node> nds = gr.getNodes();  
		//List<Integer> array = new ArrayList();
		
	    Node LHSNode = r.getLhs().getNode();
		
		pos=occurence(nds, pos, LHSNode);
		if (pos==-1)  System.out.println("Aucune occurence de "+ LHSNode); 
		else {
				supprimer(gr,nds.get(pos)); 
				ajouter(gr,r.getRhs().getSubGraph(), r.getEmbeddingMechanism());
			}	
	/*	if (pos != nds.size()) 
		{
			occurence(nds, pos, LHSNode);
			supprimer(gr,nds.get(pos)); 
			ajouter(gr,r.getRhs().getSubGraph(), r.getEmbeddingMechanism());
		}*/

	  }

	private static int occurence(EList<Node> nds, int pos, Node lHSNode) {
		// TODO Auto-generated method stub
		for(int i=pos;i<nds.size();i++)
		{
			if (i == -1) 
			{
				i=0;
			}
	        Node n =nds.get(i);
			if (n.equals(lHSNode))
			{
			pos = i;
			break;
			} 
		}
		return pos;
	}

	
}
