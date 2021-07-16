
public class Bank {

	public static void main(String[] args) {
		
		BankAccount ac1 = new BankAccount();
		ac1.setName("Ihsanul Haque");
		ac1.setACC_NO(201);
		ac1.setACC_balance(1000);
	
		ac1.withdraw(500);
		ac1.deposite(1500);
		System.out.println(ac1.toString());
		
		BankAccount ac2 = new BankAccount("Asif",202,20000);
		System.out.println(ac2.toString());
		BankAccount ac3 = new BankAccount("XYZ",203);
		System.out.println(ac3.toString());

	}

}
