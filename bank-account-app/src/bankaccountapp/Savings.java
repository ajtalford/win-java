package bankaccountapp;


public class Savings extends Account{
	
	// List properties specific to the Savings account
	private int safetyDepositBoxID, safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Savings properties
	public Savings(String name, String ssNum, double intDeposit) {
		super(name, ssNum, intDeposit);
	//	
	//	System.out.println("New Savings Accounts");
	//	System.out.println(name);
		acctNum = "1" + acctNum;
		setSafetyDepositBox();
	}
	

	@Override
	public void setRate() {
		//System.out.println("Implement rate for Savings");
		rate = getBaseRate() - .25;
		
	}

	// Generate 3 digit id and 4 digit key
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
	// System.out.println(safetyDepositBoxId);
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}



	// List any methods specific to the checking account
	public void showInfo() {
		// System.out.println("ACCOUNT TYPE: SAVINGS"); 
		super.showInfo();
	
		System.out.println("Your savings account features " + "\n Saftey Deposit ID: " + safetyDepositBoxID
				+ "\n Safety Deposit Key: " + safetyDepositBoxKey);
	}

}
