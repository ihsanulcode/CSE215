
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        //array declaration
        int[] array = new int[size];

        //getting elements;
        getInput(array);

        //display
        System.out.println("\nFrom main method(): ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t", array[i]);
        }

        //Ascending
        ascending(array);

        //display
        System.out.println("\nAscending from main method(): ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t", array[i]);
        }

        //descending
        descending(array);

        //display
        System.out.println("\nDescending from main method(): ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t", array[i]);
        }
        
        input.close();
    }

    public static void getInput(int[] arr) {
        Scanner input = new Scanner(System.in);

        //getting elements input
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d]: ", i);
            arr[i] = input.nextInt();
        }
        input.close();
    }

    public static void ascending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void descending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
