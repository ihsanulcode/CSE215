
import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.print("Enter any number: ");
        int n = input.nextInt();

        //method for string check
        checkPalindrome(s);
        //method for integer check
        checkPalindrome(n);

    }

    public static void checkPalindrome(String s) {

        StringBuilder reverse = new StringBuilder(s);
        reverse.reverse();

        String rev = reverse.toString();

        if (s.equals(rev)) {
            System.out.println(s + " is  palindrome");
        } else {
            System.out.println(s + " is not palindrome");
        }
    }

    public static void checkPalindrome(int n) {
        int temp = n;
        int rev = 0;
        int digit;

        while (n != 0) {
            digit = n % 10;
            rev = (rev * 10) + digit;
            n /= 10;
        }

        if (temp == rev) {
            System.out.println(temp + " is palindrome");
        } else {
            System.out.println(temp + " is not palindrome");
        }

    }

}
