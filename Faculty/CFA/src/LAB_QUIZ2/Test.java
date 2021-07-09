package LAB_QUIZ2;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//part i
		CSE_Students c1 = new CSE_Students("Siam",1,18,1,"CSE215","CFA","Programming Language II","QUIZ 1");
		CSE_Students c2 = new CSE_Students("Siam",1,19,1,"CSE215","CFA","Programming Language II","QUIZ 2");
		CSE_Students c3 = new CSE_Students("Siam",1,20,1,"CSE215","CFA","Programming Language II","QUIZ 3");
		CSE_Students c = new CSE_Students("Siam",1,24,1,"CSE215","CFA","Programming Language II","MID");
		CSE_Students d = new CSE_Students("Siam",1,23,1,"CSE215","CFA","Programming Language II","Final");
		
		EEE_Students e1 = new EEE_Students("Siam",1,12,1,"EEE141","CFA","Electric Circuit I","QUIZ 1");
		EEE_Students e2 = new EEE_Students("Siam",1,14,1,"EEE141","CFA","Electric Circuit I","QUIZ 2");
		EEE_Students e3 = new EEE_Students("Siam",1,15,1,"EEE141","CFA","Electric Circuit I","QUIZ 3");
		EEE_Students g = new EEE_Students("Siam",1,24,1,"EEE141","CFA","Electric Circuit I","MID");
		EEE_Students h = new EEE_Students("Siam",1,23,1,"EEE141","CFA","Electric Circuit I","Final");
		
		System.out.println("CSE Major:\n");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		System.out.println("\nEEE Major:\n");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(g.toString());
		System.out.println(h.toString());
		
		
		
		//part ii
		
		//cse data entry
		
		System.out.println("\nENTER DATA FOR MID EXAM (CSE MAJOR):\n");
		CSE_Students[] csemid_arr = new  CSE_Students[10];
		for (int i = 0; i < csemid_arr.length; i++) {
			System.out.println("Student "+(i+1)+".");
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("ID: ");
			int id = input.nextInt();
			input.nextLine();
			System.out.print("Marks: ");
			double marks = input.nextDouble();
			input.nextLine();
			System.out.print("Section: ");
			int section = input.nextInt();
			input.nextLine();
			System.out.print("Course Code: ");
			String courseCode = input.nextLine();
			System.out.print("Course Faculty: ");
			String courseFaculty = input.nextLine();
			System.out.print("Subject Name: ");
			String subName = input.nextLine();
			
			csemid_arr[i] = new CSE_Students(name, id, marks, section, courseCode, courseFaculty,subName,"MID");
			System.out.println();
			
		}
		
		System.out.println("\nENTER DATA FOR FINAL EXAM (CSE MAJOR):\n");
		CSE_Students[] csefinal_arr = new  CSE_Students[10];
		for (int i = 0; i < csefinal_arr.length; i++) {
			System.out.println("Student "+(i+1)+".");
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("ID: ");
			int id = input.nextInt();
			input.nextLine();
			System.out.print("Marks: ");
			double marks = input.nextDouble();
			input.nextLine();
			System.out.print("Section: ");
			int section = input.nextInt();
			input.nextLine();
			System.out.print("Course Code: ");
			String courseCode = input.nextLine();
			System.out.print("Course Faculty: ");
			String courseFaculty = input.nextLine();
			System.out.print("Subject Name: ");
			String subName = input.nextLine();
			
			csefinal_arr[i] = new CSE_Students(name, id, marks, section, courseCode, courseFaculty,subName,"FINAL");
			System.out.println();
			
		}
		
		//eee data entry
		
		System.out.println("\nENTER DATA FOR MID EXAM (EEE MAJOR):\n");
		EEE_Students[] eeemid_arr = new  EEE_Students[10];
		for (int i = 0; i < eeemid_arr.length; i++) {
			System.out.println("Student "+(i+1)+".");
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("ID: ");
			int id = input.nextInt();
			input.nextLine();
			System.out.print("Marks: ");
			double marks = input.nextDouble();
			input.nextLine();
			System.out.print("Section: ");
			int section = input.nextInt();
			input.nextLine();
			System.out.print("Course Code: ");
			String courseCode = input.nextLine();
			System.out.print("Course Faculty: ");
			String courseFaculty = input.nextLine();
			System.out.print("Subject Name: ");
			String subName = input.nextLine();
			
			eeemid_arr[i] = new EEE_Students(name, id, marks, section, courseCode, courseFaculty,subName,"MID");
			System.out.println();
			
		}
		
		System.out.println("\nENTER DATA FOR FINAL EXAM (EEE MAJOR):\n");
		EEE_Students[] eeefinal_arr = new  EEE_Students[10];
		for (int i = 0; i < eeefinal_arr.length; i++) {
			System.out.println("Student "+(i+1)+".");
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("ID: ");
			int id = input.nextInt();
			input.nextLine();
			System.out.print("Marks: ");
			double marks = input.nextDouble();
			input.nextLine();
			System.out.print("Section: ");
			int section = input.nextInt();
			input.nextLine();
			System.out.print("Course Code: ");
			String courseCode = input.nextLine();
			System.out.print("Course Faculty: ");
			String courseFaculty = input.nextLine();
			System.out.print("Subject Name: ");
			String subName = input.nextLine();
			
			eeefinal_arr[i] = new EEE_Students(name, id, marks, section, courseCode, courseFaculty,subName,"FINAL");
			System.out.println();
			
		}
		
		//display part
		System.out.println("\n\t\t--- CSE MAJOR (MID)---\n");
		for (int i = 0; i < csemid_arr.length; i++) {
			System.out.println("Student "+(i+1)+".");
			System.out.println(csemid_arr[i].toString());
		}
		
		System.out.println("\n\t\t--- CSE MAJOR (FINAL)---\n");
		for (int i = 0; i < csefinal_arr.length; i++) {
			System.out.println("Student "+(i+1)+".");
			System.out.println(csefinal_arr[i].toString());
		}
		
		
		System.out.println("\n\t\t--- EEE MAJOR (MID)---\n");
		for (int i = 0; i < eeemid_arr.length; i++) {
			System.out.println("Student "+(i+1)+".");
			System.out.println(eeemid_arr[i].toString());
		}
		
		System.out.println("\n\t\t--- EEE MAJOR (FINAL)---\n");
		for (int i = 0; i < eeefinal_arr.length; i++) {
			System.out.println("Student "+(i+1)+".");
			System.out.println(eeefinal_arr[i].toString());
		}
		
		CSE_Students CSE = new CSE_Students();
		EEE_Students EEE = new EEE_Students();
		System.out.println("Average Mid Marks (CSE MAJOR)  : "+CSE.averageMid(csemid_arr));
		System.out.print("Average Final Marks (CSE MAJOR): ");CSE.averageFinal(csefinal_arr);
		System.out.println("\nAverage Mid Marks (EEE MAJOR)  : "+EEE.averageMid(eeemid_arr));
		System.out.print("Average Final Marks (EEE MAJOR): ");EEE.averageFinal(eeefinal_arr);
		
		input.close();

	}

}
