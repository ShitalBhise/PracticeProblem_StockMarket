package stock.java;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {

	ArrayList<StockManagement> arrayList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		StockAccount sa = new StockAccount();
		System.out.println("Welcome to stock management");

		while (true) {
			System.out.println("Enter the choice !!! \n1)Enter new stock \n2)Display Stock report " + "\n3)exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1 -> sa.addStocks();
			case 2 -> sa.stockReport();
			case 3 -> {
				System.out.println("exiting");
				System.exit(0);
			}
			default -> System.out.println("invalid input");
			}
		}
	}

	public void addStocks() {
		StockManagement stock = new StockManagement();
		System.out.println("Enter the stock name");
		stock.setStockNames(scanner.next());

		System.out.println("Enter the number of shares present");
		stock.setNumOfShare(scanner.nextDouble());

		System.out.println("Enter the share price");
		stock.setSharePrice(scanner.nextDouble());

		// adding object to array list
		arrayList.add(stock);
	}

	public void stockReport() {
		Double sum = 0.0;
		System.out.println("............. **STOCK REPORT**..............");
		System.out.println("stock name            Number of shares         Stock price       Total price of stock ");
		for (int i = 0; i < arrayList.size(); i++) {
			StockManagement s = arrayList.get(i);
			double totalPrice = s.getNumOfShare() * s.getSharePrice();
			totalPrice = sum + totalPrice;
//            System.out.format("stock name = " + s.getStockNames() + "\n number of shares = " + s.getNumOfShare() +
//                    "\n stock price = " + s.getSharePrice() + "\nTotal price of stock = " + totalPrice + "\n");
			System.out.format("%-10s            %-10.3f               %-10.3f         %-10.3f\n", s.getStockNames(),
					s.getNumOfShare(), s.getSharePrice(), totalPrice);
		}
	}
}