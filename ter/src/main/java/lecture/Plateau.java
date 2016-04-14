package lecture;

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
	
	public Plateau(int tailleX, int tailleY, int forme, int temps, String senario){
		this.typeTemps = temps;
		this.forme = forme;
		this.senario = senario;
		this.tailleX = tailleX;
		this.tailleY = tailleY;
		this.plateau = new Cellule[this.tailleX][this.tailleY];
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
