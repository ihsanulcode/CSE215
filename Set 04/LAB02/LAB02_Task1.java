import java.util.Scanner;

//Write a program that takes an integer and determines if it’s odd or even. Use switch cases to produce result.
public class LAB02_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		
		switch(n%2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		}
		
		input.close();
	}

}
