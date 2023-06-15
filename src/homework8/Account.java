package homework8;

import java.util.Scanner;

import curs8.InvalidAgeException;

public class Account {
	private int accountNumber;
	public double balance;
	public Customer accountOwner;
	
	//accountNumber=12345;
	//balance=500;
	//accountOwner.name="Dragos";
	
	public Account(int accountNumber, double balance, Customer accountOwner) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(Customer accountOwner) {
		this.accountOwner = accountOwner;
	}

	public void withdraw(double amount) throws InsuficientFundsException {
				if (balance-amount < 0) {
				throw new InsuficientFundsException("Insuficient funds for transaction!");
			}
	}
}
