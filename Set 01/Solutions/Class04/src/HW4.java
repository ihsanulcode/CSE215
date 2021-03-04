
import java.util.Scanner;
import java.util.Random;

public class HW4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //getting input
        System.out.print("Enter n: ");
        int n = input.nextInt();

        //calling method
        printMatrix(n);

    }

    public static void printMatrix(int n) {

        Random rand = new Random();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(rand.nextInt(2) + 0 + "\t");
            }
            System.out.println();
        }
    }

}
