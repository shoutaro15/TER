package projet.ter;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GrilleCarre extends JPanel {
	final static int coter = 50;
	final static int ligne = 30;
	final static int colonne = 30;
	
	
	public void paintComponent(Graphics g){  
		for(int l=0;l<ligne;l++){
			for(int c=0;c<colonne;c++){
				g.drawRect(c*coter, l*coter,  coter, coter);		
			}
		}

			

}
	
	
}
