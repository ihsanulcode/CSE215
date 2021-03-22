package Problems;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchAndCountSize {

	public static String Search(File[] files, String file_ext) {
		int count = 0;
		double req_size = 0;
		String name_list = "";

		for (int i = 0; i < files.length; i++) {
			String found[] = files[i].getFile_name().split("[.]", 0);
			if (found[1].equals(file_ext)) {
				count++;
				req_size += files[i].getFile_size();
				name_list += (files[i].getFile_name() + "\n");
			}
		}
		return "Found: " + count + "\nRequired size: " + req_size + "\nName List: \n" + name_list;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner check = new Scanner(new java.io.File("dir.txt"));

		int elements = 0;
		for (; check.hasNext(); elements++)
			check.nextLine();
		check.close();

		Scanner file = new Scanner(new java.io.File("dir.txt"));

		File[] files = new File[elements];
		for (int i = 0; file.hasNext(); i++) {
			String path = file.next();
			double size = file.nextDouble();

			files[i] = new File(path, size);
		}
		file.close();
		// Answer to the question no 1 ends here

		Scanner in = new Scanner(System.in);
		System.out.println(Search(files, in.next()));
	}
}

class File {
	private String file_name;
	private double file_size;

	public File(String file_name, double file_size) {
		this.file_name = file_name;
		this.file_size = file_size;
	}

	public String getFile_name() {
		return file_name;
	}

	public double getFile_size() {
		return file_size;
	}

	@Override
	public String toString() {
		return file_name + " " + file_size + "\n";
	}
}