package curs7;

public class OverloadExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(multiplayDouble(2,3.5));
		//sysout este o metoda supraincarcata; exista mai multe methode cu param diferiti, de fapt sunt metode diferite care au ac functionalitate au param diferiti
		//este aparent o sg metoda  folosita cu multiplii parametrii
		System.out.println("text");
		System.out.println('c');
		System.out.println(123);

	}

	public static int multiplay(int a, int b){
		return a*b;
		
	}
	
	public static double multiplayDouble(double a, double b){
		return a*b;
		
	}
}
