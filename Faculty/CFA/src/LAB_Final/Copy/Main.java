package LAB_Final.Copy;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		 new Employee().Information();
		 EmployeeData data = new LowestSalary();
		 data.Data();
		 data.LSalary();
		 
		 System.out.println();
		 new Display().lowest();
		 System.out.println();
		 new Display().highest();
		 System.out.println();
		 new Display().average();
		 System.out.println();
		 new Display().allData();

	}

}
