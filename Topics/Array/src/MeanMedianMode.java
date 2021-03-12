import java.util.Scanner;
import java.util.Arrays;

public class MeanMedianMode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input array size
		System.out.print("Enter array size: ");
		int size = input.nextInt();
		
		//array declaration
		int[] arr = new int[size];

		//getting input array elements
		for (int i = 0; i < size; i++) {
			System.out.printf("[%d]: ",i);
			arr[i] = input.nextInt();
		}
		
		
		//~~~ Mean (average) ~~~
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}double mean = (double)sum/size;
		
		//~~~ Median (Middle element) ~~~
		//to calculate median of an array we have to sort the array first (ascending)
		Arrays.sort(arr);
		
		double median;
		if(size%2!=0) {
			//for odd sized array
			median = arr[size/2];
		}else {
			//for even sized array
			median = (arr[size/2]+arr[(size/2)-1])/2;
		}
		
		//~~~ MODE (The number that occurs most in the array) ~~~
		int maxnumber = -1;
		int maxcount = -1;
		int count;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			//max occurs number
			if(count > maxcount) {
				maxnumber = arr[i];
				maxcount = count;
			}
		}
		int mode = (maxcount==1)? -1:maxnumber;
		
		//display
		System.out.println("\nMean: "+mean);
		System.out.println("Median: "+median);
		System.out.print("Mode: "+mode);

		input.close();
		
	}

}
