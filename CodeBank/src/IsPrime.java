
import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter any positive integer number: ");
		int n = input.nextInt();

		int flag = checkprime(n);
		if (flag == 0)
			System.out.println("Prime!");
		else
			System.out.println("Not Prime!");
	}

	public static int checkprime(int n) {

		int flag = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = 1;
				break;
			}
		}
		return flag;

	}

}
