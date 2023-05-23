package curs5;

import java.util.Scanner;

public class DiceGame {

	/**
	 * facem un joc d zaruri care are urm reguli"
	 * daca userul da in total :2, 6,12 > pierde jocul > ne oprim
	 * dc da in total "3,7 > castiga jocul > ne orim
	 * dc da in total 4,11,8 > repeta automat aruncarea
	 * dc da oricare dinte variantele care nu au fost enumerate
	 * atunci il intrebam daca vrea sa mai joace
	 * raspunsul va fi un boolean : try sau false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner (System.in);
		int dice1;
		int dice2;
		boolean startJoc = true;
		while (startJoc){
			dice1 = (int) (Math.random()*6+1);
			dice2 = (int) (Math.random()*6+1);
			//System.out.println(dice1);
			//System.out.println(Math.random());
			int total =dice1+dice2;
			System.out.println("Ai dat: " + total);	
			if(total ==2 || total ==6 || total ==12){
				System.out.println("Ai dat: " + total + " Ai pierut");
				//break;
				startJoc =false;
			}else if (total==4 ||total ==8 ||total==11){
				System.out.println("Ai dat: " + total + " Automat mai dai o data");
			}else if (total==3 ||total ==7 ){
				System.out.println("Ai dat: " + total + " Ai castigat");
				startJoc =false;
			}else {
				System.out.println("Ai dat: " + total + " Mai vrei un joc");
				startJoc=scan.nextBoolean();
			}
		}
	}
}
