package lecture;

import java.io.*;
import java.util.ArrayList;

public class Lecture {
	public int nbEtat = 0;
	public int typeTemps = -1;
	public int typeForme = -1;
	public int tailleX = -1;
	public int tailleY = -1;
	public int initPlateau[][]; 
	//public ArrayList<Cellule> initPlateau = new ArrayList<Cellule>();
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
		int temp = 0;
		String tempString = ""; 
		String chaine="";	
	
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
					}

					if(testDelimiteur(ligne)){
						delimiteur ++;
					}
				}else if(delimiteur == 1){
					for(int i = 0; i<ligne.length(); i++){
						if(ligne.charAt(i) == ';'){
							i++;
						}
					}
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
