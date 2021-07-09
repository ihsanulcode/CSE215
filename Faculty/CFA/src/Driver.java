
class House{
	String HouseName;
	String address;
	
	House(){
		
	}
	
	House(String name,String add){
		HouseName = name;
		address = add;
	}
	
}

class Flat extends House{
	int floor;
	int numberOfRooms;
	double monthlyRent;
	
	Flat(){
		
	}
	
	Flat(String name,String add,int floor,int numberOfRooms,double monthlyRent){
		super(name,add);
		this.floor = floor;
		this.numberOfRooms = numberOfRooms;
		this.monthlyRent = monthlyRent;
	}
	
	double getMonthlyCost() {
		return monthlyRent;
	}
	
	double getYearlyCost() {
		return monthlyRent*12.0;
	}
}

class MyFlat extends Flat{
	String size;
	
	MyFlat(){
		
	}
	
	MyFlat(String name,String add,int floor,int numberOfRooms,double monthlyRent,String size){
		super(name,add,floor,numberOfRooms,monthlyRent);
		this.size = size;
	}
	
	void details() {
		System.out.println("Flat name: "+HouseName);
		System.out.println("Flat size: "+size);
		System.out.println("Flat address: "+address);
		System.out.println("Number of rooms : "+numberOfRooms);
		System.out.println("Monthly cost: "+getMonthlyCost());
		System.out.println("Yearly coset: "+getYearlyCost());
		
	}
}
public class Driver {

	public static void main(String[] args) {
		MyFlat myflat = new MyFlat("Kakon's Home","Bashundhara,Dhaka",4,6,30000,"1200 square fit");
		myflat.details();

	}

}
