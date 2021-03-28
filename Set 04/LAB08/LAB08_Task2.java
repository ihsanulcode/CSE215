package AK;

import java.util.Scanner;

public class LAB08_Task2 {

	public static void main(String[] args) {
		//scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a side of square: ");
		double a  = input.nextDouble(); //getting a side of square from user
		
		Square obj = new Square(a); //declaring object of Square class and pass side to it's argument constructor
		
		obj.setName("Square"); //invoking setName() method and set the name of the shape 
		System.out.println("\nShape: "+obj.getName()); //invoking getName() to print the name
		System.out.printf("Area: %.1f\n",obj.area()); //invoking area method to get the area 
		System.out.printf("Perimeter: %.1f",obj.perimeter()); //invoking perimeter method to get the perimeter 
		
		input.close();
	}

}

class Shape {
	private String name; //private data variable 

	Shape(){ //no argument constructor
		
	}
	
	Shape(String name){ //argument constructor 
		this.name = name;
	}
	
	public String getName() { //getter method
		return name;
	}

	public void setName(String name) { //setter method
		this.name = name;
	}

}

class Rectangle extends Shape {
	//private data fields
	private double side1;
	private double side2;

	Rectangle(){ //no argument constructor
		
	}
	
	Rectangle(double side1,double side2){ //argument constructor
		this.side1 = side1;
		this.side2 = side2;
	}
	
	//getter setter methods 
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double area() { //this method will return area 
		return side1 * side2;
	}

	public double perimeter() { //this method will return perimeter
		return 2.0 * (side1 + side2);
	}
}

class Square extends Rectangle{

	Square() { //no argument constructor 

	}

	Square(double a) { //argument constructor 
		super(a,a); //super calling to invoke the super class's constructor for Square
	}
	
	
}