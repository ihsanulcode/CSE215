import java.util.Scanner;

class Frequency {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Array size: ");
		int size = input.nextInt();

		// array declaration
		int arr[] = new int[size];
		boolean visited[] = new boolean[size];

		// getting elements input
		for (int i = 0; i < size; i++) {
			System.out.printf("[%d]: ", i);
			arr[i] = input.nextInt();
			visited[i] = false;
		}

		// count frequencies
		for (int i = 0; i < size; i++) {

			// Skip this element if already processed
			if (visited[i] == true)
				continue;

			// Count frequency
			int count = 0;
			for (int j = 0; j < size; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}

			System.out.println();
			System.out.print(arr[i] + " occurs " + count);
			// defining plural word
			if (count > 1) {
				System.out.printf(" times");
			} else
				System.out.print(" time");
			
			input.close();

		}
	}

}
