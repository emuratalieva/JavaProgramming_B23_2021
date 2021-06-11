package day14_Recap;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your zip code:");
        long zipCode = scan.nextLong();

        System.out.println("How many people do you live with?");
        byte numberOfPeople = scan.nextByte();

        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        System.out.println("I see you are " +  ( (isMarried)?"married":"not Married" )
                +" and live with "+numberOfPeople +" people in your house which is in the "+zipCode+" area!"
            );

        scan.close();


    }

}

/*
- Ask the user to enter their zipcode (long), the number of people they live with (byte),
if they are married or not (boolean - true for married/false for not) and print the values in the following format:

    Ex:
        inputs: 31009, 4, false

        output:
             I see you are not married and live with 4 people in your house which is in the 31009 area!

 */
