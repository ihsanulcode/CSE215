import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of lines: ");
        int n = input.nextInt();
        
        for (int row = 1; row <= n-1; row++) {
            
            for (int i = n - row; i >= 1; i--) {
                System.out.print("  ");
            }
            
            for (int j = row; j >= 2; j--) {
                System.out.print(" "+j);
            }
            
            for (int k = 1; k <= row; k++) {
		System.out.print(" "+k);
            }System.out.println();
        
	}
        
        //Last line
        for(int i=n;i>=1;i--){
            System.out.print(" "+i);
        }
        for(int i=2;i<=n;i++){
            System.out.print(" "+i);
        }System.out.println();
    }
    
}
