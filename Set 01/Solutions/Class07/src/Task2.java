
public class Task2 {

	public static void main(String[] args) {

		// create a rectangle and pass 10.5 width 20.5 height
		Triangle obj1 = new Triangle(4, 40);
		// create a rectangle and pass 5.5 width 10.5 height
		Triangle obj2 = new Triangle(5.5, 10.5);

		// display for obj1
		System.out.println("Triangle 1: \n");
		obj1.showWidthOfEachSide();
		System.out.println("Area: " + obj1.getArea());

		// display for obj2
		System.out.println();
		System.out.println("Triangle 2: \n");
		obj2.showWidthOfEachSide();
		System.out.println("Area: " + obj2.getArea());

	}

	static class Triangle {
		double base;
		double height;

		// no-arg constructor
		Triangle() {
			base = 1.0;
			height = 1.0;
		}

		// arg constructor
		Triangle(double base, double height) {
			this.base = base;
			this.height = height;
		}

		double getArea() {
			return 0.5 * base * height;
		}

		void showWidthOfEachSide() {
			double x = base*(1/3);
			double y = base*(2/3);
			
			double side1 = Math.sqrt((x*x)+(height*height));
			double side2 = Math.sqrt((y*y)+(height*height));
			double side3 = base;
			System.out.println("Side1: "+side1);
			System.out.println("Side2: "+side2);
			System.out.println("Side3: "+side3);
		}
	}

}
