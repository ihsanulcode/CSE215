package LAB_Final.Copy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LowestSalary extends EmployeeData {

	@Override
	public void LSalary() throws FileNotFoundException {
		ArrayList<Employee> e = new ArrayList<Employee>();
		// FILE input (Read from file)
		File file1 = new File("EmployeeInformation.txt");
		Scanner input = new Scanner(file1);

		int i = 0;
		while (input.hasNext()) {
			e.add(new Employee());
			e.get(i).name = input.next();
			e.get(i).Id = Integer.parseInt(input.next());
			e.get(i).salary = Double.parseDouble(input.next());
			e.get(i).phone = input.next();
			e.get(i).address = input.next();
			e.get(i).designation = input.next();
			i++;
		}
		input.close();

		File file2 = new File("lowest.txt");
		// File output (Write on File)
		PrintWriter write = new PrintWriter(file2);
		write.println(e.get(Employee.LowestIndex(e)).name + " " + e.get(Employee.LowestIndex(e)).Id + " "
				+ e.get(Employee.LowestIndex(e)).salary + " " + e.get(Employee.LowestIndex(e)).phone + " "
				+ e.get(Employee.LowestIndex(e)).address + " " + e.get(Employee.LowestIndex(e)).designation);
		write.close();
		System.out.println("Lowest Salary Information stored successfully.");

	}

}
