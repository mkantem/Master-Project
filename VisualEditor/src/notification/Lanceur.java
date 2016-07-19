package notification;



public class Lanceur {

	public static void main(String[] args){
		Notifieur notifieur = new Notifieur(
				"Le titre", 
				"Le texte à afficher dans le message", 
				TypeNotification.VALIDATION
		);
		notifieur.start();
	}

}
