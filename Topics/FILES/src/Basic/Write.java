package Basic;

import java.io.File;
import java.io.PrintWriter;

public class Write {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file = new File("src/Result.txt");
		if(file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		
		PrintWriter output = new PrintWriter(file);
		output.println("Ihsanul Haque Asif");
		output.println("Dept. of Electrical & Computer Engineering");
		output.close();
	}

}
