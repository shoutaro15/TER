package projet.ter;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import projet.ter.lecture.Plateau;

public class GrilleHex extends Grille{
	//final static int cote=16;
	final static int cote=22;

	
	public GrilleHex(Plateau plateau){
		ligne = plateau.tailleY;
		colonne = plateau.tailleX;
		donne = plateau; 
		plateaux = new Shape[ligne][colonne];
	}
	
	/*
	 * Cette fonction permet de actualiser les composants d'un plateau hexagone
	 */
	
	public void paintComponent(Graphics g){
				Polygon test = GrilleHex.getPolygon(0, 0, cote);
				Rectangle r=test.getBounds();
				Graphics2D g2d = (Graphics2D) g;
				System.out.println(donne.tailleX+" "+donne.tailleY);

			
	    	
				

					
				for(int l=0;l<ligne;l=l+2){
					for(int c=0;c<colonne;c++){
						
						ArrayList<Integer> etat = donne.plateau[l][c].etat;
						ArrayList<File> fichier = new ArrayList<File>();
						ArrayList<BufferedImage> image = new ArrayList<BufferedImage>();
						
						AlphaComposite alpha = (AlphaComposite) g2d.getComposite()
								;
						Polygon poly=getPolygon(c*r.width, (int)(l*cote*1.5),cote);
						
						Rectangle rect = poly.getBounds();
						
						g.setClip(poly);
						
						/*
						 * On charge les images puis on les dessinent sur le plateau  avec une transparence
						 */
						
						for(int i = 0 ; i<etat.size();i++){
							float opa = (10-(i*2));	
							fichier.add(new File(chemin+donne.senario+"/icone/"+etat.get(i)+".png"));
							 g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opa* 0.1f));

							
								try {
									image.add(ImageIO.read(fichier.get(i)));
								} catch (IOException e) {
									e.printStackTrace();
								}
							
							
								g.drawImage(image.get(i), rect.x, rect.y,rect.width,rect.height, null);
							
							
							}
						
						g.setClip(null);
						g.drawPolygon(poly);
					
							
							 g2d.setComposite(alpha);
					}
				}
				
				for(int l=1;l<ligne;l=l+2){
					for(int c=0;c<colonne;c++)
					{
						ArrayList<Integer> etat = donne.plateau[l][c].etat;
						ArrayList<File> fichier = new ArrayList<File>();
						ArrayList<BufferedImage> image = new ArrayList<BufferedImage>();
						AlphaComposite alpha = (AlphaComposite) g2d.getComposite();
						
						Polygon poly=getPolygon(c*r.width+r.width/2,(int)(l*cote*1.5+0.5),cote);
						
						Rectangle rect = poly.getBounds();
						
						g.setClip(poly);
						for(int i = 0 ; i<etat.size();i++){
							float opa = (10-(i*2));	
							fichier.add(new File(chemin+donne.senario+"/icone/"+etat.get(i)+".png"));
							 g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opa* 0.1f));

							
								try {
									image.add(ImageIO.read(fichier.get(i)));
								} catch (IOException e) {
									e.printStackTrace();
								}
							
							
								g.drawImage(image.get(i), rect.x, rect.y,rect.width,rect.height, null);
							
							
							
							}
						
						g.setClip(null);
						g.drawPolygon(poly);
					
							
							 g2d.setComposite(alpha);
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
