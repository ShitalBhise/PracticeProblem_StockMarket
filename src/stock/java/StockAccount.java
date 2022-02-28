package stock.java;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {
	static Scanner scanner = new Scanner(System.in);

	ArrayList<StockManagement> arrayList = new ArrayList<>();
	static double balance = 10000000;

	public void addStock() {
		StockManagement StockManagement;
		StockManagement = new StockManagement();
		double withdraw = 0;

		System.out.println(" Enter the stock name");
		scanner.nextLine();
		StockManagement.setStockNames(scanner.nextLine());

		System.out.println("Enter the Number of shares");
		StockManagement.setNumOfShare(scanner.nextInt());

		System.out.println("Enter the each share price");
		StockManagement.setSharePrice(scanner.nextDouble());
		withdraw = StockManagement.getSharePrice() * StockManagement.getNumOfShare();
		if (balance >= withdraw) {
			balance = balance - withdraw;
			arrayList.add(StockManagement);
			System.out.println("Remaining balance = " + balance);
		} else

			debit(withdraw);
	}

	public void printStockReport() {
		StockManagement StockManagement;
		StockManagement = new StockManagement();
		for (int i = 0; i < arrayList.size(); i++) {
			// StockManagement = arrayList.get(i);
			// double totalPrice = s.getNumOfShare() * s.getSharePrice();
			System.out.println("............. **STOCK REPORT**..............");
			System.out.println(StockManagement.toString());
			// System.out.println("stock name = " + s.getStockNames() + "\n number of shares
			// = " + s.getNumOfShare()
			// + "\n stock price = " + s.getSharePrice() + "\nTotal price of stock = " +
			// totalPrice + "\n");

		}
	}

	public void debit(double withdraw) {
		if (withdraw > balance) {
			System.out.println("Debit amount exceeded account balance.");
			System.out.println("Remaining balance = " + balance);
			System.out.println("withdraw = " + withdraw);
		}

	}

	/*
	 * public void stockReport() { Double sum = 0.0;
	 * System.out.println("............. **STOCK REPORT**.............."); //
	 * System.out.println("stock name Number of shares Stock price Total price of //
	 * stock "); for (int i = 0; i < arrayList.size(); i++) { StockManagement s =
	 * arrayList.get(i); double totalPrice = s.getNumOfShare() * s.getSharePrice();
	 * totalPrice = sum + totalPrice; System.out.println("stock name = " +
	 * s.getStockNames() + "\n number of shares = " + s.getNumOfShare() +
	 * "\n stock price = " + s.getSharePrice() + "\nTotal price of stock = " +
	 * totalPrice + "\n"); // System.out.format("%-10s %-10.3f %-10.3f %-10.3f\n",
	 * s.getStockNames(), // s.getNumOfShare(), s.getSharePrice(), totalPrice); } }
	 */
	public static void main(String[] args) {
		StockAccount s = new StockAccount();
		while (true) {
			System.out.println("Enter the selection\n1)addStock\n2)displayStockReport\n3)exit");
			byte choice = scanner.nextByte();
			switch (choice) {
			case 1 -> s.addStock();
			case 2 -> s.printStockReport();
			// case 3 -> stockManagement.printStockReport();
			case 3 -> System.exit(1);
			}
		}

	}

}