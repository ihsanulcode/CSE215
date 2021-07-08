
public class Circle {
	//data field
	double radius;
	
	//no-args constructor
	public Circle() {
		this.radius = 1.0;
	}
	
	//Argument constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//methods
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public double getPerimeter() {
		return 2.0*Math.PI*this.radius;
	}
	
}
