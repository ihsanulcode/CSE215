

public class AccountHolder {
	static int acc_num = 0;
	private String name;
	private int acc_balance=0;
	
	AccountHolder(){
		acc_num ++;
	}
	
	AccountHolder(String naam,int acc_balance)
	{
		name=naam;
		this.acc_balance=acc_balance;
	}
	
	public String getName() {
		return name;
	}

	public int getAcc_balance() {
		return acc_balance;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_num() {
		return acc_num;
	}
	
	public void displayInfo()
	{
		System.out.println("Account name is: "+name+"\nAccount number is: "
	+acc_num+"\nAccount balance is: "+acc_balance+"\n");
	}
	
	public void deposit(int amount)
	{
		acc_balance=acc_balance+amount;
	}
	
	public void withdraw(int amount)
	{
		if(amount<=acc_balance)
		{
		acc_balance=acc_balance-amount;
		}
		else
		{
			System.out.println("you do not have sufficient balance to withdraw");
		}
	}
	
	public void checkbalance()
	{
		System.out.println("Account balance is:"+acc_balance);
	}
	
	//return the string representation of the object(that is called)
	public String toString()
	{
		return name+" "+acc_num+ " "+ acc_balance;
	}
	
	

}
