
import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPalindrom(number)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome!");
        }
    }

    public static int reverse(int number) {
        int rev = 0;
        int onedigit;

        //reversing algo
        while (number != 0) {
            onedigit = number % 10;
            rev = rev * 10 + onedigit;
            number /= 10;
        }
        return rev;
    }

    public static boolean isPalindrom(int number) {
        if (number == reverse(number)) {
            return true;
        } else {
            return false;
        }
    }

}
