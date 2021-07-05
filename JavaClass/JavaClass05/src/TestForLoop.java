import java.util.Scanner;

public class TestForLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//System.out.println("Enter step count: ");
		//int n = input.nextInt();
		
		for(int step=1; step<=10; step++) {
			System.out.println("I'm in step "+step);
			for(int hi=1;hi<=5;hi++) {
				System.out.println("hi!");
			}
			System.out.println("Kick");
		}
		//System.out.println("I'm done!");

		input.close();
	}

}
