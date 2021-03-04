import java.util.Scanner;

//Write a program that determines if an integer is odd or even
public class LAB01_Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		
		//checking and printing (using ternary operator)
		System.out.println((n%2==0)? "Even":"Odd");
		input.close();
	}

}
