package LAB06;

public class Task01 {

	public static void main(String[] args) {

		// create a rectangle and pass 10.5 width 20.5 height
		Rectangle obj1 = new Rectangle(4, 40);
		// create a rectangle and pass 5.5 width 10.5 height
		Rectangle obj2 = new Rectangle(5.5, 10.5);
		
		// display for obj1
		System.out.println("Rectangle 1: ");
		System.out.println("Width    :     " + obj1.width);
		System.out.println("Height   :    " + obj1.height);
		System.out.println("Area     :      " + obj1.getArea());
		System.out.println("Perimeter: " + obj1.getPerimeter());

		// display for obj2
		System.out.println();
		System.out.println("Rectangle 2: ");
		System.out.println("Width    :     " + obj2.width);
		System.out.println("Height   :    " + obj2.height);
		System.out.println("Area     :      " + obj2.getArea());
		System.out.println("Perimeter: " + obj2.getPerimeter());

	}

}

class Rectangle {
	double width;
	double height;

	// no-arg constructor
	Rectangle() {
		width = 1.0;
		height = 1.0;
	}

	// arg constructor
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return width * height;
	}

	double getPerimeter() {
		return 2 * (width + height);
	}
}
