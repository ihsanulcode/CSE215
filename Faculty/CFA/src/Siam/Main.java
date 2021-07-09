package Siam;

import java.util.Scanner;

//Assignment for Mid 

class Person {
	// data fields
	String name;
	int age;
	int phone;
	String address;
	String bloodGroup;
	String profession;

	Person() {
		// no argument constructor
	}

	Person(String name, int age, String address, String bloodGroup, String profession, int phone) {
		this.name = name; // argument constructor
		this.age = age;
		this.address = address;
		this.bloodGroup = bloodGroup;
		this.profession = profession;
		this.phone = phone;
	}

}

class Employee extends Person {
	// data fields
	String designation;
	double workingHour;
	double salary;
	double bonus_percentage;

	Employee() {
		// no argument constructor
	}

	// argument constructor
	Employee(String name, int age, String address, String bloodGroup, String profession, int phone, String designation,
			double workingHour, double salary, double bonus_percentage) {
		super(name, age, address, bloodGroup, profession, phone); // super call
		this.designation = designation;
		this.workingHour = workingHour;
		this.salary = salary;
		this.bonus_percentage = bonus_percentage;
	}

	public double SalaryWithbonus() {
		return salary + (salary * (bonus_percentage / 100.0));
	}
}

class Faculty extends Employee {
	// data fields
	String university;
	String department;

	Faculty() {
		// no argument constructor
	}

	// argument constructor
	Faculty(String name, int age, String address, String bloodGroup, String profession, int phone, String designation,
			double workingHour, double salary, double bonus_percentage, String university, String department) {
		super(name, age, address, bloodGroup, profession, phone, designation, workingHour, salary, bonus_percentage); // super
																														// call
		this.university = university;
		this.department = department;
	}

	public void biodata() {
		// this method will print informations about the person
		System.out.println("\nFaculty Bio Data:\n");
		System.out.println("Name         : " + name);
		System.out.println("Age          : " + age);
		System.out.println("Phone        : " + phone);
		System.out.println("Address      : " + address);
		System.out.println("Blood Group  : " + bloodGroup);
		System.out.println("Profession   : " + profession);
		System.out.println("Salary       : " + SalaryWithbonus());
		System.out.println("Designation  : " + designation);
		System.out.println("Department   : " + department);
		System.out.println("Univerity    : " + university);
		System.out.println("Working Hour : " + workingHour);

	}
}

public class Main { // driver class

	public static void main(String[] args) { // main method
		Scanner input = new Scanner(System.in);

		// user input
		System.out.print("Enter name: ");
		String name = input.nextLine();

		System.out.print("Enter age: ");
		int age = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter address: ");
		String address = input.nextLine();

		System.out.print("Enter blood group: ");
		String bloodGroup = input.nextLine();

		System.out.print("Enter profession: ");
		String profession = input.nextLine();

		System.out.print("Enter phone: ");
		int phone = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter designation: ");
		String designation = input.nextLine();

		System.out.print("Enter working hour: ");
		double workingHour = input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter salary: ");
		double salary = input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter bonus percentage: ");
		double bonus_percentage = input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter university: ");
		String university = input.nextLine();

		System.out.print("Enter department: ");
		String department = input.nextLine();

		// declaring an object of Faculty (Child) class
		Faculty faculty = new Faculty(name, age, address, bloodGroup, profession, phone, designation, workingHour,
				salary, bonus_percentage, university, department);
		
		// invoking biodata() method to display all information about the faculty
		faculty.biodata(); 

	}

}
