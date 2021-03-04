import java.util.*;
public class HW2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//declaration
        double arr[][] = new double[3][3]; 
        
        //getting input from user
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("[%d][%d]: ",i,j);
                arr[i][j] = input.nextDouble();
            }
        }
        
        //display matrix
        System.out.println();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("%f\t",arr[i][j]);
                
            }System.out.println();
        }
        
        //checking Markov matrix
        if(isMarkovMatrix(arr)==true) {
        	System.out.println("\nIt is a Markov matrix");
        }else {
        	System.out.println("\nIt is not a Markov matrix");
        }
		
	}
	
	public static boolean isMarkovMatrix(double[][] m) {
		
		//checking negative values
		for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
            	if(m[i][j] < 0) {
            		return false;
            	}
            }
        }
		
		//column summation
		double sum = 0.0;
		int column = 0;
        for (int i = 0; i < 3; i++) { //checking for all column
        	for (int row = 0; row < 3; row++) {
                sum += m[row][column];
            }column++; //incrementing column index 
        	
        	if(sum!=1) {
        		return false; //if column summation is not 1 then return false
        	}sum = 0.0; //assigning to 0 for check next column sum
			
		}
		
		
		//return true if every statements fails
		return true;
	}

}
