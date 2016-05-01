package projet.ter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.* ;
import javax.swing.border.LineBorder;

import java.util.ArrayList;
import java.util.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;

import projet.ter.lecture.Cellule;
import projet.ter.lecture.Lecture;
import projet.ter.lecture.Plateau;
import projet.ter.lecture.Transition;

/**
 *
 * @author MIGAOU
 */
public class Fenetre extends JFrame {

    /**
     * Creates new form Fenetre
     */
	// Variables declaration - do not modify                     
    private JPanel AffichageText;
    private JPanel ConteneurBoutons;
    private JPanel Legende;
    private JPanel Scène;
	public static String fichier = "";
	public static Lecture test = new Lecture();
	public static Plateau test2 = new Plateau();
    private JLabel legend;
	JFrame frame = new JFrame();

    private JButton pause;
    private JButton avance;
    private JButton play;
    private JButton recule;
    private JButton ChargerFicher;
    
    // End of variables declaration 
    
    public Fenetre() {
    	//fonction qui initialise la fenetre
    	initComponents();
        this.setTitle("Projet TER");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(1000, 600);
        this.setVisible(true);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    public void initComponents() {
    	Legende = new javax.swing.JPanel();
        legend = new javax.swing.JLabel();
        ConteneurBoutons = new javax.swing.JPanel();
        recule = new javax.swing.JButton();
        play = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        ChargerFicher = new javax.swing.JButton();
        avance = new javax.swing.JButton();
        Scène = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fenetre");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        Legende.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        legend.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        legend.setText("Légende");

        ConteneurBoutons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ConteneurBoutons.setToolTipText("");

        recule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        recule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reculeActionPerformed(evt);
            }	
        });

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/play.png"))); // NOI18N
        play.setBorder(null);
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pause.png"))); // NOI18N
        pause.setBorder(null);
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        ChargerFicher.setText("Charger un Fichier");
        ChargerFicher.setBorder(null);
        ChargerFicher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChargerFicherActionPerformed(evt);
            }
        });

        avance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/forward.png"))); // NOI18N
        avance.setBorder(null);
        avance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConteneurBoutonsLayout = new javax.swing.GroupLayout(ConteneurBoutons);
        ConteneurBoutons.setLayout(ConteneurBoutonsLayout);
        ConteneurBoutonsLayout.setHorizontalGroup(
            ConteneurBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConteneurBoutonsLayout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(recule, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConteneurBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChargerFicher, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ConteneurBoutonsLayout.createSequentialGroup()
                        .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(avance, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        ConteneurBoutonsLayout.setVerticalGroup(
            ConteneurBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConteneurBoutonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ConteneurBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(avance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recule, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChargerFicher, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout LegendeLayout = new javax.swing.GroupLayout(Legende);
        Legende.setLayout(LegendeLayout);
        LegendeLayout.setHorizontalGroup(
            LegendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConteneurBoutons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LegendeLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(legend)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LegendeLayout.setVerticalGroup(
            LegendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LegendeLayout.createSequentialGroup()
                .addComponent(legend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addComponent(ConteneurBoutons, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout ScèneLayout = new javax.swing.GroupLayout(Scène);
        Scène.setLayout(ScèneLayout);
        ScèneLayout.setHorizontalGroup(
            ScèneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        ScèneLayout.setVerticalGroup(
            ScèneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Scène, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Legende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Legende, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Scène, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        


    Timer timer = null; // Classe Timer
    TempsPasse tpsPasse; // Classe TempsPasse
    TempsRecule tpsRecule; // Classe TempsRecule
    public static int valeurTpsPasse = 0; // Valeur du temps passé
    boolean verifScenario = false;

    private void playActionPerformed(java.awt.event.ActionEvent evt) {
        // On vérifie si le timer n'a pas encore été lancé
    	if(  verifScenario && !TempsPasse.terminer) {
    		new Controle().afficherDate();
    	
    		if(timer!=null)
    			timer.cancel();
    		
    		timer = new Timer();
        	System.out.println("test");

    		
    		/*
    		 * Classe TempsPasse initialisé à "valeurTpsPasse"
    		 * Démarre à partir de "0" au début
    		 * Démarre ensuite à partir de n'importe quelle valeur de "valeurTpsPasse"
    		 * 
    		 */
    		
    		tpsPasse = new TempsPasse(timer);
    		
    		
    		
    		// Timer qui débute dans 1 seconde et qui compte toutes les secondes
    		timer.schedule(tpsPasse, 1000, 1000);
    	}
    }                                    

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {
    	// On vérifie si le timer a déjà été lancé
    
    		 // Timer arrêté
    		
    		/*
    		 * On récupère la valeur du temps passé dans la variable "valeurTpsPasse" pour pouvoir reprendre
    		 * après la pause
    		 */
        	
        	// On arrête le compteur
        	timer.cancel();
    	
    }
    
    private void avanceActionPerformed(java.awt.event.ActionEvent evt) {                                       
   
    		new Controle().afficherDate();
    		
    		if(timer!=null)
    			timer.cancel();
    		
    		timer = new Timer();
    		tpsPasse = new TempsPasse(timer);
    		
    		// Timer qui débute dans 500 millisecondes et qui compte toutes les 500 millisecondes
    		timer.schedule(tpsPasse, 500, 500);
    	
    }
    
    private void reculeActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	if(!TempsPasse.historique.isEmpty() ){
        		
        		new Controle().afficherDate();
        		if(timer!=null)
        			timer.cancel();
        		
        		timer = new Timer();
        		
        		
        		/*
        		 * Classe TempsPasse initialisé à "valeurTpsPasse"
        		 * Démarre à partir de "0" au début
        		 * Démarre ensuite à partir de n'importe quelle valeur de "valeurTpsPasse"
        		 * 
        		 */
        		
        		tpsRecule = new TempsRecule(timer);
        		
        		
        		
        		// Timer qui débute dans 1 seconde et qui compte toutes les secondes
        		timer.schedule(tpsRecule, 1000, 1000);
        	}
        }                                    

    				
    	
    	
    	
    	
   

    /**
     * Ouvre une boîte de dialogue lorsque l'on clique sur le bouton pour charger un fichier.
     * 
     * @param evt clic sur le bouton
     */
    private void ChargerFicherActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    	System.out.println ("charge") ;
    	
		JFileChooser ouvrirFichier = new JFileChooser();
        ouvrirFichier.setFileFilter(new FileNameExtensionFilter("Fichier texte (.txt)", "txt"));

    	if(ouvrirFichier.showDialog(null, "Importer un scénario") == JFileChooser.APPROVE_OPTION) {
    		File fichiertemp = ouvrirFichier.getSelectedFile();
    		fichier = fichiertemp.toString();
    		test2 = test.lectureTxt(fichier);
	
            
            this.Scène.setLayout(new BorderLayout());

    		Grille neutre = null;
    		
    		if(test2.senario.equals("feu")){
    			neutre = new GrilleHex(test2);
    			verifScenario = true;

    			
    		}
    		if(test2.senario.equals("avion")){
    			neutre = new GrilleCarre(test2);
    			verifScenario = true;

    			
    		}
    		/* Partie
    		 * Legende 
    		ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
    		 File folder = new File(neutre.chemin+test2.senario+"/icone/");
 		     File[] listOfFiles = folder.listFiles();
 		     int compteurFile =0;
	 		    for (File file : listOfFiles) {
	 		        if (file.isFile()) {
	 		            System.out.println(file.getName());
	 		            images.add( new ImageIcon(neutre.chemin+test2.senario+"/icone/"+file.getName()));
	 		            compteurFile++;
	 		        }
	 		    }
    
	 		    JFrame frame = new JFrame();  
    		    JPanel panel = new JPanel();

	 		   BoxLayout placeLegende =new BoxLayout(panel, BoxLayout.LINE_AXIS);
	 		
    		    frame.add(panel);
    		    JLabel jlabel = new JLabel("This is a label");
    		    jlabel.setFont(new Font("Verdana",1,20));
    		    
    		    for(int i =0 ;i<images.size();i++){
    		    	 Image img = images.get(i).getImage();
    		    	 BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
    		    	 Graphics g = bi.createGraphics();
    		    	g.drawImage(img, 0, 0, 50, 50, null);
    		    	 ImageIcon newIcon = new ImageIcon(bi);
    		    	panel.add(new JLabel(newIcon));
    		    }
    		    panel.setBorder(new LineBorder(Color.BLACK)); // make it easy to see
    		    frame.add(panel);
    		    frame.setSize(400, 400);
    		    frame.setLocationRelativeTo(null);
    		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		    frame.setVisible(true);
    		  */  
    		   
    		    
            this.Scène.add(neutre,BorderLayout.CENTER);
            this.Scène.validate();
            
    		TempsPasse.fenetre = this.Scène;
    		TempsPasse.grille = neutre;
    		TempsPasse.plateau = test2;
    		
    		TempsRecule.fenetre = this.Scène;
    		TempsRecule.grille = neutre;
    		TempsRecule.plateau = test2;
    		
    		SwingUtilities.updateComponentTreeUI(this);

    		System.out.println(fichier);
    	}
    }  

                   
}

