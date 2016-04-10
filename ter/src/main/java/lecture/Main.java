package lecture;

public class Main {
	public static void main(String[] args){
		Lecture test = new Lecture();
		
		String fichier = "src/main/java/lecture/test.txt";
		System.out.println(test.lectureTxt(fichier) + "/" + test.nbEtat + "/" + test.typeTemps + "/" + test.typeForme + "/" + test.tailleX + "/" + test.tailleY);
		System.out.println(test.initPlateau[0][0] + "/" + test.initPlateau[1][1]);
		System.out.println(test.evolPlateau.get(0).date + "/" + test.evolPlateau.get(1).date);
		System.out.println(test.resultat);
	}
}
