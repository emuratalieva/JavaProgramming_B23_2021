package day13_Scanner;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your job title:");
        String jobTitle = scan.nextLine();

        System.out.println("jobTitle = " + jobTitle);


        /*
        System.out.println("Enter your job tile:");
        String jobTitle = scan.next(); // Software

        scan.next(); // Developer

        System.out.println("Enter your gender:");
        String gender = scan.next();

        System.out.println("jobTitle = " + jobTitle);
        System.out.println("gender = " + gender);

         */



    }
}
