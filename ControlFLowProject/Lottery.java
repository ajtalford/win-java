package Java.ControlFLow;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.print("Hello " + name);

        System.out.print(" Would you like to continue the interactive portion? ");
        String keepGoing = scanner.next();
        if (keepGoing.equals("y") || keepGoing.equals("yes")) {
            System.out.println("ok");

        } else {
            System.out.print("error");
            return;
        }

        System.out.println("What is the name of your favorite pet? ");
        String petName = scanner.next();

        System.out.println("What is the age of your favorite pet? ");
        int petAge = scanner.nextInt();

        // Use the age of favorite pet + car model year.

        System.out.println("What is your lucky number? ");
        int luckyNum = scanner.nextInt();

        // Do they have a favorite quarterback? If so what is their jersey number?
        System.out.println("Do you have a favorite quarterback? If so what is their jersey number? ");
        int qb = scanner.nextInt();

        while (qb > 99 || qb < 0) {
            System.out.println("Error! Please enter a number 1-99 not a name or other numbers: ");
            qb = scanner.nextInt();
        }

        // What is two-digit model year of their car?
        System.out.println("What is two-digit model year of your car? ");
        int car = scanner.nextInt();

        // What is the first name of the their favorite actor or actress?
        System.out.println("What is the first name of the your favorite actor or actress? ");
        String actor = scanner.next();
        // Convert first letter of favorite actor to int and use that value.
        // Convert last letter of favorate actorto to int and use that value.

        // Enter a random number between 1 and 50.
        System.out.println("Enter a random number between 1 and 50. ");
        int randNum = scanner.nextInt();
        
    }
}