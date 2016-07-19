package notification;


public class LanceurNotification {

	public static void not_erreur(String a){
		
		if (a=="s")
		{
			Notifieur notifieur = new Notifieur(
					"Error", 
					"Please check your selection", 
					TypeNotification.ERREUR
			);
			notifieur.start();
		}
		else if (a=="a")
		{
			Notifieur notifieur = new Notifieur(
					"Error", 
					"Please check your active editor", 
					TypeNotification.ERREUR
			);
			notifieur.start();
		}
		
	}
	public static void not_info(String a){
		
		if (a=="w") {
		Notifieur notifieur = new Notifieur(
				"Welcome", 
				"Welcome In the plugin", 
				TypeNotification.INFO
		);
		notifieur.start();
		}
		else if (a=="c") {
			Notifieur notifieur = new Notifieur(
					"Debut", 
					" ", 
					TypeNotification.INFO
			);
			notifieur.start();
			}
	}
	public static void not_validation(){
		Notifieur notifieur = new Notifieur(
				"End", 
				"End of execution of the grammar", 
				TypeNotification.VALIDATION
		);
		notifieur.start();
	}
	

}
