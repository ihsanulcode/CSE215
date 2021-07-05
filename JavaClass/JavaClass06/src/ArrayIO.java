import java.util.Scanner;

public class ArrayIO {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//getting array size from user
		System.out.print("Array size: ");
		int size = input.nextInt();
		
		//declaring the array
		int arr[] = new int[size];
		
		//getting array elements from user
		for(int i=0;i<size;i++) {
			arr[i] = input.nextInt();
		}
		
		//print array elements
		System.out.println("Array: ");
		for(int i=0;i<size;i++) {
			System.out.println("index["+i+"]: "+arr[i]);
		}
		
		input.close();
	}

}
