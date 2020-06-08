package com;

import java.util.Scanner;

public class LeapYear {

	   // Returns true if the given value is a leap year and false otherwise. 
	   //A leap year is an int divisible by 400 or divisible by 4 but not 100.
	  public boolean isLeapYear(int year){
	    return isDivisible(year, 400) || (isDivisible(year, 4) && !isDivisible(year, 100));
	  }

	  private static boolean isDivisible(int x, int y){
	    return x % y == 0;
	  }
	    
	  
   public static void main(String[] args){
	  LeapYear l = new LeapYear();

	   @SuppressWarnings("resource")
	   Scanner scan = new Scanner(System.in);
	  
	   	System.out.print("Enter a year and I'll tell you is its a Leap Year");
	   
	   int year = scan.nextInt();
	   
		if(l.isLeapYear(year) == true){
	          System.out.println( year +" is a Leap Year");
	      }
	      else{
	          System.out.println(year + " is not a Leap Year");
	      }

   	}
}