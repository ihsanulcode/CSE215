
import java.util.Scanner;
//import java.util.Random;

public class RandomElements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Random random = new Random();
        
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        System.out.println("Enter range:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        
        //array declaration
        int[] array = new int[size];

        //getting random elements
        for (int i = 0; i < array.length; i++) {
            //array[i] = random.nextInt(5)+1; // 1 to 5
            array[i] = (int) (Math.random()*(n2-n1+1)+n1); 
        }
        
        //display
        System.out.println("\nRandom array elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("["+i+"]: "+array[i]); //[0]: 1
        }
        
        input.close();
    }

}
