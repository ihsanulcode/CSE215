import java.util.Scanner;

//4. Solve y = 2x+5 (Given, y = 5).
public class Solve_HW04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// solve for x,
		System.out.println("enter the value of y: ");
		double y = input.nextDouble();

		double x = (y - 5) / 2.0;
		System.out.println(x);

	}

}
