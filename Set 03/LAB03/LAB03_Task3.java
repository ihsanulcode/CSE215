import java.util.Scanner;

/*Write a program that checks whether a character given as input is a letter, digit
or symbol.*/
public class LAB03_Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		int ch = input.next().codePointAt(0);
		
		if(ch>=48 && ch<=57)
			System.out.println("It is a digit");
		else if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
			System.out.println("It is a letter");
		else
			System.out.println("It is a symbol");
		
		input.close();
	}

}
