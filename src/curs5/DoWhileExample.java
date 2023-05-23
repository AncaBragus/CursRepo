package curs5;

import java.util.Scanner;

public class DoWhileExample {

	/**
	 * difente
	 */
	public static void main(String[] args) {
		String[] orase = {"Iasi" , "Cluj","Pitesti","Oradea"};
		int i=0;
		while(i>orase.length){
			System.out.println(orase[i]);
			i++;
		}
		System.out.println("--------");
		int j=0;
		do {
			System.out.println(orase[j]);
			j++;
		}while (j>orase.length);
	
	Scanner scan = new Scanner (System.in);
		System.out.println("--------");
		int nr2=0;
		do {
			System.out.println("enter a number");
			nr2 =scan.nextInt();
		}while (nr2 !=0);
	}
}
