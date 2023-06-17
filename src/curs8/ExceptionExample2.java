package curs8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner scan =new Scanner(System.in);
			System.out.println("Intr n1");
			int num1 = scan.nextInt();
			System.out.println("Intr n2");
			int num2 = scan.nextInt();
			int sum =num1/num2;
			System.out.println(sum);
		}catch(InputMismatchException e){
			System.out.println("insert only numeric values");
		}catch(ArithmeticException e){
			System.out.println("do not  divide by zero");
		}catch(NullPointerException e){
			System.out.println("null pointer occured");
		}catch (Exception e){
		System.out.println(" Something went wrong! General Exception; don't know how to handle ");}
		}
	
	}


