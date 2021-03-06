package projet.ter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
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
	JPanel panel = new JPanel();
	public static String fichier = "";
	public static Lecture lecture = new Lecture();
	public static Plateau plateau = new Plateau();

	private JLabel legend;
	//JFrame frame = new JFrame();


	private JButton avance;
	private JButton play;
	private JButton recule;
	private JButton pause;
	private JButton stop ;
	private JButton ChargerFicher;

	// End of variables declaration 
	Dimension ecran = Toolkit.getDefaultToolkit().getScreenSize();
	int w = ecran.getSize().width;
	int h = ecran.getSize().height; 




	public Fenetre() {
		//fonction qui initialise la fenetre
		initComponents();
		this.setTitle("Projet TER");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(1000, 600);
		this.setMinimumSize(new Dimension(1100, 800));
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
		stop = new javax.swing.JButton();
		Scène = new javax.swing.JPanel();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Fenetre");
		setBounds(new java.awt.Rectangle(0, 0, 0, 0));

		Legende.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		/*legend.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		legend.setText("Légende"); */

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

		stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/stop.png"))); // NOI18N
		stop.setBorder(null);
		stop.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				stopActionPerformed(evt);
			}
		});
		//this.ConteneurBoutons.setLayout(new BoxLayout(this.ConteneurBoutons,BoxLayout.PAGE_AXIS));
		javax.swing.GroupLayout ConteneurBoutonsLayout = new javax.swing.GroupLayout(ConteneurBoutons);
		ConteneurBoutons.setLayout(ConteneurBoutonsLayout);
		ConteneurBoutonsLayout.setHorizontalGroup(
				ConteneurBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(ConteneurBoutonsLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(recule, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(avance, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConteneurBoutonsLayout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(ChargerFicher, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(81, 81, 81))
				);
		ConteneurBoutonsLayout.setVerticalGroup(
				ConteneurBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(ConteneurBoutonsLayout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(ConteneurBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(avance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(recule, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addComponent(stop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
				.addGap(0, 415, Short.MAX_VALUE)
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
						.addGap(18, 18, 18)
						.addComponent(Legende, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
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
	int vitesseAvance = 0;
	int vitesseRecule = 0;
	public static int valeurTpsPasse = 0; // Valeur du temps passé
	boolean verifScenario = false;

	private void playActionPerformed(java.awt.event.ActionEvent evt) {
		// On vérifie si le timer n'a pas encore été lancé
		if(  verifScenario && !TempsPasse.terminer) {
			new Controle().afficherDate();

			if(timer!=null)
				timer.cancel();
			vitesseAvance = 0;
			vitesseRecule = 0;
			timer = new Timer();

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
		if(timer!=null)
			timer.cancel();

		vitesseAvance = 0;
		vitesseRecule = 0;


	}
	private void stopActionPerformed(java.awt.event.ActionEvent evt) {     
		if(verifScenario){
			plateau = lecture.lectureTxt(fichier);
			TempsPasse.miseAZero();
			valeurTpsPasse=0;
			if(timer!=null)
				timer.cancel();
			vitesseAvance = 0;
			vitesseRecule = 0;;
			this.Scène.repaint();


		}

	} 


	private void avanceActionPerformed(java.awt.event.ActionEvent evt) {                                       
		if(verifScenario){
			new Controle().afficherDate();

			if(timer!=null)
				timer.cancel();

			vitesseRecule=0;
			if(vitesseAvance>=8)
				vitesseAvance = 0;


			timer = new Timer();
			tpsPasse = new TempsPasse(timer);
			vitesseAvance++;

			// Timer qui débute dans 500 millisecondes et qui compte toutes les 500 millisecondes
			timer.schedule(tpsPasse, 500/vitesseAvance, 500/vitesseAvance);
		}

	}

	private void reculeActionPerformed(java.awt.event.ActionEvent evt) {

		if(!TempsPasse.historique.isEmpty() ){

			new Controle().afficherDate();
			if(timer!=null)
				timer.cancel();

			timer = new Timer();
			vitesseAvance = 0;
			if(vitesseRecule>=8)
				vitesseRecule = 0;



			/*
			 * Classe TempsPasse initialisé à "valeurTpsPasse"
			 * Démarre à partir de "0" au début
			 * Démarre ensuite à partir de n'importe quelle valeur de "valeurTpsPasse"
			 * 
			 */

			tpsRecule = new TempsRecule(timer);


			vitesseRecule++;
			// Timer qui débute dans 1 seconde et qui compte toutes les secondes
			timer.schedule(tpsRecule, 1000/vitesseRecule, 1000/vitesseRecule);
			
			
		}
	}                                    








	/**
	 * Ouvre une boîte de dialogue lorsque l'on clique sur le bouton pour charger un fichier.
	 * 
	 * @param evt clic sur le bouton
	 */
	private void ChargerFicherActionPerformed(java.awt.event.ActionEvent evt) {                                                  	
		JFileChooser ouvrirFichier = new JFileChooser();
		Grille neutre = null;
		ouvrirFichier.setFileFilter(new FileNameExtensionFilter("Fichier texte (.txt)", "txt"));

		if(ouvrirFichier.showDialog(null, "Importer un scénario") == JFileChooser.APPROVE_OPTION) {
			File fichiertemp = ouvrirFichier.getSelectedFile();
			fichier = fichiertemp.toString();
			if(verifScenario){
				plateau = new Plateau();
				lecture = new Lecture();
				this.Scène.removeAll();
				panel.removeAll();
				TempsPasse.miseAZero();
				valeurTpsPasse=0;
				if(timer!=null)
					timer.cancel();
				vitesseAvance = 0;
				vitesseRecule = 0;;
				this.Scène.repaint();
				
			}else
				this.Scène.setLayout(new BorderLayout());



			plateau = lecture.lectureTxt(fichier);

			

			if(plateau.senario.equals("feu")){
				neutre = new GrilleHex(plateau);
				verifScenario = true;
				
				ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
				File folder = new File(neutre.chemin+plateau.senario+"/icone/");
				File[] listOfFiles = folder.listFiles();
				for (File file : listOfFiles) {
					if (file.isFile()) {

						images.add( new ImageIcon(neutre.chemin+plateau.senario+"/icone/"+file.getName()));
					}
				}
				
	            
			
				
				
				JLabel etats = new JLabel ("Etat n°:") ;
				etats.setFont(new Font("Tahoma", 1, 15));
				panel.add(new JLabel("                                  "));
				panel.add(etats);
				panel.add(new JLabel("                                  "));

			

				

				for(int i =0 ;i<images.size();i++){
					Image img = images.get(i).getImage();
					BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
					Graphics g = bi.createGraphics();
					g.drawImage(img, 0, 0, 25, 25, null);
					ImageIcon newIcon = new ImageIcon(bi);
					 panel.add(new JLabel(newIcon));
					panel.add(Box.createRigidArea(new Dimension(1,0)));
					panel.add(new JLabel(""+i));
					
					panel.add(Box.createRigidArea(new Dimension(1,0))); 


				}
				panel.add(new JLabel("             "));
				
				


			}
			if(plateau.senario.equals("avion")){
				neutre = new GrilleCarre(plateau);
				verifScenario = true;


			}

			panel.add(new JLabel("             "));
			JLabel resultat = new JLabel("Resultats de la Simuation :") ;
			resultat.setFont(new Font("Tahoma", 1, 14));
			
			panel.add(resultat);

			String [] result=new String[lecture.resultat.split("\n").length];
			result = lecture.resultat.split("\n");


			for(int i =1 ; i<result.length;i++){

				JLabel temp =new JLabel(result[i]);
				temp.setFont(new Font("Verdana",1,15));
				panel.add(new JLabel(result[i]));

 
			}

			panel.setBackground(Color.GRAY);

			Legende.validate();

			Legende.repaint();
			this.validate();
			Legende.add(panel);
			

			
			this.setLayout(new BorderLayout());
			this.getContentPane().add(Scène, BorderLayout.CENTER);
			this.getContentPane().add(Legende,BorderLayout.EAST);

			panel.setBounds(5,5, Legende.getWidth(), h);
			
			this.Scène.add(neutre,BorderLayout.CENTER);
			this.Scène.validate();

			TempsPasse.fenetre = this.Scène;
			TempsPasse.grille = neutre;
			TempsPasse.plateau = plateau;

			TempsRecule.fenetre = this.Scène;
			TempsRecule.grille = neutre;
			TempsRecule.plateau = plateau;

			SwingUtilities.updateComponentTreeUI(this);
			
			



		}
	}  





}

