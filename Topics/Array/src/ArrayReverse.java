import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        //array declaration
        int[] array = new int[size];
        int[] reverse =  new int[size];
        
        //getting elements input
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]: ", i);
            array[i] = input.nextInt();
        }

        //reversing
        int j = size-1;
        for(int i=0;i<size;i++){
            reverse[j]=array[i];
            j--;
        }
        //display
        System.out.println("\nOriginal: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t", array[i]);
        }
        
        System.out.println("\nReversed: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t", reverse[i]);
        }
    }
}
