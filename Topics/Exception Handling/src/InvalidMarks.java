import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidMarks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;

		do {
			try {
				System.out.print("Enter obtianed mark: ");
				double marks = input.nextDouble();
				checkMarks(marks);

				flag = false;

			} catch (IllegalArgumentException ex) {
				System.out.println(ex);
			} catch (InputMismatchException ex) {
				System.out.println(ex);
				input.nextLine();
			}
		} while (flag);
		
		input.close();
	}

	public static void checkMarks(double marks) {
		if (marks < 0) {
			throw new IllegalArgumentException("Marks cannot be negative");
		}
	}

}
