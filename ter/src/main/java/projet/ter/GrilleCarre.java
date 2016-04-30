package projet.ter;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import projet.ter.lecture.Plateau;
import projet.ter.lecture.Transition;

public class GrilleCarre extends Grille {
	final static int coter = 80;
	
	
	public GrilleCarre(Plateau plateau){
		ligne = plateau.tailleY;
		colonne = plateau.tailleX;
		donne = plateau; 
		plateaux = new Shape[ligne][colonne];
	}
	


	public void paintComponent(Graphics g){  
		
		Graphics2D g2d = (Graphics2D) g;
		    
		for(int l=0;l<ligne;l++){
			for(int c=0;c<colonne;c++){
					Rectangle rect = new Rectangle(c*coter,l*coter,coter,coter);
					plateaux[l][c] =  rect;
					g.drawRect(c*coter,l*coter,  coter, coter);	
					
					ArrayList<Integer> etat = donne.plateau[l][c].etat;
					ArrayList<File> fichier = new ArrayList<File>();
					ArrayList<BufferedImage> image = new ArrayList<BufferedImage>();
					AlphaComposite alpha = (AlphaComposite) g2d.getComposite();
					
					for(int i = 0 ; i<etat.size();i++){
						float opa = (10-(i*3));	
						fichier.add(new File(chemin+donne.senario+"/icone/"+etat.get(i)+".jpg"));
						 g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opa* 0.1f));
							try {
								image.add(ImageIO.read(fichier.get(i)));
							} catch (IOException e) {
								e.printStackTrace();
							}
						
						
						g.drawImage(image.get(i), rect.x, rect.y, rect.height, rect.width, null);
						
						
						}
						
						 g2d.setComposite(alpha);
					
			}
		}
		
}
	
	
	

	
}
	
	


