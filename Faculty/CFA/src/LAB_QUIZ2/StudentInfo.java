package LAB_QUIZ2;

public class StudentInfo {
	private String NAME;
	private int ID;
	private double MARKS;
	private int SEC;
	private String COURSE_CODE;
	private String COURSE_FACULTY;

	StudentInfo() {

	}

	StudentInfo(String name, int id, double marks, int section, String courseCode, String courseFaculty) {
		NAME = name;
		ID = id;
		MARKS = marks;
		SEC = section;
		COURSE_CODE = courseCode;
		COURSE_FACULTY = courseFaculty;
	}

	public String getNAME() {
		return NAME;
	}

	public int getID() {
		return ID;
	}

	public double getMARKS() {
		return MARKS;
	}

	public int getSEC() {
		return SEC;
	}

	public String getCOURSE_CODE() {
		return COURSE_CODE;
	}

	public String getCOURSE_FACULTY() {
		return COURSE_FACULTY;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setMARKS(double mARKS) {
		MARKS = mARKS;
	}

	public void setSEC(int sEC) {
		SEC = sEC;
	}

	public void setCOURSE_CODE(String cOURSE_CODE) {
		COURSE_CODE = cOURSE_CODE;
	}

	public void setCOURSE_FACULTY(String cOURSE_FACULTY) {
		COURSE_FACULTY = cOURSE_FACULTY;
	}

	public String toString() {

		return null;
	}

}
