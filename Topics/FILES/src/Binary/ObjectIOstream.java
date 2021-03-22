package Binary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOstream {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		try ( // Create an output stream for file object.dat
				ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src/Binary/ObjectIO.dat"));) {
			// Write a string, double value, and object to the file
			output.writeUTF("John");
			output.writeDouble(85.5);
			output.writeObject(new java.util.Date());
		}

		try ( // Create an input stream for file object.dat
				ObjectInputStream input = new ObjectInputStream(new FileInputStream("src/Binary/ObjectIO.dat"));) {
			// Read a string, double value, and object from the file
			String name = input.readUTF();
			double score = input.readDouble();
			java.util.Date date = (java.util.Date) (input.readObject());
			System.out.println(name + "\n" + score + "\n" + date);
		}

	}

}
