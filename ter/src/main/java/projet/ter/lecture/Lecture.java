package projet.ter.lecture;

import java.io.*;
import java.util.ArrayList;

public class Lecture {
	/***********
	 * ATTRIBUTS
	 * **********/
	public Plateau p = new Plateau();
	public String resultat = "";

	/************
	 * METHODES 
	 ************/
	/*fonction qui qui test le delimiteur de partie*/
	public boolean testDelimiteur(String chaine){
		if(chaine.charAt(0) == '-'){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void afficheList(ArrayList<Integer> liste){
		
		for(int i =0; i< liste.size(); i++)
			System.out.println("etat n°" + i + " = " + liste.get(i));
	}
	
	/*fonction qui parcours le fichier text(senario) ligne par ligne et qui creer un plateau selon le senario*/ 
	public Plateau lectureTxt(String fichier){	
		int numLigne = 0;	//compteur pour savoir sur quelle ligne on se trouve
		int delimiteur = 0; //pour savoir ou on se trouve dans le senario (head,body ou food)

		String tempString = "";
		String tempEtat = "";
		int nbPV = 0;

		int colonne = 0;
		int line = 0;

		Transition t = new Transition();
		Cellule temp = new Cellule();
		int x = -1;
		int y = -1;
		ArrayList<Integer> etat = new ArrayList<Integer>();

		boolean ok = false;

		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;

			while ((ligne=br.readLine())!=null){
				numLigne ++;

				if(delimiteur == 0 ){	//head

					if(numLigne == 1){ //type de senario
						int j = 0;
						while(ligne.charAt(j) != ';'){
							tempString += ligne.charAt(j); 
							j++;
						}
						this.p.senario = tempString;
						tempString = "";
					}
					if(numLigne == 2){ //type de temps synchrone ou asynchrone
						this.p.typeTemps = Character.getNumericValue(ligne.charAt(0));
					}
					if(numLigne == 3){ //forme des cellules de plateau (carre ou hexa)
						this.p.forme = Character.getNumericValue(ligne.charAt(0));
					}
					if(numLigne == 4){ //taille du plateau
						int i = 0;
						while(ligne.charAt(i) != ';'){
							tempString += ligne.charAt(i); 
							i++;
						}
						this.p.tailleX = Integer.parseInt(tempString);
						tempString = "";
						i++;
						while(ligne.charAt(i) != ';'){
							tempString += ligne.charAt(i); 
							i++;
						}
						this.p.tailleY = Integer.parseInt(tempString);
						tempString = "";
					}

					if(testDelimiteur(ligne)){ //test si la ligne est un delimiteur
						this.p.plateau = new Cellule[this.p.tailleY][this.p.tailleX]; //si c'est le tableau de cellule
						delimiteur ++;
					}
				}else if(delimiteur == 1){ //si on se situe dans le food

					if(numLigne <= (5+ this.p.tailleY)){ //plateau avec les etats initiaux 

						for(int i = 0; i<ligne.length(); i++){
							if(ligne.charAt(i) == ';'){
								
								etat = new ArrayList<Integer>();
System.out.println(colonne);
								for(int j = 0; j<tempString.length(); j++){

									if(tempString.charAt(j) == '-'){
										etat.add(Integer.parseInt(tempEtat));
										tempEtat = "";
									}
									else{
										tempEtat += tempString.charAt(j);

									}
								}
								etat.add(Integer.parseInt(tempEtat));

								afficheList(etat);
								temp = new Cellule(line, colonne, etat);
								this.p.plateau[colonne][line] = temp;
								line++;
								tempEtat = "";
								tempString = "";

							}else{
								tempString += ligne.charAt(i); 
							}
						}
						colonne++;
						line = 0;
					}
					else{	//partie maj des cellules

						if(!testDelimiteur(ligne)){

							for(int i = 0; i<ligne.length(); i++){	
								if(ligne.charAt(i) == ';'){

									nbPV++; 
									if(nbPV == 1){ //date

										if (t.date != Float.parseFloat(tempString)){
											if(ok ==true) {
												this.p.trans.add(t);
											}
											t = new Transition();
											t.date = Float.parseFloat(tempString);

										}
										tempString = "";
									}
									else if(nbPV == 2){ //coordonées x
										x = Integer.parseInt(tempString);
										tempString = "";
									}
									else if(nbPV == 3){ //coordonées y
										y = Integer.parseInt(tempString);
										tempString = "";
									}
									else if(nbPV == 4){	//liste etats
										etat = new ArrayList<Integer>();

										for(int j = 0; j<tempString.length(); j++){

											if(tempString.charAt(j) == '-'){
												etat.add(Integer.parseInt(tempEtat));
												tempEtat = "";
											}
											else{
												tempEtat += tempString.charAt(j);

											}
										}
										etat.add(Integer.parseInt(tempEtat));

										temp = new Cellule(x, y, etat);
										t.listeCellule.add(temp);

										//reinit toutes les valeurs
										x = -1;
										y = -1;

										nbPV = 0;
										ok = true;
										tempString = "";
										tempEtat = "";
									}

								}
								else{
									tempString += ligne.charAt(i);
								}
							}
						}

						else{
							this.p.trans.add(t);
							delimiteur ++;
						}
					}
				}else if(delimiteur == 2){ //partie food ou se trouve la partie resultat

					this.resultat = this.resultat + "\n" + ligne;


				}

			}

			br.close(); 
		}		
		catch (Exception e){ //si la lecture du fichier ne c'est pas effectuer correctement r'envoie une erreur
			System.out.println(e.toString());
		}

		return p;
	}

}