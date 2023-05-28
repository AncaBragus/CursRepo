package homework4;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
	
		int i =1;
		do {
			System.out.println("Te rog introdu username");
			String username = scan.next();
			
			System.out.println("Te rog introdu password");	
			int pass = scan.nextInt();
			
			if (username.equals("TestUser") && pass==1234)
			{
				System.out.println("Login Successfull");
				break;
				
			}else
			{
				System.out.println("Login Error");
			}
			i++;
			}
		while (i<=3) ;
		if (i == 4){
			System.out.println("Maximum attempts reached. User blocked");
			}
		}
}
