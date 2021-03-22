import java.util.Scanner;

public class HighestMarks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many students?");
		int n = in.nextInt();

		Marks[] mark = new Marks[n];
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			in.nextLine();
			int id = in.nextInt();
			double m = in.nextDouble();
			mark[i] = new Marks(name, id, m);
		}
		in.close();

		int highIndex = HighestIndex(mark);
		int lowIndex = lowestIndex(mark);
		//System.out.println(highIndex);
		//System.out.println(lowIndex);
		
		System.out.println(HighestInfo(mark, highIndex));
		System.out.println(lowestInfo(mark, lowIndex));

	}

	public static int HighestIndex(Marks[] m) {
		double max = m[0].getMarks();
		int Hindex = -1;
		for (int i = 0; i < m.length; i++) {
			if (m[i].getMarks() > max) {
				max = m[i].getMarks();
				Hindex = i;
			}
		}
		return Hindex;
	}

	public static int lowestIndex(Marks[] m) {
		double min = m[0].getMarks();
		int Lindex = -1;
		for (int i = 0; i < m.length; i++) {
			if (m[i].getMarks() < min) {
				min = m[i].getMarks();
				Lindex = i;
			}
		}
		return Lindex;
	}

	public static String HighestInfo(Marks[] m, int high) {
		String s = m[high].getName() + "\n" + m[high].getId() + "\n" + m[high].getMarks();
		return s;
	}

	public static String lowestInfo(Marks[] m, int low) {
		String s = m[low].getName() + "\n" + m[low].getId() + "\n" + m[low].getMarks();
		return s;
	}

}

class Marks {
	private String name;
	private double marks;
	private int id;

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	public int getId() {
		return id;
	}

	public Marks(String name, int id, double marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

}
