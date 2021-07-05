import java.util.Scanner;

//Write a program to calculate the area of triangle!
public class AreaTest {
	//psvm
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //Scanner class
		
		//input 
		System.out.print("Enter the base: ");
		double b = in.nextDouble();
		System.out.print("Enter the height: ");
		double h = in.nextDouble();
		
		//calculation
		double area = 0.5*b*h;
		System.out.println("Area: "+area+"msq.");
		
	}

}
