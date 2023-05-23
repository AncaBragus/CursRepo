package homework3;

import java.util.Scanner;

public class Calificativ {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		int punctaj;
		String calific;
		System.out.println("Introduceti punctajul ");
		Scanner scan = new Scanner(System.in);
		punctaj = scan.nextInt();
		scan.close();

		calific =(punctaj>=90)? "FB" : ((punctaj>=80) ? "B" : "S");
		//calific =(punctaj<80)? "S" : ((punctaj<90) ? "B" : "FB");		
		String output = (calific.equals("FB")) ?  "Ai primit : FoarteBine" : (calific.equals("B")) ? "Ai primit : Bine" : "Ai primit : Suficient" ;
		System.out.println(output);
	}

}
