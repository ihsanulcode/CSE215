import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		do {
			
			try {
				System.out.print("Enter prime number: ");
				int n = input.nextInt();
				CheckPrime(n);
				
				if(n==0) flag = false;
				
				
			}catch(InputMismatchException ex) {
				System.out.println(ex);
				break;
			}
		}while(flag);
		
		input.close();

	}
	
	public static void CheckPrime(int n) {
		int flag = 0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag = 1;
                break;
            }
        }
        
        if(flag==0) {
        	//prime
        }   
        else {
        	throw new InputMismatchException("Input prime number only");
        }
            
	}

}
