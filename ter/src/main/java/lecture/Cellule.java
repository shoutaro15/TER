package lecture;

import java.util.ArrayList;

public class Cellule {
	public int type; //0 carre / 1 hexagone
	public int x;
	public int y;
	public ArrayList<Integer> etat = new ArrayList<Integer>();
	public ArrayList<Integer> ancienEtat = new ArrayList<Integer>();
	
	public Cellule(){
		
	}
}
