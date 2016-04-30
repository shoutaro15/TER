package projet.ter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe Controle.
 * 
 * Affiche la date du début de la simulation.
 */
public class Controle {
	DateFormat formatDate = new SimpleDateFormat("HH:mm:ss,SS");
	Date date = new Date();
	
	public Controle() {}
	
	public void afficherDate() {
		System.out.println(formatDate.format(date));
	}
}
