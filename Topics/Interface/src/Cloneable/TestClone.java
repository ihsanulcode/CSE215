package Cloneable;

import java.util.Date;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Student s = new Student("Ihsanul Haque",201,3.91,new Date(01/01/20),new double[]{ 3.89,4.00,4.00 });
		Student copy = (Student)s.clone();
		
		
		copy.scores[0] = 5.0;
		
		System.out.println(s.toString());
		System.out.println();
		System.out.println(copy.toString());
	}

}
