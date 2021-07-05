import java.util.Scanner;

public class InputTest {
	//psvm
	public static void main(String[] args) {
		//Write a program to calculate the area of a circle. Get the radius by user input.
		
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		double r = input.nextDouble();
		
		double area = 3.14*r*r;
		//double area = Math.PI*Math.pow(r, 2);
		System.out.println("Area of the circle is: "+area);
		
		
	}

}
