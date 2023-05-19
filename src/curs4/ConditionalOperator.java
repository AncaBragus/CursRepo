package curs4;

import java.util.Scanner;

public class ConditionalOperator {
	/*
	 * prg citeste 2 numere de la tastatura
	 * daca fiecare nr e poz
	 * daca ambele sunt poz
	 * care este cel mic sau daca sunt egale
	 * 
	 */
public static void main(String[] args) {
	
	int num1;
	int num2;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter nr1");
	num1 = scan.nextInt();
	System.out.println("Please enter nr2");
	num2 = scan.nextInt();
	
	if(num1 >=0){
		System.out.println("Num1 este poz");	
	}
	/*
	 * 
	 */
	else 
	{System.out.println("nr1 este negativ");}
	
	String result = num1>=0 ? "nr1 este poz" : "nr1 este neg";
	System.out.println(result);
	if(num2 >=0){
		System.out.println("Num2 este poz");	
	}
	else 
	{System.out.println("nr2 este negativ");
	
	}
	if(num1>num2){
		System.out.println("num1 este mai mare");
	}
	else
		{System.out.println("num2 este mai mare");}
	
	result = num1>num2? " Num1 este mai mare" : num1<num2? "Num2 este mai mare" : "numerele sunt egale";
	System.out.println(result);
}
}
