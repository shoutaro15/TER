package lecture;

import java.io.*;
import java.util.ArrayList;

public class Lecture {
	public Plateau p = new Plateau();
	public String resultat;


	public boolean testDelimiteur(String chaine){
		if(chaine.charAt(0) == '-'){
			return true;
		}
		else{
			return false;
		}
	}

	public Plateau lectureTxt(String fichier){	
		int numLigne = 0;
		int delimiteur = 0;

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

				if(delimiteur == 0 ){

					if(numLigne == 1){
						int j = 0;
						while(ligne.charAt(j) != ';'){
							tempString += ligne.charAt(j); 
							j++;
						}
						this.p.senario = tempString;
						tempString = "";
					}
					if(numLigne == 2){
						this.p.typeTemps = Character.getNumericValue(ligne.charAt(0));
					}
					if(numLigne == 3){
						this.p.forme = Character.getNumericValue(ligne.charAt(0));
					}
					if(numLigne == 4){
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

					if(testDelimiteur(ligne)){
						this.p.plateau = new Cellule[this.p.tailleY][this.p.tailleX];
						delimiteur ++;
					}


				}else if(delimiteur == 1){

					//System.out.println(numLigne);
					//System.out.println((5+ this.p.tailleY));

					if(numLigne <= (5+ this.p.tailleY)){

						//System.out.println(colonne);
						for(int i = 0; i<ligne.length(); i++){
							if(ligne.charAt(i) == ';'){
								//System.out.println("test ;");
								tempString = "";
							}else{
								//System.out.println("test ecrit : ");
								tempString += ligne.charAt(i); 

								//System.out.println(colonne + "/" +line);

								etat = new ArrayList<Integer>();
								etat.add(Integer.parseInt(tempString));
								temp = new Cellule(colonne, line, etat);
								this.p.plateau[colonne][line] = temp;

								//System.out.println("etat" + this.p.plateau[0][0].etat.get(0));
								line++;
							}

						}
						//System.out.println(colonne);
						colonne++;

						line = 0;
					}
					else{
						//System.out.println("test condition");

						if(!testDelimiteur(ligne)){
							for(int i = 0; i<ligne.length(); i++){

								//System.out.println("test boucle" + ligne.charAt(i));
								if(ligne.charAt(i) == ';'){
									//System.out.println("test ;" + ligne.charAt(i));
									nbPV++;

									if(nbPV == 1){

										if (t.date != Float.parseFloat(tempString)){
											if(ok ==true) {this.p.trans.add(t);
											//System.out.println("on est la");
											}
											t = new Transition();
											t.date = Float.parseFloat(tempString);

										}
										//System.out.println("test date");
										tempString = "";
									}
									else if(nbPV == 2){
										//System.out.println("test x");
										x = Integer.parseInt(tempString);
										tempString = "";
									}
									else if(nbPV == 3){
										//System.out.println("test y");
										y = Integer.parseInt(tempString);
										tempString = "";
									}
									else if(nbPV == 4){
										System.out.println("test hardcore" + ligne.charAt(i));
										for(int j = 0; j<tempString.length(); j++){
											System.out.println("test hardcore boucle");
											if(tempString.charAt(j) == '-'){
												System.out.println("test hardcore -" + tempEtat);
												etat.add(Integer.parseInt(tempEtat));
												tempEtat = "";
											}
											else{
												tempEtat += tempString.charAt(j);
												System.out.println("test hardcore ecrit" + tempEtat);

											}

											if(j == tempString.length()-1){
												System.out.println("test hardcore fin" + tempEtat);
												etat.add(Integer.parseInt(tempEtat));

											}
										}

										temp = new Cellule(x, y, etat);
										//System.out.println("temp" +temp.etat.get(0));
										t.listeCellule.add(temp);
										//System.out.println("listec" + t.listeCellule.get(0).etat.get(0));

										x = -1;
										y = -1;
										etat = new ArrayList<Integer>();
										nbPV = 0;
										ok = true;
										tempString = "";
										tempEtat = "";
									}

								}
								else{

									//System.out.println("test ecrit" + ligne.charAt(i));
									tempString += ligne.charAt(i);
								}
							}
						}

						else{
							this.p.trans.add(t);
							delimiteur ++;
						}
					}
				}else if(delimiteur == 2){
					this.resultat = ligne;
				}
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}


		return p;
	}

}