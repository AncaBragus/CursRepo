package homework3;

import java.util.Scanner;

public class Comision {
/*
 * int comision;
 * int vanzari =3500;
 * comision = (vanzari>2500)? vanzari*5/100 : 0;
 * System.out.println("Comisionul tau este: " + comision);
 */
	public static void main(String[] args) {
		int comision;
		int vanzari =3500;
		
		if (vanzari > 2500) {
			comision = vanzari*5/100;
		}else comision=0;
		
		System.out.println("Comisionul tau este: " + comision);
	}

}
