import java.util.Scanner;

public class InfoArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int n = input.nextInt();

		// declaring the array
		String names[] = new String[n];
		double marks[] = new double[n];
		int ID[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("For Student " + (i + 1) + ".");
			System.out.print("Enter ID: ");
			ID[i] = input.nextInt();
			input.nextLine();
			System.out.print("Enter name: ");
			names[i] = input.nextLine();
			System.out.print("Enter Marks: ");
			marks[i] = input.nextDouble();
			input.nextLine();
		}

		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("For Student " + (i + 1) + ".");
			System.out.println("Name: " + names[i]);
			System.out.println("ID: " + ID[i]);
			System.out.println("Marks: " + marks[i]);
			System.out.println();

		}
		
		double sum = 0.0;
		// getting array elements from user
		for (int i = 0; i < n; i++) {
			sum += marks[i];
		}
		System.out.println("Average marks: " + (sum / n));

		input.close();
	}

}
