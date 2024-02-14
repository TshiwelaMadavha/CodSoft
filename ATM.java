import java.util.*;
 public class ATM { 
 public static void main(String[] args) {
	 BankAccount account = new BankAccount();
	 AtmMachine machine = new AtmMachine(account); 
	 Scanner kb = new Scanner(System.in); 
	 int session =1; 
	 int option;
	 double withdrawAmount;
	 double depositAmount;
	 
	 System.out.println("\t\t\t\tWelcome to our BANK ATM Machine"); 
	 
	 do {
		 System.out.println("\t\t\t\tTransaction Options"); 
		 System.out.print("\n1) Withdraw\n2) Deposit\n3) Balance\n0)Exit\nSelect Option: "); 
		 option = kb.nextInt();
		 if(option==1) 
		 { 
	       System.out.print("\n Enter Amount to be withdrawn: "); 
		   withdrawAmount = kb.nextDouble(); 
		   machine.withdraw(withdrawAmount);
		   } else 
			   if(option==2) 
			   { 
		   System.out.print("\nEnter Amount to deposit: "); 
		  depositAmount = kb.nextDouble(); 
		   machine.deposit(depositAmount); 
		   } else 
			   if(option==3)
				   { 
			   machine.checkBalance();
			   } 
			   else 
				   if(option==0) {
					   break; 
					   } else 
					   { 
				   System.out.println("\nError Option\n"); 
				   } 
				   System.out.print("\nDo you like to perform another transaction\n1. Yes\No. Close Process\n"); 
				   session = kb.nextInt(); 
				   }
				   while( session ==1);
				   System.out.println("Thank You for using our ATM bank"); 
				   }
				   }