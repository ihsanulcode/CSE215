import java.util.Scanner;
import java.util.Arrays;
public class SortMethod {
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

        //display
        System.out.println("\nOriginal: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t", array[i]);
        }
        
        //Arrays.sort();
        Arrays.sort(array,0,array.length);
        
        //for-each loop
        System.out.println("\nSorted:");
        for(int i: array){
            System.out.printf("%d\t",i);
        }
    }
      
}
