package day18_Recap;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {
        System.out.println("Enter your email:");
        String email = new Scanner(System.in).next() ;

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");

        String firstName = email.substring(0, indexOf_); //craig

        firstName =  ( ""+firstName.charAt(0) ).toUpperCase() + firstName.substring(1).toLowerCase() ;
        //           first character is upper case   + rest of the characters in lowercase

        System.out.println("firstName = " + firstName);

        String lastName = email.substring(indexOf_ +1,  indexOfAt); //federighi

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase() ;
        //           first character is upper case   + rest of the characters in lowercase

        System.out.println("lastName = " + lastName);


        String domain =email.substring(indexOfAt + 1, email.indexOf(".") );

        System.out.println("domain = " + domain);



    }

}
/*
2. EmailTask2:
		Assume that email address is constructed by person's first name and followed by an underscore and last name.
		Write a program that will print out information about user based on email. Print first name, last name, and domain.
	   	First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

   			Ex:
   				input:
   					craig_federighi@apple.com

				Output:
					First name: Craig
					Last name: Federighi
					Domain: apple
 */
