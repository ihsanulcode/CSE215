import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num = in.nextInt();
		in.close();
		
		if(CheckArmstrong(num))
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong number");

	}
	
	public static boolean CheckArmstrong(int num) {
		int copy = num;
		int sum  = 0;
		
		while(num!=0) {
			int digit = num%10;
			sum += Math.pow(digit, 3);
			num /= 10;
		}
		
		if(sum==copy) return true;
		else return false;
	}

}
