
public class LAB09_Task1 {

	public static void main(String[] args) {
		Faculty f = new Faculty();
		f.setName("Dr. William B. Poucher");
		f.setRank("Professor");
		f.setAge(55);
		f.setSalary(1000000.0);
		f.setInitial("WBPh");
		System.out.println(f.toString());
	}

}

class Person {
	private String name;
	private String gender;
	private int age;

	Person() {

	}

	Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Employee extends Person {
	private String id;
	private String dept;
	private double salary;

	Employee() {

	}

	Employee(String id, String dept, double salary) {
		this.id = id;
		this.dept = dept;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public String getDept() {
		return dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

class Faculty extends Employee {
	private String initial;
	private String rank;

	Faculty() {

	}

	Faculty(String initial,String rank) {
		this.initial = initial;
		this.rank = rank;
	}

	public String getInitial() {
		return initial;
	}

	public String getRank() {
		return rank;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
	public String toString() {
		return "Faculty Name: "+getName()+"\nRank: "+getRank()+"\nAge: "+getAge()+"\nSalary: $"+getSalary()+"\nInitial: "+getInitial();
	}
}
