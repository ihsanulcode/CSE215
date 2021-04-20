
/*
 * 1. Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively.
 * 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
 * Call this method by creating an object of each of the three classes.
 */

abstract class Bank{
	public abstract double getBalance();
}

class BankA extends Bank{
	double balance = 100.0;

	@Override
	public double getBalance() {
		return balance;
	}
	
}
class BankB extends Bank{
	double balance = 150.0;
	
	@Override
	public double getBalance() {
		return balance;
	}
	
}
class BankC extends Bank{
	double balance = 200.0;
	
	@Override
	public double getBalance() {
		return balance;
	}
	
}
public class Task01 {

	public static void main(String[] args) {
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		
		System.out.println(a.getBalance());
		System.out.println(b.getBalance());
		System.out.println(c.getBalance());

	}

}
