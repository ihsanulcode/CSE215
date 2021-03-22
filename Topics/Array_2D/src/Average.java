import java.util.Scanner;

public class Average {
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
		
		//summation
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}System.out.println("\nAverage: "+(double)sum/(row*col));
		
		input.close();

	}

}
