package curs5;

import java.util.Scanner;

public class WhileExample3 {

	/**
	 * prg care cal salriul pe o saptamana
	 * intrebam utiliz cate ore a lucrt
	 * calculam doar daca  a lucrat  1 ora sau maxim 40
	 * daca intr nr invalid 0 sau 40+ , il rugam sa introduca din nou
	 * rate per hour =20
	 * salriul = rate * nrore
	 * ex: sal tau este : +sal
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ratePerHour = 20;
		System.out.println("Cat ore ai lucrat sapt asta?");
		Scanner scan =new Scanner(System.in);
		int oreLucrate =scan.nextInt();
		
		while (oreLucrate <=0 || oreLucrate >40) {
			System.out.println("Intr un nr valid e ore intre 1 si 40");
			oreLucrate =scan.nextInt();
		}
		System.out.println("sal tau este " + oreLucrate*ratePerHour);
		
	}

}
