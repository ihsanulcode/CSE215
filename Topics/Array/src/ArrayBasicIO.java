
import java.util.Scanner;

public class ArrayBasicIO {

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
        
        //display array
        for(int i=0;i<size;i++){
            System.out.printf("%d ",arr[i]);
        }
        

    }
}
