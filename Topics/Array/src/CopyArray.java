
import java.util.Scanner;

public class CopyArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        //array declaration
        int[] array = new int[size];
        int[] array_copy = new int[size];

        //getting elements input
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]: ", i);
            array[i] = input.nextInt();
        }

        //copying
        for (int i = 0; i < array.length; i++) {
            array_copy[i] = array[i];
        }

        //display
        System.out.println("\nOriginal: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t", array[i]);
        }

        System.out.println("\nCopy: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t", array_copy[i]);
        }
        
        input.close();

    }

}
