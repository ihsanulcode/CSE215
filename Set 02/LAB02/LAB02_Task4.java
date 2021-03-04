// Write a program that takes an integer and prints its divisors, i.e. divisors of 12 are 1, 2, 3, 4, 6.
import java.util.Scanner;

public class LAB02_Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		input.close();
		
		for (int i = 1; i < n; i++) {
			
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
