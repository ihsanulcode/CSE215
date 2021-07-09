package Summer21.LAB01;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Scanner class
		
		//Student 1
		System.out.println("For Student 1:");
		System.out.print("Enter name: ");
		String name_s1 = input.nextLine();
		System.out.print("Enter ID: ");
		int ID_s1 = input.nextInt();
		input.nextLine(); //to control the console input problem
		System.out.print("Enter section: ");
		int sec_s1 = input.nextInt(); 
		input.nextLine();
		System.out.print("Enter CGPA: ");
		double CGPA_s1 = input.nextDouble(); 
		input.nextLine();
		System.out.print("Enter course code: ");
		String courseCode_s1 = input.next();
		input.nextLine();
		
		//Student 2
		System.out.println("\nFor Student 2:");
		System.out.print("Enter name: ");
		String name_s2 = input.nextLine();
		System.out.print("Enter ID: ");
		int ID_s2 = input.nextInt();
		input.nextLine();
		System.out.print("Enter section: ");
		int sec_s2 = input.nextInt();
		input.nextLine();
		System.out.print("Enter CGPA: ");
		double CGPA_s2 = input.nextDouble(); 
		input.nextLine();
		System.out.print("Enter course code: ");
		String courseCode_s2 = input.next();
		input.nextLine();
		
		//Student 3
		System.out.println("\nFor Student 3:");
		System.out.print("Enter name: ");
		String name_s3 = input.nextLine();
		System.out.print("Enter ID: ");
		int ID_s3 = input.nextInt();
		input.nextLine();
		System.out.print("Enter section: ");
		int sec_s3 = input.nextInt(); 
		input.nextLine();
		System.out.print("Enter CGPA: ");
		double CGPA_s3 = input.nextDouble();
		input.nextLine();
		System.out.print("Enter course code: ");
		String courseCode_s3 = input.next();
		
		//printing
		System.out.println("\nStudent 1:\nName: "+name_s1+"\nID: "+ID_s1+"\nSection: "+sec_s1+"\nCGPA: "+CGPA_s1+"\nCourse Code: "+courseCode_s1+"\n");
		System.out.println("Student 2:\nName: "+name_s2+"\nID: "+ID_s2+"\nSection: "+sec_s2+"\nCGPA: "+CGPA_s2+"\nCourse Code: "+courseCode_s2+"\n");
		System.out.println("Student 3:\nName: "+name_s3+"\nID: "+ID_s3+"\nSection: "+sec_s3+"\nCGPA: "+CGPA_s3+"\nCourse Code: "+courseCode_s3+"\n");
		
		//Calculating average CGPA 
		double sumOfCGPA = CGPA_s1+CGPA_s2+CGPA_s3;
		System.out.println("\nSum of CGPA is: "+sumOfCGPA);
		double average = sumOfCGPA/3.0;
		System.out.println("Average: "+average);

		input.close();
	}

}
