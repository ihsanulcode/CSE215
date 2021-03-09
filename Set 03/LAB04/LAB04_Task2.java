import java.util.Scanner;

public class LAB04_Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = input.nextInt();

		// checking if the number contains 5 digits
		String number = Integer.toString(n);
		if (number.length() != 5) {
			System.out.println("Please enter a 5 digit number");
			System.exit(0);
		} else {
			// output
			System.out.println("Sum: " + sumOfDigits(n));
		}
		input.close();
	}

	public static int sumOfDigits(int n) {

		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}
