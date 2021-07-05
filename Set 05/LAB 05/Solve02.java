import java.util.Scanner;

public class Solve02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] name = new String[10];
		int[] total = new int[10];
		double[] cgpa = new double[5];

		for (int i = 0; i < 10; i++) {
			System.out.println("Student " + (i + 1) + ".");
			System.out.print("Enter NAME: ");
			name[i] = input.nextLine();
			System.out.print("Enter Total Marks: ");
			total[i] = input.nextInt();
			input.nextLine();
			System.out.print("Enter CGPA: ");
			cgpa[i] = input.nextDouble();
			input.nextLine();
			System.out.println();
		}

		highestScore(name, cgpa, total);
		input.close();
	}

	public static void highestScore(String[] name, double[] cgpa, int[] total) {
		// find max scorer
		int max = total[0];
		int index = 0;
		for (int i = 0; i < total.length; i++) {
			if (total[i] > max) {
				max = total[i];
				index = i;
			}
		}

		// printing
		System.out.println("\nHighest Scorer:\n");
		System.out.println("Name: " + name[index]);
		System.out.println("CGPA: " + cgpa[index]);
		System.out.println("Total Marks: " + total[index]);
	}

}