import java.util.Scanner;

public class Triangle {
	//three private data variables
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	Triangle() { //no argument constructor

	}

	Triangle(double side1,double side2,double side3) { //argument constructor
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	//accessor mutator for all three data variables
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	
	//getArea()
	public double getArea() {
		double p = getPerimener()/2.0;
		return (Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)));
	}
	
	//getPerimeter()
	public double getPerimener() {
		return side1+side2+side3;
	}
	
	//print()
	public String print() {
		return "Side 1 : "+side1+"\nSide 2: "+side2+"\nSide 3: "+side3+"\nPerimeter: "+getPerimener()+"\nArea: "+getArea();
	}
}


class TestTriangle{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three sides of a Triangle:");
		System.out.print("Side1: ");
		double side1 = input.nextDouble();
		System.out.print("Side2: ");
		double side2 = input.nextDouble();
		System.out.print("Side3: ");
		double side3 = input.nextDouble();
		
		Triangle obj = new Triangle(side1,side2,side3);
		System.out.printf("\nArea: %.2f",obj.getArea());
		System.out.printf("\nPerimeter: %.2f",obj.getPerimener());
		
	}
}