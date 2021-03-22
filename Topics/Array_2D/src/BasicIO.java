
import java.util.Scanner;

public class BasicIO {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Row: ");
		int row = input.nextInt();
		System.out.println("column: ");
		int col = input.nextInt();

		// declaration
		int arr[][] = new int[row][col];

		// getting input
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("[%d][%d]: ", i, j);
				arr[i][j] = input.nextInt();
			}
		}

		// display
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("\t%d ", arr[i][j]);

			}
			System.out.println();
		}

		// summation
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("Sum: " + sum);

		input.close();

	}

}
