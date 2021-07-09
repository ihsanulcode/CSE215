package LAB_Task;

/*
 * 3. We have to calculate the area of a rectangle, a square and a circle. 
 * Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' 
 * taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' 
 * is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 
 * 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. 
 * Create an object of class 'Area' and call all the three methods.
 */
abstract class Shape{
	public abstract void RectangleArea(double length,double breadth);
	public abstract void SquareArea(double side);
	public abstract void CircleArea(double radius);
}

class Area extends Shape{

	@Override
	public void RectangleArea(double length, double breadth) {
		System.out.println("Area of rectangle: "+length*breadth);
	}

	@Override
	public void SquareArea(double side) {
		System.out.println("Area of square: "+Math.pow(side, 2));
	}

	@Override
	public void CircleArea(double radius) {
		System.out.println("Area of circle: "+Math.PI*Math.pow(radius, 2));
	}
	
}
public class Task03 {

	public static void main(String[] args) {
		Area obj = new Area();
		
		obj.RectangleArea(4, 5);
		obj.SquareArea(5);
		obj.CircleArea(3);

	}

}
