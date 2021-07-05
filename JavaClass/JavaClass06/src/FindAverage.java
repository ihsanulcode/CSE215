import java.util.Scanner;

//Write a program that will take marks of 5 students and then print the average.
public class FindAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter marks:");
		// declaring the array
		double arr[] = new double[5];

		double sum = 0.0;
		// getting array elements from user
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextDouble();
			sum += arr[i];
		}

		System.out.println("Average marks: " + (sum / 5.0));

		input.close();

	}

}
