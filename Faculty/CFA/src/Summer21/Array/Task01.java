package Summer21.Array;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] id = new int[5];
		double[] cgpa = new double[5];
		
		for(int i=1;i<=2;i++) {
			System.out.println("Student "+i+".");
			System.out.print("Enter NAME: ");
			name[i] = input.nextLine();
			System.out.print("Enter ID: ");
			id[i] = input.nextInt();
			input.nextLine();
			System.out.print("Enter CGPA: ");
			cgpa[i] = input.nextDouble();
			input.nextLine();
			System.out.println();
		}
		
		System.out.println("\nDisplay:");
		for(int i=1;i<=2;i++) {
			System.out.println("Student "+i+".");
			System.out.println("Name: "+name[i]);
			System.out.println("ID: "+id[i]);
			System.out.println("CGPA: "+cgpa[i]);
			System.out.println();
		}

		input.close();
	}

}
