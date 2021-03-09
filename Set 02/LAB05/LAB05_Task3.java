/*Write a program that has the following static variable - balance (initial value 0) and these
static methods:
deposit(double amount): Increase account balance
withdraw(double amount): Decrease account balance

Now run an infinite loop in main program so it displays user with following options:
1. Deposit
2. Withdraw
3. Balance
4. Exit
Under each option, the program should ask for appropriate user input (i.e. amount to deposit).*/

import java.util.Scanner;

public class LAB05_Task3 {

	static double balance = 0.0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your choice:");
		int choice = -1;
		while(choice != 4) {
			choice = input.nextInt();
			if(choice==1) {
				double amount = input.nextDouble();
				deposit(amount);
			}else if(choice==2) {
				double amount = input.nextDouble();
				withdraw(amount);
			}else if(choice==3) {
				System.out.println(balance);
			}else if(choice==4) {
				System.exit(0);
			}
		}
		input.close();
	}

	public static void deposit(double amount) {
		balance+=amount;
	}

	public static void withdraw(double amount) {
		balance-=amount;
	}

}
