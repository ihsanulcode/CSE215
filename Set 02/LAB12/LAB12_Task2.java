import java.util.Scanner;

interface Discountable {
	public abstract double discountedPrice(double price);

}

class BestForCustomer implements Discountable {
	private double percentage;
	private double threshold;
	private double discount;

	BestForCustomer() {

	}

	BestForCustomer(double percentage, double threshold, double discount) {
		this.percentage = percentage;
		this.threshold = threshold;
		this.discount = discount;
	}

	public double getPercentage() {
		return percentage;
	}

	public double getThreshold() {
		return threshold;
	}

	public double getDiscount() {
		return discount;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double discountedPrice(double price) {

		double thresholdDiscount = 0;
		double discounted = price - (price * (discount / 100));
		if (price >= threshold) {
			thresholdDiscount = price - (price * (percentage / 100));
		}

		if (discounted < thresholdDiscount)
			return discounted;
		else
			return thresholdDiscount;

	}

}

public class LAB12_Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println();
		double price = input.nextDouble();
		double discount_per = input.nextDouble();
		BestForCustomer a = new BestForCustomer(10, 100.00, discount_per);

		System.out.printf("%.2f",a.discountedPrice(price));

	}

}
