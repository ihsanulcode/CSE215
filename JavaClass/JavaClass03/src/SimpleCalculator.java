import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//Scanner input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the 1st number: ");
		int a = input.nextInt();
		
		System.out.print("Enter the 2nd number: ");
		int b = input.nextInt();
		
		System.out.print("Enter the operator: ");
		char ope = input.next().charAt(0);
		
		
		//conditional statements 
		if(ope == '+')
			System.out.println("Summation: "+(a+b));
		else if(ope == '-') 
			System.out.println("Sub: "+(a-b));
		else if(ope == '*') 
			System.out.println("Mul: "+(a*b));
		else if(ope == '/') 
			System.out.println("Div: "+(a/b));
		else
			System.out.println("Invalid Operator!");
		

	}

}
