package Summer21.LAB01;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner class

		// getting student info from user
		System.out.print("Enter name: ");
		String name = input.nextLine();
		System.out.print("Enter ID: ");
		int ID = input.nextInt();
		System.out.print("Enter section: ");
		int sec = input.nextInt();
		System.out.print("Enter course code: ");
		String courseCode = input.next();
		System.out.print("Enter CGPA: ");
		double CGPA = input.nextDouble();

		// printing
		System.out.println("\nInformation:\nName: " + name + "\nID: " + ID + "\nSection: " + sec + "\nCourse Code: "
				+ courseCode + "\nCGPA: " + CGPA);

		input.close();

	}

}
