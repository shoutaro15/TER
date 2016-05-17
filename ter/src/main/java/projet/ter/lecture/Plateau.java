package projet.ter.lecture;

import java.util.ArrayList;

public class Plateau {
	public Cellule plateau[][];
	public int tailleX;
	public int tailleY;
	public int forme;
	public int typeTemps;
	public String senario = "";
	public ArrayList<Transition> trans = new ArrayList<Transition>();
	
	public Plateau(){
		
	}
	
	public Plateau(Plateau p){
		this.forme = p.forme;
		this.plateau = p.plateau;
		this.senario = p.senario;
		this.tailleX = p.tailleX;
		this.tailleY = p.tailleY;
		this.trans = p.trans;
		this.typeTemps = p.typeTemps;
	}
}
