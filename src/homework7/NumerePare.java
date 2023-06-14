package homework7;

import java.util.Scanner;

public class NumerePare {
/**

 * Scriem un program care intreaba utilizatorul 10 numere. Tine acele
numere intr-un array si le printeaza doar pe cele care sunt pare. Scriem rezolvarea folosind atat FOR cat si WHILE
 */
	public static void main(String[] args) {
		int n = 10;
		Scanner scan = new Scanner (System.in);
		int[] rArray = new int[n];
		for (int i = 0 ; i < n; i++ ){
			System.out.println("Introdu nr " + (i+1) + ":");
			rArray[i] = scan.nextInt();	
		}
		scan.close();
		System.out.println("-----------");
		for (int i = 0 ; i < n; i++ ){
		if (rArray[i] % 2 == 0){
			System.out.print(rArray[i] + " ");
			}	
		}
		System.out.println();
		System.out.println("-----------");
	}
}
		
