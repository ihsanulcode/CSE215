import java.util.*;
public class UpperString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string to convert into upper case: ");
		String s = input.nextLine();
		toUpperString(s);

	}
	
	public static void toUpperString(String s) {
		char[] array = s.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%c",array[i]-32);
		}
	}

}
