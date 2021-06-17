package day17_String;

import java.util.Scanner;

public class Initial2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name:"); // assume user provides valid full name
        String fullName = scan.nextLine(); //john jimmy

        String firstName = fullName.substring(0, fullName.indexOf(" ") );
        String lastName = fullName.substring( fullName.indexOf(" ")  + 1  ) ;

        String initial = firstName.substring(0,1).toUpperCase() +"."+lastName.substring(0,1).toUpperCase();
        // create substrings for first characters of first name & last name, then called toUpperCase

        System.out.println("initial = " + initial);
        scan.close();

    }

}
