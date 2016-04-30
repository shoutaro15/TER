package projet.ter;

import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import projet.ter.lecture.Plateau;
import projet.ter.lecture.Transition;

public class TempsRecule extends TimerTask {
	int tpsPasse;
	public static JPanel fenetre;
	public static Grille grille;
	public static Plateau plateau;
	public static Timer  temps = null; 

	
	


	public TempsRecule(int valeurTpsPasse) {
		this.tpsPasse = valeurTpsPasse;
		// TODO Auto-generated constructor stub
	}





	@Override
	public void run() {
		
		if(!TempsPasse.historique.isEmpty()){
		 Transition temp = TempsPasse.historique.pop();
			
			for(int j =0 ;j<temp.listeCellule.size();j++){
				
					 int x =temp.listeCellule.get(j).y;
					 int y =temp.listeCellule.get(j).x;
					 plateau.plateau[y][x] = temp.listeCellule.get(0);
		    		 fenetre.repaint(); 
			}
			tpsPasse-=temp.date;
	}
	else
		temps.cancel();
	}

}
