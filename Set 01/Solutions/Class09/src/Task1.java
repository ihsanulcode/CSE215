
public class Task1 {
	public static void main(String[] args) {
		Square obj = new Square(5.5);
		
		System.out.println("Area     : "+obj.area());
		System.out.println("Perimeter: "+obj.perimeter());
	}

}
class Shape{
	private String name;
	
	Shape(){
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Rectangle extends Shape{
	private double side1;
	private double side2;
	
	Rectangle(){
		
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double area() {
		return side1*side2;
	}
	
	public double perimeter() {
		return 2*(side1+side2);
	}
}

class Square extends Rectangle{
	Square(double a){
		setSide1(a);
		setSide2(a);
	}
}