public class Main {

	public static void main(String[] args) {

		char[][] charArr = generateRandomArray('a', 'z', 3, 3);
		int[][] intArr = generateRandomArray(1, 9, 4, 6);
		double[][] doubleArr = generateRandomArray(1.0d, 10.0d, 3, 3);

		// display charArr
		for (int i = 0; i < charArr.length; i++) {
			System.out.print("|  ");
			for (int j = 0; j < charArr[i].length; j++) {
				System.out.printf(charArr[i][j] + "  ");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println();

		// display intArr
		if (intArr == null)
			System.out.println("null");
		else {
			for (int i = 0; i < intArr.length; i++) {
				System.out.print("|  ");
				for (int j = 0; j < intArr[i].length; j++) {
					System.out.print(intArr[i][j] + "  ");
				}
				System.out.print("|");
				System.out.println();
			}
			System.out.println();
		}

		// display doubleArr
		for (int i = 0; i < doubleArr.length; i++) {
			System.out.print("|  ");
			for (int j = 0; j < doubleArr[i].length; j++) {
				System.out.printf("%.2f  ", doubleArr[i][j]);
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println();

		// test
		char[][] test1 = generateRandomArray('k', 'b', 3, 3);
		if (test1 == null)
			System.out.println("null");
		System.out.println();

		int[][] test2 = generateRandomArray(23, 54, -3, -3);
		if (test2 == null)
			System.out.println("null");
		System.out.println();

		int[][] test3 = generateRandomArray(73, 54, -3, -3);
		if (test3 == null)
			System.out.println("null");
		System.out.println();
	}

	public static char[][] generateRandomArray(char lowerLimit, char upperLimit, int rows, int columns) {
		// checking
		if ((lowerLimit >= upperLimit) && (rows <= 0 || columns <= 0)) {
			System.out.println("Impossible to generate: lowerLimit > upperLimit");
			System.out.println("Impossible to generate: Negative rows and/or columns");
			return null;
		}

		// If lowerLimit is greater than or equal to upperLimit
		if (lowerLimit > upperLimit) {
			System.out.println("Impossible to generate: lowerLimit > upperLimit");
			return null;
		}

		// If rows or columns or both are less than or equal to 0
		if (rows <= 0 || columns <= 0) {
			System.out.println("Impossible to generate: Negative rows and/or columns");
			return null;
		}

		char arr[][] = new char[rows][columns];
		// getting random values
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) (Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
			}
		}
		return arr;
	}

	public static int[][] generateRandomArray(int lowerLimit, int upperLimit, int rows, int columns) {

		// checking
		if ((lowerLimit >= upperLimit) && (rows <= 0 || columns <= 0)) {
			System.out.println("Impossible to generate: lowerLimit > upperLimit");
			System.out.println("Impossible to generate: Negative rows and/or columns");
			return null;
		}

		// If lowerLimit is greater than or equal to upperLimit
		if (lowerLimit > upperLimit) {
			System.out.println("Impossible to generate: lowerLimit > upperLimit");
			return null;
		}

		// If rows or columns or both are less than or equal to 0
		if (rows <= 0 || columns <= 0) {
			System.out.println("Impossible to generate: Negative rows and/or columns");
			return null;
		}

		int arr[][] = new int[rows][columns];
		// getting random values
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
			}
		}
		return arr;
	}

	public static double[][] generateRandomArray(double lowerLimit, double upperLimit, int rows, int columns) {

		// checking
		if ((lowerLimit >= upperLimit) && (rows <= 0 || columns <= 0)){
			System.out.println("Impossible to generate: lowerLimit > upperLimit");
			System.out.println("Impossible to generate: Negative rows and/or columns");
			return null;
		}

		// If lowerLimit is greater than or equal to upperLimit
		if (lowerLimit >= upperLimit) {
			System.out.println("Impossible to generate: lowerLimit > upperLimit");
			return null;
		}

		// If rows or columns or both are less than or equal to 0
		if (rows <= 0 || columns <= 0) {
			System.out.println("Impossible to generate: Negative rows and/or columns");
			return null;
		}

		double arr[][] = new double[rows][columns];
		// getting random values
		double rand;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				rand = (double) (Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
				arr[i][j] = Math.round(rand * 100.0) / 100.0;
			}
		}
		return arr;
	}

}
