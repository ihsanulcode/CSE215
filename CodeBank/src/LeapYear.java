import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// user input
		int year = input.nextInt();
		input.close();
		
		// checking
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("" + year + " is a leap year.");
		else
			System.out.println("" + year + " is not a leap year.");

	}

}
