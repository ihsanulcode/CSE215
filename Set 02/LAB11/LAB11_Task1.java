import java.util.Scanner;

abstract class Shapee {
	private String name;

	Shapee(){
		
	}
	
	public Shapee(String name) {
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

class Rectanglee extends Shapee {
	private double length;
	private double width;

	Rectanglee() {

	}

	public Rectanglee(String name, double length, double width) {
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

	@Override
	public double area() {
		return length * width;
	}

	@Override
	public double perimeter() {
		return 2.0 * (length + width);
	}

}

public class LAB11_Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double l = input.nextDouble();
		double w = input.nextDouble();

		Rectanglee obj = new Rectanglee();
		obj.setLength(l);
		obj.setWidth(w);
		System.out.println(obj.area());
		System.out.println(obj.perimeter());
		input.close();
	}

}
