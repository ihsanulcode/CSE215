import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("a = ");
			double a = input.nextDouble();
			System.out.print("b = ");
			double b = input.nextDouble();
			System.out.print("b = ");
			double c = input.nextDouble();
			
			RightTriangle obj = new RightTriangle(a,b,c);
			obj.CheckRightTriangle();
		}catch (IllegalRightTriangleException ex) {
			System.out.println(ex);
		}
	}

}

class RightTriangle {
	double sideA;
	double sideB;
	double sideC;

	RightTriangle() {

	}

	RightTriangle(double sideA,double sideB,double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		
	}
	
	public void CheckRightTriangle() throws IllegalRightTriangleException {
		if(Math.pow(sideA, 2)+Math.pow(sideB, 2) == Math.pow(sideC, 2)) {
			System.out.println("Valid Right Triangle.");
		}else {
			throw new IllegalRightTriangleException();
		}
	}
}

class IllegalRightTriangleException extends Exception {
	public IllegalRightTriangleException() {
		super("Length of three side do not conform the Pythagoras Rule");
	}
}
