package Practice_06_16_2021.StringPractice;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        (indexOf - length - substring - lowercase )

				5.Creating an email

				    Ask user to enter fullname. FirstName and lastName should be at least 6 character long.
				    If they are shorter than that print “Invalid data” and program should end.
				    If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cybertek.com” and print the final string as your created email.
				    The final email should be in all lowercase.

				    input: JamesBond Secret
				    output: jameret@cybertek.com
         */

        Scanner input=new Scanner(System.in);
        String domain="@cybertek.com";
        System.out.println("Please enter fullname :");
        String fullName=input.nextLine();
        String email="";

        // JamesBond Secret
        // 0123456789012345

        int spaceIndex=fullName.indexOf(" ");  // 9

        String firstName=fullName.substring(0,spaceIndex); // JamesBond
                                                           // 012345678
        System.out.println(firstName);

        String lastName=fullName.substring(spaceIndex+1); // Secret   //6 -3
                                                          // 012345
        System.out.println(lastName);



        if(firstName.length()>=6 && lastName.length()>=6)   {

            email=firstName.substring(0,4)+lastName.substring(lastName.length()-3)+domain;

        }else
        {
            System.out.println("Invalid data");
        }

        System.out.println(email.toLowerCase());

    }
}
