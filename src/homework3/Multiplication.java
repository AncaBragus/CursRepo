package homework3;

import java.util.Scanner;

public class Multiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter number ");
		Scanner scan = new Scanner(System.in);
		int nr = scan.nextInt();
		scan.close();
		for(int i=1;i<=10;i++){
			System.out.println(nr + " * " + i + " = " + nr*i);
		}	
	}

}
