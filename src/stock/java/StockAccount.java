package stock.java;

import java.util.Scanner;

public class StockAccount {
	static Scanner scanner = new Scanner(System.in);
	private double balance;

	public StockAccount(double balance) {
		super();
		this.balance = balance;
	}

	public void debit(double balance) {
		System.out.println("enter ammount to withdraw");
		double withdraw = scanner.nextDouble();
		if (withdraw > balance)
			System.out.println("withdraw exceeds the balance please enter correct ammount");
		else
			balance = balance - withdraw;
		System.out.println("Remaining balance is " + balance);

	}

	public static void main(String[] args) {
		System.out.println("Enter the balance to mention in the account");
		StockAccount account = new StockAccount(scanner.nextDouble());
		account.debit(account.balance);
	}

}