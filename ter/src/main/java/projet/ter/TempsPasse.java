package projet.ter;

import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import projet.ter.lecture.Cellule;
import projet.ter.lecture.Plateau;
import projet.ter.lecture.Transition;

/**
 * Classe TempsPasse.
 *
 * Compte le temps passé durant la simulation.
 */
public class TempsPasse extends TimerTask {
	int tpsPasse;
	public static JPanel fenetre;
	public static Grille grille;
	public static Plateau plateau;
	public static Stack <Transition> historique = new Stack<Transition>();
	public static boolean terminer = false; // simulation terminer ou non
	public static Timer  temps = null; 
	
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
	
		
		for(int i=0;i<plateau.trans.size();i++){
				if(plateau.trans.get(i).date == tpsPasse){
					Transition tempT = new Transition();
					tempT.date = plateau.trans.get(i).date;
					for(int j =0 ;j<plateau.trans.get(i).listeCellule.size();j++){
							 int x =plateau.trans.get(i).listeCellule.get(j).x;
							 int y =plateau.trans.get(i).listeCellule.get(j).y;
							 Cellule tempC = plateau.plateau[x][y];
							 tempT.listeCellule.add(tempC);
					}
					historique.push(tempT);
					grille.chargeTransition(plateau.trans.get(i));
					fenetre.repaint();
					 
				}
				
			}	

		if(historique.size() ==plateau.trans.size()){
			terminer=true;
			temps.cancel();
		}
		tpsPasse++;
		System.out.println("T = "+tpsPasse+" Historique :"+historique.size());
	}
}
