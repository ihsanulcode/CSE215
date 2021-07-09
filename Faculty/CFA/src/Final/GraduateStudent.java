package Final;

public class GraduateStudent extends Student implements CompareObjects<Student> {
	private int NoOfCourses;

	public int getNoOfCourses() {
		return NoOfCourses;
	}

	public void setNoOfCourses(int noOfCourses) {
		NoOfCourses = noOfCourses;
	}

	public GraduateStudent(String name, double CGPA, int semester, int NoOfCourses, int ID, String degree) {
		super(name, CGPA, semester, ID, degree);
		this.NoOfCourses = NoOfCourses;
	}

	@Override
	public int compareCGPA(Student obj) {
		if (this.getCGPA() == obj.getCGPA())
			return 0;
		else if (this.getCGPA() > obj.getCGPA())
			return 1;
		else
			return -1;
	}

	@Override
	public int compareSemester(Student obj) {
		if (this.getSemester() == obj.getSemester())
			return 0;
		else if (this.getSemester() > obj.getSemester())
			return 1;
		else
			return -1;
	}

	@Override
	public int compareSemesterFee(Student obj) {
		if (this.getSemesterFee() == obj.getSemesterFee())
			return 0;
		else if (this.getSemesterFee() > obj.getSemesterFee())
			return 1;
		else
			return -1;
	}

	@Override
	public double getSemesterFee() {
		return this.getNoOfCourses() * 6000.0 + 9000.0;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + "\nID: " + this.getID() + "\nDegree: " + this.getDegree() + "\nCGPA: "
				+ this.getCGPA() + "\nSemester: " + this.getSemester() + "\nNo of Courses: " + this.NoOfCourses
				+ "\nSemester Fee: " + this.getSemesterFee() + "\n";
	}
}
