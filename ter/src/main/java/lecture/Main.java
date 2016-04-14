package lecture;

public class Main {
	public static void main(String[] args){
		String fichier = "src/main/java/lecture/test.txt";
		Lecture test = new Lecture();
		test.lectureTxt(fichier);
		
		System.out.println(test.p.senario + "/" + test.p.typeTemps + "/" + test.p.forme + "/"+ test.p.tailleX + "/"+ test.p.tailleY);
		System.out.println(test.p.plateau[0][0].etat.get(0) + "/" + test.p.plateau[1][1].etat.get(0));
		System.out.println(test.p.trans.get(0).date + "/" + test.p.trans.get(0).listeCellule.get(0).etat.get(0) + "/" + test.p.trans.get(0).listeCellule.get(0).etat.get(1) ); 
		System.out.println(test.resultat);
	}
}
