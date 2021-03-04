
public class Task {

	public static void main(String[] args) {
		Shape a = new Rectangle("RectangleA",5,4);
		
		//display
		System.out.println("Name: "+a.getName());
		System.out.println("Area: "+a.area());
		System.out.println("Perimeter: "+a.perimeter());

	}

}

abstract class Shape{
	private String name;
	
	public Shape() {
		
	}
	
	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract double area();
	public abstract double perimeter();
}

class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area() {
		return length*width;
	}
	
	public double perimeter() {
		return 2*(length+width);
	}
}
