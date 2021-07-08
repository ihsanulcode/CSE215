
public class RDS {
	public static void main(String[] args) {

		Student_RDS s1 = new Student_RDS("Name1", 3.8, 201);
		Student_RDS s2 = new Student_RDS("Name2", 3.8, 202);
		Student_RDS s3 = new Student_RDS("Name3", 3.8, 203);
		Student_RDS s4 = new Student_RDS("Name4", 3.8, 211);
		Student_RDS s5 = new Student_RDS("Name5", 3.8, 221);

		s1.printStudentInfo();
		s2.printStudentInfo();
		s3.printStudentInfo();
		s4.printStudentInfo();
		s5.printStudentInfo();
	}
}

class Student_RDS {
	// data fields
	String name;
	double CGPA;
	int ID;

	public Student_RDS() {

	}

	public Student_RDS(String name, double CGPA, int ID) {
		this.name = name;
		this.CGPA = CGPA;
		this.ID = ID;
	}

	public void printStudentInfo() {
		System.out.println("Name: " + this.name + "\nID: " + this.ID + "\nCGPA: " + this.CGPA+"\n");
	}
}