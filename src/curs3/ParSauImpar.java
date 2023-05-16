package curs3;

import java.util.Scanner;

public class ParSauImpar{
	int number ;

	public void askTheUseForANumber(){
		System.out.println("Pls enter a number");
		Scanner scan = new Scanner(System.in);
		//int number = scan.nextInt();
		// e locala aici  si are efect doar aici intre {} astea -> o duc sus global si o folosesc asa:
		number = scan.nextInt();
		scan.close();
		
	}
	public void checkNumberIsOddOrEven(){
		askTheUseForANumber();
		
		if(number % 2 == 0){
			System.out.println(number + " even par");
			
		}else{
			System.out.println(number + " odd impar");
		}
	}
}
