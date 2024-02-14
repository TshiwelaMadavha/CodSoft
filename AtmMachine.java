import java.text.DecimalFormat;
import java.util.Scanner;
public class AtmMachine{
	
	DecimalFormat decimalFormat = new DecimalFormat("R0.00");
	private BankAccount account;
	
	public AtmMachine(BankAccount account)
	{
		this.account = account;
	}
	
	public void withdraw(double amount)
	{
		if(amount>account.getBalance()){
			System.out.println("Error Unsuccessful Transaction: Insufficient Balance\n");
		}
		else if(amount<0){
			System.out.println("Error Unsuccessful Transaction: Insufficient input amount must be greater then R0.00\n");
		}
		else{
			account.withdraw(amount);
			System.out.println("Your money has been  withdrew successfully: " + decimalFormat.format(amount));
			System.out.println("Your current balance is: " +  decimalFormat.format(account.getBalance()));
		}
	}
	
	public void deposit(double amount){
		if(amount<0)
		{
			System.out.println("Error Unsuccessful Transaction: Invaild input amount must be greater then R0.00\n");
		}
		else{
			account.deposit(amount);
			System.out.println("Your money has been deposited successfully: " + decimalFormat.format(amount));
			System.out.println("Your current balance is: " +  decimalFormat.format(account.getBalance()));
		}
	}
	
	public void checkBalance(){
		System.out.println("\nYour current balance is: " +  decimalFormat.format(account.getBalance()));
	}
	
	public static void main(String[] args)
	{
		BankAccount account = new BankAccount();
		AtmMachine machine = new AtmMachine(account); 
		Scanner kb = new Scanner(System.in);
		
		//declaring and initializing variables
		int session =1;
		int option;
		double withdrawAmount;
		double depositAmount;
		
		System.out.println("\t\t\tWelcome to our ATM Machine");
		
		do
		{
			System.out.println("\t\t\t\tTransaction options");
			System.out.print("\n1) Withdraw\n2) Deposit\n3) Balance\nSelect Option: ");
			option = kb.nextInt();
			switch(option)
			{
				case 1: System.out.print("\nEnter the amount of money to be withdraw: ");
						withdrawAmount = kb.nextDouble();
						machine.withdraw(withdrawAmount);
						break;
				case 2: System.out.print("\nEnter the amount of money to deposit: ");
						depositAmount = kb.nextDouble();
						machine.deposit(depositAmount);
						break;
				case 3: machine.checkBalance();
						break;
				default: System.out.println("\nInsuffient option\n");
			}
			
			System.out.print("\nDo you want to perform another transaction\n1. Yes\No. close Process\n");
			session = kb.nextInt();
		}while( session ==1);
		
		System.out.print("\nThank You for using our ATM bank\nClose of Process");
	}
}