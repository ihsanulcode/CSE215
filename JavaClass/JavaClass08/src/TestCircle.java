
public class TestCircle {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(25);
		
		System.out.println("Circle 1:");
		System.out.printf("Area: %.2f",c1.getArea());
		System.out.println("\nPerimeter: "+c1.getPerimeter());
		
		System.out.println("Circle 2:");
		System.out.println(c2.getArea());
		System.out.println(c2.getPerimeter());
		
		System.out.println("Circle 3:");
		System.out.println(c3.getArea());
		System.out.println(c3.getPerimeter());
	}

}
