import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		
		do {
			try {
				System.out.println("Enter integer only: ");
				int n = input.nextInt();
				
				//display
				System.out.println("You entered: "+n);
				flag = false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Input integer only!");
				input.nextLine();
			}
		}while(flag);

	}

}
