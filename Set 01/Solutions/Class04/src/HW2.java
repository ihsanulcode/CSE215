
import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //getting inputs
        System.out.print("Number 1: ");
        double num1 = input.nextDouble();
        System.out.print("Number 2: ");
        double num2 = input.nextDouble();
        System.out.print("Number 3: ");
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {

        double min = Math.min(Math.min(num1, num2), num3);
        double max = Math.max(Math.max(num1, num2), num3);
        double middle = num1 + num2 + num3 - min - max;

        //display
        System.out.println(min + "  " + middle + "  " + max);

    }

}
