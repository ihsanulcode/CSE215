import java.util.Scanner;

public class ArrayLength {

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

		// array length
		System.out.println("Array size: " + arr.length);

		// printing
		System.out.println("Array elements:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		input.close();
	}

}
