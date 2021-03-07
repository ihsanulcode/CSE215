//Write a program to find the GCD (Greatest Common Divisor) of two numbers.
import java.util.Scanner;

public class LAB03_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a : ");
		int a = input.nextInt();
		System.out.print("Enter b : ");
		int b = input.nextInt();

		while (b != 0) {
			int reminder = a % b;
			a = b;
			b = reminder;
		}
		System.out.println("GCD: " + a);
		input.close();
	}

}
