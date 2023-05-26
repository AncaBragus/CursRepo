package curs6;

import java.util.Scanner;

public class SwitchExample2 {

	/**
	 * verifica daca  o liter e vocala sau consoana
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Te rog introdu o litera");
		char litera = scan.next().charAt(0);
		switch (litera){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': 	System.out.println("Este vocala");
			break;
		default: System.out.println("Este consoana");
				
		}
	}

}
