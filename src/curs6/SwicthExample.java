package curs6;

import java.util.Scanner;

public class SwicthExample {

	/**
	 * intrebam un calificativ  si in fct de calificativ
	 * printam un mesaj
	 * daca  e A -> felicitari
	 * b -> Destul de bine!
	 * C -> Suficient!
	 * D -> Insuficient
	 * daca introduce lt calificativ printam -> Calificativ Invalid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Te rog introdu un calificativ");
		int nota = scan.nextInt();
		switch (nota){
		case 10:
			System.out.println("Felicitari");
			break;
		case 8:
			System.out.println("Destul de Bine");
		case 6:
			System.out.println("Sufcient");
		case 4:
			System.out.println("Insuficient");
		default:
			System.out.println("Calificativ Invalid");

		}

	}

}
