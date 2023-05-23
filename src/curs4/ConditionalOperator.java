package curs4;

import java.util.Scanner;

public class ConditionalOperator {
	/*
	 * prg citeste 2 numere de la tastatura
	 * daca fiecare nr e poz
	 * daca ambele sunt poz
	 * care este cel mic sau daca sunt egale
	 * if else
	 * ternary
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
	}else 
	{System.out.println("nr1 este negativ");
	}
	//result = conditie ? expr1:expr2;
	String result = num1>=0 ? "nr1 este poz" : "nr1 este neg";
	System.out.println(result);
	if(num2 >=0){
		System.out.println("Nr2 este poz");	
	}
	else 
	{System.out.println("Nr2 este negativ");
	}
	
	result = num2>=0?"Num2 is pozitive":"Num2 is negative";
	System.out.println("TR = " +result);
	
	if(num1 >= 0 && num2 >= 0) {
		System.out.println("Numbers are pozitive");
	}else {
		System.out.println("Numbers are negative");
	}
	result = num1 >= 0 && num2 >= 0?"Numbers are pozitive":"Numbers are negative";
	System.out.println("TR = " +result);
	
	
	if(num1>num2) {
		System.out.println("Num1 is the greatest");

	}else if(num1 <num2) {
		System.out.println("Num2 is the greatest");

	}else {
		System.out.println("Numbers are equal");
	}
	result = num1>num2?"Num1 is the greatest":
		    num1<num2?"Num2 is the greatest":"Numbers are equal";
	System.out.println("TR = " +result);

}

}