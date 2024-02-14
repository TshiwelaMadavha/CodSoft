public class BankAccount
{
	
	private double balance;
	
	public BankAccount()
	{
		balance=10000;
	}
	
	public BankAccount(double initiBalance)
	{
		balance = initiBalance;
	}
	
	public void withdraw(double amount)
	{
			balance = balance - amount;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;	
	}
			
	public double getBalance()
	{
		return balance;
	}
}