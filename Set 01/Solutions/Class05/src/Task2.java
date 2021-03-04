
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //gettin user input for rectangle
        System.out.println("For Rectangle:");
        //getting length
        System.out.print("Length: ");
        double l = input.nextDouble();
        //getting breadth
        System.out.print("Breadth: ");
        double b = input.nextDouble();

        //getting user input for square
        System.out.println("\nFor Square:");
        //getting one side
        System.out.print("one side: ");
        double a = input.nextDouble();

        //calling method for rectangle
        System.out.println("\nArea of the rectangle: ");
        printArea(l, b);
        
        //calling method for square
        System.out.println("\nArea of the square: ");
        printArea(a);

    }

    public static void printArea(double a, double b) {
        System.out.println(a * b);
    }

    public static void printArea(double a) {
        printArea(a,a);
    }

}
