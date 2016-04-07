package lecture;

import java.io.*;
import java.util.ArrayList;

public class Lecture {
	public ArrayList<Cellule> initPlateau = new ArrayList<Cellule>();
		
	public String lectureTxt(String fichier){	
		String chaine="";	
	
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				System.out.println(ligne);
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
