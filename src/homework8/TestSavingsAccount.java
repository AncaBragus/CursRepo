package homework8;

import java.util.Scanner;
import java.util.InputMismatchException;
public class TestSavingsAccount {
	/**Clasa de executie TestSavingsAccount care simuleaza ATM –ul.
	Creaza un obiect de tip Customer
	Creaza un obiect de tip SavingsAccount
	Saluta userul “Hi ” + name
	Intreba userul ” Please enter the amount to widraw”
	Executa logica descrisa 
*/
	public static void main(String[] args) {
		
		Customer customer = new Customer("Dragos", "Address", "Eamil");
		SavingsAccount saveAcc = new SavingsAccount(1234567, 543.56, customer);
		System.out.println("Salut " + customer.getName() +",");	
		Scanner scan  = new Scanner(System.in);
		System.out.println("Please enter the amount to widraw:");
		
		try {
		 double amount = scan.nextDouble();	
			try {
				saveAcc.withdraw(amount);
			}catch(InsuficientFundsException e) {
				System.out.println(e.getMessage());
				System.out.println("Available balance is: " + saveAcc.getBalance());
				System.out.println("Thank You for using ATM!");
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter only numeric!");
		}
	}
}
