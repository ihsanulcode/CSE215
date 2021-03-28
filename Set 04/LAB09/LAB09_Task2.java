
public class LAB09_Task2 {

	public static void main(String[] args) {

		FullTimeEmployee e1 = new FullTimeEmployee();
		e1.setName("Ak Junaid");
		e1.setAge(20);
		e1.setAddress("Dhanmondi,Dhaka.");
		e1.setDesignation("Engineer");
		e1.setDepartment("IT");
		e1.setBasic(2000);
		e1.setAllowance(20);
		
		//display
		System.out.println("Full Time Employee:");
		System.out.println("Name: "+e1.getName());
		System.out.println("Age : "+e1.getAge());
		System.out.println("Address: "+e1.getAddress());
		System.out.println("Designation: "+e1.getDesignation());
		System.out.println("Department: "+e1.getDepartment());
		System.out.println("Salary: "+e1.tostring());
		
		PartTimeEmployee e2 = new PartTimeEmployee();
		e2.setName("Ashraful Alam");
		e2.setAge(25);
		e2.setAddress("Khilgaon,Dhaka.");
		e2.setDesignation("Engineer");
		e2.setDepartment("IT");
		e2.setHours(12);
		e2.setRate(15);
		
		//display
		System.out.println();
		System.out.println("Part Time Employee:");
		System.out.println("Name: "+e2.getName());
		System.out.println("Age : "+e2.getAge());
		System.out.println("Address: "+e2.getAddress());
		System.out.println("Designation: "+e2.getDesignation());
		System.out.println("Department: "+e2.getDepartment());
		System.out.println("Salary: "+e2.tostring());

	}

}

class Person{
	private String name;
	private int age;
	private String address;
	
	Person(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

class Employee extends Person{
	private String designation;
	private String department;
	
	Employee(){
		
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}

class PartTimeEmployee extends Employee{
	private double hours;
	private double rate;
	
	PartTimeEmployee(){
		
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public String tostring() {
		double temp = salary();
		return Double.toString(temp);
	}
	
	public double salary() {
		return (hours*rate);
	}
}

class FullTimeEmployee extends Employee{
	private double basic;
	private double allowance;
	
	FullTimeEmployee(){
		
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public String tostring() {
		double temp = salary();
		return Double.toString(temp);
	}
	
	public double salary() {
		return (basic+((allowance/100)*basic));
	}
	
}
