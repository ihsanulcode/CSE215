package LAB_QUIZ2;

import java.util.Scanner;

public class DRIVER {

	public static void main(String[] args) {

		CSE_Students QUIZ1 = new CSE_Students("UNKNOWN", 201, 50, 10, "CSE215", "CFA", "JAVA", "Quiz 1");
		CSE_Students QUIZ2 = new CSE_Students("UNKNOWN", 201, 55.5, 10, "CSE215", "CFA", "JAVA", "Quiz 2");
		CSE_Students QUIZ3 = new CSE_Students("UNKNOWN", 201, 65.2, 10, "CSE215", "CFA", "JAVA", "Quiz 3");
		CSE_Students CSEMID = new CSE_Students("UNKNOWN", 201, 93.0, 10, "CSE215", "CFA", "JAVA", "Mid");
		CSE_Students CSEFINAL = new CSE_Students("UNKNOWN", 201, 95.5, 10, "CSE215", "CFA", "JAVA", "Final");

		EEE_Students EQ1 = new EEE_Students("UNKNOWN", 201, 50, 10, "EEE141", "CFA", "Electronics", "Quiz 1");
		EEE_Students EQ2 = new EEE_Students("UNKNOWN", 201, 50, 10, "EEE141", "CFA", "Electronics", "Quiz 2");
		EEE_Students EQ3 = new EEE_Students("UNKNOWN", 201, 50, 10, "EEE141", "CFA", "Electronics", "Quiz 3");
		EEE_Students EMID = new EEE_Students("UNKNOWN", 201, 50, 10, "EEE141", "CFA", "Electronics", "Mid");
		EEE_Students EFINAL = new EEE_Students("UNKNOWN", 201, 50, 10, "EEE141", "CFA", "Electronics", "Final");

		System.out.println(QUIZ1.toString());
		System.out.println();
		System.out.println(QUIZ2.toString());
		System.out.println();
		System.out.println(QUIZ3.toString());
		System.out.println();
		System.out.println(CSEMID.toString());
		System.out.println();
		System.out.println(CSEFINAL.toString());
		System.out.println();
		System.out.println();

		System.out.println(EQ1.toString());
		System.out.println();
		System.out.println(EQ2.toString());
		System.out.println();
		System.out.println(EQ3.toString());
		System.out.println();
		System.out.println(EMID.toString());
		System.out.println();
		System.out.println(EFINAL.toString());
		System.out.println();
		System.out.println();

		System.out.println("CSE - MID:\n");
		Scanner input = new Scanner(System.in);
		
		CSE_Students[] CSE_MID = new CSE_Students[10];
		CSE_Students[] CSE_FINAL = new CSE_Students[10];
		EEE_Students[] EEE_MID = new EEE_Students[10];
		EEE_Students[] EEE_FINAL = new EEE_Students[10];
		
		for (int i = 0; i < CSE_MID.length; i++) {
			
			System.out.print("NAME: ");
			String name = input.nextLine();
			
			System.out.print("ID: ");
			int id = input.nextInt();
			input.nextLine();
			
			System.out.print("MARKS: ");
			double marks = input.nextDouble();
			input.nextLine();
			
			System.out.print("SECTION: ");
			int section = input.nextInt();
			input.nextLine();
			
			System.out.print("COURSE CODE: ");
			String courseCode = input.nextLine();
			
			System.out.print("COURSE FACULTY: ");
			String courseFaculty = input.nextLine();
			
			System.out.print("SUBJECT FACULTY: ");
			String subName = input.nextLine();
			
			System.out.print("EXAM NAME: ");
			String examName = input.nextLine();

			CSE_MID[i] = new CSE_Students(name, id, marks, section, courseCode, courseFaculty, subName, examName);
			System.out.println();
			System.out.println();

		}

		System.out.println("CSE - FINAL: :\n");
		
		for (int i = 0; i < CSE_FINAL.length; i++) {
			
			System.out.print("NAME: ");
			String name = input.nextLine();
			
			System.out.print("ID: ");
			int id = input.nextInt();
			input.nextLine();
			
			System.out.print("MARKS: ");
			double marks = input.nextDouble();
			input.nextLine();
			
			System.out.print("SECTION: ");
			int section = input.nextInt();
			input.nextLine();
			
			System.out.print("COURSE CODE: ");
			String courseCode = input.nextLine();
			
			System.out.print("COURSE FACULTY: ");
			String courseFaculty = input.nextLine();
			
			System.out.print("SUBJECT FACULTY: ");
			String subName = input.nextLine();
			
			System.out.print("EXAM NAME: ");
			String examName = input.nextLine();

			CSE_FINAL[i] = new CSE_Students(name, id, marks, section, courseCode, courseFaculty, subName, examName);
			System.out.println();
			System.out.println();

		}

		System.out.println("EEE - MID:\n");
		
		for (int i = 0; i < EEE_MID.length; i++) {
			
			System.out.print("NAME: ");
			String name = input.nextLine();
			
			System.out.print("ID: ");
			int id = input.nextInt();
			input.nextLine();
			
			System.out.print("MARKS: ");
			double marks = input.nextDouble();
			input.nextLine();
			
			System.out.print("SECTION: ");
			int section = input.nextInt();
			input.nextLine();
			
			System.out.print("COURSE CODE: ");
			String courseCode = input.nextLine();
			
			System.out.print("COURSE FACULTY: ");
			String courseFaculty = input.nextLine();
			
			System.out.print("SUBJECT FACULTY: ");
			String subName = input.nextLine();
			
			System.out.print("EXAM NAME: ");
			String examName = input.nextLine();

			EEE_MID[i] = new EEE_Students(name, id, marks, section, courseCode, courseFaculty, subName, examName);
			System.out.println();
			System.out.println();

		}

		System.out.println("EEE - FINAL:\n");
		
		for (int i = 0; i < EEE_FINAL.length; i++) {
			
			System.out.print("NAME: ");
			String name = input.nextLine();
			
			System.out.print("ID: ");
			int id = input.nextInt();
			input.nextLine();
			
			System.out.print("MARKS: ");
			double marks = input.nextDouble();
			input.nextLine();
			
			System.out.print("SECTION: ");
			int section = input.nextInt();
			input.nextLine();
			
			System.out.print("COURSE CODE: ");
			String courseCode = input.nextLine();
			
			System.out.print("COURSE FACULTY: ");
			String courseFaculty = input.nextLine();
			
			System.out.print("SUBJECT FACULTY: ");
			String subName = input.nextLine();
			
			System.out.print("EXAM NAME: ");
			String examName = input.nextLine();

			EEE_FINAL[i] = new EEE_Students(name, id, marks, section, courseCode, courseFaculty, subName, examName);
			System.out.println();
			System.out.println();

		}

		System.out.println();
		System.out.println();
		
		
		for (int i = 0; i < 10; i++) 
			System.out.println(CSE_MID[i].toString());
		for (int i = 0; i < 10; i++) 
			System.out.println(CSE_FINAL[i].toString());
		for (int i = 0; i < 10; i++) 
			System.out.println(EEE_MID[i].toString());
		for (int i = 0; i < 10; i++) 
			System.out.println(EEE_FINAL[i].toString());
		

		

		CSE_Students CSE = new CSE_Students();
		EEE_Students EEE = new EEE_Students();
		
		System.out.println("CSE - AVERAGE MID MARKS : " + CSE.averageMid(CSE_MID));
		System.out.println("CSE - AVERAGE FINAL MARKS : " + CSE.averageMid(CSE_MID));
	
		System.out.println();
		System.out.println("EEE - AVERAGE MID MARKS : " + EEE.averageMid(EEE_MID));
		System.out.print("EEE - AVERAGE FINAL MARK: "+EEE.averageFinal(EEE_FINAL));


	}

}
