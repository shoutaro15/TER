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
	public static JPanel fenetre;
	public static Grille grille;
	public static Plateau plateau;
	public static Stack <Transition> historique = new Stack<Transition>();
	public static boolean terminer = false; // simulation terminer ou non
	public Timer  temps = null; 
	
	/**
	 * Constructeur de la classe TempsPasse.
	 * Initialise le compteur avec une valeur spécifiée en paramètre.
	 * 
	 * @param tpsPasse la valeur de départ du compteur
	 */
	public TempsPasse( Timer temps) {
		this.temps = temps;
	}
	

	
	/*
	public int getTpsPasse() {
		return this.tpsPasse;
	}
	
	public void setTpsPasse(int tpsPasse) {
		this.tpsPasse = tpsPasse;
	}
	*/
	/**
	 * Lance le compteur.
	 */
	public void run() {
	
		
		for(int i=0;i<plateau.trans.size();i++){
				if(plateau.trans.get(i).date == Fenetre.valeurTpsPasse){
					Transition tempT = new Transition();
					tempT.date = plateau.trans.get(i).date;
					for(int j =0 ;j<plateau.trans.get(i).listeCellule.size();j++){
							 int x =plateau.trans.get(i).listeCellule.get(j).x;
							 int y =plateau.trans.get(i).listeCellule.get(j).y;
							 Cellule tempC = plateau.plateau[y][x];
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
			
		
		
System.out.println(Fenetre.valeurTpsPasse);
		Fenetre.valeurTpsPasse++;
	}
}
