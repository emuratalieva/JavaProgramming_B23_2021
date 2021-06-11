package day14_Recap;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product name:");
        String productName = scan.nextLine(); //iPhone 12Enter

        System.out.println("Enter the price:");
        double price = scan.nextDouble(); //850

        System.out.println("Enter the quantity:");
        int quantity = scan.nextInt(); //5

        double totalPrice = price * quantity;

        scan.nextLine(); //EnterEnter

        System.out.println("Enter your full name:");
        String firstName = scan.nextLine();


        System.out.println(firstName+", your order for "+quantity+" "+productName
                    +" has been placed. Your total is $" + totalPrice+".");

        scan.close(); // closes the scanner
        // we cannot use scanner object after this line



    }

}

/*
    Ask User to enter the prodcut name (multiple words, nextLine)
    Ask the user to enter the price  (double)
    Ask the user to enter the quantity (int)
    Ask the user to enter their first name (String, single word)
            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"
                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */
