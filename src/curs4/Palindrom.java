package curs4;

import java.util.Scanner;

public class Palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter  a text");
		Scanner scan= new Scanner(System.in);
		String cuvant = scan.next();
		scan.close();
		checkPalindrom(cuvant);

	}
	
	public static void checkPalindrom(String cuvant){
		int adev = 0;
		for( int i = 0; i < cuvant.length()/2;i++ )
		{
			if(cuvant.charAt(i) != cuvant.charAt(cuvant.length()-i-1))
				{
					adev = 1;
					System.out.println(adev);
					break;
				}
				
		}
		if(adev == 0)
			{System.out.println("cuvantul este palindrom");}
		else 
			{System.out.println("cuvantul nu este palindrom");}
	}

}

