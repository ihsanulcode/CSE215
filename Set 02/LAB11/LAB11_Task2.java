import java.util.Scanner;

public class LAB11_Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double price = input.nextDouble();
		double discount = input.nextDouble();
		
		PercentageDiscount obj1 = new PercentageDiscount(discount);
		ThresholdDiscount obj2 = new ThresholdDiscount(100,discount);
		
		System.out.println(obj1.discountedPrice(price));
		System.out.println(obj2.discountedPrice(price));
		
	}

}

abstract class Discountablee {
	public abstract double discountedPrice(double price);
}

class PercentageDiscount extends Discountablee {
	private double percentage;

	public PercentageDiscount() {

	}

	public PercentageDiscount(double percentage) {
		this.percentage = percentage;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double discountedPrice(double price) {
		return price - price * (percentage / 100);
	}

}

class ThresholdDiscount extends Discountablee {
	private double threshold;
	private double discount;

	public ThresholdDiscount() {

	}

	public ThresholdDiscount(double threshold, double discount) {
		this.threshold = threshold;
		this.discount = discount;
	}

	public double getThreshold() {
		return threshold;
	}

	public double getDiscount() {
		return discount;
	}

	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double discountedPrice(double price) {
		if(price > threshold) {
			return price - (price*(10/100.0));
		}else {
			return price;
		}
	}
}
