
public class HW {

	public static void main(String[] args) {
		
		Discountable a = new PercentageDiscount(50); //50% discount
		
		//set price 100tk, and we will get 50% discount so the discounted price will be 50tk,
		System.out.println("Discounted price: "+a.discountedPrice(100));  
		
		
		Discountable b = new ThresholdDiscount(100,50); //Threshold is 100tk and 50% discount
		
		//If your price is equal or greater than 100tk then you will get 50% discount otherwise return the net price
		System.out.println("\nGet Threshold Discount: "+b.discountedPrice(200));
		//If your price is lower than the threshold limit then you won't get any discount
		//System.out.println("No Threshold Discount: "+b.discountedPrice(50));
	}

}

abstract class Discountable {
	public abstract double discountedPrice(double price);
}

class PercentageDiscount extends Discountable {
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
		return price * (percentage/100);
	}
	
}

class ThresholdDiscount extends Discountable{
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
		if(price>=threshold) {
			return price*(discount/100);
		}else {
			return price;
		}
	}
}
