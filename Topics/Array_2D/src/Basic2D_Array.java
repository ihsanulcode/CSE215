import java.util.Scanner;

public class Basic2D_Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//getting row,col from user
		System.out.print("Enter row: ");
		int row = input.nextInt();
		System.out.print("Enter col: ");
		int col = input.nextInt();
		
		//declaration of 2D Array
		int[][] arr = new int[row][col];
		
		//getting elements form user
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("["+i+"]["+j+"]: ");
				arr[i][j] = input.nextInt();
			}
			
		}
		
		
		//printing my array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}

		input.close();
	}

}
