package LAB_Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Display implements Salary {

	@Override
	public void allData() throws FileNotFoundException {
		ArrayList<Employee> E = new ArrayList<Employee>();
		// FILE input (Read from file)
		File file = new File("EmployeeInformation.txt");
		Scanner input = new Scanner(file);

		int i = 0;
		while (input.hasNext()) {
			E.add(new Employee());
			E.get(i).name = input.next();
			E.get(i).Id = Integer.parseInt(input.next());
			E.get(i).salary = Double.parseDouble(input.next());
			E.get(i).phone = input.next();
			E.get(i).address = input.next();
			E.get(i).designation = input.next();
			i++;
		}
		input.close();

		System.out.println("All Employee:");
		System.out.println("Name\tId\tSalary\tPhone\t\tAddress\t\tDesignation");
		for (int j = 0; j < E.size(); j++) {
			System.out.println(E.get(j).toString());
		}

	}

	@Override
	public void lowest() throws FileNotFoundException {
		ArrayList<Employee> E = new ArrayList<Employee>();
		// FILE input (Read from file)
		File file = new File("EmployeeInformation.txt");
		Scanner input = new Scanner(file);

		int i = 0;
		while (input.hasNext()) {
			E.add(new Employee());
			E.get(i).name = input.next();
			E.get(i).Id = Integer.parseInt(input.next());
			E.get(i).salary = Double.parseDouble(input.next());
			E.get(i).phone = input.next();
			E.get(i).address = input.next();
			E.get(i).designation = input.next();
			i++;
		}
		input.close();
		Collections.sort(E);
		System.out.println("Lowest Salary:");
		System.out.println("Name\tId\tSalary\tPhone\t\tAddress\t\tDesignation");
		System.out.println(E.get(0).toString());
	}

	@Override
	public void highest() throws FileNotFoundException {
		ArrayList<Employee> E = new ArrayList<Employee>();
		// FILE input (Read from file)
		File file = new File("EmployeeInformation.txt");
		Scanner input = new Scanner(file);

		int i = 0;
		while (input.hasNext()) {
			E.add(new Employee());
			E.get(i).name = input.next();
			E.get(i).Id = Integer.parseInt(input.next());
			E.get(i).salary = Double.parseDouble(input.next());
			E.get(i).phone = input.next();
			E.get(i).address = input.next();
			E.get(i).designation = input.next();
			i++;
		}
		input.close();
		Collections.sort(E);
		System.out.println("Highest Salary:");
		System.out.println("Name\tId\tSalary\tPhone\t\tAddress\t\tDesignation");
		System.out.println(E.get(E.size() - 1).toString());
	}

	@Override
	public void average() throws FileNotFoundException {
		ArrayList<Employee> E = new ArrayList<Employee>();
		// FILE input (Read from file)
		File file = new File("EmployeeInformation.txt");
		Scanner input = new Scanner(file);

		int i = 0;
		while (input.hasNext()) {
			E.add(new Employee());
			E.get(i).name = input.next();
			E.get(i).Id = Integer.parseInt(input.next());
			E.get(i).salary = Double.parseDouble(input.next());
			E.get(i).phone = input.next();
			E.get(i).address = input.next();
			E.get(i).designation = input.next();
			i++;
		}
		input.close();

		double sum = 0.0;
		for (int j = 0; j < E.size(); j++) {
			sum += E.get(j).salary;
		}
		double avg = sum / (double) E.size();
		System.out.printf("Average: %.2f\n",avg);
	}

}
