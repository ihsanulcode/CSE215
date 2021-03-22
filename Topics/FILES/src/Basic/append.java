package Basic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class append {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("append.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write("data\n");

		br.close();
		fr.close();
	}

}
