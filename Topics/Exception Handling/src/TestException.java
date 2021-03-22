import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter your phone number: ");
			String n = input.next();
			
			int length = n.toCharArray().length;
			if(length != 11) {
				throw new Exception("Enter 11 digit phone number!");
			}else {
				System.out.println("Valid!");
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		input.close();
	}
	

}
