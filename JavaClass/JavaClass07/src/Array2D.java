import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter row: ");
		int row = input.nextInt();

		System.out.print("Enter column: ");
		int col = input.nextInt();

		// declaration of 2D array
		int[][] arr = new int[row][col];

		// getting elements form user
		for (int i = 0; i < arr.length; i++) { // outer loop for row
			for (int j = 0; j < arr[i].length; j++) { // inner loop for col
				System.out.print("[" + i + "][" + j + "]: ");
				arr[i][j] = input.nextInt();
			}

		}

		// printing my array
		System.out.println("\n2D Array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
