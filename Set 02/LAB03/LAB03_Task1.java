import java.util.Scanner;

/* Generate a random integer n between 5 and 20 (inclusive). Use for loop to print all integers
from 0 to n separated by a space. */

public class LAB03_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//generate random number Range : 5-20
		int n = (int) (Math.random() * (20 - 5 + 1) + 5);

		// print 0-n
		for (int i = 0; i <= n; i++) {

			System.out.println(i + " ");
		}
	}

}
