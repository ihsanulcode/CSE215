import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Array size: ");
        int size = input.nextInt();
        
        //array declaration
        int arr[] = new int[size];
        
        //getting elements input
        for(int i=0;i<size;i++){
            System.out.printf("[%d]: ",i);
            arr[i] = input.nextInt();
        }
        
        System.out.print("Enter the key for search: ");
        int key = input.nextInt();
        
        //binarySearch
        int index = Arrays.binarySearch(arr, key);
        
        System.out.println("Key found at index "+index);
        input.close();

	}

}
