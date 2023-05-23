package homework3;

import java.util.Scanner;

public class InvoiceDiscount {

	public static void main(String[] args) {
		float val;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter invoice value:");
		val = scan.nextInt();
		scan.close();
		
		val = (val>=100) ? (val -= val*10/100) : (val -= val*5/100);
		System.out.println("Total factura cu discount = " + val);
	}

}

	