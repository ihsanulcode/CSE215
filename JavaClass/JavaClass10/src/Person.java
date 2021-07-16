
public class Person {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ihsanul",21,12345,"Khilgaon,Dhaka-1219");
		Person p2 = new Person("Asif",21,12345,"Khilgaon,Dhaka-1219");
		System.out.println(p1.toString());
		System.out.println(p2.toString());

	}
	
	//data field
	String name;
	int age;
	int phone;
	String address;
	
	Person(){
		
	}
	
	Person(String name, int age, int phone,String address){
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	public String toString() {
		return "Name: "+name+"; Age: "+age+"; Phone: "+phone+"; Address: "+address;
	}
	
	

}
