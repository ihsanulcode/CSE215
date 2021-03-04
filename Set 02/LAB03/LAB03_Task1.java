import java.util.Scanner;

/* Generate a random integer n between 5 and 20 (inclusive). Use for loop to print all integers
from 0 to n separated by a space. */

public class LAB03_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		input.close();
		
		//generate random number Range: 5-20 then print 
		for(int i=0;i<=n;i++) {
			int Rnum = (int)(Math.random()*(20-5+1)+5);
			System.out.print(Rnum+" ");
		}
	}

}
