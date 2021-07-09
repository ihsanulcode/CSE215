import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Array Size: ");
		int n = input.nextInt();

		String[] name = new String[n];
		int[] id = new int[n];
		int[] salary = new int[n];

		// getting elements from user input
		for (int i = 0; i < n; i++) {
			System.out.println((i+1)+".");
			
			System.out.print("ID: ");
			id[i] = input.nextInt();
			input.nextLine();
			
			System.out.print("Name :");
			name[i] = input.nextLine();
			
			
			System.out.print("Salary: ");
			salary[i] = input.nextInt();
			input.nextLine();

		}

		int minS = salary[0];
		int minName = 0;
		int minID = 0;
		
		for (int i = 0; i < n; i++) {
			if (salary[i] < minS) {
				minS = salary[i];
				minName = i;
				minID = i;
			}

		}
		
		System.out.println("\nOutput:");
		System.out.println("Min Salary : " + minS);
		System.out.println("employee's Name : " + name[minName]);
		System.out.println("ID : " + id[minID]);

	}
}