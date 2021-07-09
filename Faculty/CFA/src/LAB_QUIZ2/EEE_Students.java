package LAB_QUIZ2;

public class EEE_Students extends StudentInfo {
	private String SUBJECT_NAME;
	private String EXAM_NAME;

	EEE_Students() {

	}

	EEE_Students(String name, int id, double marks, int section, String courseCode, String courseFaculty,
			String subjectName, String examName) {
		super(name, id, marks, section, courseCode, courseFaculty);
		SUBJECT_NAME = subjectName;
		EXAM_NAME = examName;
	}

	public double averageMid(EEE_Students[] arr) {
		double temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp += arr[i].getMARKS();
		}

		double avg = temp / (double) arr.length;
		return avg;
	}

	public double averageFinal(EEE_Students[] arr) {
		double temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp += arr[i].getMARKS();
		}

		double avg = temp / (double) arr.length;
		return avg;
	}

	public String toString() {
		String s = "NAME: " + getNAME()
		+ "\nID: " + getID()
		+ "\nMARKS: " + getMARKS()
		+ "\nSECTION: " + getSEC()
		+ "\nCOURSE CODE: " + getCOURSE_CODE()
		+ "\nFaculty: " + getCOURSE_FACULTY()
		+ "\nSubject: " + SUBJECT_NAME
		+ "\nExam name: " + EXAM_NAME;

		return s;
	}
}
