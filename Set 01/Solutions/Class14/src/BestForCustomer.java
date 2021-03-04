
public class BestForCustomer implements Discountable{
	private double percentage;
	private double threshold;
	private double discount;

	BestForCustomer() {

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
		double discountedThreshold;
		double discounted = price-(price * (percentage/100));
		
		if(price>=threshold) {
			discountedThreshold = price-(price*(discount/100));
			
		}else {
			discountedThreshold = price;
		}
		
		if(discounted < discountedThreshold)
			return discounted;
		else 
			return discountedThreshold;
		
		
	}

}
