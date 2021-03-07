import java.util.Scanner;

/*Generate random integers between 5 and 20 (inclusive). Use for loop to print all
integers separated by a space.*/

public class LAB03_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many random numbers: ");
		int n = input.nextInt();
		
		for(int i=1;i<=n;i++) {
			int random = (int) (Math.random()*(20-5+1)+5);
			System.out.print(random+" ");
		}
		
		input.close();
	}

}
