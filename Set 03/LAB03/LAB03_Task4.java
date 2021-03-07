import java.util.Scanner;

/*Write a program that prompts the user to enter two cities and displays them in
alphabetical order.*/
public class LAB03_Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first city: ");
		String s1 = input.nextLine();
		System.out.print("Enter second city: ");
		String s2 = input.nextLine();

		if (s1.toLowerCase().charAt(0) < s2.toLowerCase().charAt(0))
			System.out.println("The cities in alphabetical orders are " + s1 + " and " + s2);
		else if (s1.toLowerCase().charAt(0) > s2.toLowerCase().charAt(0))
			System.out.println("The cities in alphabetical orders are " + s2 + " and " + s1);
		else if (s1.toLowerCase().charAt(0) == s2.toLowerCase().charAt(0))
			System.out.println("The cities in alphabetical orders are " + s1 + " and " + s2);
		
		input.close();

	}

}
