
public class BankAccount {
	// data fields
	private String name;
	private int ACC_NO;
	private double ACC_balance;

	BankAccount() {
		this.name = null;
		this.ACC_NO = 0;
		this.ACC_balance = 0.0;
	}
	
	BankAccount(String name,int ACC_NO,double ACC_balance){
		this.name = name;
		this.ACC_NO = ACC_NO;
		this.ACC_balance = ACC_balance;
	}
	
	BankAccount(String name,int ACC_NO){
		this.name = name;
		this.ACC_NO = ACC_NO;
		this.ACC_balance = 0.0;
	}

	//ALT+SHIFT+S+R
	//getter setter 
	//accessor mutator
	public String getName() {
		return name;
	}

	public int getACC_NO() {
		return ACC_NO;
	}

	public double getACC_balance() {
		return ACC_balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setACC_NO(int aCC_NO) {
		ACC_NO = aCC_NO;
	}

	public void setACC_balance(double aCC_balance) {
		ACC_balance = aCC_balance;
	}

	
	public void deposite(double amount) {
		this.ACC_balance += amount;
	}
	
	public void withdraw(double amount) {
		this.ACC_balance -= amount;
	}
	
	public String toString() {
		return "Account Holder: "+name+"; ACC NO: "+this.ACC_NO+"; Balance: "+this.ACC_balance;
	}
	
}
