package LAB06;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// getting symbol & name from user
		System.out.print("Enter stock name: ");
		String name = input.nextLine();

		System.out.print("Enter stock symbol: ");
		String symbol = input.next();

		// getting stock current & closing price from user
		System.out.print("Enter stock current price: ");
		double currentp = input.nextDouble();

		System.out.print("Enter stock closing price: ");
		double closingp = input.nextDouble();

		// creating object with the stock symbol and the name
		Stock S1 = new Stock(symbol, name);
		// the previous closing price
		S1.previousClosingPrice = closingp;
		// setting new current price
		S1.currentPrice = currentp;

		// printing
		System.out.println("\nDisplay:");
		System.out.println("Stock name  : " + S1.name);
		System.out.println("Stock symbol: " + S1.symbol);
		System.out.printf("Price changing : %.2f", S1.getChangePercent());
		System.out.print("%");

		input.close();

	}
}

class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	// this constructor will creates a stock with the specific symbol and name
	Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	// this method will return the percentage
	double getChangePercent() {
		double diff = currentPrice - previousClosingPrice;
		return (diff / previousClosingPrice) * 100;
	}
}
