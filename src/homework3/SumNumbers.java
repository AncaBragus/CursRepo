package homework3;

import java.util.Scanner;

public class SumNumbers {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int	sum = 0;
		for(int i=1;i<=10;i++){
			System.out.println("Please enter number " + i);
			int nr = scan.nextInt();
			sum +=nr; 
		}
		scan.close();
	System.out.println("The sum of the numbers is: " + sum);	
	}

}
