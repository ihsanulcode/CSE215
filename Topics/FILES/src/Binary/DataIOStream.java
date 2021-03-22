package Binary;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//In that way, you have to know how you writing on the file
		//Without knowing the structure of writing you can't input data from file
		//You have to maintain the sequence of output in file
		
		//Output
		DataOutputStream output = new DataOutputStream(new FileOutputStream("src/Binary/DataIO.dat"));
		
		output.writeUTF("CGPA");
		output.writeDouble(4.00);
		output.close();
		
		//Input
		DataInputStream input = new DataInputStream(new FileInputStream("src/Binary/DataIO.dat"));
		
		System.out.println(input.readUTF()+" : "+input.readDouble());
		input.close();
	}

}
