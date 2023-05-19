package homework2;

import java.util.Scanner;

public class Days {
	int zi ;
	public void askDay(){
		System.out.println("Introduceti ziua");
		Scanner scan = new Scanner(System.in);
		zi = scan.nextInt();
		scan.close();
	}
	public void checkDays(){
		askDay();
		if(zi >= 1 && zi <= 7){
			if(zi == 1)
				{System.out.println("Astazi este Luni");}
			else if(zi == 2)
			{System.out.println("Astazi este Marti");}
			else if(zi == 3)
			{System.out.println("Astazi este Miercuri");}
			else if(zi == 4)
			{System.out.println("Astazi este Joi");}
			else if(zi == 5)
			{System.out.println("Astazi este Vineri");}
			else if(zi == 6)
			{System.out.println("Astazi este Sambata");}
			else 
			{System.out.println("Astazi este Duminica");}
			
		}else  {
			if(zi == 0){
				System.out.println("Te rog sa introduci un numar mai mare ca 0");			
			}else{
				System.out.println("Saptamana are doar 7 zile te rog sa introduci un numar valid");
				}
		}
}
	public static void main(String[] args) {
		Days obj = new Days();
		obj.checkDays();
	}

}
