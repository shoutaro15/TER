package projet.ter;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class GrilleHex  extends JPanel{
	final static int cote=26;
	final static int ligne = 30;
	final static int colonne = 30;
	
	public void paintComponent(Graphics g){
				Polygon test = GrilleHex.getPolygon(0, 0, 26);
				Rectangle r=test.getBounds();
					
				for(int l=0;l<ligne;l=l+2){// Remarquer le "+2" car la grille est constitu�e de 2 sous grilles (les lignes impaires sont d�call�es)
					for(int c=0;c<colonne;c++){
						Polygon poly=getPolygon(c*r.width, (int)(l*cote*1.5),cote);
						g.drawPolygon(poly);		
					}
				}
				
				for(int l=1;l<ligne;l=l+2){
					for(int c=0;c<colonne;c++)
					{
						Polygon poly=getPolygon(c*r.width+r.width/2,(int)(l*cote*1.5+0.5),cote);
						g.drawPolygon(poly);
					}
				}
	}

	
	public static Polygon getPolygon(int x,int y,int cote){// Forme le polygone
		int haut=cote/2;
		int larg=(int)(cote*(Math.sqrt(3)/2));
		Polygon p=new Polygon();
		p.addPoint(x,y+haut);
		p.addPoint(x+larg,y); 
		p.addPoint(x+2*larg,y+haut);
		p.addPoint(x+2*larg,y+(int)(1.5*cote)); 
		p.addPoint(x+larg,y+2*cote);
		p.addPoint(x,y+(int)(1.5*cote));
		return p;
	}
	
	
	



}
