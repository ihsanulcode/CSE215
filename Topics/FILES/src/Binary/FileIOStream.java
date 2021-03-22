package Binary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//byte byte 
		
		//Output from file
		FileOutputStream output = new FileOutputStream("src/Binary/ByteByte.dat");
		//for (int i = 255; i <= 260; i++) 
		for (int i = 1; i <= 10; i++)
			output.write(i);
	
		output.close();
		
		
		//Input from file
		FileInputStream input = new FileInputStream("src/Binary/ByteByte.dat");
		
		int j;
		while((j=input.read()) != -1) {
			System.out.println(j);
		}
		input.close();
	}

}
