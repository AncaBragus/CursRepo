package homework8;

import java.util.Scanner;

public class SavingsAccount extends Account{
	/**
	 * Clasa SavingsAccount care mosteneste Account
		Seteaza in constructor accountOwner, balance si accountNumber
		Suprascrie metoda withdraw unde implementeaza:
		- daca suma ce urmeaza a fi retrasa este mai mare decat balanta curenta, arunca InsuficientFundsException
		- altfel scade suma ce urmeaza a fi retrasa din balanta
	 */
		//accountNumber=12345;
		//balance=500;
		//accountOwner.name="Dragos";
	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner);
		
	}

	@Override
	public void withdraw(double amount) throws InsuficientFundsException {
			if (balance-amount < 0) {
				throw new InsuficientFundsException("Insuficient funds for transaction!");
			}else {
				balance = balance-amount;
				System.out.println("Please pick your money!");
				System.out.println("Your new balance is: " + balance);
				System.out.println("Thank you for using ATM!");
			}		
	}
}
