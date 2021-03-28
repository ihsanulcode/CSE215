
public class LAB09_Task1 {
	public static void main(String[] args) {
		
		//creating an object of Faculty class
		Faculty f = new Faculty();
		f.setName("Ak Junaid");
		f.setAge(25);
		f.setSalary(100000.0);
		f.setInitial("AKJ");
		
		//invoking toString() method to display all it's informations
		System.out.println(f.toString());
	}

}

class Person{
	//private data fields 
	private String name;
	private String gender;
	private int age;
	
	Person(){ //no argument constructor
		
	}
	
	Person(String name,String gender,int age){ //argument constructor
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	//getter setter methods
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

class Employee extends Person{
	//private data fields
	private String id;
	private String department;
	private double salary;
	
	Employee(){
		//no argument constructor
	}
	
	Employee(String id,String department,double salary){
		this.id = id;
		this.department = department;
		this.salary = salary;
	}

	//getter setter methods
	public String getId() {
		return id;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

class Faculty extends Employee{
	private String initial;
	private String rank;
	
	Faculty(){
		//no argument constructor
	}
	
	Faculty(String initial,String rank){
		this.initial = initial;
		this.rank = rank;
	}

	//getter setter methods
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
	
	//toString() method
	public String toString() {
		return "Name: "+getName()+"\nAge: "+getAge()+"\nSalary: "+getSalary()+"\nInitial: "+getInitial();
	}
}