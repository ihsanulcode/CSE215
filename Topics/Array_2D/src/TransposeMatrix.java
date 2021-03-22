import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		transpose();

	}

	public static void transpose() {
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
		input.close();

		// display
		System.out.println("\nOriginal Matrix:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("\t%d ", arr[i][j]);

			}
			System.out.println();
		}

		// transpose
		int transpose[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				transpose[i][j] = arr[j][i];
			}
		}

		// display
		System.out.println("\nTranspose Matrix:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("\t%d ", transpose[i][j]);
			}
			System.out.println();
		}
	}

}
