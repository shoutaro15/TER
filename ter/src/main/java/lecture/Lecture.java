package lecture;

import java.io.*;
import java.util.ArrayList;

public class Lecture {
	public int nbEtat = 0;
	public int typeTemps = -1;
	public int typeForme = -1;
	public int tailleX = -1;
	public int tailleY = -1;
	public int initPlateau[][] = new int[39][39]; 
	public ArrayList<Cellule> evolPlateau = new ArrayList<Cellule>();
	public String resultat = ""; 	
	
	public boolean testEntier(String chaine){
		if(Character.isDigit(chaine.charAt(0))){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean testDelimiteur(String chaine){
		if(chaine.charAt(0) == '-'){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String lectureTxt(String fichier){	
		boolean finEtat = false;
		int compteur = 0;
		int delimiteur = 0;
		int colonne = 0;
		int line = 0;
		Cellule temp;
		String tempEtat = "";
		String tempString = ""; 
		String chaine="";	
		int nbPV = 0;
		float date = -1;
		int x = -1;
		int y = -1;
		ArrayList<Integer> etat = new ArrayList<Integer>();
		
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				compteur ++;
				
				if(delimiteur == 0 ){
					if(!testEntier(ligne) && !finEtat){
						this.nbEtat = compteur;
					}
					else{
						finEtat = true;
					}
					
					if(compteur == this.nbEtat + 1){
						this.typeTemps = Character.getNumericValue(ligne.charAt(0));
					}
					if(compteur == this.nbEtat + 2){
						this.typeForme = Character.getNumericValue(ligne.charAt(0));
					}
					if(compteur == this.nbEtat + 3){
						int i = 0;
						while(ligne.charAt(i) != ';'){
							tempString += ligne.charAt(i); 
							i++;
						}
						this.tailleX = Integer.parseInt(tempString);
						tempString = "";
						i++;
						while(ligne.charAt(i) != ';'){
							tempString += ligne.charAt(i); 
							i++;
						}
						this.tailleY = Integer.parseInt(tempString);
						tempString = "";
					}

					if(testDelimiteur(ligne)){
						delimiteur ++;
					}
				}else if(delimiteur == 1){
					//System.out.println(compteur);
					//System.out.println((this.nbEtat+4+tailleY));
					if(compteur <= (this.nbEtat+4+tailleY)){
						
						for(int i = 0; i<ligne.length(); i++){
							if(ligne.charAt(i) == ';'){
								//System.out.println("test ;");
								tempString = "";
							}else{
								//System.out.println("test ecrit : ");
								tempString += ligne.charAt(i); 
								
								//System.out.println(line + "/" +colonne);
								this.initPlateau[line][colonne] = Integer.parseInt(tempString);
								//System.out.println(this.initPlateau[i][colonne]);
								colonne++;
							}
							
						}
						tempString = "";
						//System.out.println("colonne ++");
						line++;
						colonne = 0;
					}
					else if(compteur > (this.nbEtat+4+tailleY) + 1){
						//System.out.println("test condition");
						for(int i = 0; i<ligne.length(); i++){
							//System.out.println("test boucle");
							if(ligne.charAt(i) == ';'){
								//System.out.println("test ;");
								nbPV++;

								if(nbPV == 1){
									//System.out.println("test date");
									date = Float.parseFloat(tempString);
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
									//System.out.println("test hardcore");
									for(int j = 0; j<tempString.length(); j++){
										//System.out.println("test hardcore boucle");
										if(tempString.charAt(j) == '-'){
											//System.out.println("test hardcore -");
											etat.add(Integer.parseInt(tempEtat));
											tempEtat = "";
										}
										else{
											//System.out.println("test hardcore ecrit");
											tempEtat += tempString.charAt(j);
										}
									}
									temp = new Cellule(date, x, y, etat);
									evolPlateau.add(temp);
									date = -1;
									x = -1;
									y = -1;
									tempString = "";
									nbPV = 0;
								}
						
							}
							else{
								//System.out.println("test ecrit");
								tempString += ligne.charAt(i);
							}
								}
					}
					if(testDelimiteur(ligne)){
						delimiteur ++;
					}
					//System.out.println("d" + delimiteur);
				}else if(delimiteur == 2){
					this.resultat = ligne;
				}
				chaine+=ligne+"\n";
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
		
		
		return chaine;
	}
}
