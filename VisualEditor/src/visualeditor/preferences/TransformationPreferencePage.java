package visualeditor.preferences;

import org.eclipse.core.runtime.Preferences.PropertyChangeEvent;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.osgi.service.prefs.Preferences;
import org.eclipse.ui.IWorkbench;
import visualeditor.Activator;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class TransformationPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	private DirectoryFieldEditor fieldEditor;
	private IEclipsePreferences preferences;
	//les fields radio box
	private RadioGroupFieldEditor run_p , ex_p, emb_p, save_p;
	
	
	
	public TransformationPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		preferences = InstanceScope.INSTANCE.getNode("VE.test");
		setDescription("Choose your preferences");
	}
	
		
		

	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		fieldEditor = (new DirectoryFieldEditor(PreferenceConstants.P_PATH, 
				"&Directory preference:", getFieldEditorParent()));
			addField(fieldEditor); 

		run_p = (new RadioGroupFieldEditor(
				PreferenceConstants.P_CHOICE,
			"Run preference",
			1,
			new String[][] { { "Graph (selection) and Grammar (editor)", "choice1" }, {
				"Graph (editor) and Grammar (selection)", "choice2" }
		}, getFieldEditorParent()));
		addField(run_p);
		
	emb_p=	(new RadioGroupFieldEditor(
				PreferenceConstants.P_CHOI,
			"Embedding preference",
			1,
			new String[][] { { "Iterative Embedding", "c1" }, {
				"Recursive Embedding", "c2" }
		}, getFieldEditorParent()));
		addField(emb_p);
		
		ex_p = (new RadioGroupFieldEditor(
				PreferenceConstants.R_CHOICE,
			"Execution order of rules",
			1,
			new String[][] { { "By priority", "priorite" }, {
				"Random", "aleatoire" }, { 
				"In order of storage", "stockage" }
		}, getFieldEditorParent()));
		addField(ex_p);
		
		save_p = (new RadioGroupFieldEditor(
				PreferenceConstants.S_CHOICE,
			"Result Graph Saving Setting",
			1,
			new String[][] { { "Directly on the host graph", "direct" }, {
				"Create a new graph", "new" }
		}, getFieldEditorParent()));
		addField(save_p);
	/*	addField(
			new StringFieldEditor(PreferenceConstants.P_STRING, "A &text preference:", getFieldEditorParent())); */
	}
	
	public boolean performOk()
	   {
		 Preferences sub1 = preferences.node("node1");
		 Preferences sub2 = preferences.node("node2");
		 sub1.put("h1",fieldEditor.getStringValue() );
		 
		 sub2.put("h1",run_p.getPreferenceStore().getString(PreferenceConstants.P_CHOICE));
		 
		 sub2.put("h2",emb_p.getPreferenceStore().getString(PreferenceConstants.P_CHOI));
		 
		 sub2.put("h3",ex_p.getPreferenceStore().getString(PreferenceConstants.R_CHOICE));
		 
		 sub2.put("h4",save_p.getPreferenceStore().getString(PreferenceConstants.S_CHOICE));
		
		try {
		  // forces the application to save the preferences
		  preferences.flush();
		 
		  } catch (org.osgi.service.prefs.BackingStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return super.performOk();
	}

	@Override
	/*protected void checkState() {
		// TODO Auto-generated method stub
		super.checkState();
		 if(fieldEditor.getStringValue() != null){
             setErrorMessage(null);
         setValid(true);
   }else{
             setErrorMessage("Directorie name cannot be blank!");
         setValid(false);
   }
} 
	

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	

	public void init(IWorkbench workbench)
	{
		 setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}


	/*public void propertyChange(org.eclipse.jface.util.PropertyChangeEvent event) {
		// TODO Auto-generated method stub
		super.propertyChange(event);
		if (event.getProperty().equals(FieldEditor.VALUE))
		{
			checkState();
		}
	} 

	*/
	
	

	
}