
import java.util.Scanner;

public class Average1D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        //array declaration
        int arr[] = new int[size];

        int sum = 0;

        //getting elements
        for (int i = 0; i < size; i++) {
            System.out.printf("[%d]: ", i);
            arr[i] = input.nextInt();
            sum += arr[i];
        }System.out.printf("Average: %.2f",((double)sum/size));
    }

}
