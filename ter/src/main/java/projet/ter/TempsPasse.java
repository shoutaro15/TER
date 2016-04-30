package projet.ter;

import java.util.TimerTask;

/**
 * Classe TempsPasse.
 *
 * Compte le temps passé durant la simulation.
 */
public class TempsPasse extends TimerTask {
	int tpsPasse;
	
	/**
	 * Constructeur de la classe TempsPasse.
	 * Initialise le compteur avec une valeur spécifiée en paramètre.
	 * 
	 * @param tpsPasse la valeur de départ du compteur
	 */
	public TempsPasse(int tpsPasse) {
		this.tpsPasse = tpsPasse;
	}
	
	public int getTpsPasse() {
		return this.tpsPasse;
	}
	
	public void setTpsPasse(int tpsPasse) {
		this.tpsPasse = tpsPasse;
	}
	
	/**
	 * Lance le compteur.
	 */
	public void run() {
		tpsPasse++;
		System.out.println(tpsPasse);
	}
}
