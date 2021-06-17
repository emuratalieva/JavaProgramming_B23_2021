package day17_String;

import java.util.Scanner;

public class Initial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName =scan.next(); // daniel
        System.out.println("Enter your last name:");
        String lastName = scan.next(); // john

        String initial = firstName.substring(0,1).toUpperCase() +"."+lastName.substring(0,1).toUpperCase();
            // create substrings for first characters of first name & last name, then called toUpperCase

                        // d.j
   //     String initial = firstName.charAt(0)+"."+lastName.charAt(0);
   //      initial = initial.toUpperCase();

   //     String initial = firstName.toUpperCase().charAt(0)+"."+lastName.toUpperCase().charAt(0);

        System.out.println("initial = " + initial);

        scan.close();

    }

}

/*
2. write a program that can return the initials of the user
	            ex:
	                cybertek
	                school
	            output:
	                C.S
 */