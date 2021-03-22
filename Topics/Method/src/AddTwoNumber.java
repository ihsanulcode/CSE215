import java.util.Scanner;

public class AddTwoNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println(add(num1,num2));

	}
	
	public static int add(int a,int b) {
		return a+b;
	}

}
