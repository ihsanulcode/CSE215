import java.util.Scanner;

//simple calculator using switch case
public class Task07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the operator: ");
		char ope = in.next().charAt(0);
		System.out.print("Enter a: ");
		int num1 = in.nextInt();
		System.out.print("Enter b: ");
		int num2 = in.nextInt();
		
		switch(ope) {
		case '+':
			System.out.println("Result: "+(num1+num2));
			break;
		case '-':
			System.out.println("Result: "+(num1-num2));
			break;
		case '*':
			System.out.println("Result: "+(num1*num2));
			break;
		case '/':
			System.out.println("Result: "+(num1/num2));
			break;
		}
		
		in.close();
	}

}
