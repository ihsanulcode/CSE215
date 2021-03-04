
public class Task {

	public static void main(String[] args) {

		Triangle t = new Triangle(5,8,5);
		System.out.println("Area     : "+t.area());
		System.out.println("Perimeter: "+t.perimeter());
	}

}

class Triangle implements Polygon {
	private double sideA;
	private double sideB;
	private double sideC;

	Triangle() {

	}

	Triangle(double sideA,double sideB,double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;

	}
	
	public double area() {
		double s = (perimeter()/2);
		return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}
	
	public double perimeter() {
		return sideA+sideB+sideC;
	}
}
