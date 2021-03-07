import java.util.Scanner;

public class Lab2_Task4 {
	public static void main(String[] Strings) {

		// Scanner class
		Scanner in = new Scanner(System.in);

		//getting user input
		System.out.println("Enter the coefficients: ");
		System.out.print("a: ");
		double a = in.nextDouble();
		System.out.print("b: ");
		double b = in.nextDouble();
		System.out.print("c: ");
		double c = in.nextDouble();

		//calculating b^2-4ac first
		double result = b * b - 4.0 * a * c;

		//checking for roots
		if (result > 0.0) {
			double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
			System.out.printf("\nRoot 1: %.2f",r1);
			System.out.printf("\nRoot 2: %.2f",r2);
		} else if (result < 0.0) {
			double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
			System.out.printf("\nRoot 1: %.2f",r1);
			System.out.printf("\nRoot 2: %.2f",r2);
		} else if (result == 0.0) {
			double r1 = -b / (2.0 * a);
			System.out.println("Root: " + r1);
		} else {
			System.out.println("The equation has no real roots.");
		}
		in.close();
	}

}
