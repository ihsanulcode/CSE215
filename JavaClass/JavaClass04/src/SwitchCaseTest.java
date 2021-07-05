import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\t<< Simple calculator >>>\n");
		int n1 = input.nextInt();
		char operator = input.next().charAt(0);
		int n2 = input.nextInt();
		
		switch(operator) {
		case '-': 
			System.out.println(n1-n2);
			break;
		case '+': 
			System.out.println(n1+n2);
			break;
		case '*': 
			System.out.println(n1*n2);
			break;
		case '/': 
			System.out.println(n1/n2);
			break;
		default:
			System.out.println("Invalid operator");
		}

		input.close();
	}

}
