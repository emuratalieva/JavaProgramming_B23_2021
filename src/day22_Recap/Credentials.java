package day22_Recap;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        String correctUsername = "cybertek";
        String correctPassword = "cybertek12345";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next(); // u: to store user entered username

        System.out.println("Enter your password:");
        String p = scan.next(); // p: to store user entered password

        if(u.equals(correctUsername) && p.equals(correctPassword)){

            System.out.println("Logged In");

        }else{ // if user provides incorrect username or password

            for(int i = 1; i <= 2; i++){//i: 1,2 ,3
                System.out.println("username or password is incorrect, please re-enter");
                System.out.println("Enter your username:");
                u = scan.next();
                System.out.println("Enter your password:");
                p = scan.next();

                if(u.equals(correctUsername) && p.equals(correctPassword)){ // if the user entered credentials are correct
                    System.out.println("Logged In");
                    break; // exits the loop
                }

                if(i == 2){ // if user entered credentials are incorrect, and user already used all the attempts
                    System.out.println("Your account is locked");
                    System.exit(0); // terminates the system
                }

            }

        }


        System.out.println("Hello Cybertek"); // should ONLY be displayed if the user logged in

        scan.close();

    }

}

/*
1. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
						username: cybertek
				    	password: cybertek12345

	    Ask the user to enter their credentials.
	    		If credentials are matched, your program should print "Logged in."
	    		If the credentials are not matched,
	    		the program should allow the user to have three attempts to enter correct credentials and
	    		if all three attempts are failed, then print "Your account is lucked."
 */
