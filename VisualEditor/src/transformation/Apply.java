package transformation;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.util.EList;

import grammar.Rule;
import graph.Graph;
import graph.Node;

public class Apply {

	 private void executeRuleI(Graph gr, Rule rul) {
			// TODO Auto-generated method stub

		    List positions = new LinkedList(); // liste qui contient les positions
		    Object x ;
			EList<Node> nds = gr.getNodes();  
			
		    Node LHSNode = rul.getLhs().getNode();
			
			//positions=occurenceI(nds, LHSNode);
		
			//if (positions==null)  out.println("Aucune occurence de "+ LHSNode); 
			//else {  //suppression et ajout en mm temps
				    
					//supprimer(gr,nds.get(pos)); 
					//ajouter(gr,rul.getRhs().getSubGraph(), rul.getEmbeddingMechanism());
				 ListIterator li = positions.listIterator();

			      while(li.hasNext())
			      {
			    	 x=li.next();
			    	//  out.println((String) x);
			    	  System.out.println( x);
			      }
			        

	// }	
			
		}
	 public static int occurence(EList<Node> nds, int pos, Node lHSNode) {
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
