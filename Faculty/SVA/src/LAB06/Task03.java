package LAB06;

import java.util.*;

public class Task03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// getting user inputs
		System.out.print("Enter ACC NO: ");
		int acc_no = input.nextInt();
		System.out.print("Enter Balance: ");
		double balance = input.nextDouble();

		System.out.print("Annual Innterest Rate: ");
		double annualinterest_rate = input.nextDouble();

		System.out.print("\nWithdraw amount: ");
		double withdraw_amount = input.nextDouble();

		System.out.print("Deposit amount: ");
		double deposit_amount = input.nextDouble();

		// creates an account instance and set values
		Account AC = new Account(acc_no, balance);
		AC.setAnnualInterestRate(annualinterest_rate);

		// withdrawing amount
		AC.withdraw(withdraw_amount);

		// deposit amount
		AC.deposit(deposit_amount);

		// printing info
		System.out.println("\nAccount informations:");
		System.out.println("Balance: " + AC.getBalance());
		System.out.printf("Monthly Interest: %.2f\n", AC.getMonthlyInterest());
		System.out.println("Date of account create: " + AC.getDate());

		input.close();
	}
}

class Account {
	private int ID;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	// no arguments constructor
	Account() {
		ID = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
		dateCreated = new Date();
	}

	// argument constructor
	Account(int ID, double balance) {
		this.ID = ID;
		this.balance = balance;
	}

	// getter method
	int getID() {
		return this.ID;
	}

	double getBalance() {
		return this.balance;
	}

	double getAnnualInterestRate() {
		return this.annualInterestRate;
	}

	String getDate() {
		this.dateCreated = new Date();
		return this.dateCreated.toString();
	}

	// setter method
	void setID(int ID) {
		this.ID = ID;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// monthly interest RATE
	double getMonthlyInterestRate() {
		return (annualInterestRate / 100.0) / 12.0;
	}

	// monthly interest
	double getMonthlyInterest() {
		return (balance * getMonthlyInterestRate());
	}

	// deposit
	void deposit(double TK) {
		this.balance += TK;
	}

	// withdraw
	void withdraw(double TK) {
		this.balance -= TK;
	}
}
