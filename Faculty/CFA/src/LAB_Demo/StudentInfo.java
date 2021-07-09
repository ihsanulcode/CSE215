package LAB_Demo;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentInfo {

	void userInput() {
		Scanner input = new Scanner(System.in);

		try {
			File file = new File("students.txt");
			PrintWriter write = new PrintWriter(file);

			System.out.println("Enter students name and marks:");
			for (int i = 1; i <= 3; i++) {
				System.out.println("Student " + i + ":");
				String name = input.nextLine();
				int marks = input.nextInt();
				input.nextLine();
				write.println(name);
				write.println(marks);
			}
			write.close();
			input.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	void writeData() {
		this.userInput();
	}

	void readData() {
		String[] names = new String[3];
		int[] marks = new int[3];
		int i = 0;
		try {
			File file = new File("students.txt");
			// FILE input (Read from file)
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				names[i] = input.nextLine();
				marks[i] = Integer.parseInt(input.nextLine());
				// System.out.println(names[i]);
				// System.out.println(marks[i]);
				i++;
			}
			input.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}

		sumData(marks);
		minData(names, marks);
		max2ndData(names, marks);
	}

	void sumData(int[] marks) {
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}

		try {
			File file = new File("sum.txt");
			PrintWriter write = new PrintWriter(file);
			write.println(sum);
			write.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	void minData(String[] names, int[] marks) {
		int min = marks[0];
		int index = 0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < min) {
				min = marks[i];
				index = i;
			}
		}
		try {
			File file = new File("min.txt");
			PrintWriter write = new PrintWriter(file);
			write.println(names[index]);
			write.println(marks[index]);
			write.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	void max2ndData(String[] names, int[] marks) {
		// finding max index
		int max = marks[0];
		int maxindex = 0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > max) {
				max = marks[i];
				maxindex = i;
			}
		}

		// removing max marks from marks array
		int[] newMarks = new int[marks.length - 1];

		for (int i = 0, k = 0; i < marks.length; i++) {

			if (i == maxindex) {
				continue;
			}

			newMarks[k++] = marks[i];
		}

		// removing max marks from marks array
		String[] newNames = new String[names.length - 1];

		for (int i = 0, k = 0; i < names.length; i++) {

			if (i == maxindex) {
				continue;
			}

			newNames[k++] = names[i];
		}

		
		//finding 2nd max from new arrays
		int max2 = newMarks[0];
		int max2index = 0;
		for (int i = 0; i < newMarks.length; i++) {
			if (newMarks[i] > max2) {
				max2 = newMarks[i];
				max2index = i;
			}
		}
		
		try {
			File file = new File("max.txt");
			PrintWriter write = new PrintWriter(file);
			write.println(newNames[max2index]);
			write.println(newMarks[max2index]);
			write.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

	public static void main(String[] args) {
		StudentInfo obj = new StudentInfo();
		obj.writeData();
		obj.readData();

	}

}
