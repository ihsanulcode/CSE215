import java.util.Scanner;

public class LAB04_Task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//getting user inputs
		System.out.println("Enter three sides of the triangle: ");
		System.out.print("Side1: ");
		double side1 = input.nextDouble();
		System.out.print("Side2: ");
		double side2 = input.nextDouble();
		System.out.print("Side3: ");
		double side3 = input.nextDouble();
		input.close();
		
		//checking validation
		if(MyTriangle.isValid(side1, side2, side3))
			System.out.printf("\nArea: %.2f",MyTriangle.area(side1, side2, side3));
		else
			System.out.println("\nThe input is invalid.");
	}

}

class MyTriangle {

	public static boolean isValid(double side1, double side2, double side3) {
		
		if ((side1 + side2) > side3) {
			if ((side1 + side3) > side2) {
				if (side2 + side3 > side1) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static double area(double side1, double side2, double side3) {
		double s = (side1+side2+side3)/2.0;
		double area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
		return area;
	}
}