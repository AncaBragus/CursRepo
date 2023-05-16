package curs3;
/*
 * Facem un program care citeste 3 numere de la tastatura
 * Verifica care dintre cele 3 numere este cel mai mare
 * Printeaza rezultatul sub forma :
 * Ex :"First number is the greatest!"
 * Daca cel mai mare numar are un egal, printez :
 * "Some numbers are equal"
 */
import java.util.Scanner;

public class GratestOfThreeNumbers {
	int nr1, nr2, nr3 ;
	public void askTheNumbers(){
		Scanner scan = new Scanner(System.in);
		System.out.println("PLs enter 3 nrs:");
		nr1 =scan.nextInt();
		nr2 =scan.nextInt();
		nr3 =scan.nextInt();
		scan.close();
		}
	public void comapareTheNumbers(){
		// 9 8 3 -> nr1 ; 4 4 5 -> nr3; 5 4 5 or 5 5 4 or 4 5 5-> some nrs are equals; 	
		if (nr1 > nr2 && nr1 > nr3){
			System.out.println("nr1 e mai mare");
		}else if (nr2 > nr1 && nr2 > nr3){
			System.out.println("nr2 e mai mare");
		}else if (nr3 > nr1 && nr3 > nr2){
			System.out.println("nr3 e mai mare");
		}else {System.out.println("Some numbers are equals");
			  }
		}
}


