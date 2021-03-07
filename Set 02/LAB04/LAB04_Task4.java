//Take an integer array and print only the numbers that are in consecutive orders of 3.
import java.util.Scanner;

public class LAB04_Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size");
		int n = input.nextInt();
		int[] arr = new int[n];

		if(n >= 3) {
			for (int i = 0; i < n; i++) {
				arr[i] = input.nextInt();
			}
			
			for (int i = 2; i < n; i++) {
				if((arr[i] == arr[i-1]) && (arr[i-1] == arr[i-2])) {
					System.out.print(arr[i]+" ");
				}
					
				
			}
		}
		input.close();
		
	}

}
