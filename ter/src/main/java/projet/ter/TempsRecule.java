package projet.ter;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import projet.ter.lecture.Plateau;
import projet.ter.lecture.Transition;

public class TempsRecule extends TimerTask {

	public static JPanel fenetre;
	public static Grille grille;
	public static Plateau plateau;
	public Timer  temps = null; 

	
	


	public TempsRecule(Timer temps) {

		this.temps = temps;
		// TODO Auto-generated constructor stub
	}





	@Override
	public void run() {
		
		if(!TempsPasse.historique.isEmpty()){
		 Transition temp = TempsPasse.historique.pop();
			

		 
		 
		 
			for(int j =0 ;j<temp.listeCellule.size();j++){
				
					 int x =temp.listeCellule.get(j).x;
					 int y =temp.listeCellule.get(j).y;
					 plateau.plateau[y][x] = temp.listeCellule.get(j);
		    		 fenetre.repaint(); 
			}
			if(!TempsPasse.historique.isEmpty()){
				Fenetre.valeurTpsPasse=(int) (temp.date-TempsPasse.historique.get(0).date)+1;
			}
			else
				Fenetre.valeurTpsPasse = 0;
	}
	else
		temps.cancel();
		TempsPasse.terminer = false;
	}

}
