import java.util.Scanner;

public class Solve03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();

		System.out.print("Odd factors of " + n + " are: ");
		for (int i = 1; i <= n; ++i) {
			if (n % i == 0) {
				if(i%2 != 0)
					System.out.print(i + " ");
			}
		}

	}

}
