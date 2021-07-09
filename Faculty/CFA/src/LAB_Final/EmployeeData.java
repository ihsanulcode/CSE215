package LAB_Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class EmployeeData {

	public void Data() throws FileNotFoundException {
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
		HighestSalary.hSalary(E);
	}

	public abstract void LSalary() throws FileNotFoundException;
}
