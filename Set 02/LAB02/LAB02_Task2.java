import java.util.Scanner;

/* Write a program that takes an integer and determines if it’s prime or not. A number is prime if
  it is divisible by 1 and itself only, i.e. 2, 3, 11, 37 etc. */

public class LAB02_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter any positive integer number: ");
		int n = input.nextInt();
		input.close();
		
		if (checkprime(n))
			System.out.println("Prime!");
		else
			System.out.println("Not Prime!");
	}
	
	public static boolean checkprime(int n) {

		boolean flag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}

}
