import java.util.Scanner;

public class LAB1_Task1 {

	public static void main(String[] args) {
		// Scanner class
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = in.nextLine();
		System.out.print("Enter age: ");
		int age = in.nextInt();
		in.nextLine();
		System.out.print("Enter depertment: ");
		String dept = in.nextLine();
		
		//printing
		System.out.println("\nName: "+name);
		System.out.println("Age: "+age);
		System.out.println("Name: "+dept);
		in.close();

	}

}
