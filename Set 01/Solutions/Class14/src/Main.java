
public class Main {

	public static void main(String[] args) {

		BestForCustomer a = new BestForCustomer();
		a.setPercentage(50);
		a.setDiscount(80);
		a.setThreshold(400);

		System.out.println("The best possible sales price: " +a.discountedPrice(500));

	}

}
