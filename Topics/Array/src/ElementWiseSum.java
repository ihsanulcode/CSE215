import java.util.Scanner;

public class ElementWiseSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Array 1
		
		System.out.print("please enter size of array 1: ");
		int size1 = input.nextInt();

		// array declaration 1
		double arr1[] = new double[size1];

		// getting elements input for array 1
		for (int i = 0; i < size1; i++) {
			System.out.printf("[%d]: ", i);
			arr1[i] = input.nextDouble();
		}

		// Array 2
		
		System.out.print("please enter size of array 2: ");
		int size2 = input.nextInt();

		// array declaration 2
		double arr2[] = new double[size2];

		// getting elements input for array 2
		for (int i = 0; i < size2; i++) {
			System.out.printf("[%d]: ", i);
			arr2[i] = input.nextDouble();
		}

		// Array 3
		
		System.out.print("please enter size of array 3: ");
		int size3 = input.nextInt();

		// array declaration 3
		double arr3[] = new double[size3];

		// getting elements input for array 3
		for (int i = 0; i < size3; i++) {
			System.out.printf("[%d]: ", i);
			arr3[i] = input.nextDouble();
		}

		//method calling for sum
		double[] arr = elementwiseSum(arr1,arr2,arr3);
		
		//display result
		System.out.print("\nResult: ");
		for(double i: arr) {
			System.out.print(i+" ");
		}
		
		input.close();

	}
	
	public static double[] elementwiseSum(double arr1[], double arr2[], double arr3[]) {
		
		double[] arr = new double[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr[i] = arr1[i]+arr2[i]+arr3[i];
		}return arr;
	}

}
