
import java.util.Scanner;

public class Task1 {

    public static int getPentagonalNumber(int n) {
        int pentagonal = (n * (3 * n - 1)) / 2;
        return pentagonal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pentagonal numbers from 1 - 100 : \n");
        for (int i = 1; i <= 100; i++) {

            //printing 10 rows containing 10 numbers
            if (i % 10 == 0) {
                System.out.println(getPentagonalNumber(i) + "\t");
            } else {
                System.out.print(getPentagonalNumber(i) + "\t");
            }
        }

    }

}
