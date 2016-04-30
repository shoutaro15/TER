import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;







public class Test {

	

    	 
 

	public static void main(String[] args) {
		JFrame win=new JFrame(); // Cr�e la fenetre principale
		JPanel jp=(JPanel) win.getContentPane(); // R�cup�re le conteneur de la fen�tre
		final AffGrille jp2=new AffGrille(); // Cr�e une instance de la classe priv�e AffGrille
		jp2.addMouseMotionListener(new MouseMotionListener(){
			Polygon p;
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseMoved(MouseEvent arg0) {
				p=jp2.pol;
				if(!p.contains(arg0.getPoint())){
					jp2.repaint();
				}
			}
			
			
		});// Repeind jp2 lorsque la souris se d�place
		jp2.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				super.mouseClicked(arg0);
				JOptionPane.showMessageDialog(null,"Hexagone n�:"+jp2.numero);
			}
			
		});// Evenement qui survient au clicque
		jp.add(jp2);// Ajoute le composant � la fen�tre
		win.setSize(640, 480);// Redimensionne la fenetre
		win.setVisible(true);// Affiche la fenetre

		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Permet de quiter l'application � la fermeture de la fen�tre
	}

}

@SuppressWarnings("serial")
class AffGrille extends JPanel{ // Classe personnelle qui cr�e une grile hexagonale.
	final static int cote=26; // Ceci d�finit la taille du c�t� d'un polygone
	int numero=0; // Retien le n� du polygone sur lequel est la souris
	Polygon pol;
	@Override
	public void paint(Graphics arg0) {
		Polygon p2=getPolygon(0, 0, cote); // Cr�e un hexagone
		Rectangle r=p2.getBounds(); // R�cup�re le plus petit rectangle // aux bord de la fen�tre dans lequel l'hexagone peut s'inscrire
		Point hovered=null;
		arg0.setColor(Color.black);
		super.paint(arg0);
		Graphics2D g2d;
		
		
		
		g2d=(Graphics2D) arg0;
		BasicStroke bs1=new BasicStroke(1);// Permet de fixer l'�paisseur du trait dans la suite
		BasicStroke bs3=new BasicStroke(3);// Idem
		
		g2d.setStroke(bs1);

		
		for(int l=0;l<30;l=l+2){// Remarquer le "+2" car la grille est constitu�e de 2 sous grilles (les lignes impaires sont d�call�es)
			for(int c=0;c<30;c++){
				Point p;
				p=getMousePosition();
				Polygon poly=getPolygon(c*r.width, (int)(l*cote*1.5),cote);
				if(p!=null && poly.contains(p)){
					hovered=new Point(c*r.width, (int)(l*cote*1.5));
					numero=l*10+c;
					pol=poly;
				}
				g2d.draw(poly);
			}
		}
		for(int l=1;l<30;l=l+2){
			for(int c=0;c<30;c++)
			{
				Point p;
				p=getMousePosition();
				Polygon poly=getPolygon(c*r.width+r.width/2,  (int)(l*cote*1.5+0.5),cote);
				//arg0.setColor(Color.black);
				if(p!=null && poly.contains(p)){
					hovered=new Point(c*r.width+r.width/2,  (int)(l*cote*1.5+0.5));
					numero=l*10+c;
					pol=poly;
				}
				g2d.draw(poly);
			}
		}
		if(hovered!=null){
			arg0.setColor(Color.red);
			g2d.setStroke(bs3);
			Polygon p=getPolygon(hovered.x, hovered.y,cote);
			g2d.draw(p);
		}
	}
	
	public Polygon getPolHover(){
		return pol;
	}

	public static Polygon getPolygon(int x,int y,int cote){// Forme le polygone
		int haut=cote/2;
		int larg=(int)(cote*(Math.sqrt(3)/2));
		Polygon p=new Polygon();
		p.addPoint(x,y+haut);// /
		p.addPoint(x+larg,y); // \
		p.addPoint(x+2*larg,y+haut);// |
		p.addPoint(x+2*larg,y+(int)(1.5*cote)); // /
		p.addPoint(x+larg,y+2*cote);// \
		p.addPoint(x,y+(int)(1.5*cote));// |
		return p;
	}
	

	

}