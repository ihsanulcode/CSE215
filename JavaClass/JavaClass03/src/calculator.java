import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st number: ");
		int a = input.nextInt();
		
		System.out.println("Enter the 2nd number: ");
		int b = input.nextInt();
		
		int sum = a+b;
		//System.out.println("Summation: "+sum);
		System.out.println("Summation of "+a+" and "+b+" is: "+sum);

	}

}
