package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
			
		// Ask how many new student we want to add
		System.out.print("Enter number of new student to enroll: ");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int numOfStudents = s.nextInt();
		// Creating array of student objects 
		Student[] students = new Student[numOfStudents];
		
		// create number of new students and print 1 student after creation
		for (int i=0; i < numOfStudents; i++) {
			students [i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].toString());
			// System.out.println(students.toString());
		}
		
		// prints complete list of students and their enrollment info 
		for (int i=0; i < numOfStudents; i++) {
			System.out.println("________________________________________________________\n");
			System.out.println(students[i].toString());
			// System.out.println(students.toString());
		}
		
	}

}
