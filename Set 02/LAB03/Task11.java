//factorial using while loop
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = in.nextInt();

		int i = 1; // loop control variable
		int f = 1;
		while (i <= n) {
			f *= i;
			i++;
		}
		
		System.out.println("Factorial of "+n+" is "+f);
		in.close();
	}

}
