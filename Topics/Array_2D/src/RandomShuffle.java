import java.util.Scanner;

public class RandomShuffle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Row: ");
		int row = input.nextInt();
		System.out.println("column: ");
		int col = input.nextInt();

		// declaration
		int matrix[][] = new int[row][col];

		System.out.println("Enter elements: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		// display
		System.out.println("Matrix: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				int i1 = (int) (Math.random() * matrix.length);
				int j1 = (int) (Math.random() * matrix[i].length);
				// Swapping
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i1][j1];
				matrix[i1][j1] = temp;
			}
		}

		// display
		System.out.println("Shuffled Matrix: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}
		
		input.close();

	}

}
