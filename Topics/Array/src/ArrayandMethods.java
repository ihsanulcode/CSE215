
import java.util.Scanner;

public class ArrayandMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Array size: ");
        int size = input.nextInt();

        //array declaration
        int arr[] = new int[size];

        //method - getting input
        int[] array = getInput(arr);
        
        //method - display
        printArray(array);
    }

    public static int[] getInput(int[] arr) {
        Scanner input = new Scanner(System.in);
        
        //getting elements input
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d]: ", i);
            arr[i] = input.nextInt();
        }return arr;
    }
    
    public static void printArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        
        //printing
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\t%d ",arr[i]);
            
        }
    }
}
