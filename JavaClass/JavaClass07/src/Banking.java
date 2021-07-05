import java.util.Scanner;

public class Banking {

	static double balance = 0.0;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double amount;
		while(true) {
			System.out.println("1. Deposite");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("4. Exit");
			
			int choice = input.nextInt();
			
			switch(choice) {
			case 1:
				amount = input.nextDouble();
				deposite(amount);
				break;
			case 2:
				amount = input.nextDouble();
				withdraw(amount);
				break;
			case 3:
				System.out.println(balance);
				break;
			case 4:
				System.exit(0);
				break;
			}
			
		}

		
	}
	
	public static void deposite(double amount) {
		balance+=amount;
	}
	public static void withdraw(double amount) {
		if(balance>0.0) {
			balance-=amount;
		}
	}

}
