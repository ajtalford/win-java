package com.tts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainFile {
//LIST INSTANTIATED IN MAIN CLASS
//    We can ask all the questions then ask for option in a switch
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BookStore store = new BookStore();
        store.name= "Name";
        store.address = "226 Queens Rd #69\n" +
                "Charlotte, North Carolina(NC), 28204 ";
        store.squareFeet = 40_000;
        store.hours = "9am - 9pm Monday to Saturday";
        store.hasUsed = "Yes.. we have plenty of used book come check out our inventory";
//        store.getTitles().forEach();
    //        store.hasUsed = true;

//        System.out.println("Are you looking for store info? ENTER yes or no");

//        String option = scan.nextLine();

//        if (option.equals("Yes")){
//            System.out.println(store.name + " is located at " + store.address + " \n open today from ");
//        }else if (!option.equals("Yes")){
//            System.out.println("Try again later... ");
//        }

        System.out.println("To find out about our book store Please enter an option\n");
        System.out.println(" [1]Store name\n [2] Address\n [3] = Square Feet\n [4] Hours\n [5] Use Books\n ");
        int option = scan.nextInt();

        if (option == 1){
            System.out.println(store.name);
        } else if (option == 2){
            System.out.println(store.address);
        }else if (option == 3){
            System.out.println(store.squareFeet);
        }else if (option == 4){
            System.out.println(store.hours);
        }else if (option == 5){
            System.out.println(store.hasUsed);
        } else {
            System.out.println("Select option by number next time try again later... ");
            return;
        }
    }
}
//    Use the BookStore class in `main` method to model a simulated interaction with a bookstore.
//    Note that all 'interaction' will simply be printing messages to the console.
//        * Create a bookstore
//        * Set the appropriate properties
//        * Answer the following questions:
//        - What is the address?
//        - Is the store open today?
//        - What time does it close?
//        - How big is the store?
//        - Does the store have new or used books?
