import java.util.*;

public class HW1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// declaring array
		int[] arr = new int[10];

		// getting input from user
		System.out.println("Enter ten numbers:");
		int count = 0;
		for (int i = 0; i < 10; i++) {
			int temp = input.nextInt();
			
			//checking distinct number while getting input
			if(isDistinct(arr,temp)) {
				//using count as distinct array index 
				arr[count] = temp;
				count++; 
			}
			
		}
		System.out.println("The number of distinct number is "+count);
		
		//printing distinct array
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static boolean isDistinct(int[] arr,int n) {
		for (int i = 0; i < arr.length; i++) {
			if(n==arr[i]) {
				//is is not distinct then return false
				return false;
			}
		}return true; //is distinct return true
	}

}
