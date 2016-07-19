import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import annexstuff.StringStuff;
import annexstuff.Test_g_Stuff;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.FileEditorInput;
import org.osgi.service.prefs.Preferences;

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
import read_write.Grammar_RW;
import read_write.Graph_RW;
import transformation.Apply;

public class ExecuteRuleActionDelagate implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;
	private  MessageConsoleStream out=null;
	private MessageConsoleStream err=null;
	private IConsole myConsole;
	private IEditorPart editor;
	private IEditorInput input;
	private boolean graph_bool;
	private IEclipsePreferences preferences;
	private String path, run_p, emb_p, ex_p, save_p;

	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
	//***************récuperation des valeurs de préferences*****************	
		/*preferences = InstanceScope.INSTANCE.getNode("VE.test");
		  Preferences sub1 = preferences.node("node1");
		  Preferences sub2 = preferences.node("node2");
		  path = sub1.get("h1", "default"); 
		  run_p = sub2.get("h1", "default"); 
		  emb_p = sub2.get("h2", "default"); 
		  ex_p = sub2.get("h3", "default");
		  save_p = sub2.get("h4", "default"); 
		  out.println(path + run_p + emb_p + ex_p + save_p); */
		
		IWorkbenchPage page = this.window.getActivePage();
		ISelection selection = page.getSelection();
		String select = selection.toString();
		//out.println(select);
		
		//grammar name + celui du projet avec ] à la fin
		String grammar_n = StringStuff.Nameg(select);
		//grammar name + celui du projet sans ] à la fin
		String grammar_name = StringStuff.Delete_last(grammar_n);
	    
		//nom du grammar + extension just
		String grammarPath=  select.substring(select.lastIndexOf("/") + 1, select.lastIndexOf("]"));
	    
		    editor = page.getActiveEditor();
			
		    input = editor.getEditorInput();
		    IPath path = ((FileEditorInput)input).getPath();  
		    
		    String graphpath= path.toString();
		   // out.println(graphpath);
		    //nom du graphe + celui du project
		    String graph_name = StringStuff.Nameg(graphpath); 
		    //nom du graphe + extension just
		    String xxx =  graphpath.substring(graphpath.lastIndexOf("/") + 1);
		    
		//if (run_p=="choice2")  
		//{
		   if (Test_g_Stuff.isGraph(xxx))
		   {   
			   out.println("Graph active on editor is: "+ xxx);
			//  Graph a =Graph_RW.loadGraph("file:///E:/bara/runtime-EclipseApplication/"+ graph_name);
			  Graph a =Graph_RW.loadGraph("platform:/resource/"+graph_name);
			   out.println("The graph: " + a +"\n");
			   if (Test_g_Stuff.isGrammar(grammarPath)) 
			   {
				 out.println("Grammar Selected is: " + grammarPath);  
		       //  Grammar g= Grammar_RW.loadGrammar("file:///E:/bara/runtime-EclipseApplication/"+ grammar_name);
		         Grammar g =Grammar_RW.loadGrammar("platform:/resource/"+ grammar_name );
		         out.println("The grammar: "+g.toString() +"\n");
		         
		         executeGrammar(a,g, emb_p);
		         notification.LanceurNotification.not_validation();
		         show(a.toString().length());			
		         out.println(" \t FINAL RESULT: " + a + "\n");
		         show(a.toString().length());	
		         
		         String id = IConsoleConstants.ID_CONSOLE_VIEW;
			     IConsoleView view;
				 try {
					view = (IConsoleView) page.showView(id);
					view.display(myConsole);
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			   }
			   else 
				   {
				   notification.LanceurNotification.not_erreur("s");
				   out.println("File selected is not a Grammar, please check it again");
				   }
		   }
		   else
			   {
			   notification.LanceurNotification.not_erreur("a");
			   out.println("Current file open in editor is not a Graph, please check it again");
			   }
		/*} 
		
		else if(run_p=="choice1") 
		{
			 if (isGraph(grammarPath))
			   {   
				   out.println("Graph Selected is: "+ grammarPath);
				   Graph a =loadGraph("file:///E:/bara/runtime-EclipseApplication/xx/"+ grammarPath);
				   out.println("The graph: " + a +"\n");
				   if (isGrammar(xxx)) 
				   {
					 out.println("Grammar active in editor is: " + xxx);  
			         Grammar g= loadGrammar("file:///E:/bara/runtime-EclipseApplication/xx/"+ xxx);
			         out.println("The grammar: "+g +"\n");
			         executeGrammar(a,g, emb_p);
			         
			         notification.LanceurNotification.not_validation();
	                 show(a.toString().length());			
			         out.println(" \t FINAL RESULT: " + a + "\n");
			         show(a.toString().length());	
			         
			         this.saveGraph(a,"file:///E:/bara/runtime-EclipseApplication/xx/");
				   }
				   else 
					   {
					   notification.LanceurNotification.not_erreur("s");
					   out.println("File selected is not a Graph, please check it again");
					   }
			   }
			   else
				   {
				   notification.LanceurNotification.not_erreur("a");
				   out.println("Current file open in editor is not a Grammar, please check it again");
				   }
		}*/  
	}
	
	

	private void show(int length) 
	{
		// TODO Auto-generated method stub
		out.print("\t");
		for (int i=0; i<length+15; i++) 
		{
			out.print("*");
		}
		out.println("\n");
	}
	

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
    boolean enabled = false;
    ISelection f = selection;
   
     //action.setEnabled(enabled);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		MessageConsole myConsole = findConsole("graph transformation console");
		  out = myConsole.newMessageStream();
		this.window = window;
		// notification.LanceurNotification.not_info("w");
		out.print("");
		ISelectionListener sl = new ISelectionListener() {
		     
			public void selectionChanged(IWorkbenchPart part, ISelection sel) {
				   /*  String select = sel.toString();
				     select = select.substring(select.lastIndexOf(".") +1);
				     if (isGraph(select) || isGrammar(select))*/
		        	 
			//	out.println("Selection is: " + sel);
		      }
		   };
		   
		   IWorkbenchPage page = this.window.getActivePage();
		   page.addSelectionListener(sl);
	}
	
	public static MessageConsole findConsole(String name) {
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
	public  void supprimer(Graph gr, Node n)
	   {
		// supprimer le noeud 
		String label = n.getName();
		out.println("the label of the node to be deleted is "+ label);
		boolean r= gr.getNodes().remove(n);
		out.println("node "+label+"is  deleted");
		 gr.eResource().getContents().remove(n);
		 EList<Edge> Elistout = n.getOutgoingEdges();
		EList<Edge> Elistin = n.getIngoingEdges();
		out.println("deteting outgoinig edges of "+label);
		gr.getEdges().removeAll(Elistout);
		out.println("deteting ingoinig edges of "+label);
		gr.getEdges().removeAll(Elistin);
		 n.setParent(null);
		 // sauvgarder
		 try {
			 
			
			 gr.eResource().save(null);
			 out.println("saving after delete "+label);
	  		} catch (IOException e1) {
	  			// TODO Auto-generated catch block
	  			e1.printStackTrace();
	  			//out.println(e1.getMessage()+"******");
	  		} 
		
		
		
		//suppression des edges relié à n
		
	/*	EList<Edge> edge= gr.getEdges();
	    out.println("Edges removed are : ");
	    
	    
		for(int i=0; i<edge.size() ;i++)
		{
		     Edge e=edge.get(i);
		     if (label.equals(e.getSource().getName()) || label.equals(e.getTarget().getName())) 
		     {
		    	   out.println(e.toString());
		    	   boolean tr = gr.getEdges().remove(e);
		           gr.eResource().getContents().remove(e);
		    	   String s=e.getName();
		    	   //e = null;
		    	   e.setParent(null);
		     try {
		    	 out.println("Edge "+s+" removed "+ r);
				  gr.eResource().save(null);
		  		} catch (IOException e1) {
		  			// TODO Auto-generated catch block
		  			e1.printStackTrace();
		  			out.println(e1.getMessage()+"kk");
		  		}
		    	// gr.eResource().getContents().remove(e);		
		    
		    	// EcoreUtil.remove(e);
		    	i--;
		    	
		     }
		}
		
		try {
			  gr.eResource().save(null);
	  		} catch (IOException e1) {
	  			// TODO Auto-generated catch block
	  			e1.printStackTrace();
	  			out.println(e1.getMessage()+"xxxxx");
	  		} 
		/*gr.eResource().setModified(true);
		 boolean tr = gr.eResource().isModified(); 
		System.out.println(tr); 
	}*/
	   }
	//rule qui à la priorité
	private static int priorite(EList<Rule> R) {
		
		Rule r;
		int min ;
		int p=-1;
	    int last_p = -1;
       // EList<Rule> temp = R;
		int i=0;
		 int m;
		 if (R.isEmpty()==false)
		 {
			min=R.get(0).getPriority();
			for ( i=1; i<R.size(); i++)
			{
				r = R.get(i);
				m=r.Mark(); //System.out.println(m);
				if (m==0) 
				{
				if (r.getPriority() <= min)
				  {
					min = r.getPriority();
				    p = i; 
				  }
				}
			}
			if (p!= -1) //if vide 
			{ 
			   R.get(p).unMarkRule();
			   System.out.println(p + "p");
			}
		 }
        return p;
	}
	
	
	private  void ajouter(Graph H, Graph D, Embedding C) {
		EList<Node> Vd = D.getNodes();
		EList<Node> nh = H.getNodes();
	    Counter.setCount(0);
		for(int i=0;i<Vd.size();i++)
	    {
			Node nd= Vd.get(i);
			nd.setId(Counter.count);
			Node node = GraphFactory.eINSTANCE.createNode();
		    node.setName(nd.getName());
		    node.setId(Counter.count);
		    Counter.increment();
		    node.markNode();
		    node.setParent(H);
		    try {
				H.eResource().save(null);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			//	out.println(e1.getMessage()+"##########");
			} 
		    out.println("new node "+ node + " added to "+H.getName());
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
							edge.setTarget(node);
							edge.setParent(H);
						    out.println("new connexion edge "+edge + "added to "+H.getName());
						}
				 }
			 }
	    }
	  }
		int identifiant_h = -1;
		int identifiant_d = -1;
		//ajout des edges de D
		for(int i=0;i<nh.size();i++) //parcours node Host
		{
			Node n_h = nh.get(i);
			identifiant_h = n_h.getId();
			//recherche de noeud avec le meme id dans D
			for(int j=0;j<Vd.size();j++)
			{
				Node n_d = Vd.get(j);
				identifiant_d = n_d.getId();
				if (identifiant_h == identifiant_d) //s'il y'a correspondance entre les 2 noeuds H...>D
				{
					EList<Edge> out_noeud = n_d.getOutgoingEdges(); 
					//parcours des edges out du noeud d D 
					for(int k=0;k<out_noeud.size();k++)
					{
						//System.out.println(out_noeud.size()); 
						Edge e = out_noeud.get(k);
						Node noeud = e.getTarget();
						//parcours de H
						for (int y=0; y<nh.size(); y++) //trouver la correspondance dans H à present
						{
							Node n2_h = nh.get(y); 
							if (n2_h.getId()==noeud.getId()) // égalite d'id ...> de D vers H, 
								//surement c'est ici qu'il trouve un ancien x qui à le même id que le nouveau,
								//une 3 ieme execution il en trouve 2 et ainsi de suite et on reviens à un probleme de
								//suppression
							{
								Edge edge = GraphFactory.eINSTANCE.createEdge();
								edge.setSource(n_h);  
								edge.setTarget(n2_h);
								edge.setParent(H);
								out.println(" Right part edge  "+edge + "added to "+H.getName());
							}
						}
					}
				
				}
			}
			
		}  
		/*Cas qui traitement des Ingoings
		 * identifiant_h = -1;
		identifiant_d= -1;
		for(int i=0;i<nh.size();i++) 
		{
			Node n_h = nh.get(i);
			identifiant_h = n_h.getId();
			//recherche de noeud avec le meme id dans D
			for(int j=0;j<Vd.size();j++)
			{
				Node n_d = Vd.get(j);
				identifiant_d = n_d.getId();
				if (identifiant_h == identifiant_d) //s'il y'a correspondance entre les 2 noeuds
				{
					EList<Edge> out_noeud = n_d.getIngoingEdges(); 
					//parcours des edges out
					for(int k=0;j<out_noeud.size();j++)
					{
						Edge e = out_noeud.get(k);
						Node noeud = e.getSource();
						//parcours de H
						for (int y=0; y<nh.size(); y++) //trouver la correspondance dans H à present
						{
							Node n2_h = nh.get(y);
							if (n2_h.getId()==noeud.getId()) 
							{
								Edge edge = GraphFactory.eINSTANCE.createEdge();
								edge.setTarget(n_h);  
							
							}
						}
					}
				
				}
			}
			
		} */
		
	    
	}


	
	//execute a grammar on a graph
	public  void executeGrammar (Graph gr, Grammar G , String emb_p ) 
	   
	   {  
		  EList<Rule> rules = G.getRules();
		  
		  
		/*  if (emb_p=="c1") // iterative
		  {
			  if (ex_p=="stockage") //par ordre de stockage
			  {
				  out.println("aaa");
				  Iterator<Rule> R =rules.iterator();
				  while(R.hasNext())
				  {
					  Rule rul =R.next();
					  executeRuleI(gr,rul);  
				  }
			  }
			  else if (ex_p=="priorite")
			  {
				  out.println("Iterative - priorité ..... en cours de dvpt");
			  }
			  else if (ex_p=="aleatoire")
			  {
				  out.println("Iterative - random ..... en cours de dvpt");
			  }
		   
		  } */
		//  else //recursive
		 /* {  
			  if (ex_p=="stockage") //par ordre de stockage
			  {*/
				  Iterator<Rule> R =rules.iterator();
				  while(R.hasNext())
				  {
					  Rule rul =R.next();
					  out.println("trying to execute "+rul.getName());
					  executeRule(gr,rul); 
					out.println("saving modification"); 
					  Graph_RW.saveGraph(gr);
					  out.println("saved");
				  }
			  /*}
			  else if (ex_p=="priorite")
			  {
				  while(all_marked(rules)==false)
				  {
				  int pos_min = priorite(rules); //get the right rule
				
			      if (pos_min!=-1)   executeRule(gr,rules.get(pos_min));  
				  }
			
			  }
			  else if (ex_p=="aleatoire")
			  {
				  while(all_marked(rules)==false)
				  {
					  Rule rule = rules.get(new Random().nextInt(rules.size()));  
					  rule.unMarkRule();
					  executeRule(gr,rule);  
				  }
			  }
		  }
	  */
	}
		
 


	// vrai si tous les marker sont à 1
	private boolean all_marked(EList<Rule> rules) {
		// TODO Auto-generated method stub
		boolean tr=false;
		 Iterator<Rule> R =rules.iterator();
		  while(R.hasNext() && tr == false)
		  {
			  Rule rul =R.next();
			  if (rul.Mark()==0) tr=true;
	      }
		return tr;
	}

    //Only one rule 
	//public static int pos = -1;
	
	public  void executeRule(Graph gr, Rule r) {
		int pos = -1 ;
		EList<Node> nds = gr.getNodes();  
		
	    Node LHSNode = r.getLhs().getNode();
		
		pos=-1;
	    pos=Apply.occurence(nds, pos, LHSNode);
	
		if (pos==-1)  out.println("Aucune occurence de "+ LHSNode); 
		else {  //suppression et ajout en mm temps
				supprimer(gr,nds.get(pos)); 
				ajouter(gr,r.getRhs().getSubGraph(), r.getEmbeddingMechanism());
			}	

	  }

	
	
	private static List occurenceI(EList<Node> nds, Node lHSNode) {
		// TODO Auto-generated method stub
		int last_posI = -1;
		boolean tr=true;
		 List l = new LinkedList(); // liste pour garder les positions
		for(int i=0;i<nds.size();i++)
		{
	        Node n =nds.get(i);
			if (n.equals(lHSNode))
			{
			if (tr) 
				{
					last_posI=i;
					l.add(i);
					tr=false;
					
				}
				else
				{
					if (last_posI != i)
					{
						l.add(i);
						last_posI=i;
						
					}
				}
		   } 
		}
		return l;
	}

}
