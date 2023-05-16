package curs3;

public class StaticVsNonStatic {
//variabila statica sau variabila de clasa
	public static String nume;
// cu new practic instantiez o clasa noua;
//var de  de instanta;
	public  String prenume;
	//metoda static
	public static void printStatic(){
		System.out.println("Static");
		
	}
	//metoda de instanta
	public void printNormal(){
		System.out.println("Normal");
		
	}
}

 //1 compileaza
 //3 incarca in men membrii statici
 //5 instantiaza obiecte

//--  apelarea se face  clas.variabila  si  clasa.metoda

// variabile cu static se fac var (si metode) la aceeasi locatie  in memorie  s sunt practic suprascise la  fiecare instantiere
//cu var de instanta se creeaza obiecte diferite care au locatii diferite in memorie