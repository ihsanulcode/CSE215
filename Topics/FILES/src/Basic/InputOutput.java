package Basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file = new File("src/temp.txt");

		// File output (Write on File)
		PrintWriter output = new PrintWriter(file);
		output.println("Writing on FILE");
		output.println("Write");
		output.close();

		// FILE input (Read from file)
		Scanner input = new Scanner(file);
		while (input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
		input.close();
	}

}
