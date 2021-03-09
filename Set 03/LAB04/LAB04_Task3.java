
import java.util.Scanner;

public class LAB04_Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter range to print prime numbers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();

		// calling method
		System.out.println("\nPrime numbers in that range:");
		generatePrime(n1, n2);
		input.close();
	}

	public static void generatePrime(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int N) {
		boolean prime = true;

		for (int i = 2; i < N; i++) {
			if (N % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

}
