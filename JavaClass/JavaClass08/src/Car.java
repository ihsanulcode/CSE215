
public class Car {
	//data fields
	String model;
	String color;
	double cost;
	
	//constructors
	public Car() { //no-argument constructor / default constructor
		
	}
	
	public Car(String model,String color,double cost){ //argument constructor
		this.model = model;
		this.color = color;
		this.cost = cost;
	}
	
	//methods
	public void printDetails() {
		System.out.println("Model: "+this.model);
		System.out.println("Color: "+this.color);
		System.out.println("Cost: "+this.cost);
	}

}
