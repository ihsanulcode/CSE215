import java.util.Scanner;

abstract class Polygon{
	private int numSide;
	
	Polygon(){
		
	}
	
	Polygon(int numSide){
		this.numSide = numSide;
	}

	public int getNumSide() {
		return numSide;
	}

	public void setNumSide(int numSide) {
		this.numSide = numSide;
	}
	
	public abstract double area();
	
	
	public abstract double perimeter();
	
	
}

class Triangle extends Polygon{
	private double sideA;
	private double sideB;
	private double sideC;
	
	Triangle(){
		
	}
	
	Triangle(double sideA,double sideB,double sideC){
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	@Override
	public double area() {
		double s = perimeter()/2.0;
		return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}
	
	@Override
	public double perimeter() {
		return (sideA+sideB+sideC);
	}
}
public class LAB12_Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close(); 
		
		if(isValid(a,b,c)) {
			
			Triangle obj = new Triangle(a,b,c);
			System.out.printf("%.2f\n",obj.area());
			System.out.printf("%.2f",obj.perimeter());
			
		}else {
			System.out.println("INVALID");
		}

	}
	
	public static boolean isValid(double a,double b,double c) {
		if(a+b > c && b+c > a && a+c > b)
			return true;
		else return false;
	}

}
