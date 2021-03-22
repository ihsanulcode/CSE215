package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortByCgpa {

	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();

		s.add(new Student(201, "Ihsanul Haque Asif", 3.91));
		s.add(new Student(202, "Tamanna Rahman", 3.66));
		s.add(new Student(201, "Moumita Rahman Rimjhim", 3.55));

		Collections.sort(s);

		for (Student i : s) {
			System.out.println(i.ID + " " + i.name + " " + i.CGPA);
		}
	}

}
