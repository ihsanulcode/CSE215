package LAB_Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class HighestSalary {

	public static void hSalary(ArrayList<Employee> e) throws FileNotFoundException {
		Collections.sort(e);

		File file = new File("highest.txt");
		// File output (Write on File)
		PrintWriter write = new PrintWriter(file);
		write.println(e.get(e.size() - 1).name + " " + e.get(e.size() - 1).Id + " " + e.get(e.size() - 1).salary + " "
				+ e.get(e.size() - 1).phone + " " + e.get(e.size() - 1).address + " "
				+ e.get(e.size() - 1).designation);
		write.close();
		System.out.println("Highest Salary Information stored successfully.");
	}

}
