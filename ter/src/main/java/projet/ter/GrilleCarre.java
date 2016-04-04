package projet.ter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;

public class GrilleCarre extends Grille {
	final static int coter = 50;
	
	
	public GrilleCarre(){
		
		plateaux = new Shape[ligne][colonne];
	}
	
	public void paintComponent(Graphics g){  
		for(int l=0;l<ligne;l++){
			for(int c=0;c<colonne;c++){
					plateaux[l][c] =  new Rectangle(c*coter,l*coter,coter,coter);
					
					if(l==1)
						g.setColor(Color.cyan);
					else
						g.setColor(Color.white);
					g.fillRect(c*coter,l*coter,  coter, coter);	
				    g.setColor(Color.black);
					g.drawRect(c*coter,l*coter,  coter, coter);	
					
			}
		}
}
	
	
	
	public void test(){
		
		
		
	    
	}

	
	
	
}
