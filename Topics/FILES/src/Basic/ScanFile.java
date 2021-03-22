package Basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//declare FILE object
		File file = new File("src/CSE215L.txt");
		//Create scanner object 
		Scanner input = new Scanner(file);
		
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}input.close();

	}

}
