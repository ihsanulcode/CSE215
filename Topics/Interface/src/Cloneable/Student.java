package Cloneable;

import java.util.Arrays;
import java.util.Date;

public class Student implements Cloneable, Comparable<Student> {
	String name;
	int ID;
	double CGPA;
	Date AdmissonDate;
	double[] scores;

	Student() {

	}

	Student(String name, int ID, double CGPA, Date AdmissonDate,double[] scores) {
		this.name = name;
		this.ID = ID;
		this.CGPA = CGPA;
		this.AdmissonDate = AdmissonDate;
		this.scores = scores;
	}

	@Override
	public int compareTo(Student o) {
		if (CGPA > ((Student) o).CGPA)
			return 1;
		else if (CGPA < ((Student) o).CGPA)
			return -1;
		else
			return 0;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		/*
		 * Student StudentClone = (Student)super.clone(); //Deep Copy
		 * StudentClone.AdmissonDate = (Date)(AdmissonDate.clone()); return
		 * StudentClone;
		 */

		// Shallow Copy
		//return (Student)super.clone();
		
		//Deep Copy
		Student StudentClone = (Student)super.clone(); 
		double[] arr = new double[scores.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = this.scores[i];
		}
		StudentClone.scores = arr;
		return StudentClone;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nID: " + ID + "\nCGPA: " + CGPA + "\nAdmission Date: " + AdmissonDate+"\nScores: "+Arrays.toString(scores);
	}

}
