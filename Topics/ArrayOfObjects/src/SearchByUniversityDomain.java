import java.util.Scanner;

public class SearchByUniversityDomain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many student do you want to add?");
		int n = in.nextInt();
		in.nextLine();

		Student[] s = new Student[n];

		System.out.println("Enter all the students name and email:");
		for (int i = 0; i < n; i++) {
			String name = in.nextLine(), email = in.nextLine();
			s[i] = new Student(name, email);
		}
		
		System.out.println("Enter a universirty domain to search:");
		String domain = in.nextLine();
		String key = Search(s, domain);
		
		System.out.println("Search Results: ");
		System.out.println(key);
		in.close();

	}

	public static String Search(Student[] Students, String Domain) {
		int count = 0;
		String temp = "";

		for (int i = 0; i < Students.length; i++) {
			if (Students[i].getEmail().contains(Domain)) {
				count++;
				temp += Students[i].getName()+"\n";
			}
		}
		System.out.printf("\n%d students voted using this domain.", count);
		
		return temp;
	}

}

class Student {
	private String name;
	private String email;

	public Student(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return name;
	}
}
