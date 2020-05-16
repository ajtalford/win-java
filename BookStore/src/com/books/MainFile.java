package com.books;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // instantiating BookStore with new declaration
        BookStore store = new BookStore();
        // set book store name
        store.setName("Rebooked");
        // set book store Address
        store.setAddress("226 Queens Rd #69\n" + "Charlotte, North Carolina(NC), 28204 ");
        // set book store Address
        store.setSquareFeet(40_000);
        // set book store Address
        store.setHours("9am - 9pm Monday to Saturday");
        // sets if BookStore has used books
        store.setHasUsed("Yes.. we have plenty of used book come check out our inventory");
        System.out.println("\nTo find out about our book store Please enter an option");
        System.out.println("[1]Store name [2] Address [3] Square Feet [4] Hours [5] Use Books [6] Print inventory [7] Exit");
        int option = scan.nextInt();

            // input options to get BookStore info
            if (option == 1) {
                System.out.println("This is the " + store.getName() + " book store");

            } else if (option == 2) {
                System.out.println("Our address is " + store.getAddress());
            } else if (option == 3) {
                System.out.println("Our book store is " + store.getAddress()
                        + " square feet so there is plenty of space for social distancing ");
            } else if (option == 4) {
                System.out.println("Our store hours are " + store.getHours());
            } else if (option == 5) {
                System.out.println(store.getHasUsed());
            } else if (option == 6) {
                System.out.println("Below is our current inventory call (704) 777-7777 to reserve you copy " +
                        "\n __________________________________________________________________________\n");
                // Get BookFile.txt reading line by line
                try {
                    File myObj = new File("src/com/books/Bookfile.txt");
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            } else if (option == 7) {
                System.out.println("Sorry we couldn't help you....");
//                return;
            }else {
                System.out.println("Invalid input try some other time");
            }
    }
}


