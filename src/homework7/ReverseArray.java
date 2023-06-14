package homework7;

import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
/**
 *Scriem un program care inverseaza un Array.
 Avem o metoda care intreaba userul care este lungimea Array-ului.
 Ex:Cate elemente trebuie sa aiba array-ul?
 4
 Avem o metoda care utilizeaza un For pentru a inversa Arrayul si alta metoda
care utilizeaza un while pentru a face acelasi lucru
 */
	public static void main(String[] args) {
	
		int[] nArray = readArray();
		printReverseArrayFor(nArray);
		System.out.println();
		printReverseArrayWhile(nArray);
		
	}
	public static int[] readArray(){
		Scanner scan = new Scanner (System.in);
		System.out.println("Cate elemente trebuie sa aiba array-ul?");
		int n = scan.nextInt();
		int[] rArray =new int[n];
		for (int i = 0 ; i < n; i++ ){
			System.out.println("Introdu elementul " + (i+1) + ":");
			rArray[i] = scan.nextInt();
		}	
		scan.close();
		return rArray;
	}
	public static void printReverseArrayFor(int[] pArray) {
		
		for (int i = pArray.length-1 ; i >= 0 ; i-- ){
			System.out.print(pArray[i] + " ");
		}
	}
	
	public static void printReverseArrayWhile(int[] pArray) {
		int i = pArray.length-1;
		while ( i >= 0  ){
			System.out.print(pArray[i] + " ");
			i--;
		}
	}
	
}
