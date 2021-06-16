package day15_String;

import java.util.Scanner;

public class NameFormatting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");

        String firstName = scan.nextLine().trim(); // mUHtaR
            firstName = firstName.substring(0,1).toUpperCase()  + firstName.substring(1).toLowerCase();

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName+" "+lastName;

        System.out.println(fullName);

    }

}
/*
ask the user to enter first name:
    1. make sure there is no white space
    2. Make sure first character is upper case & rest of the characters need to be in lowercase

Ex:
    input:
                mUHTar

    output:
        Muhtar




 */
