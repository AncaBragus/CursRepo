package curs6;

import java.util.Scanner;

public class SwitchExample3 {

	/**
	 * prg care cere de la tastatura 1 an si o luna
	 * si printeaza cate zile are  luna respectiva
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Te rog introdu un an");
		int an = scan.nextInt();
		System.out.println("Te rog introdu o luna");
		int luna = scan.nextInt();
		int days=0;
		//an
		//1 3 5 7 8 10 12 -> au 31 days
		//2 -> 28 or 29 days
		//4 6 9 11 -> 30 days 
		switch (luna){
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days=31;
			break;
		case 4:
		case 6:
		case 9: 
		case 11:
			days=30;
			break;
		case 2:
			if(an%4 ==0 && an%100!=0 || an%400 ==0 ){
				days=29;
				}
			else{days=28;
			}
			break;
		default: 
			System.out.println("invalid");
	}	
		System.out.println("Luna aleasa are " + days);
		//se putea si cu ternar
	}
}
