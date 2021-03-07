
import java.util.Scanner;

public class PalindromeDigit {

	public static void main(String[] args) {
		
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		//getting input from user 
		System.out.print("Enter integer number: ");
		int n = input.nextInt();
		input.close();
		
		//checking and calling the method
		if(findingPalindrome(n)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}

	}

	public static boolean findingPalindrome(int n) {

		//convert the integer into String
		String s = Integer.toString(n);
		//declared a String for storing the reverse string s
		String copy = "";

		//reversing String s and storing it into copy string
		for (int i = s.length()-1; i >= 0; i--) {
			copy += s.charAt(i);
		}

		//checking is main string is equals to the reverse string or not
		if (s.equals(copy)) {
			return true; //return true if they are equal
		} else {
			return false; //return false if they are not equal
		}
	}

}

