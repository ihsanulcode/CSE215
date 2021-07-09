package LAB_Final.Copy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class HighestSalary {

	public static void hSalary(ArrayList<Employee> e) throws FileNotFoundException {
		

		File file = new File("highest.txt");
		// File output (Write on File)
		PrintWriter write = new PrintWriter(file);
		write.println(e.get(Employee.HighestIndex(e)).name + " " + e.get(Employee.HighestIndex(e)).Id + " " + e.get(Employee.HighestIndex(e)).salary + " "
				+ e.get(Employee.HighestIndex(e)).phone + " " + e.get(Employee.HighestIndex(e)).address + " "
				+ e.get(Employee.HighestIndex(e)).designation);
		write.close();
		System.out.println("Highest Salary Information stored successfully.");
	}

}
