package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String [] args) {
		// Read CSV from utilities package then create new accounts based on that data
		String file = ("src/utilities/original.csv");
		Checking checking1 = new Checking("Albert Talford ", "321124391", 1500.00);
		Savings savings1 = new Savings("Robert Hayden ", "123412930", 12000.00);
			
		// savings1.compound();
		
		savings1.showInfo();
		 System.out.println("\n**********************");
		 checking1.showInfo();
		 	 
		savings1.deposit(5000.00);
		savings1.withdraw(200.00);
		savings1.transfer("Brokerage", 3000.00);


		List<Account> accounts = new LinkedList<Account>();
		
		 // Read CSV file then create new accounts based on that data
		List <String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders){
			
			System.out.println("NEW ACCOUNT");
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);
			String name = accountHolder[0];
			String ssNum = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, ssNum, initDeposit));
				
			}else if (accountType.equals("Checking")) {
				
				accounts.add(new Checking(name, ssNum, initDeposit));
				
			}else {
				System.out.println("ERROR READING ACCOUNT TYPE ");
			}
			
		}
		
		for (Account acc : accounts) {
			System.out.println("\n*********************");
			acc.showInfo();
		}
			
		}
}
