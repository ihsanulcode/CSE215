package LAB_QUIZ03;

import java.util.Scanner;

abstract class Engineers {
	private String engineerName;

	Engineers() {

	}

	Engineers(String name) {
		this.engineerName = name;
	}

	public abstract int highestSalary(int arr[]);

	public String getEngineerName() {
		return engineerName;
	}

	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}

}

interface project1 {
	public double averageSalary(int arr[]);
}

class Software_Engineers extends Engineers implements project1 {
	private int totalProject;
	private String designation;

	Software_Engineers() {

	}

	Software_Engineers(String name, int totalProject, String designation) {
		super(name);
		this.designation = designation;
		this.totalProject = totalProject;
	}

	@Override
	public double averageSalary(int[] arr) {
		double sum = 0.0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum / (double) arr.length;
	}

	@Override
	public int highestSalary(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public int getTotalProject() {
		return totalProject;
	}

	public String getDesignation() {
		return designation;
	}

	public void setTotalProject(int totalProject) {
		this.totalProject = totalProject;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Name: " + getEngineerName() + "\nTotal project: " + totalProject + "\nDesignation: " + designation
				+ "\n";
	}
}

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Software_Engineers obj1 = new Software_Engineers("A", 1, "Junior Software Engineer");
		Software_Engineers obj2 = new Software_Engineers("B", 2, "Junior Software Engineer");
		Software_Engineers obj3 = new Software_Engineers("C", 3, "Senior Software Engineer");
		Software_Engineers obj4 = new Software_Engineers("D", 4, "Junior Software Engineer");
		Software_Engineers obj5 = new Software_Engineers("E", 5, "Senior Software Engineer");

		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		System.out.println(obj4.toString());
		System.out.println(obj5.toString());

		int[] salary = new int[10];
		System.out.println("\n\nEnter salary for 10 employees:\n");
		for (int i = 0; i < salary.length; i++) {
			salary[i] = in.nextInt();
		}

		Software_Engineers obj = new Software_Engineers();
		System.out.println("Average salary: " + obj.averageSalary(salary));
		System.out.println("Max salary: " + obj.highestSalary(salary));
	}

}
