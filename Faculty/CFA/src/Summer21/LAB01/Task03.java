package Summer21.LAB01;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner class

		// declaring all types of data and getting user input
		System.out.print("Enter an integer type data: ");
		int i = input.nextInt(); // Integer
		System.out.println("You have entered: " + i);

		System.out.print("\nEnter an float type data: ");
		float f = input.nextFloat(); // Float
		System.out.println("You have entered: " + f);

		System.out.print("\nEnter an double type data: ");
		double d = input.nextDouble(); // Double
		System.out.println("You have entered: " + d);

		System.out.print("\nEnter an char type data: ");
		char ch = input.next().charAt(0); // char
		input.nextLine();
		System.out.println("You have entered: " + ch);

		System.out.print("\nEnter an String type data: ");
		String s = input.nextLine(); // String
		System.out.println("You have entered: " + s);

		System.out.print("\nEnter an boolean type data: ");
		boolean b = input.nextBoolean(); // Boolean
		System.out.println("You have entered: " + b);

		System.out.print("\nEnter an long type data: ");
		long l = input.nextLong(); // Long
		System.out.println("You have entered: " + l);

		System.out.print("\nEnter an byte type data: ");
		byte by = input.nextByte(); // Byte
		System.out.println("You have entered: " + by);

		System.out.print("\nEnter an short type data: ");
		short sh = input.nextShort(); // short
		System.out.println("You have entered: " + sh);

		input.close();
	}

}
