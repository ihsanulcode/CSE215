
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// array declaration
		int arr[] = new int[100];

		System.out.println("Enter the integers between 1 and 100: ");

		// getting elements input
		int i = 0;
		for (;;) {
			arr[i] = input.nextInt();
			if (arr[i] == 0) {
				break;
			}
			i++;
		}

		// counting
		int count;
		for (int j = 1; j <= 100; j++) {
			count = 0;
			for (int k = 0; k < arr.length - 1; k++) {
				if (arr[k] == j) {
					count++;
				}
			}

			if (count != 0) {
				System.out.printf("\n%d occurs %d ", j, count);

				// defining plural word
				if (count > 1) {
					System.out.printf("times");
				} else
					System.out.print("time");
			}

		}
	}

}
