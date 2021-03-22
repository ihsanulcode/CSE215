import java.util.Scanner;

public class ColSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Row: ");
        int row = input.nextInt();
        System.out.println("column: ");
        int col = input.nextInt();
        
        //declaration
        int matrix[][] = new int[row][col]; 
        
		System.out.println("Enter elements: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		
		//display
		System.out.println("Matrix: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("\t"+matrix[i][j]);
			}System.out.println();
		}
		
		//column summation
		System.out.println("Column wise summation:\n");
		int sum;
		for (int j = 0; j < matrix[0].length; j++) {
			sum = 0;
			for (int i = 0; i < matrix.length; i++) {
				sum += matrix[i][j];
			}System.out.println("Column "+j+" sum "+sum);
		}
		
		input.close();

	}

}
