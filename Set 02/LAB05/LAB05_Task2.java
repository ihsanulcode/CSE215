//Write a method isPalidrome(String arg) that determines if a String is palindrome or not.
import java.util.Scanner;

public class LAB05_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		input.close();
		
		if(isPalindrome(s))
			System.out.println(s+" is a Palindrome.");
		else
			System.out.println(s+" is not a Palindrome.");
	}

	public static boolean isPalindrome(String s) {
		String copy = "";

		for (int i = s.length()-1; i >= 0; i--) {
			copy += s.toLowerCase().charAt(i);
		}

		if (s.toLowerCase().equals(copy)) {
			return true;
		} else {
			return false;
		}
	}
}
