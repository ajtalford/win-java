package bankaccountapp;


public class Checking extends Account{
	
	// List properties to a Checking account
	private int debitCardNum, debitCardPin;
 		
	// Constructor to initialize checking account properties
	public Checking(String name, String ssNum, double intDeposit ) {
		super(name, ssNum, intDeposit);
		acctNum = "2" + acctNum;
		setDebitCard();
		
	}
	
	// Methods specific to the checking account
	@Override
	public void setRate() {
		// System.out.println("Implement rate for checking");
		rate = getBaseRate() * .15;
	}
	
	private void setDebitCard() {
		debitCardNum = (int)(Math.random()* Math.pow(10, 12));
		debitCardPin = (int)(Math.random()* Math.pow(10, 4));
	}
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features \n Debit Card Number: " + debitCardNum + 
				"\n Debit Card PIN: " + debitCardPin);
		
	}

	

}
