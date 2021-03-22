import java.util.Scanner;
import java.util.InputMismatchException;

public class CustomException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter your age: ");
			int age = input.nextInt();
			checkAge(age);

		} catch (InvalidAgeException ex) {
			System.out.println(ex);
		} catch (InputMismatchException ex) {
			System.out.println(ex);
		}

		input.close();

	}

	public static void checkAge(int age) throws InvalidAgeException {
		if (age <= 0) {
			throw new InvalidAgeException("Invalid age! Age cannot be negative.");
		} else {
			System.out.println("Valid!");
		}
	}

}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
