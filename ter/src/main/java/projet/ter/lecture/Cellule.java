package projet.ter.lecture;

import java.util.ArrayList;

public class Cellule {
	public int x;
	public int y;
	public ArrayList<Integer> etat = new ArrayList<Integer>();
	
	public Cellule(){
		
	}
	
	public Cellule(int x, int y, ArrayList<Integer> etat){
		this.x = x;
		this.y = y;
		this.etat = etat;
	}
}
