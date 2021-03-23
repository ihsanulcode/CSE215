import java.util.Scanner;

public class LAB09_Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println();
		double hours = input.nextDouble();
		double rate = input.nextDouble();
		double basic = input.nextDouble();
		
		PartTimeEmployee p = new PartTimeEmployee(hours,rate);
		FullTimeEmployee f = new FullTimeEmployee();
		f.setBasic(basic);
		
		System.out.println("Salary(PT): "+p.salary());
		System.out.println("Salary(FT): "+f.salary());
		
		
	}

}

class Personn {
	private String name;
	private int age;
	private String address;

	Personn() {

	}

	Personn(String name,int age,String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

class Employeee extends Personn{
	private String dept;
	private String designation;
	
	Employeee(){
		
	}
	
	Employeee(String dept,String designation){
		this.dept = dept;
		this.designation = designation;
		
	}

	public String getDept() {
		return dept;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}

class PartTimeEmployee extends Employeee{
	private double hours;
	private double rate;
	
	PartTimeEmployee(){
		
	}
	
	PartTimeEmployee(double hours, double rate){
		this.hours = hours;
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public double getRate() {
		return rate;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public String toString() {
		return null;
	}
	public double salary() {
		return hours*4.0*rate;
	}
}

class FullTimeEmployee extends Employeee{
	private double basic;
	private double allowance = 0.25;
	
	FullTimeEmployee(){
		
	}
	
	FullTimeEmployee(double basic,double allowance){
		this.basic = basic;
		this.allowance = allowance;
	}

	public double getBasic() {
		return basic;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public String toString() {
		return null;
	}
	public double salary() {
		return basic+ (allowance*basic);
	}
}