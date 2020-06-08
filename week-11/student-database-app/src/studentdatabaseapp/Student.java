package studentdatabaseapp;
import java.util.Scanner;

public class Student {
	private String firstName, lastName, gradeYear, studentID, courses = "";
	private int tuitionBalance = 0;
	private static int id = 1000, costOfCourse = 600;
	
	
	// Constructor: prompt user to enter student;s name and year
	public Student() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = s.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = s.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = s.nextLine();
		
		setStudentID();
	
	// System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}
	
	// Generate an ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	// Enroll in courses
	public void enroll() {
			// inside loop user hits 0
		do {	System.out.print("Enter course to enroll (Q to quit): ");
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			String course = s.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			 else {
			// System.out.println("Break");
				 break;}
		}while (1 != 0);
		
		// System.out.println("ENROLLED IN: " + courses);
		// System.out.println("TUITION BALANCE: " + tuitionBalance);
		
	}
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is $" + tuitionBalance);
	}
	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int payment = s.nextInt();
		
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment + "\n");
		viewBalance();
	}
	
	// Show status
	public String toString() {
		return "Name " + firstName + " " + lastName +  
				"\nGrade Level: " + gradeYear + 
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled:" + courses + 
				"\nTuition Balance: $" + tuitionBalance;
	}
	

}
