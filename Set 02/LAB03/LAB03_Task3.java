/* Write a program which will use while loop to print all the integers between 100 and 150 which
are divisible by 8 in descending order. */

public class LAB03_Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 150;

		while (n >= 100) {
			if (n % 8 == 0) {
				System.out.print(n + " ");
			}
			n--;
		}
	}

}
