
import java.util.Scanner;

public class Series {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter nn: ");
        int n = input.nextInt();

        int temp = 112;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += temp;
            temp += 10;

        }
        System.out.println(sum);
    }

}
