package curs4;

import java.util.Scanner;

public class Palindrom {

	/**
	 * radar  , masina
	 */
	public static void main(String[] args) {
		System.out.println("Enter  a text");
		Scanner scan= new Scanner(System.in);
		String cuvant = scan.next();
		scan.close();
		checkPalindrom(cuvant);

	}
	
	public static void checkPalindrom(String cuvant){
		System.out.println("Sol 1----------");
		int adev = 0;
		for( int i = 0; i < cuvant.length()/2;i++ )
		{
			if(cuvant.charAt(i) != cuvant.charAt(cuvant.length()-i-1))
				{
					adev = 1;
					//System.out.println(adev);
					break;
				}
				
		}
		if(adev == 0)
			{System.out.println("Cuvantul este palindrom");}
		else 
			{System.out.println("Cuvantul nu este palindrom");}
	
		System.out.println("Sol 2-----------------------");
	
		String cuvant2 = "";
		
		for(int i=cuvant.length()-1; i>=0;i--) {
			
			//cuvant2 += cuvant.charAt(i);
			cuvant2 = cuvant2 + cuvant.charAt(i);
		}
		
		String result = cuvant2.equals(cuvant) ? "Cuvantul este palindorm" : "Cuvantul nu este palindorm";
		System.out.println(result);
	
	}

}

