package QUIZ2;

class Student {
	private String name;
	private int roll;
	private int marks;

	Student() {

	}

	Student(String name) {
		this.name = name;
	}

	Student(int roll, int marks) {
		this.roll = roll;
		this.marks = marks;
	}

	public void printName() {
		System.out.println(name + " " + roll + " " + marks);
	}
	
}

public class Cu1 {
	public static void main(String[] args) {
		Student a = new Student("xyz");
		Student b = new Student(3, 512);
		a.printName();
		b.printName();
	}
}