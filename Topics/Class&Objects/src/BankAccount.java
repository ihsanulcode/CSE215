
class Bank {
	private String name;
	private int ACC_NO;
	private double ACC_balance;
	
	Bank(){
		name = null;
		ACC_NO = 0;
		ACC_balance = 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getACC_NO() {
		return ACC_NO;
	}

	public void setACC_NO(int aCC_NO) {
		ACC_NO = aCC_NO;
	}

	public double getACC_balance() {
		return ACC_balance;
	}

	public void setACC_balance(double aCC_balance) {
		ACC_balance = aCC_balance;
	}
	
	public void deposite(double TK) {
		ACC_balance += TK;
	}
	
	public void withdraw(double TK) {
		ACC_balance -= TK;
	}
	
	public void info() {
		System.out.println("Name           : "+getName());
		System.out.println("ACC No         : "+getACC_NO());
	}
	
	public void checkBal() {
		System.out.println("Account Balance: "+getACC_balance());
	}

}

public class BankAccount{
	public static void main(String[] args) {
		Bank ac = new Bank();
		
		ac.setName("Ihsanul Haque Asif");
		ac.setACC_NO(201);
		ac.setACC_balance(50000);
		
		ac.withdraw(25000);
		ac.info();
		
		ac.deposite(5000);
		ac.checkBal();
	}
}
