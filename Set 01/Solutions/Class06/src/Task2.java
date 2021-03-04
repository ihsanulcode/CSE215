
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declaration
        double arr[][] = new double[3][4];

        //getting input
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                arr[i][j] = input.nextDouble();
            }
        }

        //printing and getting sum by method
        System.out.println("\nOutput:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(arr, i));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double Colsum = 0.0;
        for (int i = 0; i < m.length; i++) {
            Colsum += m[i][columnIndex];
        }
        return Colsum;

    }

}

