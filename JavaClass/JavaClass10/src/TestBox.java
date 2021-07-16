
public class TestBox {

	public static void main(String[] args) {
		Box b1 = new Box(2, 3, 4);
		Box b2 = new Box();
		Box b3 = new Box(5);
		Box clone = new Box(b1);

		System.out.println("Volume of b1: " + b1.volume());
		System.out.println("Volume of b2: " + b2.volume());
		System.out.println("Volume of b3: " + b3.volume());
		System.out.println("Volume of clone of b1: " + clone.volume());

		b2.setWidth(10);
		b2.setHeight(15);
		b2.setDepth(20);
		System.out.println("Modified values of b2 attributes: " + b2.getWidth() + " " + b2.getHeight() + " " + b2.getDepth());
		System.out.println("Volume of b2: " + b2.volume());
	}

}
