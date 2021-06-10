package day13_Scanner;

import java.util.Scanner;

public class NextMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Drive
        System.out.println("Enter your first name");
        String firstName = scan.next(); // only takes the first word

        System.out.println("Enter your last name");
        String lastName = scan.next(); // only takes the first word

        String fullName = firstName +" "+ lastName;

        System.out.println("fullName = " + fullName);

        System.out.println("Enter your address");
        String address = scan.next(); // 7925

        System.out.println("address = " + address);

        String gender = scan.next(); //Jones
        String state = scan.next(); //Branch
        String city = scan.next();

        System.out.println("gender = " + gender);
        System.out.println("state = " + state);
        System.out.println("city = " + city);

        /*
        7925 Jones Branch Drive
         */




    }

}
