import java.util.*;

public class MaxOccurence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Array size: ");
		int size = input.nextInt();

		// array declaration
		int arr[] = new int[size];

		// getting elements input
		for (int i = 0; i < size; i++) {
			System.out.printf("[%d]: ", i);
			arr[i] = input.nextInt();
		}
		
		//max frequency
		int maxnumber = -1;
		int maxcount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j]) {count++;}
			}
			
			if(count > maxcount) {
				maxnumber = arr[i];
				maxcount = count;
			}
		}System.out.println((maxcount==1)? -1:maxnumber);
		
		input.close();
		
		

	}

}
