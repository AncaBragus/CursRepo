package curs5;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {

		System.out.println("Please enter a number :");
		Scanner scan  =  new Scanner(System.in);
		
	
	/*	for(int nr = scan.nextInt(); nr != 0; nr = scan.nextInt()) {
			System.out.println(nr*10);
			System.out.println("Please enter a number :");
		}
		*/
		int nr = scan.nextInt();
		while (nr!=0) {
			System.out.println(nr*10);
			System.out.println("Please enter a number :");
		}
		
	}
}
