package curs8;

import java.util.Scanner;

public class TetAgeVerifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeVerifier obj = new AgeVerifier();
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your age:");
		int age = scan.nextInt();
		
		try{
		 obj.checkAgeLimit(age);
		}catch(InvalidAgeException e){
			System.out.println(" your age must be >=18");
		}

	}

}
