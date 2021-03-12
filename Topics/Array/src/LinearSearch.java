
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        //array declaration
        int[] array = new int[size];

        //getting elements input
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]: ", i);
            array[i] = input.nextInt();
        }

        System.out.print("Enter the value to search in array: ");
        int key = input.nextInt();
        
        int index = search(array,key);
        System.out.println("Found at index "+index);
    }
    public static int search(int[] arr,int key){
        //linear search
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                index = i;
            }
        }return index;
    }
}
