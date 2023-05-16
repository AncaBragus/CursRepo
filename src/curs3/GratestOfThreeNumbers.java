package curs3;

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
		if (nr1 > nr2 && nr1 > nr3){
			System.out.println("nr1 e mai mare");
		}else if (nr2 > nr1 && nr2 > nr3){
			System.out.println("nr2 e mai mare");}
		else if (nr3 > nr1 && nr3 > nr2){
			System.out.println("nr3 e mai mare"); }
	} 
		}


