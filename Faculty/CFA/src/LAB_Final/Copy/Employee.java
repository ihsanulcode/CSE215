package LAB_Final.Copy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee {
	String name;
	int Id;
	double salary;
	String phone;
	String address;
	String designation;

	public void Information() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter how many Employee Information: ");
		int n = input.nextInt();
		input.nextLine();

		File file = new File("EmployeeInformation.txt");
		// File output (Write on File)
		PrintWriter write = new PrintWriter(file);
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter employee details " + (i + 1) + "?\n");
			System.out.print("Name: ");
			name = input.next();
			System.out.print("Id: ");
			Id = input.nextInt();

			boolean flag = true;
			do {
				try {
					System.out.print("Salary: ");
					salary = input.nextDouble();
					if (salary < 0)
						throw new InvalidSalaryException("Salary can't be negative!");
					flag = false;
				} catch (InvalidSalaryException ex) {
					System.out.println(ex);
				} catch (InputMismatchException ex) {
					System.out.println(ex);
					input.nextLine();
				}
			} while (flag);

			System.out.print("Phone: ");
			phone = input.next();
			System.out.print("Address: ");
			address = input.next();
			System.out.print("Designation: ");
			designation = input.next();
			write.println(name + " " + Id + " " + salary + " " + phone + " " + address + " " + designation);

		}
		write.close();
		input.close();
		System.out.println("\nAll Employee Information stored successfully.");
	}

	@Override
	public String toString() {
		return name + "\t" + Id + "\t" + salary + "\t" + phone + "\t" + address + "\t\t" + designation;
	}

	public static int HighestIndex(ArrayList<Employee> arr) {
		double max = arr.get(0).salary;
		int index = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).salary > max) {
				max = arr.get(i).salary;
				index = i;
			}
		}
		return index;

	}

	public static int LowestIndex(ArrayList<Employee> arr) {
		double min = arr.get(0).salary;
		int index = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).salary < min) {
				min = arr.get(i).salary;
				index = i;
			}
		}
		return index;

	}

}
