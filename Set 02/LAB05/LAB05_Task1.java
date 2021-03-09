/*Write a method countVowels(String arg) that takes a String as parameter and returns the
number of vowels.*/

import java.util.Scanner;

public class LAB05_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		input.close();
		
		int vowels = countVowels(s);
		System.out.println(vowels);

	}
	
	public static int countVowels(String arg) {
		int vowel = 0;
		for(int i=0;i<arg.length();i++) {
			if(arg.charAt(i) == 'a' || arg.charAt(i) == 'e' || arg.charAt(i) == 'i' || arg.charAt(i) == 'o' || arg.charAt(i) == 'u')
				vowel++;
			else if(arg.charAt(i) == 'A' || arg.charAt(i) == 'E' || arg.charAt(i) == 'I' || arg.charAt(i) == 'O' || arg.charAt(i) == 'U')
				vowel++;
		}
		
		return vowel;
	}

}
