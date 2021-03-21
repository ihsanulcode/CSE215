import java.util.Scanner;

public class LAB08_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		double a  = input.nextDouble();
		Square obj = new Square(a);
		
		obj.setName("Square");
		System.out.println("Shape: "+obj.getName());
		System.out.printf("Area: %.1f\n",obj.area());
		System.out.printf("Perimeter: %.1f",obj.perimeter());
	}

}

class Shape {
	private String name;

	Shape(){
		
	}
	
	Shape(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Rectangle extends Shape {
	private double side1;
	private double side2;

	Rectangle(){
		
	}
	
	Rectangle(double side1,double side2){
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double area() {
		return side1 * side2;
	}

	public double perimeter() {
		return 2.0 * (side1 + side2);
	}
}

class Square extends Rectangle{

	Square() {

	}

	Square(double a) {
		super(a,a);
	}
	
	
}