package transformation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import grammar.ConnexionInstruction;
import grammar.Embedding;
import grammar.Grammar;
import grammar.GrammarPackage;
import grammar.LHS;
import grammar.Rule;
import graph.Edge;
import graph.Graph;
import graph.GraphFactory;
import graph.GraphPackage;
import graph.Node;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
	
		//System.out.println("host graph");
 //Graph a =loadGraph("file:///E:/bara/runtime-EclipseApplication/Eg1/host.graph");
//	System.out.println("loaded: " + a);
	  // System.out.println("X vers D ");
	// Graph b =loadGraph("file:///E:/bara/runtime-EclipseApplication/Eg1/d1.graph");
		//System.out.println("loaded: " + b);

 Grammar g= loadGrammar("file:///E:/bara/runtime-EclipseApplication/xx/prio_eg.grammar");
//	System.out.println("loaded: " + g);
	
	/*EList<Node> n=b.getNodes();
	Iterator<Node> i=n.iterator();
	while(i.hasNext())
	{
		Node t=i.next();
		Node x = X;
		if (t.equals(x)) { b.getNodes().remove(t); }
	}*/
	
	//executeGrammar(a,g);
	
	//System.out.println("Resulat: " + a);
 System.out.println(" Avant " + g.getRules());
 EList<Rule> rules = g.getRules();
 EList<Rule> rules_ordonnee = priorite(rules); // ordonné par rapport au priorité
 System.out.println(" Après " +rules_ordonnee);
	
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
		//System.out.println(g);
		return g;		
		}
	catch (IOException e)
	{
	System.out.println("failed to read from "+ uriGrammar);
	return null;
	}
}


//execute a grammar on a graph
public static void executeGrammar (Graph gr, Grammar G ) 
   
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
public static void executeRule (Graph gr, Rule r) {
	
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
	   
	 private static void tissage(Graph H, Embedding C) {
	// TODO Auto-generated method stub
		 EList<Node> nh = H.getNodes();
		 for(int j=0;j<C.getInstructions().size();j++)
		 {
			 ConnexionInstruction e = C.getInstructions().get(j); 
			 for(int k=0;k<nh.size();k++) 
			 {
				Node n = nh.get(k);
			    int	m=n.Mark();
				if (m==0) 
				{
					if(n.getName().equals(e.getM()) )
					{
						System.out.println(n);
						Edge edge = GraphFactory.eINSTANCE.createEdge();
						
					   for(int z=0;z<nh.size();z++) 
					   {
						   Node nhh = nh.get(k);
						   int	mar=n.Mark();
							if (mar==1) { 
								//System.out.println(nhh);
								if (nhh.getName().equals(e.getD().getName()))
								{
									//System.out.println(nhh);
									edge.setSource(n);  
									edge.setTarget(nhh);
									edge.setParent(H);
								}
							}
						}
						
					}
				}
			}
		 } 
	
}


private static void supprimer(Graph gr, Node n)
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

//rule qui à la priorité
private static EList<Rule> priorite(EList<Rule> R) {
	
	Rule r;
	int min ;
	int p=-1;
    int last_p = -1;
 
	EList<Rule> rule_prio = R ; 

	EList<Rule> temp = R;
	int i=0;
	int temp1=0;
	 int m;
	
	while(temp1<=R.size())
	{
		
		min=temp.get(0).getPriority();
		for ( i=0; i<temp.size(); i++)
		{
			r = temp.get(i);
			m=r.Mark(); //System.out.println(m);
			if (m==0) 
			{
			if (r.getPriority() <= min)
			  {
				min = r.getPriority();
			//	System.out.println("min "+min);
			    p = i; //System.out.println(p + "p");
			 }
			}
		}
		if (p!= -1 && p!= last_p)
		{  
			rule_prio.remove(p);
			System.out.println(rule_prio);
			rule_prio.add(temp.get(p));
			//System.out.println(rule_prio);
			temp.get(p).unMarkRule();
			System.out.println(p + "p");
			last_p = p;
		}
		temp1++;
	}
		return rule_prio;
}


}