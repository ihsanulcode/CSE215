/*Declare an integer array of size 6, initialize it with user input, calculate and print the average.
Now calculate the percentage of numbers that are above that average. */
import java.util.Scanner;

public class LAB04_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[6];
		
		int sum = 0;
		for(int i=0;i<6;i++) {
			arr[i] = input.nextInt();
			sum += arr[i];
		}
		
		double average = sum/6.0;
		int count = 0;
		for(int i=0;i<6;i++) {
			if(arr[i] > average)
				count++;
		}
		
		double percentage = (count/6.0)*100.0;
		System.out.printf("%.2f",percentage);
		System.out.print("%");
		input.close();
	}

}
