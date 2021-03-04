import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int sum = 0;

		for (int i = 0; i < 10; i++) {

			do {
				try {
					System.out.print("Enter positive integer: ");
					int n = input.nextInt();

					if (n >= 0) {
						sum += n;
						flag = false;
					} else {
						throw new IllegalArgumentException("Incorrect input!");
					}
				} catch (IllegalArgumentException ex) {
					System.out.println(ex);
				}
			} while (flag);
		}input.close();
		System.out.println("\nSum : "+sum);

	}

}
