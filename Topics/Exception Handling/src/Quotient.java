import java.util.Scanner;

public class Quotient {

	public static void main(String[] args)throws ArithmeticException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter two integers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		try {
			if(b==0)
				throw new ArithmeticException("Divisor cannot be 0");
			
			System.out.println(a+"/"+b+" = "+a/b);
			
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		
		System.out.println("execute next");
		input.close();

	}

}
