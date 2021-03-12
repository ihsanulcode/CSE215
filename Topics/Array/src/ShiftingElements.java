import java.util.Scanner;

public class ShiftingElements {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] arr = new int[5];
		System.out.println("Enter 5 elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		//display
		System.out.print("\nOriginal array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		// shifting
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}arr[arr.length-1] = temp;
		
		//display
		System.out.print("\nShifted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		input.close();

	}

}
