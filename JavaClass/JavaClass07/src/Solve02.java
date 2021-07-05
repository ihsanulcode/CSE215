
public class Solve02 {

	public static void main(String[] args) {

		int col = (int) (Math.random() * (7 - 2 + 1) + 2); // (max-min+1)+min
		// declaration of 2D array
		int[][] arr = new int[4][col];

		for (int i = 0; i < arr.length; i++) { // outer loop for row
			for (int j = 0; j < arr[i].length; j++) { // inner loop for col

				arr[i][j] = (int) (Math.random() * (50 - 31 + 1) + 31);
			}

		}

		// printing my array
		System.out.println("2D Array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
