import java.util.Scanner;

public class Lab2_Task2 {

	public static void main(String[] args) {

		// Scanner class
		Scanner in = new Scanner(System.in);

		// user input
		System.out.print("Enter operator: ");
		char operator = in.next().charAt(0);
		System.out.print("Enter 1st operand: ");
		int num1 = in.nextInt();
		System.out.print("Enter 2nd operand: ");
		int num2 = in.nextInt();

		// switch
		switch (operator) {
		case '+':
			System.out.println("Result: " + (num1 + num2));
			break;
		case '-':
			System.out.println("Result: " + (num1 - num2));
			break;
		case '*':
			System.out.println("Result: " + (num1 * num2));
			break;
		case '/':
			System.out.println("Result: " + (num1 / num2));
			break;
		default:
			System.out.println("Invalid operator!");
		}

		in.close();

	}

}
