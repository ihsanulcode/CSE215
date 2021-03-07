//Write a program that prints your name, age and department in console.
import java.util.Scanner;

public class LAB01_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//getting user input
		System.out.print("Enter name: ");
		String name = input.nextLine();
		
		System.out.print("Enter age: ");
		int age = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter dept: ");
		String dept = input.nextLine();
		
		//display
		System.out.println("\nName: "+name+"\nAge: "+age+"\nDept: "+dept);
		input.close();

	}

}
