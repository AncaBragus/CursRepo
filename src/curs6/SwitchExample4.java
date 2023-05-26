package curs6;

import java.util.Scanner;

public class SwitchExample4 {

	/**
	 * un prg care verifica dc un student este eligibil pt bursa
	 * conditiile sunt:
	 * sa fie anul3
	 * sa aiba un punctaj de 80 pt bursa1
	 * sa aiba un punctaj de 50 pt bursa2
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Te rog introdu in ce un an");
		int an = scan.nextInt();
		System.out.println("Te rog introdu o punctajul");
		int punctaj = scan.nextInt();
		int days=0;
		switch (an){
		case 1:
		case 2:
		case 4:
			System.out.println("Nu esti eligbil-an diferit de 3");
			break;
		case 3: 
			//putem citi punctajul aici
			switch (punctaj){
			case 80: 
				System.out.println("Esti eligbil pt bursa1");
				break;
			case 50: 
				System.out.println("Esti eligbil pt bursa 2");
				break;
			default : 
				System.out.println("Nu esti eligbil punctaj");
				break;
			}
			break;
		default : 
			System.out.println("Nu esti eligbil - an invalid");
		}

	}

}
