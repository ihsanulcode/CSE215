package Final;

public class UnderGraduateStudent extends Student implements CompareObjects<UnderGraduateStudent> {
	private int NoOfCourses;

	public int getNoOfCourses() {
		return NoOfCourses;
	}

	public void setNoOfCourses(int noOfCourses) {
		NoOfCourses = noOfCourses;
	}

	public UnderGraduateStudent(String name, double CGPA, int semester, int NoOfCourses, int ID, String degree) {
		super(name, CGPA, semester, ID, degree);
		this.NoOfCourses = NoOfCourses;
	}

	@Override
	public int compareCGPA(UnderGraduateStudent obj) {
		if (this.getCGPA() == obj.getCGPA())
			return 0;
		else if (this.getCGPA() > obj.getCGPA())
			return 1;
		else
			return -1;
	}

	@Override
	public int compareSemester(UnderGraduateStudent obj) {
		if (this.getSemester() == obj.getSemester())
			return 0;
		else if (this.getSemester() > obj.getSemester())
			return 1;
		else
			return -1;
	}

	@Override
	public int compareSemesterFee(UnderGraduateStudent obj) {
		if (this.getSemesterFee() == obj.getSemesterFee())
			return 0;
		else if (this.getSemesterFee() > obj.getSemesterFee())
			return 1;
		else
			return -1;
	}

	@Override
	public double getSemesterFee() {
		return this.getNoOfCourses() * 6500.0 + 9500.0;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + "\nID: " + this.getID() + "\nDegree: " + this.getDegree() + "\nCGPA: "
				+ this.getCGPA() + "\nSemester: " + this.getSemester() + "\nNo of Courses: " + this.NoOfCourses
				+ "\nSemester Fee: " + this.getSemesterFee() + "\n";
	}

}
