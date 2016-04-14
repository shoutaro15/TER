package lecture;

public class Main {
	public static void main(String[] args){
		String fichier = "src/main/java/lecture/test.txt";
		Lecture test = new Lecture();
		test.lectureTxt(fichier);
		
		System.out.println(test.p.senario + "/" + test.p.typeTemps + "/" + test.p.forme + "/"+ test.p.tailleX + "/"+ test.p.tailleY);
		System.out.println(test.p.plateau[0][0].etat.get(0) + "/" + test.p.plateau[1][1].etat.get(0));
		System.out.println(test.p.trans.get(0).date + "/" + test.p.trans.get(0).listeCellule.get(0).etat.get(1) + "/" + test.p.trans.get(0).listeCellule.get(0).etat.get(2) ); // petit probleme quand on lit la premiere ligne de maj, on ajoute 2 fois le meme etat puis le deuxieme etat ce qui donne une liste de 3 etats ce qui est faux 
		System.out.println(test.resultat);
	}
}
