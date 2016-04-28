package projet.ter;

import java.io.File;
import javax.swing.* ;
import java.util.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;

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
    
    private JLabel legend;
    
    private JButton pause;
    private JButton avance;
    private JButton play;
    private JButton recule;
    private JButton ChargerFicher;
    
    // End of variables declaration 
    
    public Fenetre() {
        initComponents();
        
        this.setVisible(true);
        this.setTitle("Projet TER");
       
        //this.setLocationRelativeTo(null);
        //this.setContentPane(new GrilleHex()); 
        // this.Scène.add(new GrilleHex()) ;
        // this.Scène.setContentPane(new GrilleHex()); 
         //this.Scène.print();
        /* this.Scène.add(new GrilleHex()) ;
         this.Scène.validate();
         this.Scène.repaint();
         this.Scène.setVisible(true) ;
         this.repaint() ;*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    public void initComponents() {
    	Scène = new javax.swing.JPanel(); 
        Legende = new javax.swing.JPanel();
        legend = new javax.swing.JLabel();
        AffichageText = new javax.swing.JPanel();
        ConteneurBoutons = new javax.swing.JPanel();
        recule = new javax.swing.JButton();
        play = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        ChargerFicher = new javax.swing.JButton();
        avance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fenetre");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        Legende.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        legend.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        legend.setText("Légende");

        javax.swing.GroupLayout LegendeLayout = new javax.swing.GroupLayout(Legende);
        Legende.setLayout(LegendeLayout);
        LegendeLayout.setHorizontalGroup(
            LegendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LegendeLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(legend)
                .addGap(35, 35, 35))
        );
        LegendeLayout.setVerticalGroup(
            LegendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LegendeLayout.createSequentialGroup()
                .addComponent(legend)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        AffichageText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout AffichageTextLayout = new javax.swing.GroupLayout(AffichageText);
        AffichageText.setLayout(AffichageTextLayout);
        AffichageTextLayout.setHorizontalGroup(
            AffichageTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );
        AffichageTextLayout.setVerticalGroup(
            AffichageTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recule, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConteneurBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChargerFicher, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ConteneurBoutonsLayout.createSequentialGroup()
                        .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avance, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ConteneurBoutonsLayout.setVerticalGroup(
            ConteneurBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConteneurBoutonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConteneurBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(avance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recule, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(ChargerFicher, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        javax.swing.GroupLayout ScèneLayout = new javax.swing.GroupLayout(Scène);
        Scène.setLayout(ScèneLayout);
        ScèneLayout.setHorizontalGroup(
            ScèneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        ScèneLayout.setVerticalGroup(
            ScèneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AffichageText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConteneurBoutons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Scène, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Legende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Legende, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Scène, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ConteneurBoutons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AffichageText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    Timer timer; // Classe Timer
    TempsPasse tpsPasse; // Classe TempsPasse
    int verifTimerLance = 0; // Timer lancé = 1, timer arrêté = 0
    int valeurTpsPasse = 0; // Valeur du temps passé

    private void playActionPerformed(java.awt.event.ActionEvent evt) {
        // On vérifie si le timer n'a pas encore été lancé
    	if(verifTimerLance == 0) {
    		verifTimerLance = 1; // Timer démarré
    		new Controle().afficherDate();
    		
    		timer = new Timer();
    		
    		/*
    		 * Classe TempsPasse initialisé à "valeurTpsPasse"
    		 * Démarre à partir de "0" au début
    		 * Démarre ensuite à partir de n'importe quelle valeur de "valeurTpsPasse"
    		 */
    		tpsPasse = new TempsPasse(valeurTpsPasse);
    		
    		// Timer qui débute dans 1 seconde et qui compte toutes les secondes
    		timer.schedule(tpsPasse, 1000, 1000);
    	}
    }                                    

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {
    	// On vérifie si le timer a déjà été lancé
    	if(verifTimerLance == 1) {
    		verifTimerLance = 0; // Timer arrêté
    		
    		/*
    		 * On récupère la valeur du temps passé dans la variable "valeurTpsPasse" pour pouvoir reprendre
    		 * après la pause
    		 */
        	valeurTpsPasse = tpsPasse.getTpsPasse();
        	
        	// On arrête le compteur
        	timer.cancel();
    	}
    }
    
    private void avanceActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(verifTimerLance == 0) {
    		verifTimerLance = 1;
    		new Controle().afficherDate();
    		
    		timer = new Timer();
    		tpsPasse = new TempsPasse(valeurTpsPasse);
    		
    		// Timer qui débute dans 500 millisecondes et qui compte toutes les 500 millisecondes
    		timer.schedule(tpsPasse, 500, 500);
    	}
    }
    
    private void reculeActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    	System.out.println ("recule") ;
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
    		File fichier = ouvrirFichier.getSelectedFile();
    		System.out.println(fichier);
    	}
    }  

                   
}

