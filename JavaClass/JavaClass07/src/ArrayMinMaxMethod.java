import java.util.Scanner;

public class ArrayMinMaxMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Getting size from user
		System.out.print("Enter array size: ");
		int size = input.nextInt();

		// Array declaration
		int[] arr = new int[size];

		// getting array elements from user
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		// printing
		System.out.println("Array elements:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int max = findMax(arr);
		int min = findMin(arr);

		// output
		System.out.println("\nMax data: " + max);
		System.out.println("Min data: " + min);

		input.close();

	}

	public static int findMin(int arr[]) {
		// finding min
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	public static int findMax(int arr[]) {
		// finding max
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

}
