import java.util.Scanner;

public class SumOfTwoMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter row and column for two matrix");
		System.out.println("Row: ");
		int row = input.nextInt();
		System.out.println("column: ");
		int col = input.nextInt();

		// declaration
		int arr1[][] = new int[row][col];
		int arr2[][] = new int[row][col];

		// getting input 1
		System.out.println("\nMatrix A");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("[%d][%d]: ", i, j);
				arr1[i][j] = input.nextInt();
			}
		}

		// getting input 2
		System.out.println("\nMatrix B");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("[%d][%d]: ", i, j);
				arr2[i][j] = input.nextInt();
			}
		}
		input.close();
		addMatrix(arr1, arr2);

	}

	public static void addMatrix(int[][] arr1, int[][] arr2) {
		int[][] sum = new int[arr1.length][arr1[0].length];

		// sum
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				sum[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		// display
		System.out.println("\nSum of two Matrix:");
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				System.out.printf("\t%d ", sum[i][j]);

			}
			System.out.println();
		}
	}

}
