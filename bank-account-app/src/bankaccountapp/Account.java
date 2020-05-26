package bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for savings and checking accounts
	private String name, ssNum;
	private double balance;
	
	private static int index = 10000;
	protected String acctNum;
	protected double rate;
	
	
	// Constructor to set base properties and initialize the account
	public Account(String name, String ssNum, double initDeposit) {
		this.name= name;
		this.ssNum=ssNum;
		balance = initDeposit;

		// Set account number
		index++;
		this.acctNum = setAccountNum();
		
		// calling setRate method
		setRate();
	}
	
	// setting the interest rate
	public abstract void setRate();
	
	// setting the account number
	private String setAccountNum(){
	String lastTwoOfSSN = ssNum.substring(ssNum.length()-2, ssNum.length());
	int uniquID = index;
	int randomNumber = (int) (Math.random() * Math.pow(10, 5));
	return lastTwoOfSSN + uniquID + randomNumber;
	
	}
	
	// compounding interest rate
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}
	
	// List common methods - transactions
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	// calculating withdraw amount
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	// transferring toWhere (another account) and amount to tranfer
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
		
	}
	
	// printing the balance
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	
	// toString method to show all the info we need
	public void showInfo() {
		System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + 
							acctNum + "\nBALANCE: $" +
							balance + "\nRATE: " + rate + "%");
	}
	

}
