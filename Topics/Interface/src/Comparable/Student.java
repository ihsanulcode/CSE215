package Comparable;

public class Student implements Comparable<Student>{
	int ID;
	String name;
	double CGPA;
	
	Student(){
		
	}
	
	Student(int ID,String name,double CGPA){
		this.ID = ID;
		this.name = name;
		this.CGPA = CGPA;
	}
	
	@Override
	public int compareTo(Student s) {
		if(CGPA > s.CGPA)
			return 1;
		else if(CGPA < s.CGPA)
			return -1;
		else
			return 0;
	}
}
