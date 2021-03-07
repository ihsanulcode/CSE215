import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int n = input.nextInt();

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}

		}

	}

}
