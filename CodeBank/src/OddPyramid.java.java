/*
(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as shown in the following sample run:
*/
import java.util.Scanner;

public class OddPyramid {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int n = input.nextInt();

		for (int rows = 1; rows <= n; rows++) {
			for (int s = n - rows; s >= 1; s--) {
				System.out.print("  ");
			}
			int p = (rows*2) - 1;
			for (int l = rows; l >= 2; l--) {
				System.out.print(p + " ");
				p-=2;
			}
			int q = 1;
			for (int r = 1; r <= rows; r++) {
				System.out.print(q + " ");
				q+=2;
			}
			System.out.println();
		}
	}
}