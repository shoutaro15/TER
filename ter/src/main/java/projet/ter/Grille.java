package projet.ter;

import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.io.File;

import javax.swing.JPanel;

import projet.ter.lecture.Plateau;
import projet.ter.lecture.Transition;

abstract class Grille extends JPanel{
	Shape[][] plateaux ;
	Plateau donne = new Plateau();
	protected  int ligne = 30;
	protected  int colonne = 30;
	protected  String chemin = "src/main/java/";
	
	
	
	public void chargeTransition(Transition t){

		for(int i = 0 ; i<t.listeCellule.size() ; i++){

			donne.plateau[t.listeCellule.get(i).y][t.listeCellule.get(i).x] = t.listeCellule.get(i);
			
		}

	}
			
			
	
	
	

}
