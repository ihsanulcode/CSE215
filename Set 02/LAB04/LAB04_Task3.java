/*Take a 3X3 array and initialize it with these values:

3 4 9
2 9 11
4 6 0

Calculate and print the sum for each row, column and both diagonals.*/
public class LAB04_Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 3, 4, 9 }, { 2, 9, 11 }, { 4, 6, 0 } };

		// sum of rows
		int rowSum = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				rowSum += arr[row][col];
			}
			System.out.println("Sum of row " + row + " is " + rowSum);
			rowSum = 0;
		}

		// sum of columns
		int colSum = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				colSum += arr[col][row];
			}
			System.out.println("Sum of column " + row + " is " + colSum);
			colSum = 0;
		}

		// sum of diagonals
		int principal_diagonal = 0;
		int secondary_diagonal = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				// principal diagonal
				if (row == col)
					principal_diagonal += arr[row][col];

				// secondary diagonal
				if ((row + col) == (arr.length - 1))
					secondary_diagonal += arr[row][col];
			}
			
		}
		
		System.out.println("Sum of principal diagonal : "+principal_diagonal);
		System.out.println("Sum of secondary diagonal : "+secondary_diagonal);
		
	}

}
