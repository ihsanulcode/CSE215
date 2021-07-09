package Final;

public abstract class Student {
	private String name;
	private double CGPA;
	private int semester;
	private int ID;
	private String degree;

	public Student() {

	}

	public Student(String name, double CGPA, int semester, int ID, String degree) {
		this.name = name;
		this.CGPA = CGPA;
		this.semester = semester;
		this.ID = ID;
		this.degree = degree;
	}

	public String getName() {
		return name;
	}

	public double getCGPA() {
		return CGPA;
	}

	public int getSemester() {
		return semester;
	}

	public int getID() {
		return ID;
	}

	public String getDegree() {
		return degree;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	// abstract method
	public abstract double getSemesterFee();

}
