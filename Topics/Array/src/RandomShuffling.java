import java.util.*;

public class RandomShuffling {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] arr = new int[5];
		System.out.println("Enter 5 elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		// display
		System.out.print("\nOriginal: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		randomShuffle(arr);
		
		// display
		System.out.print("\nShuffled: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		input.close();

	}

	public static void randomShuffle(int[] arr) {
		// shuffling
		for (int i = 0; i < arr.length; i++) {
			int index = (int) (Math.random() * arr.length);

			// swapping
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
	}

}
