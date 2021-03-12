
public class ArrayCopyUtility {

	public static void main(String[] args) {

		int[] source_array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] target_array = new int[10];

		// Copy array using array copy
		System.arraycopy(source_array, 0, target_array, 0, target_array.length);
		printArray(target_array);
		
		//Copy array using assignment
		target_array = source_array;
		printArray(target_array);
		
		//Copy array using clone
		source_array = target_array.clone();
		printArray(source_array);
		
		

	}

	public static void printArray(int[] arr) {

		// printing
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);

		}System.out.println();
	}

}
