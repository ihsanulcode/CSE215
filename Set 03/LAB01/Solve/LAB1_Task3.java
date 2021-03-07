import java.util.Scanner;

public class LAB1_Task3 {

	public static void main(String[] args) {
		// Scanner class
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = in.nextInt();
		
		//checking
		if(num%2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		in.close();

	}

}
