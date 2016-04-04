package projet.ter;
import javax.swing.JFrame;

public class MaFenetre  extends JFrame{
	
	MaFenetre(){

	    //D�finit un titre pour notre fen�tre
	    this.setTitle("Dessin d'une grille ");

	    //D�finit sa taille : 400 pixels de large et 100 pixels de haut

	    this.setSize(500, 500);

	    //Nous demandons maintenant � notre objet de se positionner au centre

	    this.setLocationRelativeTo(null);

	    //Termine le processus lorsqu'on clique sur la croix rouge

	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
	    //On pr�vient notre JFrame que notre JPanel sera son content pane
	    
	    
	    

	    this.setContentPane(new GrilleHex()); 
	    //Et enfin, la rendre visible      
	    
	    this.setVisible(true);
	}
	
	

}
