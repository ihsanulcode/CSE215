import java.util.*;
public class ColSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Row: ");
        int row = input.nextInt();
        System.out.println("column: ");
        int col = input.nextInt();
        
        //declaration
        int arr[][] = new int[row][col]; 
        
        //getting input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("[%d][%d]: ",i,j);
                arr[i][j] = input.nextInt();
            }
        }
        
        //display 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("\t%d ",arr[i][j]);
                
            }System.out.println();
        }
        
        int colsum = 0;
        int column = 0;
        for (int i = 0; i < 3; i++) {
            colsum += arr[i][column];
        }
        System.out.println(colsum);
		
	}

}
