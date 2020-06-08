package Java.ControlFLowProject;

import java.util.Random;
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
            scanner.close();
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
        // Convert last letter of favorate actor to to int and use that value.

        // Enter a random number between 1 and 50.
        System.out.println("Enter a random number between 1 and 50. ");
        int randNum = scanner.nextInt();
        

        // Random number generator
        Random random = new Random();

        int firstRand = random.nextInt(65);
        int secondRand = random.nextInt(75);
        // int thirdRand = random.nextInt(75);



        // The answer is less max "magic" number of 75; if greater than 75 subtract 75
        // from the value and that value is now the "magic ball" number.
        int magicBall = luckyNum + firstRand;

        if (magicBall > 75) {
            magicBall = magicBall - 75;
        }
        // System.out.println("The Magic Ball Number is: " + magicBall);


////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////PICKING NUMBERS//////////////////////////////////////////////////////////////

        // Lottery calculations for 5 picks
        // Use two digit model year of car and add their lucky number to it.
        // int pick1 = car + luckyNum;
        int pick1 = car + luckyNum;
        if (pick1 > 65) {
            pick1 = pick1 - 65;
        }

        // int pick2 = randNum - secondRand;
        // if (pick2 < 1) {
        //     pick2 = pick2 + 65;
        // }

        int pick2 = randNum - secondRand;
        if (pick2 < 1) {
            pick2 = pick2 + 65;
        }

        // Convert first letter of favorite actor to int and use that value.
        // Convert last letter of favorate actor to int and use that value.
        // Use the value 42.
        int pick3 = 42;

        int pick4 = actor.charAt(0);
        while (pick4 > 65) {
            pick4 = pick4 - 65;
        }


        int pick5 = petAge +car;
        // int pick2 = randNum - secondRand;
        while (pick5 > 65) {
            pick5 = pick5 - 65;
        }
        // Once all the numbers have been calculated, print them out in this form:
        // Lottery numbers: 4, 17, 15, 52, 26  Magic ball: 22
        int pickArr[] = {pick1, pick2, pick3, pick4, pick5};


        System.out.printf("Lottery numbers: ");
        for (int i = 0; i < pickArr.length; i++) {
            System.out.print(pickArr[i] + " ");

        }
        
        System.out.print("Magic Ball: " + magicBall);
        System.out.print("\n");
        scanner.close();
}

}
