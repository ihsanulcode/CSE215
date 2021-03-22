
import java.util.Scanner;

public class IllegalArgument {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter radius: ");
			double r = input.nextDouble();
			setRadius(r);
		}catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}input.close();
		
		

	}
	
	public static void setRadius(double r) {
		if(r>=0) {
			System.out.println("Valid radius.");
		}else if(r<0) {
			throw new IllegalArgumentException("Radius cannot be negative");
		}
	}

}
