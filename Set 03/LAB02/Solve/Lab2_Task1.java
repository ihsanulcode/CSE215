import java.util.Scanner;

public class Lab2_Task1 {

	public static void main(String[] args) {
		
		//Scanner class
		Scanner in = new Scanner(System.in);
		
		//getting N from user input
		System.out.print("Enter value for N: ");
		int N = in.nextInt();
		
		//while loop
		int sum = 0;
		int i = 1;
		while(i<=N) {
			System.out.print("Enter numder "+i+": ");
			int temp = in.nextInt();
			sum += temp;
			i++;
		}
		
		//output
		System.out.println("\nSum: "+sum);
		
		in.close();

	}

}
