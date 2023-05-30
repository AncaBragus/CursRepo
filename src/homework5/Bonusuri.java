package homework5;

import java.util.Scanner;

public class Bonusuri {

	public static void main(String[] args) {
		int bonus=0;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Te rog introdu vechimea");
		int vechime = scan.nextInt();
		
		switch (vechime){
		case 1:{
			bonus=100;
			break;}
		case 2:{
			bonus=200;
			break;}
		case 3:{
			System.out.println("Te rog introdu valoarea vanzarilor");
			int valoare = scan.nextInt();
			
			if (valoare<=5000){
				bonus =600;
				
			}else if (valoare<=10000){
				System.out.println("Te rog introdu luna");
				int luna = scan.nextInt();
				
				scan.close();
				switch (luna){
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:{
					bonus =800;
					break;
				}
				case 7:
				case 8:
				case 9:
				case 10:
				case 11: {
					bonus = 1000;
					break;
					}
				case 12: {
					bonus = 900;
					System.out.println (" In decembrie se vand singure!");
					break;
					}
				}
			}
			else {
				bonus =1200;
			}
			break;
			}
		default:{
			System.out.println ("Vechime > 3 ani; bonus preferential?!");
			}
		}
		System.out.println("bonus acordat " + bonus );
	}
}
