package Siam;
//Assignment for Mid 

class Vehicle{
	//data fields
	String vehicleType;
	String SINumber;
	
	
	Vehicle(){
		//no argument constructor
	}
	
	Vehicle(String vehicleType,String SINumber){
		this.vehicleType = vehicleType; //argument constructor
		this.SINumber = SINumber;
	}
	
	public void information() {
		//this information() method will print informations about the vehicle
		System.out.println("Vehicle Type: "+vehicleType);
		System.out.println("Model Number: "+SINumber);
	}
}

class Car extends Vehicle{ //every car is a vehicle (is a relation)
	//data fields
	String model;
	String color;
	
	Car(){
		//no argument constructor
	}
	
	Car(String vehicleType,String SINumber,String model,String color){ //argument constructor
		super(vehicleType,SINumber);  //assigning to super classes constructor
		this.model = model;
		this.color = color;
	}
	
	@Override
	public void information() {
		//this information() method will print informations about the car
		System.out.println("Vehicle Type : "+vehicleType);
		System.out.println("Serial Number: "+SINumber);
		System.out.println("Model        : "+model);
		System.out.println("Color        : "+color);
	}
}

class BMW extends Car{ //BMW is a Car (is a relation)
	//data fields
	long price;
	
	BMW(){
		//no argument constructor
	}
	
	BMW(String vehicleType,String modelNumber,String model,String color,long price){ //argument constructor
		super(vehicleType,modelNumber,model,color); //assigning to super classes constructor
		this.price = price;
	}
	
	@Override
	public void information() {
		//this information() method will print informations about the car
		System.out.println("Vehicle Type: "+vehicleType);
		System.out.println("Model Number: "+SINumber);
		System.out.println("Brand       : "+model);
		System.out.println("Color       : "+color);
		System.out.println("Price       : "+price);
	}
}

public class Test { //driver class

	public static void main(String[] args) { //main method
		
		//declaring an object of BMW (Child) class
		BMW myCar = new BMW("Car","XYZ012","BMW M3","Black",5000000);
		myCar.information(); //invoking information() method to display

	}

}
