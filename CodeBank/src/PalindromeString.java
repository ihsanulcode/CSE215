import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a word for check:");
		String s = in.nextLine();
		in.close();
		
		String copy = "";

		for (int i = s.length()-1; i >= 0; i--) {
			copy += s.charAt(i);
		}

		if (s.equals(copy)) {
			System.out.println("Its a Palindrom String");
		} else {
			System.out.println("It is not a Palindrom String");
		}

	}
}
