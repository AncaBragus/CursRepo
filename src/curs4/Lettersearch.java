package curs4;

import java.util.Scanner;

public class Lettersearch {

	/**
	 * prg care cere text de la tastatura
	 * cautam in text litera A
	 * Daca o gasim, print ca am gaasit si de cate ori exista in text
	 * Daca nu o gasim printam ca nu am gasit liter
	 */
	public static void main(String[] args) {
		System.out.println("Enter  a text");
		Scanner scan= new Scanner(System.in);
		String text = scan.next();
		scan.close();
		// masina  masina.charAt(3)==i
		//java da cate un index pt fiecare caracter din sir incepand de la 0
System.out.println(text.length());
int counter = 0;
for (int i=0; i<text.length(); i++){
		if(text.charAt(i)== 'A' || text.charAt(i)== 'a'){
		counter++;	
		}
	}
String resoult = (counter==0)? "Letter not found" :"Latter a was found"+counter;
}
}
