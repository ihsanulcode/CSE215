
import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //getting input
        System.out.println("Enter an integer and a character: ");
        int n = input.nextInt();
        char ch = input.next().charAt(0);

        //method
        form(n, ch);
        form(ch, n);

    }

    public static void form(int n, char ch) {
        System.out.println("\nInteger is " + n);
        System.out.println("character is " + ch);
    }

    public static void form(char ch, int n) {
        System.out.println("\ncharacter is " + ch);
        System.out.println("Integer is " + n);
    }

}
