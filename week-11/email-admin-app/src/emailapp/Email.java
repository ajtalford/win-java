
package emailapp;

import java.util.Scanner;

public class Email{

	private	String firstName, lastName, password, department, email, alternateEmail, companySuffix = ".aey.company.com";
	private int mailboxCapacity = 500, defaultPasswordLength = 10;
	
	
	// Constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		// call method asking for department - return department.
		this.department= setDepartment();
		// System.out.println("Department: " + this.department);
		
		// Call a method to return a private password
		this.password = randomPassword(defaultPasswordLength); 
		System.out.println("Your password is " + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		// System.out.println("Your email is " + email);
		
		}
	Scanner in = new Scanner(System.in);
	// Ask for department
	private String setDepartment() {
		System.out.println("New worker: " + firstName + ". Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\0 for none\nEnter department code: ");
		
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3) {return "acct";}
		else {return " ";}
		
	}
	
	
	
	// generate random password
	private String randomPassword(int length) {
		String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567!@#$%^&*()";
		char[] password = new char [length];
		
		for (int i=0; i<length; i++) {
			int rand = (int)(Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	// set mailbox capacity
	public void setMailboxCapicity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// change password
	public void changPassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapicity() {return mailboxCapacity;}
	
	public String getAlternateEmail() {return alternateEmail;}
	
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	
}




